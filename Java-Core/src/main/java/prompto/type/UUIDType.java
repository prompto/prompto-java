package prompto.type;

import java.lang.reflect.Type;
import java.util.UUID;

import prompto.runtime.Context;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class UUIDType extends NativeType {

	static UUIDType instance = new UUIDType();
	
	public static UUIDType instance() {
		return instance;
	}
	
	private UUIDType() {
		super(Family.UUID);
	}
	
	@Override
	public Type getJavaType() {
		return UUID.class;
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		return new prompto.value.UUID(value.asText());
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof UUIDType) || (other instanceof AnyType);
	}
	
	@Override
	public IValue convertJavaValueToPromptoValue(Context context, Object value) {
		return new prompto.value.UUID((UUID)value);
	}
}