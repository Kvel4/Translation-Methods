grammar MyJava;

start : classDeclaration;

classDeclaration: Modifier* 'class' Identifier classBody;

classBody
	:	'{' classBodyDeclaration* '}'
	;
classBodyDeclaration
	:	methodDeclaration
	;

methodDeclaration
	:	Modifier* methodHeader methodBody
	;

methodHeader
	:	returnType Identifier '(' parameters? ')' throws_?
	;

returnType
	:	type
	|	'void'
	;

type
    : numericType
	| typeName
	| arrayTypeName
	| 'boolean'
	;

numericType
	:	IntegralType
	|	FloatingPointType
	;

typeName
    : Identifier ('.' Identifier)*
    ;

arrayTypeName
    : typeName '[]'
    ;

parameters
	:	parameter (',' parameter)*
	;

parameter
	:	type variableName
	;

throws_
	:	'throws' exceptionTypes
	;

exceptionTypes
	:	exceptionType (',' exceptionType)*
	;

exceptionType
	:	Identifier
	;



methodBody
	:	block
	|	';'
	;

block
    :   '{' blockStatement* '}'
    ;

blockStatement
	:   variableDeclaration
	|	statement
	;

loopBlock
    :   '{' loopBlockStatement* '}'
    ;

loopBlockStatement
	:   blockStatement
	|   breakStatement
	|   continueStatement
	;

variableDeclaration
	:   type variableDeclaratorList ';'
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableName ('=' expression)*
	;

variableName
    : Identifier
    ;


statement
	:	ifThenStatement
	|	ifThenElseStatement
    |   assignExpression ';'
	|	whileStatement
	|   doWhileStatement
	|   returnStatement
	|   throwStatement
	|   methodInvocation ';'
    |	classInstanceCreationExpression ';'
	;

ifThenStatement
	:	'if' '(' expression ')' block
	;

ifThenElseStatement
	:	'if' '(' expression ')' block 'else' block
	;

assignExpression
    :   variableName '=' expression
    ;

whileStatement
	:	'while' '(' expression ')' loopBlock
	;

doWhileStatement
    : 'do' loopBlock 'while' '(' expression ')'
    ;

breakStatement
	:	'break' ';'
	;

continueStatement
	:	'continue' ';'
	;

returnStatement
	:	'return' expression? ';'
	;

throwStatement
	:	'throw' expression ';'
	;



expression
	:	conditionalExpression
	;

conditionalExpression
	:	conditionalAndExpression
	|	conditionalExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	equalityExpression
	|	conditionalAndExpression '&&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	additiveExpression
	|   relationalExpression '<' additiveExpression
	|	relationalExpression '>' additiveExpression
	|	relationalExpression '<=' additiveExpression
	|	relationalExpression '>=' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	'-' unaryExpression
	|   primaryExpression
	;


primaryExpression
	:	'(' expression ')'
	|	baseType
	|	methodInvocation
	|	classInstanceCreationExpression
	|   variableName
	;

baseType
	:	Int
	|	Float
	|	Boolean
	|	Character
	|	String
	|	Null
	;

methodInvocation
	:	Identifier ('.' Identifier)* '(' argumentList? ')'
	;

classInstanceCreationExpression
	:	'new' typeName '(' argumentList? ')'
	;

argumentList
	:	expression (',' expression)*
	;



// LEXER

Modifier
    : 'public'
    | 'private'
    | 'static'
    ;

IntegralType
	:	'int'
	|	'long'
	|	'char'
	;

FloatingPointType
	:	'float'
	|	'double'
	;

Int: [0-9]+;

Float: [0-9]+ '.' [0-9]*;

String: '"' (~["\\])* '"';

Character: '\'' ~['\\] '\'';

Null: 'null';

Boolean
    : 'true'
    | 'false'
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;


WS : [ \t\r\n]+ -> channel(HIDDEN);

Identifier : [a-zA-Z$_] [a-zA-Z0-9$_]*;