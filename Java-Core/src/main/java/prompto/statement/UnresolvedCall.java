package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ConstructorExpression;
import prompto.expression.IAssertion;
import prompto.expression.IExpression;
import prompto.expression.MemberSelector;
import prompto.expression.MethodSelector;
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class UnresolvedCall extends SimpleStatement implements IAssertion {
	
	IExpression resolved;
	IExpression caller;
	ArgumentAssignmentList assignments;
	
	public UnresolvedCall(IExpression caller, ArgumentAssignmentList assignments) {
		this.caller = caller;
		this.assignments = assignments;
	}
	
	public IExpression getCaller() {
		return caller;
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolve(writer.getContext());
			resolved.toDialect(writer);
		} catch(SyntaxError error) {
			caller.toDialect(writer);
			if(assignments!=null)
				assignments.toDialect(writer);
		}
	}
	
	@Override
	public IType check(Context context) {
		return resolveAndCheck(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		resolveAndCheck(context);
		return resolved.interpret(context);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context);
		return resolved.compile(context, method, flags);
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		if(resolved==null)
			resolveAndCheck(context);
		if(resolved instanceof IAssertion)
			return ((IAssertion)resolved).interpretAssert(context, test);
		else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			resolved.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		if(resolved==null)
			resolveAndCheck(context);
		if(resolved instanceof IAssertion)
			((IAssertion)resolved).compileAssert(context, method, flags, test);
		else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			resolved.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	private IType resolveAndCheck(Context context) {
		resolve(context);
		return resolved.check(context);
	}
	
	
	private void resolve(Context context) {
		if(resolved!=null)
			return;
		if(caller instanceof UnresolvedIdentifier)
			resolved = resolveUnresolvedIdentifier(context);
		else if(caller instanceof MemberSelector)
			resolved = resolveMember(context);
	}
	
	private IExpression resolveUnresolvedIdentifier(Context context) {
		Identifier id = ((UnresolvedIdentifier)caller).getId();
		IDeclaration decl = null;
		// if this happens in the context of a member method, then we need to check for category members first
		if(context.getParentContext() instanceof InstanceContext) {
			decl = resolveUnresolvedMember((InstanceContext)context.getParentContext(), id);
			if(decl!=null)
				return new MethodCall(new MethodSelector(id), assignments);
		}
		decl = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(decl==null)
			context.getProblemListener().reportUnknownIdentifier(id.toString(), id);
		if(decl instanceof CategoryDeclaration)
			return new ConstructorExpression(new CategoryType(id), assignments);
		else
			return new MethodCall(new MethodSelector(id), assignments);
	}

	private IDeclaration resolveUnresolvedMember(InstanceContext context, Identifier name) {
		ConcreteCategoryDeclaration decl = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, context.getInstanceType().getTypeNameId());
		MethodDeclarationMap methods = decl.getMemberMethods(context, name);
		if(methods!=null && methods.size()>0)
			return methods;
		else
			return null;
	}

	private IExpression resolveMember(Context context) {
		IExpression parent = ((MemberSelector)caller).getParent();
		Identifier id = ((MemberSelector)caller).getId();
		return new MethodCall(new MethodSelector(parent, id), assignments);
	}

}