package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.CodeType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.CodeValue;
import presto.value.IValue;

public class CodeExpression implements IExpression {

	IExpression expression;
	
	public CodeExpression(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("Code: ");
			expression.toDialect(writer);
			break;
		case O:
		case S:
			writer.append("Code(");
			expression.toDialect(writer);
			writer.append(")");
			break;
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return CodeType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return new CodeValue(this);
	}
	
	// expression can only be checked and evaluated in the context of an execute:

	public IType checkCode(Context context) throws SyntaxError {
		return expression.check(context);
	}

	public IValue interpretCode(Context context) throws PrestoError {
		return expression.interpret(context);
	}
	
}
