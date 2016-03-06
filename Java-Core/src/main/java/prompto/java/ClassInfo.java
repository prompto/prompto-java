package prompto.java;

public class ClassInfo {

	Class<?> type;
	boolean isInstance;
	
	public ClassInfo(Class<?> type, boolean isInstance) {
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
