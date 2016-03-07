package prompto.java;

import prompto.compiler.Compiler;
import prompto.compiler.IntConstant;
import prompto.compiler.LongConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;


public class JavaIntegerLiteral extends JavaLiteral {

	Long value;
	
	public JavaIntegerLiteral(String text) {
		super(text);
		this.value = Long.valueOf(text);
	}

	@Override
	public Long interpret(Context context) {
		return value;
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return new JavaClassType(Long.class);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
	long x() {
		return 9876543210L;
	}
	
	@Override
	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		if(value<=Integer.MAX_VALUE && value>=Integer.MIN_VALUE) {
			method.addInstruction(Opcode.LDC_W, new IntConstant(value.intValue()));
			return new ResultInfo(int.class, false);
		} else {
			method.addInstruction(Opcode.LDC2_W, new LongConstant(value));
			return new ResultInfo(long.class, false);
		}
	}
}
