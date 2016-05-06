package prompto.runtime.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import prompto.value.IResource;

public class MyResource implements IResource {

	static Map<String,String> contents = new ConcurrentHashMap<>();
	
	String path;
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getContent() {
		return contents.get(path);
	}
	
	public void setContent(String content) {
		contents.put(path, content);
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
		return getContent();
	}
	
	@Override
	public void writeFully(String data) {
		setContent(data);
	}
}
