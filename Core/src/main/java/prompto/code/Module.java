package prompto.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoVersion;
import prompto.intrinsic.PromptoStorableBase;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;

public abstract class Module extends PromptoStorableBase{
	
	private String name;
	private PromptoVersion version;
	private String description;
	private PromptoBinary image;
	private List<Dependency> dependencies;
	private ModuleStatus moduleStatus;
	private Boolean parked;
	
	public abstract ModuleType getType();

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PromptoVersion getVersion() {
		return version;
	}
	
	public void setVersion(PromptoVersion version) {
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

	public IStorable collectStorables(Context context, IStore store, List<IStorable> storables) throws PromptoError {
		IStorable storable = store.newStorable(getCategories(), getDbIdFactory()); 
		storables.add(storable);
		storable.setData("name", name);
		storable.setData("version", version);
		if(description!=null)
			storable.setData("description", description);
		if(image!=null)
			storable.setData("image", image);
		if(dependencies!=null) {
			List<Object> dbIds = dependencies.stream()
					.map((d)->
						d.collectStorables(context, store, storables)
						.getOrCreateDbId())
					.collect(Collectors.toList());
			storable.setData("dependencies", dbIds);
		}
		if(moduleStatus!=null)
			storable.setData("moduleStatus", moduleStatus.name());
		else
			storable.setData("moduleStatus", ModuleStatus.ACTIVE.name());
		if(parked!=null)
			storable.setData("parked", parked);
		return storable;
	}
	
	public void fromStored(IStore store, IStored stored) {
		setDbId(stored.getDbId());
		setName((String)stored.getData("name"));
		setVersion((PromptoVersion)stored.getData("version"));
		setDescription((String)stored.getData("description"));
		setImage((PromptoBinary)stored.getData("image"));
		List<Dependency> dependencies = Dependency.listFromStored(store, stored.getData("dependencies"));
		setDependencies(dependencies);
		String value = (String)stored.getData("moduleStatus");
		if(value!=null)
			setModuleStatus(ModuleStatus.valueOf(value));
		setParked((Boolean)stored.getData("parked"));
	}

	private List<String> getCategories() {
		List<String> categories = new ArrayList<>();
		Class<?> klass = this.getClass();
		while(Module.class.isAssignableFrom(klass)) {
			categories.add(klass.getSimpleName());
			if(IApplication.class.isAssignableFrom(klass))
				categories.add("Application");
			klass = klass.getSuperclass();
		}
		Collections.reverse(categories);
		return categories;
	}

	public void setDependencies(List<Dependency> dependencies) {
		this.dependencies = dependencies;
	}
	
	public List<Dependency> getDependencies() {
		return dependencies;
	}
	
	public boolean hasDependency(String name) {
		return dependencies==null 
				? false 
				: dependencies.stream()
					.anyMatch(d->d.getName().equals(name));
	}

	public Dependency getDependency(String name) {
		return dependencies==null 
				? null 
				: dependencies.stream()
					.filter(d->d.getName().equals(name))
					.findFirst()
					.orElse(null);
	}

	public void setModuleStatus(ModuleStatus moduleStatus) {
		this.moduleStatus = moduleStatus;
	}
	
	public ModuleStatus getModuleStatus() {
		return moduleStatus;
	}
	
	
	public void setParked(Boolean parked) {
		this.parked = parked;
	}
	
	public Boolean getParked() {
		return parked;
	}

	public String getResourcePrefix() {
		return getName().toLowerCase().replaceAll(" ", "-");
	}

}
