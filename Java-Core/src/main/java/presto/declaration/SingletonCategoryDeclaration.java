package presto.declaration;

import presto.grammar.CategoryMethodDeclarationList;
import presto.grammar.IdentifierList;
import presto.utils.CodeWriter;

public class SingletonCategoryDeclaration extends ConcreteCategoryDeclaration {

	public SingletonCategoryDeclaration(String name, IdentifierList attributes, CategoryMethodDeclarationList methods) {
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
