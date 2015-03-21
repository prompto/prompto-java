package presto.literal;

import org.joda.time.LocalTime;

import presto.runtime.Context;
import presto.type.IType;
import presto.type.TimeType;
import presto.value.Time;


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
