package presto.statement;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.CollectionType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.ListValue;


public class CollectionSwitchCase extends SwitchCase {

	public CollectionSwitchCase(IExpression expression, StatementList list) {
		super(expression,list);
	}

	@Override
	public void checkSwitchType(Context context, IType type) throws SyntaxError {
		IType thisType = expression.check(context);
		if(thisType instanceof CollectionType)
			thisType = ((CollectionType)thisType).getItemType();
		if(!thisType.isAssignableTo(context, type))
			throw new SyntaxError("Cannot assign:" + thisType.getName() + " to:" + type.getName());
	}
	
	@Override
	public boolean matches(Context context, IValue value) throws PrestoError {
		Object thisValue = expression.interpret(context);
		if(thisValue instanceof ICollection)
			return ((ICollection<?>)thisValue).hasItem(context, value);
		else if(thisValue instanceof ListValue)
			return ((ListValue)thisValue).hasItem(context, value);
		return false;
	}
	
	@Override
	public void caseToPDialect(CodeWriter writer) {
		caseToEDialect(writer);
	}
	
	@Override
	public void caseToODialect(CodeWriter writer) {
		writer.append("case in ");
		expression.toDialect(writer);
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	public void caseToEDialect(CodeWriter writer) {
		writer.append("when in ");
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
	public void catchToPDialect(CodeWriter writer) {
		writer.append("except in ");
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
