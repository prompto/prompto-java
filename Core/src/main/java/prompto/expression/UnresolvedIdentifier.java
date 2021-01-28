package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.problem.IProblemListener;
import prompto.problem.ProblemListener;
import prompto.runtime.Context;
import prompto.statement.MethodCall;
import prompto.store.AttributeInfo;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.StoreUtils;
import prompto.value.IValue;

public class UnresolvedIdentifier extends Section implements IPredicateExpression {

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
		return id.toString();
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolve(writer.getContext(), false, false);
		} catch(SyntaxError e) {
		}
		if(resolved!=null)
			resolved.toDialect(writer);
		else
			writer.append(id);
	}
	
	@Override
	public AttributeDeclaration checkAttribute(Context context, ISection section) {
		AttributeDeclaration decl = context.findAttribute(id.toString());
		if(decl==null)
			context.getProblemListener().reportMissingAttribute(this, this.toString());
		return decl;
	}
	
	@Override
	public AttributeInfo checkAttributeInfo(Context context, ISection section, IStore store) {
		return StoreUtils.getAttributeInfo(context, id.toString(), store);
	}

	@Override
	public IType check(Context context) {
		return resolveAndCheck(context, false);
	}
	
	@Override
	public IType checkReference(Context context) {
		resolve(context, false, false);
		return resolved!=null ? resolved.checkReference(context) : AnyType.instance();
	}
	
	@Override
	public void checkQuery(Context context) throws PromptoError {
		resolveAndCheck(context, false);
		if(resolved instanceof IPredicateExpression)
			((IPredicateExpression)resolved).checkQuery(context);
		else
			context.getProblemListener().reportIllegalPredicate(this, this);
	}
	
	public IType checkMember(Context context) {
		return resolveAndCheck(context, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		resolveAndCheck(context, false);
		return resolved.interpret(context);
	}
	
	@Override
	public IValue interpretReference(Context context) {
		resolve(context, false, false);
		return resolved.interpretReference(context);
	}
	
	
	@Override
	public void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError {
		resolveAndCheck(context, false);
		if(resolved instanceof IPredicateExpression)
			((IPredicateExpression)resolved).interpretQuery(context, query, store);
		else
			throw new SyntaxError("Filtering expression must be a predicate !");
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context, false);
		return resolved.compile(context, method, flags);
	}
	
	@Override
	public ResultInfo compileReference(Context context, MethodInfo method, Flags flags) {
		StackLocal local = method.getRegisteredLocal(getName());
		if(local!=null) {
			return new InstanceExpression(id).compile(context, method, flags);
			
		} else
			return compile(context, method, flags);
	}
	
	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context, false);
		if(resolved instanceof IPredicateExpression)
			((IPredicateExpression)resolved).compileQuery(context, method, flags);
		else
			IPredicateExpression.super.compileQuery(context, method, flags);
	}
	
	private IType resolveAndCheck(Context context, boolean forMember) {
		resolve(context, forMember, false);
		return resolved!=null ? resolved.check(context) : AnyType.instance();
	}

	public IExpression resolve(Context context, boolean forMember, boolean updateSelectorParent) {
		if(resolved==null) {
			IProblemListener saved = context.getProblemListener();
			try {
				context.setProblemListener(new ProblemListener() { @Override public boolean isCheckNative() { return saved.isCheckNative(); } });
				resolved = doResolve(context, forMember, updateSelectorParent);
			} finally {
				context.setProblemListener(saved);
			}
			if(resolved==null)
				context.getProblemListener().reportUnknownIdentifier(this, id.toString());
			else if(resolved instanceof Section)
				((Section)resolved).copySectionFrom(this);
		}
		return resolved;
	}

	private IExpression doResolve(Context context, boolean forMember, boolean updateSelectorParent) {
		IExpression resolved = resolveSymbol(context);
		if(resolved!=null)
			return resolved;
		resolved = resolveTypeOrConstructor(context, forMember);
		if(resolved!=null)
			return resolved;
		resolved = resolveMethodCall(context, updateSelectorParent);
		if(resolved!=null)
			return resolved;
		resolved = resolveInstance(context);
		if(resolved!=null)
			return resolved;
		return null;
	}

	private IExpression resolveTypeOrConstructor(Context context, boolean forMember) {
		if(Character.isUpperCase(id.toString().charAt(0)))
			return resolveTypeOrConstructor(context);
		else
			return null;
	}

	private IExpression resolveTypeOrConstructor(Context context) {
		try {
			CategoryType type = new CategoryType(id);
			IDeclaration decl = type.getDeclaration(context);
			if(decl instanceof SingletonCategoryDeclaration || decl instanceof IEnumeratedDeclaration)
				return new TypeExpression(type);
			else {
				IExpression method = new ConstructorExpression(type, null, null);
				method.check(context);
				return method;
			}
		} catch(SyntaxError e) {
			// ignore resolution errors
			return null;
		}
	}

	private IExpression resolveInstance(Context context) {
		try {
			InstanceExpression exp = new InstanceExpression(id);
			exp.check(context);
			return exp;
		} catch(SyntaxError e) {
			// ignore resolution errors
			return null;
		}
	}

	private IExpression resolveMethodCall(Context context, boolean updateSelectorParent) {
		if(id.getDialect()!=Dialect.E)
			return null;
		try {
			MethodCall method = new MethodCall(new MethodSelector(id));
			method.copySectionFrom(this);
			method.check(context, updateSelectorParent);
			return method;
		} catch(SyntaxError e) {
			// ignore resolution errors
			return null;
		}
	}

	private IExpression resolveSymbol(Context context) {
		if(id.toString().equals(id.toString().toUpperCase()))
			return new SymbolExpression(id);
		else
			return null;
	}

	@Override
	public void declare(Transpiler transpiler) {
	    resolve(transpiler.getContext(), false, true);
	    resolved.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    resolve(transpiler.getContext(), false, true);
	    return resolved.transpile(transpiler);
	}
	
	@Override
	public void declareQuery(Transpiler transpiler) {
	    resolve(transpiler.getContext(), false, true);
	    resolved.declareQuery(transpiler);
	}
	
	@Override
	public void transpileQuery(Transpiler transpiler, String builderName) {
	    resolve(transpiler.getContext(), false, true);
	    resolved.transpileQuery(transpiler, builderName);
	}
}
