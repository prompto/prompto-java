package prompto.debug.request;

import java.util.Collection;

import prompto.debug.IDebugger;
import prompto.debug.response.GetWorkersDebugResponse;
import prompto.debug.worker.IWorker;

public class GetWorkersDebugRequest implements IDebugRequest {

	public GetWorkersDebugRequest() {
	}

	@Override
	public GetWorkersDebugResponse execute(IDebugger debugger) {
		Collection<? extends IWorker> workers = debugger.getWorkers();
		return new GetWorkersDebugResponse(workers);
	}
	
	@Override
	public boolean equals(Object other) {
		return other==this || other instanceof GetWorkersDebugRequest;
	}

}