package prompto.value;

import java.io.IOException;

public interface IResource {

	boolean isReadable();
	boolean isWritable();
	String readFully() throws IOException;
	void writeFully(String data) throws IOException;
	void close();

}
