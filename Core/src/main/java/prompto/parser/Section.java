package prompto.parser;

import java.util.Objects;

import org.antlr.v4.runtime.Token;

public final class Section implements ISection {
	
	public static Section from(String path, Token start, Token end, Dialect dialect) {
		Section section = new Section();
		section.setFrom(path, start, end, dialect);
		return section;
	}
	
	String path;
	private ILocation start;
	private ILocation end;
	private Dialect dialect;
	private boolean breakpoint;
	
	public Section() {
	}
	
	public Section(ISection section) {
		copyFrom(section);
	}

	public Section(String path, Location start, Location end, Dialect dialect, boolean breakpoint) {
		this.path = path;
		this.setStart(start);
		this.setEnd(end);
		this.setDialect(dialect);
		this.setBreakpoint(breakpoint);
	}
	
	
	public void copyFrom(ISection section) {
		this.path = section.getPath();
		this.setStart(section.getStart()==null ? null : new Location(section.getStart()));
		this.setEnd(section.getEnd()==null ? null : new Location(section.getEnd()));
		this.setDialect(section.getDialect());
		this.setBreakpoint(section.isBreakpoint());
	}

	
	public void setFrom(String path, Token start, Token end, Dialect dialect) {
		this.path = path;
		this.setStart(new Location(start));
		this.setEnd(new Location(end, true));
		this.setDialect(dialect);
	}

	@Override
	public String toString() {
		return "{ start: " + start + ", end: " + end + ", dialect: " + dialect + "}";
	}

	
	@Override
	public ISection merge(ISection other) {
		Section section = new Section();
		section.path = this.path;
		section.dialect = this.dialect;
		section.start = ILocation.first(this.start, other.getStart());
		section.end = ILocation.last(this.end, other.getEnd());
		return section;
	}

	
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String getPath() {
		return path;
	}
	
	@Override
	public ILocation getStart() {
		return start;
	}
	
	@Override
	public ILocation getEnd() {
		return end;
	}
	
	@Override
	public Dialect getDialect() {
		return dialect;
	}
	
	@Override
	public void setAsBreakpoint(boolean set) {
		setBreakpoint(set);
	}

	@Override
	public boolean isBreakpoint() {
		return breakpoint;
	}
	
	@Override
	public boolean isOrContains(ISection section) {
		return this.getDialect()==section.getDialect()
				&& Objects.equals(this.path, section.getPath())
				&& this.getStart().isNotAfter(section.getStart())
				&& this.getEnd().isNotBefore(section.getEnd());
	}

	public void setStart(Location start) {
		this.start = start;
	}

	public void setEnd(Location end) {
		this.end = end;
	}

	public void setDialect(Dialect dialect) {
		this.dialect = dialect;
	}

	public void setBreakpoint(boolean breakpoint) {
		this.breakpoint = breakpoint;
	}
	
	
	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof Section && ((Section)other).equals(this));
	}

	public boolean equals(Section other) {
		return other != null && breakpoint == other.breakpoint && dialect == other.dialect && Objects.equals(end, other.end) && Objects.equals(path, other.path) && Objects.equals(start, other.start);
	}


}
