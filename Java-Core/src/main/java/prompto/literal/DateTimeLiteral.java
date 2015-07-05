package prompto.literal;

import prompto.runtime.Context;
import prompto.type.DateTimeType;
import prompto.type.IType;
import prompto.value.DateTime;


public class DateTimeLiteral extends Literal<DateTime> {

	public DateTimeLiteral(String text) {
		super(text,parseDateTime(text.substring(1,text.length()-1)));
	}
	
	@Override
	public IType check(Context context) {
		return DateTimeType.instance();
	}
	
	public static DateTime parseDateTime(String text) {
		return new DateTime(org.joda.time.DateTime.parse(text));
	}
	
	
	
	
}
