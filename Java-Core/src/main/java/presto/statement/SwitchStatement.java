package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class SwitchStatement extends BaseSwitchStatement {

	IExpression expression;
	
	public SwitchStatement(IExpression expression) {
		super();
		this.expression = expression;
	}

	public SwitchStatement(IExpression expression, SwitchCaseList switchCases, StatementList defaultCase) {
		super(switchCases, defaultCase);
		this.expression = expression;
	}

	@Override
	protected void toODialect(CodeWriter writer) {
		writer.append("switch(");
		expression.toDialect(writer);
		writer.append(") {\n");
		for(SwitchCase sc : switchCases)
			sc.caseToODialect(writer);
		if(defaultCase!=null) {
			writer.append("default:\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
		}
		writer.append("}\n");
	}

	@Override
	protected void toEDialect(CodeWriter writer) {
		writer.append("switch on ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		for(SwitchCase sc : switchCases)
			sc.caseToEDialect(writer);
		if(defaultCase!=null) {
			writer.append("otherwise:\n");
			writer.indent();
			defaultCase.toDialect(writer);
			writer.dedent();
		}
		writer.dedent();
	}

	@Override
	protected void toPDialect(CodeWriter writer) {
		toEDialect(writer);
	}

	@Override
	IType checkSwitchType(Context context) throws SyntaxError {
		return expression.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue switchValue = expression.interpret(context);
		return evaluateSwitch(context,switchValue,null);
	}
}
