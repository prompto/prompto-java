package presto.literal;

import presto.value.Integer;

public class MaxIntegerLiteral extends IntegerLiteral {

	public MaxIntegerLiteral() {
		super("MAX_INTEGER", new Integer(Long.MAX_VALUE));
	}
}
