package prompto.store.solr;

import org.apache.solr.client.solrj.SolrQuery;

import prompto.store.IQuery;

/* a simple wrapper to fit into the IStore API */
public class SOLRQuery implements IQuery {

	SolrQuery query;
	
	public SOLRQuery(SolrQuery query) {
		this.query = query;
	}

	public SolrQuery getQuery() {
		return query;
	}

}
