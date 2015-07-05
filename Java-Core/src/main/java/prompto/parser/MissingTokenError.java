package prompto.parser;

public class MissingTokenError extends ProblemBase {

	MissingTokenException e;
	
	public MissingTokenError(int line, int column, MissingTokenException e) {
		super(line, column);
		this.e = e;
	}
	
	@Override
	public int getStartIndex() {
		return e.getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex();
	}
	
	@Override
	public String getMessage() {
		return "Missing token, expecting: " + e.getMissingTokensAsString() 
				+ ", found: " + e.getOffendingText() + " instead.";
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
