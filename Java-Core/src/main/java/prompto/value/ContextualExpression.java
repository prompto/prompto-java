package prompto.value;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

/* a value which can only be determined when expression is interpreted in specific context */
public class ContextualExpression extends BaseValue implements IExpression {

	Context calling;
	IExpression expression;
	
	public ContextualExpression(Context calling, IExpression expression) {
		super(null); // TODO check that this is not a problem
		this.calling = calling;
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		return expression.check(this.calling);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return expression.interpret(this.calling);
	}

}
