package prompto.debug.response;

public class GetLineDebugResponse implements IDebugResponse {

	int lineInFile;
	int lineInMethod;
		
	public GetLineDebugResponse() {
	}

	public GetLineDebugResponse(int lineInFile, int lineInMethod) {
		this.lineInFile = lineInFile;
		this.lineInMethod = lineInMethod;
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

	@Override
	public boolean equals(Object other) {
		return this == other || (other instanceof GetLineDebugResponse && ((GetLineDebugResponse)other).equals(this));
	}
	
	public boolean equals(GetLineDebugResponse other) {
		return lineInFile == other.lineInFile && lineInMethod == other.lineInMethod;
	}
	

}