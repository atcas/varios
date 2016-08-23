// Generated from Solidity.g4 by ANTLR 4.5.3
package com.djaramillo.Solidity;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolidityParser}.
 */
public interface SolidityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolidityParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SolidityParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SolidityParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(SolidityParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(SolidityParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(SolidityParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(SolidityParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#contractElements}.
	 * @param ctx the parse tree
	 */
	void enterContractElements(SolidityParser.ContractElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#contractElements}.
	 * @param ctx the parse tree
	 */
	void exitContractElements(SolidityParser.ContractElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#contractElement}.
	 * @param ctx the parse tree
	 */
	void enterContractElement(SolidityParser.ContractElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#contractElement}.
	 * @param ctx the parse tree
	 */
	void exitContractElement(SolidityParser.ContractElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SolidityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolidityParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(SolidityParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(SolidityParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(SolidityParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(SolidityParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableStatementSolidity}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatementSolidity(SolidityParser.VariableStatementSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableStatementSolidity}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatementSolidity(SolidityParser.VariableStatementSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationListFunctionSolidity}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationListFunctionSolidity(SolidityParser.VariableDeclarationListFunctionSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationListFunctionSolidity}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationListFunctionSolidity(SolidityParser.VariableDeclarationListFunctionSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationNameFunctionSolidity}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationNameFunctionSolidity(SolidityParser.VariableDeclarationNameFunctionSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationNameFunctionSolidity}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationNameFunctionSolidity(SolidityParser.VariableDeclarationNameFunctionSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationNameSolidity}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationNameSolidity(SolidityParser.VariableDeclarationNameSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationNameSolidity}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationNameSolidity(SolidityParser.VariableDeclarationNameSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationSolidity}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationSolidity(SolidityParser.VariableDeclarationSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationSolidity}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationSolidity(SolidityParser.VariableDeclarationSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(SolidityParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(SolidityParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(SolidityParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(SolidityParser.InitialiserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(SolidityParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(SolidityParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SolidityParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SolidityParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarStatement(SolidityParser.ForVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarStatement(SolidityParser.ForVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(SolidityParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(SolidityParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarInStatement(SolidityParser.ForVarInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link SolidityParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarInStatement(SolidityParser.ForVarInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(SolidityParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(SolidityParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SolidityParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SolidityParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(SolidityParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(SolidityParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(SolidityParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(SolidityParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(SolidityParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(SolidityParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(SolidityParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(SolidityParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(SolidityParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(SolidityParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(SolidityParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(SolidityParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(SolidityParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(SolidityParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(SolidityParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(SolidityParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(SolidityParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(SolidityParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnfunctionSolidity}.
	 * @param ctx the parse tree
	 */
	void enterReturnfunctionSolidity(SolidityParser.ReturnfunctionSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnfunctionSolidity}.
	 * @param ctx the parse tree
	 */
	void exitReturnfunctionSolidity(SolidityParser.ReturnfunctionSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mappingStatement}.
	 * @param ctx the parse tree
	 */
	void enterMappingStatement(SolidityParser.MappingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mappingStatement}.
	 * @param ctx the parse tree
	 */
	void exitMappingStatement(SolidityParser.MappingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#typeSolidity}.
	 * @param ctx the parse tree
	 */
	void enterTypeSolidity(SolidityParser.TypeSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#typeSolidity}.
	 * @param ctx the parse tree
	 */
	void exitTypeSolidity(SolidityParser.TypeSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#modifierDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModifierDeclaration(SolidityParser.ModifierDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#modifierDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModifierDeclaration(SolidityParser.ModifierDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SolidityParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SolidityParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SolidityParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SolidityParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#formalParameterListSolidity}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterListSolidity(SolidityParser.FormalParameterListSolidityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#formalParameterListSolidity}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterListSolidity(SolidityParser.FormalParameterListSolidityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(SolidityParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(SolidityParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(SolidityParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(SolidityParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(SolidityParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(SolidityParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#elision}.
	 * @param ctx the parse tree
	 */
	void enterElision(SolidityParser.ElisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#elision}.
	 * @param ctx the parse tree
	 */
	void exitElision(SolidityParser.ElisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(SolidityParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(SolidityParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyNameAndValueList(SolidityParser.PropertyNameAndValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyNameAndValueList(SolidityParser.PropertyNameAndValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(SolidityParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(SolidityParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(SolidityParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(SolidityParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(SolidityParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link SolidityParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(SolidityParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(SolidityParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(SolidityParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetParameterList(SolidityParser.PropertySetParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetParameterList(SolidityParser.PropertySetParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SolidityParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SolidityParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(SolidityParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(SolidityParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(SolidityParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(SolidityParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SolidityParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SolidityParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SolidityParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SolidityParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(SolidityParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(SolidityParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(SolidityParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(SolidityParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(SolidityParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(SolidityParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SolidityParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SolidityParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SolidityParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SolidityParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(SolidityParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(SolidityParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(SolidityParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(SolidityParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(SolidityParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(SolidityParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(SolidityParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(SolidityParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(SolidityParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(SolidityParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(SolidityParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(SolidityParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(SolidityParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(SolidityParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(SolidityParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(SolidityParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(SolidityParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(SolidityParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(SolidityParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(SolidityParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(SolidityParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(SolidityParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SolidityParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SolidityParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(SolidityParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(SolidityParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SolidityParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SolidityParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(SolidityParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(SolidityParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SolidityParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SolidityParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SolidityParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SolidityParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SolidityParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SolidityParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(SolidityParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(SolidityParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(SolidityParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(SolidityParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(SolidityParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(SolidityParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SolidityParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SolidityParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(SolidityParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(SolidityParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(SolidityParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(SolidityParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(SolidityParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(SolidityParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(SolidityParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(SolidityParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(SolidityParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(SolidityParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(SolidityParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(SolidityParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(SolidityParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(SolidityParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(SolidityParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link SolidityParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(SolidityParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SolidityParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SolidityParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SolidityParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SolidityParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SolidityParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SolidityParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(SolidityParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(SolidityParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(SolidityParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(SolidityParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SolidityParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SolidityParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterFutureReservedWord(SolidityParser.FutureReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitFutureReservedWord(SolidityParser.FutureReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(SolidityParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(SolidityParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(SolidityParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(SolidityParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(SolidityParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(SolidityParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(SolidityParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(SolidityParser.EofContext ctx);
}