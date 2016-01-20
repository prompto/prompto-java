package prompto.grammar;

import prompto.error.PromptoError;
import prompto.expression.DefaultExpression;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.value.IValue;


public abstract class BaseArgument implements IArgument {

	Identifier id;
	boolean mutable = false;
	DefaultExpression defaultExpression;
	
	protected BaseArgument(Identifier id) {
		this.id = id;
	}
	
	@Override
	public Identifier getIdentifier() {
		return id;
	}
	
	@Override
	public boolean setMutable(boolean set) {
		boolean result = mutable;
		mutable = set;
		return result;
	}
	
	@Override
	public boolean isMutable() {
		return mutable;
	}
	
	@Override
	public DefaultExpression getDefaultExpression() {
		return defaultExpression;
	}
	
	public void setDefaultExpression(IExpression expression) {
		this.defaultExpression = expression==null ? null : new DefaultExpression(expression);
	}
	
	@Override
	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		return expression.interpret(context);
	}

}
