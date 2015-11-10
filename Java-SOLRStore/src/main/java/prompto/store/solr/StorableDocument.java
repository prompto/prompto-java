package prompto.store.solr;

import org.apache.solr.common.SolrInputDocument;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.value.IValue;

public class StorableDocument extends BaseDocument implements IStorable {

	SolrInputDocument document = null;
	
	@Override
	public void setDirty(boolean set) {
		if(!set)
			document = null;
		else if(document==null)
			document = new SolrInputDocument();
	}

	@Override
	public boolean isDirty() {
		return document!=null;
	}

	@Override
	public void setValue(Context context, Identifier name, IValue value) {
		if(document==null)
			document = new SolrInputDocument();
		if(value==null)
			document.setField(name.getName(), null);
		else
			value.store(context, name.getName(), this);
	}
	
	@Override
	public void setData(String name, Object value) {
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
