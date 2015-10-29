package prompto.store;

public class MemStoreFactory implements IStoreFactory {

	@Override
	public IStore newStore(String[] params, Type type) {
		return new MemStore();
	}

}
