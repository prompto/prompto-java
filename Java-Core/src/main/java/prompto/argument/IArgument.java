package prompto.argument;

import java.lang.reflect.Type;

import prompto.error.PromptoError;
import prompto.expression.DefaultExpression;
import prompto.expression.IExpression;
import prompto.grammar.INamed;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public interface IArgument extends INamed {
	
	String getSignature(Dialect dialect);
	String getProto();
	void register(Context context);
	void check(Context context);
	IValue checkValue(Context context,IExpression value) throws PromptoError;
	void toDialect(CodeWriter writer);
	DefaultExpression getDefaultExpression();
	boolean setMutable(boolean set);
	boolean isMutable();
	Type getJavaType(Context context);
	
}
