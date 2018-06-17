package prompto.transpiler;

public interface IJSEngine {

	boolean supportsDestructuring();
	Iterable<String> getPolyfills();
	boolean supportsClass();

}
