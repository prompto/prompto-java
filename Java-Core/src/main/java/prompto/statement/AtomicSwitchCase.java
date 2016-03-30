package prompto.statement;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public class AtomicSwitchCase extends SwitchCase {

	public AtomicSwitchCase(IExpression expression, StatementList list) {
		super(expression,list);
	}

	@Override
	public void checkSwitchType(Context context, IType type) {
		IType thisType = expression.check(context);
		if(!thisType.isAssignableTo(context, type))
			throw new SyntaxError("Cannot assign:" + thisType.getTypeName() + " to:" + type.getTypeName());
		
	}
	
	@Override
	public boolean matches(Context context,IValue value) throws PromptoError {
		Object thisValue = expression.interpret(context);
		return value.equals(thisValue);
	}
	
	@Override
	public void caseToPDialect(CodeWriter writer) {
		caseToEDialect(writer);
	}

	@Override
	public void caseToODialect(CodeWriter writer) {
		writer.append("case ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void catchToODialect(CodeWriter writer) {
		writer.append("catch (");
		expression.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("} ");
	}
	
	@Override
	public void caseToEDialect(CodeWriter writer) {
		writer.append("when ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void catchToPDialect(CodeWriter writer) {
		writer.append("except ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void catchToEDialect(CodeWriter writer) {
		caseToEDialect(writer); // no difference
	}
}
