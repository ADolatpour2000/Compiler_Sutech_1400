package com.company;


import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.Symbol;

import javax.swing.*;
import java.io.*;
import java.time.format.TextStyle;

public class Identifier_Table extends Lexer{
    Lexer type_scanner;
    Lexer text_scanner;
    private static final int MAX_Token = 10000;
    private int no_Table_Col = 4;
    public String[][] Table = new String[MAX_Token][no_Table_Col];
    private String[] Token_Type = new String[MAX_Token];
    protected String[] Token_text = new String[MAX_Token];
    protected int no_Token = 0;
    private int no_identifier = 0;
    private String Address = "src/com/company/test.txt";
    public Identifier_Table(Reader in, ComplexSymbolFactory sf) {
        super(in, sf);
        Go();
    }

    public void Go() {
        try {
            type_scanner = new Lexer(new FileReader(Address));
            text_scanner = new Lexer(new FileReader(Address));
            for(int i = 0;i < MAX_Token;i++){
                for(int j = 0;j < no_Table_Col;j++){
                    Table[i][j] = new String();
                }
            }
            TokenRetreiver(type_scanner,text_scanner);
            Create_Table();
        } catch (IOException e) {
            System.out.println("there is a problem in reading the file,Please try again later");
        }
    }

    private void TokenRetreiver(Lexer type_scanner,Lexer text_scanner){
        try {
            int list_count = 0;
            Symbol token = type_scanner.next_token();
//            System.out.println(token.toString().substring(8));
            while (token.sym != 0) {
                if(type_scanner.yytext().equals("String")){
                    Token_Type[list_count] = "STRING";
                    Token_text[list_count++] = "String";
                }else if(token.toString().substring(8).equals("STRING_LITERAL")){
                    Token_Type[list_count] = token.toString().substring(8);
                    Token_text[list_count++] = String.valueOf(type_scanner.string);
                }else{
                    Token_Type[list_count] = token.toString().substring(8);
                    Token_text[list_count++] = type_scanner.yytext();
                }
                token = type_scanner.next_token();
//                System.out.println(Token_text[list_count - 1]);
            }
//            list_count = 0;
//            token = text_scanner.next_token();
//            while (token.sym != 0) {
//                if(Token_text[i])
//                Token_text[list_count++] = String.valueOf(text_scanner.string);
//                token = text_scanner.next_token();
//            }
            no_Token = list_count;
        }catch (Exception e){

        }
    }

    public Lexer get_Lexer(String Address) throws FileNotFoundException {
        return new Lexer(new FileReader(Address));
    }

    public String[] getToken_Text(){
        return Token_text;
    }

    public String[] getToken_Type(){
        return Token_Type;
    }

