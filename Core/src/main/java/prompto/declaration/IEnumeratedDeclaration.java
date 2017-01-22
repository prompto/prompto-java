package prompto.declaration;

import prompto.expression.Symbol;
import prompto.grammar.SymbolList;

public interface IEnumeratedDeclaration<T extends Symbol> extends IDeclaration {
	SymbolList<T> getSymbols();
}
