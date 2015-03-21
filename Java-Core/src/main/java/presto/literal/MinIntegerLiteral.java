package presto.literal;

import presto.value.Integer;

public class MinIntegerLiteral extends IntegerLiteral {

	public MinIntegerLiteral() {
		super("MIN_INTEGER", new Integer(Long.MIN_VALUE));
	}
}
