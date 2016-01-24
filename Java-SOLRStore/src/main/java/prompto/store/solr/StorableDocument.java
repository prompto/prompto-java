package prompto.store.solr;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.SolrInputField;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.value.Binary;
import prompto.value.IValue;

public class StorableDocument extends BaseDocument implements IStorable {

	SolrInputDocument document = null;
	List<String> categories;
	
	public StorableDocument(List<String> categories) {
		this.categories = categories;
	}

	@Override
	public IValue getDbId(boolean create) {
		SolrInputField dbIdField = document==null? null : document.getField("dbId");
		UUID dbId = dbIdField==null ? null : (UUID)dbIdField.getValue();
		if(dbId==null && create) {
			if(document==null)
				document = newDocument();
			dbId = java.util.UUID.randomUUID();
			document.setField("dbId", dbId);
		}
		return dbId==null ? null : new prompto.value.UUID(dbId);
	}
	
	@Override
	public void setDirty(boolean set) {
		if(!set)
			document = null;
		else if(document==null)
			document = newDocument();
	}

	public SolrInputDocument getDocument() {
		return document;
	}
	
	private SolrInputDocument newDocument() {
		SolrInputDocument doc = new SolrInputDocument();
		if(categories!=null)
			doc.setField("category", categories);
		return doc;
	}

	@Override
	public boolean isDirty() {
		return document!=null;
	}

	@Override
	public void setValue(Context context, Identifier name, IValue value) throws PromptoError {
		if(document==null)
			document = newDocument();
		if(value==null)
			document.setField(name.getName(), null);
		else
			value.store(context, name.getName(), this);
	}
	
	@Override
	public void setData(String name, Object value) throws PromptoError {
		if(document==null)
			document = newDocument();
		if(value instanceof Binary) try {
			Binary binary = (Binary)value;
			value = new BinaryValue(binary.getMimeType(), binary.getData()).toByteArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
		if(value instanceof StorableDocument)
			value = ((StorableDocument)value).document;
		document.setField(name, value);
	}

	@Override
	public IValue getValue(Context context, Identifier name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object getData(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
