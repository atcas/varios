// Generated from Codex.g4 by ANTLR 4.5.3
// jshint ignore: start
var antlr4 = require('antlr4/index');
var CodexListener = require('./CodexListener').CodexListener;
var grammarFileName = "Codex.g4";

var serializedATN = ["\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\u0003\u001cJ\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0003\u0002\u0003\u0002\u0006\u0002\u0017",
    "\n\u0002\r\u0002\u000e\u0002\u0018\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003",
    ")\n\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004",
    "/\n\u0004\f\u0004\u000e\u00042\u000b\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\t\u0003\t\u0003",
    "\t\u0005\tF\n\t\u0003\n\u0003\n\u0003\n\u0002\u0002\u000b\u0002\u0004",
    "\u0006\b\n\f\u000e\u0010\u0012\u0002\u0002E\u0002\u0014\u0003\u0002",
    "\u0002\u0002\u0004(\u0003\u0002\u0002\u0002\u0006*\u0003\u0002\u0002",
    "\u0002\b5\u0003\u0002\u0002\u0002\n7\u0003\u0002\u0002\u0002\f9\u0003",
    "\u0002\u0002\u0002\u000e;\u0003\u0002\u0002\u0002\u0010B\u0003\u0002",
    "\u0002\u0002\u0012G\u0003\u0002\u0002\u0002\u0014\u0016\u0005\u0004",
    "\u0003\u0002\u0015\u0017\u0005\b\u0005\u0002\u0016\u0015\u0003\u0002",
    "\u0002\u0002\u0017\u0018\u0003\u0002\u0002\u0002\u0018\u0016\u0003\u0002",
    "\u0002\u0002\u0018\u0019\u0003\u0002\u0002\u0002\u0019\u0003\u0003\u0002",
    "\u0002\u0002\u001a\u001b\u0007\u000b\u0002\u0002\u001b\u001c\u0005\u0012",
    "\n\u0002\u001c\u001d\u0007\u0003\u0002\u0002\u001d)\u0003\u0002\u0002",
    "\u0002\u001e\u001f\u0007\r\u0002\u0002\u001f \u0007\u000e\u0002\u0002",
    " !\u0005\u0006\u0004\u0002!\"\u0007\u0003\u0002\u0002\")\u0003\u0002",
    "\u0002\u0002#$\u0007\f\u0002\u0002$%\u0007\u000e\u0002\u0002%&\u0005",
    "\u0006\u0004\u0002&\'\u0007\u0003\u0002\u0002\')\u0003\u0002\u0002\u0002",
    "(\u001a\u0003\u0002\u0002\u0002(\u001e\u0003\u0002\u0002\u0002(#\u0003",
    "\u0002\u0002\u0002)\u0005\u0003\u0002\u0002\u0002*+\u0007\u0004\u0002",
    "\u0002+0\u0005\u0012\n\u0002,-\u0007\u0005\u0002\u0002-/\u0005\u0012",
    "\n\u0002.,\u0003\u0002\u0002\u0002/2\u0003\u0002\u0002\u00020.\u0003",
    "\u0002\u0002\u000201\u0003\u0002\u0002\u000213\u0003\u0002\u0002\u0002",
    "20\u0003\u0002\u0002\u000234\u0007\u0006\u0002\u00024\u0007\u0003\u0002",
    "\u0002\u000256\u0005\n\u0006\u00026\t\u0003\u0002\u0002\u000278\u0005",
    "\u0010\t\u00028\u000b\u0003\u0002\u0002\u00029:\u0005\u000e\b\u0002",
    ":\r\u0003\u0002\u0002\u0002;<\u0007\u0014\u0002\u0002<=\u0007\u0007",
    "\u0002\u0002=>\u0007\b\u0002\u0002>?\u0007\t\u0002\u0002?@\u0007\u0019",
    "\u0002\u0002@A\u0007\n\u0002\u0002A\u000f\u0003\u0002\u0002\u0002BC",
    "\u0007\u000f\u0002\u0002CE\u0007\u0019\u0002\u0002DF\u0005\f\u0007\u0002",
    "ED\u0003\u0002\u0002\u0002EF\u0003\u0002\u0002\u0002F\u0011\u0003\u0002",
    "\u0002\u0002GH\u0007\u0018\u0002\u0002H\u0013\u0003\u0002\u0002\u0002",
    "\u0006\u0018(0E"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "':'", "'['", "','", "']'", "'('", "'t'", "'+'", 
                     "')'", "'with'", "'between'", "'for'", "'roll'", "'pay'", 
                     "'take'", "'switch'", "'msg'", "'exit'", "'on'", "'every'", 
                     "'start'", "'stop'" ];

var symbolicNames = [ null, null, null, null, null, null, null, null, null, 
                      "WithMember", "BetweenMember", "ForMember", "RollMember", 
                      "Pay", "Take", "Switch", "Msg", "Exit", "On", "Every", 
                      "Start", "Stop", "HEXA", "INT", "WS", "SL_COMMENT", 
                      "MultiLineComment" ];

