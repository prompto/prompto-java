package prompto.parser;

public interface ISection {
	
	String getPath();
	ILocation getStart();
	ILocation getEnd();
	Dialect getDialect();
	void setAsBreakpoint(boolean set);
	boolean isBreakpoint();
	boolean isOrContains(ISection section);
	default int getStartLine() {
		return getStart()==null ? 0 : getStart().getLine();
	}
	default int getStartTokenIndex() {
		return getStart()==null ? 0 : getStart().getTokenIndex();
	}
	default int getEndLine() {
		return getEnd()==null ? 0 : getEnd().getLine();
	}
	default int getEndTokenIndex() {
		return getEnd()==null ? 0 : getEnd().getTokenIndex();
	}
}
