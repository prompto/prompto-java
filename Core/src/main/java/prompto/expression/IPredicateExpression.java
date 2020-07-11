package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;
import prompto.type.IType;

public interface IPredicateExpression extends IExpression, ISection {

	IType checkQuery(Context context) throws PromptoError;
	void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError;
	default void compileQuery(Context context, MethodInfo method, Flags flags) {
		System.err.println("Need to implement compileQuery for " + this.getClass().getName());
		throw new UnsupportedOperationException();
	}

}
