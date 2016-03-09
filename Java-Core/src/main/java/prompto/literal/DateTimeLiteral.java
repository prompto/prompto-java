package prompto.literal;

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
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		org.joda.time.DateTime dateTime = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(dateTime.toString()));
		Operand oper = new MethodConstant(org.joda.time.DateTime.class, "parse", 
				String.class, org.joda.time.DateTime.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(org.joda.time.DateTime.class, true);
	}

	
	
}
