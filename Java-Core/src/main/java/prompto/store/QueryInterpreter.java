package prompto.store;

import prompto.runtime.Context;

public class QueryInterpreter extends QueryInterpreterBase {

	public QueryInterpreter(Context context) {
		super(context);
	}

	@Override
	public IQuery newQuery() {
		return new Query();
	}
}
