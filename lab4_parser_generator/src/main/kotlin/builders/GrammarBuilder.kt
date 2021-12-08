package builders

import GrammarBaseListener
import GrammarParser
import types.*

@Suppress("MemberVisibilityCanBePrivate")
class GrammarBuilder(val grammarName: String) : GrammarBaseListener() {
    val skipTokens = hashMapOf<String, Regex>()
    val termTokens = hashMapOf<String, Regex>()
    val rules = linkedMapOf<String, Rule>()

    lateinit var startRule: String

    val lexerName: String
    val parserName: String
    val tokenName: String

    init {
        val capitalized = grammarName.replaceFirstChar(Char::titlecase)

        lexerName = "${capitalized}Lexer"
        parserName = "${capitalized}Parser"
        tokenName = "${capitalized}Token"
    }

    // Lexer

    override fun exitSkip(ctx: GrammarParser.SkipContext) {
        skipTokens.putIfAbsent(ctx.LexerIdentifier().text, ctx.terminals().toRegexp())
    }

    override fun exitTerm(ctx: GrammarParser.TermContext) {
        termTokens.putIfAbsent(ctx.LexerIdentifier().text, ctx.terminals().toRegexp())
    }

    private fun GrammarParser.TerminalsContext.toRegexp() =
        Regexp()?.text?.removeSurrounding("\'")?.toRegex()
            ?: Regex.escape(String().text.removeSurrounding("\"")).toRegex()

    // Parser

    override fun exitGrammarParserRule(ctx: GrammarParser.GrammarParserRuleContext) {
        val name = ctx.ParserIdentifier().text
        val arguments = extractArguments(ctx.arguments()?.argument())
        val returnType = ctx.returnType()?.type()?.text
        val productions = extractProductions(ctx.productions().production())

        rules.putIfAbsent(name, Rule(name, arguments, returnType, productions))
    }

    private fun extractArguments(
        arguments: MutableList<GrammarParser.ArgumentContext>?
    ): List<Argument> {
        if (arguments == null) return listOf()

        return arguments.map { argument -> Argument(argument.argName().text, argument.type().text) }
    }

    private fun extractProductions(
        productions: MutableList<GrammarParser.ProductionContext>
    ): List<Production> {
        val productionList = mutableListOf<Production>()

        for (production in productions) {
            val elements = mutableListOf<Element>()
            val extendedElements = mutableListOf<ExtendedElement>()

            var isEmpty = true

            for (extendedElement in production.extendedElements()) {
                val code = extendedElement.CODE()

                if (code != null) {
                    extendedElements +=
                        Code(extendedElement.CODE().text.removePrefix("{").removeSuffix("}"))
                    continue
                }

                isEmpty = false
                val element = extendedElement.element()
                val productionElement =
                    element.LexerIdentifier()?.text?.let { Term(it) }
                        ?: NonTerm(
                            element.ParserIdentifier().text,
                            extractCallAttributes(element.callAttributes()?.callAttribute())
                        )

                elements += productionElement
                extendedElements += ProductionElement(productionElement)
            }

            if (isEmpty) {
                elements += Term("EPS")
            }

            productionList.add(
                Production(elements, extendedElements, production.returnExpression()?.text)
            )
        }

        return productionList
    }

    private fun extractCallAttributes(
        attributes: MutableList<GrammarParser.CallAttributeContext>?
    ): List<String> {
        if (attributes == null) return listOf()

        return attributes.map { it.text }
    }

    override fun exitStartRule(ctx: GrammarParser.StartRuleContext) {
        startRule = ctx.ParserIdentifier().text
    }
}
