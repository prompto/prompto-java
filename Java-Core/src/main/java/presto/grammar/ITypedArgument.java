package presto.grammar;

import presto.type.IType;

public interface ITypedArgument extends IArgument {

	IType getType();

}
