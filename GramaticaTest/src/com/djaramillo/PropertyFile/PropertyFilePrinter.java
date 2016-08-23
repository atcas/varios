package com.djaramillo.PropertyFile;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class PropertyFilePrinter extends PropertyFileParser{

	public PropertyFilePrinter(TokenStream input) {
		super(input);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void startFile() {
		// TODO Auto-generated method stub
		System.out.println("inicio archivo");
	}
	
	void defineProperty(Token name, Token value) {
		System.out.println(name.getText()+"="+value.getText());
	}

}
