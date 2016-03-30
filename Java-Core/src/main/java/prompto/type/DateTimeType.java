package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDateTime;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.DateTime;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;


public class DateTimeType extends NativeType {

	static DateTimeType instance = new DateTimeType();

	public static DateTimeType instance() {
		return instance;
	}

	private DateTimeType() {
		super(Family.DATETIME);
	}

	@Override
	public String getTypeName() {
		return "DateTime";
	}
	
	@Override
	public Type getJavaType() {
		return PromptoDateTime.class;
	}
	
	@Override
	public IValue convertJavaValueToPromptoValue(Context context, Object value) {
        if (value instanceof PromptoDateTime)
            return new prompto.value.DateTime((PromptoDateTime)value);
        else
        	return super.convertJavaValueToPromptoValue(context, value);
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DateTimeType) || (other instanceof DateType) || (other instanceof TimeType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if (other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) {
		if (other instanceof DateTimeType)
			return PeriodType.instance();
		if (other instanceof DateType)
			return PeriodType.instance();
		if (other instanceof TimeType)
			return PeriodType.instance();
		if (other instanceof PeriodType)
			return this;
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
		else if ("hour".equals(name))
			return IntegerType.instance();
		else if ("minute".equals(name))
			return IntegerType.instance();
		else if ("second".equals(name))
			return IntegerType.instance();
		else if ("millis".equals(name))
			return IntegerType.instance();
		else if ("tzOffset".equals(name))
			return IntegerType.instance();
		else if ("tzName".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public Comparator<DateTime> getComparator() {
		return new Comparator<DateTime>() {
			@Override
			public int compare(DateTime o1, DateTime o2) {
				return o1.getStorableData().compareTo(o2.getStorableData());
			}
		};
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		PromptoDateTime dt = PromptoDateTime.parse(value.asText());
		return new DateTime(dt);
	}
}
