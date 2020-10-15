package prompto.type;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;

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
	public Set<IMethodDeclaration> getStaticMemberMethods(Context context, Identifier name) throws PromptoError {
		if(name.toString().equals("symbolOf"))
			return new HashSet<>(Collections.singletonList(SYMBOL_OF_METHOD));
		else
			return super.getStaticMemberMethods(context, name);
	}

	static IParameter NAME_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("name"));

	final IMethodDeclaration SYMBOL_OF_METHOD = new BuiltInMethodDeclaration("symbolOf", NAME_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
			if(!(decl instanceof IEnumeratedDeclaration))
				throw new SyntaxError(typeNameId + " is not an enumerated type!");
			String name = (String)context.getValue(new Identifier("name")).getStorableData();
			return ((IEnumeratedDeclaration<?>)decl).getSymbol(name);
		};
		
		@Override
		public IType check(Context context) {
			return EnumeratedNativeType.this;
		}

		@Override
		public void transpileCall(Transpiler transpiler, prompto.grammar.ArgumentList arguments) {
	      transpiler.append("symbolOf(");
	      arguments.get(0).transpile(transpiler, null);
	      transpiler.append(")");
		}
	};


	@Override
	public IType checkStaticMember(Context context, Identifier id) {
		String name = id.toString();
		if ("symbols".equals(name))
			return new ListType(this);
		else
			return super.checkStaticMember(context, id);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("value".equals(name))
			return derivedFrom;
		else if ("name".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}
	
	@Override
	public IValue getStaticMemberValue(Context context, Identifier id) {
		String name = id.toString();
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(!(decl instanceof IEnumeratedDeclaration))
			throw new SyntaxError(name + " is not an enumerated type!");
		if ("symbols".equals(name))
			return ((IEnumeratedDeclaration<?>)decl).getSymbolsList();
		else
			return super.getStaticMemberValue(context, id);
	}
	
	public ResultInfo compileGetStaticMember(Context context, MethodInfo method, Flags flags, IExpression parent, Identifier id) {
		String name = id.toString();
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(!(decl instanceof IEnumeratedDeclaration))
			throw new SyntaxError(name + " is not an enumerated type!");
		if ("symbols".equals(name)) {
			ClassConstant cc = new ClassConstant(CompilerUtils.getNativeEnumType(typeNameId));
			MethodConstant mc = new MethodConstant(cc, "getSymbols", List.class);
			method.addInstruction(Opcode.INVOKESTATIC, mc);
			return new ResultInfo(List.class);
		} else
			throw new SyntaxError("No such member:" + name);
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		throw new UnsupportedOperationException(); // TODO
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		try {
			EnumeratedNativeDeclaration decl = context.getRegisteredDeclaration(EnumeratedNativeDeclaration.class, typeNameId);
			return decl.readJSONValue(context, value);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		} 
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		EnumeratedNativeDeclaration decl = transpiler.getContext().getRegisteredDeclaration(EnumeratedNativeDeclaration.class, typeNameId);
	    transpiler.declare(decl);
	    transpiler.require("List");
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append(this.getTypeName());
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "symbols":
		case "value":
		case "name":
			{
		    	EnumeratedNativeDeclaration decl = transpiler.getContext().getRegisteredDeclaration(EnumeratedNativeDeclaration.class, typeNameId);
		        transpiler.declare(decl);
		    } 
		break;
	    default:
	        super.declareMember(transpiler, name);
		}
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "symbols":
		case "value":
		case "name":
	        transpiler.append(name);
	    	break;
	    default:
	        super.transpileMember(transpiler, name);
	    }
	}
}
