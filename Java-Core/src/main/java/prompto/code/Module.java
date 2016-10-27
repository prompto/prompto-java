package prompto.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import prompto.code.ICodeStore.ModuleType;
import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;

public abstract class Module {
	
	private Object dbId;
	private String name;
	private String version;
	private String description;
	private PromptoBinary image;
	private List<Dependency> dependencies;
	
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

	public IStorable populate(Context context, IStore store, List<IStorable> storables) throws PromptoError {
		List<String> categories = Arrays.asList("Module", getType().getCategory().getTypeName());
		IStorable storable = store.newStorable(categories, null); 
		storables.add(storable);
		setDbId(storable.getOrCreateDbId());
		storable.setData("name", name);
		storable.setData("version", version);
		if(description!=null)
			storable.setData("description", description);
		if(image!=null)
			storable.setData("image", image);
		if(dependencies!=null) {
			List<Object> dbIds = dependencies.stream()
					.map((d)->
						d.populate(context, store, storables)
						.getOrCreateDbId())
					.collect(Collectors.toList());
			storable.setData("dependencies", dbIds);
		}
		return storable;
	}

	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}
	
	public List<Dependency> getDependencies() {
		return dependencies;
	}
}
