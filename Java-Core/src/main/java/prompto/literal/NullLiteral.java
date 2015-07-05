package prompto.literal;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.NullType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

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
	public IValue interpret(Context context) throws PromptoError {
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
		case S:
			writer.append("None");
			break;
		}
	}

}
