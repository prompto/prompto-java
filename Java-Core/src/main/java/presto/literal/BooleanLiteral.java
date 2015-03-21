package presto.literal;

import presto.runtime.Context;
import presto.type.BooleanType;
import presto.type.IType;
import presto.value.Boolean;

public class BooleanLiteral extends Literal<Boolean> {

	public BooleanLiteral(String text) {
		super(text, Boolean.Parse(text));
	}
	
	@Override
	public IType check(Context context) {
		return BooleanType.instance();
	}
	
}
