package prompto.compiler;

import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;


public interface IOperatorFunction {
	ResultInfo compile(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression right) throws SyntaxError;
}
