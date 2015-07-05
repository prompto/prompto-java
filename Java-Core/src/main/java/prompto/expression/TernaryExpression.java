package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class TernaryExpression implements IExpression {

	IExpression condition;
	IExpression ifTrue;
	IExpression ifFalse;
	
	public TernaryExpression(IExpression condition, IExpression ifTrue, IExpression ifFalse) {
		this.condition = condition;
		this.ifTrue = ifTrue;
		this.ifFalse = ifFalse;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.O) {
			condition.toDialect(writer);
			writer.append(" ? ");
			ifTrue.toDialect(writer);
			writer.append(" : ");
			ifFalse.toDialect(writer);
		} else {
			ifTrue.toDialect(writer);
			writer.append(" if ");
			condition.toDialect(writer);
			writer.append(" else ");
			ifFalse.toDialect(writer);
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = condition.check(context);
		if(!(type instanceof BooleanType))
			throw new SyntaxError("Cannot test condition on " +  type.getName() );
		IType trueType = ifTrue.check(context);
		// IType falseType = ifFalse.check(context);
		// TODO check compatibility
		return trueType;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		Object test = condition.interpret(context);
		if(test == Boolean.TRUE)
			return ifTrue.interpret(context);
		else
			return ifFalse.interpret(context);
	}

}
