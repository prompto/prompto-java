package prompto.transpiler;

import java.util.Collections;

public interface IJSEngine {

	default boolean supportsDestructuring() { return true; }
	default boolean supportsComputedPropertyNames() { return true; };
	default Iterable<String> getPolyfills() { return Collections.emptyList(); }
	default boolean supportsClass() { return true; }
	boolean isTestEngine();
	
	static IJSEngine forUserAgent(String userAgent) {
		// TODO detect exact engine
		return new DefaultJSEngine();
	}
	
	public class DefaultJSEngine implements IJSEngine {

		@Override
		public boolean isTestEngine() {
			return false;
		}

	}



}
