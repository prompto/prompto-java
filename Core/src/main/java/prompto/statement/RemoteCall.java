package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.instance.VariableInstance;
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
		this(call.caller, call.assignments, resultName, andThen);
	}

	public RemoteCall(IExpression caller, ArgumentAssignmentList assignments, Identifier resultName, StatementList andThen) {
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
		context = context.newChildContext();
		if(resultName!=null)
			context.registerValue(new Variable(resultName, type));
		andThen.check(context, VoidType.instance());
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IType type = resolveAndCheck(context);
		IValue result = resolved.interpret(context);
		context = context.newChildContext();
		if(resultName!=null) {
			context.registerValue(new Variable(resultName, type));
			context.setValue(resultName, result);
		}
		andThen.interpret(context);
		return VoidResult.instance();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		resolveAndCheck(context);
		if(resultName!=null) {
			AssignInstanceStatement assign = new AssignInstanceStatement(new VariableInstance(resultName), new UnresolvedCall(caller, assignments));
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
		super.declare(transpiler);
		transpiler.require("RemoteRunner");
    	andThen.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IType type = resolveAndCheck(transpiler.getContext());
		transpiler = transpiler.append("RemoteRunner.execute(function() {").indent().append("return ");
	    this.resolved.transpile(transpiler);
	    transpiler = transpiler.dedent().append("}, function(");
	    if(resultName!=null)
	    	transpiler = transpiler.append(resultName.toString());
	    transpiler = transpiler.append(") {").indent();
	    transpiler = transpiler.newChildTranspiler(null);
		if(resultName!=null)
			transpiler.getContext().registerValue(new Variable(resultName, type));
	    this.andThen.transpile(transpiler);
	    transpiler = transpiler.dedent().append("}, this)");
	    transpiler.flush();
	    return false;
	}


}
