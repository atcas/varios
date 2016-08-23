package com.djaramillo;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class ParserMemberPrint extends ArrayInitParser{

	public ParserMemberPrint(TokenStream input) {
		super(input);
		// TODO Auto-generated constructor stub
	}

	@Override
	void startInit() {
		// TODO Auto-generated method stub
		
		System.out.println("inicio lectrua arbol");
	}
	
	@Override
	void defineValue(Token value) {
		// TODO Auto-generated method stub
		System.out.println("el type es:"+ value.getType() + "channel:"+value.getChannel());
		System.out.println("el numero es:"+ value.getText());
	}
}
