package prompto.literal;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public abstract class Literal<T extends IValue> implements IExpression {
	
	String text;
	T value;
	
	protected Literal(String text, T value) {
		this.text = text;
		this.value = value;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text);
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	public T getValue() {
		return value;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Literal)
			return value.equals(((Literal<?>)obj).value);
		else
			return value.equals(obj);
	}
	
}
