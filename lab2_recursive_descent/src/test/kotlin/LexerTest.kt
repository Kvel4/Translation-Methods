import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class LexerTest {
    companion object {
        private val defaultNoArgsExpected = listOf(Token.TYPE, Token.IDENTIFIER, Token.LPAREN, Token.RPAREN, Token.SEMICOLON)

        @JvmStatic
        fun correctDefinition() = listOf(
            Arguments.of("int name();", defaultNoArgsExpected),
            Arguments.of("double name();", defaultNoArgsExpected),
            Arguments.of("void name();", listOf(Token.VOID, Token.IDENTIFIER, Token.LPAREN, Token.RPAREN, Token.SEMICOLON)),
            Arguments.of("int _name();", defaultNoArgsExpected),
            Arguments.of("int Name();", defaultNoArgsExpected),
            Arguments.of("int n_a322me123();", defaultNoArgsExpected),
            Arguments.of("int \$_a322me123();", defaultNoArgsExpected),
            Arguments.of("int       name     (      )     ;", defaultNoArgsExpected),

            Arguments.of("int name(int a);",
                listOf(Token.TYPE, Token.IDENTIFIER, Token.LPAREN,
                    Token.TYPE, Token.IDENTIFIER,
                    Token.RPAREN, Token.SEMICOLON)),
            Arguments.of("int name(int *a);",
                listOf(Token.TYPE, Token.IDENTIFIER, Token.LPAREN,
                    Token.TYPE, Token.POINTER, Token.IDENTIFIER,
                    Token.RPAREN, Token.SEMICOLON)),
            Arguments.of("int name(int* * *a);",
                listOf(Token.TYPE, Token.IDENTIFIER, Token.LPAREN,
                    Token.TYPE, Token.POINTER, Token.POINTER, Token.POINTER, Token.IDENTIFIER,
                    Token.RPAREN, Token.SEMICOLON)),
            Arguments.of("int name(int a, double b, float c);",
                listOf(Token.TYPE, Token.IDENTIFIER, Token.LPAREN,
                    Token.TYPE, Token.IDENTIFIER, Token.COMMA,
                    Token.TYPE, Token.IDENTIFIER, Token.COMMA,
                    Token.TYPE, Token.IDENTIFIER,
                    Token.RPAREN, Token.SEMICOLON)),
            Arguments.of("   int     name    (    int      a   ,   float     c     )   ;",
                listOf(Token.TYPE, Token.IDENTIFIER, Token.LPAREN,
                    Token.TYPE, Token.IDENTIFIER, Token.COMMA,
                    Token.TYPE, Token.IDENTIFIER,
                    Token.RPAREN, Token.SEMICOLON)),
            )
    }

    @ParameterizedTest
    @MethodSource("correctDefinition")
    fun correctDefinition(definition: String, expected: List<Token>) {
        val actual = LexicalAnalyzer(definition.byteInputStream()).getAllTokens()
        Assertions.assertIterableEquals(actual, expected)
    }
}