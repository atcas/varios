package com.djaramillo.Codex;

import java.util.List;

import com.djaramillo.Codex.CodexParser.MainRollContext;
import com.djaramillo.Codex.CodexParser.StatPayContext;
import com.djaramillo.Codex.CodexParser.SubjectContext;
import com.djaramillo.Codex.CodexParser.SubjectListContext;

public class CodexParseTree extends CodexBaseListener {

	@Override
	public void enterMainRoll(MainRollContext ctx) {
		// TODO Auto-generated method stub
		//super.enterMainRoll(ctx);
		
		int children=ctx.getChildCount(); 
		//for
		//ctx.subjectList().
		//ctx.SUBJECT();
		

		
		if(ctx.WithMember()!=null)
		{
			System.out.println("no existe");
			
			if(ctx.subject()!=null)
			{
				System.out.println(ctx.subject().getText());
			}
		}
		
		if(ctx.BetweenMember()!=null)
		{
			System.out.println(ctx.BetweenMember().getText());
		}
		
		//System.out.println(ctx.getChild(0).getText());
	
	
	
	}
	
	
	@Override
	public void exitStatPay(StatPayContext ctx) {
		// TODO Auto-generated method stub
		//ctx
		ctx.INT();
		ctx.statTemporal().statOn().On();
		ctx.statTemporal().statOn().INT();
		
	}
	
	
	@Override
	public void exitSubject(SubjectContext ctx) {
		// TODO Auto-generated method stub
		//super.exitSubject(ctx);
		
		System.out.println(ctx.getTokens(CodexLexer.HEXA).size());
		System.out.println(ctx.getText());
	}
	

	
	
	
	
}
