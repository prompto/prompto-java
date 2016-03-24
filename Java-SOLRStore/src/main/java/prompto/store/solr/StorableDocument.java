package prompto.store.solr;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.SolrInputField;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.value.IValue;

public class StorableDocument extends BaseDocument implements IStorable {

	SolrInputDocument document = null;
	List<String> categories;
	boolean isUpdate; // partial updates require operations instead of values
	
	public StorableDocument(List<String> categories) {
		this.categories = categories;
	}

	@Override
	public IValue getOrCreateDbId() {
		UUID dbId = getNativeDbId();
		return dbId==null ? null : new prompto.value.UUID(dbId);
	}
	
	private UUID getNativeDbId() {
		ensureDocument(null);
		SolrInputField dbIdField = document.getField(IStore.dbIdName);
		if(dbIdField!=null)
			return (UUID)dbIdField.getValue();
		else
			return null;
	}

	@Override
	public void setDirty(boolean set) {
		if(!set) {
			document = null;
			isUpdate = false;
		} else 
			ensureDocument(null);
	}

	public SolrInputDocument getDocument() {
		return document;
	}
	
	private void ensureDocument(IDbIdProvider provider) {
		if(document==null) {
			UUID dbId = null;
			if(provider!=null) {
				// the only scenario where we get an existing dbId is when  
				// an instance passes a provider when calling setValue
				// in such a case, the scenario is an update scenario
				IValue dbIdValue = provider.getDbId();
				if(dbIdValue!=null) {
					dbId = ((prompto.value.UUID)dbIdValue).getStorableData();
					if(dbId!=null)
						this.isUpdate = true;
				}
			}
			if(dbId==null)
				dbId = java.util.UUID.randomUUID();
			document = new SolrInputDocument();
			document.setField(IStore.dbIdName, dbId);
			if(categories!=null && !this.isUpdate)
				document.setField("category", categories); 
		}
	}

	@Override
	public boolean isDirty() {
		return document!=null;
	}

	@Override
	public void setValue(Identifier id, IValue value, IDbIdProvider provider) throws PromptoError {
		ensureDocument(provider);
		setData(id.getName(), value.getStorableData());
	}
	
	@Override
	public void setData(String name, Object value) throws PromptoError {
		ensureDocument(null);
		if(value instanceof BinaryData)
			value = toBytes((BinaryData)value);
		if(isUpdate)
			document.setField(name, Collections.singletonMap("set", value));
		else
			document.setField(name, value);
	}

	private byte[] toBytes(BinaryData binary) throws PromptoError {
		try {
			return new BinaryData(binary.getMimeType(), binary.getData()).toByteArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

}
