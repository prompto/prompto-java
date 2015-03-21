package presto.runtime;

import presto.error.SyntaxError;
import presto.type.EnumeratedCategoryType;
import presto.type.IType;

public class ErrorVariable extends Variable {

	public ErrorVariable(String name) {
		super(name,null);
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return new EnumeratedCategoryType("Error");
	}
	
}
