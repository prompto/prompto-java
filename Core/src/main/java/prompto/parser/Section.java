package prompto.parser;

import java.util.Objects;

import org.antlr.v4.runtime.Token;

public class Section implements ISection {
	
	String path;
	private Location start;
	private Location end;
	private Dialect dialect;
	private boolean breakpoint;
	
	public Section() {
	}
	
	public Section(ISection section) {
		copySectionFrom(section);
	}

	public Section(String path, Location start, Location end, Dialect dialect, boolean breakpoint) {
		this.path = path;
		this.setStart(start);
		this.setEnd(end);
		this.setDialect(dialect);
		this.setBreakpoint(breakpoint);
	}
	
	
	public void copySectionFrom(ISection section) {
		this.path = section.getPath();
		this.setStart(section.getStart()==null ? null : new Location(section.getStart()));
		this.setEnd(section.getEnd()==null ? null : new Location(section.getEnd()));
		this.setDialect(section.getDialect());
		this.setBreakpoint(section.isBreakpoint());
	}

	
	public void setSectionFrom(String path, Token start, Token end, Dialect dialect) {
		this.path = path;
		this.setStart(new Location(start));
		this.setEnd(new Location(end, true));
		this.setDialect(dialect);
	}
	
	public void setPath(String path) {
		this.path = path;
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
	
	// do NOT provide Section.equals coz it breaks a lot of stuff, due to missing hashCode/equals in descentants
	// TODO use composition instead of inheritance

	public static boolean equalSections(Section s1, Section s2) {
		if (s1==s2)
			return true;
		if(s1==null || s2==null)
			return false;
		return s1.breakpoint == s2.breakpoint && s1.dialect == s2.dialect && Objects.equals(s1.end, s2.end) && Objects.equals(s1.path, s2.path) && Objects.equals(s1.start, s2.start);
	}
	
	
}
