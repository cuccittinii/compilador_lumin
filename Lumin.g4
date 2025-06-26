grammar Lumin;

programa: (comando)* EOF;

comando
    : declaracao
    | atribuicao
    | condicional
    | repeticao
    | leitura
    | escrita
    ;

declaracao: tipo ID SEMI;

tipo: CLARUS | FLUX | VERITAS;

atribuicao: ID ASSIGN expressao SEMI;

condicional: SE LPAREN expressao RPAREN bloco (SENAO bloco)?;

repeticao: ENQUANTO LPAREN expressao RPAREN bloco;

leitura: CAPTURA LPAREN ID RPAREN SEMI;

escrita
    : ECO LPAREN ID RPAREN SEMI        #EscritaID
    | ECO LPAREN STRING RPAREN SEMI    #EscritaString
    ;


bloco: LBRACE (comando)* RBRACE;

// EXPRESSÕES COM PRECEDÊNCIA
expressao
    : expressao op=('*'|'/') expressao         #ExprMulDiv
    | expressao op=('+'|'-') expressao         #ExprSomaSub
    | expressao op=('>'|'<'|'=='|'!=') expressao #ExprRelacional
    | '(' expressao ')'                        #ExprParenteses
    | NUM_INT                                  #ExprInt
    | NUM_REAL                                 #ExprReal
    | VERUM                                    #ExprTrue
    | FALSUM                                   #ExprFalse
    | ID                                       #ExprID
    ;

CLARUS : 'clarus';
FLUX : 'flux';
VERITAS : 'veritas';

VERUM : 'verum';
FALSUM : 'falsum';

SE : 'se';
SENAO : 'senao';
ENQUANTO : 'enquanto';
ECO : 'eco';
CAPTURA : 'captura';

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
SEMI : ';';
ASSIGN : '=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
GT : '>';
LT : '<';
EQ : '==';
NEQ : '!=';

NUM_INT : [0-9]+;
NUM_REAL : [0-9]+ '.' [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
STRING : '"' (~["\\] | '\\' .)* '"';

WS : [ \t\r\n]+ -> skip;
