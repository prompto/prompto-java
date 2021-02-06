package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Context;
import prompto.type.VersionType;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

public class VersionValue extends BaseValue implements Comparable<VersionValue> {

	public static VersionValue Parse(String text) {
		PromptoVersion value = PromptoVersion.parse(text);
		return new VersionValue(value);
	}

	PromptoVersion value;

	public VersionValue(PromptoVersion value) {
		super(VersionType.instance());
		this.value = value;

	}

	@Override
	public PromptoVersion getStorableData() {
		return value;
	}

	
	@Override
	public int compareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof VersionValue)
			return this.value.compareTo(((VersionValue) value).value);
		else
			throw new SyntaxError("Illegal comparison: Version - "
					+ value.getClass().getSimpleName());

	}
	
	@Override
	public Object convertTo(Context context, Type type) {
		return value;
	}

	@Override
	public int compareTo(VersionValue other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VersionValue)
			return value.equals(((VersionValue) obj).value);
		else
			return value.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.textNode(this.toString());
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeStringField("type", VersionType.instance().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeString(value.toString());
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
}
