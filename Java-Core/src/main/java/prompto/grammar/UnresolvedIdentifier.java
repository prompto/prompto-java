package prompto.grammar;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ConstructorExpression;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.MethodSelector;
import prompto.expression.SymbolExpression;
import prompto.expression.TypeExpression;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.statement.MethodCall;
import prompto.type.AnyType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.NativeType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class UnresolvedIdentifier extends Section implements IExpression {

	Identifier name;
	IExpression resolved;
	
	public UnresolvedIdentifier(Identifier name) {
		this.name = name;
	}
	
	public IExpression getResolved() {
		return resolved;
	}

	public Identifier getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolve(writer.getContext(), false);
		} catch(SyntaxError e) {
		}
		if(resolved!=null)
			resolved.toDialect(writer);
		else
			writer.append(name);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return resolveAndCheck(context, false);
	}
	
	public IType checkMember(Context context) throws SyntaxError {
		return resolveAndCheck(context, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(resolved==null)
			resolveAndCheck(context, false);
		return resolved.interpret(context);
	}
	
	private IType resolveAndCheck(Context context, boolean forMember) throws SyntaxError {
		resolve(context, forMember);
		return resolved!=null ? resolved.check(context) : AnyType.instance();
	}

	public IExpression resolve(Context context, boolean forMember) throws SyntaxError {
		if(resolved==null) {
			resolved = resolveSymbol(context);
			if(resolved==null) {
				if(Character.isUpperCase(name.toString().charAt(0))) {
					if(forMember)
						resolved = resolveType(context);
					else
						resolved = resolveConstructor(context);
				}
				if(resolved==null) {
					resolved = resolveMethod(context);
					if(resolved==null)
						resolved = resolveInstance(context);
				}
			}
		}
		if(resolved==null)
			context.getProblemListener().reportUnknownIdentifier(name.toString(), this);
		return resolved;
	}

	private IExpression resolveInstance(Context context) {
		try {
			IExpression id = new InstanceExpression(name);
			id.check(context);
			return id;
		} catch(SyntaxError e) {
			return null;
		}
	}

	private IExpression resolveMethod(Context context) {
		try {
			IExpression method = new MethodCall(new MethodSelector(name));
			method.check(context);
			return method;
		} catch(SyntaxError e) {
			return null;
				}
	}

	private IExpression resolveConstructor(Context context) {
		try {
			IExpression method = new ConstructorExpression(new CategoryType(name), false, null);
			method.check(context);
			return method;
		} catch(SyntaxError e) {
			return null;
		}
	}

	private IExpression resolveType(Context context) throws SyntaxError {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, name);
		if(decl instanceof CategoryDeclaration)
			return new TypeExpression(new CategoryType(name));
		else if(decl instanceof EnumeratedNativeDeclaration)
			return new TypeExpression(decl.getType(context));
		else for(IType type : NativeType.getAll()) {
			if(name.equals(type.getName()))
				return new TypeExpression(type);
		}
		return null;
	}

	private IExpression resolveSymbol(Context context) {
		if(name.toString().equals(name.toString().toUpperCase()))
			return new SymbolExpression(name);
		else
			return null;
	}

	

}
