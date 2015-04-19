package presto.runtime;

import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.type.EnumeratedCategoryType;
import presto.type.IType;

public class ErrorVariable extends Variable {

	public ErrorVariable(Identifier name) {
		super(name,null);
	}
	
	@Override
	public String toString() {
		return getIdentifier().toString();
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return new EnumeratedCategoryType(new Identifier("Error"));
	}
	
}
