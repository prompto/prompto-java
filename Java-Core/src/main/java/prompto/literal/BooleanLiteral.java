package prompto.literal;

import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.value.Boolean;

public class BooleanLiteral extends Literal<Boolean> {

	public BooleanLiteral(String text) {
		super(text, Boolean.parse(text));
	}
	
	@Override
	public IType check(Context context) {
		return BooleanType.instance();
	}
	
}
