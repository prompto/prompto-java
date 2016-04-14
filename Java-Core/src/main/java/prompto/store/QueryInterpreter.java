package prompto.store;

import prompto.runtime.Context;

public class QueryInterpreter<T> extends QueryInterpreterBase<T> {

	public QueryInterpreter(Context context) {
		super(context);
	}

	@Override
	public IQuery newQuery() {
		return new Query();
	}
}
