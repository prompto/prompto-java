package prompto.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import prompto.compiler.CompilerUtils;
import prompto.compiler.IConstantOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NativeInstance;


public class JavaMethodExpression extends JavaSelectorExpression {

	String name;
	JavaExpressionList arguments;
	
	public JavaMethodExpression(String name, JavaExpressionList arguments) {
		this.name = name;
		this.arguments = arguments!=null ? arguments : new JavaExpressionList();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append('.');
		writer.append(name);
		writer.append('(');
		arguments.toDialect(writer);
		writer.append(')');
	}
	
	@Override
	public String toString() {
		return parent.toString() + "." + name + "(" + arguments.toString() + ")";
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		Method method = findMethod(context);
		if(method==null) {
			context.getProblemListener().reportUnknownMethod(name, this);
			return VoidType.instance();
		} else
			return new JavaClassType(method.getGenericReturnType());
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		// push instance if any
		ResultInfo parentType = parent.compile(context, method); 
		// push arguments if any
		for(JavaExpression arg : arguments)
			arg.compile(context, method);
		// write method call
		Method m = findMethod(context, parentType.getType());
		String proto = CompilerUtils.createProto(m.getParameterTypes(), m.getReturnType());
		String parentClassName = CompilerUtils.makeClassName(parentType.getType());
		IConstantOperand operand = new MethodConstant(parentClassName, m.getName(), proto);
		if(parentType.isInstance())
			method.addInstruction(Opcode.INVOKEVIRTUAL, operand);
		else
			method.addInstruction(Opcode.INVOKESTATIC, operand);
		return new ResultInfo(m.getReturnType(), true);
	}
	
	@Override
	public Object interpret(Context context) throws PromptoError {
		Object instance = parent.interpret(context);
		if(instance instanceof NativeInstance)
			instance = ((NativeInstance)instance).getInstance();
		Method method = findMethod(context, instance);
		Object[] args = evaluate_arguments(context, method);
		Class<?> klass = instance instanceof Class<?> ? (Class<?>)instance : instance.getClass(); 
		if(klass==instance)
			instance = null;
		try {
			return method.invoke(instance, args);
		} catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	Object[] evaluate_arguments(Context context, Method method) throws PromptoError {
		Object[] args = new Object[arguments.size()];
		Class<?>[] types = method.getParameterTypes();
		for(int i=0;i<args.length;i++) {
			JavaExpression exp = arguments.get(i);
			args[i] = evaluate_argument(context, exp, types[i]);
		}
		return args;
	}

	Object evaluate_argument(Context context, JavaExpression expression, Class<?> type) throws PromptoError {
        Object value = expression.interpret(context);
        if (value instanceof IExpression)
            value = ((IExpression)value).interpret(context);
        if (value instanceof IValue)
            value = ((IValue)value).convertTo(type);
        return value;
    }

	public Method findMethod(Context context) throws SyntaxError {
		IType type = parent.check(context);
		if(type==null) {
			context.getProblemListener().reportUnknownIdentifier(parent.toString(), parent);
			return null;
		} else {
			Type klass = findClass(context, type);
			return findMethod(context, klass);
		}
	}
	
	private Type findClass(Context context, IType type) throws SyntaxError {
		if(type instanceof CategoryType) {
			IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class, type.getId());
			if(named instanceof NativeCategoryDeclaration) 
				return ((NativeCategoryDeclaration)named).getBoundClass(context, true);
		}
			return type.toJavaType();
	}

	public Method findMethod(Context context, Object instance) throws SyntaxError {
		if(instance instanceof Class<?>)
			return findMethod(context, (Class<?>)instance);
		else
			return findMethod(context, instance.getClass());
	}
	
	public Method findMethod(Context context, Class<?> klass) throws SyntaxError {
		if(klass==null)
			return null;
		Method method = findExactMethod(context, klass);
		if(method!=null)
			return method;
		else
			return findCompatibleMethod(context, klass);
	}
	
	private Method findExactMethod(Context context, Class<?> klass) throws SyntaxError {
		Class<?>[] types = new Class<?>[arguments.size()];
		int i = 0;
		for(JavaExpression exp  : arguments)
			types[i++] = (Class<?>)exp.check(context).toJavaType();
		try {
			return klass.getDeclaredMethod(name, types);
		} catch (NoSuchMethodException e) {
			return null;
		}
	}

	private Method findCompatibleMethod(Context context, Class<?> klass) throws SyntaxError {
		Method[] methods = klass.getMethods();
		for(Method m : methods) {
			if(!name.equals(m.getName())) 
				continue;
			if(validPrototype(context, m))
				return m;
		}
		return null; 
	}

	boolean validPrototype(Context context,Method method) throws SyntaxError {
		Class<?>[] types = method.getParameterTypes();
		if(types.length!=arguments.size())
			return false;
		for(int i=0;i<types.length;i++) {
			if(!validArgument(context, types[i], arguments.get(i)))
				return false;
		}
		return true;
	}
	
	boolean validArgument(Context context, Class<?> klass, JavaExpression argument) throws SyntaxError {
		IType type = argument.check(context);
		return klass.isAssignableFrom((Class<?>)type.toJavaType());
	}
}
