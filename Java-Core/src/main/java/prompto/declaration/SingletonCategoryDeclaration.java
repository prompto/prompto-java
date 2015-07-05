package prompto.declaration;

import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;

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
