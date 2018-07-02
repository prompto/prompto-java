package prompto.jsx;

import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.JsxType;
import prompto.utils.CodeWriter;

public class JsxCode implements IJsxExpression {

	IExpression expression;
	
	public JsxCode(IExpression expression) {
		this.expression = expression;
	}
	
	
	@Override
	public IType check(Context context) {
		expression.check(context);
		return JsxType.instance();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("{");
		expression.toDialect(writer);
		writer.append("}");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		this.expression.declare(transpiler);
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		this.expression.transpile(transpiler);
		return false;
	}

}
