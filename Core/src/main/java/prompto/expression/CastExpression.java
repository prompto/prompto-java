package prompto.expression;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.intrinsic.PromptoProxy;
import prompto.param.ParameterList;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.IterableType;
import prompto.type.MethodType;
import prompto.type.NativeType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.DecimalValue;
import prompto.value.IValue;
import prompto.value.IntegerValue;
import prompto.value.NullValue;

public class CastExpression extends CodeSection implements IExpression {
	
	IExpression expression;
	IType type;
	boolean mutable;
	
	public CastExpression(IExpression expression, IType type, boolean mutable) {
		this.expression = expression;
		this.type = type.anyfy();
		this.mutable = mutable;
	}
	
	@Override
	public String toString() {
		return expression.toString() + " as " + (mutable ? "mutable " : "") + type.toString();
	}
	
	@Override
	public IType check(Context context) {
		IType actual = expression.check(context).anyfy();
		IType target = getTargetType(context);
		if(target==null)
			return VoidType.instance();
		// check Any
		if(actual==AnyType.instance())
			return target;
		// check upcast
		if(target.isAssignableFrom(context, actual))
			return target;
		// check downcast
		if(actual.isAssignableFrom(context, target))
			return target;
		context.getProblemListener().reportIncompatibleTypes(this, actual, target);
		return VoidType.instance();
	}

	private IType getTargetType(Context context) {
		return getTargetType(context, type, mutable);
	}
	
	private static IType getTargetType(Context context, IType type, boolean mutable) {
		if(type instanceof IterableType) {
			IType itemType = ((IterableType)type).getItemType();
			IType resolvedItemType = getTargetType(context, itemType, false);
			if(resolvedItemType==null) {
				context.getProblemListener().reportUnknownCategory(type, itemType.getTypeName());
				return null;
			} else
				return ((IterableType)type).withItemType(resolvedItemType).asMutable(context, mutable);
		} else if(type instanceof NativeType)
			return type.asMutable(context, mutable);
		else
			return getTargetAtomicType(context, type, mutable);
	}
	
	private static IType getTargetAtomicType(Context context, IType type, boolean mutable) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
		if(decl==null) {
			context.getProblemListener().reportUnknownCategory(type, type.getTypeName());
			return null;
		} else if(decl instanceof MethodDeclarationMap) {
			MethodDeclarationMap map = (MethodDeclarationMap)decl;
			if(map.size()==1)
				return new MethodType(map.getFirst());
			else {
				context.getProblemListener().reportAmbiguousIdentifier(type, type.getTypeName());
				return null;
			}
		} else
			return decl.getType(context).asMutable(context, mutable);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue value = expression.interpret(context);
		if(value!=null && value!=NullValue.instance()) {
			IType target = getTargetType(context);
			if(!target.equals(value.getType())) {
				if(target==DecimalType.instance() && value instanceof IntegerValue)
					value = new DecimalValue(((IntegerValue)value).doubleValue());
				else if(target==IntegerType.instance() && value instanceof DecimalValue)
					value = new IntegerValue(((DecimalValue)value).longValue());
				else if(target.isMoreSpecificThan(context, value.getType()))
					value.setType(target);
			}
		}
		return value;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IType target = getTargetType(context);
		if(target instanceof MethodType)
			return compileWithProxy(context, method, flags, (MethodType)target);
		else
			return compileCast(context, method, flags, target);
	}
	
	private ResultInfo compileWithProxy(Context context, MethodInfo method, Flags flags, MethodType target) {
		IMethodDeclaration decl = target.getMethod();
		ParameterList args = decl.getParameters();
		// the JVM can only cast to declared types, so we need a proxy to convert the FunctionalInterface call into the concrete one
		// 1st parameter is method reference
		expression.compile(context, method, flags); // this would return a lambda
		// what interface we are casting to
		ClassConstant dest = new ClassConstant(target.toJavaType(context));
		method.addInstruction(Opcode.LDC, dest);
		// method name
		InterfaceType intf = new InterfaceType(args, decl.getReturnType());
		String methodName = intf.getInterfaceMethodName(); 
		method.addInstruction(Opcode.LDC, new StringConstant(methodName));
		// method arg types
		List<Type> javaTypes = args.stream().map(arg->arg.getJavaType(context)).collect(Collectors.toList());
		CompilerUtils.compileClassConstantsArray(method, javaTypes);
		// create the proxy
		MethodConstant m = new MethodConstant(PromptoProxy.class, "newProxy", Object.class, Class.class, String.class, Class[].class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.CHECKCAST, dest);
		return new ResultInfo(dest.getType());
	}


	public ResultInfo compileCast(Context context, MethodInfo method, Flags flags, IType target) {
		ResultInfo src = expression.compile(context, method, flags);
		Type dest = target.toJavaType(context);
		if(dest==Long.class)
			return CompilerUtils.numberToLong(method, src);
		else if(dest==Double.class)
			return CompilerUtils.numberToDouble(method, src);
		ClassConstant c = new ClassConstant(dest);
		method.addInstruction(Opcode.CHECKCAST, c);
		return new ResultInfo(dest);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
		case M:
			expression.toDialect(writer);
			writer.append(" as ");
			if(mutable)
				writer.append("mutable ");
			type.toDialect(writer);
			break;
		case O:
			writer.append("(");
			if(mutable)
				writer.append("mutable ");
			type.toDialect(writer);
			writer.append(")");
			expression.toDialect(writer);
			break;
		}
		
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		expression.declare(transpiler);
		IType target = getTargetType(transpiler.getContext());
		if(target!=null)
			target.declare(transpiler);
	}
	
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    IType expType = this.expression.check(transpiler.getContext());
		IType target = getTargetType(transpiler.getContext());
	    if(expType==DecimalType.instance() && target==IntegerType.instance()) {
	        transpiler.append("Math.floor(");
	        this.expression.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        this.expression.transpile(transpiler);
	    return false;
	}

}
