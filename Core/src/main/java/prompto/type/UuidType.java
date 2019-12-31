package prompto.type;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.UUID;

import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.NullValue;

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
		if(value.isNull())
			return NullValue.instance();
		else
			return new prompto.value.UuidValue(value.asText());
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		return new prompto.value.UuidValue((UUID)value);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("UUID");
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("UUID");
	}

	@Override
	public void transpileCode(Transpiler transpiler) {
		transpiler.append(".toString()");
	}
}