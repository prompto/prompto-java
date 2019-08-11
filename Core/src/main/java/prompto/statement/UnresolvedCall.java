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
import prompto.expression.SelectorExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.expression.UnresolvedSelector;
import prompto.grammar.ArgumentList;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.parser.Section;
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
			else if(caller instanceof SelectorExpression)
				((SelectorExpression)caller).setParent(parent);
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
	
	public ArgumentList getAssignments() {
		return arguments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolve(writer.getContext());
			resolved.toDialect(writer);
		} catch(SyntaxError error) {
			caller.toDialect(writer);
			if(arguments!=null)
				arguments.toDialect(writer);
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
			context.getProblemListener().reportUnknownMethod(caller.toString(), this);
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
	
	public IExpression getResolved(Context context) {
		resolve(context);
		return resolved;
	}
	
	protected IType resolveAndCheck(Context context) {
		resolve(context);
		if(resolved==null)
			return null;
		else
			return resolved.check(context);
	}
	
	
	protected void resolve(Context context) {
		if(resolved==null) {
			if(caller instanceof UnresolvedIdentifier)
				resolved = resolveUnresolvedIdentifier(context);
			else if(caller instanceof UnresolvedSelector)
				resolved = resolveUnresolvedSelector(context);
			else if(caller instanceof MemberSelector)
				resolved = resolveMember(context);
			if(resolved instanceof Section)
				((Section)resolved).setFrom(this);
		}
	}
	
	private IExpression resolveUnresolvedSelector(Context context) {
		UnresolvedSelector selector = (UnresolvedSelector)caller;
		selector.resolveMethod(context, arguments);
		return selector.getResolved();
	}

	private IExpression resolveUnresolvedIdentifier(Context context) {
		Identifier id = ((UnresolvedIdentifier)caller).getId();
		IExpression call = null;
		IDeclaration decl = null;
		// if this happens in the context of a member method, then we need to check for category members first
		InstanceContext instance = context.getClosestInstanceContext();
		if(instance!=null) {
			decl = resolveUnresolvedMember(instance, id);
			if(decl!=null)
				call = new MethodCall(new MethodSelector(id), arguments);
		}
		if(call==null) {
			INamed named = context.getRegisteredValue(INamed.class, id);
			if(named!=null) {
				IType type = named.getType(context);
				if(type instanceof MethodType) {
					call = new MethodCall(new MethodSelector(id), arguments);
					((MethodCall)call).setVariableName(id.toString());
				}
			}
		}
		if(call==null) {
			decl = context.getRegisteredDeclaration(IDeclaration.class, id);
			if(decl==null) {
				context.getProblemListener().reportUnknownMethod(id.toString(), id);
				return null;
			} else if(decl instanceof CategoryDeclaration)
				call = new ConstructorExpression(new CategoryType(id), null, arguments, false);
			else
				call = new MethodCall(new MethodSelector(id), arguments);
		}
		// call.copySectionFrom(this); // TODO
		return call;
	}

	private IDeclaration resolveUnresolvedMember(InstanceContext context, Identifier name) {
		ConcreteCategoryDeclaration decl = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, context.getInstanceType().getTypeNameId());
		MethodDeclarationMap methods = decl.getMemberMethods(context, name);
		if(methods!=null && methods.size()>0)
			return methods;
		else
			return null;
	}

	private IExpression resolveMember(Context context) {
		IExpression parent = ((MemberSelector)caller).getParent();
		Identifier id = ((MemberSelector)caller).getId();
		return new MethodCall(new MethodSelector(parent, id), arguments);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    this.resolve(transpiler.getContext());
	    this.resolved.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.resolve(transpiler.getContext());
	    this.resolved.transpile(transpiler);
	    return false;
	}
	
	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
		transpiler.append("'<unknown>'");
	}


}