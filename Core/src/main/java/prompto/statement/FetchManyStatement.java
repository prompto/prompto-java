package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.FetchManyExpression;
import prompto.expression.IExpression;
import prompto.grammar.OrderByClauseList;
import prompto.grammar.ThenWith;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.CursorType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class FetchManyStatement extends FetchManyExpression implements IStatement {

	ThenWith thenWith;
	
	public FetchManyStatement(CategoryType category, IExpression start, IExpression stop, IExpression predicate, OrderByClauseList orderBy, ThenWith thenWith) {
		super(category, start, stop, predicate, orderBy);
		this.thenWith = thenWith;
	}

	@Override
	public IType check(Context context) {
		super.check(context);
		return thenWith.check(context, new CursorType(type));
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue record = super.interpret(context);
		return thenWith.interpret(context, record);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return thenWith.compile(context, method, flags, new FetchManyExpression(type, first, last, predicate, orderBy));
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		super.toDialect(writer);
		thenWith.toDialect(writer, new CursorType(type));
	}

	
	@Override
	public void declare(Transpiler transpiler) {
		super.declare(transpiler);
		thenWith.declare(transpiler, new CursorType(type));
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("(function() {").indent();
	    transpileQuery(transpiler);
	    boolean mutable = this.type!=null ? this.type.isMutable() : false;
	    transpiler.append("$DataStore.instance.fetchManyAsync(builder.build(), ")
	    	.append(mutable)
	    	.append(", function(")
	    	.append(thenWith.getName().toString())
	    	.append(") {")
	    	.indent();
	    transpiler = transpiler.newChildTranspiler(transpiler.getContext());
		transpiler.getContext().registerValue(new Variable(thenWith.getName(), new CursorType(type)));
		thenWith.getStatements().transpile(transpiler);
		transpiler.dedent().append("}.bind(this));").dedent().append("}).bind(this)()");
		transpiler.flush();
	    return false;
	}
	

}
