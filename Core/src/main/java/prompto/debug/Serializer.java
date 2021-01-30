package prompto.debug;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import prompto.debug.ack.Acknowledged;
import prompto.debug.ack.IAcknowledgement;
import prompto.debug.event.IDebugEvent;
import prompto.debug.request.IDebugRequest;
import prompto.debug.response.IDebugResponse;
import prompto.utils.Logger;

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
		Map<String, Object> message = new HashMap<>();
		message.put("type", value.getClass().getSimpleName());
		message.put("value", value);
		mapper.writeValue(output, message);
		output.flush();
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
	
	@SuppressWarnings("unchecked")
	public static <T extends Object> T readMessage(InputStream input) throws Exception {
		JsonNode content = mapper.readTree(input);
		String type = content.get("type").asText();
		Class<?> klass = getClassForName(type);
		return (T)mapper.convertValue(content.get("value"), klass);
	}

	private static Class<?> getClassForName(String typeName) throws Exception {
		if(typeName.equals(Acknowledged.class.getSimpleName()))
			return Acknowledged.class;
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
