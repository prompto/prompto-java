package prompto.expression;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import prompto.compiler.BootstrapMethod;
import prompto.compiler.CallSiteConstant;
import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.InterfaceType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodHandleConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NameAndTypeConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeMethodDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoNativeSymbol;
import prompto.java.JavaClassType;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.EnumeratedNativeType;
import prompto.type.IType;
import prompto.type.NativeType;
import prompto.type.TypeType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;
import prompto.value.TypeValue;


public class MethodSelector extends MemberSelector implements IMethodSelector {

	public MethodSelector(Identifier name) {
		super(name);
	}

	public MethodSelector(IExpression parent, Identifier id) {
		super(parent, id);
	}
	
	@Override
	public String toString() {
		return parent==null ? id.toString() : super.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		toDialect(writer, true);
	}
	
	public void toDialect(CodeWriter writer, boolean asRef) {
		if(asRef && writer.getDialect() == Dialect.E)
			writer.append("Method: ");
		if(parent==null)
			writer.append(id);
		else
			super.parentAndMemberToDialect(writer);
	}
	
	
	public IType checkParentType(Context context, boolean checkInstance) {
		if(checkInstance)
			return interpretParentInstance(context);
		else 
			return checkParent(context);
	}

	private IType interpretParentInstance(Context context) {
		IValue value = parent.interpret(context);
		if(value==null || value == NullValue.instance())
			throw new NullReferenceError();
		IType type = value.getType();
		if(parent instanceof SuperExpression)
			return ((CategoryType)type).getSuperType(this, context);
		else
			return type;
	}

	public ResultInfo compileExact(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		if(parent!=null)
			return compileExactExplicitMember(context, method, flags, declaration, arguments);
		else if(declaration.getMemberOf()!=null) 
			return compileExactImplicitMember(context, method, flags, declaration, arguments);
		else if(declaration.isAbstract())
			return compileExactAbstractInstance(context, method, flags, declaration, arguments);
		else if(!id.toString().equals(declaration.getName())) 
			return compileExactMethodInstance(context, method, flags, declaration, arguments);
		else 
			return compileExactStaticMethod(context, method, flags, declaration, arguments);
	}
	
	public ResultInfo compileTemplate(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments, String methodName) {
		if(parent!=null)
			return compileTemplateExplicitMember(context, method, flags, declaration, arguments, methodName);
		else if(declaration.getMemberOf()!=null) 
			return compileTemplateImplicitMember(context, method, flags, declaration, arguments, methodName);
		else if(declaration.isAbstract())
			return compileTemplateAbstractMethod(context, method, flags, declaration, arguments, methodName);
		else
			return compileTemplateStaticMethod(context, method, flags, declaration, arguments, methodName);
	}

