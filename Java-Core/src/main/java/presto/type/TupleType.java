package presto.type;

import presto.error.SyntaxError;
import presto.runtime.Context;

public class TupleType extends CollectionType {

	static TupleType instance = new TupleType();
	
	public static TupleType instance() {
		return instance;
	}
	
	private TupleType() {
		super("Tuple", AnyType.instance());
	}

	@Override
	public Class<?> toJavaClass() {
		return null; // no equivalent
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof TupleType) || (other instanceof AnyType);
	}

	@Override
	public IType checkItem(Context context, IType other) throws SyntaxError {
		if(other==IntegerType.instance())
			return AnyType.instance();
		else
			return super.checkItem(context,other);
	}
	

	@Override
	public IType checkMember(Context context, String name) throws SyntaxError {
        if ("length".equals(name))
            return IntegerType.instance();
        else
            return super.checkMember(context, name);
}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if(other instanceof TupleType || other instanceof ListType || other instanceof SetType)
			return this; 
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkContains(Context context, IType other) throws SyntaxError {
		return BooleanType.instance(); 
	}
	
	@Override
	public IType checkContainsAllOrAny(Context context, IType other) throws SyntaxError {
		return BooleanType.instance(); 
	}
	
}
