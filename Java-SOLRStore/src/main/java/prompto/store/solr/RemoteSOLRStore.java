package prompto.store.solr;

import java.io.IOException;
import java.util.Map;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;


public class RemoteSOLRStore extends BaseSOLRStore {
	
	SolrClient client;
	
	@Override
	public QueryResponse query(ModifiableSolrParams params) throws SolrServerException, IOException {
		return client.query(params);
	}
	
	@Override
	public void addDocument(SolrInputDocument doc) throws SolrServerException, IOException {
		client.add(doc);
	}
	
	@Override
	public void commit() throws SolrServerException, IOException {
		client.commit();
	}

	@Override
	public void addField(String fieldName, String fieldType, Map<String, Object> options) {
		// TODO use REST api, see https://wiki.apache.org/solr/SchemaRESTAPI
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String getFieldType(String fieldName) {
		// TODO use REST api, see https://wiki.apache.org/solr/SchemaRESTAPI
		throw new UnsupportedOperationException();
	}

}
