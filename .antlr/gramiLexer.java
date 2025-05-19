// Generated from c:/Users/USER/Documents/2025/MATERIAS/SSL/FinalAnalizador/anali.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRUEBA=1, DADO=2, CUANDO=3, ENTONCES=4, LBRACE=5, RBRACE=6, DOT=7, COMA=8, 
		Y=9, PESO=10, LCORCHETE=11, RCORCHETE=12, ESTADO=13, BOOLEANO=14, TEXTO=15, 
		NUMERO=16, IDENTIFICADOR=17, NEWLINE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRUEBA", "DADO", "CUANDO", "ENTONCES", "LBRACE", "RBRACE", "DOT", "COMA", 
			"Y", "PESO", "LCORCHETE", "RCORCHETE", "ESTADO", "BOOLEANO", "TEXTO", 
			"NUMERO", "IDENTIFICADOR", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prueba'", "'dado'", "'cuando'", "'entonces'", "'{'", "'}'", "'.'", 
			"','", "'y'", "'$'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRUEBA", "DADO", "CUANDO", "ENTONCES", "LBRACE", "RBRACE", "DOT", 
			"COMA", "Y", "PESO", "LCORCHETE", "RCORCHETE", "ESTADO", "BOOLEANO", 
			"TEXTO", "NUMERO", "IDENTIFICADOR", "NEWLINE", "WS"
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


	public gramiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "anali.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\fm\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r}\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0083"+
		"\b\u000e\n\u000e\f\u000e\u0086\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0004\u000f\u008b\b\u000f\u000b\u000f\f\u000f\u008c\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0091\b\u0010\n\u0010\f\u0010\u0094\t\u0010\u0001\u0011"+
		"\u0003\u0011\u0097\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"\u009c\b\u0012\u000b\u0012\f\u0012\u009d\u0000\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0005\u0004\u0000\n\n\r"+
		"\r\"\"\\\\\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000"+
		"\t\t  \u00a9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003.\u0001"+
		"\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000"+
		"\u0000\tC\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rG\u0001"+
		"\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000"+
		"\u0000\u0013M\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017"+
		"Q\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001b|\u0001"+
		"\u0000\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u008a\u0001\u0000"+
		"\u0000\u0000!\u008e\u0001\u0000\u0000\u0000#\u0096\u0001\u0000\u0000\u0000"+
		"%\u009b\u0001\u0000\u0000\u0000\'(\u0005p\u0000\u0000()\u0005r\u0000\u0000"+
		")*\u0005u\u0000\u0000*+\u0005e\u0000\u0000+,\u0005b\u0000\u0000,-\u0005"+
		"a\u0000\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005d\u0000\u0000/0\u0005"+
		"a\u0000\u000001\u0005d\u0000\u000012\u0005o\u0000\u00002\u0004\u0001\u0000"+
		"\u0000\u000034\u0005c\u0000\u000045\u0005u\u0000\u000056\u0005a\u0000"+
		"\u000067\u0005n\u0000\u000078\u0005d\u0000\u000089\u0005o\u0000\u0000"+
		"9\u0006\u0001\u0000\u0000\u0000:;\u0005e\u0000\u0000;<\u0005n\u0000\u0000"+
		"<=\u0005t\u0000\u0000=>\u0005o\u0000\u0000>?\u0005n\u0000\u0000?@\u0005"+
		"c\u0000\u0000@A\u0005e\u0000\u0000AB\u0005s\u0000\u0000B\b\u0001\u0000"+
		"\u0000\u0000CD\u0005{\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005}"+
		"\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005.\u0000\u0000H\u000e\u0001"+
		"\u0000\u0000\u0000IJ\u0005,\u0000\u0000J\u0010\u0001\u0000\u0000\u0000"+
		"KL\u0005y\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005$\u0000\u0000"+
		"N\u0014\u0001\u0000\u0000\u0000OP\u0005[\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QR\u0005]\u0000\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005"+
		"e\u0000\u0000Tm\u0005s\u0000\u0000UV\u0005n\u0000\u0000VW\u0005o\u0000"+
		"\u0000WX\u0005 \u0000\u0000XY\u0005e\u0000\u0000Ym\u0005s\u0000\u0000"+
		"Z[\u0005c\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005"+
		"t\u0000\u0000^_\u0005i\u0000\u0000_`\u0005e\u0000\u0000`a\u0005n\u0000"+
		"\u0000am\u0005e\u0000\u0000bc\u0005e\u0000\u0000cd\u0005x\u0000\u0000"+
		"de\u0005i\u0000\u0000ef\u0005s\u0000\u0000fg\u0005t\u0000\u0000gm\u0005"+
		"e\u0000\u0000hi\u0005d\u0000\u0000ij\u0005e\u0000\u0000jk\u0005b\u0000"+
		"\u0000km\u0005e\u0000\u0000lS\u0001\u0000\u0000\u0000lU\u0001\u0000\u0000"+
		"\u0000lZ\u0001\u0000\u0000\u0000lb\u0001\u0000\u0000\u0000lh\u0001\u0000"+
		"\u0000\u0000m\u001a\u0001\u0000\u0000\u0000no\u0005v\u0000\u0000op\u0005"+
		"e\u0000\u0000pq\u0005r\u0000\u0000qr\u0005d\u0000\u0000rs\u0005a\u0000"+
		"\u0000st\u0005d\u0000\u0000tu\u0005e\u0000\u0000uv\u0005r\u0000\u0000"+
		"v}\u0005o\u0000\u0000wx\u0005f\u0000\u0000xy\u0005a\u0000\u0000yz\u0005"+
		"l\u0000\u0000z{\u0005s\u0000\u0000{}\u0005o\u0000\u0000|n\u0001\u0000"+
		"\u0000\u0000|w\u0001\u0000\u0000\u0000}\u001c\u0001\u0000\u0000\u0000"+
		"~\u0084\u0005\"\u0000\u0000\u007f\u0083\b\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\\\u0000\u0000\u0081\u0083\t\u0000\u0000\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u001e\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0007\u0001\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d \u0001\u0000\u0000"+
		"\u0000\u008e\u0092\u0007\u0002\u0000\u0000\u008f\u0091\u0007\u0003\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0005\r\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\n\u0000\u0000\u0099$\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0007\u0004\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e&\u0001\u0000\u0000\u0000\t\u0000l|\u0082"+
		"\u0084\u008c\u0092\u0096\u009d\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}