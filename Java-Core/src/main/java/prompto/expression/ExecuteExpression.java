package prompto.expression;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.CodeValue;
import prompto.value.IValue;

public class ExecuteExpression extends Section implements IExpression, ISection {

	Identifier name;
	
	public ExecuteExpression(Identifier name) {
		this.name = name;
	}

	public Identifier getName() {
		return name;
	}
		
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("execute: ");
			writer.append(name);
			break;
		case O:
		case S:
			writer.append("execute(");
			writer.append(name);
			writer.append(")");
			break;
		}
	}
	
	@Override
	public IType check(Context context) {
		try {
			IValue value = context.getValue(name);
			if(value instanceof CodeValue)
				return ((CodeValue) value).check(context);
			else
				throw new SyntaxError("Expected code, got:" + value.toString());
		} catch(PromptoError e) {
			throw new SyntaxError(e.getMessage());
		}
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue value = context.getValue(name);
		if(value instanceof CodeValue)
			return ((CodeValue) value).interpret(context);
		else
			throw new SyntaxError("Expected code, got:" + value.toString());
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IValue value = context.getValue(name);
		if(value instanceof CodeValue)
			return ((CodeValue) value).compile(context, method, flags);
		else
			throw new SyntaxError("Expected code, got:" + value.toString());
	}
	
}
