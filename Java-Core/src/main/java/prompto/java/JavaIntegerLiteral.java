package prompto.java;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;


public class JavaIntegerLiteral extends JavaLiteral {

	Long value;
	
	public JavaIntegerLiteral(String text) {
		super(text);
		this.value = Long.valueOf(text);
	}

	@Override
	public Long interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(Long.class);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
