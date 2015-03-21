package presto.literal;

import presto.runtime.Context;
import presto.type.DecimalType;
import presto.type.IType;
import presto.value.Decimal;

public class DecimalLiteral extends Literal<Decimal> {

	public DecimalLiteral(String text) {
		super(text,Decimal.Parse(text));
	}

	@Override
	public IType check(Context context) {
		return DecimalType.instance();
	}
}
