package prompto.declaration;

import prompto.grammar.SymbolList;

public interface IEnumeratedDeclaration extends IDeclaration {
	SymbolList<?> getSymbols();
}
