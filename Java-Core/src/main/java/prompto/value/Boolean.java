package prompto.value;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.BooleanType;

public class Boolean extends BaseValue implements Comparable<Boolean> {
	
	public static Boolean TRUE = new Boolean(true);
	public static Boolean FALSE = new Boolean(false);

	static {
		TRUE.not = FALSE;
		FALSE.not = TRUE;
	}

	public static Boolean parse(String text) {
		return valueOf(java.lang.Boolean.parseBoolean(text));
	}

	public static Boolean valueOf(boolean value) {
		return value ? TRUE : FALSE;
	}

	boolean value;
	Boolean not;

	private Boolean(boolean value) {
		super(BooleanType.instance());
		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	public Boolean getNot() {
		return not;
	}

	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
	}
	
	@Override
	public int CompareTo(Context context, IValue value) throws SyntaxError {
		if (value instanceof Boolean)
			return compareTo((Boolean) value);
		else
			throw new SyntaxError("Illegal comparison: Boolean + " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(Boolean other) {
		return java.lang.Boolean.compare(this.value, other.value);
	}

	@Override
	public Object convertTo(Class<?> type) {
		return value;
	}

	@Override
	public String toString() {
		return java.lang.Boolean.toString(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Boolean)
			return value == ((Boolean) obj).value;
		else
			return false;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeBoolean(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
