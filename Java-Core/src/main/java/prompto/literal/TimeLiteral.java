package prompto.literal;

import org.joda.time.LocalTime;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.TimeType;
import prompto.value.Time;


public class TimeLiteral extends Literal<Time> {

	public TimeLiteral(String text) {
		super(text, parseTime(text.substring(1,text.length()-1)));
	}
	
	public TimeLiteral(LocalTime time) {
		super("'" + time.toString() + "'", new Time(time));
	}
	
	@Override
	public IType check(Context context) {
		return TimeType.instance();
	}
	
	public static Time parseTime(String text) {
		return new Time(LocalTime.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method) throws SyntaxError {
		LocalTime time = value.getValue();
		method.addInstruction(Opcode.LDC_W, new StringConstant(time.toString()));
		Operand oper = new MethodConstant(LocalTime.class, "parse", String.class, LocalTime.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(LocalTime.class, true);
	}

	
	
}
