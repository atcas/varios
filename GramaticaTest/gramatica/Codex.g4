/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar Codex;

@lexer::members {
    public static final int WHITESPACE = 1;
    public static final int COMMENTS = 2;
}

file: mainRoll stat+;


mainRoll : WithMember subject ':'
	|ForMember RollMember subjectList ':'
	|BetweenMember RollMember subjectList ':';

subjectList: '[' subject (',' subject)* ']' ;


stat: statConsequential;


statConsequential: statPay;

statTemporal: statOn;


statOn: On '(' 't'  '+'   INT ')';

statPay:  Pay INT statTemporal?;


/// member Keywords

WithMember : 'with';
BetweenMember : 'between';
ForMember : 'for';
RollMember : 'roll';

/// consequential Keywords
Pay      : 'pay';
Take : 'take';
Switch : 'switch';
Msg : 'msg';
Exit : 'exit';


/// temporal Keywords
On      : 'on';
Every : 'every';
Start : 'start';
Stop : 'stop';



subject : HEXA ;



HEXA :   '0x'([a-zA-Z|0-9]+) ;


INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> channel(WHITESPACE) ;  // channel(1)

SL_COMMENT :   '//' .*? '\n' -> channel(COMMENTS);   // channel(2)

MultiLineComment : '/*' .*? '*/' -> channel(COMMENTS); //channel(2)

fragment LETTER : [a-zA-Z];
