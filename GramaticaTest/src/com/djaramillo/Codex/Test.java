package com.djaramillo.Codex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Test {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(readFile());
		// create a lexer that feeds off of input CharStream
		CodexLexer lexer = new CodexLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		CodexParser parser = new CodexParser(tokens);
		//PropertyFilePrinter parser= new PropertyFilePrinter(tokens);
		
		ParseTree tree = parser.file(); // begin parsing at init rule
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
		
		
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
	
	
	
	
	
	public static String readFile() {

		BufferedReader br = null;
		StringBuffer buffer=new StringBuffer();
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("/home/x4/workspace/java/antlr4/examples/GramaticaTest/data/ejemploCodex.txt"));
			
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				buffer.append(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
		return buffer.toString();

	}
	
	
}
