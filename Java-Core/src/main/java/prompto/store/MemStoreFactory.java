package prompto.store;

public class MemStoreFactory implements IStoreFactory {

	@Override
	public MemStore newStore(String[] params, Type type) {
		return new MemStore();
	}

}
