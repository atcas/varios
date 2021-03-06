// Generated from Codex.g4 by ANTLR 4.5.3
package com.djaramillo.Codex;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WithMember=9, 
		BetweenMember=10, ForMember=11, RollMember=12, Pay=13, Take=14, Switch=15, 
		Msg=16, Exit=17, On=18, Every=19, Start=20, Stop=21, HEXA=22, INT=23, 
		WS=24, SL_COMMENT=25, MultiLineComment=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WithMember", 
		"BetweenMember", "ForMember", "RollMember", "Pay", "Take", "Switch", "Msg", 
		"Exit", "On", "Every", "Start", "Stop", "HEXA", "INT", "WS", "SL_COMMENT", 
		"MultiLineComment", "LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'['", "','", "']'", "'('", "'t'", "'+'", "')'", "'with'", 
		"'between'", "'for'", "'roll'", "'pay'", "'take'", "'switch'", "'msg'", 
		"'exit'", "'on'", "'every'", "'start'", "'stop'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WithMember", "BetweenMember", 
		"ForMember", "RollMember", "Pay", "Take", "Switch", "Msg", "Exit", "On", 
		"Every", "Start", "Stop", "HEXA", "INT", "WS", "SL_COMMENT", "MultiLineComment"
	};
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


	    public static final int WHITESPACE = 1;
	    public static final int COMMENTS = 2;


	public CodexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Codex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			MultiLineComment_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			_channel = WHITESPACE;
			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			_channel = COMMENTS;
			break;
		}
	}
	private void MultiLineComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			_channel = COMMENTS;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\6\27\u0091\n\27\r\27\16\27\u0092\3\30\6\30\u0096"+
		"\n\30\r\30\16\30\u0097\3\31\6\31\u009b\n\31\r\31\16\31\u009c\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00a5\n\32\f\32\16\32\u00a8\13\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00b2\n\33\f\33\16\33\u00b5\13\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\4\u00a6\u00b3\2\35\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\2\3\2\6\6\2\62;C\\c|~~\3\2"+
		"\62;\5\2\13\f\17\17\"\"\4\2C\\c|\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3"+
		"\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25N\3\2\2\2\27V\3\2\2\2\31"+
		"Z\3\2\2\2\33_\3\2\2\2\35c\3\2\2\2\37h\3\2\2\2!o\3\2\2\2#s\3\2\2\2%x\3"+
		"\2\2\2\'{\3\2\2\2)\u0081\3\2\2\2+\u0087\3\2\2\2-\u008c\3\2\2\2/\u0095"+
		"\3\2\2\2\61\u009a\3\2\2\2\63\u00a0\3\2\2\2\65\u00ad\3\2\2\2\67\u00bb\3"+
		"\2\2\29:\7<\2\2:\4\3\2\2\2;<\7]\2\2<\6\3\2\2\2=>\7.\2\2>\b\3\2\2\2?@\7"+
		"_\2\2@\n\3\2\2\2AB\7*\2\2B\f\3\2\2\2CD\7v\2\2D\16\3\2\2\2EF\7-\2\2F\20"+
		"\3\2\2\2GH\7+\2\2H\22\3\2\2\2IJ\7y\2\2JK\7k\2\2KL\7v\2\2LM\7j\2\2M\24"+
		"\3\2\2\2NO\7d\2\2OP\7g\2\2PQ\7v\2\2QR\7y\2\2RS\7g\2\2ST\7g\2\2TU\7p\2"+
		"\2U\26\3\2\2\2VW\7h\2\2WX\7q\2\2XY\7t\2\2Y\30\3\2\2\2Z[\7t\2\2[\\\7q\2"+
		"\2\\]\7n\2\2]^\7n\2\2^\32\3\2\2\2_`\7r\2\2`a\7c\2\2ab\7{\2\2b\34\3\2\2"+
		"\2cd\7v\2\2de\7c\2\2ef\7m\2\2fg\7g\2\2g\36\3\2\2\2hi\7u\2\2ij\7y\2\2j"+
		"k\7k\2\2kl\7v\2\2lm\7e\2\2mn\7j\2\2n \3\2\2\2op\7o\2\2pq\7u\2\2qr\7i\2"+
		"\2r\"\3\2\2\2st\7g\2\2tu\7z\2\2uv\7k\2\2vw\7v\2\2w$\3\2\2\2xy\7q\2\2y"+
		"z\7p\2\2z&\3\2\2\2{|\7g\2\2|}\7x\2\2}~\7g\2\2~\177\7t\2\2\177\u0080\7"+
		"{\2\2\u0080(\3\2\2\2\u0081\u0082\7u\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7c\2\2\u0084\u0085\7t\2\2\u0085\u0086\7v\2\2\u0086*\3\2\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7v\2\2\u0089\u008a\7q\2\2\u008a\u008b\7r\2\2\u008b"+
		",\3\2\2\2\u008c\u008d\7\62\2\2\u008d\u008e\7z\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093.\3\2\2\2\u0094\u0096\t\3\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\60\3\2\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\31\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\7\61"+
		"\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b\32\3\2\u00ac\64\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7,\2"+
		"\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\b\33\4\2\u00ba\66\3\2\2\2\u00bb\u00bc\t\5\2"+
		"\2\u00bc8\3\2\2\2\b\2\u0092\u0097\u009c\u00a6\u00b3\5\3\31\2\3\32\3\3"+
		"\33\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}