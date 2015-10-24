package prompto.type;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.value.IContainer;
import prompto.value.IValue;
import prompto.value.ListValue;


public class DateTimeType extends NativeType {

	static DateTimeType instance = new DateTimeType();

	public static DateTimeType instance() {
		return instance;
	}

	private DateTimeType() {
		super("DateTime");
	}

	@Override
	public Class<?> toJavaClass() {
		return DateTime.class;
	}

	@Override
	public boolean isAssignableTo(Context context, IType other) {
		return (other instanceof DateTimeType) || (other instanceof DateType) || (other instanceof TimeType) || (other instanceof AnyType);
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		if (other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
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
	public IType checkCompare(Context context, IType other, ISection section) throws SyntaxError {
		if (other instanceof DateType)
			return BooleanType.instance();
		if (other instanceof DateTimeType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
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
	public ListValue sort(Context context, IContainer<IValue> list) throws PromptoError {
		return this.doSort(context, list);
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}

	@Override
	public IValue readJSONValue(JsonNode value) {
		DateTime dt = DateTime.parse(value.asText());
		return new prompto.value.DateTime(dt);
	}
}
