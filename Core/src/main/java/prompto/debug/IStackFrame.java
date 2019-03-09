package prompto.debug;

import java.util.Collection;


public interface IStackFrame {

	String getFilePath();
	int getIndex();
	String getCategoryName();
	String getMethodName();
	String getMethodProto();
	int getMethodLine();
	int getStatementLine();
	int getStartCharIndex();
	int getEndCharIndex();
	Collection<? extends IVariable> getVariables();

}
