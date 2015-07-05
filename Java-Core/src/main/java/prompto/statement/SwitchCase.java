package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

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

	public abstract boolean matches(Context context, IValue value) throws PromptoError;

	public IValue interpret(Context context) throws PromptoError {
		return statements.interpret(context);
	}

	public abstract void caseToEDialect(CodeWriter writer);
	public abstract void caseToODialect(CodeWriter writer);
	public abstract void caseToPDialect(CodeWriter writer);
	public abstract void catchToEDialect(CodeWriter writer);
	public abstract void catchToODialect(CodeWriter writer);
	public abstract void catchToPDialect(CodeWriter writer);


}
