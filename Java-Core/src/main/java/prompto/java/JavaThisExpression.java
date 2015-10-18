package prompto.java;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ThisExpression;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public class JavaThisExpression extends Section implements JavaExpression {
	
	ThisExpression expression = new ThisExpression();
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression.check(context);
	}
	
	@Override
	public Object interpret(Context context) throws PromptoError {
		return expression.interpret(context);
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
}
