package presto.literal;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.NullType;
import presto.utils.CodeWriter;
import presto.value.IValue;
import presto.value.NullValue;

public class NullLiteral implements IExpression {

	static NullLiteral instance = new NullLiteral();
	
	public static NullLiteral instance() {
		return instance;
	}

	private NullLiteral() {
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return NullType.instance();
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		return NullValue.instance();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			writer.append("nothing");
			break;
		case O:
			writer.append("null");
			break;
		case P:
			writer.append("None");
			break;
		}
	}

}
