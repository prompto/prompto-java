package prompto.literal;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoDate;
import prompto.runtime.Context;
import prompto.type.DateType;
import prompto.type.IType;
import prompto.value.Date;


public class DateLiteral extends Literal<Date> {

	public DateLiteral(String text) {
		super(text,parseDate(text.substring(1,text.length()-1)));
	}
	
	public DateLiteral(PromptoDate date) {
		super("'" + date.toString() + "'", new Date(date));
	}

	@Override
	public IType check(Context context) {
		return DateType.instance();
	}
	
	public static Date parseDate(String text) {
		return new Date(PromptoDate.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		PromptoDate date = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(date.toString()));
		Operand oper = new MethodConstant(PromptoDate.class, "parse", String.class, PromptoDate.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(PromptoDate.class, true);
	}

	
	
}
