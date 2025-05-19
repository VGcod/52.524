// Generated from anali.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import analiListener from './analiListener.js';
const serializedATN = [4,1,19,78,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,1,0,5,0,18,8,0,10,0,12,0,21,9,0,1,0,1,0,1,1,1,1,
1,1,1,1,5,1,29,8,1,10,1,12,1,32,9,1,1,1,1,1,1,2,1,2,1,2,3,2,39,8,2,1,2,4,
2,42,8,2,11,2,12,2,43,1,3,1,3,1,3,5,3,49,8,3,10,3,12,3,52,9,3,1,4,1,4,1,
5,1,5,1,5,1,5,1,5,1,5,3,5,62,8,5,1,6,1,6,1,6,1,7,1,7,1,7,1,7,5,7,71,8,7,
10,7,12,7,74,9,7,1,7,1,7,1,7,0,0,8,0,2,4,6,8,10,12,14,0,1,1,0,2,4,80,0,19,
1,0,0,0,2,24,1,0,0,0,4,35,1,0,0,0,6,45,1,0,0,0,8,53,1,0,0,0,10,61,1,0,0,
0,12,63,1,0,0,0,14,66,1,0,0,0,16,18,3,2,1,0,17,16,1,0,0,0,18,21,1,0,0,0,
19,17,1,0,0,0,19,20,1,0,0,0,20,22,1,0,0,0,21,19,1,0,0,0,22,23,5,0,0,1,23,
1,1,0,0,0,24,25,5,1,0,0,25,26,5,15,0,0,26,30,5,6,0,0,27,29,3,4,2,0,28,27,
1,0,0,0,29,32,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,0,31,33,1,0,0,0,32,30,1,
0,0,0,33,34,5,7,0,0,34,3,1,0,0,0,35,36,7,0,0,0,36,41,3,6,3,0,37,39,3,8,4,
0,38,37,1,0,0,0,38,39,1,0,0,0,39,40,1,0,0,0,40,42,3,10,5,0,41,38,1,0,0,0,
42,43,1,0,0,0,43,41,1,0,0,0,43,44,1,0,0,0,44,5,1,0,0,0,45,50,5,17,0,0,46,
47,5,10,0,0,47,49,5,17,0,0,48,46,1,0,0,0,49,52,1,0,0,0,50,48,1,0,0,0,50,
51,1,0,0,0,51,7,1,0,0,0,52,50,1,0,0,0,53,54,5,13,0,0,54,9,1,0,0,0,55,62,
5,15,0,0,56,62,5,16,0,0,57,62,5,14,0,0,58,62,5,17,0,0,59,62,3,12,6,0,60,
62,3,14,7,0,61,55,1,0,0,0,61,56,1,0,0,0,61,57,1,0,0,0,61,58,1,0,0,0,61,59,
1,0,0,0,61,60,1,0,0,0,62,11,1,0,0,0,63,64,5,12,0,0,64,65,5,17,0,0,65,13,
1,0,0,0,66,67,5,8,0,0,67,72,3,10,5,0,68,69,5,11,0,0,69,71,3,10,5,0,70,68,
1,0,0,0,71,74,1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,75,1,0,0,0,74,72,1,
0,0,0,75,76,5,9,0,0,76,15,1,0,0,0,7,19,30,38,43,50,61,72];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class analiParser extends antlr4.Parser {

    static grammarFileName = "anali.g4";
    static literalNames = [ null, "'prueba'", "'dado'", "'cuando'", "'entonces'", 
                            "'y'", "'{'", "'}'", "'['", "']'", "'.'", "','", 
                            "'$'" ];
    static symbolicNames = [ null, "PRUEBA", "DADO", "CUANDO", "ENTONCES", 
                             "Y", "LBRACE", "RBRACE", "LCORCHETE", "RCORCHETE", 
                             "DOT", "COMA", "PESO", "ESTADO", "BOOLEANO", 
                             "TEXTO", "NUMERO", "IDENTIFICADOR", "WS", "NL" ];
    static ruleNames = [ "testSuite", "prueba", "paso", "objeto", "estado", 
                         "valor", "variable", "lista" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = analiParser.ruleNames;
        this.literalNames = analiParser.literalNames;
        this.symbolicNames = analiParser.symbolicNames;
    }



	testSuite() {
	    let localctx = new TestSuiteContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, analiParser.RULE_testSuite);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===1) {
	            this.state = 16;
	            this.prueba();
	            this.state = 21;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 22;
	        this.match(analiParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	prueba() {
	    let localctx = new PruebaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, analiParser.RULE_prueba);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 24;
	        this.match(analiParser.PRUEBA);
	        this.state = 25;
	        this.match(analiParser.TEXTO);
	        this.state = 26;
	        this.match(analiParser.LBRACE);
	        this.state = 30;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 28) !== 0)) {
	            this.state = 27;
	            this.paso();
	            this.state = 32;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 33;
	        this.match(analiParser.RBRACE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	paso() {
	    let localctx = new PasoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, analiParser.RULE_paso);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 35;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 28) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	        this.state = 36;
	        this.objeto();
	        this.state = 41; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 38;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===13) {
	                this.state = 37;
	                this.estado();
	            }

	            this.state = 40;
	            this.valor();
	            this.state = 43; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while((((_la) & ~0x1f) === 0 && ((1 << _la) & 258304) !== 0));
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	objeto() {
	    let localctx = new ObjetoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, analiParser.RULE_objeto);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 45;
	        this.match(analiParser.IDENTIFICADOR);
	        this.state = 50;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===10) {
	            this.state = 46;
	            this.match(analiParser.DOT);
	            this.state = 47;
	            this.match(analiParser.IDENTIFICADOR);
	            this.state = 52;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	estado() {
	    let localctx = new EstadoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, analiParser.RULE_estado);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 53;
	        this.match(analiParser.ESTADO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valor() {
	    let localctx = new ValorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, analiParser.RULE_valor);
	    try {
	        this.state = 61;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 15:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 55;
	            this.match(analiParser.TEXTO);
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 56;
	            this.match(analiParser.NUMERO);
	            break;
	        case 14:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 57;
	            this.match(analiParser.BOOLEANO);
	            break;
	        case 17:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 58;
	            this.match(analiParser.IDENTIFICADOR);
	            break;
	        case 12:
	            this.enterOuterAlt(localctx, 5);
	            this.state = 59;
	            this.variable();
	            break;
	        case 8:
	            this.enterOuterAlt(localctx, 6);
	            this.state = 60;
	            this.lista();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	variable() {
	    let localctx = new VariableContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, analiParser.RULE_variable);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 63;
	        this.match(analiParser.PESO);
	        this.state = 64;
	        this.match(analiParser.IDENTIFICADOR);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	lista() {
	    let localctx = new ListaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, analiParser.RULE_lista);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 66;
	        this.match(analiParser.LCORCHETE);
	        this.state = 67;
	        this.valor();
	        this.state = 72;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===11) {
	            this.state = 68;
	            this.match(analiParser.COMA);
	            this.state = 69;
	            this.valor();
	            this.state = 74;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 75;
	        this.match(analiParser.RCORCHETE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

analiParser.EOF = antlr4.Token.EOF;
analiParser.PRUEBA = 1;
analiParser.DADO = 2;
analiParser.CUANDO = 3;
analiParser.ENTONCES = 4;
analiParser.Y = 5;
analiParser.LBRACE = 6;
analiParser.RBRACE = 7;
analiParser.LCORCHETE = 8;
analiParser.RCORCHETE = 9;
analiParser.DOT = 10;
analiParser.COMA = 11;
analiParser.PESO = 12;
analiParser.ESTADO = 13;
analiParser.BOOLEANO = 14;
analiParser.TEXTO = 15;
analiParser.NUMERO = 16;
analiParser.IDENTIFICADOR = 17;
analiParser.WS = 18;
analiParser.NL = 19;

analiParser.RULE_testSuite = 0;
analiParser.RULE_prueba = 1;
analiParser.RULE_paso = 2;
analiParser.RULE_objeto = 3;
analiParser.RULE_estado = 4;
analiParser.RULE_valor = 5;
analiParser.RULE_variable = 6;
analiParser.RULE_lista = 7;

class TestSuiteContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_testSuite;
    }

	EOF() {
	    return this.getToken(analiParser.EOF, 0);
	};

	prueba = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PruebaContext);
	    } else {
	        return this.getTypedRuleContext(PruebaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterTestSuite(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitTestSuite(this);
		}
	}


}



class PruebaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_prueba;
    }

	PRUEBA() {
	    return this.getToken(analiParser.PRUEBA, 0);
	};

	TEXTO() {
	    return this.getToken(analiParser.TEXTO, 0);
	};

	LBRACE() {
	    return this.getToken(analiParser.LBRACE, 0);
	};

	RBRACE() {
	    return this.getToken(analiParser.RBRACE, 0);
	};

	paso = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(PasoContext);
	    } else {
	        return this.getTypedRuleContext(PasoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterPrueba(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitPrueba(this);
		}
	}


}



class PasoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_paso;
    }

	objeto() {
	    return this.getTypedRuleContext(ObjetoContext,0);
	};

	DADO() {
	    return this.getToken(analiParser.DADO, 0);
	};

	CUANDO() {
	    return this.getToken(analiParser.CUANDO, 0);
	};

	ENTONCES() {
	    return this.getToken(analiParser.ENTONCES, 0);
	};

	valor = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValorContext);
	    } else {
	        return this.getTypedRuleContext(ValorContext,i);
	    }
	};

	estado = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(EstadoContext);
	    } else {
	        return this.getTypedRuleContext(EstadoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterPaso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitPaso(this);
		}
	}


}



class ObjetoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_objeto;
    }

	IDENTIFICADOR = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analiParser.IDENTIFICADOR);
	    } else {
	        return this.getToken(analiParser.IDENTIFICADOR, i);
	    }
	};


	DOT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analiParser.DOT);
	    } else {
	        return this.getToken(analiParser.DOT, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterObjeto(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitObjeto(this);
		}
	}


}



class EstadoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_estado;
    }

	ESTADO() {
	    return this.getToken(analiParser.ESTADO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterEstado(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitEstado(this);
		}
	}


}



class ValorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_valor;
    }

	TEXTO() {
	    return this.getToken(analiParser.TEXTO, 0);
	};

	NUMERO() {
	    return this.getToken(analiParser.NUMERO, 0);
	};

	BOOLEANO() {
	    return this.getToken(analiParser.BOOLEANO, 0);
	};

	IDENTIFICADOR() {
	    return this.getToken(analiParser.IDENTIFICADOR, 0);
	};

	variable() {
	    return this.getTypedRuleContext(VariableContext,0);
	};

	lista() {
	    return this.getTypedRuleContext(ListaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitValor(this);
		}
	}


}



class VariableContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_variable;
    }

	PESO() {
	    return this.getToken(analiParser.PESO, 0);
	};

	IDENTIFICADOR() {
	    return this.getToken(analiParser.IDENTIFICADOR, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterVariable(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitVariable(this);
		}
	}


}



class ListaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analiParser.RULE_lista;
    }

	LCORCHETE() {
	    return this.getToken(analiParser.LCORCHETE, 0);
	};

	valor = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValorContext);
	    } else {
	        return this.getTypedRuleContext(ValorContext,i);
	    }
	};

	RCORCHETE() {
	    return this.getToken(analiParser.RCORCHETE, 0);
	};

	COMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analiParser.COMA);
	    } else {
	        return this.getToken(analiParser.COMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.enterLista(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analiListener ) {
	        listener.exitLista(this);
		}
	}


}




analiParser.TestSuiteContext = TestSuiteContext; 
analiParser.PruebaContext = PruebaContext; 
analiParser.PasoContext = PasoContext; 
analiParser.ObjetoContext = ObjetoContext; 
analiParser.EstadoContext = EstadoContext; 
analiParser.ValorContext = ValorContext; 
analiParser.VariableContext = VariableContext; 
analiParser.ListaContext = ListaContext; 
