package prompto.statement;

import prompto.compiler.ClassConstant;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.runtime.VoidResult;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.NullValue;

public class ReturnStatement extends SimpleStatement {
	
	IExpression expression;
	
	public ReturnStatement(IExpression expression) {
		this.expression = expression;
	}

	public IExpression getExpression() {
		return expression;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("return");
		if(expression!=null) {
			writer.append(" ");
			expression.toDialect(writer);
		}
	}
	
	@Override
	public String toString() {
		return "return " + expression==null ? "" : expression.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof ReturnStatement))
			return false;
		ReturnStatement other = (ReturnStatement)obj;
		return this.getExpression().equals(other.getExpression());
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return expression==null ? VoidType.instance() : expression.check(context);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(expression==null)
			return VoidResult.instance();
		else {
			IValue value = expression.interpret(context);
			return value==null ? NullValue.instance() : value;
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		FieldInfo setter = flags.setter();
		if(setter==null)
			return compileReturn(context, method, flags);
		else
			return compileSetter(context, method, flags, setter);
	}

	private ResultInfo compileSetter(Context context, MethodInfo method, Flags flags, FieldInfo field) throws SyntaxError {
		// load 'this'
		StackLocal local = method.getRegisteredLocal("this");
		ClassConstant c = ((StackLocal.ObjectLocal)local).getClassName();
		method.addInstruction(Opcode.ALOAD_0, c); 
		// load value
		expression.compile(context, method, flags);
		// store in field
		FieldConstant f = new FieldConstant(c, field.getName().getValue(), field.getDescriptor());
		method.addInstruction(Opcode.PUTFIELD, f);
		method.addInstruction(Opcode.RETURN);
		return new ResultInfo(void.class, false, true);
	}

	private ResultInfo compileReturn(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		if(expression==null) {
			method.addInstruction(Opcode.RETURN);
			return new ResultInfo(void.class, false, true);
		} else {
			ResultInfo info = expression.compile(context, method, flags);
			if(boolean.class==info.getType())
				method.addInstruction(Opcode.IRETURN);
			else if(int.class==info.getType())
				method.addInstruction(Opcode.IRETURN);
			else if(char.class==info.getType())
				method.addInstruction(Opcode.IRETURN);
			else if(long.class==info.getType())
				method.addInstruction(Opcode.LRETURN);
			else if(double.class==info.getType())
				method.addInstruction(Opcode.DRETURN);
			else
				method.addInstruction(Opcode.ARETURN);
			return new ResultInfo(info.getType(), info.isInstance(), true);
		}
	}

}
