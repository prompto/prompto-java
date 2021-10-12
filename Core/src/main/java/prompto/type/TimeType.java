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
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.RangeBase;
import prompto.value.TimeValue;
import prompto.value.TimeRange;

import com.fasterxml.jackson.databind.JsonNode;


public class TimeType extends NativeType {

	static TimeType instance = new TimeType();

	public static TimeType instance() {
		return instance;
	}

	private TimeType() {
		super(Family.TIME);
	}

	@Override
	public Type toJavaType(Context context) {
		return PromptoTime.class;
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof PromptoTime)
            return new prompto.value.TimeValue((PromptoTime)value);
        else
        	return super.convertJavaValueToIValue(context, value);
	}


	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==DateTimeType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if (other instanceof PeriodType)
			return TimeType.instance();
		return super.checkAdd(context, other, tryReverse, section);
	}

	@Override
	public IType checkSubstract(Context context, IType other, ICodeSection section) {
		if (other instanceof TimeType)
			return PeriodType.instance();
		else if (other instanceof PeriodType)
			return DateTimeType.instance();
		else
			return super.checkSubstract(context, other, section);
	}

	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if (other instanceof TimeType)
			return;
		else
			super.checkCompare(context, other, section);
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
		if (left instanceof TimeValue && right instanceof TimeValue)
			return new TimeRange((TimeValue) left, (TimeValue) right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<TimeValue> getNativeComparator(boolean descending) {
		return descending ?
				new Comparator<TimeValue>() {
					@Override
					public int compare(TimeValue o1, TimeValue o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<TimeValue>() {
					@Override
					public int compare(TimeValue o1, TimeValue o2) {
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
		return new TimeValue(time);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("LocalTime");
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("LocalTime");
	}
	


	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if (other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if (other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".addPeriod(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
	    if (other == TimeType.instance() || other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right, section);
	}

	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if (other == TimeType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".subtractTime(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else if (other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".subtractPeriod(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileSubtract(transpiler, other, left, right);
	}
	
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "hour":
		case "minute":
		case "second":
		case "millisecond":
			break;
		default:
			super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
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
		default:
			super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareRange(Transpiler transpiler, IType other) {
	    if(other == TimeType.instance()) {
	        transpiler.require("Range");
	        transpiler.require("TimeRange");
	    } else {
	        super.declareRange(transpiler, other);
	    }
	}
	
	@Override
	public void transpileRange(Transpiler transpiler, IExpression first, IExpression last) {
	    transpiler.append("new TimeRange(");
	    first.transpile(transpiler);
	    transpiler.append(",");
	    last.transpile(transpiler);
	    transpiler.append(")");
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
	public void transpileJsxCode(Transpiler transpiler, IExpression expression) {
		transpiler.append("StringOrNull(");
		expression.transpile(transpiler);
		transpiler.append(")");
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags);
		if(right.getType()!=PromptoPeriod.class)
			throw new SyntaxError("Illegal: Date + " + exp.getClass().getSimpleName());
		MethodConstant oper = new MethodConstant(PromptoTime.class, "plus", PromptoPeriod.class, PromptoTime.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(PromptoTime.class);
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags);
		if(right.getType()==PromptoTime.class) {
			MethodConstant oper = new MethodConstant(PromptoTime.class, "minus", 
					PromptoTime.class, PromptoPeriod.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoPeriod.class);
		} else if(right.getType()==PromptoPeriod.class) {
			MethodConstant oper = new MethodConstant(PromptoTime.class, "minus", PromptoPeriod.class, PromptoTime.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoTime.class);
			
		} else
			throw new SyntaxError("Illegal: Date + " + exp.getClass().getSimpleName());
	}

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoTime.class, 
				"compareTo", PromptoTime.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseType.compileCompareToEpilogue(method, flags);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoTime.class, 
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
}
