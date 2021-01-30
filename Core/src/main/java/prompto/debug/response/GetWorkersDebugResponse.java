package prompto.debug.response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import prompto.debug.IWorker;

public class GetWorkersDebugResponse implements IDebugResponse {
	
	List<IWorker> workers;
	
	public GetWorkersDebugResponse() {
	}
	
	public GetWorkersDebugResponse(Collection<? extends IWorker> workers) {
		this.workers = new ArrayList<>(workers);
	}
	
	public List<IWorker> getWorkers() {
		return workers;
	}
	
	public void setWorkers(List<IWorker> workers) {
		this.workers = workers;
	}
}