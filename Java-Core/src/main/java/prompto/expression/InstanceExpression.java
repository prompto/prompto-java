package prompto.expression;

import prompto.argument.IArgument;
import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.runtime.LinkedVariable;
import prompto.runtime.Variable;
import prompto.type.CategoryType;
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
		return id.toString();
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
		ResultInfo info = compileLocal(context, method, flags);
		if(info==null)
			info = compileInstanceField(context, method, flags);
		if(info==null)
			info = compileSingletonField(context, method, flags);
		if(info==null)
			throw new SyntaxError("Unknown identifier: " + getName());
		else
			return info;
	}

	private ResultInfo compileSingletonField(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		Context actual = context.contextForValue(getId());
		if(actual instanceof InstanceContext) {
			CategoryType type = ((InstanceContext)actual).getInstanceType();
			return type.compileGetMember(context, method, flags, null, id);
		} else
			return null;
	}
	
	private ResultInfo compileInstanceField(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StackLocal local = method.getRegisteredLocal("this");
		if(local==null)
			return null;
		ThisExpression parent = new ThisExpression();
		MemberSelector selector = new MemberSelector(parent, id);
		return selector.compile(context, method, flags);
	}

	private ResultInfo compileLocal(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StackLocal local = method.getRegisteredLocal(getName());
		if(local==null)
			return null;
		ClassConstant klass = new ClassConstant(Object.class);
		ClassConstant downcastTo = null;
		if(local instanceof StackLocal.ObjectLocal) {
			klass = ((StackLocal.ObjectLocal)local).getClassName();
			downcastTo = ((StackLocal.ObjectLocal)local).getDowncastTo();
		}
		if(local.getIndex()<4) {
			Opcode opcode = Opcode.values()[local.getIndex() + Opcode.ALOAD_0.ordinal()];
			method.addInstruction(opcode, klass);
		} else
			method.addInstruction(Opcode.ALOAD, new ByteOperand((byte)local.getIndex()), klass);
		if(downcastTo!=null) {
			method.addInstruction(Opcode.CHECKCAST, downcastTo);
			klass = downcastTo;
		}
		return new ResultInfo(klass.getType());
	}

}
