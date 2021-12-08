// Generated from C:/Users/kvel4/IdeaProjects/MTl/lab4_maven/src/main/antlr\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(GrammarParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(GrammarParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarParserRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarParserRule(GrammarParser.GrammarParserRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(GrammarParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(GrammarParser.ArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(GrammarParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#productions}.
	 * @param ctx the parse tree
	 */
	void enterProductions(GrammarParser.ProductionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#productions}.
	 * @param ctx the parse tree
	 */
	void exitProductions(GrammarParser.ProductionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(GrammarParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(GrammarParser.ProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#extendedElements}.
	 * @param ctx the parse tree
	 */
	void enterExtendedElements(GrammarParser.ExtendedElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#extendedElements}.
	 * @param ctx the parse tree
	 */
	void exitExtendedElements(GrammarParser.ExtendedElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(GrammarParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(GrammarParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GrammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GrammarParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#callAttributes}.
	 * @param ctx the parse tree
	 */
	void enterCallAttributes(GrammarParser.CallAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#callAttributes}.
	 * @param ctx the parse tree
	 */
	void exitCallAttributes(GrammarParser.CallAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#callAttribute}.
	 * @param ctx the parse tree
	 */
	void enterCallAttribute(GrammarParser.CallAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#callAttribute}.
	 * @param ctx the parse tree
	 */
	void exitCallAttribute(GrammarParser.CallAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term}
	 * labeled alternative in {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term}
	 * labeled alternative in {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void enterSkip(GrammarParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link GrammarParser#lexerRule}.
	 * @param ctx the parse tree
	 */
	void exitSkip(GrammarParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminals}.
	 * @param ctx the parse tree
	 */
	void enterTerminals(GrammarParser.TerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminals}.
	 * @param ctx the parse tree
	 */
	void exitTerminals(GrammarParser.TerminalsContext ctx);
}