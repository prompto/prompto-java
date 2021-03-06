package prompto.literal;

import prompto.transpiler.Transpiler;
import prompto.value.IntegerValue;

public class MaxIntegerLiteral extends IntegerLiteral {

	public MaxIntegerLiteral() {
		super("MAX_INTEGER", new IntegerValue(Long.MAX_VALUE));
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("0x20000000000000");
		return false;
	}
}
