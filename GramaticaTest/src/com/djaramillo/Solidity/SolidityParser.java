// Generated from Solidity.g4 by ANTLR 4.5.3
package com.djaramillo.Solidity;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Contract=2, ReturnsSolidity=3, BoolSolidity=4, IntSolidity=5, 
		UIntSolidity=6, FixedSolidity=7, UfixedSolidity=8, AddressSolidity=9, 
		StringSolidity=10, StructSolidity=11, MappingSolidity=12, EnumSolidity=13, 
		ModifierSolidity=14, RegularExpressionLiteral=15, LineTerminator=16, OpenBracket=17, 
		CloseBracket=18, OpenParen=19, CloseParen=20, OpenBrace=21, CloseBrace=22, 
		SemiColon=23, Comma=24, Assign=25, QuestionMark=26, Colon=27, Dot=28, 
		PlusPlus=29, MinusMinus=30, Plus=31, Minus=32, BitNot=33, Not=34, Multiply=35, 
		Divide=36, Modulus=37, RightShiftArithmetic=38, LeftShiftArithmetic=39, 
		RightShiftLogical=40, LessThan=41, MoreThan=42, LessThanEquals=43, GreaterThanEquals=44, 
		Equals=45, NotEquals=46, IdentityEquals=47, IdentityNotEquals=48, BitAnd=49, 
		BitXOr=50, BitOr=51, And=52, Or=53, MultiplyAssign=54, DivideAssign=55, 
		ModulusAssign=56, PlusAssign=57, MinusAssign=58, LeftShiftArithmeticAssign=59, 
		RightShiftArithmeticAssign=60, RightShiftLogicalAssign=61, BitAndAssign=62, 
		BitXorAssign=63, BitOrAssign=64, NullLiteral=65, BooleanLiteral=66, DecimalLiteral=67, 
		HexIntegerLiteral=68, OctalIntegerLiteral=69, Break=70, Do=71, Instanceof=72, 
		Typeof=73, Case=74, Else=75, New=76, Var=77, Catch=78, Finally=79, Return=80, 
		Void=81, Continue=82, For=83, Switch=84, While=85, Debugger=86, Function=87, 
		This=88, With=89, Default=90, If=91, Throw=92, Delete=93, In=94, Try=95, 
		Class=96, Enum=97, Extends=98, Super=99, Const=100, Export=101, Import=102, 
		Implements=103, Let=104, Private=105, Public=106, Interface=107, Package=108, 
		Protected=109, Static=110, Yield=111, Identifier=112, StringLiteral=113, 
		WhiteSpaces=114, MultiLineComment=115, SingleLineComment=116, UnexpectedCharacter=117;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_sourceElement = 2, RULE_contractElements = 3, 
		RULE_contractElement = 4, RULE_statement = 5, RULE_block = 6, RULE_statementList = 7, 
		RULE_variableStatement = 8, RULE_variableStatementSolidity = 9, RULE_variableDeclarationListFunctionSolidity = 10, 
		RULE_variableDeclarationNameFunctionSolidity = 11, RULE_variableDeclarationNameSolidity = 12, 
		RULE_variableDeclarationSolidity = 13, RULE_variableDeclarationList = 14, 
		RULE_variableDeclaration = 15, RULE_initialiser = 16, RULE_emptyStatement = 17, 
		RULE_expressionStatement = 18, RULE_ifStatement = 19, RULE_iterationStatement = 20, 
		RULE_continueStatement = 21, RULE_breakStatement = 22, RULE_returnStatement = 23, 
		RULE_withStatement = 24, RULE_switchStatement = 25, RULE_caseBlock = 26, 
		RULE_caseClauses = 27, RULE_caseClause = 28, RULE_defaultClause = 29, 
		RULE_labelledStatement = 30, RULE_throwStatement = 31, RULE_tryStatement = 32, 
		RULE_catchProduction = 33, RULE_finallyProduction = 34, RULE_debuggerStatement = 35, 
		RULE_returnfunctionSolidity = 36, RULE_mappingStatement = 37, RULE_typeSolidity = 38, 
		RULE_modifierDeclaration = 39, RULE_functionDeclaration = 40, RULE_formalParameterList = 41, 
		RULE_formalParameterListSolidity = 42, RULE_functionBody = 43, RULE_arrayLiteral = 44, 
		RULE_elementList = 45, RULE_elision = 46, RULE_objectLiteral = 47, RULE_propertyNameAndValueList = 48, 
		RULE_propertyAssignment = 49, RULE_propertyName = 50, RULE_propertySetParameterList = 51, 
		RULE_arguments = 52, RULE_argumentList = 53, RULE_expressionSequence = 54, 
		RULE_singleExpression = 55, RULE_assignmentOperator = 56, RULE_literal = 57, 
		RULE_numericLiteral = 58, RULE_identifierName = 59, RULE_reservedWord = 60, 
		RULE_keyword = 61, RULE_futureReservedWord = 62, RULE_getter = 63, RULE_setter = 64, 
		RULE_eos = 65, RULE_eof = 66;
	public static final String[] ruleNames = {
		"program", "sourceElements", "sourceElement", "contractElements", "contractElement", 
		"statement", "block", "statementList", "variableStatement", "variableStatementSolidity", 
		"variableDeclarationListFunctionSolidity", "variableDeclarationNameFunctionSolidity", 
		"variableDeclarationNameSolidity", "variableDeclarationSolidity", "variableDeclarationList", 
		"variableDeclaration", "initialiser", "emptyStatement", "expressionStatement", 
		"ifStatement", "iterationStatement", "continueStatement", "breakStatement", 
		"returnStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses", 
		"caseClause", "defaultClause", "labelledStatement", "throwStatement", 
		"tryStatement", "catchProduction", "finallyProduction", "debuggerStatement", 
		"returnfunctionSolidity", "mappingStatement", "typeSolidity", "modifierDeclaration", 
		"functionDeclaration", "formalParameterList", "formalParameterListSolidity", 
		"functionBody", "arrayLiteral", "elementList", "elision", "objectLiteral", 
		"propertyNameAndValueList", "propertyAssignment", "propertyName", "propertySetParameterList", 
		"arguments", "argumentList", "expressionSequence", "singleExpression", 
		"assignmentOperator", "literal", "numericLiteral", "identifierName", "reservedWord", 
		"keyword", "futureReservedWord", "getter", "setter", "eos", "eof"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=>'", "'contract'", "'returns'", "'bool'", null, null, null, null, 
		"'address'", "'string'", "'struct'", "'mapping'", null, "'modifier'", 
		null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", 
		"'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", 
		"'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", 
		"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", 
		"'|='", "'null'", null, null, null, null, "'break'", "'do'", "'instanceof'", 
		"'typeof'", "'case'", "'else'", "'new'", "'var'", "'catch'", "'finally'", 
		"'return'", "'void'", "'continue'", "'for'", "'switch'", "'while'", "'debugger'", 
		"'function'", "'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", 
		"'in'", "'try'", "'class'", null, "'extends'", "'super'", "'const'", "'export'", 
		"'import'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Contract", "ReturnsSolidity", "BoolSolidity", "IntSolidity", 
		"UIntSolidity", "FixedSolidity", "UfixedSolidity", "AddressSolidity", 
		"StringSolidity", "StructSolidity", "MappingSolidity", "EnumSolidity", 
		"ModifierSolidity", "RegularExpressionLiteral", "LineTerminator", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
		"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
		"Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
		"Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
		"For", "Switch", "While", "Debugger", "Function", "This", "With", "Default", 
		"If", "Throw", "Delete", "In", "Try", "Class", "Enum", "Extends", "Super", 
		"Const", "Export", "Import", "Implements", "Let", "Private", "Public", 
		"Interface", "Package", "Protected", "Static", "Yield", "Identifier", 
		"StringLiteral", "WhiteSpaces", "MultiLineComment", "SingleLineComment", 
		"UnexpectedCharacter"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




		/**
		 * Returns {@code true} iff on the current index of the parser's
		 * token stream a token of the given {@code type} exists on the
		 * {@code HIDDEN} channel.
		 *
		 * @param type
		 *         the type of the token on the {@code HIDDEN} channel
		 *         to check.
		 *
		 * ...
		 */
		private boolean here(final int type) {

		      int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
		        Token ahead = _input.get(possibleIndexEosToken);
		        // Check if the token resides on the Hidden channel and if it's of the
		        // provided type.
		        return (ahead.getChannel() == Lexer.HIDDEN) && (ahead.getType() == type);


		}

		/**
		 * Returns {@code true} iff on the current index of the parser's
		 * token stream a token exists on the {@code HIDDEN} channel which
		 * either is a line terminator, or is a multi line comment that
		 * contains a line terminator.
		 *
		 * ...
		 */
		private boolean lineTerminatorAhead() {

			  // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);
	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the Hidden channel.
	            return false;
	        }

	        if (ahead.getType() == LineTerminator) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WhiteSpaces) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == MultiLineComment && (text.contains("\r") || text.contains("\n"))) ||
	                (type == LineTerminator);

		}



	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public ContractElementsContext contractElements() {
			return getRuleContext(ContractElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if (_la==Contract) {
				{
				setState(134);
				contractElements();
				}
			}

			setState(137);
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

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceElements(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
					sourceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ModifierDeclarationContext modifierDeclaration() {
			return getRuleContext(ModifierDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceElement(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				modifierDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				functionDeclaration();
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

	public static class ContractElementsContext extends ParserRuleContext {
		public List<ContractElementContext> contractElement() {
			return getRuleContexts(ContractElementContext.class);
		}
		public ContractElementContext contractElement(int i) {
			return getRuleContext(ContractElementContext.class,i);
		}
		public ContractElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractElements(this);
		}
	}

	public final ContractElementsContext contractElements() throws RecognitionException {
		ContractElementsContext _localctx = new ContractElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contractElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				contractElement();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Contract );
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

	public static class ContractElementContext extends ParserRuleContext {
		public TerminalNode Contract() { return getToken(SolidityParser.Contract, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ContractElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractElement(this);
		}
	}

	public final ContractElementContext contractElement() throws RecognitionException {
		ContractElementContext _localctx = new ContractElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contractElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Contract);
			setState(155);
			match(Identifier);
			setState(156);
			match(OpenBrace);
			setState(157);
			sourceElements();
			setState(158);
			match(CloseBrace);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementSolidityContext variableStatementSolidity() {
			return getRuleContext(VariableStatementSolidityContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DebuggerStatementContext debuggerStatement() {
			return getRuleContext(DebuggerStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				variableStatementSolidity();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(169);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(170);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(172);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(173);
				tryStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(174);
				debuggerStatement();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(OpenBrace);
			setState(179);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Return - 65)) | (1L << (Void - 65)) | (1L << (Continue - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (Debugger - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (With - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(178);
				statementList();
				}
			}

			setState(181);
			match(CloseBrace);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Return - 65)) | (1L << (Void - 65)) | (1L << (Continue - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (Debugger - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (With - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0) );
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

	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(SolidityParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Var);
			setState(189);
			variableDeclarationList();
			setState(190);
			eos();
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

	public static class VariableStatementSolidityContext extends ParserRuleContext {
		public TypeSolidityContext typeSolidity() {
			return getRuleContext(TypeSolidityContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public List<VariableDeclarationNameSolidityContext> variableDeclarationNameSolidity() {
			return getRuleContexts(VariableDeclarationNameSolidityContext.class);
		}
		public VariableDeclarationNameSolidityContext variableDeclarationNameSolidity(int i) {
			return getRuleContext(VariableDeclarationNameSolidityContext.class,i);
		}
		public TerminalNode EnumSolidity() { return getToken(SolidityParser.EnumSolidity, 0); }
		public VariableStatementSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatementSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableStatementSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableStatementSolidity(this);
		}
	}

	public final VariableStatementSolidityContext variableStatementSolidity() throws RecognitionException {
		VariableStatementSolidityContext _localctx = new VariableStatementSolidityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableStatementSolidity);
		int _la;
		try {
			setState(222);
			switch (_input.LA(1)) {
			case BoolSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				typeSolidity();
				setState(193);
				variableDeclaration();
				setState(194);
				eos();
				}
				break;
			case MappingSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				mappingStatement();
				setState(197);
				variableDeclaration();
				setState(198);
				eos();
				}
				break;
			case StructSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(StructSolidity);
				setState(201);
				match(Identifier);
				setState(202);
				match(OpenBrace);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity))) != 0)) {
					{
					{
					setState(203);
					variableDeclarationNameSolidity();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(CloseBrace);
				}
				break;
			case EnumSolidity:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(EnumSolidity);
				setState(211);
				match(Identifier);
				setState(212);
				match(OpenBrace);
				setState(213);
				match(Identifier);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(214);
					match(Comma);
					setState(215);
					match(Identifier);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(CloseBrace);
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

	public static class VariableDeclarationListFunctionSolidityContext extends ParserRuleContext {
		public List<VariableDeclarationSolidityContext> variableDeclarationSolidity() {
			return getRuleContexts(VariableDeclarationSolidityContext.class);
		}
		public VariableDeclarationSolidityContext variableDeclarationSolidity(int i) {
			return getRuleContext(VariableDeclarationSolidityContext.class,i);
		}
		public VariableDeclarationListFunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationListFunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationListFunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationListFunctionSolidity(this);
		}
	}

	public final VariableDeclarationListFunctionSolidityContext variableDeclarationListFunctionSolidity() throws RecognitionException {
		VariableDeclarationListFunctionSolidityContext _localctx = new VariableDeclarationListFunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarationListFunctionSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			variableDeclarationSolidity();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(225);
				match(Comma);
				setState(226);
				variableDeclarationSolidity();
				}
				}
				setState(231);
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

	public static class VariableDeclarationNameFunctionSolidityContext extends ParserRuleContext {
		public TypeSolidityContext typeSolidity() {
			return getRuleContext(TypeSolidityContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public VariableDeclarationNameFunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationNameFunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationNameFunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationNameFunctionSolidity(this);
		}
	}

	public final VariableDeclarationNameFunctionSolidityContext variableDeclarationNameFunctionSolidity() throws RecognitionException {
		VariableDeclarationNameFunctionSolidityContext _localctx = new VariableDeclarationNameFunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarationNameFunctionSolidity);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case BoolSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				typeSolidity();
				setState(233);
				match(Identifier);
				}
				break;
			case MappingSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				mappingStatement();
				setState(236);
				match(Identifier);
				}
				break;
			case StructSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(StructSolidity);
				setState(239);
				match(Identifier);
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

	public static class VariableDeclarationNameSolidityContext extends ParserRuleContext {
		public TypeSolidityContext typeSolidity() {
			return getRuleContext(TypeSolidityContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public VariableDeclarationNameSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationNameSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationNameSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationNameSolidity(this);
		}
	}

	public final VariableDeclarationNameSolidityContext variableDeclarationNameSolidity() throws RecognitionException {
		VariableDeclarationNameSolidityContext _localctx = new VariableDeclarationNameSolidityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarationNameSolidity);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case BoolSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				typeSolidity();
				setState(243);
				match(Identifier);
				setState(244);
				match(SemiColon);
				}
				break;
			case MappingSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				mappingStatement();
				setState(247);
				match(Identifier);
				setState(248);
				match(SemiColon);
				}
				break;
			case StructSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(StructSolidity);
				setState(251);
				match(Identifier);
				setState(252);
				match(SemiColon);
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

	public static class VariableDeclarationSolidityContext extends ParserRuleContext {
		public TypeSolidityContext typeSolidity() {
			return getRuleContext(TypeSolidityContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public TerminalNode StructSolidity() { return getToken(SolidityParser.StructSolidity, 0); }
		public VariableDeclarationSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationSolidity(this);
		}
	}

	public final VariableDeclarationSolidityContext variableDeclarationSolidity() throws RecognitionException {
		VariableDeclarationSolidityContext _localctx = new VariableDeclarationSolidityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclarationSolidity);
		int _la;
		try {
			setState(267);
			switch (_input.LA(1)) {
			case BoolSolidity:
			case IntSolidity:
			case UIntSolidity:
			case FixedSolidity:
			case UfixedSolidity:
			case AddressSolidity:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				typeSolidity();
				setState(257);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(256);
					match(Identifier);
					}
				}

				}
				break;
			case MappingSolidity:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				mappingStatement();
				setState(261);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(260);
					match(Identifier);
					}
				}

				}
				break;
			case StructSolidity:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(StructSolidity);
				setState(265);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(264);
					match(Identifier);
					}
				}

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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			variableDeclaration();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(Comma);
					setState(271);
					variableDeclaration();
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Identifier);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(278);
				initialiser();
				}
				break;
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

	public static class InitialiserContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInitialiser(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Assign);
			setState(282);
			singleExpression(0);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(SolidityParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SemiColon);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expressionSequence();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(If);
			setState(289);
			match(OpenParen);
			setState(290);
			expressionSequence();
			setState(291);
			match(CloseParen);
			setState(292);
			statement();
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(293);
				match(Else);
				setState(294);
				statement();
				}
				break;
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

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoStatement(this);
		}
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Var() { return getToken(SolidityParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForVarStatement(this);
		}
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Var() { return getToken(SolidityParser.Var, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForVarInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForVarInStatement(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForInStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iterationStatement);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(Do);
				setState(298);
				statement();
				setState(299);
				match(While);
				setState(300);
				match(OpenParen);
				setState(301);
				expressionSequence();
				setState(302);
				match(CloseParen);
				setState(303);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(While);
				setState(306);
				match(OpenParen);
				setState(307);
				expressionSequence();
				setState(308);
				match(CloseParen);
				setState(309);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(For);
				setState(312);
				match(OpenParen);
				setState(314);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Void - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (Delete - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(313);
					expressionSequence();
					}
				}

				setState(316);
				match(SemiColon);
				setState(318);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Void - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (Delete - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(317);
					expressionSequence();
					}
				}

				setState(320);
				match(SemiColon);
				setState(322);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Void - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (Delete - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(321);
					expressionSequence();
					}
				}

				setState(324);
				match(CloseParen);
				setState(325);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(For);
				setState(327);
				match(OpenParen);
				setState(328);
				match(Var);
				setState(329);
				variableDeclarationList();
				setState(330);
				match(SemiColon);
				setState(332);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Void - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (Delete - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(331);
					expressionSequence();
					}
				}

				setState(334);
				match(SemiColon);
				setState(336);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Void - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (Delete - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					setState(335);
					expressionSequence();
					}
				}

				setState(338);
				match(CloseParen);
				setState(339);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(For);
				setState(342);
				match(OpenParen);
				setState(343);
				singleExpression(0);
				setState(344);
				match(In);
				setState(345);
				expressionSequence();
				setState(346);
				match(CloseParen);
				setState(347);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				match(For);
				setState(350);
				match(OpenParen);
				setState(351);
				match(Var);
				setState(352);
				variableDeclaration();
				setState(353);
				match(In);
				setState(354);
				expressionSequence();
				setState(355);
				match(CloseParen);
				setState(356);
				statement();
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(Continue);
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(361);
				match(Identifier);
				}
				break;
			}
			setState(364);
			eos();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Break);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(367);
				match(Identifier);
				}
				break;
			}
			setState(370);
			eos();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Return);
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(373);
				expressionSequence();
				}
				break;
			}
			setState(376);
			eos();
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

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(SolidityParser.With, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWithStatement(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(With);
			setState(379);
			match(OpenParen);
			setState(380);
			expressionSequence();
			setState(381);
			match(CloseParen);
			setState(382);
			statement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(SolidityParser.Switch, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(Switch);
			setState(385);
			match(OpenParen);
			setState(386);
			expressionSequence();
			setState(387);
			match(CloseParen);
			setState(388);
			caseBlock();
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

	public static class CaseBlockContext extends ParserRuleContext {
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCaseBlock(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(OpenBrace);
			setState(392);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(391);
				caseClauses();
				}
			}

			setState(398);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(394);
				defaultClause();
				setState(396);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(395);
					caseClauses();
					}
				}

				}
			}

			setState(400);
			match(CloseBrace);
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

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCaseClauses(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(402);
				caseClause();
				}
				}
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
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

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(SolidityParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(Case);
			setState(408);
			expressionSequence();
			setState(409);
			match(Colon);
			setState(411);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Return - 65)) | (1L << (Void - 65)) | (1L << (Continue - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (Debugger - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (With - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(410);
				statementList();
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

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(SolidityParser.Default, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDefaultClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDefaultClause(this);
		}
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(Default);
			setState(414);
			match(Colon);
			setState(416);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity) | (1L << EnumSolidity) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Break - 65)) | (1L << (Do - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Return - 65)) | (1L << (Void - 65)) | (1L << (Continue - 65)) | (1L << (For - 65)) | (1L << (Switch - 65)) | (1L << (While - 65)) | (1L << (Debugger - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (With - 65)) | (1L << (If - 65)) | (1L << (Throw - 65)) | (1L << (Delete - 65)) | (1L << (Try - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(415);
				statementList();
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

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelledStatement(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(Identifier);
			setState(419);
			match(Colon);
			setState(420);
			statement();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(SolidityParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(Throw);
			setState(423);
			expressionSequence();
			setState(424);
			eos();
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

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tryStatement);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(Try);
				setState(427);
				block();
				setState(428);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(Try);
				setState(431);
				block();
				setState(432);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(Try);
				setState(435);
				block();
				setState(436);
				catchProduction();
				setState(437);
				finallyProduction();
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

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchProduction(this);
		}
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Catch);
			setState(442);
			match(OpenParen);
			setState(443);
			match(Identifier);
			setState(444);
			match(CloseParen);
			setState(445);
			block();
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

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(SolidityParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFinallyProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFinallyProduction(this);
		}
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(Finally);
			setState(448);
			block();
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

	public static class DebuggerStatementContext extends ParserRuleContext {
		public TerminalNode Debugger() { return getToken(SolidityParser.Debugger, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debuggerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDebuggerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDebuggerStatement(this);
		}
	}

	public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
		DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_debuggerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Debugger);
			setState(451);
			eos();
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

	public static class ReturnfunctionSolidityContext extends ParserRuleContext {
		public TerminalNode ReturnsSolidity() { return getToken(SolidityParser.ReturnsSolidity, 0); }
		public VariableDeclarationListFunctionSolidityContext variableDeclarationListFunctionSolidity() {
			return getRuleContext(VariableDeclarationListFunctionSolidityContext.class,0);
		}
		public ReturnfunctionSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnfunctionSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnfunctionSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnfunctionSolidity(this);
		}
	}

	public final ReturnfunctionSolidityContext returnfunctionSolidity() throws RecognitionException {
		ReturnfunctionSolidityContext _localctx = new ReturnfunctionSolidityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnfunctionSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(ReturnsSolidity);
			setState(454);
			match(OpenParen);
			setState(456);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity))) != 0)) {
				{
				setState(455);
				variableDeclarationListFunctionSolidity();
				}
			}

			setState(458);
			match(CloseParen);
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

	public static class MappingStatementContext extends ParserRuleContext {
		public TerminalNode MappingSolidity() { return getToken(SolidityParser.MappingSolidity, 0); }
		public List<TypeSolidityContext> typeSolidity() {
			return getRuleContexts(TypeSolidityContext.class);
		}
		public TypeSolidityContext typeSolidity(int i) {
			return getRuleContext(TypeSolidityContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public MappingStatementContext mappingStatement() {
			return getRuleContext(MappingStatementContext.class,0);
		}
		public MappingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMappingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMappingStatement(this);
		}
	}

	public final MappingStatementContext mappingStatement() throws RecognitionException {
		MappingStatementContext _localctx = new MappingStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mappingStatement);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(MappingSolidity);
				setState(461);
				match(OpenParen);
				setState(462);
				typeSolidity();
				setState(463);
				match(T__0);
				setState(464);
				typeSolidity();
				setState(465);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(MappingSolidity);
				setState(468);
				match(OpenParen);
				setState(469);
				typeSolidity();
				setState(470);
				match(T__0);
				setState(471);
				match(Identifier);
				setState(472);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(MappingSolidity);
				setState(475);
				match(OpenParen);
				setState(476);
				typeSolidity();
				setState(477);
				match(T__0);
				setState(478);
				mappingStatement();
				setState(479);
				match(CloseParen);
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

	public static class TypeSolidityContext extends ParserRuleContext {
		public TerminalNode BoolSolidity() { return getToken(SolidityParser.BoolSolidity, 0); }
		public TerminalNode IntSolidity() { return getToken(SolidityParser.IntSolidity, 0); }
		public TerminalNode UIntSolidity() { return getToken(SolidityParser.UIntSolidity, 0); }
		public TerminalNode FixedSolidity() { return getToken(SolidityParser.FixedSolidity, 0); }
		public TerminalNode UfixedSolidity() { return getToken(SolidityParser.UfixedSolidity, 0); }
		public TerminalNode AddressSolidity() { return getToken(SolidityParser.AddressSolidity, 0); }
		public TypeSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeSolidity(this);
		}
	}

	public final TypeSolidityContext typeSolidity() throws RecognitionException {
		TypeSolidityContext _localctx = new TypeSolidityContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ModifierDeclarationContext extends ParserRuleContext {
		public TerminalNode ModifierSolidity() { return getToken(SolidityParser.ModifierSolidity, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListSolidityContext formalParameterListSolidity() {
			return getRuleContext(FormalParameterListSolidityContext.class,0);
		}
		public ModifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDeclaration(this);
		}
	}

	public final ModifierDeclarationContext modifierDeclaration() throws RecognitionException {
		ModifierDeclarationContext _localctx = new ModifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_modifierDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(ModifierSolidity);
			setState(486);
			match(Identifier);
			setState(487);
			match(OpenParen);
			setState(489);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity))) != 0)) {
				{
				setState(488);
				formalParameterListSolidity();
				}
			}

			setState(491);
			match(CloseParen);
			setState(492);
			match(OpenBrace);
			setState(493);
			functionBody();
			setState(494);
			match(Minus);
			setState(495);
			match(CloseBrace);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListSolidityContext formalParameterListSolidity() {
			return getRuleContext(FormalParameterListSolidityContext.class,0);
		}
		public ReturnfunctionSolidityContext returnfunctionSolidity() {
			return getRuleContext(ReturnfunctionSolidityContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(Function);
			setState(498);
			match(Identifier);
			setState(499);
			match(OpenParen);
			setState(501);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BoolSolidity) | (1L << IntSolidity) | (1L << UIntSolidity) | (1L << FixedSolidity) | (1L << UfixedSolidity) | (1L << AddressSolidity) | (1L << StructSolidity) | (1L << MappingSolidity))) != 0)) {
				{
				setState(500);
				formalParameterListSolidity();
				}
			}

			setState(503);
			match(CloseParen);
			setState(505);
			_la = _input.LA(1);
			if (_la==ReturnsSolidity) {
				{
				setState(504);
				returnfunctionSolidity();
				}
			}

			setState(507);
			match(OpenBrace);
			setState(508);
			functionBody();
			setState(509);
			match(CloseBrace);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SolidityParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SolidityParser.Identifier, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(Identifier);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(512);
				match(Comma);
				setState(513);
				match(Identifier);
				}
				}
				setState(518);
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

	public static class FormalParameterListSolidityContext extends ParserRuleContext {
		public List<VariableDeclarationNameFunctionSolidityContext> variableDeclarationNameFunctionSolidity() {
			return getRuleContexts(VariableDeclarationNameFunctionSolidityContext.class);
		}
		public VariableDeclarationNameFunctionSolidityContext variableDeclarationNameFunctionSolidity(int i) {
			return getRuleContext(VariableDeclarationNameFunctionSolidityContext.class,i);
		}
		public FormalParameterListSolidityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterListSolidity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFormalParameterListSolidity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFormalParameterListSolidity(this);
		}
	}

	public final FormalParameterListSolidityContext formalParameterListSolidity() throws RecognitionException {
		FormalParameterListSolidityContext _localctx = new FormalParameterListSolidityContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameterListSolidity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			variableDeclarationNameFunctionSolidity();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(520);
				match(Comma);
				setState(521);
				variableDeclarationNameFunctionSolidity();
				}
				}
				setState(526);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(527);
				sourceElements();
				}
				break;
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(OpenBracket);
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(531);
				elementList();
				}
				break;
			}
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(534);
				match(Comma);
				}
				break;
			}
			setState(538);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(537);
				elision();
				}
			}

			setState(540);
			match(CloseBracket);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(542);
				elision();
				}
			}

			setState(545);
			singleExpression(0);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(546);
					match(Comma);
					setState(548);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(547);
						elision();
						}
					}

					setState(550);
					singleExpression(0);
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class ElisionContext extends ParserRuleContext {
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElision(this);
		}
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(556);
				match(Comma);
				}
				}
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(OpenBrace);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(562);
				propertyNameAndValueList();
				}
				break;
			}
			setState(566);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(565);
				match(Comma);
				}
			}

			setState(568);
			match(CloseBrace);
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

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyNameAndValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyNameAndValueList(this);
		}
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			propertyAssignment();
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					match(Comma);
					setState(572);
					propertyAssignment();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyExpressionAssignment(this);
		}
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public PropertySetParameterListContext propertySetParameterList() {
			return getRuleContext(PropertySetParameterListContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertySetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertySetter(this);
		}
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyGetter(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_propertyAssignment);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				propertyName();
				setState(579);
				match(Colon);
				setState(580);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				getter();
				setState(583);
				match(OpenParen);
				setState(584);
				match(CloseParen);
				setState(585);
				match(OpenBrace);
				setState(586);
				functionBody();
				setState(587);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				setter();
				setState(590);
				match(OpenParen);
				setState(591);
				propertySetParameterList();
				setState(592);
				match(CloseParen);
				setState(593);
				match(OpenBrace);
				setState(594);
				functionBody();
				setState(595);
				match(CloseBrace);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertyName);
		try {
			setState(602);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				numericLiteral();
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

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPropertySetParameterList(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(Identifier);
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
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(OpenParen);
			setState(608);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (HexIntegerLiteral - 65)) | (1L << (OctalIntegerLiteral - 65)) | (1L << (Typeof - 65)) | (1L << (New - 65)) | (1L << (Void - 65)) | (1L << (Function - 65)) | (1L << (This - 65)) | (1L << (Delete - 65)) | (1L << (Identifier - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(607);
				argumentList();
				}
			}

			setState(610);
			match(CloseParen);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			singleExpression(0);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(613);
				match(Comma);
				setState(614);
				singleExpression(0);
				}
				}
				setState(619);
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			singleExpression(0);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					match(Comma);
					setState(622);
					singleExpression(0);
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTernaryExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPreIncrementExpression(this);
		}
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitObjectLiteralExpression(this);
		}
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNotExpression(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPreDecreaseExpression(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(SolidityParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThisExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPostDecreaseExpression(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(SolidityParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeofExpression(this);
		}
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(SolidityParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInstanceofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInstanceofExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDeleteExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEqualityExpression(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitXOrExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitShiftExpression(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitRelationalExpression(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPostIncrementExpression(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitNotExpression(this);
		}
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNewExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLiteralExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMemberDotExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitAndExpression(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBitOrExpression(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssignmentOperatorExpression(this);
		}
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(SolidityParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVoidExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVoidExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			switch (_input.LA(1)) {
			case Function:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(629);
				match(Function);
				setState(631);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(630);
					match(Identifier);
					}
				}

				setState(633);
				match(OpenParen);
				setState(635);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(634);
					formalParameterList();
					}
				}

				setState(637);
				match(CloseParen);
				setState(638);
				match(OpenBrace);
				setState(639);
				functionBody();
				setState(640);
				match(CloseBrace);
				}
				break;
			case New:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				match(New);
				setState(643);
				singleExpression(0);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(644);
					arguments();
					}
					break;
				}
				}
				break;
			case Delete:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(647);
				match(Delete);
				setState(648);
				singleExpression(30);
				}
				break;
			case Void:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(649);
				match(Void);
				setState(650);
				singleExpression(29);
				}
				break;
			case Typeof:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(651);
				match(Typeof);
				setState(652);
				singleExpression(28);
				}
				break;
			case PlusPlus:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(653);
				match(PlusPlus);
				setState(654);
				singleExpression(27);
				}
				break;
			case MinusMinus:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(655);
				match(MinusMinus);
				setState(656);
				singleExpression(26);
				}
				break;
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(657);
				match(Plus);
				setState(658);
				singleExpression(25);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(659);
				match(Minus);
				setState(660);
				singleExpression(24);
				}
				break;
			case BitNot:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(661);
				match(BitNot);
				setState(662);
				singleExpression(23);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(663);
				match(Not);
				setState(664);
				singleExpression(22);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(665);
				match(This);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(666);
				match(Identifier);
				}
				break;
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(667);
				literal();
				}
				break;
			case OpenBracket:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(668);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(669);
				objectLiteral();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(670);
				match(OpenParen);
				setState(671);
				expressionSequence();
				setState(672);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(741);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(676);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(677);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(678);
						singleExpression(22);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(679);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(680);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(681);
						singleExpression(21);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(682);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(683);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(684);
						singleExpression(20);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(685);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(686);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(687);
						singleExpression(19);
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(688);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(689);
						match(Instanceof);
						setState(690);
						singleExpression(18);
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(691);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(692);
						match(In);
						setState(693);
						singleExpression(17);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(694);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(695);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(696);
						singleExpression(16);
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(697);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(698);
						match(BitAnd);
						setState(699);
						singleExpression(15);
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(700);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(701);
						match(BitXOr);
						setState(702);
						singleExpression(14);
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(703);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(704);
						match(BitOr);
						setState(705);
						singleExpression(13);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(706);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(707);
						match(And);
						setState(708);
						singleExpression(12);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(709);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(710);
						match(Or);
						setState(711);
						singleExpression(11);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(712);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(713);
						match(QuestionMark);
						setState(714);
						singleExpression(0);
						setState(715);
						match(Colon);
						setState(716);
						singleExpression(10);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(718);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(719);
						match(OpenBracket);
						setState(720);
						expressionSequence();
						setState(721);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(723);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(724);
						match(Dot);
						setState(725);
						identifierName();
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(726);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(727);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(728);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(729);
						if (!(!this.here(LineTerminator))) throw new FailedPredicateException(this, "!this.here(LineTerminator)");
						setState(730);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(731);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(732);
						if (!(!this.here(LineTerminator))) throw new FailedPredicateException(this, "!this.here(LineTerminator)");
						setState(733);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(734);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(735);
						match(Assign);
						setState(736);
						expressionSequence();
						}
						break;
					case 20:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(737);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(738);
						assignmentOperator();
						setState(739);
						expressionSequence();
						}
						break;
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (MultiplyAssign - 54)) | (1L << (DivideAssign - 54)) | (1L << (ModulusAssign - 54)) | (1L << (PlusAssign - 54)) | (1L << (MinusAssign - 54)) | (1L << (LeftShiftArithmeticAssign - 54)) | (1L << (RightShiftArithmeticAssign - 54)) | (1L << (RightShiftLogicalAssign - 54)) | (1L << (BitAndAssign - 54)) | (1L << (BitXorAssign - 54)) | (1L << (BitOrAssign - 54)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(SolidityParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(SolidityParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal);
		int _la;
		try {
			setState(750);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				_la = _input.LA(1);
				if ( !(_la==RegularExpressionLiteral || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NullLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (StringLiteral - 65)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				numericLiteral();
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(SolidityParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(SolidityParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(SolidityParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (DecimalLiteral - 67)) | (1L << (HexIntegerLiteral - 67)) | (1L << (OctalIntegerLiteral - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierName);
		try {
			setState(756);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				match(Identifier);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				reservedWord();
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(SolidityParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_reservedWord);
		int _la;
		try {
			setState(761);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Debugger:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				keyword();
				}
				break;
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(SolidityParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(SolidityParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(SolidityParser.Case, 0); }
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public TerminalNode Var() { return getToken(SolidityParser.Var, 0); }
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(SolidityParser.Finally, 0); }
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public TerminalNode Void() { return getToken(SolidityParser.Void, 0); }
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Switch() { return getToken(SolidityParser.Switch, 0); }
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode Debugger() { return getToken(SolidityParser.Debugger, 0); }
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public TerminalNode This() { return getToken(SolidityParser.This, 0); }
		public TerminalNode With() { return getToken(SolidityParser.With, 0); }
		public TerminalNode Default() { return getToken(SolidityParser.Default, 0); }
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public TerminalNode Throw() { return getToken(SolidityParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public TerminalNode In() { return getToken(SolidityParser.In, 0); }
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Break - 70)) | (1L << (Do - 70)) | (1L << (Instanceof - 70)) | (1L << (Typeof - 70)) | (1L << (Case - 70)) | (1L << (Else - 70)) | (1L << (New - 70)) | (1L << (Var - 70)) | (1L << (Catch - 70)) | (1L << (Finally - 70)) | (1L << (Return - 70)) | (1L << (Void - 70)) | (1L << (Continue - 70)) | (1L << (For - 70)) | (1L << (Switch - 70)) | (1L << (While - 70)) | (1L << (Debugger - 70)) | (1L << (Function - 70)) | (1L << (This - 70)) | (1L << (With - 70)) | (1L << (Default - 70)) | (1L << (If - 70)) | (1L << (Throw - 70)) | (1L << (Delete - 70)) | (1L << (In - 70)) | (1L << (Try - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FutureReservedWordContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(SolidityParser.Class, 0); }
		public TerminalNode Enum() { return getToken(SolidityParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(SolidityParser.Extends, 0); }
		public TerminalNode Super() { return getToken(SolidityParser.Super, 0); }
		public TerminalNode Const() { return getToken(SolidityParser.Const, 0); }
		public TerminalNode Export() { return getToken(SolidityParser.Export, 0); }
		public TerminalNode Import() { return getToken(SolidityParser.Import, 0); }
		public TerminalNode Implements() { return getToken(SolidityParser.Implements, 0); }
		public TerminalNode Let() { return getToken(SolidityParser.Let, 0); }
		public TerminalNode Private() { return getToken(SolidityParser.Private, 0); }
		public TerminalNode Public() { return getToken(SolidityParser.Public, 0); }
		public TerminalNode Interface() { return getToken(SolidityParser.Interface, 0); }
		public TerminalNode Package() { return getToken(SolidityParser.Package, 0); }
		public TerminalNode Protected() { return getToken(SolidityParser.Protected, 0); }
		public TerminalNode Static() { return getToken(SolidityParser.Static, 0); }
		public TerminalNode Yield() { return getToken(SolidityParser.Yield, 0); }
		public FutureReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futureReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFutureReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFutureReservedWord(this);
		}
	}

	public final FutureReservedWordContext futureReservedWord() throws RecognitionException {
		FutureReservedWordContext _localctx = new FutureReservedWordContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_futureReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Class - 96)) | (1L << (Enum - 96)) | (1L << (Extends - 96)) | (1L << (Super - 96)) | (1L << (Const - 96)) | (1L << (Export - 96)) | (1L << (Import - 96)) | (1L << (Implements - 96)) | (1L << (Let - 96)) | (1L << (Private - 96)) | (1L << (Public - 96)) | (1L << (Interface - 96)) | (1L << (Package - 96)) | (1L << (Protected - 96)) | (1L << (Static - 96)) | (1L << (Yield - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			if (!(this._input.LT(1).getText().startsWith("get"))) throw new FailedPredicateException(this, "this._input.LT(1).getText().startsWith(\"get\")");
			setState(768);
			match(Identifier);
			setState(769);
			propertyName();
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

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			if (!(this._input.LT(1).getText().startsWith("set"))) throw new FailedPredicateException(this, "this._input.LT(1).getText().startsWith(\"set\")");
			setState(772);
			match(Identifier);
			setState(773);
			propertyName();
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

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(SolidityParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_eos);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(777);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(778);
				if (!(this._input.LT(1).getType() == SolidityParser.CloseBrace)) throw new FailedPredicateException(this, "this._input.LT(1).getType() == SolidityParser.CloseBrace");
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 63:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 64:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 65:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 36);
		case 14:
			return precpred(_ctx, 35);
		case 15:
			return precpred(_ctx, 34);
		case 16:
			return precpred(_ctx, 32);
		case 17:
			return !this.here(LineTerminator);
		case 18:
			return precpred(_ctx, 31);
		case 19:
			return !this.here(LineTerminator);
		case 20:
			return precpred(_ctx, 8);
		case 21:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return this._input.LT(1).getText().startsWith("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return this._input.LT(1).getText().startsWith("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return this.lineTerminatorAhead();
		case 25:
			return this._input.LT(1).getType() == SolidityParser.CloseBrace;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3w\u0312\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\5\2\u008a\n\2\3\2\3\2\3"+
		"\3\6\3\u008f\n\3\r\3\16\3\u0090\3\4\3\4\3\4\5\4\u0096\n\4\3\5\6\5\u0099"+
		"\n\5\r\5\16\5\u009a\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b2\n\7\3\b\3\b\5\b\u00b6\n\b"+
		"\3\b\3\b\3\t\6\t\u00bb\n\t\r\t\16\t\u00bc\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cf\n\13\f\13"+
		"\16\13\u00d2\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00db\n\13"+
		"\f\13\16\13\u00de\13\13\3\13\5\13\u00e1\n\13\3\f\3\f\3\f\7\f\u00e6\n\f"+
		"\f\f\16\f\u00e9\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f3\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0100\n\16\3\17"+
		"\3\17\5\17\u0104\n\17\3\17\3\17\5\17\u0108\n\17\3\17\3\17\5\17\u010c\n"+
		"\17\5\17\u010e\n\17\3\20\3\20\3\20\7\20\u0113\n\20\f\20\16\20\u0116\13"+
		"\20\3\21\3\21\5\21\u011a\n\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012a\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013d"+
		"\n\26\3\26\3\26\5\26\u0141\n\26\3\26\3\26\5\26\u0145\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u014f\n\26\3\26\3\26\5\26\u0153\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0169\n\26\3\27\3\27\5\27\u016d\n"+
		"\27\3\27\3\27\3\30\3\30\5\30\u0173\n\30\3\30\3\30\3\31\3\31\5\31\u0179"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\5\34\u018b\n\34\3\34\3\34\5\34\u018f\n\34\5\34\u0191\n"+
		"\34\3\34\3\34\3\35\6\35\u0196\n\35\r\35\16\35\u0197\3\36\3\36\3\36\3\36"+
		"\5\36\u019e\n\36\3\37\3\37\3\37\5\37\u01a3\n\37\3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ba\n\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\5&\u01cb\n&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u01e4\n\'\3(\3(\3)\3)\3)\3)\5)\u01ec\n)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\5*\u01f8\n*\3*\3*\5*\u01fc\n*\3*\3*\3*\3*\3+\3+\3+\7+\u0205"+
		"\n+\f+\16+\u0208\13+\3,\3,\3,\7,\u020d\n,\f,\16,\u0210\13,\3-\5-\u0213"+
		"\n-\3.\3.\5.\u0217\n.\3.\5.\u021a\n.\3.\5.\u021d\n.\3.\3.\3/\5/\u0222"+
		"\n/\3/\3/\3/\5/\u0227\n/\3/\7/\u022a\n/\f/\16/\u022d\13/\3\60\6\60\u0230"+
		"\n\60\r\60\16\60\u0231\3\61\3\61\5\61\u0236\n\61\3\61\5\61\u0239\n\61"+
		"\3\61\3\61\3\62\3\62\3\62\7\62\u0240\n\62\f\62\16\62\u0243\13\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u0258\n\63\3\64\3\64\3\64\5\64\u025d\n\64\3"+
		"\65\3\65\3\66\3\66\5\66\u0263\n\66\3\66\3\66\3\67\3\67\3\67\7\67\u026a"+
		"\n\67\f\67\16\67\u026d\13\67\38\38\38\78\u0272\n8\f8\168\u0275\138\39"+
		"\39\39\59\u027a\n9\39\39\59\u027e\n9\39\39\39\39\39\39\39\39\59\u0288"+
		"\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\59\u02a5\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\79\u02e8\n9\f9\169\u02eb\139\3:\3:\3;\3;\5;\u02f1\n;\3"+
		"<\3<\3=\3=\5=\u02f7\n=\3>\3>\3>\5>\u02fc\n>\3?\3?\3@\3@\3A\3A\3A\3A\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\5C\u030e\nC\3D\3D\3D\2\3pE\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\2\16\3\2\6\13\3\2%\'\3\2!\"\3\2(*\3\2"+
		"+.\3\2/\62\3\28B\5\2\21\21CDss\3\2EG\3\2CD\3\2Ha\3\2bq\u0352\2\u0089\3"+
		"\2\2\2\4\u008e\3\2\2\2\6\u0095\3\2\2\2\b\u0098\3\2\2\2\n\u009c\3\2\2\2"+
		"\f\u00b1\3\2\2\2\16\u00b3\3\2\2\2\20\u00ba\3\2\2\2\22\u00be\3\2\2\2\24"+
		"\u00e0\3\2\2\2\26\u00e2\3\2\2\2\30\u00f2\3\2\2\2\32\u00ff\3\2\2\2\34\u010d"+
		"\3\2\2\2\36\u010f\3\2\2\2 \u0117\3\2\2\2\"\u011b\3\2\2\2$\u011e\3\2\2"+
		"\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u0168\3\2\2\2,\u016a\3\2\2\2.\u0170"+
		"\3\2\2\2\60\u0176\3\2\2\2\62\u017c\3\2\2\2\64\u0182\3\2\2\2\66\u0188\3"+
		"\2\2\28\u0195\3\2\2\2:\u0199\3\2\2\2<\u019f\3\2\2\2>\u01a4\3\2\2\2@\u01a8"+
		"\3\2\2\2B\u01b9\3\2\2\2D\u01bb\3\2\2\2F\u01c1\3\2\2\2H\u01c4\3\2\2\2J"+
		"\u01c7\3\2\2\2L\u01e3\3\2\2\2N\u01e5\3\2\2\2P\u01e7\3\2\2\2R\u01f3\3\2"+
		"\2\2T\u0201\3\2\2\2V\u0209\3\2\2\2X\u0212\3\2\2\2Z\u0214\3\2\2\2\\\u0221"+
		"\3\2\2\2^\u022f\3\2\2\2`\u0233\3\2\2\2b\u023c\3\2\2\2d\u0257\3\2\2\2f"+
		"\u025c\3\2\2\2h\u025e\3\2\2\2j\u0260\3\2\2\2l\u0266\3\2\2\2n\u026e\3\2"+
		"\2\2p\u02a4\3\2\2\2r\u02ec\3\2\2\2t\u02f0\3\2\2\2v\u02f2\3\2\2\2x\u02f6"+
		"\3\2\2\2z\u02fb\3\2\2\2|\u02fd\3\2\2\2~\u02ff\3\2\2\2\u0080\u0301\3\2"+
		"\2\2\u0082\u0305\3\2\2\2\u0084\u030d\3\2\2\2\u0086\u030f\3\2\2\2\u0088"+
		"\u008a\5\b\5\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\7\2\2\3\u008c\3\3\2\2\2\u008d\u008f\5\6\4\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\5\3\2\2\2\u0092\u0096\5\f\7\2\u0093\u0096\5P)\2\u0094\u0096\5R*\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\7\3\2\2\2"+
		"\u0097\u0099\5\n\6\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\t\3\2\2\2\u009c\u009d\7\4\2\2\u009d"+
		"\u009e\7r\2\2\u009e\u009f\7\27\2\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\7\30"+
		"\2\2\u00a1\13\3\2\2\2\u00a2\u00b2\5\16\b\2\u00a3\u00b2\5\24\13\2\u00a4"+
		"\u00b2\5$\23\2\u00a5\u00b2\5&\24\2\u00a6\u00b2\5(\25\2\u00a7\u00b2\5*"+
		"\26\2\u00a8\u00b2\5,\27\2\u00a9\u00b2\5.\30\2\u00aa\u00b2\5\60\31\2\u00ab"+
		"\u00b2\5\62\32\2\u00ac\u00b2\5> \2\u00ad\u00b2\5\64\33\2\u00ae\u00b2\5"+
		"@!\2\u00af\u00b2\5B\"\2\u00b0\u00b2\5H%\2\u00b1\u00a2\3\2\2\2\u00b1\u00a3"+
		"\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1"+
		"\u00a7\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2"+
		"\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\r\3\2\2\2"+
		"\u00b3\u00b5\7\27\2\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\30\2\2\u00b8\17\3\2\2\2\u00b9"+
		"\u00bb\5\f\7\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bf\7O\2\2\u00bf\u00c0"+
		"\5\36\20\2\u00c0\u00c1\5\u0084C\2\u00c1\23\3\2\2\2\u00c2\u00c3\5N(\2\u00c3"+
		"\u00c4\5 \21\2\u00c4\u00c5\5\u0084C\2\u00c5\u00e1\3\2\2\2\u00c6\u00c7"+
		"\5L\'\2\u00c7\u00c8\5 \21\2\u00c8\u00c9\5\u0084C\2\u00c9\u00e1\3\2\2\2"+
		"\u00ca\u00cb\7\r\2\2\u00cb\u00cc\7r\2\2\u00cc\u00d0\7\27\2\2\u00cd\u00cf"+
		"\5\32\16\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2"+
		"\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00e1"+
		"\7\30\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7\27\2\2"+
		"\u00d7\u00dc\7r\2\2\u00d8\u00d9\7\32\2\2\u00d9\u00db\7r\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\7\30\2\2\u00e0\u00c2\3"+
		"\2\2\2\u00e0\u00c6\3\2\2\2\u00e0\u00ca\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e1"+
		"\25\3\2\2\2\u00e2\u00e7\5\34\17\2\u00e3\u00e4\7\32\2\2\u00e4\u00e6\5\34"+
		"\17\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\27\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5N(\2"+
		"\u00eb\u00ec\7r\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\5L\'\2\u00ee\u00ef"+
		"\7r\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1\u00f3\7r\2\2\u00f2"+
		"\u00ea\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\31\3\2\2"+
		"\2\u00f4\u00f5\5N(\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7\31\2\2\u00f7\u0100"+
		"\3\2\2\2\u00f8\u00f9\5L\'\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7\31\2\2\u00fb"+
		"\u0100\3\2\2\2\u00fc\u00fd\7\r\2\2\u00fd\u00fe\7r\2\2\u00fe\u0100\7\31"+
		"\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100"+
		"\33\3\2\2\2\u0101\u0103\5N(\2\u0102\u0104\7r\2\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u010e\3\2\2\2\u0105\u0107\5L\'\2\u0106\u0108\7r\2"+
		"\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010b"+
		"\7\r\2\2\u010a\u010c\7r\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010e\35\3\2\2\2\u010f\u0114\5 \21\2\u0110\u0111\7\32\2\2\u0111\u0113"+
		"\5 \21\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\37\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7r\2\2"+
		"\u0118\u011a\5\"\22\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a!\3"+
		"\2\2\2\u011b\u011c\7\33\2\2\u011c\u011d\5p9\2\u011d#\3\2\2\2\u011e\u011f"+
		"\7\31\2\2\u011f%\3\2\2\2\u0120\u0121\5n8\2\u0121\'\3\2\2\2\u0122\u0123"+
		"\7]\2\2\u0123\u0124\7\25\2\2\u0124\u0125\5n8\2\u0125\u0126\7\26\2\2\u0126"+
		"\u0129\5\f\7\2\u0127\u0128\7M\2\2\u0128\u012a\5\f\7\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a)\3\2\2\2\u012b\u012c\7I\2\2\u012c\u012d"+
		"\5\f\7\2\u012d\u012e\7W\2\2\u012e\u012f\7\25\2\2\u012f\u0130\5n8\2\u0130"+
		"\u0131\7\26\2\2\u0131\u0132\5\u0084C\2\u0132\u0169\3\2\2\2\u0133\u0134"+
		"\7W\2\2\u0134\u0135\7\25\2\2\u0135\u0136\5n8\2\u0136\u0137\7\26\2\2\u0137"+
		"\u0138\5\f\7\2\u0138\u0169\3\2\2\2\u0139\u013a\7U\2\2\u013a\u013c\7\25"+
		"\2\2\u013b\u013d\5n8\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u0140\7\31\2\2\u013f\u0141\5n8\2\u0140\u013f\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\7\31\2\2\u0143\u0145\5"+
		"n8\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\7\26\2\2\u0147\u0169\5\f\7\2\u0148\u0149\7U\2\2\u0149\u014a\7\25"+
		"\2\2\u014a\u014b\7O\2\2\u014b\u014c\5\36\20\2\u014c\u014e\7\31\2\2\u014d"+
		"\u014f\5n8\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2"+
		"\2\u0150\u0152\7\31\2\2\u0151\u0153\5n8\2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\26\2\2\u0155\u0156\5\f\7\2"+
		"\u0156\u0169\3\2\2\2\u0157\u0158\7U\2\2\u0158\u0159\7\25\2\2\u0159\u015a"+
		"\5p9\2\u015a\u015b\7`\2\2\u015b\u015c\5n8\2\u015c\u015d\7\26\2\2\u015d"+
		"\u015e\5\f\7\2\u015e\u0169\3\2\2\2\u015f\u0160\7U\2\2\u0160\u0161\7\25"+
		"\2\2\u0161\u0162\7O\2\2\u0162\u0163\5 \21\2\u0163\u0164\7`\2\2\u0164\u0165"+
		"\5n8\2\u0165\u0166\7\26\2\2\u0166\u0167\5\f\7\2\u0167\u0169\3\2\2\2\u0168"+
		"\u012b\3\2\2\2\u0168\u0133\3\2\2\2\u0168\u0139\3\2\2\2\u0168\u0148\3\2"+
		"\2\2\u0168\u0157\3\2\2\2\u0168\u015f\3\2\2\2\u0169+\3\2\2\2\u016a\u016c"+
		"\7T\2\2\u016b\u016d\7r\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\5\u0084C\2\u016f-\3\2\2\2\u0170\u0172\7H\2"+
		"\2\u0171\u0173\7r\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0175\5\u0084C\2\u0175/\3\2\2\2\u0176\u0178\7R\2\2\u0177"+
		"\u0179\5n8\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u017b\5\u0084C\2\u017b\61\3\2\2\2\u017c\u017d\7[\2\2\u017d\u017e"+
		"\7\25\2\2\u017e\u017f\5n8\2\u017f\u0180\7\26\2\2\u0180\u0181\5\f\7\2\u0181"+
		"\63\3\2\2\2\u0182\u0183\7V\2\2\u0183\u0184\7\25\2\2\u0184\u0185\5n8\2"+
		"\u0185\u0186\7\26\2\2\u0186\u0187\5\66\34\2\u0187\65\3\2\2\2\u0188\u018a"+
		"\7\27\2\2\u0189\u018b\58\35\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2"+
		"\u018b\u0190\3\2\2\2\u018c\u018e\5<\37\2\u018d\u018f\58\35\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\30\2\2\u0193\67\3\2\2"+
		"\2\u0194\u0196\5:\36\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u01989\3\2\2\2\u0199\u019a\7L\2\2\u019a\u019b"+
		"\5n8\2\u019b\u019d\7\35\2\2\u019c\u019e\5\20\t\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e;\3\2\2\2\u019f\u01a0\7\\\2\2\u01a0\u01a2\7\35\2\2"+
		"\u01a1\u01a3\5\20\t\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3=\3"+
		"\2\2\2\u01a4\u01a5\7r\2\2\u01a5\u01a6\7\35\2\2\u01a6\u01a7\5\f\7\2\u01a7"+
		"?\3\2\2\2\u01a8\u01a9\7^\2\2\u01a9\u01aa\5n8\2\u01aa\u01ab\5\u0084C\2"+
		"\u01abA\3\2\2\2\u01ac\u01ad\7a\2\2\u01ad\u01ae\5\16\b\2\u01ae\u01af\5"+
		"D#\2\u01af\u01ba\3\2\2\2\u01b0\u01b1\7a\2\2\u01b1\u01b2\5\16\b\2\u01b2"+
		"\u01b3\5F$\2\u01b3\u01ba\3\2\2\2\u01b4\u01b5\7a\2\2\u01b5\u01b6\5\16\b"+
		"\2\u01b6\u01b7\5D#\2\u01b7\u01b8\5F$\2\u01b8\u01ba\3\2\2\2\u01b9\u01ac"+
		"\3\2\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b4\3\2\2\2\u01baC\3\2\2\2\u01bb"+
		"\u01bc\7P\2\2\u01bc\u01bd\7\25\2\2\u01bd\u01be\7r\2\2\u01be\u01bf\7\26"+
		"\2\2\u01bf\u01c0\5\16\b\2\u01c0E\3\2\2\2\u01c1\u01c2\7Q\2\2\u01c2\u01c3"+
		"\5\16\b\2\u01c3G\3\2\2\2\u01c4\u01c5\7X\2\2\u01c5\u01c6\5\u0084C\2\u01c6"+
		"I\3\2\2\2\u01c7\u01c8\7\5\2\2\u01c8\u01ca\7\25\2\2\u01c9\u01cb\5\26\f"+
		"\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd"+
		"\7\26\2\2\u01cdK\3\2\2\2\u01ce\u01cf\7\16\2\2\u01cf\u01d0\7\25\2\2\u01d0"+
		"\u01d1\5N(\2\u01d1\u01d2\7\3\2\2\u01d2\u01d3\5N(\2\u01d3\u01d4\7\26\2"+
		"\2\u01d4\u01e4\3\2\2\2\u01d5\u01d6\7\16\2\2\u01d6\u01d7\7\25\2\2\u01d7"+
		"\u01d8\5N(\2\u01d8\u01d9\7\3\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7\26\2"+
		"\2\u01db\u01e4\3\2\2\2\u01dc\u01dd\7\16\2\2\u01dd\u01de\7\25\2\2\u01de"+
		"\u01df\5N(\2\u01df\u01e0\7\3\2\2\u01e0\u01e1\5L\'\2\u01e1\u01e2\7\26\2"+
		"\2\u01e2\u01e4\3\2\2\2\u01e3\u01ce\3\2\2\2\u01e3\u01d5\3\2\2\2\u01e3\u01dc"+
		"\3\2\2\2\u01e4M\3\2\2\2\u01e5\u01e6\t\2\2\2\u01e6O\3\2\2\2\u01e7\u01e8"+
		"\7\20\2\2\u01e8\u01e9\7r\2\2\u01e9\u01eb\7\25\2\2\u01ea\u01ec\5V,\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\26"+
		"\2\2\u01ee\u01ef\7\27\2\2\u01ef\u01f0\5X-\2\u01f0\u01f1\7\"\2\2\u01f1"+
		"\u01f2\7\30\2\2\u01f2Q\3\2\2\2\u01f3\u01f4\7Y\2\2\u01f4\u01f5\7r\2\2\u01f5"+
		"\u01f7\7\25\2\2\u01f6\u01f8\5V,\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\7\26\2\2\u01fa\u01fc\5J&\2\u01fb"+
		"\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7\27"+
		"\2\2\u01fe\u01ff\5X-\2\u01ff\u0200\7\30\2\2\u0200S\3\2\2\2\u0201\u0206"+
		"\7r\2\2\u0202\u0203\7\32\2\2\u0203\u0205\7r\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207U\3\2\2\2"+
		"\u0208\u0206\3\2\2\2\u0209\u020e\5\30\r\2\u020a\u020b\7\32\2\2\u020b\u020d"+
		"\5\30\r\2\u020c\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2"+
		"\u020e\u020f\3\2\2\2\u020fW\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\5"+
		"\4\3\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213Y\3\2\2\2\u0214\u0216"+
		"\7\23\2\2\u0215\u0217\5\\/\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0219\3\2\2\2\u0218\u021a\7\32\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3"+
		"\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5^\60\2\u021c\u021b\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\7\24\2\2\u021f[\3\2\2\2"+
		"\u0220\u0222\5^\60\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u022b\5p9\2\u0224\u0226\7\32\2\2\u0225\u0227\5^\60\2\u0226"+
		"\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\5p"+
		"9\2\u0229\u0224\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c]\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\7\32\2\2"+
		"\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232_\3\2\2\2\u0233\u0235\7\27\2\2\u0234\u0236\5b\62\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\7\32"+
		"\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\7\30\2\2\u023ba\3\2\2\2\u023c\u0241\5d\63\2\u023d\u023e\7\32\2"+
		"\2\u023e\u0240\5d\63\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242c\3\2\2\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0245\5f\64\2\u0245\u0246\7\35\2\2\u0246\u0247\5p9\2\u0247\u0258\3\2"+
		"\2\2\u0248\u0249\5\u0080A\2\u0249\u024a\7\25\2\2\u024a\u024b\7\26\2\2"+
		"\u024b\u024c\7\27\2\2\u024c\u024d\5X-\2\u024d\u024e\7\30\2\2\u024e\u0258"+
		"\3\2\2\2\u024f\u0250\5\u0082B\2\u0250\u0251\7\25\2\2\u0251\u0252\5h\65"+
		"\2\u0252\u0253\7\26\2\2\u0253\u0254\7\27\2\2\u0254\u0255\5X-\2\u0255\u0256"+
		"\7\30\2\2\u0256\u0258\3\2\2\2\u0257\u0244\3\2\2\2\u0257\u0248\3\2\2\2"+
		"\u0257\u024f\3\2\2\2\u0258e\3\2\2\2\u0259\u025d\5x=\2\u025a\u025d\7s\2"+
		"\2\u025b\u025d\5v<\2\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b"+
		"\3\2\2\2\u025dg\3\2\2\2\u025e\u025f\7r\2\2\u025fi\3\2\2\2\u0260\u0262"+
		"\7\25\2\2\u0261\u0263\5l\67\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2"+
		"\u0263\u0264\3\2\2\2\u0264\u0265\7\26\2\2\u0265k\3\2\2\2\u0266\u026b\5"+
		"p9\2\u0267\u0268\7\32\2\2\u0268\u026a\5p9\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cm\3\2\2\2"+
		"\u026d\u026b\3\2\2\2\u026e\u0273\5p9\2\u026f\u0270\7\32\2\2\u0270\u0272"+
		"\5p9\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274o\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\b9\1\2\u0277"+
		"\u0279\7Y\2\2\u0278\u027a\7r\2\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2"+
		"\2\u027a\u027b\3\2\2\2\u027b\u027d\7\25\2\2\u027c\u027e\5T+\2\u027d\u027c"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\7\26\2\2"+
		"\u0280\u0281\7\27\2\2\u0281\u0282\5X-\2\u0282\u0283\7\30\2\2\u0283\u02a5"+
		"\3\2\2\2\u0284\u0285\7N\2\2\u0285\u0287\5p9\2\u0286\u0288\5j\66\2\u0287"+
		"\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u02a5\3\2\2\2\u0289\u028a\7_"+
		"\2\2\u028a\u02a5\5p9 \u028b\u028c\7S\2\2\u028c\u02a5\5p9\37\u028d\u028e"+
		"\7K\2\2\u028e\u02a5\5p9\36\u028f\u0290\7\37\2\2\u0290\u02a5\5p9\35\u0291"+
		"\u0292\7 \2\2\u0292\u02a5\5p9\34\u0293\u0294\7!\2\2\u0294\u02a5\5p9\33"+
		"\u0295\u0296\7\"\2\2\u0296\u02a5\5p9\32\u0297\u0298\7#\2\2\u0298\u02a5"+
		"\5p9\31\u0299\u029a\7$\2\2\u029a\u02a5\5p9\30\u029b\u02a5\7Z\2\2\u029c"+
		"\u02a5\7r\2\2\u029d\u02a5\5t;\2\u029e\u02a5\5Z.\2\u029f\u02a5\5`\61\2"+
		"\u02a0\u02a1\7\25\2\2\u02a1\u02a2\5n8\2\u02a2\u02a3\7\26\2\2\u02a3\u02a5"+
		"\3\2\2\2\u02a4\u0276\3\2\2\2\u02a4\u0284\3\2\2\2\u02a4\u0289\3\2\2\2\u02a4"+
		"\u028b\3\2\2\2\u02a4\u028d\3\2\2\2\u02a4\u028f\3\2\2\2\u02a4\u0291\3\2"+
		"\2\2\u02a4\u0293\3\2\2\2\u02a4\u0295\3\2\2\2\u02a4\u0297\3\2\2\2\u02a4"+
		"\u0299\3\2\2\2\u02a4\u029b\3\2\2\2\u02a4\u029c\3\2\2\2\u02a4\u029d\3\2"+
		"\2\2\u02a4\u029e\3\2\2\2\u02a4\u029f\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a5"+
		"\u02e9\3\2\2\2\u02a6\u02a7\f\27\2\2\u02a7\u02a8\t\3\2\2\u02a8\u02e8\5"+
		"p9\30\u02a9\u02aa\f\26\2\2\u02aa\u02ab\t\4\2\2\u02ab\u02e8\5p9\27\u02ac"+
		"\u02ad\f\25\2\2\u02ad\u02ae\t\5\2\2\u02ae\u02e8\5p9\26\u02af\u02b0\f\24"+
		"\2\2\u02b0\u02b1\t\6\2\2\u02b1\u02e8\5p9\25\u02b2\u02b3\f\23\2\2\u02b3"+
		"\u02b4\7J\2\2\u02b4\u02e8\5p9\24\u02b5\u02b6\f\22\2\2\u02b6\u02b7\7`\2"+
		"\2\u02b7\u02e8\5p9\23\u02b8\u02b9\f\21\2\2\u02b9\u02ba\t\7\2\2\u02ba\u02e8"+
		"\5p9\22\u02bb\u02bc\f\20\2\2\u02bc\u02bd\7\63\2\2\u02bd\u02e8\5p9\21\u02be"+
		"\u02bf\f\17\2\2\u02bf\u02c0\7\64\2\2\u02c0\u02e8\5p9\20\u02c1\u02c2\f"+
		"\16\2\2\u02c2\u02c3\7\65\2\2\u02c3\u02e8\5p9\17\u02c4\u02c5\f\r\2\2\u02c5"+
		"\u02c6\7\66\2\2\u02c6\u02e8\5p9\16\u02c7\u02c8\f\f\2\2\u02c8\u02c9\7\67"+
		"\2\2\u02c9\u02e8\5p9\r\u02ca\u02cb\f\13\2\2\u02cb\u02cc\7\34\2\2\u02cc"+
		"\u02cd\5p9\2\u02cd\u02ce\7\35\2\2\u02ce\u02cf\5p9\f\u02cf\u02e8\3\2\2"+
		"\2\u02d0\u02d1\f&\2\2\u02d1\u02d2\7\23\2\2\u02d2\u02d3\5n8\2\u02d3\u02d4"+
		"\7\24\2\2\u02d4\u02e8\3\2\2\2\u02d5\u02d6\f%\2\2\u02d6\u02d7\7\36\2\2"+
		"\u02d7\u02e8\5x=\2\u02d8\u02d9\f$\2\2\u02d9\u02e8\5j\66\2\u02da\u02db"+
		"\f\"\2\2\u02db\u02dc\69\23\2\u02dc\u02e8\7\37\2\2\u02dd\u02de\f!\2\2\u02de"+
		"\u02df\69\25\2\u02df\u02e8\7 \2\2\u02e0\u02e1\f\n\2\2\u02e1\u02e2\7\33"+
		"\2\2\u02e2\u02e8\5n8\2\u02e3\u02e4\f\t\2\2\u02e4\u02e5\5r:\2\u02e5\u02e6"+
		"\5n8\2\u02e6\u02e8\3\2\2\2\u02e7\u02a6\3\2\2\2\u02e7\u02a9\3\2\2\2\u02e7"+
		"\u02ac\3\2\2\2\u02e7\u02af\3\2\2\2\u02e7\u02b2\3\2\2\2\u02e7\u02b5\3\2"+
		"\2\2\u02e7\u02b8\3\2\2\2\u02e7\u02bb\3\2\2\2\u02e7\u02be\3\2\2\2\u02e7"+
		"\u02c1\3\2\2\2\u02e7\u02c4\3\2\2\2\u02e7\u02c7\3\2\2\2\u02e7\u02ca\3\2"+
		"\2\2\u02e7\u02d0\3\2\2\2\u02e7\u02d5\3\2\2\2\u02e7\u02d8\3\2\2\2\u02e7"+
		"\u02da\3\2\2\2\u02e7\u02dd\3\2\2\2\u02e7\u02e0\3\2\2\2\u02e7\u02e3\3\2"+
		"\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"q\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\t\b\2\2\u02eds\3\2\2\2\u02ee"+
		"\u02f1\t\t\2\2\u02ef\u02f1\5v<\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2\2"+
		"\2\u02f1u\3\2\2\2\u02f2\u02f3\t\n\2\2\u02f3w\3\2\2\2\u02f4\u02f7\7r\2"+
		"\2\u02f5\u02f7\5z>\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7y\3"+
		"\2\2\2\u02f8\u02fc\5|?\2\u02f9\u02fc\5~@\2\u02fa\u02fc\t\13\2\2\u02fb"+
		"\u02f8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc{\3\2\2\2"+
		"\u02fd\u02fe\t\f\2\2\u02fe}\3\2\2\2\u02ff\u0300\t\r\2\2\u0300\177\3\2"+
		"\2\2\u0301\u0302\6A\30\2\u0302\u0303\7r\2\2\u0303\u0304\5f\64\2\u0304"+
		"\u0081\3\2\2\2\u0305\u0306\6B\31\2\u0306\u0307\7r\2\2\u0307\u0308\5f\64"+
		"\2\u0308\u0083\3\2\2\2\u0309\u030e\7\31\2\2\u030a\u030e\7\2\2\3\u030b"+
		"\u030e\6C\32\2\u030c\u030e\6C\33\2\u030d\u0309\3\2\2\2\u030d\u030a\3\2"+
		"\2\2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030e\u0085\3\2\2\2\u030f"+
		"\u0310\7\2\2\3\u0310\u0087\3\2\2\2G\u0089\u0090\u0095\u009a\u00b1\u00b5"+
		"\u00bc\u00d0\u00dc\u00e0\u00e7\u00f2\u00ff\u0103\u0107\u010b\u010d\u0114"+
		"\u0119\u0129\u013c\u0140\u0144\u014e\u0152\u0168\u016c\u0172\u0178\u018a"+
		"\u018e\u0190\u0197\u019d\u01a2\u01b9\u01ca\u01e3\u01eb\u01f7\u01fb\u0206"+
		"\u020e\u0212\u0216\u0219\u021c\u0221\u0226\u022b\u0231\u0235\u0238\u0241"+
		"\u0257\u025c\u0262\u026b\u0273\u0279\u027d\u0287\u02a4\u02e7\u02e9\u02f0"+
		"\u02f6\u02fb\u030d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}