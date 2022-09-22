package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.runtime.Context;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;

public interface IPredicate extends IExpression {

	void checkQuery(Context context) throws PromptoError;
	void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError;
	default void compileQuery(Context context, MethodInfo method, Flags flags) {
		System.err.println("Need to implement compileQuery for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}
	void declareQuery(Transpiler transpiler);
	void transpileQuery(Transpiler transpiler, String builderName);

}
