package prompto.java;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;


public class JavaBooleanLiteral extends JavaLiteral {

	Boolean value;
	
	public JavaBooleanLiteral(String text) {
		super(text);
		value = Boolean.valueOf(text);
	}
	
	@Override
	public Object interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(Boolean.class);
	}

}
