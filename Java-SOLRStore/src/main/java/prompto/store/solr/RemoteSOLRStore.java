package prompto.store.solr;

import java.io.IOException;
import java.util.Map;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;

import prompto.store.IStoreFactory.Type;


public class RemoteSOLRStore extends BaseSOLRStore {
	
	SolrClient client;
	
	public RemoteSOLRStore(Type type) {
	}

	@Override
	public QueryResponse query(SolrQuery query) throws SolrServerException, IOException {
		return client.query(query);
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
	public boolean hasField(String fieldName) {
		// TODO use REST api, see https://wiki.apache.org/solr/SchemaRESTAPI
		throw new UnsupportedOperationException();
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
