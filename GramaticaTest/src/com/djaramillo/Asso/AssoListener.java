// Generated from Asso.g4 by ANTLR 4.5.3
package com.djaramillo.Asso;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssoParser}.
 */
public interface AssoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AssoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AssoParser.ExprContext ctx);
}