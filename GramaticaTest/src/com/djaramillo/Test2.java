package com.djaramillo;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test2 {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream("{1,{2,3},4}");
		// create a lexer that feeds off of input CharStream
		ArrayInitLexer lexer = new ArrayInitLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		//ArrayInitParser parser = new ArrayInitParser(tokens);
		ParserMemberPrint parserOverride= new ParserMemberPrint(tokens);
		
		ParseTree tree = parserOverride.init(); // begin parsing at init rule
		System.out.println(tree.toStringTree(parserOverride)); // print LISP-style tree
		
		
		
		
		
		
		
		
	     //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
        		parserOverride.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
        
		
		
		
		}
}
