package prompto.value;

import prompto.intrinsic.PromptoBinary;
import prompto.type.BlobType;

public class BlobValue extends BinaryValue {

	public BlobValue() {
		super(BlobType.instance());
	}
	
	
	public BlobValue(PromptoBinary data) {
		super(BlobType.instance(), data);
	}


	public BlobValue(String mimeType, byte[] bytes) {
		this(new PromptoBinary(mimeType, bytes));
	}

}
