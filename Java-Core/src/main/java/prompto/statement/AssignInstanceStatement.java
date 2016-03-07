package prompto.statement;

import prompto.compiler.ResultInfo;
import prompto.compiler.Compiler;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.IAssignableInstance;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class AssignInstanceStatement extends SimpleStatement {
	
	IAssignableInstance instance;
	IExpression expression;
	
	public AssignInstanceStatement(IAssignableInstance instance, IExpression expression) {
		this.instance = instance;
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		instance.toDialect(writer, expression);
		writer.append(" = ");
		expression.toDialect(writer);
	}
	
	public IExpression getExpression() {
		return expression;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		instance.checkAssignValue(context, expression);
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		instance.assign(context,expression);
		return null;
	}
	
	@Override
	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		instance.checkAssignValue(context, expression);
		instance.register(context, compiler, method);
		expression.compile(context, compiler, method);
		return instance.compile(context, compiler, method);
	}
}
