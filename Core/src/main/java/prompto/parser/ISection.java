package prompto.parser;

public interface ISection {
	
	String getPath();
	ILocation getStartLocation();
	ILocation getEndLocation();
	Dialect getDialect();
	ISection merge(ISection other);
	boolean isOrContains(ISection section);

	void setAsBreakpoint(boolean set);
	boolean isBreakpoint(); 
	default int computeStartLine() {
		return getStartLocation()==null ? 0 : getStartLocation().getLine();
	}
	default int computeStartTokenIndex() {
		return getStartLocation()==null ? 0 : getStartLocation().getTokenIndex();
	}
	default int computeEndLine() {
		return getEndLocation()==null ? 0 : getEndLocation().getLine();
	}
	default int computeEndTokenIndex() {
		return getEndLocation()==null ? 0 : getEndLocation().getTokenIndex();
	}

}
