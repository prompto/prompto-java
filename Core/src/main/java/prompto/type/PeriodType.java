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
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoPeriod;
import prompto.parser.ICodeSection;
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
	public Type toJavaType(Context context) {
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
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof PeriodType)
			return this;
		return super.checkAdd(context, other, tryReverse, section);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other, ICodeSection section) {
		if(other instanceof PeriodType)
			return this;
		return super.checkSubstract(context, other, section);
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof IntegerType)
			return this;
		return super.checkMultiply(context, other, tryReverse, section);
	}

	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if(other instanceof PeriodType)
			return;
		else
			super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("years".equals(name))
			return IntegerType.instance();
		else if ("months".equals(name))
			return IntegerType.instance();
		else if ("weeks".equals(name))
			return IntegerType.instance();
		else if ("days".equals(name))
			return IntegerType.instance();
		else if ("hours".equals(name))
			return IntegerType.instance();
		else if ("minutes".equals(name))
			return IntegerType.instance();
		else if ("seconds".equals(name))
			return IntegerType.instance();
		else if ("milliseconds".equals(name))
			return IntegerType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Period");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	   if(other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else {
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
	    }
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	   if(other == PeriodType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".add(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else {
	        super.transpileAdd(transpiler, other, tryReverse, left, right, section);
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
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if(other == IntegerType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
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
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
	   if(other == PeriodType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right, section);
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
	public void declareMember(Transpiler transpiler, Identifier name) {
		switch(name.toString()) {
		case "years":
		case "months":
		case "weeks":
		case "days":
		case "hours":
		case "minutes":
		case "seconds":
		case "milliseconds":
			break;
		default:
			super.declareMember(transpiler, name);
	    }
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier id) {
		String name = id.toString();
		switch(name) {
		case "years":
		case "months":
		case "weeks":
		case "days":
		case "hours":
		case "minutes":
		case "seconds":
		case "milliseconds":
			transpiler.append(name);
			break;
		default:
			super.transpileMember(transpiler, id);
	    }
	}
	
	@Override
	public void transpileJsxCode(Transpiler transpiler, IExpression expression) {
		transpiler.append("StringOrNull(");
		expression.transpile(transpiler);
		transpiler.append(")");
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
