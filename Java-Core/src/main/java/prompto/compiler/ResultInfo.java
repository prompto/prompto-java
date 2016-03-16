package prompto.compiler;

/* since we follow a bottom-up compile strategy, we must keep track of instance types at the top of the stack */
/* isInstance is also required to select GETFIELD/GETSTATIC or INVOKEVIRTUAL/INVOKESTATIC deterministically */ 
public class ResultInfo {

	Class<?> type;
	boolean isInstance;
	boolean isReturn;
	
	public ResultInfo(Class<?> type, boolean isInstance) {
		this.type = type;
		this.isInstance = isInstance;
		this.isReturn = false;
	}
	
	public ResultInfo(Class<?> type, boolean isInstance, boolean isReturn) {
		this.type = type;
		this.isInstance = isInstance;
		this.isReturn = isReturn;
	}

	public Class<?> getType() {
		return type;
	}
	
	public boolean isInstance() {
		return isInstance;
	}
	
	public boolean isReturn() {
		return isReturn;
	}

}