	private ResultInfo compileTemplateStaticMethod(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments, String methodName) {
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call global method in current class
		Type classType = method.getClassFile().getThisClass().getType();
		IType returnType = declaration.check(context, false);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), returnType);
		MethodConstant constant = new MethodConstant(classType, methodName, descriptor);
		method.addInstruction(Opcode.INVOKESTATIC, constant);
		return new ResultInfo(returnType.toJavaType(context));
	}

	private ResultInfo compileTemplateAbstractMethod(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments, String methodName) {
		throw new UnsupportedOperationException();
	}

	private ResultInfo compileTemplateImplicitMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments, String methodName) {
		throw new UnsupportedOperationException();
	}

	private ResultInfo compileTemplateExplicitMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments, String methodName) {
		throw new UnsupportedOperationException();
	}

	public ResultInfo compileDynamic(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
	if(parent!=null)
		return compileDynamicExplicitMember(context, method, flags, declaration, arguments);
	else if(declaration.getMemberOf()!=null) 
		return compileDynamicImplicitMember(context, method, flags, declaration, arguments);
	else 
		return compileDynamicGlobalMethod(context, method, flags, declaration, arguments);
}

	private ResultInfo compileDynamicGlobalMethod(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call global method bootstrap method in its own class
		Type classType = CompilerUtils.getGlobalMethodType(declaration.getName());
		String methodName = declaration.getName();
		MethodConstant mc = new MethodConstant(classType, "bootstrap", 
				Lookup.class, String.class, MethodType.class, CallSite.class);
		MethodHandleConstant mhc = new MethodHandleConstant(mc);
		BootstrapMethod bsm = new BootstrapMethod(mhc);
		method.getClassFile().addBootstrapMethod(bsm);
		IType returnType = declaration.check(context, false);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), returnType);
		NameAndTypeConstant nameAndType = new NameAndTypeConstant(methodName, descriptor);
		CallSiteConstant constant = new CallSiteConstant(bsm, nameAndType);
		method.addInstruction(Opcode.INVOKEDYNAMIC, constant);
		return new ResultInfo(returnType.toJavaType(context));
	}

	private ResultInfo compileDynamicImplicitMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		throw new UnsupportedOperationException();
	}

	private ResultInfo compileDynamicExplicitMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		throw new UnsupportedOperationException();
	}

	private ResultInfo compileExactMethodInstance(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// load method instance
		compileLoadMethodInstance(context, method, flags, declaration);
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call global method in its own class
		Type classType = CompilerUtils.getGlobalMethodType(declaration.getName());
		String methodName = declaration.getName();
		IType returnType = declaration.check(context, false);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), returnType);
		InterfaceConstant constant = new InterfaceConstant(classType, methodName, descriptor);
		method.addInstruction(Opcode.INVOKEINTERFACE, constant);
		return new ResultInfo(returnType.toJavaType(context));
	}

	
	private ResultInfo compileExactAbstractInstance(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// load method instance
		compileLoadMethodInstance(context, method, flags, declaration);
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call global method through FunctionalInterface
		IType returnIType = declaration.check(context, false);
		InterfaceType intf = new InterfaceType(declaration.getParameters(), returnIType);
		Type classType = intf.getInterfaceType();
		String methodName = intf.getInterfaceMethodName();
		List<Type> argTypes = IntStream.range(0, declaration.getParameters().size()).mapToObj(i->Object.class).collect(Collectors.toList());
		Descriptor.Method descriptor = new Descriptor.Method(argTypes.toArray(new Type[argTypes.size()]), intf.isVoid() ? void.class : Object.class);
		InterfaceConstant constant = new InterfaceConstant(classType, methodName, descriptor);
		method.addInstruction(Opcode.INVOKEINTERFACE, constant);
		// cast result
		Type returnType = returnIType.toJavaType(context);
		if(!intf.isVoid())
			method.addInstruction(Opcode.CHECKCAST, new ClassConstant(returnType));
		// done
		return new ResultInfo(returnIType.toJavaType(context));
	}


	
	private Type compileLoadMethodInstance(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		StackLocal local = method.getRegisteredLocal(getName());
		if(local!=null) {
			CompilerUtils.compileALOAD(method, local);
			return ((StackLocal.ObjectLocal)local).getClassName().getType();
		}
		// if in a closure, could be a field
		FieldInfo fieldInfo = method.getClassFile().getFieldInfo(getName());
		if(fieldInfo!=null) {
			ClassConstant thisClass = method.getClassFile().getThisClass();
			method.addInstruction(Opcode.ALOAD_0, thisClass);
			FieldConstant field = new FieldConstant(method.getClassFile().getThisClass(), id.toString(), fieldInfo.getType());
			method.addInstruction(Opcode.GETFIELD, field);
			return field.getType();
		}
		// not sure how we got here...
		throw new UnsupportedOperationException("Could not find abstract method instance " + getName())	;
	}

	private ResultInfo compileExactStaticMethod(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call global method in its own class
		Type classType = CompilerUtils.getGlobalMethodType(declaration.getName());
		String methodName = declaration.getName();
		IType returnType = declaration.check(context, false);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), returnType);
		MethodConstant constant = new MethodConstant(classType, methodName, descriptor);
		method.addInstruction(Opcode.INVOKESTATIC, constant);
		return new ResultInfo(returnType.toJavaType(context));
	}

	private ResultInfo compileExactImplicitMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		if(declaration.getMemberOf() instanceof SingletonCategoryDeclaration)
			return compileExactImplicitSingletonMember(context, method, flags, declaration, arguments);
		else
			return compileExactImplicitThis(context, method, flags, declaration, arguments);
	}

	private ResultInfo compileExactImplicitSingletonMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// calling an implicit singleton member method
		TypeExpression parent = new TypeExpression(declaration.getMemberOf().getType(context));
		ResultInfo info = parent.compileParent(context.getCallingContext(), method, flags); 
		return compileExactStaticMember(context, method, flags, info.getType(), declaration, arguments);
	}

	private ResultInfo compileExactImplicitThis(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// calling method with implicit this
		StackLocal local = method.getRegisteredLocal("this");
		ClassConstant klass = ((StackLocal.ObjectLocal)local).getClassName();
		method.addInstruction(Opcode.ALOAD_0, klass); // 'this' is always at index 0
		return compileExactInstanceMember(context, method, flags, declaration, arguments, new ResultInfo(klass.getType()));
	}
	
	private ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments, ResultInfo info) {
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call virtual method
		ClassConstant klass = new ClassConstant(info.getType());
		IType returnType = declaration.check(context, false);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), returnType);
		if(info.isSuper()) {
			MethodConstant constant = new MethodConstant(klass, declaration.getName(), descriptor);
			method.addInstruction(Opcode.INVOKESPECIAL, constant);
		} else if(info.isInterface()) {
			InterfaceConstant constant = new InterfaceConstant(klass, declaration.getName(), descriptor);
			method.addInstruction(Opcode.INVOKEINTERFACE, constant);
		} else {
			MethodConstant constant = new MethodConstant(klass, declaration.getName(), descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
		}
		return new ResultInfo(returnType.toJavaType(context));
	}
	
	private ResultInfo compileExactStaticMember(Context context, MethodInfo method, Flags flags, Type parent, IMethodDeclaration declaration, ArgumentList arguments) {
		// find class
		ClassConstant parentClass = new ClassConstant(parent);
		// push arguments on the stack
		declaration.compileParameters(context, method, flags, arguments);
		// call static method
		IType returnType = checkStaticMemberReturntype(context, declaration);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), returnType);
		MethodConstant constant = new MethodConstant(parentClass, declaration.getName(), descriptor);
		method.addInstruction(Opcode.INVOKESTATIC, constant);
		return new ResultInfo(returnType.toJavaType(context));
	}
	
	private IType checkStaticMemberReturntype(Context context, IMethodDeclaration declaration) {
		IType returnType = declaration.check(context, false);
		if(returnType instanceof EnumeratedNativeType)
			returnType = new JavaClassType(PromptoNativeSymbol.class);
		return returnType;
	}
	


	public ResultInfo compileExactExplicitMember(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration, ArgumentList arguments) {
		// calling an explicit instance or singleton member method
		IExpression parent = resolveParent(context.getCallingContext());
		ResultInfo info = parent.compileParent(context.getCallingContext(), method, flags); 
		if(info.isStatic())
			return compileExactStaticMember(context, method, flags, info.getType(), declaration, arguments);
		else {
			// push instance if any
			if(declaration instanceof BuiltInMethodDeclaration) {
				BuiltInMethodDeclaration builtin = (BuiltInMethodDeclaration)declaration;
				if(builtin.hasCompileExactInstanceMember())
					return builtin.compileExactInstanceMember(context, method, flags, arguments);
			} else if(declaration instanceof NativeMethodDeclaration)
				return compileExactNativeMember (context, method, flags, (NativeMethodDeclaration)declaration, arguments, info);	
			return compileExactInstanceMember(context, method, flags, declaration, arguments, info);
		}
	}
	

	public ResultInfo compileExactNativeMember(Context context, MethodInfo method, Flags flags, NativeMethodDeclaration declaration, ArgumentList arguments, ResultInfo info) {
		StackState state = method.captureStackState();
		// can't use 'this' since it could refer to another abject than the native parent
		ClassConstant klass = new ClassConstant(info.getType());
		StackLocal local = method.registerLocal("$this$", VerifierType.ITEM_Object, klass); 
		CompilerUtils.compileASTORE(method, local);
		context = context.newInstanceContext(declaration.getMemberOf().getType(context), false).newChildContext(); // mimic method call
		info = declaration.compileMember(context, method, new Flags(), arguments);
		method.unregisterLocal(local);
		method.restoreStackLocals(state);
		state = method.captureStackState();
		method.placeLabel(state);
		return info;
	}
	
	public Context newLocalContext(Context context, IMethodDeclaration declaration) throws PromptoError {
		if(parent!=null)
			return newInstanceContext(context);
		else if(declaration.getMemberOf()!=null)
			return newLocalInstanceContext(context, declaration);
		else
			return context.newLocalContext();
	}

	public Context newLocalCheckContext(Context context, IMethodDeclaration declaration) {
		if(parent!=null)
			return newInstanceCheckContext(context);
		else if(declaration.getMemberOf()!=null)
			return newLocalInstanceContext(context, declaration);
		else
			return context.newLocalContext();
	}

	private Context newInstanceCheckContext(Context context) {
		IType type = parent.check(context);
		// if calling singleton method, parent is the singleton type 
		if(type instanceof TypeType) {
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, ((TypeType)type).getType().getTypeNameId());
			if(decl instanceof SingletonCategoryDeclaration)
				type = decl.getType(context);
		}
		if(type instanceof CategoryType) {
			context = context.newInstanceContext((CategoryType)type, false); 
			return context.newChildContext();
		} else if(type instanceof NativeType) {
			context = context.newBuiltInContext((NativeType)type);
			return context.newChildContext();
		} else {
			return context.newChildContext();
		}
	}

	private Context newInstanceContext(Context context) throws PromptoError {
		IValue value = parent.interpret(context);
		if(value==null || value==NullValue.instance())
			throw new NullReferenceError();
		if(value instanceof TypeValue) {
			IType type = ((TypeValue)value).getValue();
			if(type instanceof CategoryType) {
				IDeclaration decl = ((CategoryType)type).getDeclaration(context);
				if(decl instanceof SingletonCategoryDeclaration) {
					value = context.loadSingleton((CategoryType)type);
				}
			}
		}
		if(value instanceof CategorySymbol)
			value = ((CategorySymbol)value).interpret(context);
		if(value instanceof TypeValue) {
			return context.newChildContext(); 
		} else if(value instanceof IInstance) {
			context = context.newInstanceContext((IInstance)value, false);
			return context.newChildContext();
		} else {
			context = context.newBuiltInContext(value);
			return context.newChildContext();
		}
	}

	private Context newLocalInstanceContext(Context context, IMethodDeclaration declaration) {
		InstanceContext instance = context.getClosestInstanceContext();
		if(instance!=null) {
			CategoryType required = declaration.getMemberOf().getType(context);
			IType actual = instance.getInstanceType();
			if(!required.isAssignableFrom(context, actual))
				instance = null;
		}
		if(instance==null) {
			CategoryType declaring = declaration.getMemberOf().getType(context);
			instance = context.newInstanceContext(declaring, false);
		}
		return instance.newChildContext();
	}

	public IExpression toInstanceExpression() {
		if(parent==null)
			return new UnresolvedIdentifier(id);
		else
			return new MemberSelector(parent, id);
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
	    if(parent!=null) {
	        super.transpile(transpiler);
			if(parent instanceof ThisExpression)
				transpiler.append(".bind(this)");
			return false;
	    } else {
	        transpiler.append(this.getName());
	        return false;
	    }
	}

	public MethodSelector newFullSelector(long counter) {
	    String name = this.id.toString() + "$" + counter;
	    return new MethodSelector(this.parent, new Identifier(name));
	}
	
	

}
