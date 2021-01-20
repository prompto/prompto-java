package prompto.grammar;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.expression.IExpression;
import prompto.instance.VariableInstance;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.statement.AssignInstanceStatement;
import prompto.statement.StatementList;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ThenWith {
	
	public static ThenWith orEmpty(ThenWith value) {
		return value != null ? value : new ThenWith(null, null);
	}

	Identifier name;
	StatementList statements;
	
	public ThenWith(Identifier name, StatementList statements) {
		super();
		this.name = name;
		this.statements = statements;
	}

	public Identifier getName() {
		return name;
	}

	public StatementList getStatements() {
		return statements;
	}

	public IType check(Context context, IType type) {
		context.registerValue(new Variable(name, type));
		statements.check(context, VoidType.instance());
		return VoidType.instance();
	}

	public IValue interpret(Context context, IValue value) {
		context = context.newChildContext();
		context.registerValue(new Variable(name, value.getType()));
		context.setValue(name, value);
		statements.interpret(context);
		return null;
	}

	public ResultInfo compile(Context context, MethodInfo method, Flags flags, IExpression expression) {
		AssignInstanceStatement assign = new AssignInstanceStatement(new VariableInstance(name), expression);
		assign.compile(context, method, flags);
		statements.compile(context, method, flags);
		return new ResultInfo(void.class);
	}

	public void declare(Transpiler transpiler, IType type) {
		transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, type));
		statements.declare(transpiler);
	}

	public void transpile(Transpiler transpiler, IType type) {
	    transpiler.append("function(").append(name).append(") {").indent();
	    transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(name, type));
		statements.transpile(transpiler);
		transpiler.dedent().append("}.bind(this)");
		transpiler.flush();
	}

	public void toDialect(CodeWriter writer, IType type) {
		writer.append(" then with ").append(name);
		if(writer.getDialect()==Dialect.O)
			writer.append(" {");
		else
			writer.append(":");
		writer = writer.newChildWriter();
		writer.getContext().registerValue(new Variable(name, type));
		writer.newLine().indent();
		statements.toDialect(writer);
		writer.dedent();
		if(writer.getDialect()==Dialect.O)
			writer.append("}").newLine();
	}

	
	
}
