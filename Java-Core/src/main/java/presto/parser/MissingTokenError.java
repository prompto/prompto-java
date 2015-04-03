package presto.parser;

public class MissingTokenError extends ProblemBase {

	public MissingTokenError(int line, int column, MissingTokenException e) {
		super(line, column, e);
	}
	
	@Override
	public int getStartIndex() {
		return ((MissingTokenException)e).getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex();
	}
	
	@Override
	public String getMessage() {
		return "Missing token, expecting: " + ((MissingTokenException)e).getMissingTokensAsString() 
				+ ", found: " + ((MissingTokenException)e).getOffendingText() + " instead.";
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
