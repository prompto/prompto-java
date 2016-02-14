package prompto.grammar;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;

/* something that can be referred to by name, and returns a type */
public interface INamed {
	Identifier getIdentifier();
	default String getName() {
		return getIdentifier().getName();
	}
	IType getType(Context context) throws SyntaxError;
}
