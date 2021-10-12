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
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.BooleanValue;
import prompto.value.IValue;

import com.fasterxml.jackson.databind.JsonNode;

public class BooleanType extends NativeType {
	
	static BooleanType instance = new BooleanType();
	
	public static BooleanType instance() {
		return instance;
	}
	
	private BooleanType() {
		super(Family.BOOLEAN);
	}

	@Override
	public Type toJavaType(Context context) {
		return java.lang.Boolean.class;
	}
	
	@Override
	public Comparator<? extends IValue> getNativeComparator(boolean descending) {
		return descending ?
				new Comparator<BooleanValue>() {
					@Override
					public int compare(BooleanValue o1, BooleanValue o2) {
						return java.lang.Boolean.compare(o2.getValue(), o1.getValue());
					}
				} :
				new Comparator<BooleanValue>() {
					@Override
					public int compare(BooleanValue o1, BooleanValue o2) {
						return java.lang.Boolean.compare(o1.getValue(), o2.getValue());
					}
				};
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof java.lang.Boolean)
            return BooleanValue.valueOf(((java.lang.Boolean)value).booleanValue());
        else
        	return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		return prompto.value.BooleanValue.valueOf(value.asBoolean());
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Utils"); // equals etc...
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("'Boolean'");
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
