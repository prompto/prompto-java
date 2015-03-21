package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.BooleanType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.IValue;

public class NotExpression implements IUnaryExpression {

	IExpression expression;
	
	public NotExpression(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case P:
			writer.append("not ");
			break;
		case O:
			writer.append("!");
			break;
		}
		expression.toDialect(writer);
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType type = expression.check(context);
		if(!(type instanceof BooleanType))
			throw new SyntaxError("Cannot negate " + type.getName());
		return BooleanType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		Object val = expression.interpret(context);
		if(val instanceof Boolean) 
			return ((Boolean)val).getNot();
		else
			throw new SyntaxError("Illegal: not " + val.getClass().getSimpleName());
	}
}
