package presto.parser;

public class UnwantedTokenError extends ProblemBase {

	public UnwantedTokenError(int line, int column, UnwantedTokenException e) {
		super(line, column, e);
	}
	
	@Override
	public int getStartIndex() {
		return ((UnwantedTokenException)e).getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex() + getOffendingText().length();
	}
	
	String getOffendingText() {
		return ((UnwantedTokenException)e).getOffendingText();
	}
	
	@Override
	public String getMessage() {
		return "Unwanted token: " + getOffendingText();
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
