package prompto.compiler;

import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;


public interface IOperatorFunction {
	ResultInfo compile(Context context, MethodInfo method, ResultInfo left, IExpression right, boolean toNative) throws SyntaxError;
}
