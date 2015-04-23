package presto.expression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import presto.declaration.ConcreteCategoryDeclaration;
import presto.declaration.IMethodDeclaration;
import presto.error.InvalidDataError;
import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.grammar.UnresolvedIdentifier;
import presto.runtime.Context;
import presto.runtime.Context.InstanceContext;
import presto.runtime.Context.MethodDeclarationMap;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.ConcreteInstance;
import presto.value.NullValue;
import presto.value.TypeValue;


public class MethodSelector extends MemberSelector implements IMethodSelector {

	public MethodSelector(Identifier name) {
		super(name);
	}

	public MethodSelector(IExpression parent, Identifier name) {
		super(parent,name);
	}
	
	@Override
	public String toString() {
		return parent==null ? name.toString() : super.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(parent==null)
			writer.append(name);
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
			ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, type.getName());
			if(cd!=null) {
				MethodDeclarationMap members = cd.getMemberMethods(context, name);
				if(members!=null)
					methods.addAll(members.values());
			}
		}
		MethodDeclarationMap globals = context.getRegisteredDeclaration(MethodDeclarationMap.class, name);
		if(globals!=null)
			methods.addAll(globals.values());
		return methods;
	}
	
	private Collection<IMethodDeclaration> getCategoryCandidates(Context context) throws SyntaxError {
		IType parentType = checkParent(context);
		if(!(parentType instanceof CategoryType))
			throw new SyntaxError(parent.toString() + " is not a category");
		ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, parentType.getName());
		if(cd==null)
			throw new SyntaxError("Unknown category:" + parentType.getName());
		return cd.getMemberMethods(context, name).values();
	}

	public Context newLocalContext(Context context, IMethodDeclaration declaration) throws PrestoError {
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
		context = context.newInstanceContext((CategoryType)type);
		return context.newChildContext();
	}

	private Context newInstanceContext(Context context) throws PrestoError {
		Object value = parent.interpret(context);
		if(value==null || value==NullValue.instance())
			throw new NullReferenceError();
		if(value instanceof TypeValue && ((TypeValue)value).getValue() instanceof CategoryType)
			value = context.loadSingleton((CategoryType)((TypeValue)value).getValue());
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
			return new UnresolvedIdentifier(name);
		else
			return new MemberSelector(parent, name);
	}



}
