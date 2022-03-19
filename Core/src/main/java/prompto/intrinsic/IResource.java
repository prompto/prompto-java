package prompto.intrinsic;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Consumer;

public interface IResource {

	boolean isReadable();
	Reader asReader() throws IOException;
	String readLine() throws IOException;
	String readFully() throws IOException;
	void readFully(Consumer<String> thenWith) throws IOException;
	PromptoBinary readBlob() throws IOException;
	boolean isWritable();
	void writeLine(String data) throws IOException;
	void writeFully(String data) throws IOException;
	void writeFully(String text, Consumer<String> thenWith) throws IOException;
	void close();

}
