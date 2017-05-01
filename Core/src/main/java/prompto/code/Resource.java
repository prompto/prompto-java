package prompto.code;

import java.io.IOException;
import java.io.InputStream;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;

import prompto.store.IStorable;
import prompto.store.IStore;

public abstract class Resource {
	
	private Object dbId;
	private String path;
	private String version;
	private String mimeType;
	private OffsetDateTime lastModified; // always UTC
	
	public Object getDbId() {
		return dbId;
	}
	
	public void setDbId(Object dbId) {
		this.dbId = dbId;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
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
		IStorable storable = store.newStorable(Collections.singletonList("Resource"), null);
		setDbId(storable.getOrCreateDbId());
		storable.setData("path", this.getPath());
		storable.setData("mimeType", this.getMimeType());
		storable.setData("version", this.getVersion());
		if(this.getLastModified()==null)
			this.setLastModified(OffsetDateTime.now(ZoneOffset.UTC));
		storable.setData("lastModified", this.getLastModified().toInstant().toEpochMilli());
		return storable;
	}

	public abstract long length();
	public abstract InputStream getInputStream() throws IOException;
	
}
