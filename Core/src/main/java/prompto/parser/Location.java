package prompto.parser;

import org.antlr.v4.runtime.Token;


public class Location implements ILocation {

	int tokenIndex;
	int line;
	int column;
	
	public Location() {
	}
	
	public Location(Token token) {
		this(token, false);
	}
	
	public Location(Token token, boolean isEnd) {
		this.tokenIndex = token.getStartIndex();
		this.line = token.getLine();
		this.column = token.getCharPositionInLine();
		if(isEnd && token.getText()!=null) {
			this.tokenIndex += token.getText().length();
			this.column += token.getText().length();
		}
	}
	
	public Location(ILocation location) {
		if(location==null)
			location = null;
		this.tokenIndex = location.getTokenIndex();
		this.line = location.getLine();
		this.column = location.getColumn();
	}

	public Location(int index, int line, int column) {
		this.tokenIndex = index;
		this.line = line;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return "{ tokenIndex: " + tokenIndex + ", line: " + line + ", column: " + column + "}";
	}
	
	public void setTokenIndex(int index) {
		this.tokenIndex = index;
	}
	
	@Override
	public int getTokenIndex() {
		return tokenIndex;
	}
	
	public void setLine(int line) {
		this.line = line;
	}
	
	@Override
	public int getLine() {
		return line;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public boolean equals(Object other) {
		return this==other || (other instanceof Location && ((Location)other).equals(this));
	}
	
	public boolean equals(Location other) {
		return other != null && column == other.column && line == other.line && tokenIndex == other.tokenIndex;
	}

	

}
