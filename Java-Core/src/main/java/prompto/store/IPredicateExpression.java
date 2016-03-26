package prompto.store;

import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;

public interface IPredicateExpression extends IExpression {

	void interpretQuery(Context context, IQuery query) throws PromptoError;

}
