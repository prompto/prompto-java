package prompto.value;

import java.io.IOException;

import prompto.intrinsic.PromptoBinary;

public interface IResource {

	boolean isReadable();
	boolean isWritable();
	String readLine() throws IOException;
	void writeLine(String data) throws IOException;
	PromptoBinary readBlob() throws IOException;
	String readFully() throws IOException;
	void writeFully(String data) throws IOException;
	void close();

}
