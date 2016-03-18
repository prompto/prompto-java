package prompto.type;

import java.lang.reflect.Type;

import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;


public class AnyType extends NativeType { 

	static AnyType instance = new AnyType();
	
	public static AnyType instance() {
		return instance;
	}
	
	private AnyType() {
		super("any");
	}

	@Override
	public Type toJavaType() {
		return Object.class;
	}
	
	@Override
	public IType checkItem(Context context, IType itemType) throws SyntaxError {
		return AnyType.instance(); // needed to support lists in Documents
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) throws SyntaxError {
		return AnyType.instance(); // needed to support members in Documents
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof AnyType);
	}
	
}
