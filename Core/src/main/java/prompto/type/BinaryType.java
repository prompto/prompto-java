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
		if(value.isObject()) {
			JsonNode valueNode = value.get("value");
			if(valueNode!=null && valueNode.isObject() && parts!=null) {
				// if this an object received by the browser, use reverse logic from BinaryValue::toJson
				JsonNode urlNode = valueNode.get("url");
				if(urlNode!=null && urlNode.isTextual()) {
					String url = urlNode.asText();
					if(url.startsWith("/ws/bin/data?"))
						return null; // TODO ok for storing an updated instance (attribute will not be overwritten), but might need a lazy loading BinaryRef value for other situations ? 
					else if(url.startsWith("@")) {
						byte[] bytes = parts.get(url);
						if(bytes==null)
							return NullValue.instance(); // TODO throw ?
						String[] segments = url.split("/");
						String mimeType = segments[segments.length-1].replaceAll("\\.", "/");
						return newInstance(new PromptoBinary(mimeType, bytes));
					}
				}
				// if this an object created by the browser, image data 
				JsonNode partNode = valueNode.get("partName");
				if(partNode!=null && partNode.isTextual()) {
					String partName = partNode.asText();
					byte[] bytes = parts.get(partName);
					if(bytes==null)
						return NullValue.instance(); // TODO throw ?
					String mimeType = valueNode.get("mimeType").asText();
					return newInstance(new PromptoBinary(mimeType, bytes));
				}
			}
		}
		throw new ReadWriteError("Cannot read binary value from: " + value.toString());
	}
	
}
