package prompto.type;

import java.util.List;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;

public class ListType extends CollectionType {
	
	public ListType(IType itemType) {
		super(itemType.getName()+"[]", itemType);
	}
	
	@Override
	public Class<?> toJavaClass() {
		return List.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof ListType) && itemType.isAssignableTo(context, ((ListType)other).getItemType());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof ListType))
			return false;
		ListType other = (ListType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof CollectionType) {
			IType itemType = ((CollectionType)other).getItemType();
			if((other instanceof ListType || other instanceof SetType) 
					&& this.getItemType().equals(itemType))
				return this;
		} 
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkItem(Context context, IType other) throws SyntaxError {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other);
	}
	
	@Override
	public IType checkSlice(Context context) throws SyntaxError {
		return this;
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError {
		return BooleanType.instance();
	}
	
	@Override
	public IType checkIterator(Context context) throws SyntaxError {
		return itemType;
	}

	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
        if ("length".equals(name))
            return IntegerType.instance();
        else
    		return super.checkMember(context, id);
   }


}
