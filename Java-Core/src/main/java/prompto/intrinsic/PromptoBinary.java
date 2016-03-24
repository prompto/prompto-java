package prompto.intrinsic;

/** a data structure which ties a piece of binary data to a mime type 
 * This is a bridge between BinaryValue and any IStore implementation
 */
public class PromptoBinary {

	private String mimeType;
	private byte[] bytes;
	
	public PromptoBinary() {
	}
	
	public PromptoBinary(String mimeType, byte[] bytes) {
		this.mimeType = mimeType;
		this.bytes = bytes;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public byte[] getBytes() {
		return bytes;
	}

	public static PromptoBinary read(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
