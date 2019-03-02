package prompto.value;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.BooleanType;

import com.fasterxml.jackson.core.JsonGenerator;

public class BooleanValue extends BaseValue implements Comparable<BooleanValue> {
	
	public static BooleanValue TRUE = new BooleanValue(true);
	public static BooleanValue FALSE = new BooleanValue(false);

	static {
		TRUE.not = FALSE;
		FALSE.not = TRUE;
	}

	public static BooleanValue parse(String text) {
		return valueOf(java.lang.Boolean.parseBoolean(text));
	}

	public static BooleanValue valueOf(boolean value) {
		return value ? TRUE : FALSE;
	}

	boolean value;
	BooleanValue not;

	private BooleanValue(boolean value) {
		super(BooleanType.instance());
		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	public BooleanValue getNot() {
		return not;
	}
	
	@Override
	public Object getStorableData() {
		return value;
	}

	@Override
	public int compareTo(Context context, IValue value) {
		if (value instanceof BooleanValue)
			return compareTo((BooleanValue) value);
		else
			throw new SyntaxError("Illegal comparison: Boolean + " + value.getClass().getSimpleName());
	}

	@Override
	public int compareTo(BooleanValue other) {
		return java.lang.Boolean.compare(this.value, other.value);
	}

	@Override
	public Object convertTo(Context context, Type type) {
		return value;
	}

	@Override
	public String toString() {
		return java.lang.Boolean.toString(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BooleanValue)
			return value == ((BooleanValue) obj).value;
		else
			return false;
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeBoolean(value);
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, ResultInfo left, IExpression exp) {
		if(java.lang.Boolean.class==left.getType())
			CompilerUtils.BooleanToboolean(method);
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		if(java.lang.Boolean.class==right.getType())
			CompilerUtils.BooleanToboolean(method);
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

}
