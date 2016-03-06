package prompto.java;

public class JavaClassInfo {

	Class<?> type;
	boolean isInstance;
	
	public JavaClassInfo(Class<?> type, boolean isInstance) {
		this.type = type;
		this.isInstance = isInstance;
	}
	
	public Class<?> getType() {
		return type;
	}
	
	public boolean isInstance() {
		return isInstance;
	}

}
