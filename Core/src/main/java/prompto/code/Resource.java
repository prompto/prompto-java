package prompto.code;

import java.io.IOException;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

import prompto.store.IStorable;
import prompto.store.IStore;

public abstract class Resource {
	
	private Object dbId;
	private String name;
	private String mimeType;
	private OffsetDateTime lastModified; // always UTC
	
	public Object getDbId() {
		return dbId;
	}
	
	public void setDbId(Object dbId) {
		this.dbId = dbId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public void setLastModified(OffsetDateTime lastModified) {
		this.lastModified = lastModified;
	}
	
	public OffsetDateTime getLastModified() {
		return lastModified;
	}
	
	public IStorable toStorable(IStore store) {
		IStorable storable = store.newStorable(getCategoryList(), null);
		setDbId(storable.getOrCreateDbId());
		storable.setData("name", this.getName());
		storable.setData("mimeType", this.getMimeType());
		if(this.getLastModified()==null)
			this.setLastModified(OffsetDateTime.now(ZoneOffset.UTC));
		storable.setData("lastModified", this.getLastModified().toInstant().toEpochMilli());
		return storable;
	}

	protected abstract List<String> getCategoryList();

	public abstract long length();
	public abstract InputStream getInputStream() throws IOException;
	
}
