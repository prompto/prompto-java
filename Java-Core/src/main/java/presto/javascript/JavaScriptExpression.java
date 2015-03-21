package presto.javascript;

import presto.utils.CodeWriter;



public interface JavaScriptExpression {

	void toDialect(CodeWriter writer);
	
}
