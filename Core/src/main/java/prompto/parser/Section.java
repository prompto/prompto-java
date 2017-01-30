package prompto.parser;

import java.util.Objects;

import org.antlr.v4.runtime.Token;

public class Section implements ISection {
	
	String path;
	Location start;
	Location end;
	Dialect dialect;
	boolean breakpoint;
	
	public Section() {
	}
	
	public Section(ISection section) {
		this.path = section.getPath();
		this.start = new Location(section.getStart());
		this.end = new Location(section.getEnd());
		this.dialect = section.getDialect();
		this.breakpoint = section.isBreakpoint();
	}

	public Section(String path, Location start, Location end, Dialect dialect, boolean breakpoint) {
		this.path = path;
		this.start = start;
		this.end = end;
		this.dialect = dialect;
		this.breakpoint = breakpoint;
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
	
	@Override
	public boolean isOrContains(ISection section) {
		return this.dialect==section.getDialect()
				&& Objects.equals(this.path, section.getPath())
				&& this.start.isNotAfter(section.getStart())
				&& this.end.isNotBefore(section.getEnd());
	}
	
}
