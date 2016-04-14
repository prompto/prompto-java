package prompto.store.solr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinaryData {
	
	private String mimeType;
	private byte[] data;
	
	public BinaryData(String mimeType, byte[] data) {
		this.mimeType = mimeType;
		this.data = data;
	}

	public BinaryData(byte[] bytes) throws IOException {
		this(bytes, 0, true);
	}
	
	public BinaryData(byte[] bytes, int offset) throws IOException {
		this(bytes, offset, true);
	}

	BinaryData(byte[] bytes, int offset, boolean readData) throws IOException {
		DataInputStream input = new DataInputStream(new ByteArrayInputStream(bytes, offset, bytes.length - offset));
		int len = input.readInt();
		byte[] mimeTypeBytes = new byte[len];
		input.read(mimeTypeBytes);
		this.mimeType = new String(mimeTypeBytes);
		if(readData) {
			len = input.readInt();
			this.data = new byte[len];
			input.read(data);
		}
	}

	public String getMimeType() {
		return mimeType;
	}
	
	public byte[] getData() {
		return data;
	}

	public byte[] toByteArray() throws IOException {
		// create a byte array: mime type length: 4, mime type bytes, data length: 4, data
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		DataOutputStream output = new DataOutputStream(buffer);
		byte[] mimeTypeBytes = mimeType.getBytes();
		output.writeInt(mimeTypeBytes.length);
		output.write(mimeTypeBytes);
		output.writeInt(data.length);
		output.write(data);
		output.flush();
		return buffer.toByteArray();
	}
}
