package prompto.store.solr;

import org.apache.solr.client.solrj.SolrQuery;

import prompto.store.IQuery;

public class SOLRQuery implements IQuery {

	SolrQuery query;
	
	public SOLRQuery(SolrQuery query) {
		this.query = query;
	}
	
	public SolrQuery getQuery() {
		return query;
	}

	public Long getFirst() {
		Integer start = query.getStart();
		return start==null ? null : start.longValue() + 1;
	}

	public Long getLast() {
		Integer rows = query.getRows();
		if(rows==null || rows.intValue()==Integer.MAX_VALUE)
			return null;
		Integer start = query.getStart();
		if(start==null)
			start = 1;
		else
			start += 1; // was 0 based
		return start==null ? rows.longValue() : (1 + rows.longValue() - start.longValue());
	}

}
