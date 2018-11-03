package prompto.type;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class UuidType extends NativeType {

	static UuidType instance = new UuidType();
	
	public static UuidType instance() {
		return instance;
	}
	
	private UuidType() {
		super(Family.UUID);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return UUID.class;
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return new prompto.value.UuidValue(value.asText());
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		return new prompto.value.UuidValue((UUID)value);
	}
}