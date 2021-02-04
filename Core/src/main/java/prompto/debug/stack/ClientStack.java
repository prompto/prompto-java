package prompto.debug.stack;

import java.util.ArrayList;
import java.util.stream.Collectors;

import prompto.debug.IDebugger;
import prompto.debug.worker.IWorker;

@SuppressWarnings("serial")
public class ClientStack extends ArrayList<ClientStackFrame> implements IStack<ClientStackFrame> {

	public ClientStack(IDebugger debugger, IWorker worker, LeanStack stack) {
		addAll(stack.stream().map((f)->new ClientStackFrame(debugger, worker, f)).collect(Collectors.toList()));
	}

}
