package com.djaramillo.Cymbol;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Test2 {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// create a lexer that feeds off of input CharStream
		CymbolLexer lexer = new CymbolLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		CymbolParser parser = new CymbolParser(tokens);
		//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
		
		ParseTree tree = parser.file(); // begin parsing at init rule
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		
		
		
		ParseTreeWalker walker = new ParseTreeWalker();
		FunctionListener collector = new FunctionListener();
		walker.walk(collector, tree);
		System.out.println(collector.graph.toString());
		System.out.println(collector.graph.toDOT());
		
		
	     //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        
		
		
		}
}
