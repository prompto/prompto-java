package prompto.type;

import java.lang.reflect.Type;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.value.BinaryValue;
import prompto.value.IValue;
import prompto.value.Image;
import prompto.value.NullValue;

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
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		if(value.isNull())
			return NullValue.instance();
		String fileName = value.asText();
		byte[] bytes = parts.get(fileName);
		if(bytes==null)
			return NullValue.instance(); // TODO throw ?
		String ext = fileName.substring(fileName.lastIndexOf('.') + 1);
		String mimeType = BinaryValue.fileExtensionToMimeType(ext);
		return new Image(new PromptoBinary(mimeType, bytes));
	}
	
}
