package prompto.compiler;

import prompto.runtime.Context;


public interface IOperatorFunction {
	ResultInfo compile(Context context, Compiler compiler, MethodInfo method, ResultInfo left, ResultInfo right);
}
