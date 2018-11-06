package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.FetchManyExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClauseList;
import prompto.instance.VariableInstance;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class FetchManyStatement extends FetchManyExpression implements IStatement {

	Identifier name;
	StatementList stmts;
	
	public FetchManyStatement(CategoryType category, IExpression start, IExpression stop, IExpression predicate, OrderByClauseList orderBy, Identifier name, StatementList stmts) {
		super(category, start, stop, predicate, orderBy);
		this.name = name;
		this.stmts = stmts;
	}

	@Override
	public IType check(Context context) {
		super.check(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, new CursorType(type)));
		stmts.check(context, null);
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue record = super.interpret(context);
		context = context.newChildContext();
		context.registerValue(new Variable(name, new CursorType(type)));
		context.setValue(name, record);
		stmts.interpret(context);
		return null;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		AssignInstanceStatement assign = new AssignInstanceStatement(new VariableInstance(name), new FetchManyExpression(type, first, last, predicate, orderBy));
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
		writer.getContext().registerValue(new Variable(name, new CursorType(type)));
		writer.newLine().indent();
		stmts.toDialect(writer);
		writer.dedent();
		if(writer.getDialect()==Dialect.O)
			writer.append("}");
	}

	
	@Override
	public void declare(Transpiler transpiler) {
		super.declare(transpiler);
		transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, new CursorType(type)));
		stmts.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(function() {").indent();
	    transpileQuery(transpiler);
	    transpiler.append("DataStore.instance.fetchManyAsync(builder.build(), function(").append(name.toString()).append(") {").indent();
	    transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, new CursorType(type)));
		stmts.transpile(transpiler);
		transpiler.dedent().append("}.bind(this));").dedent().append("}).bind(this)()");
		transpiler.flush();
	    return false;
	}


}
