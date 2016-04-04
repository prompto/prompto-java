package prompto.argument;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry;
import prompto.compiler.MethodInfo;
import prompto.compiler.StackLocal;
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
		return getType(context).getJavaType();
	}
	
	@Override
	public StackLocal registerLocal(Context context, MethodInfo method, Flags flags) {
		String desc = CompilerUtils.getDescriptor(getJavaType(context));
		IVerifierEntry.Type type = IVerifierEntry.Type.fromDescriptor(desc);
		ClassConstant classConstant = new ClassConstant(getJavaType(context));
		return method.registerLocal(getName(), type, classConstant);
	}

	@Override
	public void compileAssignment(Context context, MethodInfo method, Flags flags, IExpression expression) {
		expression.compile(context, method, flags);
	}
}
