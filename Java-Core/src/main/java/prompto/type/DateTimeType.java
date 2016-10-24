package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

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
	public Type getJavaType(Context context) {
		return PromptoDateTime.class;
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof PromptoDateTime)
            return new prompto.value.DateTime((PromptoDateTime)value);
        else
        	return super.convertJavaValueToIValue(context, value);
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
		else if (other instanceof PeriodType)
			return this;
		else
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
		else if ("millisecond".equals(name))
			return IntegerType.instance();
		else if ("tzOffset".equals(name))
			return IntegerType.instance();
		else if ("tzName".equals(name))
			return TextType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public Comparator<DateTime> getComparator(boolean descending) {
		return descending ? 
				new Comparator<DateTime>() {
					@Override
					public int compare(DateTime o1, DateTime o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<DateTime>() {
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
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		PromptoDateTime dt = PromptoDateTime.parse(value.asText());
		return new DateTime(dt);
	}
}
