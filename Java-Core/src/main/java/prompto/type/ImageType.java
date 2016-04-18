package prompto.type;

import java.lang.reflect.Type;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.value.BinaryValue;
import prompto.value.IValue;
import prompto.value.Image;

public class ImageType extends BinaryType { 

	static ImageType instance = new ImageType();
	
	public static ImageType instance() {
		return instance;
	}
	
	private ImageType() {
		super(Family.IMAGE);
	}

	@Override
	public Type getJavaType(Context context) {
		return Image.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof ImageType);
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		if(value.isNull())
			return null;
		String fileName = value.asText();
		byte[] bytes = parts.get(fileName);
		if(bytes==null)
			return null;
		String ext = fileName.substring(fileName.lastIndexOf('.') + 1);
		String mimeType = BinaryValue.fileExtensionToMimeType(ext);
		return new Image(new PromptoBinary(mimeType, bytes));
	}
	
}
