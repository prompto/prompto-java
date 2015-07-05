package prompto.expression;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

/* an IExpression is the result of parsing a piece of Prompto code
 * every expression requires to be checked for syntax verification purpose
 * it also needs to be interpreted at runtime, which result in a value
 * and must also support translation into any dialect
 */
public interface IExpression {
	
	IType check(Context context) throws SyntaxError;
	IValue interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer);
	
}
