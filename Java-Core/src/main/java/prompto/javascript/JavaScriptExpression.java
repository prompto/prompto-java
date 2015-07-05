package prompto.javascript;

import prompto.utils.CodeWriter;



public interface JavaScriptExpression {

	void toDialect(CodeWriter writer);
	
}
