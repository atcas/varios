// Generated from Cymbol.g4 by ANTLR 4.5.3
package com.djaramillo.Cymbol;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, INT=23, WS=24, SL_COMMENT=25, 
		MultiLineComment=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "ID", "LETTER", "INT", "WS", "SL_COMMENT", 
		"MultiLineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'float'", "'int'", "'void'", "'('", "')'", "','", 
		"'{'", "'}'", "'if'", "'then'", "'else'", "'return'", "'['", "']'", "'-'", 
		"'!'", "'*'", "'+'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"WS", "SL_COMMENT", "MultiLineComment"
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


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

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
		case 24:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27}\n\27\f\27"+
		"\16\27\u0080\13\27\3\30\3\30\3\31\6\31\u0085\n\31\r\31\16\31\u0086\3\32"+
		"\6\32\u008a\n\32\r\32\16\32\u008b\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0094"+
		"\n\33\f\33\16\33\u0097\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7"+
		"\34\u00a1\n\34\f\34\16\34\u00a4\13\34\3\34\3\34\3\34\3\34\3\34\4\u0095"+
		"\u00a2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\31\63\32\65\33\67\34"+
		"\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00ae\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13G"+
		"\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27"+
		"V\3\2\2\2\31Y\3\2\2\2\33^\3\2\2\2\35c\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n"+
		"\3\2\2\2%p\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-y\3\2\2\2/\u0081\3\2"+
		"\2\2\61\u0084\3\2\2\2\63\u0089\3\2\2\2\65\u008f\3\2\2\2\67\u009c\3\2\2"+
		"\29:\7?\2\2:\4\3\2\2\2;<\7=\2\2<\6\3\2\2\2=>\7h\2\2>?\7n\2\2?@\7q\2\2"+
		"@A\7c\2\2AB\7v\2\2B\b\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F\n\3\2\2\2GH"+
		"\7x\2\2HI\7q\2\2IJ\7k\2\2JK\7f\2\2K\f\3\2\2\2LM\7*\2\2M\16\3\2\2\2NO\7"+
		"+\2\2O\20\3\2\2\2PQ\7.\2\2Q\22\3\2\2\2RS\7}\2\2S\24\3\2\2\2TU\7\177\2"+
		"\2U\26\3\2\2\2VW\7k\2\2WX\7h\2\2X\30\3\2\2\2YZ\7v\2\2Z[\7j\2\2[\\\7g\2"+
		"\2\\]\7p\2\2]\32\3\2\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\34\3\2\2"+
		"\2cd\7t\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2i\36\3\2\2\2j"+
		"k\7]\2\2k \3\2\2\2lm\7_\2\2m\"\3\2\2\2no\7/\2\2o$\3\2\2\2pq\7#\2\2q&\3"+
		"\2\2\2rs\7,\2\2s(\3\2\2\2tu\7-\2\2u*\3\2\2\2vw\7?\2\2wx\7?\2\2x,\3\2\2"+
		"\2y~\5/\30\2z}\5/\30\2{}\t\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177.\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\3\2\2"+
		"\u0082\60\3\2\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\62\3\2\2\2\u0088"+
		"\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\32\2\2\u008e"+
		"\64\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0095\3\2"+
		"\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0099\7\f\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\33\3\2\u009b"+
		"\66\3\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7,\2\2\u009e\u00a2\3\2\2"+
		"\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\34\4\2\u00a98\3\2\2\2\t\2|~\u0086\u008b\u0095\u00a2\5\3\32\2"+
		"\3\33\3\3\34\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}