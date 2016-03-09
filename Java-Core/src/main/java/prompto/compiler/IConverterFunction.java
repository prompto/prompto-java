package prompto.compiler;

import prompto.runtime.Context;

public interface IConverterFunction {
	ResultInfo compile(Context context, MethodInfo method, ResultInfo value);
}
