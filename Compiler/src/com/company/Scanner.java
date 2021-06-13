/* The following code was generated by JFlex 1.6.1 */

package com.company;
import static com.company.Token.*;
import java.io.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/amirreza dolatpour/Documents/ai-n-queens-master/Compiler/src/com/company/Scanner.flex</tt>
 */
class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\3\2\0\1\1\22\0\1\42\1\62\1\20\1\0"+
    "\1\16\1\65\1\66\1\17\1\51\1\52\1\64\1\13\1\0\1\63"+
    "\1\14\1\70\1\4\3\25\4\6\2\5\1\0\1\71\1\61\1\60"+
    "\1\57\2\0\3\10\1\15\1\12\1\15\5\16\1\11\6\16\1\50"+
    "\4\16\1\7\2\16\1\55\1\21\1\56\1\0\1\16\1\0\1\40"+
    "\1\22\1\37\1\44\1\34\1\23\1\47\1\31\1\32\1\16\1\41"+
    "\1\33\1\16\1\24\1\26\1\45\1\16\1\27\1\35\1\36\1\46"+
    "\1\43\1\30\1\7\2\16\1\53\1\67\1\54\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\2\2\1\3\1\4\3\0\17\3\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\0\1\16\1\17\1\20\2\0\1\21\1\22\1\2"+
    "\2\0\1\2\1\0\2\23\1\24\2\0\1\25\1\0"+
    "\10\3\1\26\17\3\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\0\1\36\1\2\1\23\1\0\1\37"+
    "\2\0\2\3\1\40\5\3\1\41\16\3\1\0\4\3"+
    "\1\42\2\3\1\43\1\44\2\3\1\45\1\46\1\3"+
    "\1\47\1\50\1\51\4\3\1\36\1\3\1\52\1\53"+
    "\1\54\1\3\1\55\1\3\1\0\10\3\1\56\1\57"+
    "\1\0\1\60\1\61\1\3\1\62\1\3\1\63\1\64"+
    "\1\65\1\66\1\3\1\67\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2\0\u032c\0\u0366"+
    "\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\u0536"+
    "\0\u0570\0\164\0\164\0\164\0\164\0\164\0\164\0\u05aa"+
    "\0\u05e4\0\u061e\0\u0658\0\u0692\0\164\0\164\0\u06cc\0\u0706"+
    "\0\u0740\0\164\0\u077a\0\u07b4\0\u07ee\0\164\0\u0828\0\u0862"+
    "\0\164\0\164\0\u089c\0\u08d6\0\164\0\u0910\0\u094a\0\u0984"+
    "\0\u09be\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0122\0\u0b1a"+
    "\0\u0b54\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea"+
    "\0\u0d24\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\164\0\164"+
    "\0\164\0\164\0\164\0\164\0\164\0\u0e80\0\u0eba\0\u0ef4"+
    "\0\u0f2e\0\u0f68\0\164\0\u0fa2\0\u0fdc\0\u1016\0\u1050\0\u0122"+
    "\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172\0\u0122\0\u11ac\0\u11e6"+
    "\0\u1220\0\u125a\0\u1294\0\u12ce\0\u1308\0\u1342\0\u137c\0\u13b6"+
    "\0\u13f0\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586"+
    "\0\u15c0\0\u0122\0\u15fa\0\u1634\0\u0122\0\u166e\0\u16a8\0\u16e2"+
    "\0\u0122\0\u0122\0\u171c\0\u0122\0\u0122\0\u0122\0\u1756\0\u1790"+
    "\0\u17ca\0\u1804\0\164\0\u183e\0\u0122\0\u0122\0\u0122\0\u1878"+
    "\0\u0122\0\u18b2\0\u18ec\0\u1926\0\u1960\0\u199a\0\u19d4\0\u1a0e"+
    "\0\u1a48\0\u1a82\0\u1abc\0\u0122\0\u0122\0\u1af6\0\u0122\0\u0122"+
    "\0\u1b30\0\u0122\0\u1b6a\0\u0122\0\u0122\0\u0122\0\164\0\u1ba4"+
    "\0\u0122\0\u0122";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\2\3\1\4\2\5\4\6\1\7\1\10"+
    "\2\6\1\11\1\12\1\0\1\13\1\14\1\15\1\5"+
    "\1\6\1\16\1\17\1\6\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\2\6\1\3\1\26\1\27\1\30\2\6"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\3\0\1\3\164\0\1\53\1\54\1\53"+
    "\1\55\1\0\1\56\1\57\1\0\1\60\1\61\5\0"+
    "\1\61\1\0\1\53\5\0\1\56\1\57\7\0\1\61"+
    "\31\0\3\5\2\0\1\56\1\57\1\0\1\60\1\61"+
    "\5\0\1\61\1\0\1\5\5\0\1\56\1\57\7\0"+
    "\1\61\31\0\7\6\2\0\2\6\3\0\20\6\1\0"+
    "\6\6\34\0\1\62\62\0\3\60\16\0\1\60\44\0"+
    "\1\63\1\0\1\63\1\0\13\63\1\0\1\63\1\64"+
    "\50\63\1\12\1\0\1\12\1\0\14\12\1\65\1\66"+
    "\50\12\4\0\7\6\2\0\2\6\3\0\4\6\1\67"+
    "\1\70\12\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\4\6\1\71\4\6\1\72\4\6\1\73\1\6"+
    "\1\0\6\6\25\0\7\6\2\0\2\6\3\0\20\6"+
    "\1\0\3\6\1\74\2\6\25\0\7\6\2\0\2\6"+
    "\3\0\12\6\1\75\5\6\1\0\6\6\25\0\7\6"+
    "\2\0\2\6\3\0\7\6\1\76\10\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\1\6\1\77\1\100"+
    "\15\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\4\6\1\101\13\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\11\6\1\102\6\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\6\6\1\103\5\6\1\104"+
    "\3\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\5\6\1\105\1\6\1\106\10\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\4\6\1\107\2\6\1\110"+
    "\6\6\1\111\1\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\4\6\1\112\13\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\4\6\1\113\5\6\1\114"+
    "\5\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\20\6\1\0\3\6\1\115\2\6\25\0\7\6\2\0"+
    "\2\6\3\0\14\6\1\116\3\6\1\0\6\6\101\0"+
    "\1\117\71\0\1\120\71\0\1\121\71\0\1\122\74\0"+
    "\1\123\74\0\1\124\72\0\1\125\66\0\1\126\3\0"+
    "\1\127\5\0\1\53\1\54\1\53\2\0\1\56\1\57"+
    "\1\0\1\60\1\61\5\0\1\61\1\0\1\53\5\0"+
    "\1\56\1\57\7\0\1\61\31\0\3\54\3\0\1\57"+
    "\1\0\1\60\1\61\5\0\1\61\1\0\1\54\6\0"+
    "\1\57\7\0\1\61\31\0\3\130\1\0\1\130\1\0"+
    "\1\130\2\0\1\130\4\0\2\130\1\0\1\130\6\0"+
    "\1\130\2\0\2\130\3\0\1\130\31\0\3\131\4\0"+
    "\1\132\11\0\1\131\35\0\1\132\12\0\3\60\3\0"+
    "\1\57\2\0\1\61\5\0\1\61\1\0\1\60\6\0"+
    "\1\57\7\0\1\61\44\0\1\133\56\0\1\134\1\0"+
    "\1\135\10\0\6\63\1\134\1\0\1\63\6\0\1\63"+
    "\37\0\1\12\1\0\1\12\10\0\7\12\1\0\1\12"+
    "\6\0\1\12\37\0\7\6\2\0\2\6\3\0\4\6"+
    "\1\136\13\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\12\6\1\137\5\6\1\0\6\6\25\0\7\6"+
    "\2\0\2\6\3\0\5\6\1\140\12\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\4\6\1\141\13\6"+
    "\1\0\6\6\25\0\7\6\2\0\2\6\3\0\11\6"+
    "\1\142\6\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\11\6\1\143\6\6\1\0\6\6\25\0\7\6"+
    "\2\0\2\6\3\0\14\6\1\144\3\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\10\6\1\145\7\6"+
    "\1\0\6\6\25\0\7\6\2\0\2\6\3\0\14\6"+
    "\1\146\3\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\2\6\1\147\15\6\1\0\6\6\25\0\7\6"+
    "\2\0\2\6\3\0\13\6\1\150\4\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\10\6\1\151\7\6"+
    "\1\0\6\6\25\0\7\6\2\0\2\6\3\0\16\6"+
    "\1\152\1\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\20\6\1\0\3\6\1\153\2\6\25\0\7\6"+
    "\2\0\2\6\3\0\12\6\1\154\5\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\2\6\1\155\15\6"+
    "\1\0\6\6\25\0\7\6\2\0\2\6\3\0\16\6"+
    "\1\156\1\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\13\6\1\157\4\6\1\0\6\6\25\0\7\6"+
    "\2\0\2\6\3\0\10\6\1\160\7\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\20\6\1\0\3\6"+
    "\1\161\2\6\25\0\7\6\2\0\2\6\3\0\1\6"+
    "\1\162\16\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\1\163\17\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\5\6\1\164\12\6\1\0\6\6\21\0"+
    "\64\126\1\165\5\126\1\127\1\0\1\127\1\0\66\127"+
    "\4\0\3\130\1\0\1\130\1\56\1\130\2\0\1\130"+
    "\4\0\2\130\1\0\1\130\5\0\1\56\1\130\2\0"+
    "\2\130\3\0\1\130\31\0\3\131\6\0\1\61\5\0"+
    "\1\61\1\0\1\131\16\0\1\61\31\0\3\131\16\0"+
    "\1\131\50\0\1\135\1\0\1\135\10\0\1\133\5\0"+
    "\1\135\50\0\1\63\1\0\1\63\10\0\1\133\5\0"+
    "\1\63\50\0\7\6\2\0\2\6\3\0\11\6\1\166"+
    "\6\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\16\6\1\167\1\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\16\6\1\170\1\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\13\6\1\171\4\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\11\6\1\172"+
    "\6\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\20\6\1\0\3\6\1\173\2\6\25\0\7\6\2\0"+
    "\2\6\3\0\11\6\1\174\6\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\20\6\1\0\4\6\1\175"+
    "\1\6\25\0\7\6\2\0\2\6\3\0\12\6\1\176"+
    "\5\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\14\6\1\177\3\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\14\6\1\200\3\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\12\6\1\201\5\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\2\6\1\202"+
    "\15\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\14\6\1\203\3\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\5\6\1\204\12\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\12\6\1\205\5\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\20\6\1\0"+
    "\1\6\1\206\4\6\25\0\7\6\2\0\2\6\3\0"+
    "\1\207\17\6\1\0\6\6\25\0\7\6\2\0\2\6"+
    "\3\0\16\6\1\210\1\6\1\0\6\6\25\0\7\6"+
    "\2\0\2\6\3\0\11\6\1\211\6\6\1\0\6\6"+
    "\25\0\7\6\2\0\2\6\3\0\10\6\1\212\7\6"+
    "\1\0\6\6\21\0\64\126\1\165\3\126\1\213\1\126"+
    "\4\0\7\6\2\0\2\6\3\0\12\6\1\214\5\6"+
    "\1\0\6\6\25\0\7\6\2\0\2\6\3\0\17\6"+
    "\1\215\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\14\6\1\216\3\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\12\6\1\217\5\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\5\6\1\220\12\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\12\6\1\221"+
    "\5\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\10\6\1\222\7\6\1\223\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\15\6\1\224\2\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\10\6\1\225\7\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\10\6\1\226"+
    "\7\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\11\6\1\227\6\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\20\6\1\0\3\6\1\230\2\6\25\0"+
    "\7\6\2\0\2\6\3\0\10\6\1\231\7\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\2\6\1\232"+
    "\15\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\16\6\1\233\1\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\2\6\1\234\15\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\1\6\1\235\16\6\1\0"+
    "\6\6\53\0\1\236\43\0\7\6\2\0\2\6\3\0"+
    "\7\6\1\237\10\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\15\6\1\240\2\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\2\6\1\241\15\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\12\6\1\242"+
    "\5\6\1\0\6\6\25\0\7\6\2\0\2\6\3\0"+
    "\11\6\1\243\6\6\1\0\6\6\25\0\7\6\2\0"+
    "\2\6\3\0\15\6\1\244\2\6\1\0\6\6\25\0"+
    "\7\6\2\0\2\6\3\0\20\6\1\0\4\6\1\245"+
    "\1\6\25\0\7\6\2\0\2\6\3\0\2\6\1\246"+
    "\15\6\1\0\6\6\44\0\1\247\52\0\7\6\2\0"+
    "\2\6\3\0\20\6\1\0\3\6\1\250\2\6\25\0"+
    "\7\6\2\0\2\6\3\0\14\6\1\251\3\6\1\0"+
    "\6\6\25\0\7\6\2\0\2\6\3\0\12\6\1\252"+
    "\5\6\1\0\6\6\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7134];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\4\1\3\0\17\1\6\11\3\1"+
    "\1\0\1\1\2\11\2\0\1\1\1\11\1\1\2\0"+
    "\1\11\1\0\1\1\2\11\2\0\1\11\1\0\30\1"+
    "\7\11\1\0\3\1\1\0\1\11\2\0\27\1\1\0"+
    "\25\1\1\11\7\1\1\0\12\1\1\0\10\1\1\11"+
    "\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 57: break;
          case 2: 
            { return INTEGER_NUMBER;
            }
          case 58: break;
          case 3: 
            { return IDENTICAL;
            }
          case 59: break;
          case 4: 
            { return PLUS;
            }
          case 60: break;
          case 5: 
            { return LEFT_PARENTHESIS;
            }
          case 61: break;
          case 6: 
            { return RIGHT_PARENTHESIS;
            }
          case 62: break;
          case 7: 
            { return LEFTCURLY;
            }
          case 63: break;
          case 8: 
            { return RIGHTCURLY;
            }
          case 64: break;
          case 9: 
            { return LEFTSQ;
            }
          case 65: break;
          case 10: 
            { return RIGHTSQ;
            }
          case 66: break;
          case 11: 
            { return GREATER;
            }
          case 67: break;
          case 12: 
            { return ASSIGNMENT;
            }
          case 68: break;
          case 13: 
            { return LOWER;
            }
          case 69: break;
          case 14: 
            { return MINUS;
            }
          case 70: break;
          case 15: 
            { return PRODUCTION;
            }
          case 71: break;
          case 16: 
            { return REMAINED;
            }
          case 72: break;
          case 17: 
            { return DEVISION;
            }
          case 73: break;
          case 18: 
            { return SEMICOLON;
            }
          case 74: break;
          case 19: 
            { return FLOAT_NUMBER;
            }
          case 75: break;
          case 20: 
            { return PLUS_PLUS;
            }
          case 76: break;
          case 21: 
            { return String_value;
            }
          case 77: break;
          case 22: 
            { return IF;
            }
          case 78: break;
          case 23: 
            { return GREATER_EQUAL;
            }
          case 79: break;
          case 24: 
            { return COMPARISON;
            }
          case 80: break;
          case 25: 
            { return LOWER_EQUAL;
            }
          case 81: break;
          case 26: 
            { return NOT_EQUAL;
            }
          case 82: break;
          case 27: 
            { return MINUS_MINUS;
            }
          case 83: break;
          case 28: 
            { return LOGICAL_AND;
            }
          case 84: break;
          case 29: 
            { return LOGICAL_OR;
            }
          case 85: break;
          case 30: 
            { return Comment;
            }
          case 86: break;
          case 31: 
            { return Char_value;
            }
          case 87: break;
          case 32: 
            { return FOR;
            }
          case 88: break;
          case 33: 
            { return INT_TYPE;
            }
          case 89: break;
          case 34: 
            { return NULL;
            }
          case 90: break;
          case 35: 
            { return LONG_TYPE;
            }
          case 91: break;
          case 36: 
            { return ELSE;
            }
          case 92: break;
          case 37: 
            { return TRUE;
            }
          case 93: break;
          case 38: 
            { return THEN;
            }
          case 94: break;
          case 39: 
            { return CHAR_TYPE;
            }
          case 95: break;
          case 40: 
            { return CASE;
            }
          case 96: break;
          case 41: 
            { return VOID;
            }
          case 97: break;
          case 42: 
            { return BREAK;
            }
          case 98: break;
          case 43: 
            { return FLOAT_TYPE;
            }
          case 99: break;
          case 44: 
            { return FALSE;
            }
          case 100: break;
          case 45: 
            { return WHILE;
            }
          case 101: break;
          case 46: 
            { return RETURN;
            }
          case 102: break;
          case 47: 
            { return ELSEIF;
            }
          case 103: break;
          case 48: 
            { return SWITCH;
            }
          case 104: break;
          case 49: 
            { return STATIC;
            }
          case 105: break;
          case 50: 
            { return DOUBLE_TYPE;
            }
          case 106: break;
          case 51: 
            { return PUBLIC;
            }
          case 107: break;
          case 52: 
            { return STRING_TYPE;
            }
          case 108: break;
          case 53: 
            { return BOOLEAN_TYPE;
            }
          case 109: break;
          case 54: 
            { return ELSE_IF;
            }
          case 110: break;
          case 55: 
            { return DEFAULT;
            }
          case 111: break;
          case 56: 
            { return CONTINUE;
            }
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
