package prompto.debug;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.debug.ack.Acknowledged;
import prompto.debug.ack.IAcknowledgement;
import prompto.debug.event.IDebugEvent;
import prompto.debug.request.IDebugRequest;
import prompto.debug.response.IDebugResponse;
import prompto.debug.stack.LeanStackFrame;
import prompto.debug.value.FatValue;
import prompto.debug.variable.FatVariable;
import prompto.debug.variable.LeanVariableList;
import prompto.debug.worker.LeanWorker;
import prompto.parser.Location;
import prompto.parser.Section;
import prompto.utils.Logger;

@SuppressWarnings({"unchecked", "rawtypes"})
public class Serializer {

	static Logger logger = new Logger();
	static ObjectMapper mapper = initMapper();
	
	private static ObjectMapper initMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
		mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
		return mapper;
	}

	
	static class DebugMessage<T extends Object> {

		String type;
		T value;

		public String getType() {
			return type;
		}
		
		
		public T getValue() {
			return value;
		}
	}
	
	static class DebugRequestMessage extends DebugMessage<IDebugRequest> {
		
	}
	
	static class DebugResponseMessage extends DebugMessage<IDebugResponse> {
		
	}

	static class DebugEventMessage extends DebugMessage<IDebugEvent> {

	}
	
	static class AcknowledgementMessage extends DebugMessage<Object> {
	}
	
	
	public static <T extends Object> void writeMessage(OutputStream output, T value) throws Exception {
		Map<String, Object> message = preSerializeObject(value);
		mapper.writeValue(output, message);
		output.flush();
	}
	
	private static Object safePreSerialize(Object value) {
		try {
			return preSerialize(value);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Object preSerialize(Object value) throws Exception {
		if(value==null || value instanceof Boolean || value instanceof String || value instanceof Number || value instanceof JsonNode)
			return value;
		else if(Enum.class.isAssignableFrom(value.getClass()))
			return ((Enum)value).name();
		else if(Iterable.class.isAssignableFrom(value.getClass()))
			return preSerializeArray((Iterable<?>)value);
		else
			return preSerializeObject(value);
	}

	private static List<Object> preSerializeArray(Iterable<?> iterable) throws Exception {
		return StreamSupport.stream(iterable.spliterator(), false)
					.map(Serializer::safePreSerialize)
					.collect(Collectors.toList());
	}
	
	private static Map<String, Object> preSerializeObject(Object object) throws Exception {
		Map<String, Object> result = new HashMap<>();
		result.put("type", getNameForClass(object.getClass()));
		Map<String, Object> value = new HashMap<>();
		preSerializeFields(object.getClass(), object, value);
		result.put("value", value);
		return result;
	}


	private static void preSerializeFields(Class<?> klass, Object value, Map<String, Object> map) throws Exception, IllegalAccessException {
		if(klass.getSuperclass()!=Object.class)
			preSerializeFields(klass.getSuperclass(), value, map);
		for(Field field : klass.getDeclaredFields()) {
			field.setAccessible(true);
			Object fieldValue = field.get(value);
			map.put(field.getName(), preSerialize(fieldValue));
		}
	}

	public static <T extends Object> String writeMessage(T value) throws Exception {
		try(ByteArrayOutputStream output = new ByteArrayOutputStream()) {
			writeMessage(output, value);
			return output.toString();
		}
	}
	
	public static <T extends Object> T readMessage(String message) throws Exception {
		try(InputStream input = new ByteArrayInputStream(message.getBytes())) {
			return Serializer.<T>readMessage(input);
		}
	}
	
	public static <T extends Object> T readMessage(InputStream input) throws Exception {
		JsonNode content = mapper.readTree(input);
		return (T)postDeserialize(content);
		
	}

	private static Object postDeserialize(JsonNode node) throws Exception {
		if(node.isNull())
			return null;
		else if(node.isBoolean())
			return node.booleanValue();
		else if(node.isNumber())
			return node.numberValue();
		else if(node.isTextual())
			return node.textValue();
		else if(node.isObject())
			return postDeserializeObject(null, (ObjectNode)node);
		else
			throw new UnsupportedOperationException(node.getNodeType().name());
	}
	
	private static Object postDeserializeObject(Type type, ObjectNode node) throws Exception {
		String typeName = node.get("type").asText();
		Class<?> klass = getInstanceType(type, typeName); 
		Object value = klass.newInstance();
		JsonNode  data = node.get("value");
		postDeserializeFields(klass, value, data);
		return value;
	}

	private static Class<?> getInstanceType(Type type, String typeName) throws Exception {
		if(type instanceof Class) {
			int modifiers = ((Class<?>)type).getModifiers();
			if(!(Modifier.isInterface(modifiers) || Modifier.isAbstract(modifiers)))
				return (Class<?>)type;
		}
		return getClassForName(typeName);
	}

	private static void postDeserializeFields(Class<?> klass, Object value, JsonNode node) throws Exception {
		if(klass.getSuperclass()!=Object.class)
			postDeserializeFields(klass.getSuperclass(), value, node);
		for(Field field : klass.getDeclaredFields()) {
			field.setAccessible(true);
			JsonNode fieldNode = node.get(field.getName());
			Type type = field.getGenericType();
			field.set(value, postDeserialize(type, fieldNode));
		}
	}

	private static Object postDeserialize(Type type, JsonNode node) throws Exception {
		if(type == JsonNode.class) {
			return node;
		} else if(node.isTextual()) {
			String value = node.textValue();
			if(type==String.class)
				return value;
			else if(type instanceof Class && Enum.class.isAssignableFrom((Class)type)) {
				return Enum.valueOf((Class<Enum>)type, (String)value);
			} else
				throw new UnsupportedOperationException(type.getTypeName());
		} else if(type instanceof Class && List.class.isAssignableFrom((Class)type) && node.isArray())
			return postDeserializeList(type, (ArrayNode)node);
		else if(type instanceof ParameterizedType && List.class==((ParameterizedType)type).getRawType() && node.isArray())
			return postDeserializeList(type, (ArrayNode)node);
		else if(node instanceof ObjectNode)
			return postDeserializeObject(type, (ObjectNode)node);
		else	
			return postDeserialize(node);
	}

	private static Object postDeserializeList(Type type, ArrayNode array) throws Exception {
		Type itemType = getListItemType(type);
		List<Object> list = type instanceof Class ? ((Class<List<Object>>)type).newInstance() : new ArrayList<Object>();
		for(JsonNode item : array) {
			Object value = postDeserialize(itemType, item);
			list.add(value);
		}
		return list;
	}

	private static Type getListItemType(Type type) {
		ParameterizedType listType = null;
		while(listType==null && type!=Object.class) {
			if(type instanceof ParameterizedType) {
				listType = (ParameterizedType)type;
				return listType.getActualTypeArguments()[0];
			} else if(type instanceof Class)
				type = ((Class)type).getGenericSuperclass();
			else
				return Object.class;
				
		}
		return Object.class;
	}

	private static String getNameForClass(Class<?> klass) {
		String name = klass.getSimpleName();
		if(name.startsWith("Lean"))
			name = name.substring("Lean".length());
		else if(name.startsWith("Fat"))
			name = name.substring("Fat".length());
		return name;
	}

	private static Class<?> getClassForName(String typeName) throws Exception {
		if(typeName.equals(Acknowledged.class.getSimpleName()))
			return Acknowledged.class;
		else if(typeName.equals("StackFrame"))
			return LeanStackFrame.class;
		else if(typeName.equals("Variable"))
			return FatVariable.class;
		else if(typeName.equals("Value"))
			return FatValue.class;
		else if(typeName.equals("Worker"))
			return LeanWorker.class;
		else if(typeName.equals("VariableList"))
			return LeanVariableList.class;
		else if(typeName.equals(Section.class.getSimpleName()))
			return Section.class;
		else if(typeName.equals(Location.class.getSimpleName()))
			return Location.class;
		else {
			// by convention all implementations sit in the same package as their interface
			Class<?> intf = null;
			if(typeName.endsWith("DebugRequest"))
				intf = IDebugRequest.class;
			else if(typeName.endsWith("DebugResponse"))
				intf = IDebugResponse.class;
			else if(typeName.endsWith("DebugEvent"))
				intf = IDebugEvent.class;
			else {
				logger.error(()->{return "Cannot resolve typeName: " + typeName;});
				return null;
			}
			return Class.forName(intf.getPackage().getName() + "." + typeName);
		}
	}

	public static IAcknowledgement readAcknowledgement(String message) throws Exception {
		return Serializer.<IAcknowledgement>readMessage(message);
	}
	
	public static IDebugRequest readDebugRequest(String message) throws Exception {
		return Serializer.<IDebugRequest>readMessage(message);
	}

	public static IDebugResponse readDebugResponse(String message) throws Exception {
		return Serializer.<IDebugResponse>readMessage(message);
	}

	public static IDebugEvent readDebugEvent(String message) throws Exception {
		return Serializer.<IDebugEvent>readMessage(message);
	}

	public static IAcknowledgement readAcknowledgement(InputStream input) throws Exception {
		return Serializer.<IAcknowledgement>readMessage(input);
	}

	public static IDebugRequest readDebugRequest(InputStream input) throws Exception {
		return Serializer.<IDebugRequest>readMessage(input);
	}

	public static IDebugResponse readDebugResponse(InputStream input) throws Exception {
		return Serializer.<IDebugResponse>readMessage(input);
	}

	public static IDebugEvent readDebugEvent(InputStream input) throws Exception {
		return Serializer.<IDebugEvent>readMessage(input);
	}
	

}
