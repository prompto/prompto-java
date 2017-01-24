package prompto.nullstore;

import prompto.store.IStore;
import prompto.store.IStoreFactory;

public class NullStoreFactory implements IStoreFactory {

	@Override
	public IStore newStore(String[] params, Type type) throws Exception {
		return null;
	}

}
