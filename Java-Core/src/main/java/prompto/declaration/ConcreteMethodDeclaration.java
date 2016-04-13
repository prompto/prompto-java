package prompto.declaration;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import prompto.argument.CategoryArgument;
import prompto.argument.CodeArgument;
import prompto.argument.IArgument;
import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Descriptor.Method;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.LocalVariableTableAttribute;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.PromptoError;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.statement.DeclarationStatement;
import prompto.statement.StatementList;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.TextType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ConcreteMethodDeclaration extends BaseMethodDeclaration implements IMethodDeclaration {

	StatementList statements;
	
	@SuppressWarnings("unchecked")
	public ConcreteMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType, StatementList statements) {
		super(name, arguments, returnType);
		this.statements = statements;
		statements.forEach((s)->{
			if(s instanceof DeclarationStatement)
				((DeclarationStatement<IDeclaration>)s).getDeclaration().setClosureOf(this);
		});
	}

	public StatementList getStatements() {
		return statements;
	}
	
	@Override
	public boolean isAbstract() {
		return false;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.isGlobalContext())
			writer = writer.newLocalWriter();
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
	
	protected void toSDialect(CodeWriter writer) {
		writer.append("def ");
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(")");
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("->");
			returnType.toDialect(writer);
		}
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(getName());
		writer.append(" as method ");
		arguments.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning ");
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	protected void toODialect(CodeWriter writer) {
		if(returnType!=null && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("method ");
		writer.append(getName());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}

	@Override
	public IType check(Context context) {
		if(canBeChecked(context))
			return fullCheck(context);
		else
			return VoidType.instance();
	}
	
	private boolean canBeChecked(Context context) {
		if(context.isGlobalContext())
			return !isTemplate();
		else
			return true;
	}
	
	@Override
	public boolean isTemplate() {
		// if at least one argument is 'Code'
		if(arguments==null)
			return false;
		for( IArgument arg : arguments) {
			if(arg instanceof CodeArgument)
				return true;
		}
		return false;
	}

	private IType fullCheck(Context context) {
		if(context.isGlobalContext()) {
			context = context.newLocalContext();
			registerArguments(context);
		}
		if(arguments!=null)
			arguments.check(context);
		return checkStatements(context);
	}

	protected IType checkStatements(Context context) {
		return statements.check(context, returnType);
	}

	public IType checkChild(Context context) {
		if(arguments!=null)
			arguments.check(context);
		Context child = context.newChildContext();
		registerArguments(child);
		return statements.check(child, returnType);
	}

	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public IValue interpret(Context context) throws PromptoError {
		context.enterMethod(this);
		try {
			return statements.interpret(context);
		} finally {
			context.leaveMethod(this);
		}
	}
	
	@Override
	public void compile(Context context, ClassFile classFile) {
		compile(context, classFile, getName());
	}
	
	public void compile(Context context, ClassFile classFile, String methodName) {
		context = prepareContext(context);
		IType returnType = check(context);
		MethodInfo method = createMethodInfo(context, classFile, returnType, methodName);
		registerLocals(context, classFile, method);
		produceByteCode(context, method, returnType);
	}
	
	private void produceByteCode(Context context, MethodInfo method, IType returnType) {
		statements.forEach((s)->
			s.compile(context, method, new Flags().withMember(this.memberOf!=null)));
		// add return for void
		if(returnType==VoidType.instance())
			method.addInstruction(Opcode.RETURN);
	}

	protected void registerLocals(Context context, ClassFile classFile, MethodInfo method) {
		if(Modifier.isAbstract(classFile.getModifiers())) // TODO find a more accurate way
			method.addModifier(Modifier.STATIC); // otherwise it's a member method
		else 
			method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		List<IArgument> args = arguments.stripOutTemplateArguments();
		args.forEach((arg)->
			arg.registerLocal(context, method, new Flags()));
		args.forEach((arg)->
			arg.extractLocal(context, method, new Flags()));
	}

	@Override
	public String compileTemplate(Context context, ClassFile classFile) {
		String methodName = computeTemplateName(classFile);
		compile(context, classFile, methodName);
		return methodName;
	}


	private String computeTemplateName(ClassFile classFile) {
		int i = 0;
		while(true) {
			String methodName = this.getName() + '$' + (++i);
			if(!classFile.hasMethod(methodName))
				return methodName;
		}
	}

	@Override
	public boolean isEligibleAsMain() {
		if(arguments.size()==0)
			return true;
		if(arguments.size()==1) {
			IArgument arg = arguments.getFirst();
			if(arg instanceof CategoryArgument) {
				IType type = ((CategoryArgument)arg).getType();
				if(type instanceof DictType)
					return ((DictType)type).getItemType()==TextType.instance();
			}
		}
		return super.isEligibleAsMain();
	}

	public void compileClosureClass(Context context, MethodInfo method) {
		Type innerType = getClosureClassType(method);
		ClassFile classFile = new ClassFile(innerType);
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.setEnclosingMethod(method);
		LocalVariableTableAttribute locals = method.getLocals();
		compileClosureFields(context, classFile, locals);
		compileClosureConstructor(context, classFile, locals);
		context = context.newClosureContext(new MethodType(this));
		registerArguments(context);
		compile(context, classFile);
		method.getClassFile().addInnerClass(classFile);
	}

	private Type getClosureClassType(MethodInfo method) {
		String innerClassName = method.getClassFile().getThisClass().getType().getTypeName();
		if(closureOf.getMemberOf()!=null)
			innerClassName += "$" + closureOf.getName();
		innerClassName += "$" + this.getName();
		return new PromptoType(innerClassName); 
	}

	private void compileClosureConstructor(Context context, ClassFile classFile, LocalVariableTableAttribute locals) {
		if(locals.getEntries().isEmpty())
			CompilerUtils.compileEmptyConstructor(classFile);
		else {
			Descriptor.Method proto = getClosureConstructorProto(locals);
			MethodInfo method = classFile.newMethod("<init>", proto);
			method.registerLocal("this", VerifierType.ITEM_UninitializedThis, classFile.getThisClass());
			locals.getEntries().forEach((local)->{
				Type type = ((StackLocal.ObjectLocal)local).getClassName().getType();
				String name = "this".equals(local.getName()) ? "this$0" : local.getName();
				if("this".equals(name)) {
					name = "this$0";
					type = CompilerUtils.categoryConcreteTypeFrom(type.getTypeName());
				}
				method.registerLocal(name, VerifierType.ITEM_Object, new ClassConstant(type));
				});
			method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
			MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", void.class);
			method.addInstruction(Opcode.INVOKESPECIAL, m);
			locals.getEntries().forEach((local)->{
				method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
				Type type = ((StackLocal.ObjectLocal)local).getClassName().getType();
				String name = local.getName();
				if("this".equals(name)) {
					name = "this$0";
					type = CompilerUtils.categoryConcreteTypeFrom(type.getTypeName());
				}
				CompilerUtils.compileALOAD(method, name);
				FieldConstant field = new FieldConstant(classFile.getThisClass(), name, type);
				method.addInstruction(Opcode.PUTFIELD, field);
				});
			method.addInstruction(Opcode.RETURN);
		}
	}

	private Method getClosureConstructorProto(LocalVariableTableAttribute locals) {
		List<Type> list = new ArrayList<>();
		locals.getEntries().forEach((local)->
			list.add(((StackLocal.ObjectLocal)local).getClassName().getType()));
		return new Descriptor.Method(list.toArray(new Type[list.size()]), void.class);
	}

	private void compileClosureFields(Context context, ClassFile classFile, LocalVariableTableAttribute locals) {
		locals.getEntries().forEach((local)->
			compileClosureField(context, classFile, local));
	}

	private void compileClosureField(Context context, ClassFile classFile, StackLocal local) {
		Type type = ((StackLocal.ObjectLocal)local).getClassName().getType();
		String name = local.getName();
		if("this".equals(name)) {
			name = "this$0";
			type = CompilerUtils.categoryConcreteTypeFrom(type.getTypeName());
		}
		FieldInfo field = new FieldInfo(name, type);
		classFile.addField(field);
	}
	
	public ResultInfo compileClosureInstance(Context context, MethodInfo method, Flags flags) {
		Type innerType = getClosureClassType(method);
		LocalVariableTableAttribute locals = method.getLocals(); // TODO: use a copy saved when constructor is created
		if(locals.getEntries().isEmpty())
			return CompilerUtils.compileNewInstance(method, innerType); 
		else {
			CompilerUtils.compileNewRawInstance(method, innerType);
			method.addInstruction(Opcode.DUP); 
			locals.getEntries().forEach((local)->
				CompilerUtils.compileALOAD(method, local.getName()));
			Descriptor.Method proto = getClosureConstructorProto(locals);
			IOperand c = new MethodConstant(innerType, "<init>", proto);
			method.addInstruction(Opcode.INVOKESPECIAL, c);
			return new ResultInfo(innerType);
		}
	}

}
