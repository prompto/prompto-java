package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.parser.ISection;
import presto.parser.Section;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.CodeValue;
import presto.value.IValue;

public class ExecuteExpression extends Section implements IExpression, ISection {

	String name;
	
	public ExecuteExpression(String name) {
		this.name = name;
	}

	public String getName() {
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
	public IType check(Context context) throws SyntaxError {
		try {
			IValue value = context.getValue(name);
			if(value instanceof CodeValue)
				return ((CodeValue) value).check(context);
			else
				throw new SyntaxError("Expected code, got:" + value.toString());
		} catch(PrestoError e) {
			throw new SyntaxError(e.getMessage());
		}
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue value = context.getValue(name);
		if(value instanceof CodeValue)
			return ((CodeValue) value).interpret(context);
		else
			throw new SyntaxError("Expected code, got:" + value.toString());
	}
	
}
