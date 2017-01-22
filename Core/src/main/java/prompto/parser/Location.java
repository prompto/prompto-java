package prompto.parser;

import org.antlr.v4.runtime.Token;


public class Location implements ILocation {
	int index;
	int line;
	int column;
	
	public Location(Token token) {
		this(token, false);
	}
	
	public Location(Token token, boolean isEnd) {
		this.index = token.getStartIndex();
		this.line = token.getLine();
		this.column = token.getCharPositionInLine();
		if(isEnd && token.getText()!=null) {
			this.index += token.getText().length();
			this.column += token.getText().length();
		}
	}
	
	@Override
	public int getIndex() {
		return index;
	}
	
	@Override
	public int getLine() {
		return line;
	}
	
	@Override
	public int getColumn() {
		return column;
	}
}
