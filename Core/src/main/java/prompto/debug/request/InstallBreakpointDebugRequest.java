package prompto.debug.request;

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
	
}