package prompto.java;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;


public class JavaCharacterLiteral extends JavaLiteral {

	Character value;
	
	public JavaCharacterLiteral(String text) {
		super(text);
		this.value = text.charAt(1);
	}

	@Override
	public String toString() {
		return "'" + value + "'";
	}
	
	@Override
	public Object interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(Character.class);
	}
}
