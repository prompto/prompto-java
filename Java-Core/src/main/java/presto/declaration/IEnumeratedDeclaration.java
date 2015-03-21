package presto.declaration;

import presto.grammar.SymbolList;

public interface IEnumeratedDeclaration extends IDeclaration {
	SymbolList<?> getSymbols();
}
