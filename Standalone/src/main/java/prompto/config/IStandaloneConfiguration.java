package prompto.config;

import java.util.function.Supplier;

public interface IStandaloneConfiguration extends IRuntimeConfiguration {

	String getMainMethod();
	String getTestMethod();

	public static class Inline extends IRuntimeConfiguration.Inline implements IStandaloneConfiguration {

		Supplier<String> mainMethod = ()->null;
		Supplier<String> testMethod = ()->null;
		
		@Override public String getMainMethod() { return mainMethod.get(); }
		@Override public String getTestMethod() { return testMethod.get(); }
	
	}

}
