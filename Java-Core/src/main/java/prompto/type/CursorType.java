package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.Cursor;

public class CursorType extends IterableType {
	
	public CursorType(IType itemType) {
		super(Family.CURSOR, itemType, "Cursor<" + itemType.getTypeName()+">");
	}
	
	@Override
	public Type getJavaType(Context context) {
		return Cursor.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				(other instanceof CursorType) && 
				itemType.isAssignableFrom(context, ((CursorType)other).getItemType());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(!(obj instanceof CursorType))
			return false;
		CursorType other = (CursorType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
        if ("length".equals(name))
            return IntegerType.instance();
        else
    		return super.checkMember(context, id);
   }


}
