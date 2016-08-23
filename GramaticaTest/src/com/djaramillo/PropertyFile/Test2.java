package com.djaramillo.PropertyFile;

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
		PropertyFileLexer lexer = new PropertyFileLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		//PropertyFileParser parser = new PropertyFileParser(tokens);
		
		
		PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
		
		ParseTree tree = parser.file(); // begin parsing at init rule
		
		
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		PropertyFileLoader loader = new PropertyFileLoader();
		walker.walk(loader, tree);
		// walk parse tree
		
		
		
		
		
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		
		System.out.println(loader.props); // print results
		
		
		
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
