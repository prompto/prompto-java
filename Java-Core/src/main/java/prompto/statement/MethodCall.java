package prompto.statement;

import java.util.Collection;

import prompto.argument.IArgument;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodConstant;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
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
			IMethodDeclaration declaration = finder.findBestMethod(false);
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
	public IType check(Context context) {
		MethodFinder finder = new MethodFinder(context, this);
		IMethodDeclaration declaration = finder.findBestMethod(false);
		Context local = method.newLocalCheckContext(context, declaration);
		return check(declaration, context, local);
	}

	private IType check(IMethodDeclaration declaration, Context parent, Context local) {
		if (declaration instanceof ConcreteMethodDeclaration
				&& ((ConcreteMethodDeclaration) declaration).mustBeBeCheckedInCallContext(parent))
			return fullCheck((ConcreteMethodDeclaration) declaration, parent, local);
		else
			return lightCheck(declaration, parent, local);
	}

	private IType lightCheck(IMethodDeclaration declaration, Context parent, Context local) {
		declaration.registerArguments(local);
		return declaration.check(local);
	}

	private IType fullCheck(ConcreteMethodDeclaration declaration, Context parent, Context local) {
		try {
			ArgumentAssignmentList assignments = makeAssignments(parent, declaration);
			declaration.registerArguments(local);
			for (ArgumentAssignment assignment : assignments) {
				IExpression expression = assignment.resolve(local, declaration, true);
				IValue value = assignment.getArgument().checkValue(parent, expression);
				local.setValue(assignment.getArgumentId(), value);
			}
			return declaration.check(local);
		} catch (PromptoError e) {
			throw new SyntaxError(e.getMessage());
		}
	}

	public ArgumentAssignmentList makeAssignments(Context context, IMethodDeclaration declaration) {
		if (assignments == null)
			return new ArgumentAssignmentList();
		else
			return assignments.resolveAndCheck(context, declaration);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		MethodFinder finder = new MethodFinder(context, this);
		Collection<IMethodDeclaration> declarations = finder.findCompatibleMethods(false);
		switch(declarations.size()) {
		case 0:
			throw new SyntaxError("No matching prototype for:" + this.toString()); 
		case 1:
			return compileExact(context, method, flags, declarations.iterator().next());
		default:
			return compileDynamic(context, method, flags, finder.findLessSpecific(declarations));
		}
	}
	
	private ResultInfo compileDynamic(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		Context local = this.method.newLocalCheckContext(context, declaration);
		declaration.registerArguments(local);
		ArgumentAssignmentList assignments = this.assignments!=null ? this.assignments : new ArgumentAssignmentList();
		return this.method.compileDynamic(local, method, flags, declaration, assignments);
	}

	private ResultInfo compileExact(Context context, MethodInfo method, Flags flags, IMethodDeclaration declaration) {
		Context local = this.method.newLocalCheckContext(context, declaration);
		declaration.registerArguments(local);
		ArgumentAssignmentList assignments = this.assignments!=null ? this.assignments : new ArgumentAssignmentList();
		return this.method.compileExact(local, method, flags, declaration, assignments);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IMethodDeclaration declaration = findDeclaration(context);
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
			local.setValue(assignment.getArgumentId(), value);
		}
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue value = this.interpret(context);
		if(value instanceof Boolean) {
			if(((Boolean)value).getValue())
				return true;
			else {
				String expected = buildExpectedMessage(context, test);
				String actual = value.toString();
				test.printFailure(context, expected, actual);
				return false;
			}
		} else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			this.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	private String buildExpectedMessage(Context context, TestMethodDeclaration test) {
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		return writer.toString();
	}

	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		StackState finalState = method.captureStackState();
		// compile
		ResultInfo info = this.compile(context, method, flags.withPrimitive(true));
		if(java.lang.Boolean.class==info.getType())
			CompilerUtils.BooleanToboolean(method);
		// 1 = success 
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.IFNE, finalListener); 
		// increment failure counter
		method.addInstruction(Opcode.ICONST_1);
		method.addInstruction(Opcode.IADD);
		// build failure message
		String message = buildExpectedMessage(context, test);
		message = test.buildFailureMessagePrefix(message);
		method.addInstruction(Opcode.LDC, new StringConstant(message));
		method.addInstruction(Opcode.LDC, new StringConstant(Boolean.FALSE.toString()));
		MethodConstant concat = new MethodConstant(String.class, "concat", String.class, String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, concat);
		test.compileFailure(context, method, flags);
		// success/final
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		method.inhibitOffsetListener(finalListener);
	}
	private IMethodDeclaration findDeclaration(Context context) {
		try {
			Object o = context.getValue(method.getId());
			if (o instanceof ClosureValue)
				return new ClosureDeclaration((ClosureValue)o);
		} catch (PromptoError e) {
		}
		MethodFinder finder = new MethodFinder(context, this);
		return finder.findBestMethod(true);
	}

}
