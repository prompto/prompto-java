package prompto.parser;

public interface ISection {
	
	String getPath();
	ILocation getStart();
	ILocation getEnd();
	void setAsBreakpoint(boolean set);
	boolean isBreakpoint();
	
}