var ruleNames =  [ "file", "mainRoll", "subjectList", "stat", "statConsequential", 
                   "statTemporal", "statOn", "statPay", "subject" ];

function CodexParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

CodexParser.prototype = Object.create(antlr4.Parser.prototype);
CodexParser.prototype.constructor = CodexParser;

Object.defineProperty(CodexParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

CodexParser.EOF = antlr4.Token.EOF;
CodexParser.T__0 = 1;
CodexParser.T__1 = 2;
CodexParser.T__2 = 3;
CodexParser.T__3 = 4;
CodexParser.T__4 = 5;
CodexParser.T__5 = 6;
CodexParser.T__6 = 7;
CodexParser.T__7 = 8;
CodexParser.WithMember = 9;
CodexParser.BetweenMember = 10;
CodexParser.ForMember = 11;
CodexParser.RollMember = 12;
CodexParser.Pay = 13;
CodexParser.Take = 14;
CodexParser.Switch = 15;
CodexParser.Msg = 16;
CodexParser.Exit = 17;
CodexParser.On = 18;
CodexParser.Every = 19;
CodexParser.Start = 20;
CodexParser.Stop = 21;
CodexParser.HEXA = 22;
CodexParser.INT = 23;
CodexParser.WS = 24;
CodexParser.SL_COMMENT = 25;
CodexParser.MultiLineComment = 26;

CodexParser.RULE_file = 0;
CodexParser.RULE_mainRoll = 1;
CodexParser.RULE_subjectList = 2;
CodexParser.RULE_stat = 3;
CodexParser.RULE_statConsequential = 4;
CodexParser.RULE_statTemporal = 5;
CodexParser.RULE_statOn = 6;
CodexParser.RULE_statPay = 7;
CodexParser.RULE_subject = 8;

function FileContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_file;
    return this;
}

FileContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FileContext.prototype.constructor = FileContext;

FileContext.prototype.mainRoll = function() {
    return this.getTypedRuleContext(MainRollContext,0);
};

FileContext.prototype.stat = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatContext);
    } else {
        return this.getTypedRuleContext(StatContext,i);
    }
};

FileContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterFile(this);
	}
};

FileContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitFile(this);
	}
};




CodexParser.FileContext = FileContext;

CodexParser.prototype.file = function() {

    var localctx = new FileContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, CodexParser.RULE_file);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 18;
        this.mainRoll();
        this.state = 20; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 19;
            this.stat();
            this.state = 22; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while(_la===CodexParser.Pay);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function MainRollContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_mainRoll;
    return this;
}

MainRollContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MainRollContext.prototype.constructor = MainRollContext;

MainRollContext.prototype.WithMember = function() {
    return this.getToken(CodexParser.WithMember, 0);
};

MainRollContext.prototype.subject = function() {
    return this.getTypedRuleContext(SubjectContext,0);
};

MainRollContext.prototype.ForMember = function() {
    return this.getToken(CodexParser.ForMember, 0);
};

MainRollContext.prototype.RollMember = function() {
    return this.getToken(CodexParser.RollMember, 0);
};

MainRollContext.prototype.subjectList = function() {
    return this.getTypedRuleContext(SubjectListContext,0);
};

MainRollContext.prototype.BetweenMember = function() {
    return this.getToken(CodexParser.BetweenMember, 0);
};

MainRollContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterMainRoll(this);
	}
};

MainRollContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitMainRoll(this);
	}
};




CodexParser.MainRollContext = MainRollContext;

CodexParser.prototype.mainRoll = function() {

    var localctx = new MainRollContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, CodexParser.RULE_mainRoll);
    try {
        this.state = 38;
        switch(this._input.LA(1)) {
        case CodexParser.WithMember:
            this.enterOuterAlt(localctx, 1);
            this.state = 24;
            this.match(CodexParser.WithMember);
            this.state = 25;
            this.subject();
            this.state = 26;
            this.match(CodexParser.T__0);
            break;
        case CodexParser.ForMember:
            this.enterOuterAlt(localctx, 2);
            this.state = 28;
            this.match(CodexParser.ForMember);
            this.state = 29;
            this.match(CodexParser.RollMember);
            this.state = 30;
            this.subjectList();
            this.state = 31;
            this.match(CodexParser.T__0);
            break;
        case CodexParser.BetweenMember:
            this.enterOuterAlt(localctx, 3);
            this.state = 33;
            this.match(CodexParser.BetweenMember);
            this.state = 34;
            this.match(CodexParser.RollMember);
            this.state = 35;
            this.subjectList();
            this.state = 36;
            this.match(CodexParser.T__0);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SubjectListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_subjectList;
    return this;
}

SubjectListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SubjectListContext.prototype.constructor = SubjectListContext;

SubjectListContext.prototype.subject = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(SubjectContext);
    } else {
        return this.getTypedRuleContext(SubjectContext,i);
    }
};

SubjectListContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterSubjectList(this);
	}
};

SubjectListContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitSubjectList(this);
	}
};




CodexParser.SubjectListContext = SubjectListContext;

CodexParser.prototype.subjectList = function() {

    var localctx = new SubjectListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, CodexParser.RULE_subjectList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 40;
        this.match(CodexParser.T__1);
        this.state = 41;
        this.subject();
        this.state = 46;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===CodexParser.T__2) {
            this.state = 42;
            this.match(CodexParser.T__2);
            this.state = 43;
            this.subject();
            this.state = 48;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 49;
        this.match(CodexParser.T__3);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_stat;
    return this;
}

StatContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatContext.prototype.constructor = StatContext;

StatContext.prototype.statConsequential = function() {
    return this.getTypedRuleContext(StatConsequentialContext,0);
};

StatContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterStat(this);
	}
};

StatContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitStat(this);
	}
};




CodexParser.StatContext = StatContext;

CodexParser.prototype.stat = function() {

    var localctx = new StatContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, CodexParser.RULE_stat);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 51;
        this.statConsequential();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatConsequentialContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_statConsequential;
    return this;
}

StatConsequentialContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatConsequentialContext.prototype.constructor = StatConsequentialContext;

StatConsequentialContext.prototype.statPay = function() {
    return this.getTypedRuleContext(StatPayContext,0);
};

StatConsequentialContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterStatConsequential(this);
	}
};

StatConsequentialContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitStatConsequential(this);
	}
};




CodexParser.StatConsequentialContext = StatConsequentialContext;

CodexParser.prototype.statConsequential = function() {

    var localctx = new StatConsequentialContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, CodexParser.RULE_statConsequential);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 53;
        this.statPay();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatTemporalContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_statTemporal;
    return this;
}

StatTemporalContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatTemporalContext.prototype.constructor = StatTemporalContext;

StatTemporalContext.prototype.statOn = function() {
    return this.getTypedRuleContext(StatOnContext,0);
};

StatTemporalContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterStatTemporal(this);
	}
};

StatTemporalContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitStatTemporal(this);
	}
};




CodexParser.StatTemporalContext = StatTemporalContext;

CodexParser.prototype.statTemporal = function() {

    var localctx = new StatTemporalContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, CodexParser.RULE_statTemporal);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 55;
        this.statOn();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatOnContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_statOn;
    return this;
}

StatOnContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatOnContext.prototype.constructor = StatOnContext;

StatOnContext.prototype.On = function() {
    return this.getToken(CodexParser.On, 0);
};

StatOnContext.prototype.INT = function() {
    return this.getToken(CodexParser.INT, 0);
};

StatOnContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterStatOn(this);
	}
};

StatOnContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitStatOn(this);
	}
};




CodexParser.StatOnContext = StatOnContext;

CodexParser.prototype.statOn = function() {

    var localctx = new StatOnContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, CodexParser.RULE_statOn);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 57;
        this.match(CodexParser.On);
        this.state = 58;
        this.match(CodexParser.T__4);
        this.state = 59;
        this.match(CodexParser.T__5);
        this.state = 60;
        this.match(CodexParser.T__6);
        this.state = 61;
        this.match(CodexParser.INT);
        this.state = 62;
        this.match(CodexParser.T__7);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatPayContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_statPay;
    return this;
}

StatPayContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatPayContext.prototype.constructor = StatPayContext;

StatPayContext.prototype.Pay = function() {
    return this.getToken(CodexParser.Pay, 0);
};

StatPayContext.prototype.INT = function() {
    return this.getToken(CodexParser.INT, 0);
};

StatPayContext.prototype.statTemporal = function() {
    return this.getTypedRuleContext(StatTemporalContext,0);
};

StatPayContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterStatPay(this);
	}
};

StatPayContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitStatPay(this);
	}
};




CodexParser.StatPayContext = StatPayContext;

CodexParser.prototype.statPay = function() {

    var localctx = new StatPayContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, CodexParser.RULE_statPay);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 64;
        this.match(CodexParser.Pay);
        this.state = 65;
        this.match(CodexParser.INT);
        this.state = 67;
        _la = this._input.LA(1);
        if(_la===CodexParser.On) {
            this.state = 66;
            this.statTemporal();
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SubjectContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CodexParser.RULE_subject;
    return this;
}

SubjectContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SubjectContext.prototype.constructor = SubjectContext;

SubjectContext.prototype.HEXA = function() {
    return this.getToken(CodexParser.HEXA, 0);
};

SubjectContext.prototype.enterRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.enterSubject(this);
	}
};

SubjectContext.prototype.exitRule = function(listener) {
    if(listener instanceof CodexListener ) {
        listener.exitSubject(this);
	}
};




CodexParser.SubjectContext = SubjectContext;

CodexParser.prototype.subject = function() {

    var localctx = new SubjectContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, CodexParser.RULE_subject);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 69;
        this.match(CodexParser.HEXA);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.CodexParser = CodexParser;
