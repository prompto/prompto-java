package prompto.grammar;

import prompto.compiler.ResultInfo;
import prompto.compiler.Compiler;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public interface IAssignableInstance {

	void checkAssignValue(Context context, IExpression expression) throws SyntaxError;
	void checkAssignMember(Context context, Identifier name) throws SyntaxError;
	void checkAssignElement(Context context) throws SyntaxError;
	void assign(Context context, IExpression expression) throws PromptoError;
	IValue interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer, IExpression expression);
	default void register(Context context, Compiler compiler, MethodInfo method) {
		throw new UnsupportedOperationException();
	}
	default ResultInfo compile(Context context, Compiler compiler, MethodInfo method) {
		throw new UnsupportedOperationException();
	}

}
