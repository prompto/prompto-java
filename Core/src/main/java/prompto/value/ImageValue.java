package prompto.value;

import prompto.intrinsic.PromptoBinary;
import prompto.type.ImageType;

public class ImageValue extends BinaryValue {

	public ImageValue() {
		super(ImageType.instance());
	}
	
	public ImageValue(PromptoBinary data) {
		super(ImageType.instance(), data);
	}

	public ImageValue(String mimeType, byte[] bytes) {
		this(new PromptoBinary(mimeType, bytes));
	}

}
