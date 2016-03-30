package prompto.type;

import java.lang.reflect.Type;
import java.util.Iterator;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;

public class IteratorType extends IterableType {

	public IteratorType(IType itemType) {
		super(Family.ITERATOR, itemType, "Iterator<" + itemType.getTypeName()+">");
	}

	@Override
	public Type getJavaType() {
		return Iterator.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof IteratorType) && itemType.isAssignableTo(context, ((IteratorType)other).getItemType());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(!(obj instanceof IteratorType))
			return false;
		IteratorType other = (IteratorType)obj;
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
