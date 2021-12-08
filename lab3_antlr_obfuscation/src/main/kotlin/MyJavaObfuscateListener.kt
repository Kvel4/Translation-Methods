import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.TokenStreamRewriter
import kotlin.random.Random


class MyJavaObfuscateListener(private val tokens: CommonTokenStream) : MyJavaBaseListener() {
    private val rewriter = TokenStreamRewriter(tokens)
    private val obfuscator: Obfuscator

    init {
        val counter = object : MyJavaBaseListener() {
            var counter = 0
            override fun enterVariableDeclarator(ctx: MyJavaParser.VariableDeclaratorContext?) {
                counter++
            }
        }
        obfuscator = Obfuscator(counter.counter)
    }

    override fun exitParameter(ctx: MyJavaParser.ParameterContext) {
        val type = ctx.type().text
        val name = ctx.variableName().text

        obfuscator.addType(type, name)
    }

    override fun exitVariableDeclaration(ctx: MyJavaParser.VariableDeclarationContext) {
        val type = ctx.type().text
        val variables = ctx.variableDeclaratorList()

        for (variable in variables.variableDeclarator()) {
            val name = variable.variableName().text
            obfuscator.addType(type, name)
        }
    }

    override fun exitVariableName(ctx: MyJavaParser.VariableNameContext) {
        val variable = ctx.Identifier()
        val obfuscated = obfuscator.obfuscateVariable(variable.text)

        rewriter.replace(variable.symbol, obfuscated)
    }

    override fun exitBlockStatement(ctx: MyJavaParser.BlockStatementContext) {
        if (Random.nextInt(2) == 0) return

        val indent = tokens.get(ctx.start.tokenIndex - 1).text
        val uselessStatement = "$indent${obfuscator.createUselessStatement()}"

        rewriter.insertAfter(ctx.stop, uselessStatement)
    }

    fun getReplacedCode(): String = rewriter.text
}