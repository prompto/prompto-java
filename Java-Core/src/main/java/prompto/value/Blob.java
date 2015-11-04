package prompto.value;

import java.io.IOException;

import prompto.type.BlobType;

public class Blob extends Binary {

	public Blob() {
		super(BlobType.instance());
	}
	
	
	public Blob(String mimeType, byte[] data) {
		super(BlobType.instance(), mimeType, data);
	}


	public static Blob fromResource(String path) throws IOException {
		Blob blob = new Blob();
		Binary.fromResource(blob, path);
		return blob;
	}


}
