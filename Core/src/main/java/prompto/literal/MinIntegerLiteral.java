package prompto.literal;

import prompto.value.Integer;

public class MinIntegerLiteral extends IntegerLiteral {

	public MinIntegerLiteral() {
		super("MIN_INTEGER", new Integer(Long.MIN_VALUE));
	}
}
