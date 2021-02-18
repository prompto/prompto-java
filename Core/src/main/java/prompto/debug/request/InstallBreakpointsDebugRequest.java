package prompto.debug.request;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import prompto.debug.IDebugger;
import prompto.debug.response.IDebugResponse;
import prompto.debug.response.VoidDebugResponse;
import prompto.parser.ISection;
import prompto.parser.Section;

public class InstallBreakpointsDebugRequest implements IDebugRequest {
	
	Collection<Section> sections;
	
	public InstallBreakpointsDebugRequest() {
	}
	
	public InstallBreakpointsDebugRequest(Collection<? extends ISection> sections) {
		setSections(sections);
	}
	
	public Collection<? extends ISection> getSections() {
		return sections;
	}
	
	public void setSections(Collection<? extends ISection> sections) {
		this.sections = sections.stream()
				.map(s -> s.getClass()==Section.class ? (Section)s : new Section(s))
				.collect(Collectors.toList());		
	}

	@Override
	public IDebugResponse execute(IDebugger debugger) {
		sections.forEach(s -> debugger.installBreakpoint(s));
		return new VoidDebugResponse();
	}

	public InstallBreakpointsDebugRequest withSections(Collection<? extends ISection> sections) {
		setSections(sections);
		return this;
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || (other instanceof InstallBreakpointsDebugRequest && ((InstallBreakpointsDebugRequest)other).equals(this));
	}

	public boolean equals(InstallBreakpointsDebugRequest other) {
		return Objects.deepEquals(sections, other.sections);
	}

	
}