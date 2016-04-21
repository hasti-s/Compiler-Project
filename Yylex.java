/* The following code was generated by JFlex 1.6.0 */

package jSHLang;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
  

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>E:/University/BSc/6th Semester/Compiler Design/Project/SHLang.lex</tt>
 */
class Yylex {

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
    "\12\0\1\57\1\57\1\57\1\57\27\0\1\56\2\0\1\42\1\43"+
    "\1\54\1\52\1\40\1\53\1\0\1\55\1\3\11\2\1\37\1\36"+
    "\1\50\1\41\1\51\2\0\3\1\1\12\1\7\1\1\1\14\1\1"+
    "\1\13\4\1\1\4\1\5\2\1\1\10\1\1\1\15\5\1\1\6"+
    "\1\44\1\0\1\45\1\0\1\11\1\0\1\22\1\1\1\26\1\30"+
    "\1\27\1\1\1\21\1\35\1\24\2\1\1\34\1\23\1\25\1\20"+
    "\1\16\1\1\1\17\1\1\1\32\1\31\1\1\1\1\1\1\1\33"+
    "\1\1\1\46\1\0\1\47\7\0\1\57\u1fa2\0\1\57\1\57\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\7\2\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\2\1\0"+
    "\7\2\1\25\1\26\1\27\1\30\1\2\1\0\4\2"+
    "\1\31\3\2\1\0\3\2\1\32\1\33\1\34\2\2"+
    "\1\0\1\3\2\2\1\35\1\2\1\0\3\2\1\0"+
    "\1\36\2\2\1\0\1\2\2\0\1\37\10\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[87];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\60\0\u0210\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u0240\0\u0270\0\60"+
    "\0\60\0\60\0\60\0\60\0\u02a0\0\u02d0\0\u0300\0\u0330"+
    "\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\60\0\60\0\60"+
    "\0\60\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540\0\140"+
    "\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\140"+
    "\0\140\0\140\0\u06c0\0\u06f0\0\u0720\0\140\0\u0750\0\u0780"+
    "\0\140\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\140"+
    "\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\140\0\u09f0"+
    "\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u0b40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[87];
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
    "\1\2\1\3\1\4\1\2\5\3\1\2\1\5\3\3"+
    "\1\6\1\7\3\3\1\10\1\11\1\3\1\12\1\13"+
    "\6\3\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\62\0\1\3\1\0\1\3\1\35\4\3"+
    "\1\0\24\3\25\0\1\4\1\36\54\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\1\3\1\37\22\3\23\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\5\3\1\40"+
    "\16\3\23\0\1\3\1\0\1\3\1\35\4\3\1\0"+
    "\15\3\1\41\6\3\23\0\1\3\1\0\1\3\1\35"+
    "\4\3\1\0\10\3\1\42\13\3\23\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\13\3\1\43\10\3\23\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\23\3\1\44"+
    "\23\0\1\3\1\0\1\3\1\35\4\3\1\0\11\3"+
    "\1\45\12\3\63\0\1\46\57\0\1\47\7\0\1\50"+
    "\47\0\1\51\17\0\1\3\1\0\1\3\1\35\1\52"+
    "\3\3\1\0\24\3\27\0\1\53\53\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\2\3\1\54\21\3\23\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\6\3\1\55"+
    "\15\3\23\0\1\3\1\0\1\3\1\35\4\3\1\0"+
    "\10\3\1\56\13\3\23\0\1\3\1\0\1\3\1\35"+
    "\4\3\1\0\12\3\1\57\11\3\23\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\20\3\1\60\3\3\23\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\10\3\1\61"+
    "\13\3\23\0\1\3\1\0\1\3\1\35\4\3\1\0"+
    "\4\3\1\62\17\3\23\0\1\3\1\0\1\3\1\63"+
    "\4\3\1\0\24\3\26\0\1\64\54\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\1\3\1\65\22\3\23\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\7\3\1\66"+
    "\4\3\1\67\7\3\23\0\1\3\1\0\1\3\1\35"+
    "\4\3\1\0\22\3\1\70\1\3\23\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\13\3\1\71\10\3\23\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\5\3\1\72"+
    "\16\3\23\0\1\3\1\0\1\3\1\35\4\3\1\0"+
    "\20\3\1\73\3\3\23\0\1\3\1\0\1\3\1\35"+
    "\1\52\1\74\2\3\1\0\24\3\30\0\1\75\52\0"+
    "\1\3\1\0\1\3\1\35\4\3\1\0\3\3\1\76"+
    "\20\3\23\0\1\3\1\0\1\3\1\35\4\3\1\0"+
    "\5\3\1\77\16\3\23\0\1\3\1\0\1\3\1\35"+
    "\4\3\1\0\15\3\1\100\6\3\23\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\21\3\1\101\2\3\23\0"+
    "\1\3\1\0\1\3\1\35\2\3\1\102\1\3\1\0"+
    "\24\3\31\0\1\103\51\0\1\3\1\0\1\3\1\35"+
    "\4\3\1\0\10\3\1\104\13\3\23\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\16\3\1\105\5\3\23\0"+
    "\1\3\1\0\1\3\1\35\3\3\1\106\1\0\24\3"+
    "\32\0\1\107\50\0\1\3\1\0\1\3\1\35\4\3"+
    "\1\0\11\3\1\110\12\3\23\0\1\3\1\0\1\3"+
    "\1\35\4\3\1\0\17\3\1\111\4\3\23\0\1\3"+
    "\1\0\1\3\1\35\1\112\3\3\1\0\24\3\27\0"+
    "\1\113\53\0\1\3\1\0\1\3\1\35\4\3\1\0"+
    "\5\3\1\114\16\3\23\0\1\3\1\0\1\3\1\35"+
    "\4\3\1\115\24\3\33\0\1\116\47\0\1\3\1\0"+
    "\1\3\1\35\4\3\1\0\15\3\1\117\6\3\34\0"+
    "\1\120\57\0\1\121\60\0\1\122\57\0\1\123\60\0"+
    "\1\124\57\0\1\125\56\0\1\126\57\0\1\127\61\0"+
    "\1\3\57\0\1\4\42\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2928];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\11\1\1\11\1\1\10\11\2\1\5\11"+
    "\1\1\1\0\7\1\4\11\1\1\1\0\10\1\1\0"+
    "\10\1\1\0\5\1\1\0\3\1\1\0\3\1\1\0"+
    "\1\1\2\0\1\1\10\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[87];
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
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
    while (i < 192) {
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
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { System.out.println("what?!");
          }
        case 32: break;
        case 2: 
          { System.out.println(yytext() + "\t" + "IDENTIFIER\t" + "Sybmbol Table Entry");
          }
        case 33: break;
        case 3: 
          { System.out.println(yytext() + "\t" + "INTEGER_CONSTANT\t" + "-");
          }
        case 34: break;
        case 4: 
          { System.out.println(yytext() + "\t" + "SEMICOLON_KW\t" + '-');
          }
        case 35: break;
        case 5: 
          { System.out.println(yytext() + "\t" + "COLON_KW\t" + '-');
          }
        case 36: break;
        case 6: 
          { System.out.println(yytext() + "\t" + "COMMA_KW\t" + '-');
          }
        case 37: break;
        case 7: 
          { System.out.println(yytext() + "\t" + "EQ_KW\t" + '-');
          }
        case 38: break;
        case 8: 
          { System.out.println(yytext() + "\t" + "LP_KW\t" + '-');
          }
        case 39: break;
        case 9: 
          { System.out.println(yytext() + "\t" + "RP_KW\t" + '-');
          }
        case 40: break;
        case 10: 
          { System.out.println(yytext() + "\t" + "LB_KW\t" + '-');
          }
        case 41: break;
        case 11: 
          { System.out.println(yytext() + "\t" + "RB_KW\t" + '-');
          }
        case 42: break;
        case 12: 
          { System.out.println(yytext() + "\t" + "LCB_KW\t" + '-');
          }
        case 43: break;
        case 13: 
          { System.out.println(yytext() + "\t" + "RCB_KW\t" + '-');
          }
        case 44: break;
        case 14: 
          { System.out.println(yytext() + "\t" + "LT_KW\t" + '-');
          }
        case 45: break;
        case 15: 
          { System.out.println(yytext() + "\t" + "GT_KW\t" + '-');
          }
        case 46: break;
        case 16: 
          { System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
          }
        case 47: break;
        case 17: 
          { System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
          }
        case 48: break;
        case 18: 
          { System.out.println(yytext() + "\t" + "MUL_KW\t" + '-');
          }
        case 49: break;
        case 19: 
          { System.out.println(yytext() + "\t" + "DIV_KW\t" + '-');
          }
        case 50: break;
        case 20: 
          { System.out.println(yytext() + "\t" + "MOD_KW\t" + '-');
          }
        case 51: break;
        case 21: 
          { System.out.println(yytext() + "\t" + "ASS_KW\t" + '-');
          }
        case 52: break;
        case 22: 
          { System.out.println(yytext() + "\t" + "LE_KW\t" + '-');
          }
        case 53: break;
        case 23: 
          { System.out.println(yytext() + "\t" + "NE_KW\t" + '-');
          }
        case 54: break;
        case 24: 
          { System.out.println(yytext() + "\t" + "GE_KW\t" + '-');
          }
        case 55: break;
        case 25: 
          { System.out.println(yytext() + "\t" + "INTEGER_KW\t" + '-');
          }
        case 56: break;
        case 26: 
          { System.out.println(yytext() + "\t" + "REAL_KW\t" + '-');
          }
        case 57: break;
        case 27: 
          { System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
          }
        case 58: break;
        case 28: 
          { System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');
          }
        case 59: break;
        case 29: 
          { System.out.println(yytext() + "\t" + "EMPTY_KW\t" + '-');
          }
        case 60: break;
        case 30: 
          { System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
          }
        case 61: break;
        case 31: 
          { System.out.println(yytext() + "\t" + "PROCEDURE_KW\t" + '-');
          }
        case 62: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}