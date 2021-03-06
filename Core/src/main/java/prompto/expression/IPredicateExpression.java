package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;

public interface IPredicateExpression extends IExpression, ICodeSection {

	void checkQuery(Context context) throws PromptoError;
	void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError;
	default void compileQuery(Context context, MethodInfo method, Flags flags) {
		System.err.println("Need to implement compileQuery for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}

}
