package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.FetchOneExpression;
import prompto.expression.IExpression;
import prompto.grammar.ThenWith;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class FetchOneStatement extends FetchOneExpression implements IStatement {

	ThenWith thenWith;
	
	public FetchOneStatement(CategoryType category, IExpression filter, ThenWith thenWith) {
		super(category, filter);
		this.thenWith = thenWith;
	}
	
	@Override
	public IType check(Context context) {
		super.check(context);
		return thenWith.check(context, type);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue record = super.interpret(context);
		return thenWith.interpret(context, record);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return thenWith.compile(context, method, flags, new FetchOneExpression(type, predicate));
	}

	
	@Override
	public void toDialect(CodeWriter writer) {
		super.toDialect(writer);
		thenWith.toDialect(writer, type);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		super.declare(transpiler);
		thenWith.declare(transpiler, type);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(function() {").indent();
	    transpileQuery(transpiler);
	    transpiler.append("$DataStore.instance.fetchOneAsync(builder.build(), function($stored) {").indent();
	    transpileConvert(transpiler, thenWith.getName().toString());
		transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(thenWith.getName(), type));
		thenWith.getStatements().transpile(transpiler);
		transpiler.dedent().append("}.bind(this));").dedent().append("}).bind(this)()");
		transpiler.flush();
	    return false;
	}

}
