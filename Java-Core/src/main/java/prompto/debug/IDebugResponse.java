package prompto.debug;


public interface IDebugResponse {
	
	public static class StatusResponse implements IDebugResponse {

		Status status;
		
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

	Type getType();
}
