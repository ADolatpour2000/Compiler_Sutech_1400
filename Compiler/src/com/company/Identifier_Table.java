package com.company;


import java.io.FileReader;
import java.io.IOException;

public class Identifier_Table{
    Scanner type_scanner;
    Scanner text_scanner;
    private static final int MAX_Token = 10000;
    private int no_Table_Col = 4;
    public String[][] Table = new String[MAX_Token][no_Table_Col];
    private String[] Token_Type = new String[MAX_Token];
    protected String[] Token_text = new String[MAX_Token];
    protected int no_Token = 0;
    private int no_identifier = 0;

    public Identifier_Table(String Address) {
        try {
            type_scanner = new Scanner(new FileReader(Address));
            text_scanner = new Scanner(new FileReader(Address));
            for(int i = 0;i < MAX_Token;i++){
                for(int j = 0;j < no_Table_Col;j++){
                    Table[i][j] = new String();
                }
            }
            TokenRetreiver(type_scanner,text_scanner);
            Create_Table();
            Show_Table();
        } catch (IOException e) {
            System.out.println("there is a problem in reading the file,Please try again later");
        }
    }

    private void TokenRetreiver(Scanner type_scanner,Scanner text_scanner){
        try {
            int list_count = 0;
            Token token = type_scanner.yylex();
            while (token != null) {
                Token_Type[list_count++] = token.toString();
                token = type_scanner.yylex();
            }

            list_count = 0;

            token = text_scanner.yylex();
            while (token != null) {
                Token_text[list_count++] = text_scanner.yytext();
                token = text_scanner.yylex();
            }
            no_Token = list_count;
        }catch (Exception e){

        }
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
            if(Token_Type[i].equals("INT_TYPE") || Token_Type[i].equals("FLOAT_TYPE") || Token_Type[i].equals("DOUBLE_TYPE") ||
                    Token_Type[i].equals("CHAR_TYPE") || Token_Type[i].equals("STRING_TYPE") || Token_Type[i].equals("BOOLEAN_TYPE")) {
                Table[index][0] = String.valueOf(index + 1);
                Table[index][1] = Token_text[i + 1];
                Table[index++][2] = Token_Type[i];
            }else if(Token_Type[i].equals("INTEGER_NUMBER") || Token_Type[i].equals("FLOAT_NUMBER") || Token_Type[i].equals("Char_value")
                    || Token_Type[i].equals("String_value") || Token_Type[i].equals("TRUE")|| Token_Type[i].equals("FALSE")){
                int index_table = Exist_Token(Table,Token_text[i - 2],no_Token,1);
                if(index_table != -1){
                    Table[index_table][3] = Token_text[i];
                }

            }else if((Exist_Token(Table,Token_text[i],no_Token,1) == -1) && (Token_Type[i].equals("IDENTICAL"))){
                Table[index][0] = String.valueOf(index + 1);
                Table[index][1] = Token_text[i];
                if(Token_Type[i + 1] == "LEFT_PARENTHESIS"){
                    Table[index][2] = Token_Type[i];
                }else{
                    Table[index][2] = "UNDEFINED";
                }
                index++;
            }
        }
        no_identifier = index;
    }

    public String[][] getTable(){
        String[][] ReSized_Table = new String[no_identifier][no_Table_Col];
        for(int i = 0;i < no_identifier;i++){
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

    public String[][] Token_Table(Identifier_Table identifier_table) {
        String[][] table = getTable();
        String[] Token_Type = getToken_Type();
        String[] Token_Text = getToken_Text();
        String[][] Token = new String[no_Token][2];
        for (int i = 0; i < no_identifier; i++) {
            Token[i][0] = table[i][1];
            Token[i][1] = table[i][2];
        }

        int Table_index = no_identifier;
        for(int j = 0;j < no_Token;j++){
            if((Token_Type[j] != "IDENTICAL")){
                Token[Table_index][0] = Token_Text[j];
                Token[Table_index++][1] = Token_Type[j];
            }

        }

        return Token;
    }

    public void Show_Table(){
        for(int i = 0;i < no_identifier;i++){
            for(int j = 0;j < no_Table_Col;j++){
                System.out.print(getTable()[i][j]);
            }
            System.out.print("\n");
        }
    }
}