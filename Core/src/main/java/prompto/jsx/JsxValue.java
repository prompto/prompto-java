package prompto.jsx;

import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;

public class JsxValue implements IJsxValue, IJsxExpression {

	IExpression expression;
	
	public JsxValue(IExpression expression) {
		this.expression = expression;
	}
	
	@Override
	public IType check(Context context) {
		return expression.check(context);
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("{");
		expression.toDialect(writer);
		writer.append("}");
	}

}
