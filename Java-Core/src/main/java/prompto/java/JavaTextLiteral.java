package prompto.java;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;

public class JavaTextLiteral extends JavaLiteral {

	String value;
	
	public JavaTextLiteral(String text) {
		super(text);
		this.value = text.substring(1,text.length()-1);
	}

	@Override
	public String toString() {
		return "\"" + value + "\"";
	}
	
	@Override
	public Object interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(String.class);
	}
}
