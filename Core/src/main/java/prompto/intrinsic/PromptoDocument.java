package prompto.intrinsic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.parser.ECleverParser;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.utils.IOUtils;

@SuppressWarnings("serial")
public class PromptoDocument<K,V> extends HashMap<K,V> implements ISerializable, IJsonNodeProducer {

	public PromptoDocument() {
		
	}

	public PromptoDocument(Map<K, V> from) {
		super(from);
	}
	
	public PromptoDocument<K, V> add(Map<K, V> toAdd) {
		PromptoDocument<K, V> doc = new PromptoDocument<>();
		doc.putAll(this);
		doc.putAll(toAdd);
		return doc;
	}

	public Long getCount() {
		return (long)size();
	}
	
	public PromptoSet<K> getKeys() {
		PromptoSet<K> set = new PromptoSet<K>();
		set.addAll(keySet()); // TODO worth the copy?
		return set;
	}
	
	public PromptoList<V> getValues() {
		return new PromptoList<V>(values(), false); // TODO worth the copy?
	}
	
	@SuppressWarnings("unchecked")
	public V getOrCreate(K key, Class<? extends V> autoCreate) {
		if(super.containsKey(key))
			return super.get(key);
		else if("text".equals(key))
			return (V)this.toString();
		else if(autoCreate!=null) try {
			V v = autoCreate.getDeclaredConstructor().newInstance();
			super.put(key, v);
			return v;
		} catch(IllegalAccessException | InstantiationException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		} else
			return null;
	}
	
