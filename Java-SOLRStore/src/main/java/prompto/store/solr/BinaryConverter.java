package prompto.store.solr;

import java.io.IOException;

import org.apache.solr.common.util.Base64;

import prompto.value.Binary;

public abstract class BinaryConverter {

	public static byte[] toBytes(Binary binary) throws IOException {
		BinaryValue value = new BinaryValue(binary.getMimeType(), binary.getData());
		return value.toByteArray();
	}

	public static Binary toBinary(Object data) throws IOException {
		if(data instanceof String)
			data = Base64.base64ToByteArray(data.toString());
		if(data instanceof byte[])
			return toBinary((byte[])data);
		else
			return null;
	}
	
	public static Binary toBinary(byte[] bytes) throws IOException {
		BinaryValue value = new BinaryValue(bytes);
		return Binary.newInstance(value.getMimeType(), value.getData());
	}

}
