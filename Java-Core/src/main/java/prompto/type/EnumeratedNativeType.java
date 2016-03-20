package prompto.type;

import java.lang.reflect.Type;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.IValue;

public class EnumeratedNativeType extends BaseType {

	NativeType derivedFrom;

	public EnumeratedNativeType(Identifier id, NativeType derivedFrom) {
		super(id);
		this.derivedFrom = derivedFrom;
	}

	public NativeType getDerivedFrom() {
		return derivedFrom;
	}

	@Override
	public Type getJavaType() {
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
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
		String name = id.toString();
		if ("symbols".equals(name))
			return new ListType(derivedFrom);
		else if ("value".equals(name))
			return this;
		else if ("name".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}
	
	@Override
	public IValue getMember(Context context, Identifier id) throws PromptoError {
		String name = id.toString();
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, this.id);
		if(!(decl instanceof IEnumeratedDeclaration))
			throw new SyntaxError(name + " is not an enumerated type!");
		if ("symbols".equals(name))
			return ((IEnumeratedDeclaration)decl).getSymbols();
		else
			throw new InvalidDataError("No such member:" + name);
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		throw new UnsupportedOperationException(); // TODO
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		throw new UnsupportedOperationException(); // TODO
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		try {
			EnumeratedNativeDeclaration decl = context.getRegisteredDeclaration(EnumeratedNativeDeclaration.class, this.getId());
			return decl.readJSONValue(context, value);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		} 
	}
}
