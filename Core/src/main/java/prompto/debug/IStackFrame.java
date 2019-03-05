package prompto.debug;

import java.util.Collection;


public interface IStackFrame {

	String getFilePath();
	int getIndex();
	String getMethodName();
	int getMethodLine();
	int getInstructionLine();
	int getStartCharIndex();
	int getEndCharIndex();
	Collection<? extends IVariable> getVariables();

}
