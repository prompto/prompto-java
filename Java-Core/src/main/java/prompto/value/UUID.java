package prompto.value;

import java.io.IOException;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.UUIDType;

import com.fasterxml.jackson.core.JsonGenerator;

public class UUID extends BaseValue {

	java.util.UUID value;
	
	public UUID(String value) {
		super(UUIDType.instance());
		this.value = java.util.UUID.fromString(value);
	}

	public UUID(java.util.UUID value) {
		super(UUIDType.instance());
		this.value = value;
	}

	@Override
	public java.util.UUID getStorableData() {
		return value;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, Object instanceId, Identifier fieldName, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeStartObject();
			generator.writeFieldName("type");
			generator.writeString(UUIDType.instance().getTypeName());
			generator.writeFieldName("value");
			generator.writeString(this.toString());
			generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
}
