package presto.type;

import presto.error.SyntaxError;
import presto.runtime.Context;


public class AnyType extends NativeType { 

	static AnyType instance = new AnyType();
	
	public static AnyType instance() {
		return instance;
	}
	
	private AnyType() {
		super("any");
	}

	@Override
	public Class<?> toJavaClass() {
		return Object.class;
	}
	
	@Override
	public IType checkItem(Context context, IType itemType) throws SyntaxError {
		return AnyType.instance(); // needed to support lists in Documents
	}
	
	@Override
	public IType checkMember(Context context, String name) throws SyntaxError {
		return AnyType.instance(); // needed to support members in Documents
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof AnyType);
	}
	
}
