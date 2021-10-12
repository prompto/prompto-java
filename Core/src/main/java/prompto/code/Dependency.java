package prompto.code;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import prompto.intrinsic.PromptoStorableBase;
import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;

public class Dependency extends PromptoStorableBase {
	
	@SuppressWarnings("unchecked")
	public static List<Dependency> listFromStored(IStore store, Object data) {
		if(!(data instanceof Collection))
			return null;
		else
			return ((Collection<Object>)data).stream()
				.map(dbId->fromStored(store, dbId))
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}

	public static Dependency fromStored(IStore store, Object data) {
		IStored stored = store.fetchUnique(store.convertToDbId(data));
		if(stored==null)
			return null;
		Dependency result = new Dependency();
		result.fromStored(stored);
		return result;
	}

	private String name;
	private PromptoVersion version;

	public Dependency() {
	}
	
	public Dependency(String name, PromptoVersion version) {
		super();
		this.name = name;
		this.version = version;
	}

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

	public IStorable collectStorables(Context context, IStore store, List<IStorable> storables) {
		List<String> categories = Arrays.asList("Dependency");
		IStorable storable = store.newStorable(categories, getDbIdFactory()); 
		storables.add(storable);
		storable.setData("name", name);
		storable.setData("version", version);
		return storable;
	}
	
	private void fromStored(IStored stored) {
		setDbId(stored.getDbId());
		setName((String)stored.getData("name"));
		setVersion((PromptoVersion)stored.getData("version"));
	}



}
