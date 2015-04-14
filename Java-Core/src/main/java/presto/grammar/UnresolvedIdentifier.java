package presto.grammar;

import presto.declaration.CategoryDeclaration;
import presto.declaration.EnumeratedNativeDeclaration;
import presto.declaration.IDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.ConstructorExpression;
import presto.expression.IExpression;
import presto.expression.InstanceExpression;
import presto.expression.MethodSelector;
import presto.expression.SymbolExpression;
import presto.expression.TypeExpression;
import presto.parser.IProblemListener;
import presto.parser.Section;
import presto.runtime.Context;
import presto.statement.MethodCall;
import presto.type.AnyType;
import presto.type.CategoryType;
import presto.type.IType;
import presto.type.NativeType;
import presto.utils.CodeWriter;
import presto.value.IValue;

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
			resolved.toDialect(writer);
		} catch(SyntaxError e) {
			writer.append(name);
		}
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return resolveAndCheck(context, false);
	}
	
	public IType checkMember(Context context) throws SyntaxError {
		return resolveAndCheck(context, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
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
		if(resolved==null) {
			IProblemListener pl = context.getProblemListener();
			if(pl!=null)
				pl.reportUnknowIdentifier(name.toString(), this);
			else 
				throw new SyntaxError("Unknown identifier:" + name);
		}
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
