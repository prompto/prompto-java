package prompto.value;

import prompto.error.PromptoError;
import prompto.expression.CodeExpression;
import prompto.runtime.Context;
import prompto.type.CodeType;
import prompto.type.IType;

public class CodeValue extends BaseValue {

	CodeExpression expression;
	
	public CodeValue(CodeExpression expression) {
		super(CodeType.instance());
		this.expression = expression;
	}

	public IType check(Context context) {
		return expression.checkCode(context);
	}

	public IValue interpret(Context context) throws PromptoError {
		return expression.interpretCode(context);
	}
}
