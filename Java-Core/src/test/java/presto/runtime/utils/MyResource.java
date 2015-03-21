package presto.runtime.utils;

import presto.value.IResource;

public class MyResource implements IResource {

	public static String content;
	
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
		return content;
	}
	
	@Override
	public void writeFully(String data) {
		content = data;
	}
}
