package prompto.store.solr;

import java.util.UUID;

import org.apache.solr.common.SolrDocument;

import prompto.error.PromptoError;
import prompto.store.IStore;
import prompto.store.IStored;

public class StoredDocument extends BaseDocument implements IStored {

	BaseSOLRStore store;
	SolrDocument document;
	
	public StoredDocument(BaseSOLRStore store, SolrDocument document) {
		this.store = store;
		this.document = document;
	}

	
	@Override
	public UUID getDbId() {
		Object dbId = document.getFieldValue(IStore.dbIdName);
		if(dbId==null)
			return null;
		else
			return UUID.fromString(dbId.toString());
	}

	@Override
	public Object getData(String fieldName) throws PromptoError {
		Object data = document.getFieldValue(fieldName);
		return store.readFieldData(fieldName, data);
	}

}
