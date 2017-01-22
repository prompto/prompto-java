package prompto.debug;

import static prompto.debug.IDebugResponse.*;
import static prompto.debug.IDebugRequest.Type.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IDebugRequest {

	@JsonIgnore
	Type getType();
	IDebugResponse execute(IDebugger debugger);

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
	
	public enum Type {
		STATUS(StatusRequest.class)
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
