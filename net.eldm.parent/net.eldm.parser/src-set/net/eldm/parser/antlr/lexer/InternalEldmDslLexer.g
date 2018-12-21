/*
 * generated by Xtext 2.15.0
 */
lexer grammar InternalEldmDslLexer;

@header {
package net.eldm.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Definitions : 'definitions:';

PlugDsl : 'plug-dsl';

Service : 'service';

Typedef : 'typedef';

Import : 'import';

Module : 'module';

Catch : 'catch';

False : 'false';

Match : 'match';

Bool : 'bool';

Else : 'else';

Enum : 'enum';

From : 'from';

Func : 'func';

Mask : 'mask';

None : 'none';

Path : 'path';

Then : 'then';

True : 'true';

And : 'and';

Any : 'any';

Def : 'def';

Del : 'del';

Flt : 'flt';

For : 'for';

Get : 'get';

Int : 'int';

Lda : 'lda';

Ldt : 'ldt';

Let : 'let';

Lst : 'lst';

Ltm : 'ltm';

Map : 'map';

Out : 'out';

Set : 'set';

Str : 'str';

Use : 'use';

Var : 'var';

ExclamationMarkEqualsSign : '!=';

AsteriskAsterisk : '**';

HyphenMinusGreaterThanSign : '->';

FullStopFullStop : '..';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

QuestionMarkFullStop : '?.';

As : 'as';

If : 'if';

In : 'in';

Is : 'is';

Or : 'or';

LineFeed : '\n';

CarriageReturn : '\r';

ExclamationMark : '!';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

QuestionMark : '?';

CommercialAt : '@';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

LeftPointingDoubleAngleQuotationMark : '\u00AB';

RightPointingDoubleAngleQuotationMark : '\u00BB';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_PATH : ('/' ('a'..'z'|'-'|'0'..'9')+)*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'-'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_NATURAL : '-'? RULE_INT;

RULE_FLOAT : RULE_NATURAL ('.' RULE_INT)?;

RULE_DATE : RULE_INT '-' ('0' '1'..'9'|'1' '0'..'2') '-' ('0' '1'..'9'|'1'..'2' '0'..'9'|'3' '0'..'1');

RULE_TIME : ('0'..'1' '0'..'9'|'2' '0'..'3') ':' '0'..'5' '0'..'9' ':' '0'..'5' '0'..'9';

RULE_DATETIME : RULE_DATE 'T' RULE_TIME;

RULE_TEXT : ('\'' ~(('\''|'\r'|'\n'))* '\''|'"""' ( options {greedy=false;} : . )*'"""');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
