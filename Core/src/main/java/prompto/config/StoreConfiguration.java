package prompto.config;

public class StoreConfiguration implements IStoreConfiguration {

	protected IConfigurationReader reader;

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
	
	@Override
	public String getUser() {
		return reader.getString("user");
	}
	
	@Override
	public char[] getPassword() {
		String password = reader.getString("password");
		return password==null ? null : password.toCharArray();
	}
	
	@Override
	public IStoreConfiguration withDbName(String dbName) {

		return new StoreConfiguration(reader) {
			@Override
			public String getDbName() {
				return dbName;
			}
		};
		
	}
	
	
}
