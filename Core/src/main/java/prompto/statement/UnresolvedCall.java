package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
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
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.runtime.VoidResult;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class UnresolvedCall extends BaseStatement implements IAssertion {
	
	IExpression caller;
	IExpression resolved;
	ArgumentAssignmentList assignments;
	StatementList andThen;
	
	public UnresolvedCall(IExpression caller, ArgumentAssignmentList assignments, StatementList andThen) {
		this.caller = caller;
		this.assignments = assignments;
		this.andThen = andThen;
	}
	
	public void setAndThen(StatementList andThen) {
		this.andThen = andThen;
	}
	
	@Override
	public boolean isSimple() {
		return andThen==null;
	}
	
	@Override
	public String toString() {
		return caller.toString();
	}
	
	public IExpression getCaller() {
		return caller;
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		try {
			resolve(writer.getContext());
			resolved.toDialect(writer);
			andThenToDialect(writer);
		} catch(SyntaxError error) {
			caller.toDialect(writer);
			if(assignments!=null)
				assignments.toDialect(writer);
			andThenToDialect(writer);
		}
	}
	
	private void andThenToDialect(CodeWriter writer) {
		if(andThen!=null) {
			writer.append(" then");
			if(writer.getDialect()==Dialect.O)
				writer.append(" {");
			else
				writer.append(":");
			writer = writer.newLine().indent();
			andThen.toDialect(writer);
			writer = writer.dedent();
			if(writer.getDialect()==Dialect.O)
				writer.append("}");
		}
	}

	@Override
	public IType check(Context context) {
		IType result = resolveAndCheck(context);
		if(andThen==null)
			return result;
		else {
			andThen.check(context, VoidType.instance());
			return VoidType.instance();
		}
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		resolveAndCheck(context);
		IValue result = resolved.interpret(context);;
		if(andThen==null)
			return result;
		else {
			andThen.interpret(context);
			return VoidResult.instance();
		}
		
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context);
		ResultInfo result = resolved.compile(context, method, flags);
		if(andThen==null)
			return result;
		else {
			if(result.getType()!=void.class)
				method.addInstruction(Opcode.POP);
			andThen.compile(context, method, flags);
			return new ResultInfo(void.class);
		}
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
	
	private IType resolveAndCheck(Context context) {
		resolve(context);
		if(resolved==null)
			return null;
		else
			return resolved.check(context);
	}
	
	
	private void resolve(Context context) {
		if(resolved==null) {
			if(caller instanceof UnresolvedIdentifier)
				resolved = resolveUnresolvedIdentifier(context);
			else if(caller instanceof MemberSelector)
				resolved = resolveMember(context);
			if(resolved instanceof Section)
				((Section)resolved).setFrom(this);
		}
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
				call = new MethodCall(new MethodSelector(id), assignments);
		}
		if(call==null) {
			INamed named = context.getRegisteredValue(INamed.class, id);
			if(named!=null) {
				IType type = named.getType(context);
				if(type instanceof MethodType) {
					call = new MethodCall(new MethodSelector(id), assignments);
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
				call = new ConstructorExpression(new CategoryType(id), null, assignments, false);
			else
				call = new MethodCall(new MethodSelector(id), assignments);
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
		return new MethodCall(new MethodSelector(parent, id), assignments);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    this.resolve(transpiler.getContext());
	    this.resolved.declare(transpiler);
	    if(andThen!=null) {
	    	transpiler.require("Async");
	    	andThen.declare(transpiler);
	    }
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.resolve(transpiler.getContext());
		if(andThen!=null)
			transpileAsync(transpiler);
		else
		    this.resolved.transpile(transpiler);
	    return false;
	}
	
	private void transpileAsync(Transpiler transpiler) {
		transpiler = transpiler.append("execute(function() {").indent();
	    this.resolved.transpile(transpiler);
	    transpiler = transpiler.dedent().append("}, function() {").indent();
	    this.andThen.transpile(transpiler);
	    transpiler = transpiler.dedent().append("})");
	}

	@Override
	public void transpileFound(Transpiler transpiler, Dialect dialect) {
		transpiler.append("'<unknown>'");
	}

}