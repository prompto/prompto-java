package prompto.store;

public class QueryFactory implements IQueryFactory {

	@Override
	public IQuery newQuery() {
		return new Query();
	}
}
