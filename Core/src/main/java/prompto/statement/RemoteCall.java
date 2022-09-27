package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.instance.VariableInstance;
import prompto.param.IParameter;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.runtime.VoidResult;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class RemoteCall extends UnresolvedCall {

	Identifier resultName;
	StatementList andThen;

	public RemoteCall(UnresolvedCall call, Identifier resultName, StatementList andThen) {
		this(call.caller, call.arguments, resultName, andThen);
	}

	public RemoteCall(IExpression caller, ArgumentList assignments, Identifier resultName, StatementList andThen) {
		super(caller, assignments);
		this.resultName = resultName;
		this.andThen = andThen;
	}
	
	@Override
	public boolean isSimple() {
		return false;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		super.toDialect(writer);
		writer.append(" then");
		if(resultName!=null)
			writer.append(" with ").append(resultName.toString());
		if(writer.getDialect()==Dialect.O)
			writer.append(" {");
		else
			writer.append(":");
		writer = writer.newLine().indent();
		andThen.toDialect(writer);
		writer.dedent();
		if(writer.getDialect()==Dialect.O)
			writer.append("}");
	}

	@Override
	public IType check(Context context) {
		IType type = resolveAndCheck(context);
		if(!(resolved instanceof MethodCall))
			context.getProblemListener().reportIllegalRemoteCall(this, resolved.toString());
		ArgumentList arguments = ((MethodCall)resolved).makeArguments(context);
		arguments.forEach(arg -> arg.check(context));
		Context local = context.newChildContext();
		if(resultName!=null)
			local.registerInstance(new Variable(resultName, type));
		andThen.check(local, VoidType.instance());
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType type = resolveAndCheck(context);
		IValue result = resolved.interpret(context);
		context = context.newChildContext();
		if(resultName!=null) {
			context.registerInstance(new Variable(resultName, type));
			context.setValue(resultName, result);
		}
		andThen.interpret(context);
		return VoidResult.instance();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context);
		if(resultName!=null) {
			AssignInstanceStatement assign = new AssignInstanceStatement(new VariableInstance(resultName), new UnresolvedCall(caller, arguments));
			assign.compile(context, method, flags);
		} else {
			ResultInfo result = resolved.compile(context, method, flags);
			if(result.getType()!=void.class)
				method.addInstruction(Opcode.POP);
		}
		andThen.compile(context, method, flags);
		return new ResultInfo(void.class);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		if(transpiler.getEngine().isTestEngine())
			super.declare(transpiler); // need actual method in transpiled.js
		else
			transpiler.require("Remote");
		transpiler.require("RemoteRunner");
		IType type = resolveAndCheck(transpiler.getContext());
		if(!(resolved instanceof MethodCall))
			transpiler.getContext().getProblemListener().reportIllegalRemoteCall(this, resolved.toString());
		ArgumentList arguments = ((MethodCall)resolved).makeArguments(transpiler.getContext());
		arguments.forEach(arg -> arg.declare(transpiler, null));
		final Transpiler local = transpiler.newChildTranspiler();
		if(resultName!=null) {
			type.declare(local);
			local.getContext().registerInstance(new Variable(resultName, type));
		}
		andThen.declare(local);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		resolveAndCheck(transpiler.getContext());
		if(!(resolved instanceof MethodCall))
			transpiler.getContext().getProblemListener().reportIllegalRemoteCall(this, resolved.toString());
		else if(transpiler.getEngine().isTestEngine())
			transpileTest(transpiler);
		else
			transpileRemote(transpiler);
	    return false;
	}

	private void transpileTest(Transpiler transpiler) {
		transpiler = transpiler.append("RemoteRunner.run(function() {").indent().append("return ");
	    this.resolved.transpile(transpiler);
	    transpiler.dedent().append("}, function(");
	    if(resultName!=null)
	    	transpiler.append(resultName.toString());
	    transpiler.append(") {").indent();
	    transpiler = transpiler.newChildTranspiler();
		if(resultName!=null) {
			IType type = resolveAndCheck(transpiler.getContext());
			transpiler.getContext().registerInstance(new Variable(resultName, type));
		}
		this.andThen.transpile(transpiler);
	    transpiler.dedent().append("}, this)").flush();
	}

	private void transpileRemote(Transpiler transpiler) {
		MethodCall call = (MethodCall)resolved;
		transpiler.append("RemoteRunner.run('").append(call.getSelector().toString()).append("', ");
		transpileAssignments(transpiler, call);
	    transpiler.append(", function(");
	    if(resultName!=null)
	    	transpiler.append(resultName.toString());
	    transpiler.append(") {").indent();
	    transpiler = transpiler.newChildTranspiler();
		if(resultName!=null) {
			IType type = resolveAndCheck(transpiler.getContext());
			transpiler.getContext().registerInstance(new Variable(resultName, type));
		}
		this.andThen.transpile(transpiler);
	    transpiler.dedent().append("}, this)").flush();
	}

	private void transpileAssignments(Transpiler transpiler, MethodCall call) {
		transpiler.append("[");
		ArgumentList assigns = call.getArguments();
		if(assigns!=null && !assigns.isEmpty()) {
			IMethodDeclaration declaration = call.findDeclaration(transpiler.getContext(), false);
			assigns = assigns.makeArguments(transpiler.getContext(), declaration);
			assigns.forEach(assign->{
				transpileAssignment(transpiler, assign, declaration);
				transpiler.append(",");
			});
			transpiler.trimLast(1);
		}
		transpiler.append("]");
	}

	private void transpileAssignment(Transpiler transpiler, Argument assign, IMethodDeclaration declaration) {
		Context ctx = transpiler.getContext();
        IParameter argument = assign.getParameter();
        IExpression expression = assign.resolve(ctx, declaration, false, false);
		transpiler.append("{name:'")
			.append(argument.getName())
			.append("',type:'")
			.append(argument.getType(ctx).toString())
			.append("',value:");
        argument.transpileCall(transpiler, expression);
        transpiler.append("}");
	}
}
