package prompto.param;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.DefaultExpression;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.DecimalType;
import prompto.type.IntegerType;
import prompto.value.DecimalValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;


public abstract class BaseParameter extends CodeSection implements IParameter {

	Identifier id;
	boolean mutable = false;
	DefaultExpression defaultExpression;
	
	protected BaseParameter(Identifier id) {
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
		IValue value = expression.interpret(context);
		if(value instanceof IntegerValue && getType(context)==DecimalType.instance())
			return new DecimalValue(((IntegerValue)value).doubleValue()); 
		else if(value instanceof DecimalValue && getType(context)==IntegerType.instance())
			return new IntegerValue(((DecimalValue)value).longValue()); 
		else
			return value;
	}
	
	@Override
	public Type getJavaType(Context context) {
		return getType(context).toJavaType(context);
	}
	
	@Override
	public StackLocal registerLocal(Context context, MethodInfo method, Flags flags) {
		String desc = CompilerUtils.getDescriptor(getJavaType(context));
		VerifierType type = VerifierType.fromDescriptor(desc);
		ClassConstant classConstant = new ClassConstant(getJavaType(context));
		return method.registerLocal(getName(), type, classConstant);
	}

	@Override
	public ResultInfo compileParameter(Context context, MethodInfo method, Flags flags, ArgumentList assignments, boolean isFirst) {
		Argument assign = makeArgument(assignments, isFirst);
		ResultInfo valueInfo = assign.getExpression().compile(context.getCallingContext(), method, flags);
		// cast if required
		Type type = this.getJavaType(context);
		if(type==Double.class)
			return CompilerUtils.numberToDouble(method, valueInfo);
		else if(type==Long.class)
			return CompilerUtils.numberToLong(method, valueInfo);
		else
			return new ResultInfo(type);
		
	}

	protected Argument makeArgument(ArgumentList arguments, boolean isFirst) {
		Argument argument = arguments.find(id);
		if(argument!=null)
			return argument;
		// first argument can be anonymous
		else if(isFirst && arguments.size()>0 && arguments.get(0).getParameter()==null)
			return arguments.get(0);
		else if(defaultExpression!=null)
			return new Argument(this, defaultExpression);
		else
			throw new SyntaxError("Missing value for argument " + getName());
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append(this.getName());
	}


	@Override
	public void transpileCall(Transpiler transpiler, IExpression expression) {
	    expression.transpile(transpiler);
	}
}
