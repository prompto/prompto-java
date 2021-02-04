package prompto.debug.stack;

import java.util.Collection;

import prompto.debug.variable.IVariable;


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
