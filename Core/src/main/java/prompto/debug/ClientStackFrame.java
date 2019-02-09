package prompto.debug;

import java.util.Collection;

public class ClientStackFrame extends LeanStackFrame {

	IDebugger debugger;
	IWorker worker;
	
	public ClientStackFrame(IDebugger debugger, IWorker worker, LeanStackFrame frame) {
		super(frame);
		this.debugger = debugger;
		this.worker = worker;
	}
	
	@Override
	public Collection<? extends IVariable> getVariables() {
		return debugger.getVariables(worker, this);
	}
}