package presto.parser;

import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.misc.Interval;

public class LexerNoViableAltError extends ErrorBase {

	public LexerNoViableAltError(int line, int column, LexerNoViableAltException e) {
		super(line, column, e);
	}
	
	@Override
	public int getStartIndex() {
		return ((LexerNoViableAltException)e).getStartIndex();
	}
	
	@Override
	public int getEndIndex() {
		return getStartIndex() + getOffendingText().length();
	}
	
	String getOffendingText() {
		int idx = getStartIndex();
		return ((LexerNoViableAltException)e).getInputStream().getText(Interval.of(idx, idx));
	}
	
	@Override
	public String getMessage() {
		return "Unrecognized character sequence: " + getOffendingText();
	}
	
}
