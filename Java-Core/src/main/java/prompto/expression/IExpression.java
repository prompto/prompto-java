package prompto.expression;

import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.store.IFilterBuilder;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

/* an IExpression is the result of parsing a piece of Prompto code
 * every expression requires :
 *  - to be checked for syntax verification purpose
 *  - to be interpreted at runtime, which results in a value
 * 	- to be translated into any dialect
 */
public interface IExpression {
	
	IType check(Context context) throws SyntaxError;
	IValue interpret(Context context) throws PromptoError;
	void toDialect(CodeWriter writer);

	default void toFilter(Context context, IFilterBuilder builder) throws PromptoError {
		throw new UnsupportedOperationException("toFilter not supported by " + this.getClass().getSimpleName());
	}
	
	default ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		System.err.println("Need to implement compile for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}
	

}
