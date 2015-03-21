package presto.value;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;

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
	public IType check(Context context) throws SyntaxError {
		return expression.check(this.calling);
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		return expression.interpret(this.calling);
	}

}
