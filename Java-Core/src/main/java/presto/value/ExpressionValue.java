package presto.value;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;

/* a value which can be used as an expression in a check/interpret scenario */
public class ExpressionValue extends BaseValue implements IExpression {

	IValue value;
	
	public ExpressionValue(IType type, IValue value) {
		super(type);
		this.value = value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return type;
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		return value;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(value.toString()); // value has no dialect
	}
	
	@Override
	public ISliceable<IValue> asSliceable(Context context) throws PrestoError {
		return value.asSliceable(context);
	}
	

}
