package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.problem.IProblemListener;
import prompto.problem.ProblemRaiser;
import prompto.runtime.Context;
import prompto.statement.UnresolvedCall;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class UnresolvedSelector extends SelectorExpression {

	Identifier id;
	IExpression resolved;

	public UnresolvedSelector(Identifier name) {
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
		return (parent == null ? "" : parent.toString() + '.') + id.toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolve(writer.getContext());
		} catch (SyntaxError e) {
		}
		if (resolved != null)
			resolved.toDialect(writer);
		else {
			if (parent != null) {
				parent.toDialect(writer);
				writer.append('.');
			}
			writer.append(id);
		}
	}

	@Override
	public IType check(Context context) {
		return resolveAndCheck(context);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		resolveAndCheck(context);
		return resolved.interpret(context);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context);
		return resolved.compile(context, method, flags);
	}

	private IType resolveAndCheck(Context context) {
		resolve(context);
		return resolved != null ? resolved.check(context) : AnyType.instance();
	}

	public IExpression resolve(Context context) {
		if (resolved == null) {
			final IProblemListener saved = context.getProblemListener(); 
			context.pushProblemListener(new ProblemRaiser() { @Override public boolean isCheckNative() { return saved.isCheckNative(); } });
			try {
				resolved = tryResolveMethod(context, null);
				if (resolved == null)
					resolved = tryResolveMember(context);
			} finally {
				context.popProblemListener();
			}
			if (resolved == null)
				context.getProblemListener().reportUnknownIdentifier(this, id.toString());
		}
		return resolved;
	}

	private IExpression tryResolveMember(Context context) {
		try {
			MemberSelector member = new MemberSelector(parent, id);
			member.copySectionFrom(this);
			member.check(context);
			return member;
		} catch (SyntaxError e) {
			// ignore resolution errors
			return null;
		}
	}

	public void resolveMethod(Context context, ArgumentList assignments) {
		if (resolved == null)
			resolved = tryResolveMethod(context, assignments);
	}
	
	public IExpression tryResolveMethod(Context context, ArgumentList assignments) {
		try {
			IExpression resolvedParent = parent;
			if (resolvedParent instanceof UnresolvedIdentifier) {
				((UnresolvedIdentifier) resolvedParent).checkMember(context);
				resolvedParent = ((UnresolvedIdentifier) resolvedParent).getResolved();
			}
			UnresolvedCall method = new UnresolvedCall(new MethodSelector(resolvedParent, id), assignments);
			method.copySectionFrom(this);
			method.check(context);
			return method;
		} catch (SyntaxError e) {
			// ignore resolution errors
			return null;
		}
	}

	@Override
	public void declare(Transpiler transpiler) {
		if (this.resolved == null)
			this.resolve(transpiler.getContext());
		this.resolved.declare(transpiler);
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		if (this.resolved == null)
			this.resolve(transpiler.getContext());
		return this.resolved.transpile(transpiler);
	}


}
