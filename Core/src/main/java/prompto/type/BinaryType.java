package prompto.type;

import java.util.Map;

import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
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
	public void declareMember(Transpiler transpiler, Identifier name) {
		if("mimeType".equals(name.toString()) || "url".equals(name.toString()))
			return;
		else
			super.declareMember(transpiler, name);
	}
	
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		if("mimeType".equals(name.toString()) || "url".equals(name.toString()))
			transpiler.append(name.toString());
	    else
	    	super.transpileMember(transpiler, name);;
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
		if(value.isNull())
			return NullValue.instance();
		else {
			PromptoBinary binary = readJSONValue(value, parts);
			// by convention, if value is a ref, we return null (rather than NullValue), for the consumer to know the value did not change
			return binary==null ? null : newInstance(binary);
		}
	}
	
	
	public static PromptoBinary readJSONValue(JsonNode value, Map<String, byte[]> parts) {
		if(value==null || value.isNull())
			return null;
		else if(wasReceivedFromBrowser(value, parts))
			return readJSONValueReceivedFromBrowser(value, parts);
		else if(wasCreatedInBrowser(value, parts))
			return readJSONValueCreatedInBrowser(value, parts);
		throw new ReadWriteError("Cannot read binary value from: " + value.toString());
	}

	private static PromptoBinary readJSONValueCreatedInBrowser(JsonNode value, Map<String, byte[]> parts) {
		JsonNode partNode = value.get("partName");
		String partName = partNode.asText();
		byte[] bytes = parts.get(partName);
		if(bytes==null)
			return null; // TODO throw ?
		String mimeType = value.get("mimeType").asText();
		return new PromptoBinary(mimeType, bytes);
	}
	
	private static boolean wasCreatedInBrowser(JsonNode value, Map<String, byte[]> parts) {
		if(!value.isObject())
			return false;
		JsonNode partNode = value.get("partName");
		return partNode!=null && partNode.isTextual();
	}
	
	
	private static PromptoBinary readJSONValueReceivedFromBrowser(JsonNode value, Map<String, byte[]> parts) {
		// use reverse logic from BinaryValue::toJson
		JsonNode urlNode = value.get("url");
		String url = urlNode.asText();
		if(url.startsWith("/ws/bin/data?"))
			return null; // TODO ok for storing an updated instance (attribute will not be overwritten), but might need a lazy loading BinaryRef value for other situations ? 
		else {
			byte[] bytes = parts.get(url);
			if(bytes==null)
				return null; // TODO throw ?
			String[] segments = url.split("/");
			String mimeType = segments[segments.length-1].replaceAll("\\.", "/");
			return new PromptoBinary(mimeType, bytes);
		}
	}

	private static boolean wasReceivedFromBrowser(JsonNode value, Map<String, byte[]> parts) {
		if(!value.isObject())
			return false;
		JsonNode urlNode = value.get("url");
		if(urlNode==null || !urlNode.isTextual())
			return false;
		String url = urlNode.asText();
		return url.startsWith("/ws/bin/data?") || url.startsWith("@");
	}
	
}
