package prompto.store.solr;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient.RemoteSolrException;
import org.apache.solr.client.solrj.request.CoreAdminRequest;
import org.apache.solr.client.solrj.request.schema.SchemaRequest;
import org.apache.solr.client.solrj.response.CoreAdminResponse;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.schema.SchemaResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.CoreAdminParams.CoreAdminAction;

import prompto.error.InternalError;
import prompto.error.PromptoError;
import prompto.store.IStore;
import prompto.store.IStoreFactory.Type;
import prompto.utils.StringUtils;


public class RemoteSOLRStore extends BaseSOLRStore {
	
	SolrClient client;
	String coreName;
	int commitDelay = 15000; // ms
	
	public RemoteSOLRStore(String protocol, String host, int port, Type type) {
		this(protocol, host, port, StringUtils.capitalizeFirst(type.name()) + "Store");
	}

	public RemoteSOLRStore(String protocol, String host, int port, String coreName) {
		String baseURL =  protocol + "://" + host + ":" + port + "/solr/";
		this.client = new HttpSolrClient(baseURL);
		this.coreName = coreName;
	}

	@Override
	public void setCommitDelay(int commitDelay) throws SolrServerException {
		this.commitDelay = commitDelay;
	}
	
	@Override
	public void createCoreIfRequired() throws SolrServerException, IOException {
		if(!coreExists())
			createCore();
	}
	
	@Override
	public void dropCoreIfExists() throws SolrServerException, IOException {
		if(coreExists())
			CoreAdminRequest.unloadCore(coreName, true, true, client);
	}
	
	private void createCore() throws SolrServerException, IOException {
		CoreAdminRequest.Create create = new CoreAdminRequest.Create();
		create.setCoreName(coreName);
		create.setConfigSet(coreName);
		create.process(client);
	}

	private boolean coreExists() throws SolrServerException, IOException {
		CoreAdminRequest request = new CoreAdminRequest();
		request.setAction(CoreAdminAction.STATUS);
		CoreAdminResponse response = request.process(client);
		return response.getCoreStatus(coreName)!=null;
	}

	@Override
	public void delete(Collection<?> dbIds) throws PromptoError {
		try {
			for(Object dbId : dbIds)
				client.deleteById(coreName, String.valueOf(dbId), commitDelay);
		} catch(IOException | SolrServerException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public void deleteAll() throws PromptoError {
		try {
			client.deleteByQuery(coreName, "*:*", commitDelay);
		} catch(IOException | SolrServerException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public QueryResponse query(SolrQuery query) throws SolrServerException, IOException {
		return client.query(coreName, query);
	}
	
	@Override
	public void addDocuments(Collection<SolrInputDocument> docs) throws SolrServerException, IOException {
		client.add(coreName, docs, commitDelay);
	}
	
	@Override
	public void dropDocuments(List<String> dbIds) throws SolrServerException, IOException {
		client.deleteById(coreName, dbIds, commitDelay);
	}
	
	@Override
	public void flush() throws PromptoError {
		try {
			client.commit(coreName);
		} catch(SolrServerException | IOException e) {
			throw new InternalError(e);
		}
	}

	@Override
	public boolean hasField(String fieldName) throws SolrServerException, IOException {
		try {
			SchemaRequest.Field getField = new SchemaRequest.Field(fieldName);
			SchemaResponse.FieldResponse response = getField.process(client, coreName);
		    Map<String, Object> field = response.getField();
			if(field!=null && fieldName.equals(field.get("name")))
				return true;
		} catch(RemoteSolrException e) {
			if(e.code()==HttpStatus.SC_NOT_FOUND)
				return false;
			else
				throw e;
		}
		if(fieldName.contains("-"))
			return false;
		return hasField(fieldName + "-key") || hasField(fieldName + "-value") || hasField(fieldName + "-words");
	}
	
	@Override
	public void addField(String fieldName, String fieldType, Map<String, Object> options) throws SolrServerException, IOException {
		Map<String, Object> props = new HashMap<>(options);
		props.put("name", fieldName);
		props.put("type", fieldType);
		SchemaRequest.AddField addField = new SchemaRequest.AddField(props);
		addField.process(client, coreName);
	}
	
	@Override
	public void addCopyField(String fieldName, String fieldType, Map<String, Object> options, String sourceName) throws SolrServerException, IOException {
		Map<String, Object> props = new HashMap<>(options);
		props.put("name", fieldName);
		props.put("type", fieldType);
		SchemaRequest.AddField addField = new SchemaRequest.AddField(props);
		addField.process(client, coreName);
		SchemaRequest.AddCopyField copyField = new SchemaRequest.AddCopyField(sourceName, Arrays.asList(fieldName));
		copyField.process(client, coreName);
	}
	
	@Override
	public String getFieldType(String fieldName) throws SolrServerException, IOException {
		SchemaRequest.Field getField = new SchemaRequest.Field(fieldName);
		SchemaResponse.FieldResponse response = getField.process(client, coreName);
	    Map<String, Object> field = response.getField();
	    String type = String.valueOf(field.get("type"));
	    Boolean multi = (Boolean)field.getOrDefault("multiValued", false);
		return type + (multi ? "[]" : "");
	}
	
	@Override
	public void dropField(String fieldName) throws SolrServerException, IOException {
		SchemaRequest.DeleteField dropField = new SchemaRequest.DeleteField(fieldName);
		dropField.process(client, coreName);
	}
	
	public void dropUserFields() throws SolrServerException, IOException {
		SchemaRequest.Fields getFields = new SchemaRequest.Fields();
		SchemaResponse.FieldsResponse response = getFields.process(client, coreName);
		for(Map<String, Object> field : response.getFields()) {
			String name = String.valueOf(field.get("name"));
			if(IStore.dbIdName.equals(name) || "_version_".equals(name))
				continue;
			dropField(name);
		}
		
	}

}
