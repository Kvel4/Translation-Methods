import java.io.InputStream
import java.text.ParseException

class Parser {
    private lateinit var lexer: LexicalAnalyzer

    fun parse(input: InputStream): Tree {
        lexer = LexicalAnalyzer(input)
        lexer.nextToken()

        return expression()
    }

    private fun expression(): Tree {
        val fType = functionType()
        val identifier = processToken(Token.IDENTIFIER)
        val lParen = processToken(Token.LPAREN)
        val arguments = arguments()
        val rParen = processToken(Token.RPAREN)
        val semicolon = processToken(Token.SEMICOLON)

        processToken(Token.END)

        return Tree("E", fType, identifier, lParen, arguments, rParen, semicolon)
    }

    private fun functionType() = when (lexer.curToken) {
        Token.TYPE, Token.VOID -> {
            val tree = Tree("${lexer.curToken.name}: ${lexer.curWord}")
            lexer.nextToken()

            tree
        }
        else -> throw ParseException("Expected function type at position ${lexer.curWordPos}", lexer.curWordPos)
    }

    private fun processToken(token: Token) = when (lexer.curToken) {
        token -> {
            val tree = Tree("${lexer.curToken.name}: ${lexer.curWord}")
            lexer.nextToken()

            tree
        }
        else -> throw ParseException("Expected ${token.name} at position ${lexer.curWordPos}", lexer.curWordPos)
    }

    private fun arguments() = when (lexer.curToken) {
        Token.RPAREN -> Tree("EPS")
        else -> Tree("AS", argumentsPrime())
    }

    private fun argumentsPrime(): Tree {
        val arg = argument()
        val argumentsPrimePrime = argumentsPrimePrime()

        return Tree("AS'", arg, argumentsPrimePrime)
    }

    private fun argumentsPrimePrime() = when (lexer.curToken) {
        Token.RPAREN -> Tree("EPS")
        Token.COMMA -> {
            val comma = processToken(Token.COMMA)
            val argumentsPrime = argumentsPrime()

            Tree("AS''", comma, argumentsPrime)
        }
        else -> throw ParseException("Expected ',' or ')' at position ${lexer.curWordPos}", lexer.curWordPos)
    }

    private fun argument(): Tree {
        val type = processToken(Token.TYPE)
        val identifier = argumentIdentifier()

        return Tree("A", type, identifier)
    }


    private fun argumentIdentifier(): Tree = when (lexer.curToken) {
        Token.IDENTIFIER -> processToken(Token.IDENTIFIER)
        Token.POINTER -> {
            val pointer = processToken(Token.POINTER)
            val argumentIdentifier = argumentIdentifier()

            Tree("AN", pointer, argumentIdentifier)
        }
        Token.COMMA, Token.RPAREN -> Tree("EPS")
        else -> throw ParseException("Expected ',', ')' or argument identifier at position ${lexer.curWordPos}", lexer.curWordPos)
    }
}


class Tree(var node: String, vararg var children: Tree)