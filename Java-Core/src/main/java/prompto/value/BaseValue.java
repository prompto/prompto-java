package prompto.value;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.ShortOperand;
import prompto.compiler.StackState;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;

import com.fasterxml.jackson.core.JsonGenerator;

public abstract class BaseValue implements IValue {
	
	IType type;
	
	protected BaseValue(IType type) {
		this.type = type;
	}
	
	@Override
	public boolean isMutable() {
		return false;
	}
	
	public void setType(IType type) {
		this.type = type;
	}
	
	@Override
	public IType getType() {
		return type;
	}
	

	@Override
	public boolean roughly(Context context, IValue value) throws PromptoError {
		return this.equals(value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ISliceable<IValue> asSliceable(Context context) throws PromptoError {
		return (this instanceof ISliceable) ? (ISliceable<IValue>)this : null;
	}
	
	public Object convertTo(Class<?> type) {
		return this;
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		throw new UnsupportedOperationException("toJson not supported by " + this.getClass().getSimpleName());
	}

    static Opcode[] cmpOpcodes = createOpcodes();
    
    private static Opcode[] createOpcodes() {
    	Opcode[] opcodes = new Opcode[CmpOp.values().length];
    	opcodes[CmpOp.LT.ordinal()] = Opcode.IF_ICMPLT;
    	opcodes[CmpOp.LTE.ordinal()] = Opcode.IF_ICMPLE;
    	opcodes[CmpOp.GT.ordinal()] = Opcode.IF_ICMPGT;
    	opcodes[CmpOp.GTE.ordinal()] = Opcode.IF_ICMPGE;
 		return opcodes;
 	}
 
	public static ResultInfo compileCompareToEpilogue(MethodInfo method, Flags flags) {
		method.addInstruction(Opcode.ICONST_0);
		Opcode opcode = cmpOpcodes[flags.cmpOp().ordinal()];
		method.addInstruction(opcode, new ShortOperand((short)7));
		StackState branchState = method.captureStackState();
		method.addInstruction(Opcode.ICONST_0);
		method.addInstruction(Opcode.GOTO, new ShortOperand((short)4));
		method.restoreStackState(branchState);
		method.placeLabel(branchState);
		method.addInstruction(Opcode.ICONST_1);
		StackState lastState = method.captureStackState();
		method.placeLabel(lastState);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
	
	public static void compileSliceLast(Context context, MethodInfo method, Flags flags, IExpression last) {
		if(last==null) {
			method.addInstruction(Opcode.LCONST_1);
			method.addInstruction(Opcode.LNEG);
		} else {
			ResultInfo linfo = last.compile(context, method, flags.withPrimitive(true));
			linfo = CompilerUtils.numberTolong(method, linfo);
		}
	}
	
	public static void compileSliceFirst(Context context, MethodInfo method, Flags flags, IExpression first) {
		if(first==null)
			method.addInstruction(Opcode.LCONST_1);
		else {
			ResultInfo finfo = first.compile(context, method, flags.withPrimitive(true));
			finfo = CompilerUtils.numberTolong(method, finfo);
		}
	}

}
