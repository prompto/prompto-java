package prompto.debug.worker;

import java.util.Objects;

import prompto.debug.WorkerStatus;

public class LeanWorker implements IWorker {
	
	protected String workerId;
	protected String name;
	protected WorkerStatus workerStatus;
	
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

	public void setWorkerStatus(WorkerStatus workerStatus) {
		this.workerStatus = workerStatus;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public WorkerStatus getWorkerStatus() {
		return workerStatus;
	}

	public LeanWorker withWorkerId(String workerId) {
		this.workerId = workerId;
		return this;
	}
	
	public LeanWorker withName(String name) {
		this.name = name;
		return this;
	}

	public LeanWorker withWorkerState(WorkerStatus workerStatus) {
		this.workerStatus = workerStatus;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, workerId, workerStatus);
	}

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof LeanWorker && ((LeanWorker)other).equals(this));
	}
	
	public boolean equals(LeanWorker other) {
		return Objects.equals(name, other.name) && Objects.equals(workerId, other.workerId) && workerStatus == other.workerStatus;
	}

	



}
