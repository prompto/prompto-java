package presto.parser;

import org.antlr.v4.runtime.InputMismatchException;

public class InputMismatchError extends ProblemBase {

	InputMismatchException e;

	public InputMismatchError(int line, int column, InputMismatchException e) {
		super(line, column);
		this.e = e;
	}
	
	@Override
	public int getStartIndex() {
		return e.getOffendingToken().getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex() + getOffendingText().length();
	}
	
	String getOffendingText() {
		return e.getOffendingToken().getText();
	}
	
	@Override
	public String getMessage() {
		return "Input mismatch, found: " + getOffendingText() + ", was expecting: "
				+ e.getExpectedTokens().toString(e.getRecognizer().getVocabulary());
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
