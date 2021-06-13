package com.company;
import static com.company.Token.*;
import java.io.*;
%%
%class Scanner
%type Token
%{
%}
InputChar = [^\n\r]
SpaceChar = [\ \t]
LineChar = \n|\r|\r\n
Zero = 0
DecInt = [1-9][0-9]*
OctalInt = 0[0-7]+
HexInt = 0[xX][0-9a-fA-F]+

Integer = ( {Zero} | {DecInt} | {OctalInt} | {HexInt} )[lL]?
Exponent = [eE] [\+\-]? [0-9]+
Float1 = [0-9]+ \. [0-9]+ {Exponent}?
Float2 = \. [0-9]+ {Exponent}?
Float3 = [0-9]+ \. {Exponent}?
Float4 = [0-9]+ {Exponent}
Float = ( {Float1} | {Float2} | {Float3} | {Float4} ) [fFdD]? |
[0-9]+ [fFDd]
Ident = [A-Za-z_$] [A-Za-z_$0-9]*
CChar = [^\'\\\n\r] | {EscChar}
SChar = [^\"\\\n\r] | {EscChar}
EscChar = \\[ntbrf\\\'\"] | {OctalEscape}
OctalEscape = \\[0-7] | \\[0-7][0-7] | \\[0-3][0-7][0-7]
%%
"for" { return FOR;}
"while" { return WHILE;}
"if" { return IF;}
"else" { return ELSE;}
"then" { return THEN;}
"switch" { return SWITCH;}
"case" { return CASE;}
"break" { return BREAK;}
"else if" { return ELSE_IF;}
"elseif" { return ELSEIF;}
"static" { return STATIC;}
"void" { return VOID;}
"public" { return PUBLIC;}
"default" { return DEFAULT;}
"continue" { return CONTINUE;}
"long" { return LONG_TYPE;}
"int" { return INT_TYPE;}
"String" { return STRING_TYPE;}
"char" { return CHAR_TYPE;}
"boolean" { return BOOLEAN_TYPE;}
"double" { return DOUBLE_TYPE;}
"float" {  return FLOAT_TYPE;}
return {return RETURN;}
true {  return TRUE; }
false {  return FALSE; }
null {  return NULL; }

"(" {  return LEFT_PARENTHESIS; }
")" {  return RIGHT_PARENTHESIS; }
"{" {  return LEFTCURLY; }
"}" {  return RIGHTCURLY; }
"[" {  return LEFTSQ; }
"]" {  return RIGHTSQ; }
">=" { return GREATER_EQUAL;}
"<" { return LOWER;}
"<=" { return LOWER_EQUAL;}
"!=" { return NOT_EQUAL;}
"-" { return MINUS;}
"+" { return PLUS;}
"++" { return PLUS_PLUS;}
"--" { return MINUS_MINUS;}
"=" {return ASSIGNMENT;}
"==" {return COMPARISON;}
">" {return GREATER;}
"*" { return PRODUCTION;}
"%" { return REMAINED;}
"&&" { return LOGICAL_AND;}
"||" { return LOGICAL_OR;}
"/" { return DEVISION;}
";" { return SEMICOLON;}

{Integer} {return INTEGER_NUMBER; }
{Float} {return FLOAT_NUMBER; }
{Ident} {return IDENTICAL; }
\"{SChar}*\"  {return String_value;}
\'{CChar}\' {return Char_value;}
"/*"~"*/" {return Comment;}
"//"{InputChar}* {return Comment;}
{LineChar} { }
{SpaceChar} { }