	@Override
	public void toJson(JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(DocumentType.instance().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartObject();
			for(Entry<K, V> entry : entrySet()) {
				fieldName = String.valueOf(entry.getKey());
				generator.writeFieldName(fieldName);
				V value = entry.getValue();
				if(value==null)
					generator.writeNull();
				else
					valueToJson(value, generator, System.identityHashCode(this), fieldName, withType, binaries);
			}
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	private void valueToJson(V value, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws IOException {
		if(value instanceof ISerializable)
			((ISerializable)value).toJson(generator, instanceId, fieldName, withType, binaries);
		else if(value instanceof Boolean)
			generator.writeBoolean(((Boolean)value).booleanValue());
		else if(value instanceof Long)
			generator.writeNumber(((Long)value).longValue());
		else if(value instanceof Double)
			generator.writeNumber(((Double)value).doubleValue());
		else if(value instanceof String)
			generator.writeString((String)value);
		else if(value instanceof LocalDateTime) {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(DateTimeType.instance().getTypeName());
				generator.writeFieldName("value");
				generator.writeString(value.toString());
				generator.writeEndObject();
			} else
				generator.writeString(value.toString());
		} else if(value instanceof PromptoList) {
			generator.writeStartArray();
			for(V item : (PromptoList<V>)value)
				valueToJson(item, generator, null, null, withType, binaries);
			generator.writeEndArray();
		} else if(value instanceof Character) {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(CharacterType.instance().getTypeName());
				generator.writeFieldName("value");
				generator.writeString(value.toString());
				generator.writeEndObject();
			} else
				generator.writeString(value.toString());
		} else
			throw new UnsupportedOperationException("valueToJson for " + value.getClass().getName());
	}
	
	@SuppressWarnings("unchecked")
	public void populateFrom(Object value) {
		if(value instanceof PromptoBinary)
			populateFromBinary((PromptoBinary)value);
		else if(value instanceof PromptoRoot) {
			PromptoDocument<String,Object> doc = ((PromptoRoot)value).toDocumentValue();
			putAll((Map<? extends K, ? extends V>) doc);
		} else
			throw new UnsupportedOperationException();
	}

	private void populateFromBinary(PromptoBinary blob) {
		if(!"application/zip".equals(blob.getMimeType()))
			throw new UnsupportedOperationException();
		try {
			Map<String, byte[]> parts = readParts(blob);
			JsonNode value = readValue(parts);
			JsonNode field = value.get("type");
			if(field==null)
				throw new InvalidParameterException("Expecting a 'type' field!");
			IType type = new ECleverParser(field.asText()).parse_standalone_type();
			if(type!=DocumentType.instance())
				throw new InvalidParameterException("Expecting a Document type!");
			field = value.get("value");
			if(field==null)
				throw new InvalidParameterException("Expecting a 'value' field!");
			readJSONValue(field, parts);
		} catch(Exception e) {
			throw new ReadWriteError(e.getMessage());
		}	
	}

	@SuppressWarnings("unchecked")
	private void readJSONValue(JsonNode value, Map<String, byte[]> parts) {
		Iterator<Map.Entry<String, JsonNode>> fields = value.fields();
		while(fields.hasNext()) {
			Map.Entry<String, JsonNode> field = fields.next();
			Object item = readJSONField(field.getValue(), parts);
			this.put((K)field.getKey(), (V)item);
		}
	}
	
	public static Object readJSONField(JsonNode fieldData, Map<String, byte[]> parts) throws PromptoError {
		if(fieldData==null || fieldData.isNull())
			return null;
		else if(fieldData.isBoolean())
			return Boolean.valueOf(fieldData.asBoolean());
		else if(fieldData.isInt() || fieldData.isLong())
			return Long.valueOf(fieldData.asLong());
		else if(fieldData.isFloat() || fieldData.isDouble())
			return Double.valueOf(fieldData.asDouble());
		else if(fieldData.isTextual())
			return fieldData.asText();
		else if(fieldData.isArray()) {
			throw new UnsupportedOperationException();
		} else if(fieldData.isObject()) {
			throw new UnsupportedOperationException();
		} else
			throw new UnsupportedOperationException();
	}

	public static Map<String, byte[]> readParts(PromptoBinary blob) throws IOException {
		Map<String, byte[]> binaries = new HashMap<>();
		try(ByteArrayInputStream input = new ByteArrayInputStream(blob.getBytes())) {
			try (ZipInputStream zip = new ZipInputStream(input)) {
				for(;;) {
					ZipEntry entry = zip.getNextEntry();
					if(entry==null)
						break;
					byte[] data = IOUtils.readStreamFully(zip);
					binaries.put(entry.getName(), data);
					zip.closeEntry();
				}
				return binaries;
			}
		} 
	}

	public static JsonNode readValue(Map<String, byte[]> parts) throws IOException {
		byte[] data = parts.get("value.json");
		if(data==null)
			throw new InvalidParameterException("Expecting a 'value.json' part!");
		try(var parser = new ObjectMapper().getFactory().createParser(data)) {
			return parser.readValueAsTree();
		}
	}
	
	@Override
	public String toString() {
		return toString(this::valueToJson, false);
	}
	
	public interface ValueToJson<V> {
		void apply(V value, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws IOException;
	}
	
	public String toString(ValueToJson<V> o, boolean withType) {
		try {
			Map<String, byte[]> binaries = new HashMap<>();
			// create textual data
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			JsonGenerator generator = new JsonFactory().createGenerator(output);
			generator.writeStartObject();
			for(Entry<K, V> entry : entrySet()) {
				generator.writeFieldName(String.valueOf(entry.getKey()));
				V value = entry.getValue();
				if(value==null)
					generator.writeNull();
				else
					o.apply(value, generator, System.identityHashCode(this), String.valueOf(entry.getKey()), withType, binaries);
			}
			generator.writeEndObject();
			generator.flush();
			generator.close();
			// return it
			return new String(output.toByteArray());
		} catch(Throwable t) {
			return "<error:" + t.getMessage() + ">";
		}
	}
	
	@Override
	public JsonNode toJsonNode() {
		ObjectNode object = JsonNodeFactory.instance.objectNode();
		entrySet().forEach( e -> {
			object.set(e.getKey().toString(), PromptoConverter.toJsonNode(e.getValue()));
		});
		return object;
	}

}
