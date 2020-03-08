package prompto.config;

import java.util.function.Supplier;

public interface IStandaloneConfiguration extends IRuntimeConfiguration {

	String getMainMethod();
	String getTestMethod();
	IStandaloneConfiguration withMainMethod(String method);
	IStandaloneConfiguration withTestMethod(String method);

	public static class Inline extends IRuntimeConfiguration.Inline implements IStandaloneConfiguration {

		Supplier<String> mainMethod = ()->null;
		Supplier<String> testMethod = ()->null;
		
		@Override public String getMainMethod() { return mainMethod.get(); }
		@Override public String getTestMethod() { return testMethod.get(); }
		@Override
		public IStandaloneConfiguration withMainMethod(String method) {
			mainMethod = ()->method;
			return this;
		}
		@Override
		public IStandaloneConfiguration withTestMethod(String method) {
			testMethod = ()->method;
			return this;
		}
	}

}
