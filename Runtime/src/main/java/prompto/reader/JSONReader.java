package prompto.reader;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class JSONReader {
	
	public static Object read(String json) throws IOException {
		try {
			JsonNode node = new ObjectMapper().readTree(json);
			return nodeToPrompto(node);
		} catch(RuntimeException e) {
			throw new IOException(e.getMessage());
		}
	}

	private static Object nodeToPrompto(JsonNode node) {
		if(node==null)
			return null;
		else if(node.isNull())
			return null;
		else if(node.isBoolean())
			return node.asBoolean();
		else if(node.isIntegralNumber())
			return node.asLong();
		else if(node.isFloatingPointNumber())
			return node.asDouble();
		else if(node.isTextual())
			return node.asText();
		else if(node.isArray())
			return nodeToPromptoList((ArrayNode)node);
		else if(node.isObject())
			return nodeToPromptoDocument((ObjectNode)node);
		else
			throw new RuntimeException("unsupported node type: " + node.getNodeType().name());
	}

	private static Object nodeToPromptoDocument(ObjectNode node) {
		PromptoDocument<String, Object> doc = new PromptoDocument<>();
		node.fields().forEachRemaining((f)->{
			doc.put(f.getKey(), nodeToPrompto(f.getValue()));
		});
		return doc;
	}

	private static PromptoList<Object> nodeToPromptoList(ArrayNode node) {
		List<Object> list = StreamSupport.stream(node.spliterator(), false)
				.map(JSONReader::nodeToPrompto)
				.collect(Collectors.toList());
		return new PromptoList<Object>(list, false);
	}

}
