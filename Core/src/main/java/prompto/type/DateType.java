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
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoTime;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.DateValue;
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
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof PromptoDate)
            return new prompto.value.DateValue((PromptoDate)value);
        else
        	return super.convertJavaValueToIValue(context, value);
	}

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==DateTimeType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ISection section) {
		if (other instanceof PeriodType)
			return this; // ignore time section since it cannot be guessed
		else if (other instanceof TimeType)
			return DateTimeType.instance(); 
		else
			return super.checkAdd(context, other, tryReverse, section);
	}

	@Override
	public IType checkSubstract(Context context, IType other, ISection section) {
		if (other instanceof PeriodType)
			return this; // ignore time section
		else if (other instanceof DateType)
			return PeriodType.instance();
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
		if (left instanceof DateValue && right instanceof DateValue)
			return new DateRange((DateValue) left, (DateValue) right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<DateValue> getNativeComparator(boolean descending) {
		return descending ?
				new Comparator<DateValue>() {
					@Override
					public int compare(DateValue o1, DateValue o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<DateValue>() {
					@Override
					public int compare(DateValue o1, DateValue o2) {
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
		return new DateValue(date);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("LocalDate");
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("LocalDate");
	}
	

	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ISection section) {
	    if (other == PeriodType.instance() || other == TimeType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	        if(other == TimeType.instance())
	        	transpiler.require("DateTime");
	    } else
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if (other == PeriodType.instance() || other == TimeType.instance()) {
	        left.transpile(transpiler);
	        if(other == PeriodType.instance())
	        	transpiler.append(".addPeriod(");
	        else
	        	transpiler.append(".addTime(");
        	right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ISection section) {
	    if (other == PeriodType.instance() || other == DateType.instance()) {
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
	    } else if (other == DateType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".subtractDate(");
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
		default:
	        super.transpileMember(transpiler, name);
	    }
	}
	
	@Override
	public void declareRange(Transpiler transpiler, IType other) {
	    if(other == DateType.instance()) {
	        transpiler.require("Range");
	        transpiler.require("DateRange");
	    } else {
	        super.declareRange(transpiler, other);
	    }
	}
	
	@Override
	public void transpileRange(Transpiler transpiler, IExpression first, IExpression last) {
	    transpiler.append("new DateRange(");
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
	public void transpileSortedComparator(Transpiler transpiler, IExpression key, boolean descending) {
	    if(descending)
	        transpiler.append("function(o1, o2) { return o1.equals(o2) ? 0 : o1.gt(o2) ? -1 : 1; }");
	    else
	        transpiler.append("function(o1, o2) { return o1.equals(o2) ? 0 : o1.gt(o2) ? 1 : -1; }");
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
		if(right.getType()!=PromptoPeriod.class && right.getType()!=PromptoTime.class)
			throw new SyntaxError("Illegal: Date + " + exp.getClass().getSimpleName());
		if(right.getType()==PromptoPeriod.class) {
			MethodConstant oper = new MethodConstant(PromptoDate.class, "plus", PromptoPeriod.class, PromptoDate.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoDate.class);
		} else {
			MethodConstant oper = new MethodConstant(PromptoDate.class, "plus", PromptoTime.class, PromptoDateTime.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoDateTime.class);
		}
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags);
		if(right.getType()==PromptoDate.class) {
			MethodConstant oper = new MethodConstant(PromptoDate.class, "minus", 
					PromptoDate.class, PromptoPeriod.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoPeriod.class);
		} else if(right.getType()==PromptoPeriod.class) {
			MethodConstant oper = new MethodConstant(PromptoDate.class, "minus", 
					PromptoPeriod.class, PromptoDate.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(PromptoDate.class);
		} else
			throw new SyntaxError("Illegal: Date - " + exp.getClass().getSimpleName());
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDate.class, 
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
		IOperand oper = new MethodConstant(PromptoDate.class, 
				"compareTo", PromptoDate.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseType.compileCompareToEpilogue(method, flags);
	}

}
