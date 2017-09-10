package prompto.config;

public class StoreConfiguration implements IStoreConfiguration {

	IConfigurationReader reader;

	public StoreConfiguration(IConfigurationReader reader) {
		this.reader = reader;
	}

	@Override
	public String getFactory() {
		return reader.getString("factory");
	}
	
	@Override
	public String getHost() {
		return reader.getString("host");
	}
	
	@Override
	public Integer getPort() {
		return reader.getInteger("port");
	}
	
	@Override
	public String getDbName() {
		return reader.getString("dbName");
	}

}
