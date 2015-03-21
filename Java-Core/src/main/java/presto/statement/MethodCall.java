package presto.statement;

import presto.declaration.AbstractMethodDeclaration;
import presto.declaration.ClosureDeclaration;
import presto.declaration.ConcreteMethodDeclaration;
import presto.declaration.IMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.expression.MethodSelector;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.runtime.MethodFinder;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;
import presto.value.ClosureValue;

public class MethodCall extends SimpleStatement {

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
		Context local = method.newLocalCheckContext(context);
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
				local.setValue(assignment.getName(), value);
			}
			return declaration.check(local);
		} catch (PrestoError e) {
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
	public IValue interpret(Context context) throws PrestoError {
		IMethodDeclaration declaration = findDeclaration(context);
		Context local = method.newLocalContext(context);
		declaration.registerArguments(local);
		ArgumentAssignmentList assignments = makeAssignments(context, declaration);
		for (ArgumentAssignment assignment : assignments) {
			IExpression expression = assignment.resolve(local, declaration, true);
			IValue value = assignment.getArgument().checkValue(context, expression);
			local.setValue(assignment.getName(), value);
		}
		return declaration.interpret(local);
	}

	private IMethodDeclaration findDeclaration(Context context) throws SyntaxError {
		try {
			Object o = context.getValue(method.getName());
			if (o instanceof ClosureValue)
				return new ClosureDeclaration((ClosureValue)o);
		} catch (PrestoError e) {
		}
		MethodFinder finder = new MethodFinder(context, this);
		return finder.findMethod(true);
	}

}
