package prompto.config;

import prompto.nullstore.NullStoreFactory;

public interface IStoreConfiguration {

	String getFactory();
	String getHost();
	Integer getPort();
	String getDbName();
	String getUser();
	char[] getPassword();
	IStoreConfiguration withDbName(String dbName);

	IStoreConfiguration NULL_STORE_CONFIG = new IStoreConfiguration() {
		@Override public String getFactory() { return NullStoreFactory.class.getName(); }
		@Override public String getHost() { return null; }
		@Override public Integer getPort() { return null; }
		@Override public String getDbName() { return null; }
		@Override public String getUser() { return null; }
		@Override public char[] getPassword() { return null; }
		@Override public IStoreConfiguration withDbName(String dbName) { return null; }
	};

}
