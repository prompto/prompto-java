package prompto.type;

import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NamedType;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.declaration.BuiltInMethodDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoChar;
import prompto.intrinsic.PromptoLong;
import prompto.intrinsic.PromptoString;
import prompto.param.CategoryParameter;
import prompto.param.IParameter;
import prompto.parser.ISection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.value.DecimalValue;
import prompto.value.IMultiplyable;
import prompto.value.INumberValue;
import prompto.value.IValue;
import prompto.value.IntegerRange;
import prompto.value.IntegerValue;
import prompto.value.RangeBase;
import prompto.value.TextValue;

public class IntegerType extends NativeType implements INumberType {

	static IntegerType instance = new IntegerType();
	
	public static IntegerType instance() {
		return instance;
	}
	
	private IntegerType() {
		super(Family.INTEGER);
	}
	
	@Override
	public Type getJavaType(Context context) {
		return Long.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other instanceof DecimalType;
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ISection section) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return other;
		return super.checkAdd(context, other, tryReverse, section);
	}
	
	@Override
	public IType checkSubstract(Context context, IType other, ISection section) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return other;
		return super.checkSubstract(context, other, section);
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ISection section) {
		if(other instanceof IntegerType)
			return this;
		if(other instanceof DecimalType)
			return other;
		if(other instanceof CharacterType)
			return TextType.instance();
		if(other instanceof TextType)
			return other;
		if(other instanceof PeriodType)
			return other;
		if(other instanceof ListType)
			return other;
		return super.checkMultiply(context, other, tryReverse, section);
	}

	@Override
	public IType checkDivide(Context context, IType other, ISection section) {
		if(other instanceof IntegerType)
			return DecimalType.instance();
		if(other instanceof DecimalType)
			return other;
		return super.checkDivide(context, other, section);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other, ISection section) {
		if(other instanceof IntegerType)
			return this;
		return super.checkIntDivide(context, other, section);
	}

	@Override
	public IType checkModulo(Context context, IType other, ISection section) {
		if(other instanceof IntegerType)
			return this;
		return super.checkModulo(context, other, section);
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		if(id.toString().equals("min"))
			return this;
		else if(id.toString().equals("max"))
			return this;
		else
			return super.checkMember(context, id);
	}

	@Override
	public IValue getStaticMemberValue(Context context, Identifier id) throws PromptoError {
		if(id.toString().equals("min"))
			return new IntegerValue(Integer.MIN_VALUE);
		else if(id.toString().equals("max"))
			return new IntegerValue(Integer.MAX_VALUE);
		else
			return super.getStaticMemberValue(context, id);
	}
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		switch(id.toString()) {
		case "format":
			return new HashSet<>(Collections.singletonList(FORMAT_METHOD));
		default:
			return super.getMemberMethods(context, id);
		}
	}
	
	
	static IParameter FORMAT_ARGUMENT = new CategoryParameter(TextType.instance(), new Identifier("format"));

	static final IMethodDeclaration FORMAT_METHOD = new BuiltInMethodDeclaration("format", FORMAT_ARGUMENT) {
		
		@Override
		public IValue interpret(Context context) throws PromptoError {
			Long value = (Long)getValue(context).getStorableData();
			String format = (String)context.getValue(new Identifier("format")).getStorableData();
			String result = new DecimalFormat(format).format(value);
			return new TextValue(result);
		};
		
		
		
		@Override
		public IType check(Context context) {
			return TextType.instance();
		}

		@Override
		public void declarationToDialect(CodeWriter writer) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public boolean hasCompileExactInstanceMember() {
			return true;
		}
		
		@Override
		public prompto.compiler.ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
			// push arguments on the stack
			this.compileParameters(context, method, flags, arguments); // stack = Long/String
			// create DecimalFormat instance
			CompilerUtils.compileNewRawInstance(method, DecimalFormat.class); // stack = Long/String/DecimalFormat
			method.addInstruction(Opcode.DUP_X1); // need to keep a reference, stack = Long/DecimalFormat/String/DecimalFormat
			method.addInstruction(Opcode.SWAP); // stack = Long/DecimalFormat/DecimalFormat/String
			CompilerUtils.compileCallConstructor(method, DecimalFormat.class, String.class); // stack = Long/DecimalFormat
			// call format method
			method.addInstruction(Opcode.SWAP); // stack = DecimalFormat/Long
			Descriptor.Method descriptor = new Descriptor.Method(Object.class, String.class);
			MethodConstant constant = new MethodConstant(Format.class, "format", descriptor);
			method.addInstruction(Opcode.INVOKEVIRTUAL, constant);
			// done
			return new ResultInfo(String.class);

		}
		
		@Override
		public void transpileCall(Transpiler transpiler, ArgumentList arguments) {
	        transpiler.append("formatInteger(");
	        arguments.get(0).transpile(transpiler, null);
	        transpiler.append(")");
		}
	};
	
	@Override
	public void checkCompare(Context context, IType other, ISection section) {
		if(other instanceof IntegerType || other instanceof DecimalType)
			return;
		else
			super.checkCompare(context, other, section);
	}
	
	@Override
	public IType checkRange(Context context, IType other) {
		if(other instanceof IntegerType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}
	
	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		if(left instanceof IntegerValue && right instanceof IntegerValue)
			return new IntegerRange((IntegerValue)left,(IntegerValue)right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<INumberValue> getNativeComparator(boolean descending) {
		return descending ? 
				(o1, o2) -> java.lang.Long.compare(o2.longValue(), o1.longValue()) :
				(o1, o2) -> java.lang.Long.compare(o1.longValue(), o2.longValue());
	}

	@Override
	public IValue convertIValueToIValue(Context context, IValue value) {
		if (value instanceof IntegerValue)
			return value;
		else if(value instanceof DecimalValue)
			return new IntegerValue(((DecimalValue)value).longValue());
		else if (value instanceof TextValue)
            return IntegerValue.Parse(value.toString());
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof Number)
            return new IntegerValue(((Number)value).longValue());
        else
            return (IValue)value; // TODO for now
	}

	@Override
	public void compileConvertObjectToExact(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoLong.class, "convertObjectToExact", Object.class, Long.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
	}
	

	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return new IntegerValue(value.asLong());
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Utils"); // equals etc...
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("'Integer'");
	}

	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ISection section) {
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
	public void declareModulo(Transpiler transpiler, IType other, IExpression left, IExpression right, ISection section) {
		   if (other == IntegerType.instance() ) {
		        left.declare(transpiler);
		        right.declare(transpiler);
		    } else
		        super.declareModulo(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileModulo(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if (other == IntegerType.instance() ) {
	        // TODO check negative values
	        left.transpile(transpiler);
	        transpiler.append(" % ");
	        right.transpile(transpiler);
	    } else
	        super.transpileModulo(transpiler, other, left, right);
	}
	
	@Override
	public void declareDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ISection section) {
		transpiler.require("divide");
	    if (other == IntegerType.instance() || other == DecimalType.instance()) {
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
	public void declareIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ISection section) {
	   if (other == IntegerType.instance() ) {
		    transpiler.require("divide");
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareIntDivide(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if (other == IntegerType.instance() ) {
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
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ISection section) {
	   if (other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if (other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(" * ");
	        right.transpile(transpiler);
	    } else
	        super.transpileMultiply(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ISection section) {
	   if (other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	   if (other == IntegerType.instance() || other == DecimalType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(" - ");
	        right.transpile(transpiler);
	    } else
	        super.transpileSubtract(transpiler, other, left, right);
	}
	
	@Override
	public void declareCompare(Transpiler transpiler, IType rt) {
		// nothing to do
	}
	
	@Override
	public void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(" ").append(operator.toString()).append(" ");
	    right.transpile(transpiler);
	}
	
	@Override
	public void declareRange(Transpiler transpiler, IType other) {
	   if(other == IntegerType.instance()) {
	        transpiler.require("Range");
	        transpiler.require("IntegerRange");
	    } else {
	        super.declareRange(transpiler, other);
	    }	
   }
	
	@Override
	public void transpileRange(Transpiler transpiler, IExpression first, IExpression last) {
	    transpiler.append("new IntegerRange(");
	    first.transpile(transpiler);
	    transpiler.append(",");
	    last.transpile(transpiler);
	    transpiler.append(")");
	}

	public static boolean isDecimal(Context context, IExpression exp) {
		IType other = exp.check(context);
		if(other instanceof EnumeratedNativeType)
			other = ((EnumeratedNativeType)other).getDerivedFrom();
		return other==DecimalType.instance();
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToPrimitive(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(isDecimal));
		CompilerUtils.numberToPrimitive(method, right, isDecimal);
		if(isDecimal) {
			method.addInstruction(Opcode.DADD);
			if(flags.toPrimitive())
				return new ResultInfo(double.class);
			else
				return CompilerUtils.doubleToDouble(method);
		} else {
			method.addInstruction(Opcode.LADD);
			if(flags.toPrimitive())
				return new ResultInfo(long.class);
			else
				return CompilerUtils.longToLong(method);
		}
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToPrimitive(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(isDecimal));
		CompilerUtils.numberToPrimitive(method, right, isDecimal);
		if(isDecimal) {
			method.addInstruction(Opcode.DSUB);
			if(flags.toPrimitive())
				return new ResultInfo(double.class);
			else
				return CompilerUtils.doubleToDouble(method);
		} else {
			method.addInstruction(Opcode.LSUB);
			if(flags.toPrimitive())
				return new ResultInfo(long.class);
			else
				return CompilerUtils.longToLong(method);
		}
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		IType type = exp.check(context);
		if(type instanceof INumberType)
			return compileMultiplyNumber(context, method, flags, left, exp);
		else if(type==CharacterType.instance())
			return compileMultiplyCharacter(context, method, flags, left, exp);
		else if(type==TextType.instance())
			return compileMultiplyText(context, method, flags, left, exp);
		else if(type.getJavaType(context) instanceof NamedType)
			return compileMultiplyCategory(context, method, flags, left, exp);
		else if(IMultiplyable.class.isAssignableFrom((Class<?>)type.getJavaType(context)))
			return compileMultiplyMultiplyable(context, method, flags, left, exp);
		else
			throw new SyntaxError("Illegal: Integer * " + type.getClass().getSimpleName());
	}

	private static ResultInfo compileMultiplyCategory(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		method.addInstruction(Opcode.SWAP);
		return CategoryDeclaration.compileMultiply(context, method, flags, right, left);
	}

	public static ResultInfo compileMultiplyCharacter(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		if(Long.class==left.getType())
			CompilerUtils.LongToint(method);
		else
			CompilerUtils.longToint(method);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		if(java.lang.Character.class==right.getType())
			CompilerUtils.CharacterTochar(method);
		// stack is int, char, need char, int
		method.addInstruction(Opcode.SWAP);
		MethodConstant oper = new MethodConstant(PromptoChar.class, 
				"multiply", 
				char.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class);
	}

	public static ResultInfo compileMultiplyText(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		if(Long.class==left.getType())
			CompilerUtils.LongToint(method);
		else
			CompilerUtils.longToint(method);
		exp.compile(context, method, flags);
		// stack is int, String, need String int
		method.addInstruction(Opcode.SWAP);
		MethodConstant oper = new MethodConstant(PromptoString.class, 
				"multiply", 
				String.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class);
	}

	private static ResultInfo compileMultiplyMultiplyable(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		if(Long.class==left.getType())
			CompilerUtils.LongToint(method);
		else
			CompilerUtils.longToint(method);
		ResultInfo rval = exp.compile(context, method, flags);
		method.addInstruction(Opcode.SWAP);
		try {
			Class<?> klass = (Class<?>)rval.getType();
			Class<?> resultType = klass.getMethod("multiply", int.class).getReturnType();
			IOperand oper = new MethodConstant(rval.getType(), "multiply", 
					int.class, resultType);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(resultType);
		} catch(NoSuchMethodException e) {
			throw new SyntaxError(e.getMessage());
		}
	}

	public static ResultInfo compileMultiplyNumber(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToPrimitive(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(isDecimal));
		CompilerUtils.numberToPrimitive(method, right, isDecimal);
		if(isDecimal) {
			method.addInstruction(Opcode.DMUL);
			if(flags.toPrimitive())
				return new ResultInfo(double.class);
			else
				return CompilerUtils.doubleToDouble(method);
		} else {
			method.addInstruction(Opcode.LMUL);
			if(flags.toPrimitive())
				return new ResultInfo(long.class);
			else
				return CompilerUtils.longToLong(method);
		}
	}

	public static ResultInfo compileDivide(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		CompilerUtils.numberToPrimitive(method, left, true);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(true));
		CompilerUtils.numberToPrimitive(method, right, true);
		method.addInstruction(Opcode.DDIV);
		if(flags.toPrimitive())
			return new ResultInfo(double.class);
		else
			return CompilerUtils.doubleToDouble(method);
	}

	public static ResultInfo compileIntDivide(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		CompilerUtils.numberToPrimitive(method, left, false);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(false));
		CompilerUtils.numberToPrimitive(method, right, false);
		method.addInstruction(Opcode.LDIV);
		if(flags.toPrimitive())
			return new ResultInfo(long.class);
		else
			return CompilerUtils.longToLong(method);
	}

	public static ResultInfo compileModulo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		CompilerUtils.numberToPrimitive(method, left, false);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(false));
		CompilerUtils.numberToPrimitive(method, right, false);
		method.addInstruction(Opcode.LREM);
		if(flags.toPrimitive())
			return new ResultInfo(long.class);
		else
			return CompilerUtils.longToLong(method);
	}

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		boolean isDecimal = isDecimal(context, exp);
		CompilerUtils.numberToPrimitive(method, left, isDecimal);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true).withDecimal(isDecimal));
		CompilerUtils.numberToPrimitive(method, right, isDecimal);
		if(isDecimal)
			method.addInstruction(Opcode.DCMPG);
		else
			method.addInstruction(Opcode.LCMP);
		return BaseType.compileCompareToEpilogue(method, flags);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		left = CompilerUtils.numberTolong(method, left);
		ResultInfo right = exp.compile(context, method, flags);
		right = CompilerUtils.numberTolong(method, right);
		method.addInstruction(Opcode.LCMP);
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

	public static ResultInfo compileNegate(Context context, MethodInfo method, Flags flags, 
			ResultInfo value) {
		CompilerUtils.numberToPrimitive(method, value, false);
		method.addInstruction(Opcode.LNEG);
		if(flags.toPrimitive())
			return new ResultInfo(long.class);
		else
			return CompilerUtils.longToLong(method);
	}

}
