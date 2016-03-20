package prompto.expression;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.TypeValue;

public class TypeExpression implements IExpression {

	IType type;
	
	public TypeExpression(IType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		type.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new TypeValue(type);
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StringConstant s = new StringConstant(type.getJavaType().getTypeName());
		method.addInstruction(Opcode.LDC_W, s);
		ClassConstant c = new ClassConstant(Class.class);
		MethodConstant m = new MethodConstant(c, "forName", String.class, Class.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		return new ResultInfo(Class.class);
	}
	
	public IValue getMember(Context context, Identifier name) throws PromptoError {
		return type.getMember(context, name);
	}

	public IType getType() {
		return type;
	}
}
