package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoPeriod;
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
	public IType checkAdd(Context context, IType other, boolean tryReverse, ISection section) {
		if (other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse, section);
	}

	@Override
	public IType checkSubstract(Context context, IType other, ISection section) {
		if (other instanceof DateTimeType)
			return PeriodType.instance();
		else if (other instanceof PeriodType)
			return this;
		else
			return super.checkSubstract(context, other, section);
	}

	@Override
	public void checkCompare(Context context, IType other, ISection section) {
		if (other instanceof DateType)
			return;
		else if (other instanceof DateTimeType)
			return;
		else
			super.checkCompare(context, other, section);
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
	public Comparator<DateTimeValue> getNativeComparator(boolean descending) {
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
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ISection section) {
	    if (other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
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
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ISection section) {
	    if (other == PeriodType.instance() || other == DateTimeType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right, section);
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
	public void declareMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
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
	public void transpileMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
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
	
	@Override
	public void transpileJsxCode(Transpiler transpiler) {
		transpiler.append(".toString()");
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		ResultInfo right = value.compile(context, method, flags);
		if(right.getType()!=PromptoPeriod.class)
			throw new SyntaxError("Illegal: DateTime + " + value.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoDateTime.class, "plus", 
				PromptoPeriod.class, PromptoDateTime.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoDateTime.class);
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		ResultInfo right = value.compile(context, method, flags);
		if(right.getType()==PromptoDateTime.class) {
			MethodConstant c = new MethodConstant(PromptoDateTime.class, "minus", 
					PromptoDateTime.class, PromptoPeriod.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			return new ResultInfo(PromptoPeriod.class);
		} else if(right.getType()==PromptoPeriod.class) {
			MethodConstant c = new MethodConstant(PromptoDateTime.class, "minus", 
					PromptoPeriod.class, PromptoDateTime.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, c);
			return new ResultInfo(PromptoDateTime.class);
		} else
			throw new SyntaxError("Illegal: DateTime - " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDateTime.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse())
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoDateTime.class, 
				"compareTo", PromptoDateTime.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseType.compileCompareToEpilogue(method, flags);
	}
}
