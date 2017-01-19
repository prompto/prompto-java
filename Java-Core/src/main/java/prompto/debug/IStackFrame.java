package prompto.debug;

public interface IStackFrame {

	String getFilePath();
	String getMethodName();
	int getLine();
	int getStartCharIndex();
	int getEndCharIndex();
}
