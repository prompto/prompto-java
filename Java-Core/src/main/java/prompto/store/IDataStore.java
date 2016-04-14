package prompto.store;

import prompto.utils.ISingleton;

public interface IDataStore extends IStore<Object> {

	static ISingleton<IStore<?>> instance = new ISingleton<IStore<?>>() {
		IStore<?> instance = new MemStore();
		@Override public void set(IStore<?> instance) { this.instance = instance; }
		@Override public IStore<?> get() { return instance; }
	};
	
	static void setInstance(IStore<?> store) {
		instance.set(store);
	}

	@SuppressWarnings("unchecked")
	public static IStore<Object> getInstance() {
		return (IStore<Object>)instance.get();
	}

}
