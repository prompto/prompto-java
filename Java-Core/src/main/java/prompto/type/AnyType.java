package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.Identifier;
import prompto.runtime.Context;


public class AnyType extends NativeType { 

	static AnyType instance = new AnyType();
	
	public static AnyType instance() {
		return instance;
	}
	
	private AnyType() {
		super(Family.ANY);
	}

	@Override
	public String getTypeName() {
		return "any";
	}
	
	@Override
	public Type getJavaType(Context context) {
		return Object.class;
	}
	
	@Override
	public IType checkItem(Context context, IType itemType) {
		return AnyType.instance(); // needed to support lists in Documents
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		return AnyType.instance(); // needed to support members in Documents
	}

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return true;
	}
	
}
