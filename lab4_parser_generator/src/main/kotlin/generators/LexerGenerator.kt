package generators

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import builders.GrammarBuilder

class LexerGenerator(grammar: GrammarBuilder) : BaseGenerator {
    private val skipTokens = grammar.skipTokens
    private val termTokens = grammar.termTokens
    private val lexerName = grammar.lexerName
    private val tokenName = grammar.tokenName

    override fun generate(filePackage: String) =
        with(FileSpec.builder(filePackage, lexerName)) {
            addAnnotation(
                AnnotationSpec.builder(Suppress::class)
                    .addMember("%S", "RedundantVisibilityModifier")
                    .build()
            )
            addProperty(tokenMap("skipTokens", skipTokens).build())
            addProperty(tokenMap("termTokens", termTokens).build())
            addType(tokenEnum(termTokens).build())
            addType(lexerDeclaration(filePackage).build())

            build()
        }

    private fun tokenEnum(map: Map<String, Regex>) =
        with(TypeSpec.enumBuilder(tokenName)) {
            for (key in map.keys) {
                addEnumConstant(key)
            }
            addEnumConstant("EOF")
        }

    @OptIn(ExperimentalStdlibApi::class)
    private fun tokenMap(name: String, map: Map<String, Regex>) =
        with(PropertySpec.builder(name, typeNameOf<Map<String, Regex>>())) {
            val elements = buildString {
                appendLine()
                for ((token, regex) in map) {
                    appendLine("\"$token\" to Regex(\"\"\"$regex\"\"\"),")
                }
            }
            initializer("mutableMapOf($elements)")
        }

    private fun lexerDeclaration(filePackage: String) =
        with(TypeSpec.classBuilder(lexerName)) {
            primaryConstructor(
                FunSpec.constructorBuilder().addParameter("input", String::class).build()
            )

            superclass(
                ClassName("runtime", "BaseLexer")
                    .parameterizedBy(ClassName(filePackage, tokenName))
            )

            addSuperclassConstructorParameter(
                "$tokenName::class.java, skipTokens, termTokens, input"
            )
        }
}
