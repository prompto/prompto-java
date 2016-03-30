package prompto.value;

import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoAny;
import prompto.runtime.Context;
import prompto.type.AnyType;

public class Any extends BaseValue {
	
	String text;
	
	public Any() {
		super(AnyType.instance());
	}
	
	public void setId(Object value) {
		// nothing to do, this is just a side effect of exposing Any as a Prompto category
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "{id:" + System.identityHashCode(this) + ", text:" + text + "}";
	}
	
	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, ResultInfo parentInfo, IExpression expression) {
		expression.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoAny.class, "getItem", Object.class, Object.class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(PromptoAny.class);
	}



}