    public void Create_Table(){
        int index = 0;
        for(int i = 0;i < no_Token;i++){
            if((i >= 1) && (!Token_text[i].equals("String")) && Token_Type[i].equals("IDENTIFIER") && (Exist_Token(Table,Token_text[i],no_Token,1) == -1) &&
                    !Token_Type[i - 1].equals("PACKAGE") && !Token_Type[i - 1].equals("CLASS") && ((!Token_Type[i - 1].equals("DOT")) && (!Token_Type[i - 1].equals("INT")) && (!Token_Type[i - 1].equals("FLOAT")) && (!Token_Type[i - 1].equals("DOUBLE")) &&
                        (!Token_Type[i - 1].equals("CHAR")) && (!Token_Type[i - 1].equals("SHORT")) && (!Token_Type[i - 1].equals("BYTE")) &&
                        (!Token_Type[i - 1].equals("LONG")) && (!Token_Type[i - 1].equals("BOOLEAN") && (!Token_Type[i - 1].equals("VOID")) && (!Token_Type[i - 1].equals("STRING"))))){
                       zzScanError(0);

                } else if((i >= 1) && Token_Type[i].equals("IDENTIFIER") && (Exist_Token(Table,Token_text[i],no_Token,1) == -1) &&
                    (Token_Type[i - 1].equals("PACKAGE") || ((i <= no_Token - 2) && Token_Type[i - 1].equals("CLASS")) ||
                    Token_Type[i - 1].equals("DOT"))){
                    Table[index][0] = String.valueOf(index + 1);
                    Table[index][1] = Token_text[i];
                    Table[index][2] = Token_Type[i];
                    Table[index++][3] = "-----";
            } else if(Token_Type[i].equals("INT") || Token_Type[i].equals("FLOAT") || Token_Type[i].equals("DOUBLE") ||
                    Token_Type[i].equals("CHAR")|| Token_Type[i].equals("SHORT")|| Token_Type[i].equals("BYTE")||
                    Token_Type[i].equals("LONG") || (Token_Type[i].equals("BOOLEAN"))|| (Token_Type[i].equals("STRING"))) {

                    Table[index][0] = String.valueOf(index + 1);
                    Table[index][1] = Token_text[i + 1];
                    Table[index++][2] = Token_Type[i];

            }else if(Token_Type[i].equals("INTEGER_LITERAL") || Token_Type[i].equals("FLOATING_POINT_LITERAL") || Token_Type[i].equals("CHARACTER_LITERAL")
                    || Token_Type[i].equals("STRING_LITERAL") || Token_Type[i].equals("BOOLEAN_LITERAL") && !(
                    Token_Type[i - 1].equals("PLUS") && Token_Type[i].equals("MINUS") && Token_Type[i].equals("DIV")
                    && Token_Type[i].equals("MOD"))) {
                int index_table = Exist_Token(Table, Token_text[i - 2], no_Token, 1);
                if (index_table != -1) {
                    if (Table[index_table][2].equals("INT")) {
                        if (Token_Type[i].equals("INTEGER_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("FLOAT")) {
                        if (Token_Type[i].equals("FLOATING_POINT_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("DOUBLE")) {
                        if (Token_Type[i].equals("FLOATING_POINT_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("CHAR")) {
                        if (Token_Type[i].equals("CHARACTER_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("SHORT")) {
                        if (Token_Type[i].equals("INTEGER_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("LONG")) {
                        if (Token_Type[i].equals("INTEGER_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("BOOLEAN")) {
                        if (Token_Type[i].equals("BOOLEAN_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    } else if (Table[index_table][2].equals("STRING")) {
                        if (Token_Type[i].equals("STRING_LITERAL")) {
                            Table[index_table][3] = Token_text[i];
                        } else {
                            zzScanError(1);
                        }
                    }else {
                        zzScanError(1);
                    }
                }
            }else if(Token_Type[i].equals("IDENTIFIER") && Exist_Token(Table,Token_text[i],no_Token,1) == -1){
                Table[index][0] = String.valueOf(index + 1);
                Table[index][1] = Token_text[i];
                if(Token_Type[i + 1] == "LPAREN") {
                    Table[index][2] = Token_Type[i];
                    Table[index][3] = "-----";
                    index++;
                }
            }
        }
        no_identifier = index;
    }

    public String[][] getTable(int row,String[][] Table){
        String[][] ReSized_Table = new String[row][no_Table_Col];
        for(int i = 0;i < row;i++){
            ReSized_Table[i] = Table[i];
        }
        return ReSized_Table;
    }

    private int Exist_Token(String[][] Table,String token,int no_Token,int index){
        for(int i = 0;i < no_Token;i++){
            if(Table[i][index].equals(token)){
                return i;
            }
        }
        return -1;
    }

    public String[][] get_Token_Table(){
        return Token_Table();
    }
    private String[][] Token_Table() {
        String[][] table = getTable(no_identifier,Table);
        String[] Token_Type = getToken_Type();
        String[] Token_Text = getToken_Text();
        String[][] Token = new String[no_Token][4];
        for (int i = 0; i < no_identifier; i++) {
            Token[i][0] = table[i][0];
            Token[i][1] = table[i][1];
            Token[i][2] = table[i][2];
            Token[i][3] = table[i][3];
        }

        int Table_index = no_identifier;
        for(int i = 0;i < no_Token;i++){
            if(Exist_Token(Table,Token_text[i],no_Token,1) == -1){
                if(Token_Text[i].equals("String")){
                    Token[Table_index][0] = String.valueOf(Table_index + 1);
                    Token[Table_index][1] = Token_Text[i];
                    Token[Table_index][2] = "STRING";
                    Token[Table_index++][3] = "-----";
                }else{
                    Token[Table_index][0] = String.valueOf(Table_index + 1);
                    Token[Table_index][1] = Token_Text[i];
                    Token[Table_index][2] = Token_Type[i];
                    Token[Table_index++][3] = "-----";
                }

            }
        }
        return getTable(Table_index,Token);
    }
}