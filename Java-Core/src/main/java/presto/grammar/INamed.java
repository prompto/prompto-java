package presto.grammar;

import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;

/* something that can be referred to by name, and returns a type */
public interface INamed {
	Identifier getIdentifier();
	IType getType(Context context) throws SyntaxError;
}
