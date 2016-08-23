// Generated from Codex.g4 by ANTLR 4.5.3
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by CodexParser.
function CodexListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

CodexListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
CodexListener.prototype.constructor = CodexListener;

// Enter a parse tree produced by CodexParser#file.
CodexListener.prototype.enterFile = function(ctx) {
};

// Exit a parse tree produced by CodexParser#file.
CodexListener.prototype.exitFile = function(ctx) {
};


// Enter a parse tree produced by CodexParser#mainRoll.
CodexListener.prototype.enterMainRoll = function(ctx) {
};

// Exit a parse tree produced by CodexParser#mainRoll.
CodexListener.prototype.exitMainRoll = function(ctx) {
};


// Enter a parse tree produced by CodexParser#subjectList.
CodexListener.prototype.enterSubjectList = function(ctx) {
};

// Exit a parse tree produced by CodexParser#subjectList.
CodexListener.prototype.exitSubjectList = function(ctx) {
};


// Enter a parse tree produced by CodexParser#stat.
CodexListener.prototype.enterStat = function(ctx) {
};

// Exit a parse tree produced by CodexParser#stat.
CodexListener.prototype.exitStat = function(ctx) {
};


// Enter a parse tree produced by CodexParser#statConsequential.
CodexListener.prototype.enterStatConsequential = function(ctx) {
};

// Exit a parse tree produced by CodexParser#statConsequential.
CodexListener.prototype.exitStatConsequential = function(ctx) {
};


// Enter a parse tree produced by CodexParser#statTemporal.
CodexListener.prototype.enterStatTemporal = function(ctx) {
};

// Exit a parse tree produced by CodexParser#statTemporal.
CodexListener.prototype.exitStatTemporal = function(ctx) {
};


// Enter a parse tree produced by CodexParser#statOn.
CodexListener.prototype.enterStatOn = function(ctx) {
};

// Exit a parse tree produced by CodexParser#statOn.
CodexListener.prototype.exitStatOn = function(ctx) {
};


// Enter a parse tree produced by CodexParser#statPay.
CodexListener.prototype.enterStatPay = function(ctx) {
};

// Exit a parse tree produced by CodexParser#statPay.
CodexListener.prototype.exitStatPay = function(ctx) {
};


// Enter a parse tree produced by CodexParser#subject.
CodexListener.prototype.enterSubject = function(ctx) {
};

// Exit a parse tree produced by CodexParser#subject.
CodexListener.prototype.exitSubject = function(ctx) {
};



exports.CodexListener = CodexListener;