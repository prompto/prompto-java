package prompto.memstore;

import prompto.store.IStoreFactory;

public class MemStoreFactory implements IStoreFactory {

	@Override
	public MemStore newStore(String[] params, Type type) {
		return new MemStore();
	}

}
