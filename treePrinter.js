function printTree(tree, ruleNames, indent = '', isLast = true) {
    const nodeText = tree.getText();
    const ruleName = tree.constructor.name.replace('Context', '');

    const symbol = isLast ? '└── ' : '├── ';
    const line = `${indent}${symbol}${ruleName} : ${nodeText}`;

    console.log(line);

    const newIndent = indent + (isLast ? '    ' : '│   ');

    if (tree.children) {
        for (let i = 0; i < tree.children.length; i++) {
            const child = tree.children[i];
            const last = i === tree.children.length - 1;
            if (child.constructor.name.endsWith("Context")) {
                printTree(child, ruleNames, newIndent, last);
            } else {
                // Hojas del árbol (tokens)
                const tokenText = child.getText().replace(/\n/g, '\\n');
                const leaf = `${newIndent}${last ? '└──' : '├──'} TOKEN : "${tokenText}"`;
                console.log(leaf);
            }
        }
    }
}

export default printTree;
