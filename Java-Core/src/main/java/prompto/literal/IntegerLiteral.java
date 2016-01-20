package prompto.literal;

import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.value.Integer;

public class IntegerLiteral extends Literal<Integer> {

	public IntegerLiteral(String text) {
		super(text, new Integer(Long.valueOf(text)));
	}

	public IntegerLiteral(long value) {
		super(Long.toString(value), new Integer(value));
	}
	
	public IntegerLiteral(String text, Integer value) {
		super(text, value);
	}

	@Override
	public IType check(Context context) {
		return IntegerType.instance();
	}
	
}
