package prompto.compiler;

import prompto.error.SyntaxError;
import prompto.runtime.Context;


public interface IUnaryFunction {
	ResultInfo compile(Context context, MethodInfo method, ResultInfo exp, Flags flags) throws SyntaxError;
}
