package presto.grammar;

import presto.error.InvalidDataError;
import presto.error.PrestoError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.AnyType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.IValue;

public class MatchingExpressionConstraint implements IAttributeConstraint {

	IExpression expression;
	
	public MatchingExpressionConstraint(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void checkValue(Context context, IValue value) throws PrestoError {
		Context child = context.newChildContext();
		child.registerValue(new Variable("value", AnyType.instance()));
		child.setValue("value", value);
		Object test = expression.interpret(child);
		if(!Boolean.TRUE.equals(test))
			throw new InvalidDataError((value==null ? "null" : value.toString()) + " does not match:" + expression.toString());
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(" matching ");
		expression.toDialect(writer);
	}

}
