package prompto.value;

import java.util.HashMap;
import java.util.Map;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.DocumentType;

public class Document extends BaseValue {
	
	Map<Identifier,IValue> members = new HashMap<Identifier,IValue>();
	
	public Document() {
		super(DocumentType.instance());
	}
	
	@Override
	public boolean isMutable() {
		return true;
	}
	
    @Override
    public IValue getMember(Context context, Identifier name, boolean autoCreate) {
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
