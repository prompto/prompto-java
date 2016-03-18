package prompto.expression;

import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.ResultInfo;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.StackLocal;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.IArgument;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.LinkedVariable;
import prompto.runtime.Variable;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class InstanceExpression implements IExpression {

	Identifier id;
	
	public InstanceExpression(Identifier name) {
		this.id = name;
	}

	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.getName();
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		toDialect(writer, true);
	}
	
	public void toDialect(CodeWriter writer, boolean requireMethod) {
		if(requireMethod && requiresMethod(writer))
			writer.append("Method: ");
		writer.append(id);
	}
	
	private boolean requiresMethod(CodeWriter writer) {
		if(writer.getDialect()!=Dialect.E)
			return false;
		Object o = writer.getContext().getRegistered(id);
		if(o instanceof MethodDeclarationMap)
			return true;
		return false;
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		INamed named = context.getRegistered(id);
		if(named==null)
			throw new SyntaxError("Unknown identifier: " + id);
		else if(named instanceof Variable) // local variable
			return named.getType(context);
		else if(named instanceof LinkedVariable) // local variable
			return named.getType(context);
		else if(named instanceof IArgument) // named argument
			return named.getType(context);
		else if(named instanceof CategoryDeclaration) // any p with x
			return named.getType(context);
		else if(named instanceof AttributeDeclaration) // in category method
			return named.getType(context);
		else if(named instanceof Context.MethodDeclarationMap) // global method or closure
			return new MethodType(context, id);
		else
			throw new SyntaxError(id + "  is not an instance:" + named.getClass().getSimpleName());
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return context.getValue(id);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StackLocal local = method.getRegisteredLocal(getName());
		ClassConstant c = local instanceof StackLocal.ObjectLocal ? ((StackLocal.ObjectLocal)local).getClassName() : new ClassConstant("java/lang/Object");   
		switch(local.getIndex()) {
			case 0:
				method.addInstruction(Opcode.ALOAD_0, c);
				break;
			case 1:
				method.addInstruction(Opcode.ALOAD_1, c);
				break;
			case 2:
				method.addInstruction(Opcode.ALOAD_2, c);
				break;
			case 3:
				method.addInstruction(Opcode.ALOAD_3, c);
				break;
			default:
				// TODO: support ALOAD_W
				method.addInstruction(Opcode.ALOAD, new ByteOperand((byte)local.getIndex()), c);
		}
		IType type = check(context);
		return new ResultInfo(type.toJavaType(), true);
	}

}
