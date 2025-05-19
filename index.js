import fs from 'fs';
import antlr4 from 'antlr4';
import analiLexer from './analiLexer.js';
import analiParser from './analiParser.js';
import CustomAnaliVisitor from './customanalivisitor.js';
import printTree from './treePrinter.js';

// 1. Leer input
const input = fs.readFileSync('input.txt', 'utf8');
const chars = new antlr4.InputStream(input);

// 2. Lexing & tabla de tokens
const lexer = new analiLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
tokens.fill();

// 3. Parsing
const parser = new analiParser(tokens);
parser.buildParseTrees = true;

try {
  const tree = parser.testSuite();

  if (parser._syntaxErrors > 0) {
    // Primero el mensaje general
    console.error("❌ Entrada inválida");
    // Luego el detalle del error
    console.error("Se encontraron errores de sintaxis en la entrada.");
  } else {
    console.log("✅ Entrada válida");

    // Tabla de tokens y lexemas
    console.log("Tabla de Tokens y Lexemas:");
    console.log("--------------------------------------------------");
    console.log("| Lexema         | Token                         |");
    console.log("--------------------------------------------------");
    tokens.tokens.forEach(token => {
      if (
        token.type > 0 &&
        analiLexer.symbolicNames &&
        analiLexer.symbolicNames[token.type]
      ) {
        const tokenName = analiLexer.symbolicNames[token.type];
        console.log(`${token.text}\t\t${tokenName}`);
      } else if (token.type > 0) {
        console.log(`${token.text}\t\tTOKEN_DESCONOCIDO`);
      }
    });

    // Árbol de derivación
    console.log("\n🌳 Árbol de derivación:\n");
    printTree(tree, parser.ruleNames);

    // Visitor: traducción y lexemas semánticos
    const visitor = new CustomAnaliVisitor();
    const result = visitor.visit(tree);

    // Traducción a JavaScript
    console.log("\n🔁 Traducción a JavaScript:\n");
    console.log(result.traduccion);
  }
} catch (e) {
  // Si ocurre una excepción, primero el mensaje general, luego el detalle
  console.error("❌ Entrada inválida");
  console.error("Error:", e.message);
}
