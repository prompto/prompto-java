package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.EnumeratedCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.Text;

public class CategorySymbol extends Symbol implements IExpression  {
	
	ArgumentAssignmentList assignments;
	
	public CategorySymbol(Identifier name,ArgumentAssignmentList assignments) {
		super(name);
		this.assignments = assignments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(symbol);
		writer.append(" ");
		assignments.toDialect(writer);
	}
	
	public void setAssignments(ArgumentAssignmentList assignments) {
		this.assignments = assignments;
	}
	
	public ArgumentAssignmentList getAssignments() {
		return assignments;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(assignments!=null)
			sb.append(assignments.toString());
		if(sb.length()==0)
			sb.append(type.getTypeNameId());
		return sb.toString();
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		EnumeratedCategoryDeclaration cd = context.getRegisteredDeclaration(
				EnumeratedCategoryDeclaration.class, type.getTypeNameId());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getTypeName());
		if(assignments!=null) {
			context = context.newChildContext();
			for(ArgumentAssignment assignment : assignments) {
				if(!cd.hasAttribute(context, assignment.getId()))
					throw new SyntaxError("\"" + assignment.getId() + 
						"\" is not an attribute of " + type.getTypeName());	
				assignment.check(context);
			}
		}
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		EnumeratedCategoryType type = (EnumeratedCategoryType)this.getType(context);
		IInstance instance = type.newInstance(context);
		instance.setMutable(true);
		if(assignments!=null) {
			context = context.newLocalContext();
			for(ArgumentAssignment assignment : assignments) {
				IValue value = assignment.getExpression().interpret(context);
				instance.setMember(context, assignment.getId(), value);
			}
		}
		instance.setMember(context, new Identifier("name"), new Text(this.getId().toString()));
		instance.setMutable(false);
		return instance;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		EnumeratedCategoryType itype = (EnumeratedCategoryType)this.getType(context);
		Type type = CompilerUtils.getCategoryEnumConcreteType(itype.getTypeNameId());
		FieldConstant field = new FieldConstant(type, this.getId().toString(), type);
		method.addInstruction(Opcode.GETSTATIC, field);
		return new ResultInfo(type);
	}

	public void compileCallConstructor(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		EnumeratedCategoryType itype = (EnumeratedCategoryType)this.getType(context);
		Type type = CompilerUtils.getCategoryEnumConcreteType(itype.getTypeNameId());
		ResultInfo result = CompilerUtils.compileNewInstance(method, type);
		compileAssignments(context, method, flags, result);
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

}
