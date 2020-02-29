package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.java.JavaClassType;
import prompto.runtime.Context;
import prompto.store.InvalidValueError;
import prompto.type.AnyType;
import prompto.type.DocumentType;

public class DocumentValue extends BaseValue {
	
	PromptoDocument<Identifier,IValue> values = new PromptoDocument<Identifier,IValue>();
	
	public DocumentValue() {
		super(DocumentType.instance());
	}
	

	public DocumentValue(Context context, PromptoDocument<?, ?> doc) {
		super(DocumentType.instance());
		for(Object key : doc.keySet()) {
			Object value = doc.get(key);
			IValue item = value==null ? NullValue.instance() :
				JavaClassType.convertJavaValueToPromptoValue(context, value, value.getClass(), AnyType.instance());
			Identifier keyId = new Identifier(String.valueOf(key));
			this.setMember(keyId, item);
		}
	}


	@Override
	public PromptoDocument<Identifier,IValue> getStorableData() {
		return values;
	}
	
	@Override
	public boolean isMutable() {
		return true;
	}
	
    @Override
    public IValue getMember(Context context, Identifier id, boolean autoCreate) {
    	return getMember(id, autoCreate);
 	}
    
    
    public Set<Identifier> getMemberIds() {
    	return values.keySet();
    }

    public IValue getMember(Identifier name, boolean autoCreate) {
    	if(values.containsKey(name))
    		return values.get(name);
    	else if("text".equals(name.toString()))
    		return new TextValue(this.toString());
    	else if(autoCreate) {
            IValue result = new DocumentValue();
            values.put(name, result);
            return result;
        } else
        	return NullValue.instance();
 	}

	@Override
    public void setMember(Context context, Identifier name, IValue value) {
    	values.put(name, value);
    }

   public void setMember(Identifier name, IValue value) {
    	values.put(name, value);
    }
	
	public boolean hasMember(Identifier name) {
		return values.containsKey(name);
	}
	
	
	@Override
	public void setItem(Context context, IValue item, IValue value) {
		if(!(item instanceof TextValue))
			throw new InvalidValueError("Expected a Text, got:" + item.getClass().getName());
		values.put(new Identifier(item.toString()), value);
	}
	
	@Override
	public IValue getItem(Context context, IValue item) {
		if(!(item instanceof TextValue))
			throw new InvalidValueError("Expected a Text, got:" + item.getClass().getName());
		return values.getOrDefault(new Identifier(item.toString()), NullValue.instance());
	}
	

	@Override
	public String toString() {
		return values.toString(DocumentValue::toJson, false);
	}
	
	static void toJson(IValue value, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws IOException{
		value.toJsonStream(null, generator, instanceId, fieldName, withType, binaries);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DocumentValue)
			return values.equals(((DocumentValue)obj).values);
		else
			return false;
	}
	
	@Override
	public Object convertTo(Context context, Type type) {
		if(canConvertTo(type)) {
			PromptoDocument<String, Object> result = new PromptoDocument<>();
			result.putAll(values.entrySet().stream()
					.collect(Collectors.toMap(e->e.getKey().toString(), e->e.getValue().convertTo(context, Object.class))));
			return result;
		} else
			return super.convertTo(context, type);
				
	}
	
	private boolean canConvertTo(Type type) {
		return type==PromptoDocument.class || (type instanceof Class<?> && ((Class<?>)type).isAssignableFrom(PromptoDocument.class));
	}


	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		for(Entry<Identifier, IValue> entry : values.entrySet())
			result.set(entry.getKey().toString(), producer.apply(entry.getValue()));
		return result;
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(DocumentType.instance().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartObject();
			for(Entry<Identifier, IValue> entry : values.entrySet()) {
				generator.writeFieldName(entry.getKey().toString());
				IValue value = entry.getValue();
				if(value==null)
					generator.writeNull();
				else
					value.toJsonStream(context, generator, System.identityHashCode(this), entry.getKey().toString(), withType, binaries);
			}
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
