package prompto.type;

import java.lang.reflect.Type;
import java.util.List;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class EnumeratedNativeType extends BaseType {

	NativeType derivedFrom;
	Identifier typeNameId;
	
	public EnumeratedNativeType(Identifier typeNameId, NativeType derivedFrom) {
		super(Family.ENUMERATED);
		this.typeNameId = typeNameId;
		this.derivedFrom = derivedFrom;
	}

	@Override
	public String getTypeName() {
		return typeNameId.toString();
	}
	
	@Override
	public Identifier getTypeNameId() {
		return typeNameId;
	}
	
	public NativeType getDerivedFrom() {
		return derivedFrom;
	}

	@Override
	public Type getJavaType(Context context) {
		return CompilerUtils.getNativeEnumType(typeNameId);
	}

	@Override
	public void checkUnique(Context context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkExists(Context context) {
		// TODO Auto-generated method stub

	}

	@Override
	public IType checkMember(Context context, Identifier id) {
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
	public IValue getMember(Context context, Identifier id) {
		String name = id.toString();
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(!(decl instanceof IEnumeratedDeclaration))
			throw new SyntaxError(name + " is not an enumerated type!");
		if ("symbols".equals(name))
			return ((IEnumeratedDeclaration<?>)decl).getSymbols();
		else
			throw new SyntaxError("No such member:" + name);
	}
	
	@Override
	public ResultInfo compileGetMember(Context context, MethodInfo method,
			Flags flags, IExpression parent, Identifier id) {
		String name = id.toString();
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(!(decl instanceof IEnumeratedDeclaration))
			throw new SyntaxError(name + " is not an enumerated type!");
		if ("symbols".equals(name)) {
			ClassConstant cc = new ClassConstant(CompilerUtils.getNativeEnumType(typeNameId));
			FieldConstant fc = new FieldConstant(cc, "%symbols", List.class);
			method.addInstruction(Opcode.GETSTATIC, fc);
			return new ResultInfo(List.class);
		} else
			throw new SyntaxError("No such member:" + name);
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
			EnumeratedNativeDeclaration decl = context.getRegisteredDeclaration(EnumeratedNativeDeclaration.class, typeNameId);
			return decl.readJSONValue(context, value);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		} 
	}
}
