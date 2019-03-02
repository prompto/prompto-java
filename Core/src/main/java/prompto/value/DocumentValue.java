package prompto.value;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.java.JavaClassType;
import prompto.runtime.Context;
import prompto.store.InvalidValueError;
import prompto.type.AnyType;
import prompto.type.DocumentType;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
		value.toJson(null, generator, instanceId, new Identifier(fieldName), withType, binaries);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DocumentValue)
			return values.equals(((DocumentValue)obj).values);
		else
			return false;
	}
	
	
	@Override
	public JsonNode toJson(Context context, boolean withType) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		ObjectNode value = result;
		if(withType) {
			result.put("typeName", DocumentType.instance().getTypeName());
			value = JsonNodeFactory.instance.objectNode();
			result.set("value", value);
		}
		for(Entry<Identifier, IValue> entry : values.entrySet())
			value.set(entry.getKey().toString(), entry.getValue().toJson(context, withType));
		return result;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, Object instanceId, Identifier fieldName, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
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
					value.toJson(context, generator, System.identityHashCode(this), entry.getKey(), withType, binaries);
			}
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
