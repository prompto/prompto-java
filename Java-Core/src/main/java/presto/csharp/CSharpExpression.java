package presto.csharp;

import presto.utils.CodeWriter;



public interface CSharpExpression {

	void toDialect(CodeWriter writer);
	
}
