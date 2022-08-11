// Generated from io/subbu/chat/grammer/Chat.g4 by ANTLR 4.10.1
package io.subbu.chat.grammer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7, SAYS=8, SHOUTS=9, 
		WORD=10, WHITESPACE=11, NEWLINE=12, TEXT=13, PUNCTUATON=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "S", "Y", "H", "O", 
			"U", "T", "LOWERCASE", "UPPERCASE", "DIGIT", "NUMBER", "SAYS", "SHOUTS", 
			"WORD", "WHITESPACE", "NEWLINE", "TEXT", "PUNCTUATON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "')'", "'('", "'/'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUMBER", "SAYS", "SHOUTS", 
			"WORD", "WHITESPACE", "NEWLINE", "TEXT", "PUNCTUATON"
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

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
		"\u0004\u0000\u000e\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010S\b\u0010\u000b\u0010\f\u0010T\u0001\u0010\u0001\u0010\u0004"+
		"\u0010Y\b\u0010\u000b\u0010\f\u0010Z\u0003\u0010]\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013n\b\u0013\u000b\u0013\f\u0013o\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0003\u0015u\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0004\u0015y\b\u0015\u000b\u0015\f\u0015z\u0001\u0016\u0001\u0016"+
		"\u0004\u0016\u007f\b\u0016\u000b\u0016\f\u0016\u0080\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0005\u0017\u0086\b\u0017\n\u0017\f\u0017\u0089\t\u0017"+
		"\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017"+
		"\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000!\u0007#\b%\t\'"+
		"\n)\u000b+\f-\r/\u000e\u0001\u0000\u000f\u0002\u0000AAaa\u0002\u0000S"+
		"Sss\u0002\u0000YYyy\u0002\u0000HHhh\u0002\u0000OOoo\u0002\u0000UUuu\u0002"+
		"\u0000TTtt\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0002\u0000,,..\u0002"+
		"\u0000\t\t  \u0002\u0000(([[\u0002\u0000))]]\u0004\u0000 !,,..??\u008a"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00033"+
		"\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001\u0000"+
		"\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000"+
		"\r=\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001"+
		"\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000"+
		"\u0000\u0017G\u0001\u0000\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001b"+
		"K\u0001\u0000\u0000\u0000\u001dM\u0001\u0000\u0000\u0000\u001fO\u0001"+
		"\u0000\u0000\u0000!R\u0001\u0000\u0000\u0000#^\u0001\u0000\u0000\u0000"+
		"%c\u0001\u0000\u0000\u0000\'m\u0001\u0000\u0000\u0000)q\u0001\u0000\u0000"+
		"\u0000+x\u0001\u0000\u0000\u0000-|\u0001\u0000\u0000\u0000/\u0087\u0001"+
		"\u0000\u0000\u000012\u0005:\u0000\u00002\u0002\u0001\u0000\u0000\u0000"+
		"34\u0005-\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005)\u0000\u0000"+
		"6\u0006\u0001\u0000\u0000\u000078\u0005(\u0000\u00008\b\u0001\u0000\u0000"+
		"\u00009:\u0005/\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005@\u0000"+
		"\u0000<\f\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\u000e\u0001"+
		"\u0000\u0000\u0000?@\u0007\u0001\u0000\u0000@\u0010\u0001\u0000\u0000"+
		"\u0000AB\u0007\u0002\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CD\u0007"+
		"\u0003\u0000\u0000D\u0014\u0001\u0000\u0000\u0000EF\u0007\u0004\u0000"+
		"\u0000F\u0016\u0001\u0000\u0000\u0000GH\u0007\u0005\u0000\u0000H\u0018"+
		"\u0001\u0000\u0000\u0000IJ\u0007\u0006\u0000\u0000J\u001a\u0001\u0000"+
		"\u0000\u0000KL\u0007\u0007\u0000\u0000L\u001c\u0001\u0000\u0000\u0000"+
		"MN\u0007\b\u0000\u0000N\u001e\u0001\u0000\u0000\u0000OP\u0007\t\u0000"+
		"\u0000P \u0001\u0000\u0000\u0000QS\u0003\u001f\u000f\u0000RQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\\\u0001\u0000\u0000\u0000VX\u0007\n\u0000\u0000WY"+
		"\u0003\u001f\u000f\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\V\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\""+
		"\u0001\u0000\u0000\u0000^_\u0003\u000f\u0007\u0000_`\u0003\r\u0006\u0000"+
		"`a\u0003\u0011\b\u0000ab\u0003\u000f\u0007\u0000b$\u0001\u0000\u0000\u0000"+
		"cd\u0003\u000f\u0007\u0000de\u0003\u0013\t\u0000ef\u0003\u0015\n\u0000"+
		"fg\u0003\u0017\u000b\u0000gh\u0003\u0019\f\u0000hi\u0003\u000f\u0007\u0000"+
		"i&\u0001\u0000\u0000\u0000jn\u0003\u001b\r\u0000kn\u0003\u001d\u000e\u0000"+
		"ln\u0005_\u0000\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p(\u0001\u0000\u0000\u0000qr\u0007\u000b"+
		"\u0000\u0000r*\u0001\u0000\u0000\u0000su\u0005\r\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0005"+
		"\n\u0000\u0000wy\u0005\r\u0000\u0000xt\u0001\u0000\u0000\u0000xw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{,\u0001\u0000\u0000\u0000|~\u0007\f\u0000\u0000"+
		"}\u007f\b\r\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0007\r\u0000\u0000"+
		"\u0083.\u0001\u0000\u0000\u0000\u0084\u0086\u0007\u000e\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"0\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u000b\u0000"+
		"TZ\\motxz\u0080\u0087\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}