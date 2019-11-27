package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import prompto.store.IStorable;
import prompto.store.IStore;

public class TextResource extends Resource {
	
	private String body;
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public IStorable toStorable(IStore store) {
		IStorable storable = super.toStorable(store);
		storable.setData("body", getBody());
		return storable;
	}
	
	@Override
	protected List<String> getCategoryList() {
		return Arrays.asList("Stuff", "Resource", "TextResource");
	}

	
	@Override
	public long length() {
		return body.getBytes().length;
	}
	
	@Override
	public InputStream getInputStream() throws IOException {
		return new ByteArrayInputStream(body.getBytes());
	}

}
