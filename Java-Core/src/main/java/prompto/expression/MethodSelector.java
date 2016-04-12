package prompto.expression;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import prompto.compiler.BootstrapMethod;
import prompto.compiler.CallSiteConstant;
import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodHandleConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NameAndTypeConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.error.InvalidValueError;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.ConcreteInstance;
import prompto.value.NullValue;
import prompto.value.TypeValue;


public class MethodSelector extends MemberSelector implements IMethodSelector {

	public MethodSelector(Identifier name) {
		super(name);
	}

	public MethodSelector(IExpression parent, Identifier name) {
		super(parent,name);
	}
	
	@Override
	public String toString() {
		return parent==null ? id.toString() : super.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(parent==null)
			writer.append(id);
		else
			super.toDialect(writer);
	}
	
	public Collection<IMethodDeclaration> getCandidates(Context context) {
		if(parent==null)
			return getGlobalCandidates(context);
		else
			return getCategoryCandidates(context);
	}
	
	private Collection<IMethodDeclaration> getGlobalCandidates(Context context) {
		List<IMethodDeclaration> methods = new ArrayList<IMethodDeclaration>();
		// if called from a member method, could be a member method called without this/self
		if(context.getParentContext() instanceof InstanceContext) {
			IType type = ((InstanceContext)context.getParentContext()).getInstanceType();
			ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, type.getTypeNameId());
			if(cd!=null) {
				MethodDeclarationMap members = cd.getMemberMethods(context, id);
				if(members!=null)
					methods.addAll(members.values());
			}
		}
		MethodDeclarationMap globals = context.getRegisteredDeclaration(MethodDeclarationMap.class, id);
		if(globals!=null)
			methods.addAll(globals.values());
		return methods;
	}
	
	private Collection<IMethodDeclaration> getCategoryCandidates(Context context) {
		IType parentType = checkParent(context);
		if(!(parentType instanceof CategoryType))
			throw new SyntaxError(parent.toString() + " is not a category");
		ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, parentType.getTypeNameId());
		if(cd==null)
			throw new SyntaxError("Unknown category:" + parentType.getTypeName());
		return cd.getMemberMethods(context, id).values();
	}

	public ResultInfo compileExact(Context context, MethodInfo method, Flags flags, 
				IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		if(parent!=null)
			return compileExactExplicitMember(context, method, flags, declaration, assignments);
		else if(declaration.getMemberOf()!=null) 
			return compileExactImplicitMember(context, method, flags, declaration, assignments);
		else 
			return compileExactGlobalMethod(context, method, flags, declaration, assignments);
	}
	
	public ResultInfo compileDynamic(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
	if(parent!=null)
		return compileDynamicExplicitMember(context, method, flags, declaration, assignments);
	else if(declaration.getMemberOf()!=null) 
		return compileDynamicImplicitMember(context, method, flags, declaration, assignments);
	else 
		return compileDynamicGlobalMethod(context, method, flags, declaration, assignments);
}

	private ResultInfo compileDynamicGlobalMethod(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		// push arguments on the stack
		declaration.compileAssignments(context, method, flags, assignments);
		// call global method bootstrap method in its own class
		Type classType = CompilerUtils.getGlobalMethodType(declaration.getName());
		String methodName = declaration.getName();
		MethodConstant mc = new MethodConstant(classType, "bootstrap", 
				Lookup.class, String.class, MethodType.class, CallSite.class);
		MethodHandleConstant mhc = new MethodHandleConstant(mc);
		BootstrapMethod bsm = new BootstrapMethod(mhc);
		method.getClassFile().addBootstrapMethod(bsm);
		IType returnType = declaration.check(context);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getArguments(), returnType);
		NameAndTypeConstant nameAndType = new NameAndTypeConstant(methodName, descriptor);
		CallSiteConstant constant = new CallSiteConstant(bsm, nameAndType);
		method.addInstruction(Opcode.INVOKEDYNAMIC, constant);
		return new ResultInfo(returnType.getJavaType(context));
	}

	private ResultInfo compileDynamicImplicitMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		throw new UnsupportedOperationException();
	}

	private ResultInfo compileDynamicExplicitMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		throw new UnsupportedOperationException();
	}

	private ResultInfo compileExactGlobalMethod(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		// push arguments on the stack
		declaration.compileAssignments(context, method, flags, assignments);
		// call global method in its own class
		Type classType = CompilerUtils.getGlobalMethodType(declaration.getName());
		String methodName = declaration.getName();
		IType returnType = declaration.check(context);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getArguments(), returnType);
		MethodConstant constant = new MethodConstant(classType, methodName, descriptor);
		method.addInstruction(Opcode.INVOKESTATIC, constant);
		return new ResultInfo(returnType.getJavaType(context));
	}

	private ResultInfo compileExactImplicitMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		// calling method with implicit this
		StackLocal local = method.getRegisteredLocal("this");
		ClassConstant klass = ((StackLocal.ObjectLocal)local).getClassName();
		method.addInstruction(Opcode.ALOAD_0, klass); // 'this' is always at index 0
		return compileExactInstanceMember(context, method, flags, declaration, assignments, klass);
	}

	private ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments, 
			ClassConstant parentClass) {
		// push arguments on the stack
		declaration.compileAssignments(context, method, flags, assignments);
		// call virtual method
		IType returnType = declaration.check(context);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getArguments(), returnType);
		if(parentClass.isInterface()) {
			InterfaceConstant constant = new InterfaceConstant(parentClass, declaration.getName(), descriptor);
			method.addInstruction(Opcode.INVOKEINTERFACE, constant);
		} else {
			MethodConstant constant = new MethodConstant(parentClass, declaration.getName(), descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
		}
		return new ResultInfo(returnType.getJavaType(context));
	}
	
	private ResultInfo compileExactStaticMember(Context context, MethodInfo method, Flags flags, 
			IExpression parent, IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		// find class
		Type type = getSingletonType(context, parent);
		ClassConstant parentClass = new ClassConstant(type);
		// push arguments on the stack
		declaration.compileAssignments(context, method, flags, assignments);
		// call static method
		IType returnType = declaration.check(context);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getArguments(), returnType);
		MethodConstant constant = new MethodConstant(parentClass, declaration.getName(), descriptor);
		method.addInstruction(Opcode.INVOKESTATIC, constant);
		return new ResultInfo(returnType.getJavaType(context));
	}

	private Type getSingletonType(Context context, IExpression parent) {
		if(!(((TypeExpression)parent).getType() instanceof CategoryType))
			throw new SyntaxError("Expecting a category type!");
		CategoryType type = (CategoryType)((TypeExpression)parent).getType();
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getTypeNameId());
		if(decl instanceof SingletonCategoryDeclaration)
			return CompilerUtils.getCategorySingletonType(type.getTypeNameId());
		else
			throw new SyntaxError("Expecting a singleton type!");
	}

	private ResultInfo compileExactExplicitMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) {
		// calling an explicit instance or singleton member method
		IExpression parent = resolveParent(context.getCallingContext());
		if(parent instanceof TypeExpression)
			return compileExactStaticMember(context, method, flags, parent, declaration, assignments);
		else {
			// push instance if any
			ResultInfo info = parent.compile(context.getCallingContext(), method, flags); 
			ClassConstant c = new ClassConstant(info.getType());
			return compileExactInstanceMember(context, method, flags, declaration, assignments, c);
		}
	}

	public Context newLocalContext(Context context, IMethodDeclaration declaration) throws PromptoError {
		if(parent!=null)
			return newInstanceContext(context);
		else if(declaration.getMemberOf()!=null)
			return newLocalInstanceContext(context);
		else
			return context.newLocalContext();
	}

	public Context newLocalCheckContext(Context context, IMethodDeclaration declaration) {
		if(parent!=null)
			return newInstanceCheckContext(context);
		else if(declaration.getMemberOf()!=null)
			return newLocalInstanceContext(context);
		else
			return context.newLocalContext();
	}

	private Context newInstanceCheckContext(Context context) {
		IType type = parent.check(context);
		if(!(type instanceof CategoryType))
			throw new SyntaxError("Not an instance !");
		context = context.newSingletonContext((CategoryType)type);
		return context.newChildContext();
	}

	private Context newInstanceContext(Context context) throws PromptoError {
		Object value = parent.interpret(context);
		if(value==null || value==NullValue.instance())
			throw new NullReferenceError();
		if(value instanceof TypeValue && ((TypeValue)value).getValue() instanceof CategoryType)
			value = context.loadSingleton(context, (CategoryType)((TypeValue)value).getValue());
		if(!(value instanceof ConcreteInstance))
			throw new InvalidValueError("Not an instance !");
		context = context.newInstanceContext((ConcreteInstance)value);
		return context.newChildContext();
	}

	private Context newLocalInstanceContext(Context context) {
		Context parent = context.getParentContext();
		if(!(parent instanceof InstanceContext))
			throw new SyntaxError("Not in instance context !");
		context = context.newLocalContext();
		context.setParentContext(parent); // make local context child of the existing instance
		return context;
	}


	public IExpression toInstanceExpression() {
		if(parent==null)
			return new UnresolvedIdentifier(id);
		else
			return new MemberSelector(parent, id);
	}

	





}
