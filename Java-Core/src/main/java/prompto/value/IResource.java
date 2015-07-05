package prompto.value;

public interface IResource {

	boolean isReadable();
	boolean isWritable();
	String readFully();
	void writeFully(String data);
	void close();

}
