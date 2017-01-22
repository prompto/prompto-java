package prompto.instance;

import prompto.compiler.Flags;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public interface IAssignableInstance {

	IType checkAssignValue(Context context, IType valueType);
	IType checkAssignMember(Context context, Identifier name, IType valueType);
	IType checkAssignItem(Context context, IType itemType, IType valueType);
	void assign(Context context, IExpression expression) throws PromptoError;
	IValue interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer, IExpression expression);
	default ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		System.err.println("Missing compileParent for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}
	default ResultInfo compileAssign(Context context, MethodInfo method, Flags flags, IExpression expression) {
		System.err.println("Missing compileAssign for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}

}
