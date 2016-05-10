package prompto.internet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import prompto.value.IResource;

public class Url implements IResource {
	
	URL url;
	String encoding = "utf-8";
	
	public void setPath(String path) throws MalformedURLException {
		url = new URL(path);
	}
	
	public String getPath() {
		return url!=null ? url.toExternalForm() : "";
	}
	
	public void setEncoding(String encoding) {
		if(encoding!=null)
			this.encoding = encoding;
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public boolean isReadable() {
		return url!=null;
	}
	
	public boolean isWritable() {
		return url!=null;
	}
	
	public void close() {
	}
	
	public String readFully() throws IOException {
		try( InputStream input = url.openStream() ) {
			return readFully(input);
		}
	}
	
	private String readFully(InputStream input) throws IOException {
		ByteArrayOutputStream data = new ByteArrayOutputStream();
		byte[] buffer = new byte[4096];
		for(;;) {
			int read = input.read(buffer);
			if(read==-1)
				break;
			data.write(buffer, 0, read);
		}
		return data.toString(encoding);
	}

	public void writeFully(String data) {
	}
	
	
}
