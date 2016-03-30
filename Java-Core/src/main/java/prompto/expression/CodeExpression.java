package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.CodeType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.CodeValue;
import prompto.value.IValue;

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
	public IType check(Context context) {
		return CodeType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new CodeValue(this);
	}
	
	// expression can only be checked and evaluated in the context of an execute:

	public IType checkCode(Context context) {
		return expression.check(context);
	}

	public IValue interpretCode(Context context) throws PromptoError {
		return expression.interpret(context);
	}
	
}
