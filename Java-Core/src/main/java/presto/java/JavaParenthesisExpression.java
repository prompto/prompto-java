package presto.java;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;



public class JavaParenthesisExpression implements JavaExpression {

	JavaExpression expression;
	
	public JavaParenthesisExpression(JavaExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append('(');
		expression.toDialect(writer);
		writer.append(')');
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression.check(context);
	}
	
	@Override
	public Object interpret(Context context) throws PrestoError {
		return expression.interpret(context);
	}

}
