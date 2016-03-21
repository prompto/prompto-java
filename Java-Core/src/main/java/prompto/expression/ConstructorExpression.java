package prompto.expression;

import java.lang.reflect.Type;
import java.util.Set;

import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.error.NotMutableError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;

public class ConstructorExpression implements IExpression {
	
	CategoryType type;
	IExpression copyFrom;
	ArgumentAssignmentList assignments;
	
	public ConstructorExpression(CategoryType type, ArgumentAssignmentList assignments) {
		this.type = type;
		setAssignments(assignments);
	}
	
	public CategoryType getType() {
		return type;
	}
	
	public void setAssignments(ArgumentAssignmentList assignments) {
		this.assignments = assignments;
		// in O and S dialects, first anonymous argument is copyFrom
		if(assignments!=null && assignments.size()>0 && assignments.get(0).getArgument()==null) {
			copyFrom = assignments.get(0).getExpression();
			this.assignments.remove(0);
		}
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	public void setCopyFrom(IExpression copyFrom) {
		this.copyFrom = copyFrom;
	}

	public IExpression getCopyFrom() {
		return copyFrom;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
	}
	
	private void toSDialect(CodeWriter writer) {
		toODialect(writer);
	}

	private void toODialect(CodeWriter writer) {
		type.toDialect(writer);
		ArgumentAssignmentList assignments = new ArgumentAssignmentList();
		if (copyFrom != null)
			assignments.add(new ArgumentAssignment(null, copyFrom));
		if(this.assignments!=null)
			assignments.addAll(this.assignments);
		assignments.toDialect(writer);
	}

	private void toEDialect(CodeWriter writer) {
		type.toDialect(writer);
		if (copyFrom != null) {
			writer.append(" from ");
			writer.append(copyFrom.toString());
			if (assignments != null && assignments.size()>0)
				writer.append(",");
		}
		if (assignments != null)
			assignments.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getId());
		IType type = cd.getType(context); // could be a resource rather than a category
		cd.checkConstructorContext(context);
		if(copyFrom!=null) {
			IType cft = copyFrom.check(context);
			if(!(cft instanceof CategoryType))
				throw new SyntaxError("Cannot copy from " + cft.getId());
		}
		if(assignments!=null) {
			context = context.newChildContext();
			for(ArgumentAssignment assignment : assignments) {
				if(!cd.hasAttribute(context, assignment.getId()))
					throw new SyntaxError("\"" + assignment.getId() + 
						"\" is not an attribute of " + type.getId());	
				assignment.check(context);
			}
		}
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IInstance instance = type.newInstance(context);
		instance.setMutable(true);
		try {
			if(copyFrom!=null) {
				Object copyObj = copyFrom.interpret(context);
				if(copyObj instanceof IInstance) {
					IInstance copyFrom = (IInstance)copyObj;
					CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
					for(Identifier name : copyFrom.getMemberNames()) {
						if(cd.hasAttribute(context, name)) {
							IValue value = copyFrom.getMember(context, name, false);
							if(value!=null && value.isMutable() && !type.isMutable())
								throw new NotMutableError();
							instance.setMember(context, name, value);
						}
					}
				}
			}
			if(assignments!=null) {
				for(ArgumentAssignment assignment : assignments) {
					IValue value = assignment.getExpression().interpret(context);
					if(value!=null && value.isMutable() && !type.isMutable())
						throw new NotMutableError();
					instance.setMember(context, assignment.getId(), value);
				}
			}
		} finally {
			instance.setMutable(type.isMutable());
		}
		return instance;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		Type klass = getConcreteType(context);
		ResultInfo result = CompilerUtils.newInstance(method, klass);
		compileCopyFrom(context, method, flags, result);
		compileAssignments(context, method, flags, result);
		return new ResultInfo(getInterfaceType(context));
	}

	private void compileAssignments(Context context, MethodInfo method, Flags flags, ResultInfo thisInfo) throws SyntaxError {
		if(assignments!=null)
			for(ArgumentAssignment assignment : assignments)
				compileAssignment(context, method, flags, thisInfo, assignment);
	}

