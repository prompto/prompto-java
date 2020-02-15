package prompto.type;

import java.lang.reflect.Type;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoPeriod;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.PeriodValue;



public class PeriodType extends NativeType {

	static PeriodType instance = new PeriodType();
	
	public static PeriodType instance() {
		return instance;
	}
	
	private PeriodType() {
		super(Family.PERIOD);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoPeriod.class;
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if(value instanceof PromptoPeriod)
			return new PeriodValue((PromptoPeriod)value);
		else
			return super.convertJavaValueToIValue(context, value);
	}
	

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		if(other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other) {
		if(other instanceof PeriodType)
			return this;
		return super.checkSubstract(context, other);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse);
	}

	@Override
	public IType checkCompare(Context context, IType other, ISection section) {
		if(other instanceof PeriodType)
			return BooleanType.instance();
		return super.checkCompare(context, other, section);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Period");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if(other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right);
	    }
	}
	
	@Override
	public void declareMinus(Transpiler transpiler, IExpression expression) {
		 // nothing to do
	}
	
	@Override
	public void transpileMinus(Transpiler transpiler, IExpression expression) {
		expression.transpile(transpiler);
	    transpiler.append(".minus()");
	}
	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if(other == IntegerType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    if(other == IntegerType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".multiply(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileMultiply(transpiler, other, tryReverse, left, right);	
    }
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if(other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right);
	}
	
	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if(other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".subtract(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileSubtract(transpiler, other, left, right);
	}
	
	@Override
	public void transpileCode(Transpiler transpiler) {
		transpiler.append(".toString()");
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags,
			ResultInfo left, IExpression exp)
			throws SyntaxError {
		ResultInfo right = exp.compile(context, method, flags);
		if (right.getType() != PromptoPeriod.class)
			throw new SyntaxError("Illegal: Period + "
					+ exp.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoPeriod.class, "plus",
				PromptoPeriod.class, PromptoPeriod.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoPeriod.class);
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags,
			ResultInfo left, IExpression exp)
			throws SyntaxError {
		ResultInfo right = exp.compile(context, method, flags);
		if (right.getType() != PromptoPeriod.class)
			throw new SyntaxError("Illegal: Period - "
					+ exp.getClass().getSimpleName());
		MethodConstant c = new MethodConstant(PromptoPeriod.class, "minus",
				PromptoPeriod.class, PromptoPeriod.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		return new ResultInfo(PromptoPeriod.class);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoPeriod.class, 
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

	public static ResultInfo compileNegate(Context context, MethodInfo method, Flags flags,
			ResultInfo value) {
		MethodConstant oper = new MethodConstant(PromptoPeriod.class, "negate",
				PromptoPeriod.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(PromptoPeriod.class);
	}
}
