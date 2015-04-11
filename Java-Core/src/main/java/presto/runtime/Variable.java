package presto.runtime;

import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.grammar.Identifier;
import presto.type.IType;

public class Variable implements INamed {

	Identifier name;
	IType type;
	
	public Variable(Identifier name, IType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name.toString();
	}
	
	@Override
	public Identifier getName() {
		return name;
	}

	@Override
	public IType getType(Context context) throws SyntaxError {
		return type;
	}
	
}
