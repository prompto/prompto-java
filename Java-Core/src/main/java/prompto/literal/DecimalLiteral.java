package prompto.literal;

import prompto.runtime.Context;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.value.Decimal;

public class DecimalLiteral extends Literal<Decimal> {

	public DecimalLiteral(String text) {
		super(text,Decimal.Parse(text));
	}

	@Override
	public IType check(Context context) {
		return DecimalType.instance();
	}
}
