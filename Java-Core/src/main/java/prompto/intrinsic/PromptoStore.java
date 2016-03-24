package prompto.intrinsic;

import java.util.List;

import prompto.store.IStorable;

public class PromptoStore {

	List<Object> toDelete;
	List<IStorable> toStore;
	
	public void store() {
		// IStore<Object> store = IDataStore.getInstance();
		if(toDelete!=null || toStore!=null)
			; // store.store(null, toDelete, toStore);
	}

	
	
}
