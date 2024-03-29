package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.store.IQueryBuilder;
import prompto.store.IStore;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ParenthesisExpression extends CodeSection implements IPredicate {

	IExpression expression;

	public ParenthesisExpression(IExpression expression) {
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public String toString() {
		return "(" + expression.toString() + ")";
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("(");
		expression.toDialect(writer);
		writer.append(")");
	}

	@Override
	public IType check(Context context) {
		return expression.check(context);
	}
	
	@Override
	public void checkQuery(Context context) throws PromptoError {
		if(expression instanceof IPredicate)
			((IPredicate)expression).checkQuery(context);
		else
			context.getProblemListener().reportIllegalPredicate(this, expression);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return expression.interpret(context);
	}
	
	@Override
	public void interpretQuery(Context context, IQueryBuilder query, IStore store) throws PromptoError {
		if(expression instanceof IPredicate)
			((IPredicate)expression).interpretQuery(context, query, store);
		else
			throw new SyntaxError("Not a predicate: " + expression.toString());
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return expression.compile(context, method, flags);
	}
	
	@Override
	public void compileQuery(Context context, MethodInfo method, Flags flags) {
		if(expression instanceof IPredicate)
			((IPredicate)expression).compileQuery(context, method, flags);
		else
			throw new SyntaxError("Not a predicate: " + expression.toString());
	}

	@Override
	public void declare(Transpiler transpiler) {
		expression.declare(transpiler);
	}
	
	@Override
	public void declareQuery(Transpiler transpiler) {
		if(expression instanceof IPredicate)
			((IPredicate)expression).declareQuery(transpiler);
		else
			throw new SyntaxError("Not a predicate: " + expression.toString());
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("(");
		this.expression.transpile(transpiler);
		transpiler.append(")");
		return false;
	}
	
	@Override
	public void transpileQuery(Transpiler transpiler, String builderName) {
		if(expression instanceof IPredicate)
			((IPredicate)expression).transpileQuery(transpiler, builderName);
		else
			throw new SyntaxError("Not a predicate: " + expression.toString());
	}
}
