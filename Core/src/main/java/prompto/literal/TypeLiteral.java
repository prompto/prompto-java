package prompto.literal;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.expression.TypeExpression;
import prompto.intrinsic.PromptoType;
import prompto.parser.Dialect;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.TypeType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.TypeValue;

public class TypeLiteral extends Section implements IExpression {

	IType type;
	
	public TypeLiteral(IType type) {
		this.type = type;
	}
	
	public IType getType() {
		return type;
	}
	
	@Override
	public IType check(Context context) {
		return new TypeType(type);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new TypeValue(type);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		CompilerUtils.compileNewRawInstance(method, PromptoType.class); 
		method.addInstruction(Opcode.DUP);
		method.addInstruction(Opcode.LDC, new StringConstant(type.getTypeName()));
		CompilerUtils.compileCallConstructor(method, PromptoType.class, String.class); 
		return new ResultInfo(PromptoType.class);
	}
	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		return new TypeExpression(type).compileParent(context, method, flags);
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.E)
			writer.append("type: ");
		type.toDialect(writer);
	}
	
	@Override
	public void parentToDialect(CodeWriter writer) {
		type.toDialect(writer);
	}
	
	@Override
	public String toString() {
		return type.toString();
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Type");
	}
	
	@Override
	public void declareParent(Transpiler transpiler) {
		type.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("new Type('").append(type.toString()).append("')");
		return false;
	}
	
	@Override
	public boolean transpileParent(Transpiler transpiler) {
		transpiler.append(type.toString());
		return false;
	}

}
