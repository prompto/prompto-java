package presto.literal;

import org.joda.time.LocalDate;

import presto.runtime.Context;
import presto.type.DateType;
import presto.type.IType;
import presto.value.Date;


public class DateLiteral extends Literal<Date> {

	public DateLiteral(String text) {
		super(text,parseDate(text.substring(1,text.length()-1)));
	}
	
	@Override
	public IType check(Context context) {
		return DateType.instance();
	}
	
	public static Date parseDate(String text) {
		return new Date(LocalDate.parse(text));
	}
	
	
	
	
}
