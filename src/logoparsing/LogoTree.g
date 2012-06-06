tree grammar LogoTree;
options {
  tokenVocab = Logo;
  ASTLabelType=CommonTree;
}
@header {
  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;
  import java.util.Hashtable;
} 
@members{
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
  
}
 prog : ^(PROGRAMME (instruction)*) 
     {Log.appendnl("Programme principal");}
;

expr returns [double v] :
^(PLUS x=expr y=expr) {$v = $x.v + $y.v;}
| ^(MOINS x=expr y=expr) {$v = $x.v - $y.v;}
| ^(MULT x=expr y=expr) {$v = $x.v * $y.v;}
| ^(DIV x=expr y=expr) {$v = $x.v / $y.v;}
| ^(EXP x=expr y=expr) {$v = Math.exp($y.v * Math.log($x.v));}
| INT {$v = Double.parseDouble($INT.text);}
| useID {String key = $useID.varNom; $v = tabVar.get(key);
//System.out.println("ID value= "+$v);
}
;

boolExpr returns [boolean res]:
 ^(SUP x=expr y=expr) {$res = ($x.v > $y.v);}
|^(INF x=expr y=expr) {$res = ($x.v < $y.v);}
|^(EQU x=expr y=expr) {$res = ($x.v == $y.v);}
//|^(EQU x=expr y=expr) {$res = Double.compare($x.v, $y.v);}
|^(SUPEQU x=expr y=expr) {$res = ($x.v >= $y.v);}
|^(INFEQU x=expr y=expr) {$res = ($x.v <= $y.v);}
;

sous_liste_instr  : ^(CO (instruction)+)
;

defID returns [String varNom]: 
^(QUOT ID {$varNom = $ID.text;}) 
;

useID returns [String varNom]:
^(COLON ID {$varNom = $ID.text;})  
;

instruction :
 ^(AV a = expr) {double m = $a.v; traceur.avance(m);}
 | ^(TD a = expr) {double m = $a.v; traceur.td(m);}
 | ^(TG a = expr) {double m = $a.v; traceur.tg(m);}
 | ^(REC a = expr) {double m = $a.v; traceur.rec(m);}
 | ^(FPOS a = expr b = expr) {double m = $a.v; double n = $b.v; traceur.fpos(m,n);}
 | ^(FCAP a = expr) {double m = $a.v; traceur.fcap(m);}
 | VE {traceur.ve();}
 | LC {traceur.lc();}
 | BC {traceur.bc();}
 | ^(FCC a = expr) {double m = $a.v; traceur.fcc(m);}
 | ^(DONNE  var = defID val= expr) {String v = $var.varNom; double m = $val.v; tabVar.put(v,m);}
 | si
 | repeat
 | tantque
;

si
@init{
int mark_list_true = -1; 
int mark_list_false = -1;
}:
^(SI be = boolExpr {mark_list_true = input.mark();} . CF ({mark_list_false = input.mark();} . CF)?){   
  if($be.res){
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
;


repeat
@init{
int mark_list = -1;
}
:
^(REPETE
a = expr {mark_list = input.mark();} . CF)
{
// r est la variable r¨¦sultat de atom.
  for (int i = 0; i < $a.v ; i++) {
   push(mark_list);
   sous_liste_instr();
   pop();
  }
}
;

tantque
@init{
int mark_bool = -1;
int mark_list = -1;
}
:
^(TANTQUE
{mark_bool = input.mark();} a = boolExpr  {mark_list = input.mark();} . CF)
{
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
;