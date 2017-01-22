package prompto.debug;

import com.fasterxml.jackson.annotation.JsonIgnore;


public interface IDebugResponse {
	
	@JsonIgnore
	Type getType();

	public static class StatusResponse implements IDebugResponse {

		Status status;
		
		public StatusResponse() {
		}

		public StatusResponse(Status status) {
			this.status = status;
		}
		
		@Override
		public Type getType() {
			return Type.STATUS;
		}

		public Status getStatus() {
			return status;
		}
		
		public void setStatus(Status status) {
			this.status = status;
		}

	}
	
	public enum Type {
		STATUS(StatusResponse.class)
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
