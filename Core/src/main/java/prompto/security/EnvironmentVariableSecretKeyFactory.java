package prompto.security;

import prompto.config.ISecretKeyConfiguration;

public class EnvironmentVariableSecretKeyFactory implements ISecretKeyFactory {

	ISecretKeyConfiguration config;
	
	public EnvironmentVariableSecretKeyFactory(ISecretKeyConfiguration config) {
		this.config = config;
	}

	@Override
	public String getAsPlainText() {
		return System.getenv(config.getSecretKey());
	}
}
