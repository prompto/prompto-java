package presto.parser;

import org.antlr.v4.runtime.NoViableAltException;

public class ParserNoViableAltError extends ProblemBase {

	public ParserNoViableAltError(int line, int column, NoViableAltException e) {
		super(line, column, e);
	}
	
	@Override
	public int getStartIndex() {
		return ((NoViableAltException)e).getOffendingToken().getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex() + getOffendingText().length();
	}
	
	String getOffendingText() {
		return ((NoViableAltException)e).getOffendingToken().getText();
	}
	
	@Override
	public String getMessage() {
		return "Invalid syntax, found: " + getOffendingText() + ", was expecting: "
				+ ((NoViableAltException)e).getExpectedTokens().toString(e.getRecognizer().getVocabulary());
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
