package presto.type;

import presto.declaration.IDeclaration;
import presto.declaration.IEnumeratedDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.value.IValue;

public class EnumeratedNativeType extends BaseType {

	NativeType derivedFrom;

	public EnumeratedNativeType(String name, NativeType derivedFrom) {
		super(name);
		this.derivedFrom = derivedFrom;
	}

	public NativeType getDerivedFrom() {
		return derivedFrom;
	}

	@Override
	public Class<?> toJavaClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkUnique(Context context) throws SyntaxError {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkExists(Context context) throws SyntaxError {
		// TODO Auto-generated method stub

	}

	@Override
	public IType checkMember(Context context, String name) throws SyntaxError {
		if ("symbols".equals(name))
			return new ListType(derivedFrom);
		else if ("value".equals(name))
			return this;
		else if ("name".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, name);
	}
	
	@Override
	public IValue getMember(Context context, String name) throws PrestoError {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, this.name);
		if(!(decl instanceof IEnumeratedDeclaration))
			throw new SyntaxError(name + " is not an enumerated type!");
		if ("symbols".equals(name))
			return ((IEnumeratedDeclaration)decl).getSymbols();
		else
			throw new SyntaxError("Unknown member:" + name);
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		// TODO Auto-generated method stub
		return false;
	}

}
