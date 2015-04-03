package presto.parser;

import org.antlr.v4.runtime.InputMismatchException;

public class InputMismatchError extends ProblemBase {

	public InputMismatchError(int line, int column, InputMismatchException e) {
		super(line, column, e);
	}
	
	@Override
	public int getStartIndex() {
		return ((InputMismatchException)e).getOffendingToken().getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex() + getOffendingText().length();
	}
	
	String getOffendingText() {
		return ((InputMismatchException)e).getOffendingToken().getText();
	}
	
	@Override
	public String getMessage() {
		return "Input mismatch, found: " + getOffendingText() + ", was expecting: "
				+ ((InputMismatchException)e).getExpectedTokens().toString(e.getRecognizer().getVocabulary());
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
