package prompto.expression;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.InvalidDataError;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.grammar.UnresolvedIdentifier;
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
	
	public Collection<IMethodDeclaration> getCandidates(Context context) throws SyntaxError {
		if(parent==null)
			return getGlobalCandidates(context);
		else
			return getCategoryCandidates(context);
	}
	
	private Collection<IMethodDeclaration> getGlobalCandidates(Context context) throws SyntaxError {
		List<IMethodDeclaration> methods = new ArrayList<IMethodDeclaration>();
		// if called from a member method, could be a member method called without this/self
		if(context.getParentContext() instanceof InstanceContext) {
			IType type = ((InstanceContext)context.getParentContext()).getInstanceType();
			ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, type.getId());
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
	
	private Collection<IMethodDeclaration> getCategoryCandidates(Context context) throws SyntaxError {
		IType parentType = checkParent(context);
		if(!(parentType instanceof CategoryType))
			throw new SyntaxError(parent.toString() + " is not a category");
		ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, parentType.getId());
		if(cd==null)
			throw new SyntaxError("Unknown category:" + parentType.getId());
		return cd.getMemberMethods(context, id).values();
	}

	public ResultInfo compile(Context context, MethodInfo method, Flags flags, 
				IMethodDeclaration declaration, ArgumentAssignmentList assignments) throws SyntaxError {
		// TODO use invokedynamic when multiple candidates
		if(parent!=null)
			return compileExplicitMember(context, method, flags, declaration, assignments);
		else if(declaration.getMemberOf()!=null) 
			return compileImplicitMember(context, method, flags, declaration, assignments);
		else 
			return compileGlobalMethod(context, method, flags, declaration, assignments);
	}

	private ResultInfo compileGlobalMethod(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) throws SyntaxError {
		// push arguments on the stack
		if(assignments!=null) for(ArgumentAssignment assign : assignments)
			assign.compile(context.getCallingContext(), method, flags);
		// call global method in its own class
		Type classType = CompilerUtils.getGlobalMethodType(declaration.getName());
		String methodName = declaration.getName();
		IType returnType = declaration.check(context);
		Descriptor.Method descriptor = CompilerUtils.createMethodDescriptor(context, declaration.getArguments(), returnType);
		MethodConstant constant = new MethodConstant(classType, methodName, descriptor);
		method.addInstruction(Opcode.INVOKESTATIC, constant);
		return new ResultInfo(returnType.getJavaType());
	}

	private ResultInfo compileImplicitMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) throws SyntaxError {
		// calling method with implicit this
		StackLocal local = method.getRegisteredLocal("this");
		ClassConstant klass = ((StackLocal.ObjectLocal)local).getClassName();
		method.addInstruction(Opcode.ALOAD_0, klass); // 'this' is always at index 0
		return compileMember(context, method, flags, declaration, assignments, klass);
	}

	private ResultInfo compileMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments, 
			ClassConstant parentClass) throws SyntaxError {
		// push arguments on the stack
		if(assignments!=null) for(ArgumentAssignment assign : assignments)
			assign.compile(context.getCallingContext(), method, flags);
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
		return new ResultInfo(returnType.getJavaType());
	}

	private ResultInfo compileExplicitMember(Context context, MethodInfo method, Flags flags, 
			IMethodDeclaration declaration, ArgumentAssignmentList assignments) throws SyntaxError {
		// calling an explicit instance or singleton member method
		// push instance if any
		ResultInfo info = parent.compile(context.getCallingContext(), method, flags); 
		ClassConstant c = new ClassConstant(info.getType());
		return compileMember(context, method, flags, declaration, assignments, c);
	}

	public Context newLocalContext(Context context, IMethodDeclaration declaration) throws PromptoError {
		if(parent!=null)
			return newInstanceContext(context);
		else if(declaration.getMemberOf()!=null)
			return newLocalInstanceContext(context);
		else
			return context.newLocalContext();
	}

	public Context newLocalCheckContext(Context context, IMethodDeclaration declaration) throws SyntaxError {
		if(parent!=null)
			return newInstanceCheckContext(context);
		else if(declaration.getMemberOf()!=null)
			return newLocalInstanceContext(context);
		else
			return context.newLocalContext();
	}

	private Context newInstanceCheckContext(Context context) throws SyntaxError {
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
			throw new InvalidDataError("Not an instance !");
		context = context.newInstanceContext((ConcreteInstance)value);
		return context.newChildContext();
	}

	private Context newLocalInstanceContext(Context context) throws SyntaxError {
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
