package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.runtime.Context;
import prompto.type.NullType;


public class NullValue extends BaseValue {

	static NullValue instance = new NullValue();
	
	public static NullValue instance() {
		return instance;
	}
	
	private NullValue() {
		super(NullType.instance());
	}
	
	@Override
	public String toString() {
		return "null";
	}
	
	@Override
	public Object getStorableData() {
		return null; // YES! you read correctly
	}
	
	
	@Override
	public Object toJavaValue(Context context, Type type) {
		return null; // YES! you read correctly
	}
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		return JsonNodeFactory.instance.nullNode();
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeNull();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
