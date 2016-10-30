package prompto.store.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;

import prompto.store.AttributeInfo;
import prompto.store.IQueryBuilder;

public class SOLRQueryBuilder implements IQueryBuilder {

	SolrQuery query;
	SOLRFilterBuilder filter;
	
	public SOLRQueryBuilder() {
		query = new SolrQuery();
		query.setRows(Integer.MAX_VALUE);
	}
	
	@Override
	public SOLRQuery build() {
		if(filter!=null) {
			query.setQuery(filter.toSolrQuery());
			filter = null;
		} else if(query.getQuery()==null)
			query.setQuery("*:*");
		return new SOLRQuery(query);
	}

	@Override
	public <T> void verify(AttributeInfo info, MatchOp match, T fieldValue) {
		if(filter==null)
			filter = new SOLRFilterBuilder();
		SOLRAttributeInfo solrInfo = new SOLRAttributeInfo(info);
		filter.push(solrInfo, match, fieldValue);
	}

	
	@Override
	public void and() {
		filter.and();
	}

	@Override
	public void or() {
		filter.or();
	}

	@Override
	public void not() {
		filter.not();
	}

	@Override
	public void setFirst(Long first) {
		if(first!=null)
			query.setStart(first.intValue() - 1);
	}

	@Override
	public void setLast(Long end) {
		if(end!=null) {
			Integer start = query.getStart();
			if(start==null)
				start = 1;
			else
				start += 1; // was 0 based
			query.setRows((int)((end - start)+1));
		}
	}

	public void setRows(int rows) {
		query.setRows(rows);
	}
	
	@Override
	public void addOrderByClause(AttributeInfo attribute, boolean descending) {
		SOLRAttributeInfo solrAttribute = new SOLRAttributeInfo(attribute);
		query.addSort(solrAttribute.getFieldNameForOrderBy(), descending ? ORDER.desc : ORDER.asc);
	}


}
