package prompto.literal;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IntConstant;
import prompto.compiler.LongConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.value.Integer;

public class IntegerLiteral extends Literal<Integer> {

	public IntegerLiteral(String text) {
		super(text, new Integer(Long.valueOf(text)));
	}

	public IntegerLiteral(long value) {
		super(Long.toString(value), new Integer(value));
	}
	
	public IntegerLiteral(String text, Integer value) {
		super(text, value);
	}

	@Override
	public IType check(Context context) {
		return IntegerType.instance();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		long l = value.longValue();
		if(l>=0 && l<=5) {
			// ICONST_0 to ICONST_5 are consecutive
			Opcode opcode = Opcode.values()[Opcode.ICONST_0.ordinal() + (int)l];
			method.addInstruction(opcode);
			CompilerUtils.intTolong(method);
		} else if(l<=java.lang.Integer.MAX_VALUE && l>=java.lang.Integer.MIN_VALUE) {
			method.addInstruction(Opcode.LDC_W, new IntConstant((int)l));
			CompilerUtils.intTolong(method);
		} else
			method.addInstruction(Opcode.LDC2_W, new LongConstant(l));
		if(flags.toNative())
			return new ResultInfo(long.class, false);
		else
			return CompilerUtils.longToLong(method);
	}

}
