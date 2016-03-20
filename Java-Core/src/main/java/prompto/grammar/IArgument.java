package prompto.grammar;

import java.lang.reflect.Type;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.DefaultExpression;
import prompto.expression.IExpression;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public interface IArgument extends INamed {
	
	String getSignature(Dialect dialect);
	String getProto();
	void register(Context context) throws SyntaxError;
	void check(Context context) throws SyntaxError;
	IValue checkValue(Context context,IExpression value) throws PromptoError;
	void toDialect(CodeWriter writer);
	DefaultExpression getDefaultExpression();
	boolean setMutable(boolean set);
	boolean isMutable();
	Type getJavaType(Context context);
	
}
