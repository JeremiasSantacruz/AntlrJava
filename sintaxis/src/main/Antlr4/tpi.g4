grammar tpi;
 /*========
  * Parser
  =========*/

/* PROGRAMA GENERAL        */
start
   locals [
   List<String> var = new ArrayList<String>(),
   List<String> no_var = new ArrayList<String>()
   ]
	: programa NEWLINE? EOF
	{System.out.println("================");
	 System.out.println("Variables: "+$var);
	 System.out.println("Constantes: "+$no_var);
	 System.out.println("================");}
	;

/* Lugar del lenguaje donde esta el proceso y sus sentencias */
programa
	: titulo NEWLINE cuerpo FINACCION
	;

titulo
	: ACCION IDENTIFICADOR ES {
      $start::no_var.add($IDENTIFICADOR.text);
   }
	;

/* para que se pueda agregar funciones o parametros al lenguaje, el cuerpo es aparte  */
cuerpo
	: ambiente proceso
	;

/* Definiciones del ambiente, se podria agregar soporte a otros tipos de datos*/
ambiente
	: AMBIENTE NEWLINE+ lineaambiente?
	;

lineaambiente
	: variable
	| constante
	;

variable
	: ID=IDENTIFICADOR  ':' TIPODEDATO NEWLINE+ lineaambiente? {
   String aux1 = Integer.toString($ID.pos);
   String aux2 = Integer.toString($ID.line);
   if ( (!$start::var.contains($ID.text)) & (!$start::no_var.contains($ID.text)) ) {
      $start::var.add($ID.text);
   } else {
      System.err.println("Variable ya definida: "+$ID.text + " <"+ aux2 + "," + aux1 + ">");
   };
   }
	;

constante
	:  ID=IDENTIFICADOR '='  termino NEWLINE+ lineaambiente?   {
   String aux1 = Integer.toString($ID.pos);
   String aux2 = Integer.toString($ID.line);
   if ( (!$start::var.contains($ID.text)) & (!$start::no_var.contains($ID.text)) ) {
      $start::no_var.add($ID.text);
   } else {
      System.err.println("Variable ya definida: "+$ID.text+ " <"+ aux2 + "," + aux1 + ">");
   };
   }
	;

/* Comienzo de las lineas del programa*/
proceso
	: PROCESO NEWLINE lineacod
	;
/* Clasificamos las lineas en 4 grandes categorias*/
lineacod
	: asignacion NEWLINE+ lineacod?
	| funcion NEWLINE+ lineacod?
	| sentencias NEWLINE+ lineacod?
	| asignacioninc NEWLINE+ lineacod?
	;

asignacion
	: ID=IDENTIFICADOR ASIGNACION expresion
   {
   String aux1 = Integer.toString($ID.pos);
   String aux2 = Integer.toString($ID.line);
   if ( (!$start::var.contains($ID.text)) & (!$start::no_var.contains($ID.text)) ) {
      System.err.println("Variable no definida: "+ $ID.text + " <"+ aux2 + "," + aux1 + ">");
   } else if ( $start::no_var.contains( $ID.text)){
      System.err.println("Variable " +$ID.text + " es una constate"+ " <"+ aux2 + "," + aux1 + ">");
   };
   }
	;

asignacioninc
	: ID=IDENTIFICADOR ASGINACIONINC numero
     {
   String aux1 = Integer.toString($ID.pos);
   String aux2 = Integer.toString($ID.line);
   if ( (!$start::var.contains($ID.text)) & (!$start::no_var.contains($ID.text)) ) {
      System.err.println("Variable no definida: "+ $ID.text + " <"+ aux2 + "," + aux1 + ">");
   } else if ( $start::no_var.contains( $ID.text)){
      System.err.println("Variable " +$ID.text + " es una constate"+ " <"+ aux2 + "," + aux1 + ">" );
   };
   }
	;


sentencias
	: condicional
	| iterativas
	;

condicional
	:SI expresion ENTONCES NEWLINE lineacod (SINO NEWLINE lineacod)? FINSI
	|SEGUN IDENTIFICADOR HACER NEWLINE lineasegun DEFECTO NEWLINE lineacod FINSEGUN
	;

iterativas
	: REPETIR NEWLINE lineacod HASTAQUE expresion
	| PARA asignacion HASTA dato ',' dato HACER NEWLINE lineacod FINPARA
	| MIENTRAS expresion HACER NEWLINE lineacod FINMIENTRAS
	;

lineasegun
	: hoja ':' lineacod (lineasegun)?
	;

/*Se popdria agregar otras funciones  definidas por el usuario
 con IDENTIFICADORES */
