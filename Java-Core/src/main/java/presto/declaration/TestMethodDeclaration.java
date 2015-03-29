package presto.declaration;

import presto.error.ExecutionError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IAssertion;
import presto.expression.IExpression;
import presto.expression.SymbolExpression;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.utils.ExpressionList;
import presto.value.IInstance;
import presto.value.IValue;

public class TestMethodDeclaration extends BaseDeclaration {

	StatementList statements;
	ExpressionList assertions;
	SymbolExpression error;
	
	public TestMethodDeclaration(String name, StatementList stmts, ExpressionList exps, SymbolExpression error) {
		super(name);
		this.statements = stmts;
		this.assertions = exps;
		this.error = error;
	}
	
	public StatementList getStatements() {
		return statements;
	}
	
	public ExpressionList getAssertions() {
		return assertions;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO
		return VoidType.instance();
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
			printFailure(context, error.getName(), "no error");
	}

	private void interpretAsserts(Context context) throws PrestoError {
		if(assertions==null)
			return;
		context.enterMethod(this);
		try {
			boolean success = true;
			for(IExpression exp : assertions) {
				success &= ((IAssertion)exp).interpretAssert(context, this);
			}
			if(success)
				printSuccess(context);
		} finally {
			context.leaveMethod(this);
		}
	}

	public void printFailure(Context context, String expected, String actual) {
		System.out.print(this.name + " test failed, expected: " + expected + ", actual: " + actual);
	}

	private void printSuccess(Context context) {
		System.out.print(this.name + " test successful");
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
		IValue expected = error.interpret(context);
		IValue actual = e.interpret(context, "__test_error__");
		if(expected.equals(actual))
			printSuccess(context);
		else {
			String actualName = ((IInstance)actual).getMember(context, "name").toString();
			printFailure(context, error.getName(), actualName);
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
		case P:
			toPDialect(writer);
			break;
		}
	}
	
	protected void toPDialect(CodeWriter writer) {
		writer.append("def test ");
		writer.append(name);
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
			for(IExpression exp : assertions) {
				exp.toDialect(writer);
				writer.append("\n");
			}
			writer.dedent();
		}
	}

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(name);
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
			for(IExpression exp : assertions) {
				exp.toDialect(writer);
				writer.append("\n");
			}
			writer.dedent();
		}
	}
	
	protected void toODialect(CodeWriter writer) {
		writer.append("test method ");
		writer.append(name);
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
			for(IExpression exp : assertions) {
				exp.toDialect(writer);
				writer.append(";\n");
			}
			writer.dedent();
			writer.append("}\n");
		}
	}
}