	private void compileAssignment(Context context, MethodInfo method, Flags flags, 
			ResultInfo thisInfo, ArgumentAssignment assignment) throws SyntaxError {
		// keep a copy of new instance on top of the stack
		method.addInstruction(Opcode.DUP);
		// get value
		/* ResultInfo valueInfo = */assignment.getExpression().compile(context, method, flags);
		// call setter
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, assignment.getId());
		FieldInfo field = decl.toFieldInfo(context);
		MethodConstant m = new MethodConstant(thisInfo.getType(), 
				CompilerUtils.setterName(field.getName().getValue()), field.getType(), void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	private void compileCopyFrom(Context context, MethodInfo method, Flags flags, ResultInfo thisInfo) throws SyntaxError {
		if(copyFrom==null)
			return;
		CategoryDeclaration thisCd = context.getRegisteredDeclaration(CategoryDeclaration.class, this.type.getId());
		IType otherType = copyFrom.check(context);
		CategoryDeclaration otherCd = context.getRegisteredDeclaration(CategoryDeclaration.class, otherType.getId());
		compileCopyFrom(context, method, flags, thisCd, otherCd, thisInfo);
	}

	private void compileCopyFrom(Context context, MethodInfo method, Flags flags, 
			CategoryDeclaration thisCd, CategoryDeclaration otherCd, ResultInfo thisInfo) throws SyntaxError {
		ResultInfo copyFromInfo = copyFrom.compile(context, method, flags.withPrimitive(false));
		Set<Identifier> attrIds = thisCd.getAllAttributes(context);
		for(Identifier attrId : attrIds)
			compileCopyFrom(context, method, flags, thisCd, otherCd, attrId, thisInfo, copyFromInfo);
		method.addInstruction(Opcode.POP);
	}

	private void compileCopyFrom(Context context, MethodInfo method, Flags flags, 
			CategoryDeclaration thisCd, CategoryDeclaration otherCd, Identifier attrId, ResultInfo thisInfo, ResultInfo copyFromInfo) {
		if(willBeAssigned(attrId) || !otherCd.hasAttribute(context, attrId))
			return;
		// keep a copy of copyFrom on top of the stack
		method.addInstruction(Opcode.DUP); // -> new, copyFrom, copyFrom
		// call getter on copyFrom instance (an interface)
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, attrId);
		FieldInfo field = decl.toFieldInfo(context);
		InterfaceConstant i = new InterfaceConstant(copyFromInfo.getType(), 
				CompilerUtils.getterName(attrId.getName()), field.getType());
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
		// keep the new instance at top of the stack (currently new, copyFrom, value)
		method.addInstruction(Opcode.DUP_X2); // -> value, new, copyFrom, value
		method.addInstruction(Opcode.POP); // -> value, new, copyFrom
		method.addInstruction(Opcode.DUP_X2); // -> copyFrom, value, new, copyFrom
		method.addInstruction(Opcode.POP); // -> copyFrom, value, new
		method.addInstruction(Opcode.DUP_X2); // -> new, copyFrom, value, new
		method.addInstruction(Opcode.SWAP); // -> new, copyFrom, new, value
		// call setter on new instance (a class)
		MethodConstant m = new MethodConstant(thisInfo.getType(), 
				CompilerUtils.setterName(attrId.getName()), field.getType(), void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	private boolean willBeAssigned(Identifier name) {
		if(assignments!=null) 
			for(ArgumentAssignment assignment : assignments) 
				if(name.equals(assignment.getId()))
					return true;
		return false;
	}

	private Type getInterfaceType(Context context) throws SyntaxError {
		CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
		if(cd instanceof NativeCategoryDeclaration)
			return ((NativeCategoryDeclaration)cd).getBoundClass(false);
		else 
			return CompilerUtils.getCategoryInterfaceType(cd.getId());
	}

	private Type getConcreteType(Context context) throws SyntaxError {
		CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getId());
		if(cd instanceof NativeCategoryDeclaration)
			return ((NativeCategoryDeclaration)cd).getBoundClass(false);
		else 
			return CompilerUtils.getCategoryConcreteType(cd.getId());
	}
}
