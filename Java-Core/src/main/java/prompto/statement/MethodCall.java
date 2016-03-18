package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.declaration.AbstractMethodDeclaration;
import prompto.declaration.ClosureDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IAssertion;
import prompto.expression.IExpression;
import prompto.expression.MethodSelector;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.IArgument;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.MethodFinder;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.ClosureValue;
import prompto.value.IValue;

public class MethodCall extends SimpleStatement implements IAssertion {

	MethodSelector method;
	ArgumentAssignmentList assignments;

	public MethodCall(MethodSelector method) {
		this.method = method;
	}

	public MethodCall(MethodSelector method, ArgumentAssignmentList assignments) {
		this.method = method;
		this.assignments = assignments;
	}

	public MethodSelector getMethod() {
		return method;
	}

	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if (requiresInvoke(writer))
			writer.append("invoke: ");
		method.toDialect(writer);
		if (assignments != null)
			assignments.toDialect(writer);
		else if (writer.getDialect() != Dialect.E)
			writer.append("()");
	}

	private boolean requiresInvoke(CodeWriter writer) {
		if (writer.getDialect() != Dialect.E)
			return false;
		if (assignments != null && assignments.size() > 0)
			return false;
		try {
			MethodFinder finder = new MethodFinder(writer.getContext(), this);
			IMethodDeclaration declaration = finder.findMethod(false);
			/* if method is abstract, need to prefix with invoke */
			if(declaration instanceof AbstractMethodDeclaration)
				return true;
		} catch(SyntaxError e) {
			// ok
		}
		return false;
	}

	@Override
	public String toString() {
		return method.toString()
				+ (assignments != null ? assignments.toString() : "");
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration declaration = finder.findMethod(false);
		Context local = method.newLocalCheckContext(context, declaration);
		return check(declaration, context, local);
	}

	private IType check(IMethodDeclaration declaration, Context parent, Context local) throws SyntaxError {
		if (declaration instanceof ConcreteMethodDeclaration
				&& ((ConcreteMethodDeclaration) declaration).mustBeBeCheckedInCallContext(parent))
			return fullCheck((ConcreteMethodDeclaration) declaration, parent, local);
		else
			return lightCheck(declaration, parent, local);
	}

	private IType lightCheck(IMethodDeclaration declaration, Context parent, Context local) throws SyntaxError {
		declaration.registerArguments(local);
		return declaration.check(local);
	}

	private IType fullCheck(ConcreteMethodDeclaration declaration, Context parent, Context local) throws SyntaxError {
		try {
			ArgumentAssignmentList assignments = makeAssignments(parent, declaration);
			declaration.registerArguments(local);
			for (ArgumentAssignment assignment : assignments) {
				IExpression expression = assignment.resolve(local, declaration, true);
				IValue value = assignment.getArgument().checkValue(parent, expression);
				local.setValue(assignment.getId(), value);
			}
			return declaration.check(local);
		} catch (PromptoError e) {
			throw new SyntaxError(e.getMessage());
		}
	}

	public ArgumentAssignmentList makeAssignments(Context context, IMethodDeclaration declaration) throws SyntaxError {
		if (assignments == null)
			return new ArgumentAssignmentList();
		else
			return assignments.makeAssignments(context, declaration);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		// push arguments on the stack
		if(assignments!=null) for(ArgumentAssignment assign : assignments)
			assign.compile(context, method, flags);
		// find method to call and compile the call
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration declaration = finder.findMethod(false);
		Context local = this.method.newLocalCheckContext(context, declaration);
		declaration.registerArguments(local);
		return this.method.compile(local, method, declaration, flags);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IMethodDeclaration declaration = findDeclaration(context);
		// if called from within a member method without 
		Context local = method.newLocalContext(context, declaration);
		declaration.registerArguments(local);
		registerAssignments(context, local, declaration);
		return declaration.interpret(local);
	}

	private void registerAssignments(Context context, Context local, IMethodDeclaration declaration) throws PromptoError {
		ArgumentAssignmentList assignments = makeAssignments(context, declaration);
		for (ArgumentAssignment assignment : assignments) {
			IExpression expression = assignment.resolve(local, declaration, true);
			IArgument argument = assignment.getArgument();
			IValue value = argument.checkValue(context, expression);
			if(value!=null && argument.isMutable() & !value.isMutable()) 
				throw new NotMutableError();
			local.setValue(assignment.getId(), value);
		}
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration testMethodDeclaration) throws PromptoError {
		IValue value = this.interpret(context);
		if(value instanceof Boolean)
			return ((Boolean)value).getValue();
		else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			this.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	private IMethodDeclaration findDeclaration(Context context) throws SyntaxError {
		try {
			Object o = context.getValue(method.getId());
			if (o instanceof ClosureValue)
				return new ClosureDeclaration((ClosureValue)o);
		} catch (PromptoError e) {
		}
		MethodFinder finder = new MethodFinder(context, this);
		return finder.findMethod(true);
	}

}
