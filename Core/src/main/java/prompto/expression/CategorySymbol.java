package prompto.expression;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
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
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.literal.TextLiteral;
import prompto.param.AttributeParameter;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.EnumeratedCategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.TextValue;

public class CategorySymbol extends Symbol implements IExpression  {
	
	ArgumentList assignments;
	
	public CategorySymbol(Identifier name,ArgumentList assignments) {
		super(name);
		this.assignments = assignments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(symbol);
		writer.append(" ");
		assignments.toDialect(writer);
	}
	
	public void setAssignments(ArgumentList assignments) {
		this.assignments = assignments;
	}
	
	public ArgumentList getAssignments() {
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
	public IType check(Context context) {
		EnumeratedCategoryDeclaration cd = context.getRegisteredDeclaration(
				EnumeratedCategoryDeclaration.class, type.getTypeNameId());
		if(cd==null)
			throw new SyntaxError("Unknown category " + type.getTypeName());
		if(assignments!=null) {
			context = context.newChildContext();
			for(Argument assignment : assignments) {
				if(!cd.hasAttribute(context, assignment.getParameterId()))
					throw new SyntaxError("\"" + assignment.getParameterId() + 
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
			for(Argument assignment : assignments) {
				IValue value = assignment.getExpression().interpret(context);
				instance.setMember(context, assignment.getParameterId(), value);
			}
		}
		instance.setMember(context, new Identifier("name"), new TextValue(this.getId().toString()));
		instance.setMutable(false);
		return instance;
	}
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> binaries) throws PromptoError {
		try {
			generator.writeStartObject();
			generator.writeFieldName("name");
			generator.writeString(symbol.toString());
			if(assignments!=null) {
				context = context.newLocalContext();
				for(Argument assignment : assignments) {
					generator.writeFieldName(assignment.getParameter().getName());
					IValue value = assignment.getExpression().interpret(context);
					value.toJsonStream(context, generator, instanceId, fieldName, withType, binaries);
				}
			}
			generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	

	
	@Override
	public IValue getMember(Context context, Identifier name, boolean autoCreate) throws PromptoError {
		IValue value = context.getValue(this.getId(), ()->this.interpret(context));
		return value.getMember(context, name, autoCreate);
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		Type parentType = getParentJavaType(context);
		Type fieldType = getJavaType(context, parentType);
		FieldConstant field = new FieldConstant(parentType, this.getId().toString(), fieldType);
		method.addInstruction(Opcode.GETSTATIC, field);
		return new ResultInfo(fieldType);
	}

	public void compileCallConstructor(Context context, MethodInfo method, Flags flags) {
		EnumeratedCategoryType itype = (EnumeratedCategoryType)this.getType(context);
		Type type = CompilerUtils.getCategoryEnumConcreteType(itype.getTypeNameId());
		ResultInfo result = CompilerUtils.compileNewInstance(method, type);
		compileAssignments(context, method, flags, result);
	}
	
	public void compileInnerClassAndCallConstructor(Context context, MethodInfo method, Flags flags, 
			ClassConstant parentClass, Type fieldType) {
		ClassFile thisClass = compileInnerClass(method.getClassFile().getThisClass().getType(), fieldType);
		method.getClassFile().addInnerClass(thisClass);
		ResultInfo result = CompilerUtils.compileNewInstance(method, fieldType);
		compileAssignments(context, method, flags, result);
	}

	private ClassFile compileInnerClass(Type parentType, Type fieldType) {
		ClassFile classFile = new ClassFile(fieldType);
		classFile.setSuperClass(new ClassConstant(parentType));
		CompilerUtils.compileEmptyConstructor(classFile);
		CompilerUtils.compileSuperConstructor(classFile, String.class);
		return classFile;
	}

	private void compileAssignments(Context context, MethodInfo method, Flags flags, ResultInfo thisInfo) {
		if(assignments!=null) for(Argument assignment : assignments)
			compileAssignment(context, method, flags, thisInfo, assignment);
		Argument name = new Argument(new AttributeParameter(new Identifier("name")), new TextLiteral("\"" + getName() + "\""));
		compileAssignment(context, method, flags, thisInfo, name);
	}
	
	private void compileAssignment(Context context, MethodInfo method, Flags flags, 
			ResultInfo thisInfo, Argument assignment) {
		// keep a copy of new instance on top of the stack
		method.addInstruction(Opcode.DUP);
		// get value
		/* ResultInfo valueInfo = */assignment.getExpression().compile(context, method, flags);
		// call setter
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, assignment.getParameterId());
		FieldInfo field = decl.toFieldInfo(context);
		MethodConstant m = new MethodConstant(thisInfo.getType(), 
				CompilerUtils.setterName(field.getName().getValue()), field.getType(), void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	private Type getParentJavaType(Context context) {
		EnumeratedCategoryType itype = (EnumeratedCategoryType)this.getType(context);
		return CompilerUtils.getCategoryEnumConcreteType(itype.getTypeNameId());
	}


	@Override
	public Type getJavaType(Context context) {
		Type parentType = getParentJavaType(context);
		return getJavaType(context, parentType);
	}

	private Type getJavaType(Context context, Type parentType) {
		EnumeratedCategoryDeclaration cd = 
				context.getRegisteredDeclaration(EnumeratedCategoryDeclaration.class, type.getTypeNameId());
		if(cd.isPromptoRoot(context))
			return parentType;
		else
			return CompilerUtils.getExceptionType(parentType, this.getName());
	}

	@Override
	public void declare(Transpiler transpiler) {
		this.type.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append(this.getName());
		return false;
	}

	public void initializeError(Transpiler transpiler) {
	    transpiler.append("var ").append(this.getName()).append(" = new ").append(this.type.getTypeName()).append("({");
	    transpiler.append("name: '").append(this.getName()).append("', ");
	    if(this.assignments!=null) {
	        this.assignments.forEach(assignment -> {
	            transpiler.append(assignment.getParameter().getName()).append(":");
	            assignment.getExpression().transpile(transpiler);
	            transpiler.append(", ");
	        });
	    }
	    transpiler.trimLast(2);
	    transpiler.append("});").newLine();
	}

	public void initialize(Transpiler transpiler) {
	    transpiler.append("var ").append(this.getName()).append(" = ");
	    AttributeParameter nameArg = new AttributeParameter(new Identifier("name"));
	    Argument nameAssign = new Argument(nameArg, new TextLiteral('"' + this.getName() + '"'));
	    ArgumentList assignments = new ArgumentList(this.assignments);
	    assignments.add(nameAssign);
	    ConstructorExpression exp = new ConstructorExpression((CategoryType) this.type, null, assignments, false);
	    exp.transpile(transpiler);
	    transpiler.append(";").newLine();
	}
}
