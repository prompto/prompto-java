package prompto.debug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;


public interface IDebugResponse {
	
	@JsonIgnore
	Type getType();

	public static class VoidResponse implements IDebugResponse {

		public VoidResponse() {
		}

		@Override
		public Type getType() {
			return Type.VOID;
		}

	}

	public static class GetWorkersResponse implements IDebugResponse {
		
		List<IWorker> workers;
		
		public GetWorkersResponse() {
		}
		
		public GetWorkersResponse(Collection<? extends IWorker> workers) {
			this.workers = new ArrayList<>(workers);
		}
		
		@Override
		public Type getType() {
			return Type.GET_WORKERS;
		}
		
		public List<IWorker> getWorkers() {
			return workers;
		}
		
		public void setWorkers(List<IWorker> workers) {
			this.workers = workers;
		}
	}
	
	
	public static class GetStatusResponse implements IDebugResponse {

		Status status;
		
		public GetStatusResponse() {
		}

		public GetStatusResponse(Status status) {
			this.status = status;
		}
		
		@Override
		public Type getType() {
			return Type.GET_STATUS;
		}

		public Status getStatus() {
			return status;
		}
		
		public void setStatus(Status status) {
			this.status = status;
		}

	}
	
	public static class GetLineResponse implements IDebugResponse {

		int lineInFile;
		int lineInMethod;
			
		public GetLineResponse() {
		}

		public GetLineResponse(int lineInFile, int lineInMethod) {
			this.lineInFile = lineInFile;
			this.lineInMethod = lineInMethod;
		}
		
		@Override
		public Type getType() {
			return Type.GET_LINE;
		}

		public int getLineInFile() {
			return lineInFile;
		}
		
		public void setLineInFile(int lineInFile) {
			this.lineInFile = lineInFile;
		}
		
		public int getLineInMethod() {
			return lineInMethod;
		}
		
		public void setLineInMethod(int lineInMethod) {
			this.lineInMethod = lineInMethod;
		}

	}
	
	public static class GetStackResponse implements IDebugResponse {

		LeanStack stack;
		
		public GetStackResponse() {
			this.stack = new LeanStack();
		}

		public GetStackResponse(IStack<?> stack) {
			this.stack = new LeanStack(stack);
		}
		
		@Override
		public Type getType() {
			return Type.GET_STACK;
		}

		public LeanStack getStack() {
			return stack;
		}
		
		public void setStack(LeanStack stack) {
			this.stack = stack;
		}

	}
	
	public static class GetVariablesResponse implements IDebugResponse {

		LeanVariableList variables;
		
		public GetVariablesResponse() {
			this.variables = new LeanVariableList();
		}

		public GetVariablesResponse(Collection<? extends IVariable> variables) {
			this.variables = new LeanVariableList();
			this.variables.addAll(variables.stream()
					.map(LeanVariable::new)
					.collect(Collectors.toList()));
		}
		
		@Override
		public Type getType() {
			return Type.GET_VARIABLES;
		}

		public LeanVariableList getVariables() {
			return variables;
		}
		
		public void setVariables(LeanVariableList variables) {
			this.variables = variables;
		}

	}
	
	public static class IsSteppingResponse implements IDebugResponse {

		boolean stepping;
		
		public IsSteppingResponse() {
		}

		public IsSteppingResponse(boolean stepping) {
			this.stepping = stepping;
		}
		
		@Override
		public Type getType() {
			return Type.IS_STEPPING;
		}

		public boolean isStepping() {
			return stepping;
		}
		
		public void setStepping(boolean stepping) {
			this.stepping = stepping;
		}

	}
	

	public enum Type {
		VOID(VoidResponse.class),
		GET_WORKERS(GetWorkersResponse.class),
		GET_STATUS(GetStatusResponse.class),
		GET_LINE(GetLineResponse.class),
		GET_STACK(GetStackResponse.class),
		GET_VARIABLES(GetVariablesResponse.class),
		IS_STEPPING(IsSteppingResponse.class)
		;
		
		Class<? extends IDebugResponse> klass;
		
		Type(Class<? extends IDebugResponse> klass) {
			this.klass = klass;
		}
		
		public Class<? extends IDebugResponse> getKlass() {
			return klass;
		}
	}

}
