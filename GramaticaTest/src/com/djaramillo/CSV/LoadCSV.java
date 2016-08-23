package com.djaramillo.CSV;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public   class LoadCSV extends CSVBaseListener  {

	public static final String EMPTY = "";
	/** Load a list of row maps that map field name to value */
	List<Map<String,String>> rows = new ArrayList<Map<String, String>>();
	/** List of column names */
	List<String> header;
	/** Build up a list of fields in current row */
	List<String> currentRowFieldValues;


	
	///guarda las hojas al salir de las hojas
	public void exitString(CSVParser.StringContext ctx) {
		currentRowFieldValues.add(ctx.STRING().getText());
	}
	public void exitText(CSVParser.TextContext ctx) {
		currentRowFieldValues.add(ctx.TEXT().getText());
	}
	public void exitEmpty(CSVParser.EmptyContext ctx) {
		currentRowFieldValues.add(EMPTY);
	}

	
	
	
	
	/// guarda el encabezado, ppor definicion de la gramatica
	// solo se ejecuta una vez
	public void exitHdr(CSVParser.HdrContext ctx) {
		header = new ArrayList<String>();
		header.addAll(currentRowFieldValues);
	}


	//// crea un neue array al entrar, limpia informacion
	public void enterRow(CSVParser.RowContext ctx) {
		currentRowFieldValues = new ArrayList<String>();
	}


	
	///salva informacion de row
	public void exitRow(CSVParser.RowContext ctx) {
		// If this is the header row, do nothing
		// if ( ctx.parent instanceof CSVParser.HdrContext ) return; OR:
		if ( ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr ) return;


		// It's a data row
		Map<String, String> m = new LinkedHashMap<String, String>();
		int i = 0;
		for (String v : currentRowFieldValues) {
			m.put(header.get(i), v);
			i++;
		}
		rows.add(m);
	}

}