funcion
	: LEER PAR arg IPAR
	| ESCRIBIR PAR arg IPAR
	;
/*Deberia ser una simple expresion wn vez de dato???*/
arg
	: dato (','arg )?
	| expresion (',' arg)?
	;

expresion
	: PAR expresion IPAR
	| siexpresion (operadorrelacional expresion)?
	;

siexpresion
	: factor (addoperador siexpresion)?
	;

factor
	: termino (multioperador factor)?;

termino
	: ( MAS | MENOS )? hoja
	;

hoja
   : dato
   | PAR expresion IPAR
   | NOTL factor
   | BOOL
   ;

dato
	: numero
	| IDENTIFICADOR
   {
   if ( (!$start::var.contains($IDENTIFICADOR.text)) & (!$start::no_var.contains($IDENTIFICADOR.text)) ) {
      String aux1 = Integer.toString($IDENTIFICADOR.pos);
      String aux2 = Integer.toString($IDENTIFICADOR.line);
      System.err.println("Variable no definida: "+ $IDENTIFICADOR.text + " <"+ aux2 + "," + aux1 + ">");
   }
   }
	| TXT
	| BOOL
	;

operadorrelacional
    : IGUAL
   | DESIGUAL
   | MENORA
   | MAYORA
   | MENOROI
   | MAYOROI
   ;

addoperador
   : MAS
   | MENOS
   | OR
   ;

multioperador
   : MULTI
   | DIVENT
   | DIV
   | MOD
   | AND
   | POT
   ;

numero
	: MENOS? REAL
	| MENOS? NUMEROENTERO
	;

/* ===============
FRAGMENT
==================*/


fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;




/*=========
  * Lexer
=========*/

/* Palabras reservadas sin destincion de mayusculas */
ACCION         : A C C I O N;
ES             : '_' E S;
FINACCION      : F I N '_' A C C I O N ;
AMBIENTE       : A M B I E N T E;
PROCESO        : P R O C E S O;
TIPODEDATO     : ( C A D E N A  | E N T E R O | R E A L | N U M E R O);
MIENTRAS       : M I E N T R A S ;
HACER          : H A C E R ;
FINMIENTRAS    : F I N '_' M I E N T R A S;
HASTAQUE       : H A S T A '_' Q U E ;
REPETIR        : R E P E T I R;
SI             : S I;
ENTONCES       : E N T O N C E S ;
SINO           : S I N O;
FINSI          : F I N '_' S I;
PARA           : P A R A;
HASTA          : H A S T A ;
FINPARA        : F I N '_' P A R A ;
SEGUN          : S E G U N;
DEFECTO        : D E F E C T O ':';
FINSEGUN       : F I N '_' S E G U N;
CADENA         : C A D E N A ;
ESCRIBIR       : E S C R I B I R   ;
LEER           : L E E R;

/* Operadores y parentesis */
IGUAL          : '=';
DPUNTOS        : ':';
SEMI           : ';';
MENOS          : '-';
MAS            : '+';
OR             : '_'O ;
MULTI          : '*';
DIVENT         : '/';
DIV            : '_' D I V;
MOD            : '_'M O D;
AND            : '_' Y ;
POT            : '**' ;
NOTL           : '_no' ;
PAR            : '(' ;
IPAR           : ')' ;
DESIGUAL       : '<>';
MENORA         : '<';
MAYORA         : '>';
MENOROI        : '<=';
MAYOROI        : '>=';

COMA           : ( '.' | ',' );

/*Definicion de los numeros*/
REAL           : [0-9]+(COMA [0-9]+) ;
NUMEROENTERO   : [0-9]+;

ASIGNACION     : ':=' ;
ASGINACIONINC  : ( '-:=' | '+:= ');

BOOL           : ( 'TRUE' | 'FALSE' );

/*Expresion regular de identificadorses
  Primera parte nos aseguramos que venga una letra
  Despues solamente tomamos un guion bajo y cualquier convinacion de caracteres*/
IDENTIFICADOR  : [a-zA-Z][a-zA-Z0-9]*('_'[a-zA-Z0-9]+)*;

/* Comenzamos con un " luego decimos que puede venir el conjunto (\")
 o cualquier otro caracter(.)*/
TXT            :  '"' ( '\\"' | . )*? '"' ;

/*Saltea los espacios en blancos y las nuevas lineas pueden ser ; */
WHITESPACE     :  [ \t\r\n] -> skip ;
NEWLINE        : ('\r'? '\n' | '\r' )+ ;


/* COMENTARIOS */
COMENTARIO1 : '@' (.)*? '\n' -> skip;
COMENTARIO2 : '#' (.)*? '#' -> skip;