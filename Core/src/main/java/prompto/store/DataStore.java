package prompto.store;

import prompto.store.memory.MemStore;
import prompto.utils.ISingleton;
import prompto.utils.ThreadUtils;

public abstract class DataStore {

	static ISingleton<IStore> globalInstance = new ISingleton<IStore>() {
		IStore instance = new MemStore();
		@Override public void set(IStore instance) { this.instance = instance; }
		@Override public IStore get() { return instance; }
	};
	
	static ThreadLocal<IStore> threadInstance = ThreadLocal.withInitial(()->globalInstance.get());
	
	public static void setGlobal(IStore store) throws Exception {
		globalInstance.set(store);
		cleanupDataStoreInAllThreads();
	}

	private static void cleanupDataStoreInAllThreads() throws Exception {
		Thread[] threads = ThreadUtils.getActiveThreads();
		for(Thread thread : threads)
			ThreadUtils.removeThreadLocalForThread(thread, threadInstance);
	}


	public static void setInstance(IStore store) {
		threadInstance.set(store);
	}

	public static IStore getInstance() {
		return threadInstance.get();
	}

}
