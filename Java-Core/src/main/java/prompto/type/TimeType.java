package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoTime;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.IValue;
import prompto.value.RangeBase;
import prompto.value.Time;
import prompto.value.TimeRange;

import com.fasterxml.jackson.databind.JsonNode;


public class TimeType extends NativeType {

	static TimeType instance = new TimeType();

	public static TimeType instance() {
		return instance;
	}

	private TimeType() {
		super(Family.TYPE);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoTime.class;
	}

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==DateTimeType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if (other instanceof PeriodType)
			return TimeType.instance();
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) {
		if (other instanceof TimeType)
			return PeriodType.instance();
		else if (other instanceof PeriodType)
			return DateTimeType.instance();
		else
			return super.checkSubstract(context, other);
	}

	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if (other instanceof TimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}

	@Override
	public IType checkRange(Context context, IType other) {
		if (other instanceof TimeType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("hour".equals(name))
			return IntegerType.instance();
		else if ("minute".equals(name))
			return IntegerType.instance();
		else if ("second".equals(name))
			return IntegerType.instance();
		else if ("millisecond".equals(name))
			return IntegerType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		if (left instanceof Time && right instanceof Time)
			return new TimeRange((Time) left, (Time) right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<Time> getComparator(boolean descending) {
		return descending ?
				new Comparator<Time>() {
					@Override
					public int compare(Time o1, Time o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<Time>() {
					@Override
					public int compare(Time o1, Time o2) {
						return o1.getStorableData().compareTo(o2.getStorableData());
					}
				};
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		PromptoTime time = PromptoTime.parse(value.asText());
		return new Time(time);
	}

}
