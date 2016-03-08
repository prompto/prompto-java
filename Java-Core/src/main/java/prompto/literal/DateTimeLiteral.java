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
import prompto.type.DateTimeType;
import prompto.type.IType;
import prompto.value.DateTime;


public class DateTimeLiteral extends Literal<DateTime> {

	public DateTimeLiteral(String text) {
		super(text, parseDateTime(text.substring(1,text.length()-1)));
	}
	
	public DateTimeLiteral(org.joda.time.DateTime dateTime) {
		super("'" + dateTime.toString() + "'" , new DateTime(dateTime));
	}

	@Override
	public IType check(Context context) {
		return DateTimeType.instance();
	}
	
	public static DateTime parseDateTime(String text) {
		return new DateTime(org.joda.time.DateTime.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		org.joda.time.DateTime dateTime = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(dateTime.toString()));
		String className = CompilerUtils.getClassName(org.joda.time.DateTime.class);
		String proto = CompilerUtils.createProto(String.class, org.joda.time.DateTime.class);
		Operand oper = new MethodConstant(className, "parse", proto);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(org.joda.time.DateTime.class, true);
	}

	
	
}
