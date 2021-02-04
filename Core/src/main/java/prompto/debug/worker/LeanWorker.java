package prompto.debug.worker;

import java.util.Objects;

public class LeanWorker implements IWorker {
	
	protected String workerId;
	protected String name;
	protected WorkerState workerState;
	
	@Override
	public String getWorkerId() {
		return workerId;
	}
	
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWorkerState(WorkerState workerState) {
		this.workerState = workerState;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public WorkerState getWorkerState() {
		return workerState;
	}

	public LeanWorker withWorkerId(String workerId) {
		this.workerId = workerId;
		return this;
	}
	
	public LeanWorker withName(String name) {
		this.name = name;
		return this;
	}

	public LeanWorker withWorkerState(WorkerState workerState) {
		this.workerState = workerState;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, workerId, workerState);
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof LeanWorker && ((LeanWorker)other).equals(this));
	}
	
	public boolean equals(LeanWorker other) {
		return Objects.equals(name, other.name) && Objects.equals(workerId, other.workerId) && workerState == other.workerState;
	}

	



}
