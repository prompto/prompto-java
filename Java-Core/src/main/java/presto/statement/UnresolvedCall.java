package presto.statement;

import presto.declaration.CategoryDeclaration;
import presto.declaration.IDeclaration;
import presto.declaration.TestMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.ConstructorExpression;
import presto.expression.IAssertion;
import presto.expression.IExpression;
import presto.expression.MemberSelector;
import presto.expression.MethodSelector;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.Identifier;
import presto.grammar.UnresolvedIdentifier;
import presto.runtime.Context;
import presto.type.CategoryType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

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
	public IType check(Context context) throws SyntaxError {
		return resolveAndCheck(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		if(resolved==null)
			resolveAndCheck(context);
		return resolved.interpret(context);
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration testMethodDeclaration) throws PrestoError {
		if(resolved==null)
			resolveAndCheck(context);
		if(resolved instanceof IAssertion)
			return ((IAssertion)resolved).interpretAssert(context, testMethodDeclaration);
		else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			resolved.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	private IType resolveAndCheck(Context context) throws SyntaxError {
		resolve(context);
		return resolved.check(context);
	}
	
	
	private void resolve(Context context) throws SyntaxError {
		if(resolved!=null)
			return;
		if(caller instanceof UnresolvedIdentifier)
			resolveUnresolvedIdentifier(context);
		else
			resolveMember(context);
	}
	
	private void resolveUnresolvedIdentifier(Context context) throws SyntaxError {
		Identifier name = ((UnresolvedIdentifier)caller).getName();
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, name);
		if(decl==null)
			throw new SyntaxError("Unknown name:" + name);
		if(decl instanceof CategoryDeclaration)
			resolved = new ConstructorExpression(new CategoryType(name), assignments);
		else
			resolved = new MethodCall(new MethodSelector(name), assignments);
	}

	private void resolveMember(Context context) throws SyntaxError {
		IExpression parent = ((MemberSelector)caller).getParent();
		Identifier name = ((MemberSelector)caller).getName();
		resolved = new MethodCall(new MethodSelector(parent, name), assignments);
	}

}