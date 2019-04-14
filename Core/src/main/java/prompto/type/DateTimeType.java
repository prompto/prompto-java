package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDateTime;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.DateTimeValue;
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
            return new prompto.value.DateTimeValue((PromptoDateTime)value);
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
		else if ("date".equals(name))
			return DateType.instance();
		else if ("time".equals(name))
			return TimeType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public Comparator<DateTimeValue> getComparator(boolean descending) {
		return descending ? 
				new Comparator<DateTimeValue>() {
					@Override
					public int compare(DateTimeValue o1, DateTimeValue o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<DateTimeValue>() {
					@Override
					public int compare(DateTimeValue o1, DateTimeValue o2) {
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
		return new DateTimeValue(dt);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("DateTime");
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("DateTime");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if (other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if (other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".addPeriod(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if (other == PeriodType.instance() || other == DateTimeType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right);
	}
	
	
	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if (other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".subtractPeriod(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else if (other == DateTimeType.instance) {
	        left.transpile(transpiler);
	        transpiler.append(".subtractDateTime(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileSubtract(transpiler, other, left, right);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, String name) {
		switch(name) {
		case "year":
		case "month":
		case "dayOfMonth":
		case "dayOfYear":
		case "hour":
		case "minute":
		case "second":
		case "millisecond":
		case "tzOffset":
		case "tzName":
			break;
		case "date":
			transpiler.require("LocalDate");
			break;
		case "time":
			transpiler.require("LocalTime");
			break;
		default:
			super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, String name) {
		switch(name) {
		case "year":
	        transpiler.append("getYear()");
			break;
		case "month":
	        transpiler.append("getMonth()");
			break;
		case "dayOfMonth":
	        transpiler.append("getDayOfMonth()");
			break;
		case "dayOfYear":
	        transpiler.append("getDayOfYear()");
			break;
		case "hour":
	        transpiler.append("getHour()");
			break;
		case "minute":
	        transpiler.append("getMinute()");
			break;
		case "second":
	        transpiler.append("getSecond()");
			break;
		case "millisecond":
	        transpiler.append("getMillisecond()");
			break;
		case "tzOffset":
	        transpiler.append("getTzOffset()");
			break;
		case "tzName":
	        transpiler.append("getTzName()");
			break;
		case "date":
	        transpiler.append("getDate()");
			break;
		case "time":
	        transpiler.append("getTime()");
			break;
		default:
			super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareCompare(Transpiler transpiler, IType other) {
		// nothing to do
	}
	
	@Override
	public void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".");
	    operator.transpile(transpiler);
	    transpiler.append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
}
