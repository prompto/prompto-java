package prompto.debug;

import static prompto.debug.IDebugResponse.*;
import static prompto.debug.IDebugRequest.Type.*;
import prompto.parser.ISection;
import prompto.parser.Section;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IDebugRequest {

	@JsonIgnore
	Type getType();
	IDebugResponse execute(IDebugger debugger);

	public static class ConnectRequest implements IDebugRequest {

		String host;
		int port;
		
		public void setHost(String host) {
			this.host = host;
		}
		
		
		public String getHost() {
			return host;
		}
		
		
		public void setPort(int port) {
			this.port = port;
		}
		
		public int getPort() {
			return port;
		}

		@Override
		public VoidResponse execute(IDebugger debugger) {
			debugger.connect();
			debugger.setListener(new DebugEventClient(host, port));
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return CONNECT;
		}
	}
	
	public static class StatusRequest implements IDebugRequest {

		@Override
		public StatusResponse execute(IDebugger debugger) {
			Status status = debugger.getStatus();
			return new StatusResponse(status);
		}
		
		@Override
		public Type getType() {
			return STATUS;
		}
	}
	
	public static class LineRequest implements IDebugRequest {

		@Override
		public LineResponse execute(IDebugger debugger) {
			System.err.println("before line");
			int line = debugger.getLine();
			System.err.println("after line:" + line);
			return new LineResponse(line);
		}
		
		@Override
		public Type getType() {
			return LINE;
		}
	}

	public static class InstallBreakpointRequest implements IDebugRequest {
		
		Section section;
		
		public InstallBreakpointRequest() {
		}
		
		public InstallBreakpointRequest(ISection section) {
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
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return INSTALL_BREAKPOINT;
		}
	}
	
	
	public static class ResumeRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			System.err.println("before resume");
			debugger.resume();
			System.err.println("after resume");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return RESUME;
		}
	}

	public static class StepOverRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			System.err.println("before step over");
			debugger.stepOver();
			System.err.println("after step over");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OVER;
		}
	}

	public static class StepIntoRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			System.err.println("before step into");
			debugger.stepInto();
			System.err.println("after step into");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_INTO;
		}
	}

	public static class StepOutRequest implements IDebugRequest {

		@Override
		public VoidResponse execute(IDebugger debugger) {
			System.err.println("before step out");
			debugger.stepOut();
			System.err.println("after step out");
			return new VoidResponse();
		}
		
		@Override
		public Type getType() {
			return STEP_OUT;
		}
	}

	public enum Type {
		CONNECT(ConnectRequest.class),
		STATUS(StatusRequest.class),
		LINE(LineRequest.class),
		INSTALL_BREAKPOINT(InstallBreakpointRequest.class),
		RESUME(ResumeRequest.class),
		STEP_INTO(StepIntoRequest.class),
		STEP_OUT(StepOutRequest.class),
		STEP_OVER(StepOverRequest.class)
		;
		
		Class<? extends IDebugRequest> klass;
		
		Type(Class<? extends IDebugRequest> klass) {
			this.klass = klass;
		}
		
		public Class<? extends IDebugRequest> getKlass() {
			return klass;
		}
	}

}
