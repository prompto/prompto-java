package prompto.store;

import prompto.config.IStoreConfiguration;

public interface IStoreFactory {
	public static enum Type { ROOT, CODE, DATA; }
	IStore newStore(IStoreConfiguration config) throws Exception;
}
