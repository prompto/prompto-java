package prompto.debug.request;

import java.util.Collection;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.response.GetWorkersDebugResponse;

public class GetWorkersDebugRequest implements IDebugRequest {

	public GetWorkersDebugRequest() {
	}

	@Override
	public GetWorkersDebugResponse execute(IDebugger debugger) {
		Collection<? extends IWorker> workers = debugger.getWorkers();
		return new GetWorkersDebugResponse(workers);
	}
	
}