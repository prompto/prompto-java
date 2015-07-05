package prompto.java;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;

public class JavaDecimalLiteral extends JavaLiteral {

	Double value;
	
	public JavaDecimalLiteral(String text) {
		super(text);
		this.value = Double.valueOf(text);
	}

	@Override
	public Double interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(Double.class);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
