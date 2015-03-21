package presto.runtime;

import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.type.IType;

public class Variable implements INamed {

	String name;
	IType type;
	
	public Variable(String name, IType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name.toString();
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public IType getType(Context context) throws SyntaxError {
		return type;
	}
	
}
