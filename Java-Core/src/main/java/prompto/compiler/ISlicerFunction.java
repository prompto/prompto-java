package prompto.compiler;

import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;


public interface ISlicerFunction {
	ResultInfo compile(Context context, MethodInfo method, ResultInfo parent, IExpression first, IExpression last, Flags flags) throws SyntaxError;
}
