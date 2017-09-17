package prompto.security;

import java.lang.reflect.Constructor;

import prompto.config.IConfigurationReader;
import prompto.config.ISecretKeyConfiguration;
import prompto.config.SecretKeyConfiguration;

public interface ISecretKeyFactory {

	public static String plainPasswordFromConfig(ISecretKeyConfiguration config) throws Throwable {
		if(config==null)
			return null;
		ISecretKeyFactory factory = newStoreFactory(config);
		return factory.getAsPlainText();
	
	}
	
	@SuppressWarnings("unchecked")
	public static ISecretKeyFactory newStoreFactory(ISecretKeyConfiguration config) throws Throwable {
		String factoryName = config.getFactory();
		Class<?> klass = Class.forName(factoryName, true, Thread.currentThread().getContextClassLoader());
		if(!(ISecretKeyFactory.class.isAssignableFrom(klass)))
			throw new RuntimeException("Not a secret key factory: " + factoryName);
		Constructor<ISecretKeyFactory> method = (Constructor<ISecretKeyFactory>)klass.getDeclaredConstructor(ISecretKeyConfiguration.class);
		return method.newInstance(config);

	}

	default ISecretKeyConfiguration newConfiguration(IConfigurationReader reader) {
		return new SecretKeyConfiguration(reader);
	}
	String getAsPlainText();

			

}
