// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g 2012-06-02 12:04:21

  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;
  import java.util.Hashtable;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "AV", "TD", "TG", "REC", "CO", "CF", "PO", "PF", "FPOS", "FCAP", "VE", "LC", "BC", "FCC", "PLUS", "MOINS", "MULT", "DIV", "EXP", "SUP", "INF", "EQU", "SUPEQU", "INFEQU", "SI", "DONNE", "QUOT", "COLON", "REPETE", "TANTQUE", "LET", "ID", "INT", "WS"
    };
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


        public LogoTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LogoTree.tokenNames; }
    public String getGrammarFileName() { return "D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g"; }


      Traceur traceur;
      public void initialize(java.awt.Graphics g) {
        traceur = Traceur.getInstance();
        traceur.setGraphics(g);
      }
        public void push(int index) {
         ((CommonTreeNodeStream)input).push(index);
      }
      public void pop() {
         ((CommonTreeNodeStream)input).pop();
      }
      
      Hashtable<String, Double> tabVar;
      public void setTabVar(Hashtable<String, Double> t){
       tabVar = t;
      }
      



    // $ANTLR start "prog"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:31:2: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:31:7: ( ^( PROGRAMME ( instruction )* ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:31:9: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog43); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:31:21: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=AV && LA1_0<=REC)||(LA1_0>=FPOS && LA1_0<=FCC)||(LA1_0>=SI && LA1_0<=DONNE)||(LA1_0>=REPETE && LA1_0<=TANTQUE)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:31:22: instruction
                	    {
                	    pushFollow(FOLLOW_instruction_in_prog46);
                	    instruction();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            Log.appendnl("Programme principal");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "expr"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:35:1: expr returns [double v] : ( ^( PLUS x= expr y= expr ) | ^( MOINS x= expr y= expr ) | ^( MULT x= expr y= expr ) | ^( DIV x= expr y= expr ) | ^( EXP x= expr y= expr ) | INT | useID );
    public final double expr() throws RecognitionException {
        double v = 0.0;

        CommonTree INT1=null;
        double x = 0.0;

        double y = 0.0;

        String useID2 = null;


        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:35:25: ( ^( PLUS x= expr y= expr ) | ^( MOINS x= expr y= expr ) | ^( MULT x= expr y= expr ) | ^( DIV x= expr y= expr ) | ^( EXP x= expr y= expr ) | INT | useID )
            int alt2=7;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MOINS:
                {
                alt2=2;
                }
                break;
            case MULT:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case EXP:
                {
                alt2=5;
                }
                break;
            case INT:
                {
                alt2=6;
                }
                break;
            case COLON:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:36:1: ^( PLUS x= expr y= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr71); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr75);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr79);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x + y;

                    }
                    break;
                case 2 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:37:3: ^( MOINS x= expr y= expr )
                    {
                    match(input,MOINS,FOLLOW_MOINS_in_expr87); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr91);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr95);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x - y;

                    }
                    break;
                case 3 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:38:3: ^( MULT x= expr y= expr )
                    {
                    match(input,MULT,FOLLOW_MULT_in_expr103); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr107);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr111);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x * y;

                    }
                    break;
                case 4 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:39:3: ^( DIV x= expr y= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr119); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr123);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr127);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = x / y;

                    }
                    break;
                case 5 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:40:3: ^( EXP x= expr y= expr )
                    {
                    match(input,EXP,FOLLOW_EXP_in_expr135); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr139);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr143);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    v = Math.exp(y * Math.log(x));

                    }
                    break;
                case 6 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:41:3: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr150); 
                    v = Double.parseDouble((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 7 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:42:3: useID
                    {
                    pushFollow(FOLLOW_useID_in_expr156);
                    useID2=useID();

                    state._fsp--;

                    String key = useID2; v = tabVar.get(key);
                    //System.out.println("ID value= "+v);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return v;
    }
    // $ANTLR end "expr"


    // $ANTLR start "boolExpr"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:47:1: boolExpr returns [boolean res] : ( ^( SUP x= expr y= expr ) | ^( INF x= expr y= expr ) | ^( EQU x= expr y= expr ) | ^( SUPEQU x= expr y= expr ) | ^( INFEQU x= expr y= expr ) );
    public final boolean boolExpr() throws RecognitionException {
        boolean res = false;

        double x = 0.0;

        double y = 0.0;


        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:47:31: ( ^( SUP x= expr y= expr ) | ^( INF x= expr y= expr ) | ^( EQU x= expr y= expr ) | ^( SUPEQU x= expr y= expr ) | ^( INFEQU x= expr y= expr ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case SUP:
                {
                alt3=1;
                }
                break;
            case INF:
                {
                alt3=2;
                }
                break;
            case EQU:
                {
                alt3=3;
                }
                break;
            case SUPEQU:
                {
                alt3=4;
                }
                break;
            case INFEQU:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:48:2: ^( SUP x= expr y= expr )
                    {
                    match(input,SUP,FOLLOW_SUP_in_boolExpr172); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_boolExpr176);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_boolExpr180);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    res = (x > y);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:49:2: ^( INF x= expr y= expr )
                    {
                    match(input,INF,FOLLOW_INF_in_boolExpr187); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_boolExpr191);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_boolExpr195);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    res = (x < y);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:50:2: ^( EQU x= expr y= expr )
                    {
                    match(input,EQU,FOLLOW_EQU_in_boolExpr202); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_boolExpr206);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_boolExpr210);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    res = (x == y);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:52:2: ^( SUPEQU x= expr y= expr )
                    {
                    match(input,SUPEQU,FOLLOW_SUPEQU_in_boolExpr218); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_boolExpr222);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_boolExpr226);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    res = (x >= y);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:53:2: ^( INFEQU x= expr y= expr )
                    {
                    match(input,INFEQU,FOLLOW_INFEQU_in_boolExpr233); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_boolExpr237);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_boolExpr241);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    res = (x <= y);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "boolExpr"


    // $ANTLR start "sous_liste_instr"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:56:1: sous_liste_instr : ^( CO ( instruction )+ ) ;
    public final void sous_liste_instr() throws RecognitionException {
        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:56:19: ( ^( CO ( instruction )+ ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:56:21: ^( CO ( instruction )+ )
            {
            match(input,CO,FOLLOW_CO_in_sous_liste_instr255); 

            match(input, Token.DOWN, null); 
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:56:26: ( instruction )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=AV && LA4_0<=REC)||(LA4_0>=FPOS && LA4_0<=FCC)||(LA4_0>=SI && LA4_0<=DONNE)||(LA4_0>=REPETE && LA4_0<=TANTQUE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:56:27: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_sous_liste_instr258);
            	    instruction();

            	    state._fsp--;


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


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sous_liste_instr"


    // $ANTLR start "defID"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:59:1: defID returns [String varNom] : ^( QUOT ID ) ;
    public final String defID() throws RecognitionException {
        String varNom = null;

        CommonTree ID3=null;

        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:59:30: ( ^( QUOT ID ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:60:1: ^( QUOT ID )
            {
            match(input,QUOT,FOLLOW_QUOT_in_defID275); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_defID277); 
            varNom = (ID3!=null?ID3.getText():null);

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return varNom;
    }
    // $ANTLR end "defID"


    // $ANTLR start "useID"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:63:1: useID returns [String varNom] : ^( COLON ID ) ;
    public final String useID() throws RecognitionException {
        String varNom = null;

        CommonTree ID4=null;

        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:63:30: ( ^( COLON ID ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:64:1: ^( COLON ID )
            {
            match(input,COLON,FOLLOW_COLON_in_useID294); 

            match(input, Token.DOWN, null); 
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_useID296); 
            varNom = (ID4!=null?ID4.getText():null);

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return varNom;
    }
    // $ANTLR end "useID"


    // $ANTLR start "instruction"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:67:1: instruction : ( ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FPOS a= expr b= expr ) | ^( FCAP a= expr ) | VE | LC | BC | ^( FCC a= expr ) | ^( DONNE var= defID val= expr ) | si | repeat | tantque );
    public final void instruction() throws RecognitionException {
        double a = 0.0;

        double b = 0.0;

        String var = null;

        double val = 0.0;


        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:67:13: ( ^( AV a= expr ) | ^( TD a= expr ) | ^( TG a= expr ) | ^( REC a= expr ) | ^( FPOS a= expr b= expr ) | ^( FCAP a= expr ) | VE | LC | BC | ^( FCC a= expr ) | ^( DONNE var= defID val= expr ) | si | repeat | tantque )
            int alt5=14;
            switch ( input.LA(1) ) {
            case AV:
                {
                alt5=1;
                }
                break;
            case TD:
                {
                alt5=2;
                }
                break;
            case TG:
                {
                alt5=3;
                }
                break;
            case REC:
                {
                alt5=4;
                }
                break;
            case FPOS:
                {
                alt5=5;
                }
                break;
            case FCAP:
                {
                alt5=6;
                }
                break;
            case VE:
                {
                alt5=7;
                }
                break;
            case LC:
                {
                alt5=8;
                }
                break;
            case BC:
                {
                alt5=9;
                }
                break;
            case FCC:
                {
                alt5=10;
                }
                break;
            case DONNE:
                {
                alt5=11;
                }
                break;
            case SI:
                {
                alt5=12;
                }
                break;
            case REPETE:
                {
                alt5=13;
                }
                break;
            case TANTQUE:
                {
                alt5=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:68:2: ^( AV a= expr )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction318);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; traceur.avance(m);

                    }
                    break;
                case 2 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:69:4: ^( TD a= expr )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction327); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction333);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; traceur.td(m);

                    }
                    break;
                case 3 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:70:4: ^( TG a= expr )
                    {
                    match(input,TG,FOLLOW_TG_in_instruction342); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction348);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; traceur.tg(m);

                    }
                    break;
                case 4 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:71:4: ^( REC a= expr )
                    {
                    match(input,REC,FOLLOW_REC_in_instruction357); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction363);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; traceur.rec(m);

                    }
                    break;
                case 5 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:72:4: ^( FPOS a= expr b= expr )
                    {
                    match(input,FPOS,FOLLOW_FPOS_in_instruction372); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction378);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction384);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; double n = b; traceur.fpos(m,n);

                    }
                    break;
                case 6 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:73:4: ^( FCAP a= expr )
                    {
                    match(input,FCAP,FOLLOW_FCAP_in_instruction393); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction399);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; traceur.fcap(m);

                    }
                    break;
                case 7 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:74:4: VE
                    {
                    match(input,VE,FOLLOW_VE_in_instruction407); 
                    traceur.ve();

                    }
                    break;
                case 8 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:75:4: LC
                    {
                    match(input,LC,FOLLOW_LC_in_instruction414); 
                    traceur.lc();

                    }
                    break;
                case 9 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:76:4: BC
                    {
                    match(input,BC,FOLLOW_BC_in_instruction421); 
                    traceur.bc();

                    }
                    break;
                case 10 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:77:4: ^( FCC a= expr )
                    {
                    match(input,FCC,FOLLOW_FCC_in_instruction429); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_instruction435);
                    a=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    double m = a; traceur.fcc(m);

                    }
                    break;
                case 11 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:78:4: ^( DONNE var= defID val= expr )
                    {
                    match(input,DONNE,FOLLOW_DONNE_in_instruction444); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_defID_in_instruction451);
                    var=defID();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_instruction456);
                    val=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    String v = var; double m = val; tabVar.put(v,m);

                    }
                    break;
                case 12 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:79:4: si
                    {
                    pushFollow(FOLLOW_si_in_instruction464);
                    si();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:80:4: repeat
                    {
                    pushFollow(FOLLOW_repeat_in_instruction469);
                    repeat();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:81:4: tantque
                    {
                    pushFollow(FOLLOW_tantque_in_instruction474);
                    tantque();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "si"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:84:1: si : ^( SI be= boolExpr . CF ( . CF )? ) ;
    public final void si() throws RecognitionException {
        boolean be = false;



        int mark_list_true = -1; 
        int mark_list_false = -1;

        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:88:2: ( ^( SI be= boolExpr . CF ( . CF )? ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:89:1: ^( SI be= boolExpr . CF ( . CF )? )
            {
            match(input,SI,FOLLOW_SI_in_si487); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_boolExpr_in_si493);
            be=boolExpr();

            state._fsp--;

            mark_list_true = input.mark();
            matchAny(input); 
            match(input,CF,FOLLOW_CF_in_si499); 
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:89:58: ( . CF )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=PROGRAMME && LA6_0<=WS)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:89:59: . CF
                    {
                    mark_list_false = input.mark();
                    matchAny(input); 
                    match(input,CF,FOLLOW_CF_in_si506); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
               
              if(be){
                push(mark_list_true);
                sous_liste_instr();
                pop();
                }
              else if(mark_list_false != -1){
                push(mark_list_false);
                sous_liste_instr();
                pop();
                }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "si"


    // $ANTLR start "repeat"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:104:1: repeat : ^( REPETE a= expr . CF ) ;
    public final void repeat() throws RecognitionException {
        double a = 0.0;



        int mark_list = -1;

        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:108:1: ( ^( REPETE a= expr . CF ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:109:1: ^( REPETE a= expr . CF )
            {
            match(input,REPETE,FOLLOW_REPETE_in_repeat525); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_repeat531);
            a=expr();

            state._fsp--;

            mark_list = input.mark();
            matchAny(input); 
            match(input,CF,FOLLOW_CF_in_repeat537); 

            match(input, Token.UP, null); 

            // r est la variable r¨¦sultat de atom.
              for (int i = 0; i < a ; i++) {
               push(mark_list);
               sous_liste_instr();
               pop();
              }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "repeat"


    // $ANTLR start "tantque"
    // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:121:1: tantque : ^( TANTQUE a= boolExpr . CF ) ;
    public final void tantque() throws RecognitionException {
        boolean a = false;



        int mark_bool = -1;
        int mark_list = -1;

        try {
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:126:1: ( ^( TANTQUE a= boolExpr . CF ) )
            // D:\\workspace\\tp2\\src\\logoparsing\\LogoTree.g:127:1: ^( TANTQUE a= boolExpr . CF )
            {
            match(input,TANTQUE,FOLLOW_TANTQUE_in_tantque554); 

            mark_bool = input.mark();

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_boolExpr_in_tantque562);
            a=boolExpr();

            state._fsp--;

            mark_list = input.mark();
            matchAny(input); 
            match(input,CF,FOLLOW_CF_in_tantque569); 

            match(input, Token.UP, null); 

              while (true) {
                push(mark_bool+1);
                if(boolExpr()){
                  push(mark_list);
                  sous_liste_instr();
                  pop();
                  pop();
                }
                else{
                  pop();
                  break;
                }
              }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tantque"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMME_in_prog43 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_prog46 = new BitSet(new long[]{0x000000066007E1E8L});
    public static final BitSet FOLLOW_PLUS_in_expr71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr75 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_expr79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOINS_in_expr87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr91 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_expr95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_in_expr103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr107 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_expr111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr123 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_expr127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_expr135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr139 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_expr143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useID_in_expr156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUP_in_boolExpr172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_boolExpr176 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_boolExpr180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INF_in_boolExpr187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_boolExpr191 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_boolExpr195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQU_in_boolExpr202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_boolExpr206 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_boolExpr210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPEQU_in_boolExpr218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_boolExpr222 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_boolExpr226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFEQU_in_boolExpr233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_boolExpr237 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_boolExpr241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CO_in_sous_liste_instr255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_sous_liste_instr258 = new BitSet(new long[]{0x000000066007E1E8L});
    public static final BitSet FOLLOW_QUOT_in_defID275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_defID277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLON_in_useID294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_useID296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AV_in_instruction312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TG_in_instruction342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REC_in_instruction357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FPOS_in_instruction372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction378 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_instruction384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FCAP_in_instruction393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VE_in_instruction407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LC_in_instruction414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BC_in_instruction421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCC_in_instruction429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_instruction435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DONNE_in_instruction444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_defID_in_instruction451 = new BitSet(new long[]{0x0000002100F80000L});
    public static final BitSet FOLLOW_expr_in_instruction456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_si_in_instruction464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeat_in_instruction469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tantque_in_instruction474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SI_in_si487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolExpr_in_si493 = new BitSet(new long[]{0x0000007FFFFFFFF0L});
    public static final BitSet FOLLOW_CF_in_si499 = new BitSet(new long[]{0x0000007FFFFFFFF8L});
    public static final BitSet FOLLOW_CF_in_si506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPETE_in_repeat525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_repeat531 = new BitSet(new long[]{0x0000007FFFFFFFF0L});
    public static final BitSet FOLLOW_CF_in_repeat537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TANTQUE_in_tantque554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolExpr_in_tantque562 = new BitSet(new long[]{0x0000007FFFFFFFF0L});
    public static final BitSet FOLLOW_CF_in_tantque569 = new BitSet(new long[]{0x0000000000000008L});

}