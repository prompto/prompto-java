package prompto.argument;

import java.lang.reflect.Type;

import prompto.compiler.CompilerException;
import prompto.error.PromptoError;
import prompto.expression.DefaultExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
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
	public Identifier getId() {
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
	
	@Override
	public Type getJavaType(Context context) {
		try {
			return getType(context).getJavaType();
		} catch(PromptoError e) {
			throw new CompilerException(e);
		}
	}
	

}
