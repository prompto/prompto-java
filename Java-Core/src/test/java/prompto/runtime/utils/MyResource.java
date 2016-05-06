package prompto.runtime.utils;

import prompto.value.IResource;

public class MyResource implements IResource {

	static ThreadLocal<String> content = new ThreadLocal<String>() { 
		@Override protected String initialValue() { return "readFullyOk"; }
	};
	
	String path;
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
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
	}
	
	@Override
	public String readFully() {
		return content.get();
	}
	
	@Override
	public void writeFully(String data) {
		content.set(data);
	}
}
