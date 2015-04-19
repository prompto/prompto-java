package presto.grammar;

import presto.error.PrestoError;
import presto.expression.DefaultExpression;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.value.IValue;


public abstract class BaseArgument implements IArgument {

	Identifier name;
	boolean mutable = false;
	DefaultExpression defaultExpression;
	
	protected BaseArgument(Identifier name) {
		this.name = name;
	}
	
	@Override
	public Identifier getIdentifier() {
		return name;
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
	public IValue checkValue(Context context, IExpression expression) throws PrestoError {
		return expression.interpret(context);
	}

}
