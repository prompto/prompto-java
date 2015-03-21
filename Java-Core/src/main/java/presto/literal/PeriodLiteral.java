package presto.literal;

import presto.runtime.Context;
import presto.type.IType;
import presto.type.PeriodType;
import presto.value.Period;


public class PeriodLiteral extends Literal<Period> {

	public PeriodLiteral(String text) {
		super(text,parseDuration(text.substring(1,text.length()-1)));
	}
	
	@Override
	public IType check(Context context) {
		return PeriodType.instance();
	}
	
	public static Period parseDuration(String text) {
		return new Period(org.joda.time.Period.parse(text));
	}
	
	
	
	
}
