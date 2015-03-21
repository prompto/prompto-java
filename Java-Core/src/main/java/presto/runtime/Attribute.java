package presto.runtime;

import presto.declaration.AttributeDeclaration;
import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.type.IType;

public class Attribute implements INamed {

	String name;
	
	public Attribute(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IType getType(Context context) throws SyntaxError {
		AttributeDeclaration declaration = context.getRegisteredDeclaration(AttributeDeclaration.class, name);
		return declaration.getType(context);
	}

}
