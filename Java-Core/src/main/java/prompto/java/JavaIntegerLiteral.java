package prompto.java;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;


public class JavaIntegerLiteral extends JavaLiteral {

	Integer value;
	
	public JavaIntegerLiteral(String text) {
		super(text);
		this.value = Integer.valueOf(text);
	}

	@Override
	public Integer interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(Integer.class);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
