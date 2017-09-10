package prompto.nullstore;

import prompto.config.IStoreConfiguration;
import prompto.store.IStore;
import prompto.store.IStoreFactory;

public class NullStoreFactory implements IStoreFactory {

	@Override
	public IStore newStore(IStoreConfiguration config) throws Exception {
		return null;
	}

}
