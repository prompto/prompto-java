package prompto.param;

import java.lang.reflect.Type;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.PromptoError;
import prompto.expression.DefaultExpression;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.INamedInstance;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;


public interface IParameter extends INamedInstance {
	
	Identifier getId();
	String getProto();
	String getSignature(Dialect dialect);
	void register(Context context);
	IType check(Context context);
	IValue checkValue(Context context, IExpression value) throws PromptoError;
	void toDialect(CodeWriter writer);
	DefaultExpression getDefaultExpression();
	boolean setMutable(boolean set);
	boolean isMutable();
	Type getJavaType(Context context);
	StackLocal registerLocal(Context context, MethodInfo method, Flags flags);
	default void extractLocal(Context context, MethodInfo method, Flags flags) {}
	ResultInfo compileParameter(Context context, MethodInfo method, Flags flags, ArgumentList assignments, boolean isFirst);
	default void declare(Transpiler transpiler) { throw new UnsupportedOperationException("declare " + this.getClass().getName()); }
	default void transpile(Transpiler transpiler) { throw new UnsupportedOperationException("transpile " + this.getClass().getName()); }
	default String getTranspiledName(Context context) { throw new UnsupportedOperationException("getTranspiledName " + this.getClass().getName()); }
	default void transpileCall(Transpiler transpiler, IExpression expression) { throw new UnsupportedOperationException("transpileCall " + this.getClass().getName()); }
	
}
