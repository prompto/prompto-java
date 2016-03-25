package prompto.store.solr;

import java.util.Arrays;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;

import prompto.runtime.Context;
import prompto.store.IQuery;

public class SOLRQuery implements IQuery {

	Context context;
	SolrQuery query = new SolrQuery();
	SOLRFilterBuilder filter;
	
	public SOLRQuery(Context context) {
		this.context = context;
	}

	public SolrQuery getQuery() {
		if(filter!=null) {
			query.setQuery(filter.toSolrQuery());
			filter = null;
		}
		return query;
	}

	@Override
	public <T> void verify(String fieldName, MatchOp match, T fieldValue) {
		if(filter==null)
			filter = new SOLRFilterBuilder(context);
		TextFieldFlags flags = computeFieldFlags(fieldName);
		filter.push(fieldName, match, fieldValue, flags);
	}

	
	private TextFieldFlags computeFieldFlags(String fieldName) {
		if("category".equals(fieldName))
			return new TextFieldFlags(Arrays.asList("key"));
		else
			return TextFieldFlags.computeFieldFlags(context, fieldName);
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
		query.setStart(first.intValue() - 1);
	}

	@Override
	public void setLast(Long end) {
		Integer start = query.getStart();
		if(start==null)
			start = 1;
		else
			start += 1; // was 0 based
		query.setRows((int)((end - start)+1));
	}

	public void setRows(int rows) {
		query.setRows(rows);
	}
	
	@Override
	public Long getFirst() {
		Integer start = query.getStart();
		return start==null ? null : start.longValue() + 1;
	}

	@Override
	public Long getLast() {
		Integer rows = query.getRows();
		if(rows==null)
			return null;
		Integer start = query.getStart();
		if(start==null)
			start = 1;
		else
			start += 1; // was 0 based
		return start==null ? rows.longValue() : (1 + rows.longValue() - start.longValue());
	}

	@Override
	public void addOrderByClause(String fieldName, boolean descending) {
		query.addSort(fieldName, descending ? ORDER.desc : ORDER.asc);
	}


}
