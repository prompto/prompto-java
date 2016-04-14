package prompto.store.solr;

import prompto.store.IQuery;
import prompto.store.IQueryFactory;

public class SOLRQueryFactory implements IQueryFactory {

	@Override
	public IQuery newQuery() {
		return new SOLRQuery();
	}
}
