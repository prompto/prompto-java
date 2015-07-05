package prompto.literal;

import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.PeriodType;
import prompto.value.Period;


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
