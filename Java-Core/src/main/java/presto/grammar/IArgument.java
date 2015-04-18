package presto.grammar;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.DefaultExpression;
import presto.expression.IExpression;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.utils.CodeWriter;
import presto.value.IValue;


public interface IArgument extends INamed {
	
	String getSignature(Dialect dialect);
	String getProto(Context context) throws SyntaxError;
	void register(Context context) throws SyntaxError;
	void check(Context context) throws SyntaxError;
	IValue checkValue(Context context,IExpression value) throws PrestoError;
	void toDialect(CodeWriter writer);
	DefaultExpression getDefaultExpression();
	boolean setMutable(boolean set);
	boolean isMutable();
	
}
