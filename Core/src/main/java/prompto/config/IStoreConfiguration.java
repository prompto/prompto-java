package prompto.config;

import prompto.nullstore.NullStoreFactory;

public interface IStoreConfiguration extends IConfiguration {

	String getFactory();
	String getHost();
	Integer getPort();
	String getDbName();

	IStoreConfiguration NULL_STORE_CONFIG = new IStoreConfiguration() {
		
		@Override
		public String getFactory() {
			return NullStoreFactory.class.getName();
		}
		
		@Override
		public String getHost() {
			return null;
		}
		
		@Override
		public Integer getPort() {
			return null;
		}
		
		@Override
		public String getDbName() {
			return null;
		}
		
	};
}
