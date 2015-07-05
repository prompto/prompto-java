package prompto.type;

import prompto.error.SyntaxError;
import prompto.runtime.Context;

public class RangeType extends CollectionType {
	
	public RangeType(IType itemType) {
		super(itemType.getName()+"[..]",itemType);
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return this.equals(other);
	}

	@Override
	public Class<?> toJavaClass() {
		return null; // no equivalent
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof RangeType))
			return false;
		RangeType other = (RangeType)obj;
		return this.getItemType().equals(other.getItemType());
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
	public IType checkIterator(Context context) throws SyntaxError {
		return itemType;
	}

	
}
