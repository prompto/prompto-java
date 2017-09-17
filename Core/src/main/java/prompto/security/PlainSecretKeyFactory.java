package prompto.security;

import prompto.config.ISecretKeyConfiguration;

public class PlainSecretKeyFactory implements ISecretKeyFactory {

	ISecretKeyConfiguration config;
	
	public PlainSecretKeyFactory(ISecretKeyConfiguration config) {
		this.config = config;
	}

	@Override
	public String getAsPlainText() {
		return config.getSecretKey();
	}

}
