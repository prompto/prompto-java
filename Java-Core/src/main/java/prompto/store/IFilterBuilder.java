package prompto.store;

import prompto.grammar.EqOp;
import prompto.value.IValue;

public interface IFilterBuilder {

	void push(String name, EqOp operator, IValue interpret);

}
