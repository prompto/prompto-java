package prompto.literal;

import java.io.CharArrayWriter;
import java.nio.CharBuffer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public abstract class Literal<T extends IValue> implements IExpression {
	
	Supplier<String> text;
	protected T value;
	
	protected Literal(String text, T value) {
		this(()->text, value);
	}
	
	protected Literal(Supplier<String> text, T value) {
		this.text = text;
		this.value = value;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(escapedText(writer.getEscapeMode()));
	}
	
	public String escapedText(int escapeMode) {
		String value = text.get();
		if(escapeMode <= 0 || !value.contains("'"))
			return value;
		else {
			// can't get regex to work with '
			return value.chars()
					.mapToObj(c->(String)(c=='\'' ? "\\'" : Character.valueOf((char)c).toString()))
					.collect(Collectors.joining());
		}
	}

	@Override
	public String toString() {
		return text.get();
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
