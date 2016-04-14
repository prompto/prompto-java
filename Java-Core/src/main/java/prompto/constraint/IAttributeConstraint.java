package prompto.constraint;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public interface IAttributeConstraint {

	void checkValue(Context context, IValue value) throws PromptoError;
	void toDialect(CodeWriter writer);
	void compile(Context context, MethodInfo method, Flags flags);

}
