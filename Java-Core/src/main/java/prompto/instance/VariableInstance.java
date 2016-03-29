package prompto.instance;

import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.IVerifierEntry.Type;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class VariableInstance implements IAssignableInstance {
	
	Identifier id;
	
	public VariableInstance(Identifier name) {
		this.id = name;
	}
	
	public Identifier getId() {
		return id;
	}
	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		StackLocal local = method.getRegisteredLocal(id.toString());
		if(local instanceof StackLocal.ObjectLocal) {
			ClassConstant klass = ((StackLocal.ObjectLocal)local).getClassName();
			if(local.getIndex()<4) {
				Opcode opcode = Opcode.values()[local.getIndex() + Opcode.ALOAD_0.ordinal()];
				method.addInstruction(opcode, klass);
			} else 
				method.addInstruction(Opcode.ALOAD, new ByteOperand((byte)local.getIndex()), klass);
			return new ResultInfo(klass.getType());
		} else
			throw new UnsupportedOperationException();
	}
	
	@Override
	public ResultInfo compileAssign(Context context, MethodInfo method, Flags flags, IExpression expression) throws SyntaxError {
		Context actual = context.contextForValue(id);
		if(actual instanceof InstanceContext)
			return ((InstanceContext)actual).getInstanceType().compileSetMember(context, method, flags, null, expression, id);
		else
			return compileAssignVariable(context, method, flags, expression);
	}
	
	public ResultInfo compileAssignVariable(Context context, MethodInfo method, Flags flags, IExpression expression) throws SyntaxError {
		ResultInfo info = expression.compile(context, method, flags);
		method.registerLocal(id.toString(), Type.ITEM_Object, new ClassConstant(info.getType()));
		StackLocal local = method.getRegisteredLocal(id.toString());
		if(local.getIndex()<4) {
			Opcode opcode = Opcode.values()[local.getIndex() + Opcode.ASTORE_0.ordinal()];
			method.addInstruction(opcode);
		} else 
			method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)local.getIndex()));
		return new ResultInfo(void.class);
	}
	
	@Override
	public void toDialect(CodeWriter writer, IExpression expression) {
		if(expression!=null) try {
			IType type = expression.check(writer.getContext());
			INamed actual = writer.getContext().getRegisteredValue(INamed.class,id);
			if(actual==null)
				writer.getContext().registerValue(new Variable(id, type));
		} catch(SyntaxError e) {
			// TODO warning
		}
		writer.append(id);
	}
	
	@Override
	public IType checkAssignValue(Context context, IExpression expression) throws SyntaxError {
		IType type = expression.check(context);
		INamed actual = context.getRegisteredValue(INamed.class,id);
		if(actual==null)
			context.registerValue(new Variable(id, type));
		else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			type.checkAssignableTo(context, actualType);
			type = actualType;
		}
		return type;
	}
	
	@Override
	public IType checkAssignMember(Context context, Identifier memberName) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class, id);
		if(actual==null) 
			throw new SyntaxError("Unknown variable:" + this.id);
		IType parentType = actual.getType(context);
		return parentType.checkMember(context, memberName);
	}
	
	@Override
	public IType checkAssignElement(Context context) throws SyntaxError {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
 		IValue value = expression.interpret(context);
		if(context.getRegisteredValue(INamed.class,id)==null)
			context.registerValue(new Variable(id, value.getType())); 
		context.setValue(id, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return context.getValue(id);
	}

}
