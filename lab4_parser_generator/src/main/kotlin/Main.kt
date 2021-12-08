import generators.LexerGenerator
import generators.ParserGenerator
import java.io.File
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import builders.GrammarBuilder
import generators.BaseGenerator

fun main(args: Array<String>) {
    if (args.size != 3) {
        throw IllegalArgumentException("Arguments size != 3")
    }

    val grammarName = args[0]
    val grammarPath = args[1]
    val destinationPath = args[2]

    val builder = newGrammarBuilder(grammarName, grammarPath)

    LexerGenerator(builder).generate(grammarName).writeTo(File(destinationPath))
    ParserGenerator(builder).generate(grammarName).writeTo(File(destinationPath))
}


private fun newGrammarBuilder(grammarName: String, grammarPath: String): GrammarBuilder {
    val lexer = GrammarLexer(CharStreams.fromFileName(grammarPath))
    val tokens = CommonTokenStream(lexer)
    val parser = GrammarParser(tokens)
    val walker = ParseTreeWalker()
    val tree = parser.start()
    val listener = GrammarBuilder(grammarName)

    walker.walk(listener, tree)

    return listener
}
