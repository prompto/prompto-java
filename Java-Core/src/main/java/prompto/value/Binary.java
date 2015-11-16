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
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.IType;
import prompto.utils.ResourceUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Binary extends BaseValue {

	public static Binary newInstance(String mimeType, byte[] dataBytes) {
		if(mimeType.startsWith("image/"))
			return new Image(mimeType, dataBytes);
		else
			return new Blob(mimeType, dataBytes);
	}

	private String mimeType;
	private byte[] data;
	
	protected Binary(IType type) {
		super(type);
	}
	
	protected Binary(IType type, String mimeType, byte[] data) {
		super(type);
		this.setMimeType(mimeType);
		this.setData(data);
	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("mimeType".equals(name))
			return new Text(this.getMimeType());
		else
			return super.getMember(context, id, autoCreate);
	}

	public static void fromResource(Binary binary, String path) throws IOException {
		String ext = path.substring(path.lastIndexOf('.') + 1);
		binary.setMimeType(fileExtensionToMimeType(ext));
		binary.setData(ResourceUtils.getResourceAsBytes(path));
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

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@Override
	public void store(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, this);
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			String dbId = instance.getMember(context, new Identifier("dbId"), false).toString();
			generator.writeString("/ws/bin/data?dbId=" + dbId + "&attribute=" + name.getName());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
