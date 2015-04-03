package presto.parser;

public interface IError {

	int getStartIndex();
	int getEndIndex();
	int getStartLine();
	int getStartColumn();
	String getMessage();
}
