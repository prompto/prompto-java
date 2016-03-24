package prompto.type;

import java.lang.reflect.Type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoSet;
import prompto.runtime.Context;


public class SetType extends ContainerType {

	public SetType(IType itemType) {
		super(Family.SET, itemType, itemType.getTypeName()+"<>");
	}
	
	@Override
	public Type getJavaType() {
		return PromptoSet.class;
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof SetType) && itemType.isAssignableTo(context, ((SetType)other).getItemType());
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

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof ContainerType) {
			IType itemType = ((ContainerType)other).getItemType();
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
	public IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError {
		return BooleanType.instance();
	}
	

}
