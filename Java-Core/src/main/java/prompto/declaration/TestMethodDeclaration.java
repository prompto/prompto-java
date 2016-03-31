package prompto.declaration;

import java.io.PrintStream;
import java.lang.reflect.Modifier;

import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldConstant;
import prompto.compiler.Flags;
import prompto.compiler.IInstructionListener;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.error.ExecutionError;
import prompto.error.PromptoError;
import prompto.expression.SymbolExpression;
import prompto.grammar.Identifier;
import prompto.parser.Assertion;
import prompto.runtime.Context;
import prompto.statement.IStatement;
import prompto.statement.StatementList;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.AssertionList;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;

public class TestMethodDeclaration extends BaseDeclaration {

	StatementList statements;
	AssertionList assertions;
	SymbolExpression error;
	
	public TestMethodDeclaration(Identifier name, StatementList stmts, AssertionList exps, SymbolExpression error) {
		super(name);
		this.statements = stmts;
		this.assertions = exps;
		this.error = error;
	}
	
	@Override
	public Type getDeclarationType() {
		return Type.TEST;
	}
	
	public StatementList getStatements() {
		return statements;
	}
	
	public AssertionList getAssertions() {
		return assertions;
	}
	
	@Override
	public IType check(Context context) {
		context = context.newLocalContext();
		for(IStatement statement : statements)
			checkStatement(context, statement);
		if(assertions!=null) {
			for(Assertion assertion : assertions)
				assertion.check(context);
		}
		return VoidType.instance();
	}
	
	private void checkStatement(Context context, IStatement statement) {
		IType type = statement.check(context);
		if(type!=VoidType.instance())
			context.getProblemListener().reportIllegalReturn(statement);
	}

	@Override
	public void register(Context context) {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType getType(Context context) {
		return VoidType.instance();
	}

	public void interpret(Context context) throws PromptoError {
		if(interpretBody(context)) {
			interpretError(context);
			interpretAsserts(context);
		}
	}

	private void interpretError(Context context) {
		// we land here only if no error was raised
		if(error!=null)
			printFailure(context, error.getName().toString(), "no error");
	}

	private void interpretAsserts(Context context) throws PromptoError {
		if(assertions==null)
			return;
		context.enterMethod(this);
		try {
			boolean success = true;
			for(Assertion assertion : assertions)
				success &= assertion.interpret(context, this);
			if(success)
				printSuccess(context);
		} finally {
			context.leaveMethod(this);
		}
	}

	public void printFailure(Context context, String expected, String actual) {
		String message = buildFailureMessagePrefix(expected);
		System.out.println(message + actual);
	}

	public String buildFailureMessagePrefix(String expected) {
		return getName() + " test failed, expected: " + expected + ", actual: ";
	}

	private void printSuccess(Context context) {
		System.out.println(buildSuccessMessage());
	}

	public String buildSuccessMessage() {
		return getName() + " test successful";
	}

	private boolean interpretBody(Context context) throws PromptoError {
		context.enterMethod(this);
		try {
			statements.interpret(context);
			return true;
		} catch(ExecutionError e) {
			interpretError(context, e);
			// no more to execute
			return false;
		} finally {
			context.leaveMethod(this);
		}
	}

	private void interpretError(Context context, ExecutionError e) throws PromptoError {
		IValue actual = e.interpret(context, new Identifier("__test_error__"));
		IValue expectedError = error==null ? null : error.interpret(context);
		if(expectedError!=null && expectedError.equals(actual))
			printSuccess(context);
		else {
			String actualName = ((IInstance)actual).getMember(context, new Identifier("name"), false).toString();
			String expectedName = error==null ? "SUCCESS" : error.getName().toString();
			printFailure(context, expectedName, actualName);
		}
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.isGlobalContext())
			writer = writer.newLocalWriter();
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	
	protected void toSDialect(CodeWriter writer) {
		writer.append("def test ");
		writer.append(getName());
		writer.append(" ():\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("verifying:");
		if(error!=null) {
			writer.append(" ");
			error.toDialect(writer);
			writer.append("\n");
		} else {
			writer.append("\n");
			writer.indent();
			assertions.toDialect(writer);
			writer.dedent();
		}
	}

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" as test method doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("and verifying");
		if(error!=null) {
			writer.append(" ");
			error.toDialect(writer);
			writer.append("\n");
		} else {
			writer.append(":\n");
			writer.indent();
			assertions.toDialect(writer);
			writer.dedent();
		}
	}
	
	protected void toODialect(CodeWriter writer) {
		writer.append("test method ");
		writer.append(getName());
		writer.append(" () {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("} verifying ");
		if(error!=null) {
			error.toDialect(writer);
			writer.append(";\n");
		} else {
			writer.append("{\n");
			writer.indent();
			assertions.toDialect(writer);
			writer.dedent();
			writer.append("}\n");
		}
	}

	public ClassFile compile(Context context, String fullName) {
		java.lang.reflect.Type type = CompilerUtils.abstractTypeFrom(fullName);
		ClassFile classFile = new ClassFile(type);
		classFile.addModifier(Modifier.ABSTRACT);
		Descriptor.Method proto = new Descriptor.Method(void.class);
		MethodInfo method = classFile.newMethod("run", proto);
		method.addModifier(Modifier.STATIC);
		if(error!=null)
			compileTestWithError(context, method, new Flags());
		else
			compileTestNoError(context, method, new Flags());
		return classFile;
	}

	private void compileTestNoError(Context context, MethodInfo method, Flags flags) {
		// don't use statements.compile because we need the locals for the assertions
		statements.forEach((s)->
			s.compile(context, method, flags));
		method.addInstruction(Opcode.ICONST_0); // failures counter
		assertions.forEach((a)->
			a.compile(context, method, flags, this));
		compileCheckSuccess(context, method, flags);
		method.addInstruction(Opcode.RETURN);
	}

	private void compileCheckSuccess(Context context, MethodInfo method, Flags flags) {
		IInstructionListener finalListener = method.addOffsetListener(new OffsetListenerConstant());
		method.activateOffsetListener(finalListener);
		method.addInstruction(Opcode.IFNE, finalListener); // 0 = no failures
		StackState finalState = method.captureStackState();
		compileSuccess(context, method, flags);
		// final
		method.restoreFullStackState(finalState);
		method.placeLabel(finalState);
		method.inhibitOffsetListener(finalListener);
		
	}

	public void compileSuccess(Context context, MethodInfo method, Flags flags) {
		String message = buildSuccessMessage();
		method.addInstruction(Opcode.LDC, new StringConstant(message));
		compilePrintResult(context, method, flags);
	}

	private void compileTestWithError(Context context, MethodInfo method, Flags flags) {
		throw new UnsupportedOperationException(); // TODO for now
	}

	public void compileFailure(Context context, MethodInfo method, Flags flags) {
		compilePrintResult(context, method, flags);
	}
	
	public void compilePrintResult(Context context, MethodInfo method, Flags flags) {
		// the message is on top of the stack
		FieldConstant fc = new FieldConstant(System.class, "out", PrintStream.class);
		method.addInstruction(Opcode.GETSTATIC, fc);
		method.addInstruction(Opcode.SWAP);
		MethodConstant mc = new MethodConstant(PrintStream.class, "println", String.class, void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, mc);
	}


}
