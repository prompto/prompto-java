package prompto.config;

public interface IStandaloneConfiguration extends IRuntimeConfiguration {

	String getMainMethod();
	String getTestMethod();

}
