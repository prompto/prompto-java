package prompto.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import prompto.intrinsic.PromptoBinary;
import prompto.value.IResource;

public class Buffer  implements IResource {
	
	StringBuffer buffer = new StringBuffer();
	BufferedReader reader;
	
	@Override
	public boolean isReadable() {
		return true;
	}
	
	@Override
	public boolean isWritable() {
		return true;
	}
	
	@Override
	public void close() {
		if(reader!=null) try {
			reader.close();
		} catch(IOException e) {
			// simply ignore
		} finally {
			reader = null;
		}
	}
	
	@Override
	public String readLine() throws IOException {
		if(reader==null)
			reader = new BufferedReader(new StringReader(buffer.toString()));
		return reader.readLine();
	}
	
	@Override
	public void writeLine(String data) throws IOException {
		buffer.append(data);
		buffer.append('\n');
	}
	
	@Override
	public String readFully() throws IOException {
		return buffer.toString();
	}
	
	@Override
	public PromptoBinary readBlob() throws IOException {
		byte[] bytes = readFully().getBytes();
		return new PromptoBinary("text/plain", bytes);
	}
	
	@Override
	public void writeFully(String data) {
		buffer = new StringBuffer(data);
	}
	
	public String getText() {
		return buffer.toString();
	}
	
	
}
