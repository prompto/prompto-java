package prompto.instance;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoAny;
import prompto.intrinsic.PromptoDocument;
import prompto.runtime.Context;
import prompto.type.AnyType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class MemberInstance implements IAssignableSelector {
	
	IAssignableInstance parent;
	Identifier id;
	
	public MemberInstance(Identifier name) {
		this.id = name;
	}
	
	@Override
	public void setParent(IAssignableInstance parent) {
		this.parent = parent;
	}
	
	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer, IExpression expression) {
		parent.toDialect(writer, null);
		writer.append(".");
		writer.append(id);
	}
	
	@Override
	public IType checkAssignValue(Context context, IExpression expression) {
		IType type = parent.checkAssignMember(context, id);
		IType actualType = expression.check(context);
		actualType.checkAssignableTo(context, type);
		return type;
	}
	
	@Override
	public IType checkAssignMember(Context context, Identifier memberName) {
		return parent.checkAssignMember(context, id); // TODO
	}
	
	@Override
	public IType checkAssignElement(Context context) {
		return AnyType.instance(); // TODO
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
		IValue root = parent.interpret(context);
		if(!root.isMutable())
			throw new NotMutableError();
		IValue value = expression.interpret(context);
		root.setMember(context, id, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue root = parent.interpret(context);
		return root.getMember(context, id, true);
	}
	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		ResultInfo parent = this.parent.compileParent(context, method, flags);
		if(PromptoDocument.class==parent.getType()) {
			StringConstant key = new StringConstant(getName());
			method.addInstruction(Opcode.LDC_W, key);
			ClassConstant klass = new ClassConstant(PromptoDocument.class);
			method.addInstruction(Opcode.LDC_W, klass);
			IOperand oper = new MethodConstant(parent.getType(), "getOrCreate", Object.class, Class.class, Object.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			// result type could actually be any Prompto intrinsic object (including String and Character)
			return new ResultInfo(PromptoAny.class);
		} else
			throw new UnsupportedOperationException();
	}
	
	@Override
	public ResultInfo compileAssign(Context context, MethodInfo method, Flags flags, IExpression expression) {
		ResultInfo parent = this.parent.compileParent(context, method, flags);
		if(PromptoAny.class==parent.getType())
			return compileAssignAny(context, method, flags, expression);
		else if(PromptoDocument.class==parent.getType())
			return compileAssignDocument(context, method, flags, expression);
		else
			throw new UnsupportedOperationException("Cannot assign item to " + parent.getType().getTypeName());
	}
	
	private ResultInfo compileAssignAny(Context context, MethodInfo method, Flags flags, IExpression expression) {
		StringConstant key = new StringConstant(getName());
		method.addInstruction(Opcode.LDC_W, key);
		expression.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoAny.class, "setMember", Object.class, Object.class, Object.class, void.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(void.class);
	}
	

	private ResultInfo compileAssignDocument(Context context, MethodInfo method, Flags flags, IExpression expression) {
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(PromptoDocument.class));
		StringConstant key = new StringConstant(getName());
		method.addInstruction(Opcode.LDC_W, key);
		expression.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoDocument.class, "put", Object.class, Object.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.POP); // consume result
		return new ResultInfo(void.class);
	}

	/*
	String setterName = CompilerUtils.setterName(getName());
	if(isCompilingSetter(context, method, parent, setterName)) {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, getId());
		FieldInfo field = decl.toFieldInfo(context);
		Type classType = CompilerUtils.concreteTypeFrom(parent.getType().getTypeName());
		FieldConstant f = new FieldConstant(classType, id.getName(), field.getType());
		method.addInstruction(Opcode.PUTFIELD, f);
	} else if(PromptoDict.Entry.class==parent.getType()) {
		IOperand oper = new MethodConstant(parent.getType(), getterName, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(resultType));
	} else if(parent.isInterface()){
		IOperand oper = new InterfaceConstant(parent.getType(), getterName, resultType);
		method.addInstruction(Opcode.INVOKEINTERFACE, oper);
	} else {
		IOperand oper = new MethodConstant(parent.getType(), getterName, resultType);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
	}
	return new ResultInfo(resultType);
	*/
	/*
	private boolean isCompilingSetter(Context context, MethodInfo method, ResultInfo parent, String setterName) {
		return this.parent instanceof ThisExpression && setterName.equals(method.getName().getValue());
	}
	*/

}
