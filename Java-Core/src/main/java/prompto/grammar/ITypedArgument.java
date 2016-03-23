package prompto.grammar;

import prompto.argument.IArgument;
import prompto.type.IType;

public interface ITypedArgument extends IArgument {

	IType getType();

}
