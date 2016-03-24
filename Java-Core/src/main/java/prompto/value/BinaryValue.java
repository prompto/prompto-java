package prompto.value;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.IStore;
import prompto.type.IType;
import prompto.utils.ResourceUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BinaryValue extends BaseValue {

	public static BinaryValue fromResource(String path) throws IOException {
		String ext = path.substring(path.lastIndexOf('.') + 1);
		String mimeType = fileExtensionToMimeType(ext);
		byte[] bytes = ResourceUtils.getResourceAsBytes(path);
		return newInstance(new PromptoBinary(mimeType, bytes));
	}
	
	public static BinaryValue newInstance(PromptoBinary data) {
		if(data.getMimeType().startsWith("image/"))
			return new Image(data);
		else
			return new Blob(data);
	}

	PromptoBinary data;
	
	
	protected BinaryValue(IType type) {
		super(type);
	}
	
	protected BinaryValue(IType type, PromptoBinary data) {
		super(type);
		this.data = data;
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
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("mimeType".equals(name))
			return new Text(data.getMimeType());
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
	
	private static String fileExtensionToMimeType(String ext) {
		String mimeType = extensionToMimeType.get(ext.toLowerCase());
		if(mimeType==null)
			return "application/octet-stream";
		else
			return mimeType;
	}

	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			String dbId = instance.getMember(context, IStore.dbIdIdentifier, false).toString();
			generator.writeString("/ws/bin/data?dbId=" + dbId + "&attribute=" + name.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
