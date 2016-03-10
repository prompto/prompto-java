package prompto.literal;

import prompto.compiler.ByteOperand;
import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.value.Boolean;

public class BooleanLiteral extends Literal<Boolean> {

	public BooleanLiteral(String text) {
		super(text, Boolean.parse(text));
	}
	
	@Override
	public IType check(Context context) {
		return BooleanType.instance();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		method.addInstruction(Opcode.BIPUSH, new ByteOperand(value.getValue() ? (byte)1 : 0));
		if(toNative)
			return new ResultInfo(boolean.class, false);
		else
			return CompilerUtils.booleanToBoolean(method);
	}
}
