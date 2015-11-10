package prompto.store.solr;

import org.apache.solr.common.SolrDocument;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStored;
import prompto.value.IValue;

public class StoredDocument extends BaseDocument implements IStored {

	SolrDocument document;
	
	public IValue getValue(Context context, Identifier name) {
		Object data = getData(name.getName());
		return translate(context, name, data);
	}

	@Override
	public Object getData(String name) {
		return document.getFieldValue(name);
	}

}
