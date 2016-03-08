package prompto.literal;

import org.joda.time.LocalDate;

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
import prompto.type.DateType;
import prompto.type.IType;
import prompto.value.Date;


public class DateLiteral extends Literal<Date> {

	public DateLiteral(String text) {
		super(text,parseDate(text.substring(1,text.length()-1)));
	}
	
	public DateLiteral(LocalDate date) {
		super("'" + date.toString() + "'", new Date(date));
	}

	@Override
	public IType check(Context context) {
		return DateType.instance();
	}
	
	public static Date parseDate(String text) {
		return new Date(LocalDate.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, Compiler compiler, MethodInfo method) throws SyntaxError {
		LocalDate date = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(date.toString()));
		String className = CompilerUtils.getClassName(LocalDate.class);
		String proto = CompilerUtils.createProto(String.class, LocalDate.class);
		Operand oper = new MethodConstant(className, "parse", proto);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(LocalDate.class, true);
	}

	
	
}
