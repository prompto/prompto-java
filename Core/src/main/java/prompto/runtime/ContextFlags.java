package prompto.runtime;

public class ContextFlags {
	
	public static ContextFlags START = new ContextFlags(true, false);
	public static ContextFlags MEMBER = new ContextFlags(false, true);
	public static ContextFlags NONE = new ContextFlags(false, false);
	
	boolean start;
	boolean member;
	
	public ContextFlags(boolean start, boolean member) {
		this.start = start;
		this.member = member;
	}
	
	public boolean isStart() {
		return start;
	}
	
	public boolean isMember() {
		return member;
	}

}
