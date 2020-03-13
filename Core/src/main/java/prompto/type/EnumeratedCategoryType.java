package prompto.type;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;


public class EnumeratedCategoryType extends CategoryType {

	public EnumeratedCategoryType(Identifier id) {
		super(Family.ENUMERATED, id); 
	}
	
	@Override
	public IType asMutable(Context context, boolean mutable) {
		if(mutable)
			; // TODO throw ?
		return this;
	}
	
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
		if ("name".equals(name))
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
	
	@Override
	public Set<IMethodDeclaration> getStaticMemberMethods(Context context, Identifier name) throws PromptoError {
		if(name.toString().equals("symbolOf"))
			return new HashSet<>(Collections.singletonList(SYMBOL_OF_METHOD));
		else
			return Collections.emptySet();
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
		public IType check(Context context, boolean isStart) {
			return EnumeratedCategoryType.this;
		}

		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	      transpiler.append("symbolOf(");
	      arguments.get(0).transpile(transpiler, null);
	      transpiler.append(")");
		}
	};

}
