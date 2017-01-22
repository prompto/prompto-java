package prompto.parser;

import org.antlr.v4.runtime.Token;


public class Section implements ISection {
	
	String path;
	Location start;
	Location end;
	Dialect dialect;
	boolean breakpoint;
	
	protected Section() {
	}
	
	public void setFrom(String path, Token start, Token end, Dialect dialect) {
		this.path = path;
		this.start = new Location(start);
		this.end = new Location(end, true);
		this.dialect = dialect;
	}
	
	
	@Override
	public String getPath() {
		return path;
	}
	
	@Override
	public Location getStart() {
		return start;
	}
	
	@Override
	public Location getEnd() {
		return end;
	}
	
	public Dialect getDialect() {
		return dialect;
	}
	
	@Override
	public void setAsBreakpoint(boolean set) {
		breakpoint = set;
	}

	@Override
	public boolean isBreakpoint() {
		return breakpoint;
	}
}
