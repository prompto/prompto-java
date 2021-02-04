package prompto.parser;

public interface ISection {
	
	String getPath();
	ILocation getStart();
	ILocation getEnd();
	Dialect getDialect();
	void setAsBreakpoint(boolean set);
	boolean isBreakpoint(); 
	boolean isOrContains(ISection section);
	default int computeStartLine() {
		return getStart()==null ? 0 : getStart().getLine();
	}
	default int computeStartTokenIndex() {
		return getStart()==null ? 0 : getStart().getTokenIndex();
	}
	default int computeEndLine() {
		return getEnd()==null ? 0 : getEnd().getLine();
	}
	default int computeEndTokenIndex() {
		return getEnd()==null ? 0 : getEnd().getTokenIndex();
	}

}
