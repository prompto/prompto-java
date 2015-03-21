package presto.declaration;

import presto.error.SyntaxError;
import presto.runtime.Context;

public interface ICategoryMethodDeclaration extends IMethodDeclaration {

	void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError;


}
