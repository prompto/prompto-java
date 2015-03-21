package presto.value;

import java.util.HashMap;
import java.util.Map;

import presto.runtime.Context;
import presto.type.DocumentType;


public class Document extends BaseValue
{
	Map<String,IValue> members = new HashMap<String,IValue>();
	
	public Document() {
		super(DocumentType.instance());
	}
	
    @Override
    public IValue getMember(Context context, String name)
    {
        IValue result = members.get(name);
        if(result== null)
        {
            result = new Document();
            members.put(name, result);
        }
        return result;
    }


    public void SetMember(String name, IValue value)
    {
    	members.put(name, value);
    }
}
