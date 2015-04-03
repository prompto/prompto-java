package presto.parser;

public interface IProblem {
	
	int getStartIndex();
	int getEndIndex();
	int getStartLine();
	int getStartColumn();
	String getMessage();
	Type getType();
	
	static enum Type {
		ERROR,
		WARNING,
		INFO
	}
}
