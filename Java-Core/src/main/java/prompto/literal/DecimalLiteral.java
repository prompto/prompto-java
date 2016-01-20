package prompto.literal;

import prompto.runtime.Context;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.value.Decimal;

public class DecimalLiteral extends Literal<Decimal> {

	public DecimalLiteral(String text) {
		super(text,Decimal.Parse(text));
	}

	public DecimalLiteral(double value) {
		super(Double.toString(value), new Decimal(value));
	}

	@Override
	public IType check(Context context) {
		return DecimalType.instance();
	}
}
