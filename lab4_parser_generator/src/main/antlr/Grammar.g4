grammar Grammar;

start : startRule grammarRule+ EOF;

startRule : '->' ParserIdentifier;

grammarRule
  : grammarParserRule
  | lexerRule
  ;

grammarParserRule : ParserIdentifier arguments? returnType? '->' productions ';';

arguments : '(' argument (',' argument)* ')';

argument : argName ':' type;

argName : ParserIdentifier;

type : LexerIdentifier;

returnType: ':' type;

productions: production ('|' production)*;

production: extendedElements* returnExpression?;

extendedElements: element | CODE;

returnExpression: ParserIdentifier;

element: ParserIdentifier callAttributes? | LexerIdentifier;

callAttributes: '(' callAttribute (',' callAttribute)* ')';

callAttribute: ParserIdentifier;

lexerRule
  : LexerIdentifier '->' terminals ';' # term
  | LexerIdentifier '=>' terminals ';' # skip
  ;

terminals
  : String
  | Regexp
  ;


// LEXER //

ParserIdentifier : [a-z][a-zA-Z0-9$_]*;

LexerIdentifier : [A-Z][a-zA-Z0-9$_]*;

Regexp : '\'' (~('\'') | '\\\'')* '\'';

String: '"' (~["\\] | '\\"')* '"';

WS : [ \t\r\n]+ -> channel(HIDDEN);

CODE : '{' ~[{}]+ '}';


