package presto.value;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.CodeExpression;
import presto.runtime.Context;
import presto.type.CodeType;
import presto.type.IType;

public class CodeValue extends BaseValue {

	CodeExpression expression;
	
	public CodeValue(CodeExpression expression) {
		super(CodeType.instance());
		this.expression = expression;
	}

	public IType check(Context context) throws SyntaxError {
		return expression.checkCode(context);
	}

	public IValue interpret(Context context) throws PrestoError {
		return expression.interpretCode(context);
	}
}
