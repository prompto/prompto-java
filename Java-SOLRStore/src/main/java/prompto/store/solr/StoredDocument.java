package prompto.store.solr;

import org.apache.solr.common.SolrDocument;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.value.IValue;

public class StoredDocument extends BaseDocument implements IStored {

	BaseSOLRStore store;
	SolrDocument document;
	
	public StoredDocument(BaseSOLRStore store, SolrDocument document) {
		this.store = store;
		this.document = document;
	}

	
	@Override
	public IValue getDbId() {
		Object dbId = document.getFieldValue(IStore.dbIdName);
		if(dbId==null)
			return null;
		else
			return new prompto.value.UUID(String.valueOf(dbId));
	}

	@Override
	public IValue getValue(Identifier id) throws PromptoError {
		Object data = getData(id.getName());
		if(data==null)
			return null;
		else
			return store.readData(id.getName(), data);
	}

	@Override
	public Object getData(String name) {
		return document.getFieldValue(name);
	}

}
