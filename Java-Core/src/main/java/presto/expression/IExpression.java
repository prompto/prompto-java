package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

/* an IExpression is the result of parsing a piece of Presto code
 * every expression requires to be checked for syntax verification purpose
 * it also needs to be interpreted at runtime, which result in a value
 * and must also support translation into any dialect
 */
public interface IExpression {
	
	IType check(Context context) throws SyntaxError;
	IValue interpret(Context context) throws PrestoError;
	void toDialect(CodeWriter writer);
	
}
