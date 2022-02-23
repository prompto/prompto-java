package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.BooleanType;

public class BooleanValue extends BaseValue implements Comparable<BooleanValue> {
	
	public static BooleanValue TRUE = new BooleanValue(true);
	public static BooleanValue FALSE = new BooleanValue(false);

	static {
		TRUE.not = FALSE;
		FALSE.not = TRUE;
	}

	public static BooleanValue parse(String text) {
		return valueOf(java.lang.Boolean.parseBoolean(text));
	}

	public static BooleanValue valueOf(boolean value) {
		return value ? TRUE : FALSE;
	}

	boolean value;
	BooleanValue not;

	private BooleanValue(boolean value) {
		super(BooleanType.instance());
		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	public BooleanValue getNot() {
		return not;
	}
	
	@Override
	public Object getStorableData() {
		return value;
	}

	@Override
	public int compareTo(Context context, IValue value) {
		if (value instanceof BooleanValue)
			return compareTo((BooleanValue) value);
		else
			throw new SyntaxError("Illegal comparison: Boolean + " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(BooleanValue other) {
		return java.lang.Boolean.compare(this.value, other.value);
	}

	@Override
	public Object toJavaValue(Context context, Type type) {
		if(type==boolean.class || type==Boolean.class)
			return value;
		else
			return super.toJavaValue(context, type);
	}

	@Override
	public String toString() {
		return java.lang.Boolean.toString(value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BooleanValue)
			return value == ((BooleanValue) obj).value;
		else
			return false;
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.booleanNode(value);
	}

	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeBoolean(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
