package prompto.type;

import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.Comparator;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoChar;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.CharacterValue;
import prompto.value.CharacterRange;
import prompto.value.IValue;
import prompto.value.RangeBase;

import com.fasterxml.jackson.databind.JsonNode;

public class CharacterType extends NativeType {

	static CharacterType instance = new CharacterType();

	public static CharacterType instance() {
		return instance;
	}

	private CharacterType() {
		super(Family.CHARACTER);
	}

	@Override
	public Type getJavaType(Context context) {
		return java.lang.Character.class;
	}

	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		return TextType.instance();
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if (other instanceof IntegerType)
			return TextType.instance();
		else
			return super.checkMultiply(context, other, tryReverse, section);
	}

	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if (other instanceof CharacterType || other instanceof TextType)
			return;
		else
			super.checkCompare(context, other, section);
	}

	@Override
	public IType checkMember(Context context, Identifier id) {
		String name = id.toString();
		if ("codePoint".equals(name))
			return IntegerType.instance();
		else
			return super.checkMember(context, id);
	}

	@Override
	public IType checkRange(Context context, IType other) {
		if (other instanceof CharacterType)
			return new RangeType(this);
		return super.checkRange(context, other);
	}

	@Override
	public RangeBase<?> newRange(Object left, Object right) {
		if (left instanceof CharacterValue && right instanceof CharacterValue)
			return new CharacterRange((CharacterValue) left, (CharacterValue) right);
		return super.newRange(left, right);
	}

	@Override
	public Comparator<CharacterValue> getNativeComparator(boolean descending) {
		return descending ? new Comparator<CharacterValue>() {
			@Override
			public int compare(CharacterValue o1, CharacterValue o2) {
				return java.lang.Character.compare(o2.getValue(), o1.getValue());
			}
		} : new Comparator<CharacterValue>() {
			@Override
			public int compare(CharacterValue o1, CharacterValue o2) {
				return java.lang.Character.compare(o1.getValue(), o2.getValue());
			}
		};
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		if (value instanceof java.lang.Character)
			return new CharacterValue(((java.lang.Character) value).charValue());
		else
			return (IValue) value; // TODO for now
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		if (value.asText().length() > 1)
			throw new InvalidParameterException(value.toString());
		return new CharacterValue(value.asText().charAt(0));
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}

	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
		// can add anything to text
		left.declare(transpiler);
		right.declare(transpiler);
	}

	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
		// can add anything to text
		left.transpile(transpiler);
		transpiler.append(" + ");
		right.transpile(transpiler);
	}
	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    if (other == IntegerType.instance()) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	   if (other == IntegerType.instance()) {
	        left.transpile(transpiler);
	        transpiler.append(".repeat(");
	        right.transpile(transpiler);
	        transpiler.append(")");
	    } else
	        super.transpileMultiply(transpiler, other, tryReverse, left, right);
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier name) {
	    if (!"codePoint".equals(name.toString()))
	    	super.declareMember(transpiler, name);
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier name) {
	    if ("codePoint".equals(name.toString()))
	    	transpiler.append("charCodeAt(0)");
	    else
	    	super.transpileMember(transpiler, name);
	}

	@Override
	public void declareRange(Transpiler transpiler, IType other) {
	    if(other == CharacterType.instance()) {
	        transpiler.require("Range");
	        transpiler.require("IntegerRange");
	        transpiler.require("CharacterRange");
	    } else {
	        super.declareRange(transpiler, other);
	    }
	}
	
	
	@Override
	public void transpileRange(Transpiler transpiler, IExpression first, IExpression last) {
	    transpiler.append("new CharacterRange(");
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
	    transpiler.append(" ").append(operator.toString()).append(" ");
	    right.transpile(transpiler);
	}

	public static Opcode[] CMP_OPCODES = createOpcodes();

	public static Opcode[] createOpcodes() {
		Opcode[] opcodes = new Opcode[CmpOp.values().length];
		opcodes[CmpOp.LT.ordinal()] = Opcode.IF_ICMPLT;
		opcodes[CmpOp.LTE.ordinal()] = Opcode.IF_ICMPLE;
		opcodes[CmpOp.GT.ordinal()] = Opcode.IF_ICMPGT;
		opcodes[CmpOp.GTE.ordinal()] = Opcode.IF_ICMPGE;
		return opcodes;
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		CompilerUtils.CharacterTochar(method);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		if(Long.class==right.getType())
			CompilerUtils.LongToint(method);
		else if(long.class==right.getType())
			CompilerUtils.longToint(method);
		MethodConstant oper = new MethodConstant(PromptoChar.class, 
				"multiply", 
				char.class, int.class, String.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(String.class);
	}

	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression right) {
		// convert to String
		MethodConstant c = new MethodConstant(java.lang.Character.class, 
									"toString", 
									String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, c);
		// use Text::compileAdd
		return TextType.compilePlus(context, method, flags, left, right);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		if(java.lang.Character.class==left.getType())
			CompilerUtils.CharacterTochar(method);
		ResultInfo right = exp.compile(context, method, flags);
		if(java.lang.Character.class==right.getType())
			CompilerUtils.CharacterTochar(method);
		Opcode opcode = flags.isReverse() ? Opcode.IF_ICMPNE : Opcode.IF_ICMPEQ;
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

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		if(java.lang.Character.class==left.getType())
			CompilerUtils.CharacterTochar(method);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		if(java.lang.Character.class==right.getType())
			CompilerUtils.CharacterTochar(method);
		Opcode opcode = CMP_OPCODES[flags.cmpOp().ordinal()];
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
}
