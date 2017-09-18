package prompto.config;

public class SecretKeyConfiguration implements ISecretKeyConfiguration {

	protected IConfigurationReader reader;

	public SecretKeyConfiguration(IConfigurationReader reader) {
		this.reader = reader;
	}

	@Override
	public String getFactory() {
		return reader.getString("factory");
	}

	@Override
	public char[] getSecret() {
		String value = reader.getString("secret");
		return value==null ? null : value.toCharArray();
	}
	
	
	
}
