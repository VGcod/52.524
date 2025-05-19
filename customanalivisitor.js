import analiVisitor from './analiVisitor.js';

export default class CustomAnaliVisitor extends analiVisitor {
  constructor() {
    super();
    this.lexemas = [];
    this.javascript = '';
  }

  visitTestSuite(ctx) {
    for (const pruebaCtx of ctx.prueba()) {
      this.visit(pruebaCtx);
    }
    return {
      traduccion: this.javascript,
      lexemas: this.lexemas
    };
  }

  visitPrueba(ctx) {
    const texto = ctx.TEXTO().getText();
    const nombre = texto.replace(/"/g, '');
    this.javascript += `describe("${nombre}", () => {\n`;

    for (const pasoCtx of ctx.paso()) {
      this.visit(pasoCtx);
    }

    this.javascript += `});\n\n`;
    return null;
  }

  visitPaso(ctx) {
    // Palabra clave (DADO, CUANDO, ENTONCES)
    const palabraClave = ctx._ctx.getChild(0).getText().toUpperCase();

    // Objeto
    const objeto = this.visit(ctx.objeto());

    // Cada (estado? valor) del paso
    const pares = [];
    for (let i = 0; i < ctx.valor().length; i++) {
      const estado = ctx.estado(i) ? this.visit(ctx.estado(i)) : '';
      const valor = this.visit(ctx.valor(i));
      pares.push({ estado, valor });
    }

    // Traducción a JS tipo test
    if (palabraClave === 'DADO') {
      this.javascript += `  let ${objeto} = ${JSON.stringify(pares[0].valor)};\n`;
    } else if (palabraClave === 'CUANDO') {
      this.javascript += `  // Acción: ${objeto} ${pares.map(p => `${p.estado} ${p.valor}`).join(' ')}\n`;
    } else if (palabraClave === 'ENTONCES') {
      this.javascript += `  it("${objeto} ${pares.map(p => `${p.estado} ${p.valor}`).join(' ')}", () => {\n`;
      this.javascript += `    // Aquí iría la aserción correspondiente\n`;
      this.javascript += `  });\n`;
    }

    // Lexemas
    this.lexemas.push({ lexema: palabraClave, token: palabraClave });
    return null;
  }

  visitObjeto(ctx) {
    const ids = ctx.IDENTIFICADOR().map(tok => {
      this.lexemas.push({ lexema: tok.getText(), token: 'IDENTIFICADOR' });
      return tok.getText();
    });
    ctx.DOT().forEach(dotTok =>
      this.lexemas.push({ lexema: dotTok.getText(), token: 'DOT' })
    );
    return ids.join('_');
  }

  visitEstado(ctx) {
    const txt = ctx.ESTADO().getText();
    this.lexemas.push({ lexema: txt, token: 'ESTADO' });
    return txt;
  }

  visitValor(ctx) {
    if (ctx.TEXTO()) {
      const t = ctx.TEXTO().getText();
      this.lexemas.push({ lexema: t, token: 'TEXTO' });
      return t.replace(/"/g, '');
    }
    if (ctx.NUMERO()) {
      const n = ctx.NUMERO().getText();
      this.lexemas.push({ lexema: n, token: 'NUMERO' });
      return n;
    }
    if (ctx.BOOLEANO()) {
      const b = ctx.BOOLEANO().getText();
      this.lexemas.push({ lexema: b, token: 'BOOLEANO' });
      return b;
    }
    if (ctx.IDENTIFICADOR() && !ctx.variable()) {
      const id = ctx.IDENTIFICADOR().getText();
      this.lexemas.push({ lexema: id, token: 'IDENTIFICADOR' });
      return id;
    }
    if (ctx.variable()) {
      return this.visit(ctx.variable());
    }
    if (ctx.lista()) {
      return this.visit(ctx.lista());
    }
    return '';
  }

  visitVariable(ctx) {
    this.lexemas.push({ lexema: ctx.PESO().getText(), token: 'PESO' });
    const id = ctx.IDENTIFICADOR().getText();
    this.lexemas.push({ lexema: id, token: 'IDENTIFICADOR' });
    return `$${id}`;
  }

  visitLista(ctx) {
    this.lexemas.push({ lexema: ctx.LCORCHETE().getText(), token: 'LCORCHETE' });
    const items = ctx.valor().map((v, i) => {
      const val = this.visit(v);
      if (i < ctx.COMA().length) {
        this.lexemas.push({ lexema: ',', token: 'COMA' });
      }
      return val;
    });
    this.lexemas.push({ lexema: ctx.RCORCHETE().getText(), token: 'RCORCHETE' });
    return `[${items.join(', ')}]`;
  }
}
