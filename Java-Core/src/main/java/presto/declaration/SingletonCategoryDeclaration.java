package presto.declaration;

import presto.grammar.MethodDeclarationList;
import presto.grammar.Identifier;
import presto.utils.CodeWriter;
import presto.utils.IdentifierList;

public class SingletonCategoryDeclaration extends ConcreteCategoryDeclaration {

	public SingletonCategoryDeclaration(Identifier name, IdentifierList attributes, MethodDeclarationList methods) {
		super(name, attributes, null, methods);
	}
	
	@Override
	protected void categoryTypeToEDialect(CodeWriter writer) {
		writer.append("singleton");
	}

	@Override
	protected void categoryTypeToODialect(CodeWriter writer) {
		writer.append("singleton");
	}

	@Override
	protected void categoryTypeToPDialect(CodeWriter writer) {
		writer.append("singleton");
	}
}
