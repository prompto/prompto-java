package presto.runtime;

import presto.declaration.AttributeDeclaration;
import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.type.IType;

public class Attribute implements INamed {

	Identifier name;
	
	public Attribute(Identifier name) {
		this.name = name;
	}

	@Override
	public Identifier getIdentifier() {
		return name;
	}

	@Override
	public IType getType(Context context) throws SyntaxError {
		AttributeDeclaration declaration = context.getRegisteredDeclaration(AttributeDeclaration.class, name);
		return declaration.getType(context);
	}

}
