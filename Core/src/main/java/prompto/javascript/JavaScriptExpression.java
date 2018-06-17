package prompto.javascript;

import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;



public interface JavaScriptExpression {

	void toDialect(CodeWriter writer);
	void transpile(Transpiler transpiler);
	default void transpileRoot(Transpiler transpiler) {
		throw new UnsupportedOperationException("transpileRoot " + this.getClass().getName());
	}
	
}
