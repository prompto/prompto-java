package presto.expression;

import java.util.Collection;

import presto.declaration.ConcreteCategoryDeclaration;
import presto.declaration.IMethodDeclaration;
import presto.error.InvalidDataError;
import presto.error.NullReferenceError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.UnresolvedIdentifier;
import presto.runtime.Context;
import presto.runtime.Context.MethodDeclarationMap;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.ConcreteInstance;
import presto.value.NullValue;
import presto.value.TypeValue;


public class MethodSelector extends MemberSelector implements IMethodSelector {

	public MethodSelector(String name) {
		super(name);
	}

	public MethodSelector(IExpression parent, String name) {
		super(parent,name);
	}
	
	@Override
	public String toString() {
		return parent==null ? name : super.toString();
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
		MethodDeclarationMap actual = context.getRegisteredDeclaration(MethodDeclarationMap.class, name);
		if(actual==null)
			throw new SyntaxError("Unknown method: \"" + name + "\"");
		return actual.values();
	}
	
	private Collection<IMethodDeclaration> getCategoryCandidates(Context context) throws SyntaxError {
		IType parentType = checkParent(context);
		if(!(parentType instanceof CategoryType))
			throw new SyntaxError(parent.toString() + " is not a category");
		ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, parentType.getName());
		if(cd==null)
			throw new SyntaxError("Unknown category:" + parentType.getName());
		return cd.findMemberMethods(context, name);
	}

	public Context newLocalContext(Context context) throws PrestoError {
		if(parent==null)
			return context.newLocalContext();
		else
			return newInstanceContext(context);
	}

	public Context newLocalCheckContext(Context context) throws SyntaxError {
		if(parent==null)
			return context.newLocalContext();
		else
			return newInstanceCheckContext(context);
	}

	private Context newInstanceCheckContext(Context context) throws SyntaxError {
		IType type = parent.check(context);
		if(!(type instanceof CategoryType))
			throw new SyntaxError("Not an instance !");
		context = context.newInstanceContext(type);
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

	public IExpression toInstanceExpression() {
		if(parent==null)
			return new UnresolvedIdentifier(name);
		else
			return new MemberSelector(parent, name);
	}



}
