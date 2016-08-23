package com.djaramillo.Cymbol;

public class FunctionListener extends CymbolBaseListener {
	Graph graph = new Graph();
	String currentFunctionName = null;
	
	public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		currentFunctionName = ctx.ID().getText();
		graph.nodes.add(currentFunctionName);
		}
	
	public void exitCallFunction(CymbolParser.CallFunctionContext ctx) {
		String funcName = ctx.ID().getText();
		// map current function to the callee
		graph.edge(currentFunctionName, funcName);
		}
		
}