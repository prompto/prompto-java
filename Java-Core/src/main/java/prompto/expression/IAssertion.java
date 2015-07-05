package prompto.expression;

import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.runtime.Context;

public interface IAssertion {

	boolean interpretAssert(Context context, TestMethodDeclaration testMethodDeclaration) throws PromptoError;

}
