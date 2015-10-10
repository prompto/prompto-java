package prompto.problem;

import prompto.parser.UnwantedTokenException;

public class UnwantedTokenError extends ParserProblemBase {

	UnwantedTokenException e;
	
	public UnwantedTokenError(int line, int column, UnwantedTokenException e) {
		super(line, column);
		this.e = e;
	}
	
	@Override
	public int getStartIndex() {
		return e.getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex() + getOffendingText().length();
	}
	
	String getOffendingText() {
		return e.getOffendingText();
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
