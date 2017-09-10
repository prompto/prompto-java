package prompto.store;

import prompto.config.IConfigurationReader;
import prompto.config.IStoreConfiguration;
import prompto.config.StoreConfiguration;

public interface IStoreFactory {
	IStore newStore(IStoreConfiguration config) throws Exception;
	default IStoreConfiguration newConfiguration(IConfigurationReader reader) {
		return new StoreConfiguration(reader);
	}
}
