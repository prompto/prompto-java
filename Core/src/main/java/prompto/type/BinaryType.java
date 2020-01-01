package prompto.type;

import java.util.Map;

import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.value.BinaryValue;
import prompto.value.IValue;
import prompto.value.NullValue;

import com.fasterxml.jackson.databind.JsonNode;


public abstract class BinaryType extends NativeType { 

	protected BinaryType(Family family) {
		super(family);
	}
	
	protected abstract IValue newInstance(PromptoBinary binary);

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("mimeType".equals(name))
			return TextType.instance();
		else if ("url".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if(value instanceof PromptoBinary)
			return BinaryValue.newInstance((PromptoBinary)value);
		else
			return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		if(wasReceivedFromBrowser(value, parts))
			return readJSONValueReceivedFromBrowser(value, parts);
		else if(wasCreatedInBrowser(value, parts))
			return readJSONValueCreatedInBrowser(value, parts);
		throw new ReadWriteError("Cannot read binary value from: " + value.toString());
	}

	private IValue readJSONValueCreatedInBrowser(JsonNode value, Map<String, byte[]> parts) {
		JsonNode valueNode = value.get("value");
		JsonNode partNode = valueNode.get("partName");
		String partName = partNode.asText();
		byte[] bytes = parts.get(partName);
		if(bytes==null)
			return NullValue.instance(); // TODO throw ?
		String mimeType = valueNode.get("mimeType").asText();
		return newInstance(new PromptoBinary(mimeType, bytes));
	}
	
	private boolean wasCreatedInBrowser(JsonNode value, Map<String, byte[]> parts) {
		if(!value.isObject())
			return false;
		JsonNode valueNode = value.get("value");
		if(valueNode==null || !valueNode.isObject() || parts==null)
			return false;
		JsonNode partNode = valueNode.get("partName");
		return partNode!=null && partNode.isTextual();
	}
	
	
	private IValue readJSONValueReceivedFromBrowser(JsonNode value, Map<String, byte[]> parts) {
		// use reverse logic from BinaryValue::toJson
		JsonNode valueNode = value.get("value");
		JsonNode urlNode = valueNode.get("url");
		String url = urlNode.asText();
		if(url.startsWith("/ws/bin/data?"))
			return null; // TODO ok for storing an updated instance (attribute will not be overwritten), but might need a lazy loading BinaryRef value for other situations ? 
		else {
			byte[] bytes = parts.get(url);
			if(bytes==null)
				return NullValue.instance(); // TODO throw ?
			String[] segments = url.split("/");
			String mimeType = segments[segments.length-1].replaceAll("\\.", "/");
			return newInstance(new PromptoBinary(mimeType, bytes));
		}
	}

	private boolean wasReceivedFromBrowser(JsonNode value, Map<String, byte[]> parts) {
		if(!value.isObject())
			return false;
		JsonNode valueNode = value.get("value");
		if(valueNode==null || !valueNode.isObject() || parts==null)
			return false;
		JsonNode urlNode = valueNode.get("url");
		if(urlNode==null || !urlNode.isTextual())
			return false;
		String url = urlNode.asText();
		return url.startsWith("/ws/bin/data?") || url.startsWith("@");
	}
	
}
