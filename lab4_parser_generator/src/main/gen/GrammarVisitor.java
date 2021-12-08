// Generated from C:/Users/kvel4/IdeaProjects/MTl/lab4_maven/src/main/antlr\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(GrammarParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgName(GrammarParser.ArgNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#productions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductions(GrammarParser.ProductionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction(GrammarParser.ProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#extendedElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedElements(GrammarParser.ExtendedElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(GrammarParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GrammarParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#callAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAttributes(GrammarParser.CallAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#callAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAttribute(GrammarParser.CallAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term}
	 * labeled alternative in {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(GrammarParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#terminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminals(GrammarParser.TerminalsContext ctx);
}