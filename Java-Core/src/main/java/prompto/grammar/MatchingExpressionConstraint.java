package prompto.grammar;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.AnyType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class MatchingExpressionConstraint implements IAttributeConstraint {

	IExpression expression;
	
	public MatchingExpressionConstraint(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void checkValue(Context context, IValue value) throws PromptoError {
		Context child = context.newChildContext();
		child.registerValue(new Variable(new Identifier("value"), AnyType.instance()));
		child.setValue(new Identifier("value"), value);
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
