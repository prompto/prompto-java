package prompto.instance;

import prompto.compiler.Flags;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public interface IAssignableInstance {

	IType checkAssignValue(Context context, IExpression expression) throws SyntaxError;
	IType checkAssignMember(Context context, Identifier name) throws SyntaxError;
	IType checkAssignElement(Context context) throws SyntaxError;
	void assign(Context context, IExpression expression) throws PromptoError;
	IValue interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer, IExpression expression);
	default ResultInfo compileParent(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		System.err.println("Missing compileRegister for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}
	default ResultInfo compileAssign(Context context, MethodInfo method, Flags flags, IExpression expression) throws SyntaxError {
		System.err.println("Missing compileAssign for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}

}
