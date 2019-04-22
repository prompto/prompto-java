package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class MutableExpression extends Section implements IExpression {

	IExpression source;
	
	public MutableExpression(IExpression source) {
		this.source = source;
	}

	@Override
	public CategoryType check(Context context) {
		IType sourceType = source.check(context);
		if(!(sourceType instanceof CategoryType))
			 throw new SyntaxError("Expected a category instance, got:" + sourceType.toString());
		return new CategoryType((CategoryType)sourceType, true);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		CategoryType type = check(context);
		ConstructorExpression ctor = new ConstructorExpression(type, source, null, true);
		ctor.setFrom(this);
		return ctor.interpret(context);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		CategoryType type = check(transpiler.getContext());
		ConstructorExpression ctor = new ConstructorExpression(type, source, null, true);
		ctor.setFrom(this);
		ctor.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		CategoryType type = check(transpiler.getContext());
		ConstructorExpression ctor = new ConstructorExpression(type, source, null, true);
		ctor.setFrom(this);
		return ctor.transpile(transpiler);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		CategoryType type = check(context);
		ConstructorExpression ctor = new ConstructorExpression(type, source, null, true);
		ctor.setFrom(this);
		return ctor.compile(context, method, flags);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("mutable ");
		source.toDialect(writer);
	}
	
	
}
