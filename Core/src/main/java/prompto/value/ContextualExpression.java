package prompto.value;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;

/* a value which can only be determined when expression is interpreted in a specific context */
public class ContextualExpression extends BaseValue implements IExpression {

	Context calling;
	IExpression expression;
	
	public ContextualExpression(Context calling, IExpression expression) {
		super(null); // TODO check that this is not a problem
		this.calling = calling;
		this.expression = expression;
	}
	
	public Context getCalling() {
		return calling;
	}
	
	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}
	
	@Override
	public String toString() {
		return expression.toString();
	}
	
	@Override
	public IType check(Context context) {
		return expression.check(this.calling);
	}
	
	@Override
	public IType checkReference(Context context) {
		return expression.checkReference(this.calling);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return expression.interpret(this.calling);
	}
	
	@Override
	public IValue interpretReference(Context context) {
		return expression.interpretReference(this.calling);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return expression.compile(this.calling, method, flags);
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler = transpiler.newChildTranspiler(this.calling);
	    this.expression.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler = transpiler.newChildTranspiler(this.calling);
	    this.expression.transpile(transpiler);
	    transpiler.flush();
	    return false;
	}
	
	@Override
	public boolean transpileMethodReference(Transpiler transpiler, MethodType method) {
		transpiler = transpiler.newChildTranspiler(this.calling);
	    this.expression.transpileMethodReference(transpiler, method);
	    transpiler.flush();
	    return false;
	}

}
