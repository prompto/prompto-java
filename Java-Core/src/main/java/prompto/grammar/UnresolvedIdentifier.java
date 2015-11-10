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

	Identifier id;
	IExpression resolved;
	
	public UnresolvedIdentifier(Identifier name) {
		this.id = name;
	}
	
	public IExpression getResolved() {
		return resolved;
	}

	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.getName();
	}
	
	@Override
	public String toString() {
		return id.toString();
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
			writer.append(id);
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
				if(Character.isUpperCase(id.toString().charAt(0))) {
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
			context.getProblemListener().reportUnknownIdentifier(id.toString(), this);
		return resolved;
	}

	private IExpression resolveInstance(Context context) {
		try {
			IExpression exp = new InstanceExpression(id);
			exp.check(context);
			return exp;
		} catch(SyntaxError e) {
			return null;
		}
	}

	private IExpression resolveMethod(Context context) {
		try {
			IExpression method = new MethodCall(new MethodSelector(id));
			method.check(context);
			return method;
		} catch(SyntaxError e) {
			return null;
				}
	}

	private IExpression resolveConstructor(Context context) {
		try {
			IExpression method = new ConstructorExpression(new CategoryType(id), false, null);
			method.check(context);
			return method;
		} catch(SyntaxError e) {
			return null;
		}
	}

	private IExpression resolveType(Context context) throws SyntaxError {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(decl instanceof CategoryDeclaration)
			return new TypeExpression(new CategoryType(id));
		else if(decl instanceof EnumeratedNativeDeclaration)
			return new TypeExpression(decl.getType(context));
		else for(IType type : NativeType.getAll()) {
			if(id.equals(type.getId()))
				return new TypeExpression(type);
		}
		return null;
	}

	private IExpression resolveSymbol(Context context) {
		if(id.toString().equals(id.toString().toUpperCase()))
			return new SymbolExpression(id);
		else
			return null;
	}

	

}
