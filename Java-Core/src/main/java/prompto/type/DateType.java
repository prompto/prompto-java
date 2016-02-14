package prompto.type;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.Date;
import prompto.value.DateRange;
import prompto.value.IContainer;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.Range;


public class DateType extends NativeType {

	static DateType instance = new DateType();

	public static DateType instance() {
		return instance;
	}

	private DateType() {
		super("Date");
	}

	@Override
	public Class<?> toJavaClass() {
		return Date.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DateType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if (other instanceof PeriodType)
			return this; // ignore time section
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
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
	public IType checkCompare(Context context, IType other, ISection section) throws SyntaxError {
		if (other instanceof DateType)
			return BooleanType.instance();
		if (other instanceof DateTimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}

	@Override
	public IType checkRange(Context context, IType other) throws SyntaxError {
		if (other instanceof DateType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}

	@Override
	public IType checkMember(Context context, Identifier id) throws SyntaxError {
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
	public Range<?> newRange(Object left, Object right) throws SyntaxError {
		if (left instanceof Date && right instanceof Date)
			return new DateRange((Date) left, (Date) right);
		return super.newRange(left, right);
	}

	@Override
	public ListValue sort(Context context, IContainer<IValue> list) throws PromptoError {
		return this.doSort(context, list);
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		LocalDate date = LocalDate.parse(value.asText());
		return new Date(date);
	}
}
