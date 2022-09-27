package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ConstructorExpression;
import prompto.expression.IAssertion;
import prompto.expression.IExpression;
import prompto.expression.MemberSelector;
import prompto.expression.MethodSelector;
import prompto.expression.SelectorBase;
import prompto.expression.UnresolvedIdentifier;
import prompto.expression.UnresolvedSelector;
import prompto.grammar.ArgumentList;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

public class UnresolvedCall extends BaseStatement implements IAssertion {
	
	IExpression caller;
	IExpression resolved;
	ArgumentList arguments;
	
	public UnresolvedCall(IExpression caller, ArgumentList arguments) {
		this.caller = caller;
		this.arguments = arguments;
	}
	
	public void setParent(IExpression parent) {
		if(parent!=null) {
			if(caller instanceof UnresolvedIdentifier)
				caller = new MethodSelector(parent, ((UnresolvedIdentifier)caller).getId());
			else if(caller instanceof SelectorBase)
				((SelectorBase)caller).setParent(parent);
			else
				throw new IllegalStateException("Should never happen!");
		}
	}
	
	@Override
	public boolean isSimple() {
		return true;
	}
	
	@Override
	public String toString() {
		return caller.toString();
	}
	
	public void setCaller(IExpression caller) {
		this.caller = caller;
	}
	
	public IExpression getCaller() {
		return caller;
	}
	
	public ArgumentList getArguments() {
		return arguments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			doResolve(writer.getContext());
			resolved.toDialect(writer);
		} catch(SyntaxError error) {
			caller.toDialect(writer);
			if(arguments!=null)
				arguments.toDialect(writer);
			else if(writer.getDialect() != Dialect.E)
				writer.append("()");
		}
	}
	
	@Override
	public IType check(Context context) {
		return resolveAndCheck(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		resolveAndCheck(context);
		if(resolved==null) {
			context.getProblemListener().reportUnknownMethod(this, caller.toString());
			return NullValue.instance();
		} else
			return resolved.interpret(context);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context);
		return resolved.compile(context, method, flags);
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		if(resolved==null)
			resolveAndCheck(context);
		if(resolved instanceof IAssertion)
			return ((IAssertion)resolved).interpretAssert(context, test);
		else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			resolved.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	@Override
	public void compileAssert(Context context, MethodInfo method, Flags flags, TestMethodDeclaration test) {
		if(resolved==null)
			resolveAndCheck(context);
		if(resolved instanceof IAssertion)
			((IAssertion)resolved).compileAssert(context, method, flags, test);
		else {
			CodeWriter writer = new CodeWriter(this.getDialect(), context);
			resolved.toDialect(writer);
			throw new SyntaxError("Cannot test '" + writer.toString() + "'");
		}
	}
	
	public IExpression resolve(Context context) {
		doResolve(context);
		return resolved;
	}
	
	protected IType resolveAndCheck(Context context) {
		doResolve(context);
		if(resolved==null)
			return null;
		else
			return resolved.check(context);
	}
	
	
	protected void doResolve(Context context) {
		if(resolved==null) {
			if(caller instanceof UnresolvedIdentifier)
				resolved = resolveUnresolvedIdentifier(context, (UnresolvedIdentifier)caller);
			else if(caller instanceof UnresolvedSelector)
				resolved = resolveUnresolvedSelector(context, (UnresolvedSelector)caller);
			else if(caller instanceof MemberSelector)
				resolved = resolveMemberSelector(context, (MemberSelector)caller);
			if(resolved instanceof ICodeSection)
				((ICodeSection)resolved).setSectionFrom(this);
		}
		if(resolved==null)
	    	context.getProblemListener().reportUnknownMethod(this, this.toString());
	}
	
	private IExpression resolveUnresolvedSelector(Context context, UnresolvedSelector caller) {
		caller.resolveMethod(context, arguments);
		return caller.getResolved();
	}

	private IExpression resolveUnresolvedIdentifier(Context context, UnresolvedIdentifier caller) {
		Identifier id = caller.getId();
		IExpression call = null;
		// if this happens in the context of an instance, then we need to check for category members first
		call = resolveUnresolvedMemberMethod(context, id);
		if(call==null)
			call = resolveUnresolvedMethodReference(context, id);
		if(call==null) 
			call = resolveUnresolvedDeclaration(context, id);
		if(call==null)
			context.getProblemListener().reportUnknownMethod(id, id.toString());
		return call;
	}

	private IExpression resolveUnresolvedDeclaration(Context context, Identifier id) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(decl==null)
			return null;
		else if(decl instanceof CategoryDeclaration)
			return new ConstructorExpression(new CategoryType(id), null, arguments);
		else
			return new MethodCall(new MethodSelector(id), arguments);
	}

	private IExpression resolveUnresolvedMethodReference(Context context, Identifier id) {
		INamed named = context.getRegisteredValue(INamed.class, id);
		if(named==null)
			return null;
		IType type = named.getType(context).resolve(context, null);
		if(type instanceof MethodType) {
			MethodCall call = new MethodCall(new MethodSelector(id), arguments);
			call.setVariableName(id.toString());
			return call;
		} else
			return null;
	}

	private IExpression resolveUnresolvedMemberMethod(Context context, Identifier id) {
		while(context!=null) {
			InstanceContext instance = context.getClosestInstanceContext();
			if(instance==null)
				return null;
			IDeclaration decl = resolveUnresolvedMember(instance, id);
			if(decl!=null)
				return new MethodCall(new MethodSelector(id), arguments);
			else
				context = instance.getParentContext();
		}
		return null;
	}

	private IDeclaration resolveUnresolvedMember(InstanceContext context, Identifier name) {
		ConcreteCategoryDeclaration decl = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, context.getInstanceType().getTypeNameId());
		MethodDeclarationMap methods = decl.getMemberMethods(context, name, true);
		if(methods!=null && methods.size()>0)
			return methods;
		else
			return null;
	}

	private IExpression resolveMemberSelector(Context context, MemberSelector caller) {
		IExpression parent = caller.getParent();
		Identifier id = caller.getId();
		MethodSelector selector = new MethodSelector(parent, id);
		selector.setSectionFrom(caller);
		return new MethodCall(selector, arguments);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    this.doResolve(transpiler.getContext());
	    if(this.resolved!=null)
	    	this.resolved.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.doResolve(transpiler.getContext());
	    if(this.resolved!=null)
	    	this.resolved.transpile(transpiler);
	    return false;
	}
	
	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
		transpiler.append("'<unknown>'");
	}


}