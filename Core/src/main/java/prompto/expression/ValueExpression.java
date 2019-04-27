package prompto.expression;

import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.BaseValue;
import prompto.value.ISliceable;
import prompto.value.IValue;

/* a value which can be used as an expression in a check/interpret scenario */
public class ValueExpression extends BaseValue implements IExpression {

	IValue value;
	
	public ValueExpression(IType type, IValue value) {
		super(type);
		this.value = value;
	}
	
	public IValue getValue() {
		return value;
	}
	
	@Override
	public IType check(Context context) {
		return this.getType();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
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
	public ISliceable<IValue> asSliceable(Context context) throws PromptoError {
		return value.asSliceable(context);
	}
	

}
