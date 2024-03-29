package prompto.internet;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.function.Consumer;

import prompto.intrinsic.IResource;
import prompto.intrinsic.PromptoBinary;

public class Url implements IResource {
	
	Object dbId;
	URL url;
	BufferedReader reader;
	String encoding = "utf-8";
	String httpMethod;
	List<HttpHeader>  httpHeaders;
	
	public void setDbId(Object dbId) {
		this.dbId = dbId;
	}
	
	public Object getDbId() {
		return dbId;
	}
	
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
	
	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public List<HttpHeader> getHttpHeaders() {
		return httpHeaders;
	}

	public void setHttpHeaders(List<HttpHeader> httpHeaders) {
		this.httpHeaders = httpHeaders;
	}

	@Override
	public boolean isReadable() {
		return url!=null;
	}
	
	@Override
	public boolean isWritable() {
		return url!=null;
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
	public PromptoBinary readBlob() throws IOException {
		URLConnection connection = url.openConnection();
		try( InputStream input = connection.getInputStream()) {
			ByteArrayOutputStream data = readBytesFully(input);
			return new PromptoBinary(connection.getContentType(), data.toByteArray());
		}
	}
	
	
	@Override
	public String readFully() throws IOException {
		try( InputStream input = url.openStream() ) {
			return readStringFully(input);
		}
	}
	
	@Override
	public void readFully(Consumer<String> thenWith) throws IOException {
		throw new UnsupportedOperationException();
	}

	private String readStringFully(InputStream input) throws IOException {
		ByteArrayOutputStream data = readBytesFully(input);
		return data.toString(encoding);
	}
	
	private ByteArrayOutputStream readBytesFully(InputStream input) throws IOException {
		ByteArrayOutputStream data = new ByteArrayOutputStream();
		byte[] buffer = new byte[4096];
		for(;;) {
			int read = input.read(buffer);
			if(read==-1)
				break;
			data.write(buffer, 0, read);
		}
		return data;
	}

	@Override
	public void writeFully(String data) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void writeFully(String text, Consumer<String> thenWith) throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public BufferedReader asReader() throws IOException {
		if(reader==null)
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
		return reader;
	}

	@SuppressWarnings("resource")
	@Override
	public String readLine() throws IOException {
		return asReader().readLine();
	}
	
	@Override
	public void writeLine(String data) throws IOException {
		throw new UnsupportedOperationException();
	}

	
}
