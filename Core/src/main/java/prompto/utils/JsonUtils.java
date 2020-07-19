package prompto.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class JsonUtils {

	public static JsonNode parseResource(String resource) throws IOException {
		try(InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource)) {
			return parseInput(input);
		}
	}

	public static JsonNode parseInput(InputStream input) throws IOException {
		return new ObjectMapper().readTree(input);
	}

	public static JsonNode parseString(String data) throws IOException {
		return new ObjectMapper().readTree(data);
	}

	public static String objectToJson(Object object) throws IOException {
		return new ObjectMapper().writeValueAsString(object);
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> toMap(ObjectNode node) {
		return new ObjectMapper().convertValue(node, Map.class);
	}


}
