// Generated from C:/Users/kvel4/IdeaProjects/MTl/lab4_maven/src/main/antlr\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ParserIdentifier=9, 
		LexerIdentifier=10, Regexp=11, String=12, WS=13, CODE=14;
	public static final int
		RULE_start = 0, RULE_startRule = 1, RULE_grammarRule = 2, RULE_grammarParserRule = 3, 
		RULE_arguments = 4, RULE_argument = 5, RULE_argName = 6, RULE_type = 7, 
		RULE_returnType = 8, RULE_productions = 9, RULE_production = 10, RULE_extendedElements = 11, 
		RULE_returnExpression = 12, RULE_element = 13, RULE_callAttributes = 14, 
		RULE_callAttribute = 15, RULE_lexerRule = 16, RULE_terminals = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "startRule", "grammarRule", "grammarParserRule", "arguments", 
			"argument", "argName", "type", "returnType", "productions", "production", 
			"extendedElements", "returnExpression", "element", "callAttributes", 
			"callAttribute", "lexerRule", "terminals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "';'", "'('", "','", "')'", "':'", "'|'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ParserIdentifier", 
			"LexerIdentifier", "Regexp", "String", "WS", "CODE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StartRuleContext startRule() {
			return getRuleContext(StartRuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			startRule();
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				grammarRule();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ParserIdentifier || _la==LexerIdentifier );
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartRuleContext extends ParserRuleContext {
		public TerminalNode ParserIdentifier() { return getToken(GrammarParser.ParserIdentifier, 0); }
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStartRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStartRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStartRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(ParserIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public GrammarParserRuleContext grammarParserRule() {
			return getRuleContext(GrammarParserRuleContext.class,0);
		}
		public LexerRuleContext lexerRule() {
			return getRuleContext(LexerRuleContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarRule);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParserIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				grammarParserRule();
				}
				break;
			case LexerIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				lexerRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarParserRuleContext extends ParserRuleContext {
		public TerminalNode ParserIdentifier() { return getToken(GrammarParser.ParserIdentifier, 0); }
		public ProductionsContext productions() {
			return getRuleContext(ProductionsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public GrammarParserRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarParserRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGrammarParserRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGrammarParserRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGrammarParserRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarParserRuleContext grammarParserRule() throws RecognitionException {
		GrammarParserRuleContext _localctx = new GrammarParserRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarParserRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ParserIdentifier);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(52);
				arguments();
				}
			}

			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(55);
				returnType();
				}
			}

			setState(58);
			match(T__0);
			setState(59);
			productions();
			setState(60);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__2);
			setState(63);
			argument();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(64);
				match(T__3);
				setState(65);
				argument();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			argName();
			setState(74);
			match(T__5);
			setState(75);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgNameContext extends ParserRuleContext {
		public TerminalNode ParserIdentifier() { return getToken(GrammarParser.ParserIdentifier, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ParserIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LexerIdentifier() { return getToken(GrammarParser.LexerIdentifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LexerIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__5);
			setState(82);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionsContext extends ParserRuleContext {
		public List<ProductionContext> production() {
			return getRuleContexts(ProductionContext.class);
		}
		public ProductionContext production(int i) {
			return getRuleContext(ProductionContext.class,i);
		}
		public ProductionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProductions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProductions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProductions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionsContext productions() throws RecognitionException {
		ProductionsContext _localctx = new ProductionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_productions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			production();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(85);
				match(T__6);
				setState(86);
				production();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionContext extends ParserRuleContext {
		public List<ExtendedElementsContext> extendedElements() {
			return getRuleContexts(ExtendedElementsContext.class);
		}
		public ExtendedElementsContext extendedElements(int i) {
			return getRuleContext(ExtendedElementsContext.class,i);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public ProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionContext production() throws RecognitionException {
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_production);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					extendedElements();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ParserIdentifier) {
				{
				setState(98);
				returnExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendedElementsContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode CODE() { return getToken(GrammarParser.CODE, 0); }
		public ExtendedElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExtendedElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExtendedElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExtendedElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedElementsContext extendedElements() throws RecognitionException {
		ExtendedElementsContext _localctx = new ExtendedElementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_extendedElements);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParserIdentifier:
			case LexerIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				element();
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(CODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode ParserIdentifier() { return getToken(GrammarParser.ParserIdentifier, 0); }
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ParserIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ParserIdentifier() { return getToken(GrammarParser.ParserIdentifier, 0); }
		public CallAttributesContext callAttributes() {
			return getRuleContext(CallAttributesContext.class,0);
		}
		public TerminalNode LexerIdentifier() { return getToken(GrammarParser.LexerIdentifier, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ParserIdentifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ParserIdentifier);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(108);
					callAttributes();
					}
				}

				}
				break;
			case LexerIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(LexerIdentifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallAttributesContext extends ParserRuleContext {
		public List<CallAttributeContext> callAttribute() {
			return getRuleContexts(CallAttributeContext.class);
		}
		public CallAttributeContext callAttribute(int i) {
			return getRuleContext(CallAttributeContext.class,i);
		}
		public CallAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCallAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCallAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCallAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallAttributesContext callAttributes() throws RecognitionException {
		CallAttributesContext _localctx = new CallAttributesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__2);
			setState(115);
			callAttribute();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(116);
				match(T__3);
				setState(117);
				callAttribute();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallAttributeContext extends ParserRuleContext {
		public TerminalNode ParserIdentifier() { return getToken(GrammarParser.ParserIdentifier, 0); }
		public CallAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCallAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCallAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCallAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallAttributeContext callAttribute() throws RecognitionException {
		CallAttributeContext _localctx = new CallAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ParserIdentifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRuleContext extends ParserRuleContext {
		public LexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRule; }
	 
		public LexerRuleContext() { }
		public void copyFrom(LexerRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermContext extends LexerRuleContext {
		public TerminalNode LexerIdentifier() { return getToken(GrammarParser.LexerIdentifier, 0); }
		public TerminalsContext terminals() {
			return getRuleContext(TerminalsContext.class,0);
		}
		public TermContext(LexerRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends LexerRuleContext {
		public TerminalNode LexerIdentifier() { return getToken(GrammarParser.LexerIdentifier, 0); }
		public TerminalsContext terminals() {
			return getRuleContext(TerminalsContext.class,0);
		}
		public SkipContext(LexerRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRuleContext lexerRule() throws RecognitionException {
		LexerRuleContext _localctx = new LexerRuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lexerRule);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(LexerIdentifier);
				setState(128);
				match(T__0);
				setState(129);
				terminals();
				setState(130);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(LexerIdentifier);
				setState(133);
				match(T__7);
				setState(134);
				terminals();
				setState(135);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalsContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Regexp() { return getToken(GrammarParser.Regexp, 0); }
		public TerminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalsContext terminals() throws RecognitionException {
		TerminalsContext _localctx = new TerminalsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_terminals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==Regexp || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u0090\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4"+
		"\64\n\4\3\5\3\5\5\58\n\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\f\7\f`\n\f\f\f\16"+
		"\fc\13\f\3\f\5\ff\n\f\3\r\3\r\5\rj\n\r\3\16\3\16\3\17\3\17\5\17p\n\17"+
		"\3\17\5\17s\n\17\3\20\3\20\3\20\3\20\7\20y\n\20\f\20\16\20|\13\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u008c\n\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\3\3\2\r\16\2\u008a\2&\3\2\2\2\4.\3\2\2\2\6\63\3\2\2\2\b\65\3"+
		"\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16O\3\2\2\2\20Q\3\2\2\2\22S\3\2\2\2\24V\3"+
		"\2\2\2\26a\3\2\2\2\30i\3\2\2\2\32k\3\2\2\2\34r\3\2\2\2\36t\3\2\2\2 \177"+
		"\3\2\2\2\"\u008b\3\2\2\2$\u008d\3\2\2\2&(\5\4\3\2\')\5\6\4\2(\'\3\2\2"+
		"\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./\7\3"+
		"\2\2/\60\7\13\2\2\60\5\3\2\2\2\61\64\5\b\5\2\62\64\5\"\22\2\63\61\3\2"+
		"\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65\67\7\13\2\2\668\5\n\6\2\67\66\3\2\2"+
		"\2\678\3\2\2\28:\3\2\2\29;\5\22\n\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7"+
		"\3\2\2=>\5\24\13\2>?\7\4\2\2?\t\3\2\2\2@A\7\5\2\2AF\5\f\7\2BC\7\6\2\2"+
		"CE\5\f\7\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2"+
		"IJ\7\7\2\2J\13\3\2\2\2KL\5\16\b\2LM\7\b\2\2MN\5\20\t\2N\r\3\2\2\2OP\7"+
		"\13\2\2P\17\3\2\2\2QR\7\f\2\2R\21\3\2\2\2ST\7\b\2\2TU\5\20\t\2U\23\3\2"+
		"\2\2V[\5\26\f\2WX\7\t\2\2XZ\5\26\f\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\\25\3\2\2\2][\3\2\2\2^`\5\30\r\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2df\5\32\16\2ed\3\2\2\2ef\3\2\2\2f\27\3"+
		"\2\2\2gj\5\34\17\2hj\7\20\2\2ig\3\2\2\2ih\3\2\2\2j\31\3\2\2\2kl\7\13\2"+
		"\2l\33\3\2\2\2mo\7\13\2\2np\5\36\20\2on\3\2\2\2op\3\2\2\2ps\3\2\2\2qs"+
		"\7\f\2\2rm\3\2\2\2rq\3\2\2\2s\35\3\2\2\2tu\7\5\2\2uz\5 \21\2vw\7\6\2\2"+
		"wy\5 \21\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2"+
		"}~\7\7\2\2~\37\3\2\2\2\177\u0080\7\13\2\2\u0080!\3\2\2\2\u0081\u0082\7"+
		"\f\2\2\u0082\u0083\7\3\2\2\u0083\u0084\5$\23\2\u0084\u0085\7\4\2\2\u0085"+
		"\u008c\3\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088\7\n\2\2\u0088\u0089\5$"+
		"\23\2\u0089\u008a\7\4\2\2\u008a\u008c\3\2\2\2\u008b\u0081\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008c#\3\2\2\2\u008d\u008e\t\2\2\2\u008e%\3\2\2\2\17*\63"+
		"\67:F[aeiorz\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}