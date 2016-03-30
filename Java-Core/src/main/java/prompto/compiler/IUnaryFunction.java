package prompto.compiler;

import prompto.error.SyntaxError;
import prompto.runtime.Context;


public interface IUnaryFunction {
	ResultInfo compile(Context context, MethodInfo method, Flags flags, ResultInfo exp);
}
