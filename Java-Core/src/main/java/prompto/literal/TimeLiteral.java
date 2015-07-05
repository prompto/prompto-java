package prompto.literal;

import org.joda.time.LocalTime;

import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TimeType;
import prompto.value.Time;


public class TimeLiteral extends Literal<Time> {

	public TimeLiteral(String text) {
		super(text,parseTime(text.substring(1,text.length()-1)));
	}
	
	@Override
	public IType check(Context context) {
		return TimeType.instance();
	}
	
	public static Time parseTime(String text) {
		return new Time(LocalTime.parse(text));
	}
	
	
	
	
}
