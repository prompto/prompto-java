package prompto.debug.variable;

import prompto.debug.value.IValue;

public interface IVariable {

	String getName();
	String getTypeName();
	IValue getValue();
}
