package presto.expression;

import presto.declaration.TestMethodDeclaration;
import presto.error.PrestoError;
import presto.runtime.Context;

public interface IAssertion {

	boolean interpretAssert(Context context, TestMethodDeclaration testMethodDeclaration) throws PrestoError;

}
