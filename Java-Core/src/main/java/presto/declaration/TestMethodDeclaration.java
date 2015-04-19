package presto.declaration;

import presto.error.ExecutionError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.SymbolExpression;
import presto.grammar.Identifier;
import presto.parser.Assertion;
import presto.parser.IProblemListener;
import presto.runtime.Context;
import presto.statement.IStatement;
import presto.statement.StatementList;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.AssertionList;
import presto.utils.CodeWriter;
import presto.value.IInstance;
import presto.value.IValue;

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
	
	public StatementList getStatements() {
		return statements;
	}
	
	public AssertionList getAssertions() {
		return assertions;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		context = context.newLocalContext();
		for(IStatement statement : statements)
			checkStatement(context, statement);
		if(assertions!=null) {
			for(Assertion assertion : assertions)
				assertion.check(context);
		}
		return VoidType.instance();
	}
	
	private void checkStatement(Context context, IStatement statement) throws SyntaxError {
		IType type = statement.check(context);
		if(type!=VoidType.instance()) {
			IProblemListener pl = context.getProblemListener();
			if(pl!=null)
				pl.reportIllegalReturn(statement);
			else
				throw new SyntaxError("Illegal return statement in test method!");
		}
	}

	@Override
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return VoidType.instance();
	}

	public void interpret(Context context) throws PrestoError {
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

	private void interpretAsserts(Context context) throws PrestoError {
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
		System.out.println(getName() + " test failed, expected: " + expected + ", actual: " + actual);
	}

	private void printSuccess(Context context) {
		System.out.println(getName() + " test successful");
	}

	private boolean interpretBody(Context context) throws PrestoError {
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

	private void interpretError(Context context, ExecutionError e) throws PrestoError {
		IValue actual = e.interpret(context, new Identifier("__test_error__"));
		IValue expectedError = error==null ? null : error.interpret(context);
		if(expectedError!=null && expectedError.equals(actual))
			printSuccess(context);
		else {
			String actualName = ((IInstance)actual).getMember(context, new Identifier("name")).toString();
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
			toPDialect(writer);
			break;
		}
	}
	
	protected void toPDialect(CodeWriter writer) {
		writer.append("def test ");
		writer.append(getName());
		writer.append(" ():\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("expecting:");
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
		writer.append(" as: test method doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("and expecting:");
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
	
	protected void toODialect(CodeWriter writer) {
		writer.append("test method ");
		writer.append(getName());
		writer.append(" () {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("} expecting ");
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
}
