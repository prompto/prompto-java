package presto.java;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.ThisExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;

public class JavaThisExpression implements JavaExpression {
	
	ThisExpression expression = new ThisExpression();
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression.check(context);
	}
	
	@Override
	public Object interpret(Context context) throws PrestoError {
		return expression.interpret(context);
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
