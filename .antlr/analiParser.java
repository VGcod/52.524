// Generated from c:/Users/USER/Documents/2025/MATERIAS/SSL/FinalAnalizador/anali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class analiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRUEBA=1, DADO=2, CUANDO=3, ENTONCES=4, Y=5, LBRACE=6, RBRACE=7, LCORCHETE=8, 
		RCORCHETE=9, DOT=10, COMA=11, PESO=12, ESTADO=13, BOOLEANO=14, TEXTO=15, 
		NUMERO=16, IDENTIFICADOR=17, WS=18, NL=19;
	public static final int
		RULE_testSuite = 0, RULE_prueba = 1, RULE_paso = 2, RULE_objeto = 3, RULE_estado = 4, 
		RULE_valor = 5, RULE_variable = 6, RULE_lista = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"testSuite", "prueba", "paso", "objeto", "estado", "valor", "variable", 
			"lista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prueba'", "'dado'", "'cuando'", "'entonces'", "'y'", "'{'", "'}'", 
			"'['", "']'", "'.'", "','", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRUEBA", "DADO", "CUANDO", "ENTONCES", "Y", "LBRACE", "RBRACE", 
			"LCORCHETE", "RCORCHETE", "DOT", "COMA", "PESO", "ESTADO", "BOOLEANO", 
			"TEXTO", "NUMERO", "IDENTIFICADOR", "WS", "NL"
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
	public String getGrammarFileName() { return "anali.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public analiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestSuiteContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(analiParser.EOF, 0); }
		public List<PruebaContext> prueba() {
			return getRuleContexts(PruebaContext.class);
		}
		public PruebaContext prueba(int i) {
			return getRuleContext(PruebaContext.class,i);
		}
		public TestSuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testSuite; }
	}

	public final TestSuiteContext testSuite() throws RecognitionException {
		TestSuiteContext _localctx = new TestSuiteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_testSuite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRUEBA) {
				{
				{
				setState(16);
				prueba();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PruebaContext extends ParserRuleContext {
		public TerminalNode PRUEBA() { return getToken(analiParser.PRUEBA, 0); }
		public TerminalNode TEXTO() { return getToken(analiParser.TEXTO, 0); }
		public TerminalNode LBRACE() { return getToken(analiParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(analiParser.RBRACE, 0); }
		public List<PasoContext> paso() {
			return getRuleContexts(PasoContext.class);
		}
		public PasoContext paso(int i) {
			return getRuleContext(PasoContext.class,i);
		}
		public PruebaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prueba; }
	}

	public final PruebaContext prueba() throws RecognitionException {
		PruebaContext _localctx = new PruebaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prueba);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PRUEBA);
			setState(25);
			match(TEXTO);
			setState(26);
			match(LBRACE);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				{
				setState(27);
				paso();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PasoContext extends ParserRuleContext {
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public TerminalNode DADO() { return getToken(analiParser.DADO, 0); }
		public TerminalNode CUANDO() { return getToken(analiParser.CUANDO, 0); }
		public TerminalNode ENTONCES() { return getToken(analiParser.ENTONCES, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<EstadoContext> estado() {
			return getRuleContexts(EstadoContext.class);
		}
		public EstadoContext estado(int i) {
			return getRuleContext(EstadoContext.class,i);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			objeto();
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTADO) {
					{
					setState(37);
					estado();
					}
				}

				setState(40);
				valor();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 258304L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(analiParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(analiParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(analiParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(analiParser.DOT, i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(IDENTIFICADOR);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(46);
				match(DOT);
				setState(47);
				match(IDENTIFICADOR);
				}
				}
				setState(52);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode ESTADO() { return getToken(analiParser.ESTADO, 0); }
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ESTADO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(analiParser.TEXTO, 0); }
		public TerminalNode NUMERO() { return getToken(analiParser.NUMERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(analiParser.BOOLEANO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(analiParser.IDENTIFICADOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valor);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(TEXTO);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(NUMERO);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(BOOLEANO);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(IDENTIFICADOR);
				}
				break;
			case PESO:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				variable();
				}
				break;
			case LCORCHETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				lista();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode PESO() { return getToken(analiParser.PESO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(analiParser.IDENTIFICADOR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(PESO);
			setState(64);
			match(IDENTIFICADOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode LCORCHETE() { return getToken(analiParser.LCORCHETE, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode RCORCHETE() { return getToken(analiParser.RCORCHETE, 0); }
		public List<TerminalNode> COMA() { return getTokens(analiParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(analiParser.COMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(LCORCHETE);
			setState(67);
			valor();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(68);
				match(COMA);
				setState(69);
				valor();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(RCORCHETE);
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
		"\u0004\u0001\u0013N\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u001d\b\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0004"+
		"\u0002*\b\u0002\u000b\u0002\f\u0002+\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00031\b\u0003\n\u0003\f\u00034\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005>\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007G\b\u0007\n\u0007\f\u0007"+
		"J\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\u0002\u0004P\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004#\u0001"+
		"\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000"+
		"\u0000\n=\u0001\u0000\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eB\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0005"+
		"\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u0001\u0000\u0000\u0019\u001a\u0005\u000f\u0000\u0000\u001a\u001e\u0005"+
		"\u0006\u0000\u0000\u001b\u001d\u0003\u0004\u0002\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000!\"\u0005\u0007\u0000\u0000\"\u0003"+
		"\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$)\u0003\u0006\u0003"+
		"\u0000%\'\u0003\b\u0004\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0003\n\u0005\u0000)&\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-2\u0005\u0011"+
		"\u0000\u0000./\u0005\n\u0000\u0000/1\u0005\u0011\u0000\u00000.\u0001\u0000"+
		"\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u00003\u0007\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000056\u0005\r\u0000\u00006\t\u0001\u0000\u0000\u00007>\u0005\u000f"+
		"\u0000\u00008>\u0005\u0010\u0000\u00009>\u0005\u000e\u0000\u0000:>\u0005"+
		"\u0011\u0000\u0000;>\u0003\f\u0006\u0000<>\u0003\u000e\u0007\u0000=7\u0001"+
		"\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000"+
		"=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>\u000b\u0001\u0000\u0000\u0000?@\u0005\f\u0000\u0000@A\u0005\u0011"+
		"\u0000\u0000A\r\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CH\u0003"+
		"\n\u0005\u0000DE\u0005\u000b\u0000\u0000EG\u0003\n\u0005\u0000FD\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000KL\u0005\t\u0000\u0000L\u000f\u0001\u0000\u0000\u0000\u0007\u0013"+
		"\u001e&+2=H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}