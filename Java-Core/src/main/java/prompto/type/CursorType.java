package prompto.type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.Cursor;

public class CursorType extends ContainerType {
	
	public CursorType(IType itemType) {
		super(itemType.getName()+"[]", itemType);
	}
	
	@Override
	public Class<?> toJavaClass() {
		return Cursor.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof CursorType) && itemType.isAssignableTo(context, ((CursorType)other).getItemType());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof CursorType))
			return false;
		CursorType other = (CursorType)obj;
		return this.getItemType().equals(other.getItemType());
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
