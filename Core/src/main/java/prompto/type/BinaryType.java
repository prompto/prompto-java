package prompto.type;

import java.util.Map;

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
		if ("name".equals(name))
			return TextType.instance();
		else if ("format".equals(name))
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
		if(value.isNull())
			return NullValue.instance();
		// if this an object received from the browser, use reverse logic from BinaryValue::toJson
		if(value.isTextual() && value.asText().startsWith("/ws/bin/data?")) {
			return null; // TODO ok for storing an updated instance (attribute will not be overwritten), but might need a lazy loading BinaryRef value for other situations ? 
		} else if(value.isTextual() && value.asText().startsWith("@")) {
			byte[] bytes = parts.get(value.asText());
			if(bytes==null)
				return NullValue.instance(); // TODO throw ?
			String[] segments = value.asText().split("/");
			String mimeType = segments[segments.length-1].replaceAll("\\.", "/");
			return newInstance(new PromptoBinary(mimeType, bytes));
		} else {
			String partName = value.get("partName").asText();
			byte[] bytes = parts.get(partName);
			if(bytes==null)
				return NullValue.instance(); // TODO throw ?
			String mimeType = value.get("mimeType").asText();
			return newInstance(new PromptoBinary(mimeType, bytes));
		}
	}
	
}
