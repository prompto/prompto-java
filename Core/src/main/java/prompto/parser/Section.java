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
	private ILocation startLocation;
	private ILocation endLocation;
	private Dialect dialect;
	private boolean isBreakpoint;
	
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
		this.setStart(section.getStartLocation()==null ? null : new Location(section.getStartLocation()));
		this.setEnd(section.getEndLocation()==null ? null : new Location(section.getEndLocation()));
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
		return "{ startLocation: " + startLocation + ", endLocation: " + endLocation + ", dialect: " + dialect + "}";
	}

	
	@Override
	public ISection merge(ISection other) {
		Section section = new Section();
		section.path = this.path;
		section.dialect = this.dialect;
		section.startLocation = ILocation.first(this.startLocation, other.getStartLocation());
		section.endLocation = ILocation.last(this.endLocation, other.getEndLocation());
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
	public ILocation getStartLocation() {
		return startLocation;
	}
	
	@Override
	public ILocation getEndLocation() {
		return endLocation;
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
		return isBreakpoint;
	}
	
	@Override
	public boolean isOrContains(ISection section) {
		return this.getDialect()==section.getDialect()
				&& Objects.equals(this.path, section.getPath())
				&& this.getStartLocation().isNotAfter(section.getStartLocation())
				&& this.getEndLocation().isNotBefore(section.getEndLocation());
	}

	public void setStart(Location start) {
		this.startLocation = start;
	}

	public void setEnd(Location end) {
		this.endLocation = end;
	}

	public void setDialect(Dialect dialect) {
		this.dialect = dialect;
	}

	public void setBreakpoint(boolean breakpoint) {
		this.isBreakpoint = breakpoint;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(isBreakpoint, dialect, startLocation, endLocation, path);
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof Section && ((Section)other).equals(this));
	}

	public boolean equals(Section other) {
		return other != null && isBreakpoint == other.isBreakpoint && dialect == other.dialect && Objects.equals(endLocation, other.endLocation) && Objects.equals(path, other.path) && Objects.equals(startLocation, other.startLocation);
	}


}
