package prompto.store;

import prompto.grammar.EqOp;
import prompto.runtime.Context;

public interface IFilterBuilder {

	<T> void push(Context context, String fieldName, EqOp operator, T fieldValue);
	void and();
}
