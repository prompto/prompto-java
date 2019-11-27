package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import prompto.intrinsic.PromptoBinary;
import prompto.store.IStorable;
import prompto.store.IStore;

public class BinaryResource extends Resource {
	
	private PromptoBinary data;
	
	public PromptoBinary getData() {
		return data;
	}
	
	public void setData(PromptoBinary data) {
		this.data = data;
	}
	
	@Override
	public IStorable toStorable(IStore store) {
		IStorable storable = super.toStorable(store);
		storable.setData("data", getData());
		return storable;
	}
	
	@Override
	protected List<String> getCategoryList() {
		return Arrays.asList("Stuff", "Resource", "BinaryResource");
	}
	
	@Override
	public long length() {
		return data.getBytes().length;
	}
	
	@Override
	public InputStream getInputStream() throws IOException {
		return new ByteArrayInputStream(data.getBytes());
	}

}
