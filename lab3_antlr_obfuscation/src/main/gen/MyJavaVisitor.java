// Generated from C:/Users/kvel4/IdeaProjects/MTl/lab3_maven/src/main/antlr4\MyJava.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MyJavaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MyJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MyJavaParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(MyJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MyJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(MyJavaParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(MyJavaParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(MyJavaParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(MyJavaParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#arrayTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeName(MyJavaParser.ArrayTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyJavaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MyJavaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(MyJavaParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#exceptionTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypes(MyJavaParser.ExceptionTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(MyJavaParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(MyJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MyJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(MyJavaParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#loopBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlockStatement(MyJavaParser.LoopBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MyJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(MyJavaParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(MyJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(MyJavaParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(MyJavaParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(MyJavaParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(MyJavaParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MyJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(MyJavaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MyJavaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(MyJavaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MyJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(MyJavaParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MyJavaParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(MyJavaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MyJavaParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(MyJavaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MyJavaParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MyJavaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MyJavaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MyJavaParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(MyJavaParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(MyJavaParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(MyJavaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyJavaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MyJavaParser.ArgumentListContext ctx);
}