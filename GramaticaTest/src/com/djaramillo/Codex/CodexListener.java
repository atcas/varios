// Generated from Codex.g4 by ANTLR 4.5.3
package com.djaramillo.Codex;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodexParser}.
 */
public interface CodexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodexParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CodexParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CodexParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#mainRoll}.
	 * @param ctx the parse tree
	 */
	void enterMainRoll(CodexParser.MainRollContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#mainRoll}.
	 * @param ctx the parse tree
	 */
	void exitMainRoll(CodexParser.MainRollContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#subjectList}.
	 * @param ctx the parse tree
	 */
	void enterSubjectList(CodexParser.SubjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#subjectList}.
	 * @param ctx the parse tree
	 */
	void exitSubjectList(CodexParser.SubjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CodexParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CodexParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#statConsequential}.
	 * @param ctx the parse tree
	 */
	void enterStatConsequential(CodexParser.StatConsequentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#statConsequential}.
	 * @param ctx the parse tree
	 */
	void exitStatConsequential(CodexParser.StatConsequentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#statTemporal}.
	 * @param ctx the parse tree
	 */
	void enterStatTemporal(CodexParser.StatTemporalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#statTemporal}.
	 * @param ctx the parse tree
	 */
	void exitStatTemporal(CodexParser.StatTemporalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#statOn}.
	 * @param ctx the parse tree
	 */
	void enterStatOn(CodexParser.StatOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#statOn}.
	 * @param ctx the parse tree
	 */
	void exitStatOn(CodexParser.StatOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#statPay}.
	 * @param ctx the parse tree
	 */
	void enterStatPay(CodexParser.StatPayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#statPay}.
	 * @param ctx the parse tree
	 */
	void exitStatPay(CodexParser.StatPayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodexParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(CodexParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodexParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(CodexParser.SubjectContext ctx);
}