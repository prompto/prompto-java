package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithCounts;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class CursorType extends IterableType {
	
	public CursorType(IType itemType) {
		super(Family.CURSOR, itemType, "Cursor<" + itemType.getTypeName()+">");
	}
	
	@Override
	public Type getJavaType(Context context) {
		return IterableWithCounts.class;
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
        if ("count".equals(name))
            return IntegerType.instance();
        else if ("totalCount".equals(name))
            return IntegerType.instance();
        else
    		return super.checkMember(context, id);
   }
	
	@Override
	public void declareMember(Transpiler transpiler, String name) {
	    if(!"count".equals(name) && !"totalCount".equals(name))
	        super.declareMember(transpiler, name);
	}

	@Override
	public void transpileMember(Transpiler transpiler, String name) {
	    if("count".equals(name) || "totalCount".equals(name))
	    	transpiler.append(name);
	    else
	    	super.transpileMember(transpiler, name);
	}

}
