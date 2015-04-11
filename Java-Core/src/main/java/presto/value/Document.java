package presto.value;

import java.util.HashMap;
import java.util.Map;

import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.type.DocumentType;


public class Document extends BaseValue
{
	Map<Identifier,IValue> members = new HashMap<Identifier,IValue>();
	
	public Document() {
		super(DocumentType.instance());
	}
	
    @Override
    public IValue getMember(Context context, Identifier name)
    {
        IValue result = members.get(name);
        if(result== null)
        {
            result = new Document();
            members.put(name, result);
        }
        return result;
    }


    public void SetMember(Identifier name, IValue value)
    {
    	members.put(name, value);
    }
}
