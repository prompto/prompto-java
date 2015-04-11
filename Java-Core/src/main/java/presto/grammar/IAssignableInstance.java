package presto.grammar;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.IValue;

public interface IAssignableInstance {

	void checkAssignValue(Context context, IExpression expression) throws SyntaxError;
	void checkAssignMember(Context context, Identifier name) throws SyntaxError;
	void checkAssignElement(Context context) throws SyntaxError;
	void assign(Context context, IExpression expression) throws PrestoError;
	IValue interpret(Context context) throws PrestoError;
	void toDialect(CodeWriter writer);

}
