package prompto.config;

public class BaseConfiguration implements IConfiguration {

	IConfigurationReader reader;
	
	protected BaseConfiguration(IConfigurationReader reader) {
		this.reader = reader;
	}
	
	@Override
	public IConfiguration getCodeStoreConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConfiguration getDataStoreConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

}
