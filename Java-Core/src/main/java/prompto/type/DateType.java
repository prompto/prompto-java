package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.Date;
import prompto.value.DateRange;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;


public class DateType extends NativeType {

	static DateType instance = new DateType();

	public static DateType instance() {
		return instance;
	}

	private DateType() {
		super(Family.DATE);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoDate.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==DateTimeType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if (other instanceof PeriodType)
			return this; // ignore time section
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) {
		if (other instanceof PeriodType)
			return this; // ignore time section
		else if (other instanceof DateType)
			return PeriodType.instance();
		else if (other instanceof TimeType)
			return PeriodType.instance();
		else if (other instanceof DateTimeType)
			return PeriodType.instance();
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if (other instanceof DateType)
			return BooleanType.instance();
		if (other instanceof DateTimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}

	@Override
	public IType checkRange(Context context, IType other) {
		if (other instanceof DateType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("year".equals(name))
			return IntegerType.instance();
		else if ("month".equals(name))
			return IntegerType.instance();
		else if ("dayOfMonth".equals(name))
			return IntegerType.instance();
		else if ("dayOfYear".equals(name))
			return IntegerType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		if (left instanceof Date && right instanceof Date)
			return new DateRange((Date) left, (Date) right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<Date> getComparator() {
		return new Comparator<Date>() {
			@Override
			public int compare(Date o1, Date o2) {
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
		PromptoDate date = PromptoDate.parse(value.asText());
		return new Date(date);
	}
}
