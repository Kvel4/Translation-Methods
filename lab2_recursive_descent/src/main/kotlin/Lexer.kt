import java.io.*
import java.text.ParseException

class LexicalAnalyzer(input: InputStream) {
    private var input: InputStreamReader
    private val EOF = 65535.toChar()
    private var curChar = ' '
    private var curCharPos = 0
    lateinit var curToken: Token
    lateinit var curWord: String
    var curWordPos = 0

    init {
        this.input = InputStreamReader(input)
        nextChar()
    }

    fun nextToken() {
        nextUsefulChar()

        curToken = when (curChar) {
            '(' -> {
                nextChar()
                Token.LPAREN
            }
            ')' -> {
                nextChar()
                Token.RPAREN
            }
            '*' -> {
                nextChar()
                Token.POINTER
            }
            ',' -> {
                nextChar()
                Token.COMMA
            }
            ';' -> {
                nextChar()
                Token.SEMICOLON
            }
            EOF -> Token.END
            else -> {
                nextWord()
                processWord()
            }
        }
    }

    fun getAllTokens(): List<Token> {
        val list = ArrayList<Token>()

        nextToken()
        while (curToken != Token.END) {
            list.add(curToken)
            nextToken()
        }

        return list
    }

    private fun processWord() = when (curWord) {
        "void" -> {
            Token.VOID
        }
        "int", "double", "float", "char", "unsigned" -> {
            Token.TYPE
        }
        else -> Token.IDENTIFIER
    }


    private fun nextWord() {
        if (!isCIdentifierStart()) throw ParseException("Illegal character $curChar at position $curCharPos", curCharPos)

        val stringBuilder = StringBuilder()

        while (isCIdentifierPart()) {
            stringBuilder.append(curChar)
            nextChar()
        }

        curWord = stringBuilder.toString()
    }

    private fun nextUsefulChar() {
        while (curChar.isWhitespace()) {
            nextChar()
        }
        curWordPos = curCharPos
        curWord = curChar.toString()
    }

    private fun nextChar() {
        curCharPos++

        curChar = try {
            input.read().toChar()
        } catch (e: IOException) {
            throw ParseException(e.message, curCharPos)
        }
    }

    private fun isCIdentifierStart() = curChar.isJavaIdentifierStart() && cRestriction()

    private fun isCIdentifierPart() = curChar.isJavaIdentifierPart() && cRestriction()

    private fun cRestriction() = curChar.code in 0..255
}