package prompto.store.solr;

import java.util.UUID;

import prompto.runtime.Context;
import prompto.store.IQuery;
import prompto.store.QueryInterpreterBase;

public class SOLRQueryInterpreter extends QueryInterpreterBase<UUID> {

	public SOLRQueryInterpreter(Context context) {
		super(context);
	}
	
	@Override
	public IQuery newQuery() {
		return new SOLRQuery();
	}

}
