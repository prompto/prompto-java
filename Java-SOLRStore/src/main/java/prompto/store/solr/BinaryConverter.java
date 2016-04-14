package prompto.store.solr;

import java.io.IOException;

import org.apache.solr.common.util.Base64;

import prompto.intrinsic.PromptoBinary;

public abstract class BinaryConverter {

	public static PromptoBinary toPromptoBinary(Object data) throws IOException {
		if(data instanceof String)
			data = Base64.base64ToByteArray(data.toString());
		if(data instanceof byte[])
			return toPromptoBinary((byte[])data);
		else
			return null;
	}
	
	public static PromptoBinary toPromptoBinary(byte[] bytes) throws IOException {
		BinaryData value = new BinaryData(bytes);
		return new PromptoBinary(value.getMimeType(), value.getData());
	}

}
