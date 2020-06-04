package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.expression.ReadAllExpression;
import prompto.grammar.Identifier;
import prompto.instance.VariableInstance;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ReadStatement extends ReadAllExpression implements IStatement {

	Identifier name;
	StatementList stmts;
	
	public ReadStatement(IExpression resource, Identifier name, StatementList stmts) {
		super(resource);
		this.name = name;
		this.stmts = stmts;
	}

	@Override
	public IType check(Context context) {
		super.check(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, TextType.instance()));
		stmts.check(context, VoidType.instance());
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue result = super.interpret(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, TextType.instance()));
		context.setValue(name, result);
		stmts.interpret(context);
		return null;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		AssignInstanceStatement assign = new AssignInstanceStatement(new VariableInstance(name), new ReadAllExpression(resource));
		assign.compile(context, method, flags);
		stmts.compile(context, method, flags);
		return new ResultInfo(void.class);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		super.declare(transpiler);
		transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, TextType.instance()));
		stmts.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.resource.transpile(transpiler);
	    transpiler.append(".readFullyAsync(function(").append(name).append(") {").indent();
	    transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, TextType.instance()));
		stmts.transpile(transpiler);
		transpiler.dedent().append("}.bind(this));");
		transpiler.flush();
		return false;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		super.toDialect(writer);
		writer.append(" then with ").append(name);
		if(writer.getDialect()==Dialect.O)
			writer.append(" {");
		else
			writer.append(":");
		writer = writer.newChildWriter();
		writer.getContext().registerValue(new Variable(name, TextType.instance()));
		writer.newLine().indent();
		stmts.toDialect(writer);
		writer.dedent();
		if(writer.getDialect()==Dialect.O)
			writer.append("}");
	}


}
