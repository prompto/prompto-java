package presto.type;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.value.Date;
import presto.value.DateRange;
import presto.value.ICollection;
import presto.value.IValue;
import presto.value.ListValue;
import presto.value.Range;


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
	public IType checkCompare(Context context, IType other) throws SyntaxError {
		if (other instanceof DateType)
			return BooleanType.instance();
		if (other instanceof DateTimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other);
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
	public ListValue sort(Context context, ICollection<IValue> list) throws PrestoError {
		return this.doSort(context, list);
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
}
