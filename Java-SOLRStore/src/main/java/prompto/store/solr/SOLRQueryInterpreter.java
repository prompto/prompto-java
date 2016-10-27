package prompto.store.solr;

import prompto.runtime.Context;
import prompto.store.IQuery;
import prompto.store.QueryInterpreterBase;

public class SOLRQueryInterpreter extends QueryInterpreterBase {

	public SOLRQueryInterpreter(Context context) {
		super(context);
	}
	
	@Override
	public IQuery newQuery() {
		return new SOLRQuery();
	}

}
