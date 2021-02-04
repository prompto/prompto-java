package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.DecimalValue;
import prompto.value.INumberValue;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class DecimalType extends NativeType implements INumberType {

	static DecimalType instance = new DecimalType();

	public static DecimalType instance() {
		return instance;
	}

	private DecimalType() {
		super(Family.DECIMAL);
	}

	@Override
	public Type getJavaType(Context context) {
		return Double.class;
	}

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) || other == IntegerType.instance();
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if (other instanceof IntegerType)
			return this;
		if (other instanceof DecimalType)
			return this;
		return super.checkAdd(context, other, tryReverse, section);
	}

	@Override
	public IType checkSubstract(Context context, IType other, ICodeSection section) {
		if (other instanceof IntegerType)
			return this;
		if (other instanceof DecimalType)
			return this;
		return super.checkSubstract(context, other, section);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if (other instanceof IntegerType)
			return this;
		if (other instanceof DecimalType)
			return this;
		return super.checkMultiply(context, other, tryReverse, section);
	}

	@Override
	public IType checkDivide(Context context, IType other, ICodeSection section) {
		if (other instanceof IntegerType)
			return this;
		if (other instanceof DecimalType)
			return this;
		return super.checkDivide(context, other, section);
	}

	@Override
	public IType checkIntDivide(Context context, IType other, ICodeSection section) {
		if (other instanceof IntegerType)
			return other;
		return super.checkIntDivide(context, other, section);
	}

	@Override
	public IType checkModulo(Context context, IType other, ICodeSection section) {
		if (other instanceof IntegerType)
			return this;
		if (other instanceof DecimalType)
			return this;
		return super.checkModulo(context, other, section);
	}

	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if (other instanceof IntegerType || other instanceof DecimalType)
			return;
		else
			super.checkCompare(context, other, section);
	}

	@Override
	public Comparator<INumberValue> getNativeComparator(boolean descending) {
		return descending ? new Comparator<INumberValue>() {
			@Override
			public int compare(INumberValue o1, INumberValue o2) {
				return java.lang.Double.compare(o2.doubleValue(), o1.doubleValue());
			}
		} : new Comparator<INumberValue>() {
			@Override
			public int compare(INumberValue o1, INumberValue o2) {
				return java.lang.Double.compare(o1.doubleValue(), o2.doubleValue());
			}
		};
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if (value instanceof Number)
			return new DecimalValue(((Number) value).doubleValue());
		else
			return (IValue) value; // TODO for now
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return new DecimalValue(value.asDouble());
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Utils"); // equals etc...
	}


	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("'Decimal'");
	}

	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
		if (other == IntegerType.instance() || other == DecimalType.instance()) {
			left.declare(transpiler);
			right.declare(transpiler);
		} else
			super.declareAdd(transpiler, other, tryReverse, left, right, section);
	}

	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
		if (other == IntegerType.instance() || other == DecimalType.instance()) {
			left.transpile(transpiler);
			transpiler.append(" + ");
			right.transpile(transpiler);
		} else
			super.transpileAdd(transpiler, other, tryReverse, left, right);
	}

	@Override
	public void declareDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
		if (other == IntegerType.instance() || other == DecimalType.instance()) {
			transpiler.require("divide");
			left.declare(transpiler);
			right.declare(transpiler);
		} else
			super.declareDivide(transpiler, other, left, right, section);
	}

	@Override
	public void transpileDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
		if (other == IntegerType.instance() || other == DecimalType.instance()) {
			transpiler.append("divide(");
			left.transpile(transpiler);
			transpiler.append(", ");
			right.transpile(transpiler);
			transpiler.append(")");
		} else
			super.transpileDivide(transpiler, other, left, right);
	}

	@Override
	public void declareIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
		if (other == IntegerType.instance()) {
			transpiler.require("divide");
			left.declare(transpiler);
			right.declare(transpiler);
		} else
			super.declareIntDivide(transpiler, other, left, right, section);
	}

	@Override
	public void transpileIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
		if (other == IntegerType.instance()) {
			// TODO check negative values
			transpiler.append("Math.floor(divide(");
			left.transpile(transpiler);
			transpiler.append(", ");
			right.transpile(transpiler);
			transpiler.append("))");
		} else
			super.transpileIntDivide(transpiler, other, left, right);
	}
	
	@Override
	public void declareMinus(Transpiler transpiler, IExpression expression) {
		// nothing to do
	}
	
	@Override
	public void transpileMinus(Transpiler transpiler, IExpression expression) {
	    transpiler.append(" -");
	    expression.transpile(transpiler);
	}
	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if(other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(" * ");
	        right.transpile(transpiler);
	    } else
	        super.transpileMultiply(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
	   if(other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right, section);
	}

	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if(other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(" - ");
	        right.transpile(transpiler);
	    } else
	        super.transpileSubtract(transpiler, other, left, right);
	}
	
	@Override
	public void declareCompare(Transpiler transpiler, IType other) {
		// nothing to do
	}
	
	@Override
	public void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(" ").append(operator.toString()).append(" ");
	    right.transpile(transpiler);
	}
	
	
	@Override
	public void declareModulo(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
		if (!(other instanceof IntegerType || other instanceof DecimalType))
			super.declareModulo(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileModulo(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    if(other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(" % ");
	        right.transpile(transpiler);
	    } else
	        super.transpileModulo(transpiler, other, left, right);
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DADD), left, exp);
	}

	private static ResultInfo compileOperation(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		CompilerUtils.numberToPrimitive(method, left, flags.isDecimal());
		ResultInfo right = exp.compile(context, method, flags);
		CompilerUtils.numberToPrimitive(method, right, flags.isDecimal());
		method.addInstruction(flags.opcode());
		if(flags.isDecimal()) {
			if(flags.toPrimitive())
				return new ResultInfo(double.class);
			else 
				return CompilerUtils.doubleToDouble(method);
		} else {
			if(flags.toPrimitive())
				return new ResultInfo(long.class);
			else 
				return CompilerUtils.longToLong(method);
		}
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DSUB), left, exp);
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DMUL), left, exp);
	}

	public static ResultInfo compileDivide(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DDIV), left, exp);
	}

	public static ResultInfo compileIntDivide(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(false).withOpcode(Opcode.LDIV), left, exp);
	}

	public static ResultInfo compileModulo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		return compileOperation(context, method, flags.withDecimal(true).withOpcode(Opcode.DREM), left, exp);
	}

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		CompilerUtils.numberTodouble(method, left);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		CompilerUtils.numberTodouble(method, right);
		method.addInstruction(Opcode.DCMPG);
		return BaseType.compileCompareToEpilogue(method, flags);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		left = CompilerUtils.numberTodouble(method, left);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		right = CompilerUtils.numberTodouble(method, right);
		method.addInstruction(Opcode.DCMPG);
		Opcode opcode = flags.isReverse() ? Opcode.IFNE : Opcode.IFEQ;
		method.addInstruction(opcode, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_0);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreFullStackState(branchState);
		method.placeLabel(branchState);
		method.addInstruction(Opcode.ICONST_1);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

	public static ResultInfo compileNegate(Context context, MethodInfo method, Flags flags, ResultInfo value) {
		CompilerUtils.numberToPrimitive(method, value, true);
		method.addInstruction(Opcode.DNEG);
		if(flags.toPrimitive())
			return new ResultInfo(double.class);
		else
			return CompilerUtils.doubleToDouble(method);
	}
}
