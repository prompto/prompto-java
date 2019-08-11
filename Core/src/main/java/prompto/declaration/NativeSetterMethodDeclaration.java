package prompto.declaration;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.statement.StatementList;
import prompto.type.IType;

public class NativeSetterMethodDeclaration extends SetterMethodDeclaration {

	public NativeSetterMethodDeclaration(Identifier id, StatementList statements) {
		super(id, statements);
	}
	
	@Override
	public IType checkChild(Context context) {
		if(parameters!=null)
			parameters.check(context);
		return check(context);
	}


}
