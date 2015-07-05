package prompto.literal;

import java.util.HashMap;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.MissingType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.value.Dictionary;
import prompto.value.IValue;
import prompto.value.Text;


public class DictLiteral extends Literal<Dictionary> {

	// we can only compute keys by evaluating key expressions
	// so we can't just inherit from Map<String,Expression>. 
	// so we keep the full entry list.
	DictEntryList entries;
	IType itemType = null;
	
	public DictLiteral() {
		super("{}",new Dictionary(MissingType.instance()));
		this.entries = new DictEntryList();
	}
	
	public DictLiteral(DictEntryList entries) {
		super(entries.toString(),new Dictionary(MissingType.instance()));
		this.entries = entries;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		this.entries.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		if(itemType==null)
			itemType = inferElementType(context);
		return new DictType(itemType); 
	}
	
	// can't use Utils.inferElementType with list of DictEntry
	private IType inferElementType(Context context) throws SyntaxError {
		if(entries.isEmpty())
			return MissingType.instance();
		IType lastType = null;
		for(DictEntry e : entries) {
			IType keyType = e.getKey().check(context);
			if(keyType!=TextType.instance())
				throw new SyntaxError("Illegal key type: " + keyType.toString());
			IType elemType = e.getValue().check(context);
			if(lastType==null)
				lastType = elemType;
			else if(!lastType.equals(elemType)) { 
				if(elemType.isAssignableTo(context, lastType))
					; // lastType is less specific
				else if(lastType.isAssignableTo(context, elemType))
					lastType = elemType; // elemType is less specific
				else 
					throw new SyntaxError("Incompatible value types: " + elemType.toString() + " and " + lastType.toString());
			}
		}
		return lastType; 
	}	
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(value.isEmpty() && entries.size()>0) {
			check(context); // to compute itemType
			Map<Text,IValue> map = new HashMap<Text, IValue>();
			for(DictEntry e : entries) {
				Text key = (Text)e.getKey().interpret(context);
				IValue val = e.getValue().interpret(context); 
				map.put(key, val);
			}
			value = new Dictionary(itemType, map);
		}
		return value;
	}
	
}
