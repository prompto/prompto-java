package prompto.debug.request;

import prompto.debug.IDebugger;
import prompto.debug.IWorker;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.response.GetLineDebugResponse;

public class GetLineDebugRequest extends WorkerRequest {

	public GetLineDebugRequest() {
	}

	public GetLineDebugRequest(IWorker worker) {
		super(worker);
	}

	@Override
	public GetLineDebugResponse execute(IDebugger debugger) {
		logger.debug(()->"before line");
		IWorker worker = DebuggedWorker.parse(workerId);
		int lineInFile = debugger.getLineInFile(worker);
		int lineInMethod = debugger.getLineInMethod(worker);
		logger.debug(()->"after line:" + lineInFile + ", " + lineInMethod);
		return new GetLineDebugResponse(lineInFile, lineInMethod);
	}
	
}