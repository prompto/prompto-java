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
	
	ArgumentList arguments;
	IInstance instance;
	
	public CategorySymbol(Identifier name, ArgumentList arguments) {
		super(name);
		this.arguments = arguments;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(symbol);
		writer.append(" ");
		arguments.toDialect(writer);
	}
	
	public void setArguments(ArgumentList arguments) {
		this.arguments = arguments;
	}
	
	public ArgumentList getArguments() {
		return arguments;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(arguments!=null)
			sb.append(arguments.toString());
		if(sb.length()==0)
			sb.append(type.getTypeNameId());
		return sb.toString();
	}
	
	@Override
	public IType check(Context context) {
		EnumeratedCategoryDeclaration cd = context.getRegisteredDeclaration(
				EnumeratedCategoryDeclaration.class, type.getTypeNameId());
		if(cd==null)
			context.getProblemListener().reportUnknownCategory(this, type.getTypeName());
		if(arguments!=null) {
			context = context.newChildContext();
			for(Argument argument : arguments) {
				if(!cd.hasAttribute(context, argument.getParameterId()))
					throw new SyntaxError("\"" + argument.getParameterId() + 
						"\" is not an attribute of " + type.getTypeName());	
				argument.check(context);
			}
		}
		return type;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(instance==null)
			instance = createInstance(context);
		return instance;
	}
	
	private IInstance createInstance(Context context) {
		EnumeratedCategoryType type = (EnumeratedCategoryType)this.getType(context);
		IInstance instance = type.newInstance(context);
		instance.setMutable(true);
		if(arguments!=null) {
			context = context.newLocalContext();
			for(Argument argument : arguments) {
				IValue value = argument.getExpression().interpret(context);
				instance.setMember(context, argument.getParameterId(), value);
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
			if(arguments!=null) {
				context = context.newLocalContext();
				for(Argument argument : arguments) {
					generator.writeFieldName(argument.getParameter().getName());
					IValue value = argument.getExpression().interpret(context);
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
		if(arguments!=null) for(Argument argument : arguments)
			compileArgument(context, method, flags, thisInfo, argument);
		Argument name = new Argument(new AttributeParameter(new Identifier("name")), new TextLiteral("\"" + getName() + "\""));
		compileArgument(context, method, flags, thisInfo, name);
	}
	
	private void compileArgument(Context context, MethodInfo method, Flags flags, ResultInfo thisInfo, Argument argument) {
		// keep a copy of new instance on top of the stack
		method.addInstruction(Opcode.DUP);
		// get value
		/* ResultInfo valueInfo = */argument.getExpression().compile(context, method, flags);
		// call setter
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, argument.getParameterId());
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
	    if(this.arguments!=null) {
	        this.arguments.forEach(argument -> {
	            transpiler.append(argument.getParameter().getName()).append(":");
	            argument.getExpression().transpile(transpiler);
	            transpiler.append(", ");
	        });
	    }
	    transpiler.trimLast(2);
	    transpiler.append("});").newLine();
	}

	public void initialize(Transpiler transpiler) {
	    transpiler.append("var ").append(this.getName()).append(" = ");
	    AttributeParameter attribute = new AttributeParameter(new Identifier("name"));
	    Argument argument = new Argument(attribute, new TextLiteral('"' + this.getName() + '"'));
	    ArgumentList arguments = new ArgumentList(this.arguments);
	    arguments.add(argument);
	    ConstructorExpression exp = new ConstructorExpression((CategoryType) this.type, null, arguments, false);
	    exp.transpile(transpiler);
	    transpiler.append(";").newLine();
	}
}
