grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
  AV = 'AV' ;
  TD = 'TD' ;
  TG = 'TG' ;
  REC = 'REC' ;
  CO = '[';
  CF = ']';
  PO = '(';
  PF = ')';
  FPOS = 'FPOS';
  FCAP = 'FCAP';
  VE = 'VE';
  LC = 'LC';
  BC = 'BC';
  FCC = 'FCC';
  PLUS = '+';
  MOINS = '-';
  MULT = '*';
  DIV = '/';
  EXP = '^';
  SUP = '>';
  INF = '<';
  EQU = '=';
  SUPEQU = '>=';
  INFEQU = '<=';
  SI = 'SI';
  DONNE = 'DONNE';
  QUOT = '"';
  COLON = ':';
  REPETE = 'REPETE';  
  TANTQUE = 'TANTQUE';
}
@lexer::header {
  package logoparsing;
}
@header {
  package logoparsing;
  import logogui.Log;
  import java.util.Hashtable;
}
@members{
  boolean valide = true;
  public boolean getValide(){
  return valide;
 }
 
 public void setValide(boolean v){
   valide = v;
 }
 
 Hashtable<String, Double> tabVar;
 public void setTabVar(Hashtable<String, Double> t){
  tabVar = t;
 }
}

LET : ('A'..'Z'|'a'..'z');
ID :  ('A'..'Z'|'a'..'z')( '0'..'9'|'A'..'Z'|'a'..'z'|'-')*;
INT : ('0'..'9')+ ;
WS  : (' '|'\t'|('\r'? '\n')) + { skip(); } ;

programme : liste_instructions -> ^(PROGRAMME liste_instructions)
;

liste_instructions : (instruction)+
;

sous_liste_instr : CO liste_instructions -> ^(CO liste_instructions)
;

expr : sumExpr ;

sumExpr: multExpr ((PLUS^|MOINS^) multExpr)*
;
multExpr : powExpr ((MULT^|DIV^) powExpr)*
;
powExpr : atom (EXP^ atom)*
;
atom: INT 
      | PO! expr PF! 
      | useID {
      if(!tabVar.containsKey($useID.varNom)) {
        setValide(false);
        Log.appendnl("Variable is not initialized!");
        }
      }
;

boolExpr: expr (SUP^|INF^|EQU^|SUPEQU^|INFEQU^) expr; 

defID returns [String varNom]: 
QUOT^ ID {$varNom = $ID.text;} 
;

useID returns [String varNom]:
COLON^ ID {$varNom = $ID.text;}  
;

instruction :
  ( AV^  
  | TD^
  | TG^ 
  | REC^
  | FCAP^ 
  | FCC^ 
  ) 
  expr|
  FPOS ^ CO! expr expr CF!
  | VE
  | LC
  | BC 
  | SI^ boolExpr sous_liste_instr  CF (sous_liste_instr  CF)?
  | DONNE^ defID expr {String v = $defID.varNom; tabVar.put(v,(double)0);}
  | REPETE^ atom  sous_liste_instr  CF
  | TANTQUE^ boolExpr sous_liste_instr CF
;  