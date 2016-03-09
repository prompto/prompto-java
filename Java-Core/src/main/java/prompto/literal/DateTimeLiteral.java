package prompto.literal;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoDateTime;
import prompto.runtime.Context;
import prompto.type.DateTimeType;
import prompto.type.IType;
import prompto.value.DateTime;


public class DateTimeLiteral extends Literal<DateTime> {

	public DateTimeLiteral(String text) {
		super(text, parseDateTime(text.substring(1,text.length()-1)));
	}
	
	public DateTimeLiteral(PromptoDateTime dateTime) {
		super("'" + dateTime.toString() + "'" , new DateTime(dateTime));
	}

	@Override
	public IType check(Context context) {
		return DateTimeType.instance();
	}
	
	public static DateTime parseDateTime(String text) {
		return new DateTime(PromptoDateTime.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		PromptoDateTime dateTime = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(dateTime.toString()));
		Operand oper = new MethodConstant(PromptoDateTime.class, "parse", 
				String.class, PromptoDateTime.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(PromptoDateTime.class, true);
	}

	
	
}
