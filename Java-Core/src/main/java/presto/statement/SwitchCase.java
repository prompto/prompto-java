package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.parser.ISection;
import presto.parser.Section;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public abstract class SwitchCase extends Section implements ISection {

	protected IExpression expression;
	StatementList statements;
	
	public SwitchCase(IExpression expression, StatementList statements) {
		this.expression = expression;
		this.statements = statements;
	}

	public abstract void checkSwitchType(Context context, IType type) throws SyntaxError;

	public IType checkReturnType(Context context) throws SyntaxError {
		return statements.check(context);
	}

	public abstract boolean matches(Context context, IValue value) throws PrestoError;

	public IValue interpret(Context context) throws PrestoError {
		return statements.interpret(context);
	}

	public abstract void caseToEDialect(CodeWriter writer);
	public abstract void caseToODialect(CodeWriter writer);
	public abstract void caseToPDialect(CodeWriter writer);
	public abstract void catchToEDialect(CodeWriter writer);
	public abstract void catchToODialect(CodeWriter writer);
	public abstract void catchToPDialect(CodeWriter writer);


}
