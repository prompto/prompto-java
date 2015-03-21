package presto.java;


import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;


public interface JavaExpression {
	
	IType check(Context context) throws SyntaxError;
	Object interpret(Context context) throws PrestoError;
	void toDialect(CodeWriter writer);
	
}
