package prompto.value;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.ResourceUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BinaryValue extends BaseValue {

	public static BinaryValue fromURL(URL url) throws IOException {
		String ext = url.toExternalForm();
		ext = ext.substring(ext.lastIndexOf('.') + 1);
		String mimeType = fileExtensionToMimeType(ext);
		byte[] bytes = ResourceUtils.getResourceAsBytes(url);
		return newInstance(new PromptoBinary(mimeType, bytes));
	}
	
	public static BinaryValue newInstance(PromptoBinary data) {
		if(data.getMimeType().startsWith("image/"))
			return new ImageValue(data);
		else
			return new BlobValue(data);
	}

	PromptoBinary data;
	
	
	protected BinaryValue(IType type) {
		super(type);
	}
	
	protected BinaryValue(IType type, PromptoBinary data) {
		super(type);
		this.data = data;
	}

	public void setSource(Object dbId, String attribute) {
		data.setSource(dbId, attribute);
	}
	
	public String getSourceUrl() {
		return data.getSourceUrl();
	}

	@Override
	public PromptoBinary getStorableData() {
		return data;
	}
	
	public String getMimeType() {
		return data.getMimeType();
	}
	
	public byte[] getBytes() {
		return data.getBytes();
	}
	
	public PromptoBinary getData() {
		return data;
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("mimeType".equals(name))
			return new TextValue(data.getMimeType());
		else
			return super.getMember(context, id, autoCreate);
	}

	static Map<String, String> extensionToMimeType;
	
	static Map<String, Set<String>> mimeTypeToExtensions;

	static {
		extensionToMimeType = new HashMap<>();
		mimeTypeToExtensions = new HashMap<>();
		try {
			InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("mimeTypes.json");
			JsonNode node = new ObjectMapper().readTree(input);
			for(JsonNode mimeTypeNode : node) {
				String mimeType = mimeTypeNode.get("mimeType").asText();
				Set<String> extensionsSet = mimeTypeToExtensions.get(mimeType);
				if(extensionsSet==null) {
					extensionsSet = new HashSet<>();
					mimeTypeToExtensions.put(mimeType, extensionsSet);
				}
				for(JsonNode extensionNode : mimeTypeNode.get("extensions")) {
					String extension = extensionNode.asText();
					extensionToMimeType.put(extension, mimeType);
					extensionsSet.add(extension);
				}
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String fileExtensionToMimeType(String ext) {
		String mimeType = extensionToMimeType.get(ext.toLowerCase());
		if(mimeType==null)
			return "application/octet-stream";
		else
			return mimeType;
	}

	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeStringField("type", getType().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartObject();
			generator.writeStringField("mimeType", getMimeType());
			generator.writeFieldName("url");
			if(binaries==null) {
				// if no binaries container, store an absolute URL
				generator.writeString(getSourceUrl());
			} else {
				String partId = "@" + data.getSourceDbId() + '/' + data.getSourceAttribute() + '/' + getMimeType().replace('/', '.');
				generator.writeString(partId);
				binaries.put(partId, getBytes());
			}
			generator.writeEndObject();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		} 
	}


}
