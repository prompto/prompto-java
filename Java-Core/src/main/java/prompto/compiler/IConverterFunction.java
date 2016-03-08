package prompto.compiler;

import prompto.runtime.Context;

public interface IConverterFunction {
	ResultInfo compile(Context context, Compiler compiler, MethodInfo method, ResultInfo value);
}
