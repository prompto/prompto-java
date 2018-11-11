package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.FetchOneExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.instance.VariableInstance;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class FetchOneStatement extends FetchOneExpression implements IStatement {

	Identifier name;
	StatementList stmts;

	public FetchOneStatement(CategoryType category, IExpression filter, Identifier name, StatementList stmts) {
		super(category, filter);
		this.name = name;
		this.stmts = stmts;
	}
	
	@Override
	public IType check(Context context) {
		super.check(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, type));
		stmts.check(context, null);
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue record = super.interpret(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, type));
		context.setValue(name, record);
		stmts.interpret(context);
		return null;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		AssignInstanceStatement assign = new AssignInstanceStatement(new VariableInstance(name), new FetchOneExpression(type, predicate));
		assign.compile(context, method, flags);
		stmts.compile(context, method, flags);
		return new ResultInfo(void.class);
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
		writer.getContext().registerValue(new Variable(name, type));
		writer.newLine().indent();
		stmts.toDialect(writer);
		writer.dedent();
		if(writer.getDialect()==Dialect.O)
			writer.append("}");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		if(!transpiler.getEngine().isTestEngine())
			transpiler.require("Remote");
		super.declare(transpiler);
		transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, type));
		stmts.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(function() {").indent();
	    transpileQuery(transpiler);
	    transpiler.append("DataStore.instance.fetchOneAsync(builder.build(), function(stored) {").indent();
	    transpileConvert(transpiler, name.toString());
		transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, type));
		stmts.transpile(transpiler);
		transpiler.dedent().append("}.bind(this));").dedent().append("}).bind(this)()");
		transpiler.flush();
	    return false;
	}

}
