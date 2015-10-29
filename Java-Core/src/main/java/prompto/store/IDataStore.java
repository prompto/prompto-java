package prompto.store;

import prompto.utils.ISingleton;

public interface IDataStore extends IStore {

	static ISingleton<IStore> instance = new ISingleton<IStore>() {
		IStore instance = new MemStore();
		@Override public void set(IStore instance) { this.instance = instance; }
		@Override public IStore get() { return instance; }
	};
	
	static void setInstance(IStore store) {
		instance.set(store);
	}

	public static IStore getInstance() {
		return instance.get();
	}

}
