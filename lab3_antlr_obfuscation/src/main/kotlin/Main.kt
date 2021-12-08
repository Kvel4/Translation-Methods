import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main() {
    val lexer = MyJavaLexer(CharStreams.fromFileName("src/main/resources/JavaCodeSample1"))
    val tokens = CommonTokenStream(lexer)
    val parser = MyJavaParser(tokens)
    val walker = ParseTreeWalker()
    val tree = parser.start()
    val listener = MyJavaObfuscateListener(tokens)

    walker.walk(listener, tree)
    println(listener.getReplacedCode())
}