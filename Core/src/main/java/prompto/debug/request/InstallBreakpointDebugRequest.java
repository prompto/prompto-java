package prompto.debug.request;

import java.util.Objects;

import prompto.debug.IDebugger;
import prompto.debug.response.IDebugResponse;
import prompto.debug.response.VoidDebugResponse;
import prompto.parser.ISection;
import prompto.parser.Section;

public class InstallBreakpointDebugRequest implements IDebugRequest {
	
	Section section;
	
	public InstallBreakpointDebugRequest() {
	}
	
	public InstallBreakpointDebugRequest(ISection section) {
		this.section = section.getClass()==Section.class ? (Section)section : new Section(section);
	}
	
	public Section getSection() {
		return section;
	}
	
	public void setSection(Section section) {
		this.section = section;
	}

	@Override
	public IDebugResponse execute(IDebugger debugger) {
		debugger.installBreakpoint(section);
		return new VoidDebugResponse();
	}

	public InstallBreakpointDebugRequest withSection(Section section) {
		this.section = section;
		return this;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(section);
	}

	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof InstallBreakpointDebugRequest && ((InstallBreakpointDebugRequest)other).equals(this));
	}

	public boolean equals(InstallBreakpointDebugRequest other) {
		return Objects.equals(section, other.section);
	}

	
}