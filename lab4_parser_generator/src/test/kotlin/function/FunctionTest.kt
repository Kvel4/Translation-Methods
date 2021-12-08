import function.FunctionLexer
import function.FunctionParser
import java.text.ParseException
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import visualizer.Visualizer

class ParserTest {
    companion object {
        var cnt = 0

        @JvmStatic
        fun correctDefinition() =
            listOf(
                Arguments.of("int name();"),
                Arguments.of("double name();"),
                Arguments.of("void name();"),
                Arguments.of("int na322me123();"),
                Arguments.of("     int       name     (      )     ;"),
                Arguments.of("int name(int a);"),
                Arguments.of("int name(int a, double b, int c);"),
                Arguments.of("int name(int *a);"),
                Arguments.of("int name(int* * *a);"),
                Arguments.of("int name(int);"),
                Arguments.of("int name(int***);"),
                Arguments.of("int name(int, double);"),
                Arguments.of("int name(int* *, double * * );"),
                Arguments.of(
                    "   int     name    (    int   *   a    ,    double    ** b   ,   int* * *     c     )   ;"
                )
            )

        @JvmStatic
        fun incorrectDefinition() =
            listOf(
                Arguments.of("int name(int);", 13),
                Arguments.of("int name(a);", 10),
                Arguments.of("int name(;", 10),
                Arguments.of("int name()", 11),
                Arguments.of("int (name);", 5),
                Arguments.of("int ();", 5),
                Arguments.of("int ;", 5),
                Arguments.of("int name;", 9),
                Arguments.of("int name(Int a);", 10),
                Arguments.of("int name(int a, b);", 17),
                Arguments.of("int name(int a, ,);", 17),
                Arguments.of("int name(,);", 10),
                Arguments.of("int name(void a);", 10),
                Arguments.of("intname();", 1),
                Arguments.of("int name(doublea);", 10),
                Arguments.of("asdqwe name();", 1),
                Arguments.of("int na(me();", 8),
                Arguments.of("float name(void a);", 1),
                Arguments.of("double name(void a);", 13),
            )
    }

    @ParameterizedTest
    @MethodSource("correctDefinition")
    fun correctDefinition(definition: String) {
        val parser = FunctionParser(FunctionLexer(definition))
        val visualizer = Visualizer("src/test/resources/images")
        val tree = parser.parse()

        visualizer.visualize(tree, "correctDefinition${cnt++}")
    }

    @ParameterizedTest
    @MethodSource("incorrectDefinition")
    fun testIncorrectDefinition(definition: String, position: Int) {
        val parser = FunctionParser(FunctionLexer(definition))
        try {
            parser.parse()
        } catch (e: ParseException) {
            if (e.errorOffset != position)
                throw AssertionError("Expected $position, actual  ${e.errorOffset}")
        }
    }
}
