package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.statement.IStatement;
import prompto.statement.ReturnStatement;
import prompto.statement.StatementList;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.IValue;

public class ArrowExpression extends Section implements IExpression {

	IdentifierList args;
	String argsSuite;
	String arrowSuite;
	StatementList statements;
	
	public ArrowExpression(IdentifierList args, String argsSuite, String arrowSuite) {
		this.args = args;
		this.argsSuite = argsSuite;
		this.arrowSuite = arrowSuite;
	}
	
	public IdentifierList getArgs() {
		return args;
	}

	@Override
	public IType check(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return this.statements.interpret(context);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		argsToDialect(writer);
		writer.append(argsSuite);
		writer.append("=>");
		writer.append(arrowSuite);
		bodyToDialect(writer);
	}

	private void bodyToDialect(CodeWriter writer) {
		if(statements.size()==1 && statements.getFirst() instanceof ReturnStatement)
			((ReturnStatement)statements.getFirst()).getExpression().toDialect(writer);
		else {
			writer.append("{").newLine().indent();
			statements.toDialect(writer);
			writer.newLine().dedent().append("}").newLine();
			
		}
	}

	private void argsToDialect(CodeWriter writer) {
		if(args==null || args.isEmpty())
			writer.append("()");
		else if(args.size()==1)
			writer.append(args.getFirst().toString());
		else {
			writer.append("(");
			args.toDialect(writer, false);
			writer.append(")");
		}
		
	}

	public void setExpression(IExpression expression) {
		IStatement stmt = new ReturnStatement(expression);
		this.statements = new StatementList(stmt);
	}
	
	public void setStatements(StatementList statements) {
		this.statements = statements;
	}

	public StatementList getStatements() {
		return statements;
	}

	public ResultInfo compileKey(Context context, MethodInfo method, Flags flags, Type paramType, String paramName) {
		throw new UnsupportedOperationException();
	}
	
}
