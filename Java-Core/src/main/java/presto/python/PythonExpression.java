package presto.python;

import presto.utils.CodeWriter;



public interface PythonExpression {

	void toDialect(CodeWriter writer);
	
}
