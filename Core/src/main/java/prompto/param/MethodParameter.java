package prompto.param;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceType;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.NamedType;
import prompto.compiler.StackLocal;
import prompto.compiler.StringConstant;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.grammar.ParameterList;
import prompto.intrinsic.PromptoProxy;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.transpiler.Transpiler;
import prompto.type.MethodType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.ArrowValue;
import prompto.value.ContextualExpression;
import prompto.value.IValue;

public class MethodParameter extends BaseParameter implements INamedParameter {
	
	public MethodParameter(Identifier id) {
		super(id);
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
	}

	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public String getProto() {
		return id.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof MethodParameter))
			return false;
		MethodParameter other = (MethodParameter)obj;
		return Objects.equals(this.getId(),other.getId());
	}

	@Override
	public void register(Context context) {
		INamed actual = context.getRegisteredValue(INamed.class,id);
		if(actual!=null)
			throw new SyntaxError("Duplicate parameter: \"" + id + "\"");
		context.registerValue(this);
	}
	
	@Override
	public void check(Context context) {
		IMethodDeclaration actual = getDeclaration(context);
		if(actual==null)
			throw new SyntaxError("Unknown method: \"" + id + "\"");
	}
	
	@Override
	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		boolean isArrow = expression instanceof ContextualExpression && ((ContextualExpression)expression).getExpression() instanceof ArrowExpression;
		if(isArrow)
			return checkArrowValue(context, (ContextualExpression)expression);
		else
			return super.checkValue(context, expression);
	}
	
	private IValue checkArrowValue(Context context, ContextualExpression expression) {
		return new ArrowValue(getDeclaration(context), expression.getCalling(), (ArrowExpression)expression.getExpression()); // TODO check
	}

	@Override
	public MethodType getType(Context context) {
		IMethodDeclaration actual = getDeclaration(context);
		return new MethodType(actual);
	}
	
	private IMethodDeclaration getDeclaration(Context context) {
		MethodDeclarationMap methods = context.getRegisteredDeclaration(MethodDeclarationMap.class, id);
		if(methods!=null)
			return (IMethodDeclaration)(methods.values().iterator().next());
		else
			return null;
	}
	
	@Override
	public void compileArgument(Context context, MethodInfo method, Flags flags, ArgumentList arguments, boolean isFirst) {
		// 1st parameter is method reference
		Argument argument = makeArgument(arguments, isFirst);
		IExpression expression = argument.getExpression();
		if(expression instanceof ArrowExpression)
			compileArrowArgument(context, method, flags, (ArrowExpression)expression);
		else
			compileMethodArgument(context, method, flags, expression);
	}
	
	private void compileMethodArgument(Context context, MethodInfo method, Flags flags, IExpression expression) {
		MethodType target = getType(context);
		IMethodDeclaration decl = target.getMethod();
		ParameterList parameters = decl.getParameters();
		// the JVM can only cast to declared types, so we need a proxy to convert the FunctionalInterface call into the concrete one
		expression.compile(context.getCallingContext(), method, flags); // this would return a lambda
		// what interface we are casting to
		ClassConstant dest = new ClassConstant(getJavaType(context));
		method.addInstruction(Opcode.LDC, dest);
		// method name
		InterfaceType intf = new InterfaceType(parameters, decl.getReturnType());
		String methodName = intf.getInterfaceMethodName(); 
		method.addInstruction(Opcode.LDC, new StringConstant(methodName));
		// method arg types
		List<Type> javaTypes = parameters.stream().map(arg->arg.getJavaType(context)).collect(Collectors.toList());
		CompilerUtils.compileClassConstantsArray(method, javaTypes);
		// create proxy
		MethodConstant m = new MethodConstant(PromptoProxy.class, "newProxy", Object.class, Class.class, String.class, Class[].class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.CHECKCAST, dest);
	}

	private void compileArrowArgument(Context context, MethodInfo method, Flags flags, ArrowExpression expression) {
		MethodType target = getType(context);
		IMethodDeclaration decl = target.getMethod();
		ParameterList parameters = decl.getParameters();
		InterfaceType intf = new InterfaceType(parameters, decl.getReturnType());
		// create an instance on which the method will be invoked
		String innerClassName = compileArrowExpressionInnerClass(context, method.getClassFile(), intf, expression);
		compileNewArrowExpressionInstance(context, method, flags, innerClassName, expression);
	}
	
	
	private void compileNewArrowExpressionInstance(Context context, MethodInfo method, Flags flags, String innerClassName, ArrowExpression expression) {
		// TODO support closure (see ConcreteMethodDeclaration.compileClosureClass)
		Type innerType = new NamedType(innerClassName); 
		CompilerUtils.compileNewInstance(method, innerType); 
	}

	private String compileArrowExpressionInnerClass(Context context, ClassFile parentClass, InterfaceType interfaceType, ArrowExpression expression) {
		int innerClassIndex = 1 + parentClass.getInnerClasses().size();
		String innerClassName = parentClass.getThisClass().getType().getTypeName() + '$' + innerClassIndex;
		ClassFile classFile = new ClassFile(new NamedType(innerClassName));
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.addInterface(new ClassConstant(interfaceType.getInterfaceType()));
		CompilerUtils.compileEmptyConstructor(classFile);
		compileInnerClassProxyMethod(context, classFile, interfaceType);
		compileInnerClassArrowMethod(context, classFile, expression);
		parentClass.addInnerClass(classFile);
		return innerClassName;
	}

	private void compileInnerClassProxyMethod(Context context, ClassFile classFile, InterfaceType interfaceType) {
		// context = prepareContext(context, isStart);
		MethodType target = getType(context);
		IMethodDeclaration declaration = target.getMethod();
		Type[] paramTypes = declaration.getParameters().stream()
				.filter(a-> 
					!(a instanceof CodeParameter)) // stripOutTemplateArguments
				.map((arg)->
					Object.class)
				.collect(Collectors.toList())
				.toArray(new Type[0]);
		Type returnType = declaration.getReturnType() == VoidType.instance() ? void.class : Object.class;
		Descriptor.Method proto = new Descriptor.Method(paramTypes, returnType);
		MethodInfo method = classFile.newMethod(interfaceType.getInterfaceMethodName(), proto); 
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());	
		declaration.getParameters().forEach(param->{
			ClassConstant classConstant = new ClassConstant(Object.class);
			method.registerLocal(param.getName(), VerifierType.ITEM_Object, classConstant);		
		});
		produceInnerClassProxyByteCode(context, method, declaration);
	}
	
	private void produceInnerClassProxyByteCode(Context context, MethodInfo method, IMethodDeclaration declaration) {
		// calling concrete method with implicit this
		method.addInstruction(Opcode.ALOAD_0, method.getClassFile().getThisClass()); // 'this' is always at index 0
		// push and cast arguments on the stack
		declaration.getParameters().forEach(param->{
			StackLocal local = method.getRegisteredLocal(param.getName());
			CompilerUtils.compileALOAD(method, local);
			Type type = param.getJavaType(context);
			if(type!=Object.class)
				method.addInstruction(Opcode.CHECKCAST, new ClassConstant(type));
		});
		// call virtual method
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), declaration.getReturnType());
		MethodConstant constant = new MethodConstant(method.getClassFile().getThisClass(), declaration.getName(), descriptor);
		method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
		// add return for void
		if(declaration.getReturnType()==VoidType.instance())
			method.addInstruction(Opcode.RETURN);
		else
			method.addInstruction(Opcode.ARETURN);
	}

	private void compileInnerClassArrowMethod(Context context, ClassFile classFile, ArrowExpression expression) {
		// context = prepareContext(context, isStart);
		MethodType target = getType(context);
		IMethodDeclaration declaration = target.getMethod();
		Descriptor.Method proto =CompilerUtils.createMethodDescriptor(context, declaration.getParameters(), declaration.getReturnType());
		MethodInfo method = classFile.newMethod(declaration.getName(), proto); 
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());	
		declaration.getParameters().forEach(param->param.registerLocal(context, method, new Flags()));
		produceInnerClassArrowByteCode(context, method, expression, declaration.getReturnType() == VoidType.instance());
	}

	private void produceInnerClassArrowByteCode(Context context, MethodInfo method, ArrowExpression expression, boolean isVoid) {
		expression.compile(context, method, new Flags());
		// add return for void
		if(isVoid)
			method.addInstruction(Opcode.RETURN);
	}

	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do ?
	}
	
	@Override
	public String getTranspiledName(Context context) {
		IMethodDeclaration method = this.getDeclaration(context);
	    return method.getTranspiledName(context);
	}
	
	@Override
	public void transpileCall(Transpiler transpiler, IExpression expression) {
		if(!transpileArrowExpressionCall(transpiler, expression))
			expression.transpile(transpiler);
	}

	private boolean transpileArrowExpressionCall(Transpiler transpiler, IExpression expression) {
		if(expression instanceof ContextualExpression)
			expression = ((ContextualExpression)expression).getExpression();
		if(expression instanceof ArrowExpression) {
			MethodType target = getType(transpiler.getContext());
			target.transpileArrowExpression(transpiler, (ArrowExpression)expression);
			return true;
		} else
			return false;
	}

}
