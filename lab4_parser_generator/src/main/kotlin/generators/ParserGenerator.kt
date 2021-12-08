package generators

import runtime.Tree
import com.squareup.kotlinpoet.*
import exceptions.UnsupportedTypeException
import types.*
import builders.GrammarBuilder

class ParserGenerator(grammar: GrammarBuilder) : BaseGenerator {
    private val termToken = grammar.termTokens + Pair("EPS", "".toRegex())
    private val rules = grammar.rules

    private val startRule = grammar.startRule

    private val parserName = grammar.parserName
    private val lexerName = grammar.lexerName
    private val tokenName = grammar.tokenName

    val first: Map<String, Set<String>> by lazy {
        val first: MutableMap<String, MutableSet<String>> = mutableMapOf()

        termToken.forEach { (key, _) -> first[key] = mutableSetOf(key) }
        rules.forEach { (name, rule) ->
            first[name] = mutableSetOf()
            if (rule.productions.any { it.first().name == "EPS" }) first.getValue(name).add("EPS")
        }

        var changed = true

        while (changed) {
            changed = false
            for ((ruleName, rule) in rules) {
                for (production in rule.productions) {
                    for (element in production) {
                        val elementName = element.name

                        changed =
                            changed ||
                                first.getValue(ruleName).addAll(first.getValue(elementName) - "EPS")

                        if ("EPS" !in first.getValue(elementName)) break
                        if (element === production.last())
                            changed = changed || first.getValue(ruleName).add("EPS")
                    }
                }
            }
        }

        return@lazy first
    }

    val follow: Map<String, Set<String>> by lazy {
        val follow: MutableMap<String, MutableSet<String>> = mutableMapOf()

        rules.forEach { (key, _) -> follow[key] = mutableSetOf() }
        follow.getValue(startRule).add("EOF")

        var changed = true

        while (changed) {
            changed = false
            for ((name, rule) in rules) {
                for (production in rule.productions) {
                    for (i in (0..production.size - 2)) {
                        val element = production[i]
                        val next = production[i + 1]

                        if (element is Term) continue

                        changed =
                            changed ||
                                follow
                                    .getValue(element.name)
                                    .addAll(first.getValue(next.name) - "EPS")

                        if ("EPS" in first.getValue(next.name)) {
                            changed =
                                changed ||
                                    follow.getValue(element.name).addAll(follow.getValue(name))
                        }
                    }

                    val element = production.last()

                    if (element is Term) continue

                    changed = changed || follow.getValue(element.name).addAll(follow.getValue(name))
                }
            }
        }

        return@lazy follow
    }

    override fun generate(filePackage: String) =
        with(FileSpec.builder(filePackage, parserName)) {
            addImport("runtime", "UnexpectedTokenException")
            addImport("runtime", "UnexpectedTokenException")
//            addImport("runtime", "*")

            addAnnotation(
                AnnotationSpec.builder(Suppress::class)
                    .addMember("%S", "MemberVisibilityCanBePrivate")
                    .addMember("%S", "RedundantVisibilityModifier")
                    .addMember("%S", "UNUSED_VARIABLE")
                    .addMember("%S", "LocalVariableName")
                    .build()
            )

            addType(
                TypeSpec.classBuilder(name)
                    .primaryConstructor(
                        FunSpec.constructorBuilder()
                            .addParameter("lexer", ClassName(filePackage, lexerName))
                            .build()
                    )
                    .addProperty(
                        PropertySpec.builder("lexer", ClassName(filePackage, lexerName))
                            .initializer("lexer")
                            .build()
                    )
                    .addFunction(parseFunction().build())
                    .addFunction(processTokenFunction(filePackage).build())
                    .addFunctions()
                    .build()
            )

            build()
        }

    private fun parseFunction() =
        with(FunSpec.builder("parse")) {
            val returnType = rules.getValue(startRule).returnType

            if (returnType != null) returns(getType(returnType))
            addStatement("return $startRule()")
        }

    private fun processTokenFunction(filePackage: String) =
        with(FunSpec.builder("processToken")) {
            addParameter("token", ClassName(filePackage, tokenName))
            returns(String::class)

            addStatement(
                "if (lexer.token != token) throw UnexpectedTokenException(lexer.pos, lexer.token, token)"
            )
            addStatement("val res = lexer.tokenValue")
            addStatement("lexer.nextToken()")
            addStatement("return res")
        }

    private fun TypeSpec.Builder.addFunctions() = apply {
        addFunctions(
            rules.map { (name, rule) ->
                FunSpec.builder(name)
                    .addFunction(name, rule)
                    .addModifiers(KModifier.PRIVATE)
                    .build()
            }
        )
    }

    private fun FunSpec.Builder.addFunction(name: String, rule: Rule) = apply {
        addParameters(rule)
        if (rule.returnType != null) returns(getType(rule.returnType))
        addFunctionBody(name)
    }

    private fun FunSpec.Builder.addFunctionBody(name: String) = apply {
        beginControlFlow("return when (lexer.token)")
        addCases(name)
        endControlFlow()
    }

    private fun FunSpec.Builder.addCases(ruleName: String) = apply {
        val possibleTokens = mutableSetOf<String>()

        for (production in rules.getValue(ruleName).productions) {
            val productionFirst = productionFirst(production, ruleName)

            possibleTokens.addAll(productionFirst)

            beginControlFlow("${productionFirst.joinToString(",") { "$tokenName.${it}" } } ->")
            addCaseBody(production)
            endControlFlow()
        }

        beginControlFlow("else ->")
        addStatement(
            "throw UnexpectedTokenException(lexer.pos, lexer.token, " +
                "${possibleTokens.joinToString(",") { "$tokenName.${it}" }})"
        )
        endControlFlow()
    }

    private fun FunSpec.Builder.addCaseBody(production: Production) {
        val variables = mutableMapOf<String, Int>()

        for (extended in production.extendedProduction) {
            if (extended is ProductionElement) {
                val element = extended.element
                variables.putIfAbsent(element.name, -1)
                variables.computeIfPresent(element.name) { _, value -> value + 1 }

                val cnt = variables.getValue(element.name)
                val variableName = "${element.name}${if (cnt == 0) "" else cnt}"

                if (element is NonTerm) {
                    addStatement(
                        "val $variableName = ${element.name}(${element.callAttributes.joinToString(",")})"
                    )
                } else {
                    addStatement("val $variableName = processToken($tokenName.${element.name})")
                }
            } else if (extended is Code) {
                addStatement(extended.code)
            }
        }

        production.returnExpression?.let { addStatement(it) }
    }

    private fun FunSpec.Builder.addParameters(rule: Rule) = apply {
        rule.arguments.forEach { argument -> addParameter(argument.name, getType(argument.type)) }
    }

    private fun productionFirst(production: Production, name: String): MutableSet<String> {
        val productionFirst = mutableSetOf<String>()

        for (element in production) {
            val elementFirst = first.getValue(element.name)
            productionFirst.addAll(elementFirst)

            if ("EPS" !in elementFirst) {
                productionFirst -= "EPS"
                break
            }
        }

        if ("EPS" in productionFirst) {
            productionFirst.addAll(follow.getValue(name))
            productionFirst -= "EPS"
        }
        return productionFirst
    }

    private fun getType(type: String) =
        when (type) {
            "Int" -> Int::class
            "Double" -> Double::class
            "Tree" -> Tree::class
            else -> throw UnsupportedTypeException("$type isn't supported in generator")
        }
}
