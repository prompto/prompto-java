package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.expression.ReadAllExpression;
import prompto.grammar.ThenWith;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ReadStatement extends ReadAllExpression implements IStatement {

	ThenWith thenWith;
	
	public ReadStatement(IExpression resource, ThenWith thenWith) {
		super(resource);
		this.thenWith = thenWith;
	}

	@Override
	public IType check(Context context) {
		super.check(context);
		context = context.newChildContext();
		return thenWith.check(context, TextType.instance());
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue result = super.interpret(context);
		return thenWith.interpret(context, result);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return thenWith.compile(context, method, flags, new ReadAllExpression(resource));
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		super.declare(transpiler);
		thenWith.declare(transpiler, TextType.instance());
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    this.resource.transpile(transpiler);
	    transpiler.append(".readFullyAsync(");
	    thenWith.transpile(transpiler, TextType.instance());
	    transpiler.append(");");
		return false;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		super.toDialect(writer);
		thenWith.toDialect(writer, TextType.instance());
	}


}
