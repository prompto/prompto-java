package prompto.javascript;

import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class JavaScriptThisExpression implements JavaScriptExpression {
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("this");
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("this");
	}
}
