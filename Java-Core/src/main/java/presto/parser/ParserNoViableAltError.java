package presto.parser;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

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
		TokenStream tokens = (TokenStream)e.getInputStream();
		Token start = ((NoViableAltException)e).getStartToken();
		return "Invalid syntax at: " +
				( start.getType()==Token.EOF ? "<EOF>" : tokens.getText(start, e.getOffendingToken()));
	}
	
	@Override
	public Type getType() {
		return Type.ERROR;
	}
	
}
