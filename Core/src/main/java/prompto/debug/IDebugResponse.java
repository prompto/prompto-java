package prompto.debug;

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
	
	public static class LineResponse implements IDebugResponse {

		int line;
		
		public LineResponse() {
		}

		public LineResponse(int line) {
			this.line = line;
		}
		
		@Override
		public Type getType() {
			return Type.LINE;
		}

		public int getLine() {
			return line;
		}
		
		public void setLine(int line) {
			this.line = line;
		}

	}
	
	public enum Type {
		VOID(VoidResponse.class),
		STATUS(StatusResponse.class),
		LINE(LineResponse.class)
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
