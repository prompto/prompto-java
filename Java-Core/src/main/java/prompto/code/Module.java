package prompto.code;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.IStorable;

public abstract class Module {
	
	private Object dbId;
	private String name;
	private String version;
	private String description;
	private PromptoBinary image;
	
	public abstract ModuleType getType();
	
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
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public PromptoBinary getImage() {
		return image;
	}
	
	public void setImage(PromptoBinary image) {
		this.image = image;
	}

	public void populate(Context context, IStorable storable) throws PromptoError {
		setDbId(storable.getOrCreateDbId());
		storable.setData("name", name);
		storable.setData("version", version);
		if(description!=null)
			storable.setData("description", description);
		if(image!=null)
			storable.setData("image", image);
	}
}
