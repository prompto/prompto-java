package prompto.store.solr;

import java.io.IOException;
import java.util.Map;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;


public class RemoteSOLRStore extends BaseSOLRStore {
	
	@Override
	public QueryResponse query(ModifiableSolrParams params) throws SolrServerException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void addDocument(SolrInputDocument doc) throws SolrServerException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void commit() throws SolrServerException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addField(String fieldName, String fieldType, Map<String, Object> options) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getFieldType(String fieldName) {
		// TODO Auto-generated method stub
		return null;
	}

}
