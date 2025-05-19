grammar anali;

// ========== TOKENS (Palabras clave primero) ==========
PRUEBA     : 'prueba';
DADO       : 'dado';
CUANDO     : 'cuando';
ENTONCES   : 'entonces';
Y          : 'y';

LBRACE     : '{';
RBRACE     : '}';
LCORCHETE  : '[';
RCORCHETE  : ']';
DOT        : '.';
COMA       : ',';
PESO       : '$';

ESTADO     : 'es' | 'no es' | 'contiene' | 'existe' | 'debe';
BOOLEANO   : 'verdadero' | 'falso';

// Literales
TEXTO      : '"' ( ~["\\\r\n] | '\\' . )* '"';
NUMERO     : [0-9]+ ;
IDENTIFICADOR : [a-zA-Z_] [a-zA-Z0-9_]* ;

// Ignorados
WS         : [ \t\r]+ -> skip ;
NL         : ('\r'? '\n')+ -> skip ;

// ========== REGLAS DEL PARSER ==========

// Entrada principal: múltiples pruebas
testSuite  : prueba* EOF ;

// Una prueba con múltiples pasos
prueba     : PRUEBA TEXTO LBRACE paso* RBRACE ;

// Un paso puede comenzar con "dado", "cuando", o "entonces"
paso       : (DADO | CUANDO | ENTONCES) objeto (estado? valor )+ ;

// Un objeto puede ser una cadena con puntos (e.g., producto.precio)
objeto     : IDENTIFICADOR (DOT IDENTIFICADOR)* ;

// Estado opcional (condición)
estado     : ESTADO ;

// Valor puede ser texto, número, booleano, identificador, variable o lista
valor      : TEXTO
           | NUMERO
           | BOOLEANO
           | IDENTIFICADOR
           | variable
           | lista ;

// Variable: comienza con signo de peso
variable   : PESO IDENTIFICADOR ;

// Lista: [ valor1, valor2, ... ]
lista      : LCORCHETE valor (COMA valor)* RCORCHETE ;
