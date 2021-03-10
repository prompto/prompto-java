package prompto.intrinsic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class PromptoConverter {

	public static Object nodeToPrompto(JsonNode node) {
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
	
	public static Object nodeToPromptoDocument(ObjectNode node) {
		PromptoDocument<String, Object> doc = new PromptoDocument<>();
		node.fields().forEachRemaining((f)->{
			doc.put(f.getKey(), nodeToPrompto(f.getValue()));
		});
		return doc;
	}

	public static PromptoList<Object> nodeToPromptoList(ArrayNode node) {
		List<Object> list = StreamSupport.stream(node.spliterator(), false)
				.map( PromptoConverter::nodeToPrompto)
				.collect(Collectors.toList());
		return new PromptoList<Object>(list, false);
	}
	
	public static String toJson(Object value) {
		JsonNode node = toJsonNode(value);
		return node.toString();
	}

	public static JsonNode toJsonNode(Object value) {
		if(value==null)
			return JsonNodeFactory.instance.nullNode();
		else if(value instanceof Boolean)
			return JsonNodeFactory.instance.booleanNode((Boolean)value);
		else if(value instanceof Long)
			return JsonNodeFactory.instance.numberNode((Long)value);
		else if(value instanceof Double)
			return JsonNodeFactory.instance.numberNode((Double)value);
		else if(value instanceof String)
			return JsonNodeFactory.instance.textNode((String)value);
		else if(value instanceof IJsonNodeProducer)
			return ((IJsonNodeProducer)value).toJsonNode();
		else
			return JsonNodeFactory.instance.textNode(value.toString());
	}
}
