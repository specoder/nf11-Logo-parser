// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\workspace\\tp2\\src\\logoparsing\\Logo.g 2012-06-02 12:04:22

  package logoparsing;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int PROGRAMME=4;
    public static final int AV=5;
    public static final int TD=6;
    public static final int TG=7;
    public static final int REC=8;
    public static final int CO=9;
    public static final int CF=10;
    public static final int PO=11;
    public static final int PF=12;
    public static final int FPOS=13;
    public static final int FCAP=14;
    public static final int VE=15;
    public static final int LC=16;
    public static final int BC=17;
    public static final int FCC=18;
    public static final int PLUS=19;
    public static final int MOINS=20;
    public static final int MULT=21;
    public static final int DIV=22;
    public static final int EXP=23;
    public static final int SUP=24;
    public static final int INF=25;
    public static final int EQU=26;
    public static final int SUPEQU=27;
    public static final int INFEQU=28;
    public static final int SI=29;
    public static final int DONNE=30;
    public static final int QUOT=31;
    public static final int COLON=32;
    public static final int REPETE=33;
    public static final int TANTQUE=34;
    public static final int LET=35;
    public static final int ID=36;
    public static final int INT=37;
    public static final int WS=38;

    // delegates
    // delegators

    public LogoLexer() {;} 
    public LogoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\workspace\\tp2\\src\\logoparsing\\Logo.g"; }

    // $ANTLR start "AV"
    public final void mAV() throws RecognitionException {
        try {
            int _type = AV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:7:4: ( 'AV' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:7:6: 'AV'
            {
            match("AV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AV"

    // $ANTLR start "TD"
    public final void mTD() throws RecognitionException {
        try {
            int _type = TD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:8:4: ( 'TD' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:8:6: 'TD'
            {
            match("TD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TD"

    // $ANTLR start "TG"
    public final void mTG() throws RecognitionException {
        try {
            int _type = TG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:9:4: ( 'TG' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:9:6: 'TG'
            {
            match("TG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TG"

    // $ANTLR start "REC"
    public final void mREC() throws RecognitionException {
        try {
            int _type = REC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:10:5: ( 'REC' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:10:7: 'REC'
            {
            match("REC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REC"

    // $ANTLR start "CO"
    public final void mCO() throws RecognitionException {
        try {
            int _type = CO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:11:4: ( '[' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:11:6: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CO"

    // $ANTLR start "CF"
    public final void mCF() throws RecognitionException {
        try {
            int _type = CF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:12:4: ( ']' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:12:6: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CF"

    // $ANTLR start "PO"
    public final void mPO() throws RecognitionException {
        try {
            int _type = PO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:13:4: ( '(' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:13:6: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PO"

    // $ANTLR start "PF"
    public final void mPF() throws RecognitionException {
        try {
            int _type = PF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:14:4: ( ')' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:14:6: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PF"

    // $ANTLR start "FPOS"
    public final void mFPOS() throws RecognitionException {
        try {
            int _type = FPOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:15:6: ( 'FPOS' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:15:8: 'FPOS'
            {
            match("FPOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FPOS"

    // $ANTLR start "FCAP"
    public final void mFCAP() throws RecognitionException {
        try {
            int _type = FCAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:16:6: ( 'FCAP' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:16:8: 'FCAP'
            {
            match("FCAP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCAP"

    // $ANTLR start "VE"
    public final void mVE() throws RecognitionException {
        try {
            int _type = VE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:17:4: ( 'VE' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:17:6: 'VE'
            {
            match("VE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VE"

    // $ANTLR start "LC"
    public final void mLC() throws RecognitionException {
        try {
            int _type = LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:18:4: ( 'LC' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:18:6: 'LC'
            {
            match("LC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LC"

    // $ANTLR start "BC"
    public final void mBC() throws RecognitionException {
        try {
            int _type = BC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:19:4: ( 'BC' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:19:6: 'BC'
            {
            match("BC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BC"

    // $ANTLR start "FCC"
    public final void mFCC() throws RecognitionException {
        try {
            int _type = FCC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:20:5: ( 'FCC' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:20:7: 'FCC'
            {
            match("FCC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FCC"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:21:6: ( '+' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:21:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MOINS"
    public final void mMOINS() throws RecognitionException {
        try {
            int _type = MOINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:22:7: ( '-' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOINS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:23:6: ( '*' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:23:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:24:5: ( '/' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:24:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            int _type = EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:25:5: ( '^' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:25:7: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "SUP"
    public final void mSUP() throws RecognitionException {
        try {
            int _type = SUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:26:5: ( '>' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:26:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUP"

    // $ANTLR start "INF"
    public final void mINF() throws RecognitionException {
        try {
            int _type = INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:27:5: ( '<' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:27:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INF"

    // $ANTLR start "EQU"
    public final void mEQU() throws RecognitionException {
        try {
            int _type = EQU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:28:5: ( '=' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:28:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQU"

    // $ANTLR start "SUPEQU"
    public final void mSUPEQU() throws RecognitionException {
        try {
            int _type = SUPEQU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:29:8: ( '>=' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:29:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPEQU"

    // $ANTLR start "INFEQU"
    public final void mINFEQU() throws RecognitionException {
        try {
            int _type = INFEQU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:30:8: ( '<=' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:30:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INFEQU"

    // $ANTLR start "SI"
    public final void mSI() throws RecognitionException {
        try {
            int _type = SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:31:4: ( 'SI' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:31:6: 'SI'
            {
            match("SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SI"

    // $ANTLR start "DONNE"
    public final void mDONNE() throws RecognitionException {
        try {
            int _type = DONNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:32:7: ( 'DONNE' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:32:9: 'DONNE'
            {
            match("DONNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DONNE"

    // $ANTLR start "QUOT"
    public final void mQUOT() throws RecognitionException {
        try {
            int _type = QUOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:33:6: ( '\"' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:33:8: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:34:7: ( ':' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:34:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "REPETE"
    public final void mREPETE() throws RecognitionException {
        try {
            int _type = REPETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:35:8: ( 'REPETE' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:35:10: 'REPETE'
            {
            match("REPETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPETE"

    // $ANTLR start "TANTQUE"
    public final void mTANTQUE() throws RecognitionException {
        try {
            int _type = TANTQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:36:9: ( 'TANTQUE' )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:36:11: 'TANTQUE'
            {
            match("TANTQUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TANTQUE"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:62:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:62:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:63:4: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '-' )* )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:63:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:63:26: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:64:5: ( ( '0' .. '9' )+ )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:64:7: ( '0' .. '9' )+
            {
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:64:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:64:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:5: ( ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+ )
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:7: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            {
            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:7: ( ' ' | '\\t' | ( ( '\\r' )? '\\n' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt4=1;
                    }
                    break;
                case '\t':
                    {
                    alt4=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:8: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:12: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:17: ( ( '\\r' )? '\\n' )
            	    {
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:17: ( ( '\\r' )? '\\n' )
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:18: ( '\\r' )? '\\n'
            	    {
            	    // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:18: ( '\\r' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\r') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:65:18: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:8: ( AV | TD | TG | REC | CO | CF | PO | PF | FPOS | FCAP | VE | LC | BC | FCC | PLUS | MOINS | MULT | DIV | EXP | SUP | INF | EQU | SUPEQU | INFEQU | SI | DONNE | QUOT | COLON | REPETE | TANTQUE | LET | ID | INT | WS )
        int alt5=34;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:10: AV
                {
                mAV(); 

                }
                break;
            case 2 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:13: TD
                {
                mTD(); 

                }
                break;
            case 3 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:16: TG
                {
                mTG(); 

                }
                break;
            case 4 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:19: REC
                {
                mREC(); 

                }
                break;
            case 5 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:23: CO
                {
                mCO(); 

                }
                break;
            case 6 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:26: CF
                {
                mCF(); 

                }
                break;
            case 7 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:29: PO
                {
                mPO(); 

                }
                break;
            case 8 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:32: PF
                {
                mPF(); 

                }
                break;
            case 9 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:35: FPOS
                {
                mFPOS(); 

                }
                break;
            case 10 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:40: FCAP
                {
                mFCAP(); 

                }
                break;
            case 11 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:45: VE
                {
                mVE(); 

                }
                break;
            case 12 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:48: LC
                {
                mLC(); 

                }
                break;
            case 13 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:51: BC
                {
                mBC(); 

                }
                break;
            case 14 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:54: FCC
                {
                mFCC(); 

                }
                break;
            case 15 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:58: PLUS
                {
                mPLUS(); 

                }
                break;
            case 16 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:63: MOINS
                {
                mMOINS(); 

                }
                break;
            case 17 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:69: MULT
                {
                mMULT(); 

                }
                break;
            case 18 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:74: DIV
                {
                mDIV(); 

                }
                break;
            case 19 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:78: EXP
                {
                mEXP(); 

                }
                break;
            case 20 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:82: SUP
                {
                mSUP(); 

                }
                break;
            case 21 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:86: INF
                {
                mINF(); 

                }
                break;
            case 22 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:90: EQU
                {
                mEQU(); 

                }
                break;
            case 23 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:94: SUPEQU
                {
                mSUPEQU(); 

                }
                break;
            case 24 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:101: INFEQU
                {
                mINFEQU(); 

                }
                break;
            case 25 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:108: SI
                {
                mSI(); 

                }
                break;
            case 26 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:111: DONNE
                {
                mDONNE(); 

                }
                break;
            case 27 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:117: QUOT
                {
                mQUOT(); 

                }
                break;
            case 28 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:122: COLON
                {
                mCOLON(); 

                }
                break;
            case 29 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:128: REPETE
                {
                mREPETE(); 

                }
                break;
            case 30 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:135: TANTQUE
                {
                mTANTQUE(); 

                }
                break;
            case 31 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:143: LET
                {
                mLET(); 

                }
                break;
            case 32 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:147: ID
                {
                mID(); 

                }
                break;
            case 33 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:150: INT
                {
                mINT(); 

                }
                break;
            case 34 :
                // D:\\workspace\\tp2\\src\\logoparsing\\Logo.g:1:154: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\3\34\4\uffff\4\34\5\uffff\1\50\1\52\1\uffff\2\34\2\uffff"+
        "\1\34\2\uffff\1\55\2\uffff\1\56\1\57\4\35\1\66\1\67\1\70\4\uffff"+
        "\1\71\1\35\3\uffff\1\35\1\74\3\35\1\100\4\uffff\2\35\1\uffff\1\35"+
        "\1\104\1\105\1\uffff\3\35\2\uffff\1\111\1\35\1\113\1\uffff\1\114"+
        "\2\uffff";
    static final String DFA5_eofS =
        "\115\uffff";
    static final String DFA5_minS =
        "\1\11\3\55\4\uffff\4\55\5\uffff\2\75\1\uffff\2\55\2\uffff\1\55"+
        "\2\uffff\1\55\2\uffff\2\55\1\116\1\103\1\117\1\101\3\55\4\uffff"+
        "\1\55\1\116\3\uffff\1\124\1\55\1\105\1\123\1\120\1\55\4\uffff\1"+
        "\116\1\121\1\uffff\1\124\2\55\1\uffff\1\105\1\125\1\105\2\uffff"+
        "\1\55\1\105\1\55\1\uffff\1\55\2\uffff";
    static final String DFA5_maxS =
        "\4\172\4\uffff\4\172\5\uffff\2\75\1\uffff\2\172\2\uffff\1\172\2"+
        "\uffff\1\172\2\uffff\2\172\1\116\1\120\1\117\1\103\3\172\4\uffff"+
        "\1\172\1\116\3\uffff\1\124\1\172\1\105\1\123\1\120\1\172\4\uffff"+
        "\1\116\1\121\1\uffff\1\124\2\172\1\uffff\1\105\1\125\1\105\2\uffff"+
        "\1\172\1\105\1\172\1\uffff\1\172\2\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\5\1\6\1\7\1\10\4\uffff\1\17\1\20\1\21\1\22\1\23\2\uffff"+
        "\1\26\2\uffff\1\33\1\34\1\uffff\1\41\1\42\1\uffff\1\37\1\40\11\uffff"+
        "\1\27\1\24\1\30\1\25\2\uffff\1\1\1\2\1\3\6\uffff\1\13\1\14\1\15"+
        "\1\31\2\uffff\1\4\3\uffff\1\16\3\uffff\1\11\1\12\3\uffff\1\32\1"+
        "\uffff\1\35\1\36";
    static final String DFA5_specialS =
        "\115\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\uffff\1\26\5\uffff\1\6\1"+
            "\7\1\16\1\14\1\uffff\1\15\1\uffff\1\17\12\31\1\27\1\uffff\1"+
            "\22\1\23\1\21\2\uffff\1\1\1\13\1\30\1\25\1\30\1\10\5\30\1\12"+
            "\5\30\1\3\1\24\1\2\1\30\1\11\4\30\1\4\1\uffff\1\5\1\20\2\uffff"+
            "\32\30",
            "\1\35\2\uffff\12\35\7\uffff\25\35\1\33\4\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\1\40\2\35\1\36\2\35\1\37\23\35"+
            "\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\4\35\1\41\25\35\6\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\35\2\uffff\12\35\7\uffff\2\35\1\43\14\35\1\42\12\35\6\uffff"+
            "\32\35",
            "\1\35\2\uffff\12\35\7\uffff\4\35\1\44\25\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\2\35\1\45\27\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\2\35\1\46\27\35\6\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\51",
            "",
            "\1\35\2\uffff\12\35\7\uffff\10\35\1\53\21\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\16\35\1\54\13\35\6\uffff\32\35",
            "",
            "",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\60",
            "\1\61\14\uffff\1\62",
            "\1\63",
            "\1\64\1\uffff\1\65",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\72",
            "",
            "",
            "",
            "\1\73",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\112",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\1\35\2\uffff\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AV | TD | TG | REC | CO | CF | PO | PF | FPOS | FCAP | VE | LC | BC | FCC | PLUS | MOINS | MULT | DIV | EXP | SUP | INF | EQU | SUPEQU | INFEQU | SI | DONNE | QUOT | COLON | REPETE | TANTQUE | LET | ID | INT | WS );";
        }
    }
 

}