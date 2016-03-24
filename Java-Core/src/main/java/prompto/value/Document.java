package prompto.value;

import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.runtime.Context;
import prompto.type.DocumentType;

public class Document extends BaseValue {
	
	PromptoDocument<Identifier,IValue> members = new PromptoDocument<Identifier,IValue>();
	
	public Document() {
		super(DocumentType.instance());
	}
	
	@Override
	public PromptoDocument<Identifier,IValue> getStorableData() {
		return members;
	}
	
	@Override
	public boolean isMutable() {
		return true;
	}
	
    @Override
    public IValue getMember(Context context, Identifier name, boolean autoCreate) {
    	return getMember(name, autoCreate);
 	}

    public IValue getMember(Identifier name, boolean autoCreate) {
        IValue result = members.get(name);
        if(autoCreate && result==null) {
            result = new Document();
            members.put(name, result);
        }
        return result;
 	}

	@Override
    public void setMember(Context context, Identifier name, IValue value) {
    	members.put(name, value);
    }

   public void setMember(Identifier name, IValue value) {
    	members.put(name, value);
    }
	
	public boolean hasMember(Identifier name) {
		return members.containsKey(name);
	}
	
	@Override
	public String toString() {
		return members.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Document)
			return members.equals(((Document)obj).members);
		else
			return false;
	}
}
