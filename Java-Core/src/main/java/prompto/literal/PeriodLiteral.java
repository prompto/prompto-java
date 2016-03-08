package prompto.literal;

import prompto.compiler.Compiler;
import prompto.compiler.CompilerUtils;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.PeriodType;
import prompto.value.Period;


public class PeriodLiteral extends Literal<Period> {

	public PeriodLiteral(String text) {
		super(text,parseDuration(text.substring(1,text.length()-1)));
	}
	
	@Override
	public IType check(Context context) {
		return PeriodType.instance();
	}
	
	public static Period parseDuration(String text) {
		return new Period(org.joda.time.Period.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		org.joda.time.Period period = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(period.toString()));
		String className = CompilerUtils.getClassName(org.joda.time.Period.class);
		String proto = CompilerUtils.createProto(String.class, org.joda.time.Period.class);
		Operand oper = new MethodConstant(className, "parse", proto);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(org.joda.time.Period.class, true);
	}
	
	
}
