// Generated from Codex.g4 by ANTLR 4.5.3
package com.djaramillo.Codex;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WithMember=9, 
		BetweenMember=10, ForMember=11, RollMember=12, Pay=13, Take=14, Switch=15, 
		Msg=16, Exit=17, On=18, Every=19, Start=20, Stop=21, HEXA=22, INT=23, 
		WS=24, SL_COMMENT=25, MultiLineComment=26;
	public static final int
		RULE_file = 0, RULE_mainRoll = 1, RULE_subjectList = 2, RULE_stat = 3, 
		RULE_statConsequential = 4, RULE_statTemporal = 5, RULE_statOn = 6, RULE_statPay = 7, 
		RULE_subject = 8;
	public static final String[] ruleNames = {
		"file", "mainRoll", "subjectList", "stat", "statConsequential", "statTemporal", 
		"statOn", "statPay", "subject"
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

	@Override
	public String getGrammarFileName() { return "Codex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public MainRollContext mainRoll() {
			return getRuleContext(MainRollContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			mainRoll();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				stat();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Pay );
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

	public static class MainRollContext extends ParserRuleContext {
		public TerminalNode WithMember() { return getToken(CodexParser.WithMember, 0); }
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public TerminalNode ForMember() { return getToken(CodexParser.ForMember, 0); }
		public TerminalNode RollMember() { return getToken(CodexParser.RollMember, 0); }
		public SubjectListContext subjectList() {
			return getRuleContext(SubjectListContext.class,0);
		}
		public TerminalNode BetweenMember() { return getToken(CodexParser.BetweenMember, 0); }
		public MainRollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRoll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterMainRoll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitMainRoll(this);
		}
	}

	public final MainRollContext mainRoll() throws RecognitionException {
		MainRollContext _localctx = new MainRollContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainRoll);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case WithMember:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(WithMember);
				setState(25);
				subject();
				setState(26);
				match(T__0);
				}
				break;
			case ForMember:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(ForMember);
				setState(29);
				match(RollMember);
				setState(30);
				subjectList();
				setState(31);
				match(T__0);
				}
				break;
			case BetweenMember:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(BetweenMember);
				setState(34);
				match(RollMember);
				setState(35);
				subjectList();
				setState(36);
				match(T__0);
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

	public static class SubjectListContext extends ParserRuleContext {
		public List<SubjectContext> subject() {
			return getRuleContexts(SubjectContext.class);
		}
		public SubjectContext subject(int i) {
			return getRuleContext(SubjectContext.class,i);
		}
		public SubjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterSubjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitSubjectList(this);
		}
	}

	public final SubjectListContext subjectList() throws RecognitionException {
		SubjectListContext _localctx = new SubjectListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subjectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			subject();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(42);
				match(T__2);
				setState(43);
				subject();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__3);
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

	public static class StatContext extends ParserRuleContext {
		public StatConsequentialContext statConsequential() {
			return getRuleContext(StatConsequentialContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			statConsequential();
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

	public static class StatConsequentialContext extends ParserRuleContext {
		public StatPayContext statPay() {
			return getRuleContext(StatPayContext.class,0);
		}
		public StatConsequentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statConsequential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterStatConsequential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitStatConsequential(this);
		}
	}

	public final StatConsequentialContext statConsequential() throws RecognitionException {
		StatConsequentialContext _localctx = new StatConsequentialContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statConsequential);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			statPay();
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

	public static class StatTemporalContext extends ParserRuleContext {
		public StatOnContext statOn() {
			return getRuleContext(StatOnContext.class,0);
		}
		public StatTemporalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statTemporal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterStatTemporal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitStatTemporal(this);
		}
	}

	public final StatTemporalContext statTemporal() throws RecognitionException {
		StatTemporalContext _localctx = new StatTemporalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statTemporal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			statOn();
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

	public static class StatOnContext extends ParserRuleContext {
		public TerminalNode On() { return getToken(CodexParser.On, 0); }
		public TerminalNode INT() { return getToken(CodexParser.INT, 0); }
		public StatOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statOn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterStatOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitStatOn(this);
		}
	}

	public final StatOnContext statOn() throws RecognitionException {
		StatOnContext _localctx = new StatOnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(On);
			setState(58);
			match(T__4);
			setState(59);
			match(T__5);
			setState(60);
			match(T__6);
			setState(61);
			match(INT);
			setState(62);
			match(T__7);
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

	public static class StatPayContext extends ParserRuleContext {
		public TerminalNode Pay() { return getToken(CodexParser.Pay, 0); }
		public TerminalNode INT() { return getToken(CodexParser.INT, 0); }
		public StatTemporalContext statTemporal() {
			return getRuleContext(StatTemporalContext.class,0);
		}
		public StatPayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statPay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterStatPay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitStatPay(this);
		}
	}

	public final StatPayContext statPay() throws RecognitionException {
		StatPayContext _localctx = new StatPayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statPay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Pay);
			setState(65);
			match(INT);
			setState(67);
			_la = _input.LA(1);
			if (_la==On) {
				{
				setState(66);
				statTemporal();
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

	public static class SubjectContext extends ParserRuleContext {
		public TerminalNode HEXA() { return getToken(CodexParser.HEXA, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodexListener ) ((CodexListener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(HEXA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tF\n\t"+
		"\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2E\2\24\3\2\2\2\4(\3\2\2\2"+
		"\6*\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20B\3\2\2"+
		"\2\22G\3\2\2\2\24\26\5\4\3\2\25\27\5\b\5\2\26\25\3\2\2\2\27\30\3\2\2\2"+
		"\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\33\7\13\2\2\33\34\5\22\n"+
		"\2\34\35\7\3\2\2\35)\3\2\2\2\36\37\7\r\2\2\37 \7\16\2\2 !\5\6\4\2!\"\7"+
		"\3\2\2\")\3\2\2\2#$\7\f\2\2$%\7\16\2\2%&\5\6\4\2&\'\7\3\2\2\')\3\2\2\2"+
		"(\32\3\2\2\2(\36\3\2\2\2(#\3\2\2\2)\5\3\2\2\2*+\7\4\2\2+\60\5\22\n\2,"+
		"-\7\5\2\2-/\5\22\n\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\63\3\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\7\3\2\2\2\65\66\5\n\6\2\66"+
		"\t\3\2\2\2\678\5\20\t\28\13\3\2\2\29:\5\16\b\2:\r\3\2\2\2;<\7\24\2\2<"+
		"=\7\7\2\2=>\7\b\2\2>?\7\t\2\2?@\7\31\2\2@A\7\n\2\2A\17\3\2\2\2BC\7\17"+
		"\2\2CE\7\31\2\2DF\5\f\7\2ED\3\2\2\2EF\3\2\2\2F\21\3\2\2\2GH\7\30\2\2H"+
		"\23\3\2\2\2\6\30(\60E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}