package prompto.value;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.UUIDType;

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
	
	public java.util.UUID getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeString(value.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
	@Override
	public void store(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
	}

}