package prompto.type;

import java.lang.reflect.Type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDict;
import prompto.runtime.Context;

public class DictType extends ContainerType {
	
	public DictType(IType itemType) {
		super(itemType.getId()+"{}",itemType);
		this.itemType = itemType;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DictType) && itemType.isAssignableTo(context, ((DictType)other).getItemType());
	}

	@Override
	public Type getJavaType() {
		return PromptoDict.class;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof DictType))
			return false;
		DictType other = (DictType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof DictType 
			&& this.getItemType().equals(((DictType)other).getItemType()))
			return this;
		else
			return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkContains(Context context, IType other) throws SyntaxError {
		if(other==TextType.instance())
			return BooleanType.instance();
		else
			return super.checkContains(context, other);
	}
	
	@Override
	public IType checkItem(Context context, IType other) throws SyntaxError {
		if(other==TextType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkIterator(Context context) throws SyntaxError {
		return new EntryType(itemType);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
        if ("length".equals(name))
            return IntegerType.instance();
        else if("keys".equals(name))
            return new SetType(TextType.instance());
        else if ("values".equals(name))
            return new ListType(getItemType());
        else
        	return super.checkMember(context, id);
	}
	

	
}
