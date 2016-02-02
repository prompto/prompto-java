package prompto.store;

import prompto.grammar.EqOp;
import prompto.runtime.Context;
import prompto.value.IValue;

public interface IFilterBuilder {

	void push(Context context, String fieldName, EqOp operator, IValue fieldValue);
	void and();
}
