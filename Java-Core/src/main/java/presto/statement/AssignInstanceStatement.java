package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.IAssignableInstance;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;


public class AssignInstanceStatement extends SimpleStatement {
	
	IAssignableInstance instance;
	IExpression expression;
	
	public AssignInstanceStatement(IAssignableInstance instance, IExpression expression) {
		this.instance = instance;
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		instance.toDialect(writer);
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
	public IValue interpret(Context context) throws PrestoError {
		instance.assign(context,expression);
		return null;
	}
}
