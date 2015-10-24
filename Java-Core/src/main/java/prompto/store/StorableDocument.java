package prompto.store;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.Document;
import prompto.value.IValue;

public class StorableDocument implements IStorable {

	Document document = null;
	
	@Override
	public void setDirty(boolean set) {
		if(!set)
			document = null;
		else if(document==null)
			document = new Document();
	}

	@Override
	public boolean isDirty() {
		return document!=null;
	}

	@Override
	public Document asDocument() {
		return document;
	}

	public void setMember(Context context, Identifier name, IValue value) {
		if(document==null)
			document = new Document();
		if(value instanceof IStorable)
			value = ((IStorable)value).asDocument();
		document.setMember(context, name, value);
	}

}
