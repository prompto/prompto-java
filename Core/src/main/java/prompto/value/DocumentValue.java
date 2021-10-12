package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
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
import prompto.intrinsic.PromptoSet;
import prompto.java.JavaClassType;
import prompto.runtime.Context;
import prompto.store.InvalidValueError;
import prompto.type.AnyType;
import prompto.type.DocumentType;
import prompto.type.TextType;

public class DocumentValue extends BaseValue {
	
	PromptoDocument<Identifier,IValue> values = new PromptoDocument<Identifier,IValue>();
	
	public DocumentValue() {
		super(DocumentType.instance());
	}
	

	@SuppressWarnings("unchecked")
	public DocumentValue(Context context, PromptoDocument<?, ?> doc, boolean docNeedsConversion) {
		super(DocumentType.instance());
		if(docNeedsConversion)
			this.convertPromptoDocument(context, doc);
		else
			values = (PromptoDocument<Identifier, IValue>) doc;
	}


	private void convertPromptoDocument(Context context, PromptoDocument<?, ?> doc) {
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
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		switch(name) {
		case "count":
			return new IntegerValue(this.values.size());
		case "keys":
			return getKeysValue();
		case "values":
			return new ListValue(AnyType.instance(), this.values.values());
		case "json":
			return super.getMember(context, id, autoCreate);
		default:
	    	return getMember(id, autoCreate);
		}
	}
    
    
    private IValue getKeysValue() {
    	PromptoSet<IValue> keys = this.values.keySet().stream()
    			.map(Identifier::toString)
    			.map(TextValue::new)
    			.collect(Collectors.toCollection(()->new PromptoSet<IValue>()));
    	return new SetValue(TextType.instance(), keys);
	}


	public Set<Identifier> getMemberIds() {
    	return values.keySet();
    }

    private IValue getMember(Identifier id, boolean autoCreate) {
    	if(values.containsKey(id))
    		return values.get(id);
    	else if("text".equals(id.toString()))
    		return new TextValue(this.toString());
    	else if(autoCreate) {
            IValue result = new DocumentValue();
            values.put(id, result);
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
	public IValue plus(Context context, IValue value) throws PromptoError {
		if(value instanceof DocumentValue) {
			PromptoDocument<Identifier,IValue> result = values.add(((DocumentValue)value).values);
			return new DocumentValue(context, result, false);
		} else
			return super.plus(context, value);
	}

	@Override
	public String toString() {
		return values.toString(DocumentValue::toJson, false);
	}
	
	static void toJson(IValue value, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws IOException{
		value.toJsonStream(null, generator, withType, binaries);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DocumentValue)
			return values.equals(((DocumentValue)obj).values);
		else
			return false;
	}
	
	@Override
	public Object toJavaValue(Context context, Type type) {
		if(canConvertTo(type)) {
			PromptoDocument<String, Object> result = new PromptoDocument<>();
			result.putAll(values.entrySet().stream()
					// can't use Collectors.toMap because it rejects null values
					.collect(HashMap::new, (m, e)->m.put(e.getKey().toString(), e.getValue().toJavaValue(context, Object.class)), HashMap::putAll));
			return result;
		} else
			return super.toJavaValue(context, type);
				
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
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
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
					value.toJsonStream(context, generator, withType, binaries);
			}
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
