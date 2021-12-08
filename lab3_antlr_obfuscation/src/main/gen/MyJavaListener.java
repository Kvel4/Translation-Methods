// Generated from C:/Users/kvel4/IdeaProjects/MTl/lab3_maven/src/main/antlr4\MyJava.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyJavaParser}.
 */
public interface MyJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MyJavaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MyJavaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MyJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MyJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MyJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MyJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(MyJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(MyJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MyJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MyJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(MyJavaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(MyJavaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MyJavaParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MyJavaParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(MyJavaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(MyJavaParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(MyJavaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(MyJavaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeName(MyJavaParser.ArrayTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeName(MyJavaParser.ArrayTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyJavaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyJavaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MyJavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MyJavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(MyJavaParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(MyJavaParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#exceptionTypes}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypes(MyJavaParser.ExceptionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#exceptionTypes}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypes(MyJavaParser.ExceptionTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(MyJavaParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(MyJavaParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(MyJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(MyJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MyJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MyJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(MyJavaParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(MyJavaParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#loopBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlockStatement(MyJavaParser.LoopBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#loopBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlockStatement(MyJavaParser.LoopBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MyJavaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MyJavaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(MyJavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(MyJavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(MyJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(MyJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(MyJavaParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(MyJavaParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(MyJavaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(MyJavaParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(MyJavaParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(MyJavaParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(MyJavaParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(MyJavaParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MyJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MyJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(MyJavaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(MyJavaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MyJavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MyJavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MyJavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MyJavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MyJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MyJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(MyJavaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(MyJavaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(MyJavaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(MyJavaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(MyJavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(MyJavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MyJavaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MyJavaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(MyJavaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(MyJavaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MyJavaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MyJavaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MyJavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MyJavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MyJavaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MyJavaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MyJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MyJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(MyJavaParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(MyJavaParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(MyJavaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(MyJavaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(MyJavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(MyJavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MyJavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MyJavaParser.ArgumentListContext ctx);
}