/** Grammars always start with a grammar header. This grammar is called
* ArrayInit and must match the filename: ArrayInit.g4
*/
grammar Asso;
/** A rule called init that matches comma-separated values between {...}. */
expr : expr '*' expr
|  <assoc=left>expr '^' expr
|  expr '+' expr
| INT
;
// parser rules start with lowercase letters, lexer rules with uppercase
INT : [0-9]+ ;
// Define token INT as one or more digits
WS  : [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out
