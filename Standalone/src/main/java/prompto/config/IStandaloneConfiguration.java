package prompto.config;

public interface IStandaloneConfiguration extends IRuntimeConfiguration {

	String getMainMethod();
	String getTestMethod();

	public static class Sourced extends IRuntimeConfiguration.Sourced<IStandaloneConfiguration> implements IStandaloneConfiguration {

		public Sourced(IStandaloneConfiguration config) {
			super(config);
		}

		@Override public String getMainMethod() { return source.getMainMethod(); }
		@Override public String getTestMethod() { return source.getTestMethod(); }
	
	}

}
