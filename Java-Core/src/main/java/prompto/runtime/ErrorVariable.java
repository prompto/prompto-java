package prompto.runtime;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;

public class ErrorVariable extends Variable {

	public ErrorVariable(Identifier name) {
		super(name,null);
	}
	
	@Override
	public String toString() {
		return getId().toString();
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return new EnumeratedCategoryType(new Identifier("Error"));
	}
	
}
