package prompto.value;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.runtime.Context;
import prompto.type.UuidType;

public class UuidValue extends BaseValue {

	java.util.UUID value;
	
	public UuidValue(String value) {
		super(UuidType.instance());
		this.value = java.util.UUID.fromString(value);
	}

	public UuidValue(java.util.UUID value) {
		super(UuidType.instance());
		this.value = value;
	}

	public java.util.UUID getValue() {
		return value;
	}
	
	@Override
	public java.util.UUID getStorableData() {
		return value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UuidValue)
			return value.equals(((UuidValue) obj).value);
		else
			return value.equals(obj);
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.textNode(value.toString());
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(UuidType.instance().getTypeName());
				generator.writeFieldName("value");
				generator.writeString(this.toString());
				generator.writeEndObject();
			} else
				generator.writeString(this.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
}
