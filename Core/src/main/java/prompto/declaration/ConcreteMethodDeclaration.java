package prompto.declaration;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import prompto.compiler.InterfaceType;
import prompto.compiler.LocalVariableTableAttribute;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NameAndTypeConstant;
import prompto.compiler.NamedType;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StringConstant;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoMethod;
import prompto.param.CategoryParameter;
import prompto.param.CodeParameter;
import prompto.param.IParameter;
import prompto.param.ParameterList;
import prompto.param.ValuedCodeParameter;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.problem.IProblemListener;
import prompto.runtime.Context;
import prompto.statement.DeclarationStatement;
import prompto.statement.StatementList;
import prompto.transpiler.Transpiler;
import prompto.type.DictType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.TextType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.utils.TriFunction;
import prompto.value.CodeValue;
import prompto.value.IValue;

public class ConcreteMethodDeclaration extends BaseMethodDeclaration implements IMethodDeclaration {

	StatementList statements;
	DeclarationStatement<IMethodDeclaration> declarationOf;
	Map<Identifier, ValuedCodeParameter> codeParameters;
	
	public ConcreteMethodDeclaration(Identifier name, ParameterList parameters, IType returnType, StatementList statements) {
		super(name, parameters, returnType);
		if(statements==null)
			statements = new StatementList();
		this.statements = statements;
		registerClosures();
	}

	@SuppressWarnings("unchecked")
	private void registerClosures() {
		statements.stream()
			.filter(s->s instanceof DeclarationStatement)
			.map(s->(DeclarationStatement<IDeclaration>)s)
			.forEach(s->s.getDeclaration().setClosureOf(this));
	}

	public StatementList getStatements() {
		return statements;
	}
	
	@Override
	public void setDeclarationOf(DeclarationStatement<IMethodDeclaration> statement) {
		declarationOf = statement;
	}
	
	@Override
	public DeclarationStatement<IMethodDeclaration> getDeclarationOf() {
		return declarationOf;
	}
	
	@Override
	public boolean isAbstract() {
		return false;
	}
	
	@Override
	public ICodeSection locateCodeSection(ISection section) {
		return statements.locateCodeSection(section);
	}

	@Override
	public void declarationToDialect(CodeWriter writer) {
		if(writer.isGlobalContext())
			writer = writer.newLocalWriter();
		registerParameters(writer.getContext());
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case M:
			toMDialect(writer);
			break;
		}
	}
	
	protected void toMDialect(CodeWriter writer) {
		writer.append("def ");
		writer.append(getName());
		writer.append(" (");
		parameters.toDialect(writer);
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
		parameters.toDialect(writer);
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
		parameters.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}

	@Override
	public IType check(Context context, boolean isStart) {
		if(canBeChecked(context, isStart))
			return fullCheck(context, isStart);
		else
			return VoidType.instance();
	}
	
	private boolean canBeChecked(Context context, boolean isStart) {
		if(isStart)
			return !isTemplate();
		else
			return true;
	}
	
	@Override
	public boolean isTemplate() {
		// if at least one parameter is 'Code'
		if(parameters==null)
			return false;
		else
			return parameters.stream().anyMatch(param -> param instanceof CodeParameter);
	}

	private IType fullCheck(Context context, boolean isStart) {
		IProblemListener listener = context.getProblemListener();
		listener.pushDeclaration(this);
		try {
			if(isStart) {
				context = context.newLocalContext();
				registerParameters(context);
			}
			if(parameters!=null)
				parameters.check(context);
			return checkStatements(context);
		} finally {
			listener.popDeclaration();
		}
	}

	protected IType checkStatements(Context context) {
		return statements.check(context, returnType);
	}

	@Override
	public IType checkChild(Context context) {
		IProblemListener listener = context.getProblemListener();
		listener.pushDeclaration(this);
		try {
			checkSingletonInitialize(context);
			if(parameters!=null)
				parameters.check(context);
			Context child = context.newChildContext();
			registerParameters(child);
			return checkStatements(child);
		} finally {
			listener.popDeclaration();
		}
	}

	private void checkSingletonInitialize(Context context) {
		if("initialize".equals(getName())) {
			checkSingletonInitializeContext(context);
			checkSingletonInitializeParameters(context);
		}
	}

	private void checkSingletonInitializeParameters(Context context) {
		if(parameters!=null && !parameters.isEmpty())
			context.getProblemListener().reportIllegalInitializeParameters(this);
	}

	private void checkSingletonInitializeContext(Context context) {
		if(context instanceof Context.InstanceContext) {
			if(((Context.InstanceContext)context).getDeclaration() instanceof SingletonCategoryDeclaration)
				return;
		} 
		context.getProblemListener().reportIllegalInitialize(this.getId());
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		return statements.interpret(context);
	}
	
	@Override
	public void compile(Context context, boolean isStart, ClassFile classFile) {
		compile(context, isStart, classFile, getName());
	}
	
	public void compile(Context context, boolean isStart, ClassFile classFile, String methodName) {
		context = prepareContext(context, isStart);
		IType returnType = check(context, false);
		MethodInfo method = createMethodInfo(context, classFile, returnType, methodName);
		registerLocals(context, classFile, method);
		produceByteCode(context, method, returnType);
	}
	
	private void produceByteCode(Context context, MethodInfo method, IType returnType) {
		statements.compile(context, method, new Flags().withMember(this.memberOf!=null));
		// add return for void
		if(returnType==VoidType.instance())
			method.addInstruction(Opcode.RETURN);
	}

	protected void registerLocals(Context context, ClassFile classFile, MethodInfo method) {
		if(Modifier.isAbstract(classFile.getModifiers())) // TODO find a more accurate way
			method.addModifier(Modifier.STATIC); // otherwise it's a member method
		else 
			method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		List<IParameter> params = parameters.stripOutTemplateParameters();
		params.forEach(param->
			param.registerLocal(context, method, new Flags()));
		params.forEach(param->
			param.extractLocal(context, method, new Flags()));
	}

	@Override
	public String compileTemplate(Context context, boolean isStart, ClassFile classFile) {
		String methodName = computeTemplateName(classFile);
		compile(context, isStart, classFile, methodName);
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
		if(parameters.size()==0)
			return true;
		if(parameters.size()==1) {
			IParameter param = parameters.getFirst();
			if(param instanceof CategoryParameter) {
				IType type = ((CategoryParameter)param).getType();
				if(type instanceof DictType)
					return ((DictType)type).getItemType()==TextType.instance();
			}
		}
		return super.isEligibleAsMain();
	}

	public Type compileClosureClass(Context context, MethodInfo method) {
		IType returnType = this.checkChild(context);
		InterfaceType intf = new InterfaceType(parameters, returnType);
		Type innerType = getClosureClassType(method);
		ClassFile classFile = new ClassFile(innerType);
		classFile.setSuperClass(new ClassConstant(Object.class));
		classFile.addAttribute(intf.computeSignature(context, Object.class));
		classFile.addInterface(intf.getInterfaceType());
		classFile.setEnclosingMethod(method);
		LocalVariableTableAttribute locals = method.getLocals();
		compileClosureFields(context, classFile, locals);
		compileClosureConstructor(context, classFile, locals);
		context = context.newClosureContext(new MethodType(this));
		registerParameters(context);
		compile(context, false, classFile, intf.getInterfaceMethodName());
		method.getClassFile().addInnerClass(classFile);
		return innerType;
	}

	private Type getClosureClassType(MethodInfo method) {
		String innerClassName = method.getClassFile().getThisClass().getType().getTypeName();
		if(closureOf!=null && closureOf instanceof IMethodDeclaration && ((IMethodDeclaration)closureOf).getMemberOf()!=null)
			innerClassName += "$" + closureOf.getName();
		innerClassName += "$" + this.getName();
		return new NamedType(innerClassName); 
	}

	private void compileClosureConstructor(Context context, ClassFile classFile, LocalVariableTableAttribute locals) {
		// TODO filter out unused locals
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

	public ResultInfo compileMethodInstance(Context context, MethodInfo method, Flags flags) {
		return compileMethodInstance(context, method, flags, this::compileMethodInstanceParent);
	}
	
	public ResultInfo compileMethodInstance(Context context, MethodInfo method, Flags flags, TriFunction<Context, MethodInfo, Flags, ResultInfo> parentCompiler) {
		if(closureOf!=null)
			return compileClosureInstance(context, method, flags);
		else
			return compileMethodReference(context, method, flags, parentCompiler);
	}
	
	private ResultInfo compileMethodInstanceParent(Context context, MethodInfo method, Flags flags) {
		if(this.memberOf==null)
			method.addInstruction(Opcode.ACONST_NULL, new ClassConstant(Object.class));
		else
			method.addInstruction(Opcode.ALOAD_0, new ClassConstant(Object.class)); // this
		return new ResultInfo(Object.class);
	}
	
	private ResultInfo compileMethodReference(Context context, MethodInfo method, Flags flags, TriFunction<Context, MethodInfo, Flags, ResultInfo> parentCompiler) {
		// TODO use LambdaMetaFactory 
		Type methodsClassType = this.memberOf==null ? CompilerUtils.getGlobalMethodType(this.id) : CompilerUtils.getCategoryConcreteType(this.memberOf.getId());
		method.addInstruction(Opcode.LDC, new ClassConstant(methodsClassType));
		method.addInstruction(Opcode.LDC, new StringConstant(id.toString()));
		parentCompiler.apply(context, method, flags);
		NameAndTypeConstant nameAndType = new NameAndTypeConstant("newMethodReference", new Descriptor.Method(Class.class, String.class, Object.class, Object.class));
		MethodConstant mc = new MethodConstant(new ClassConstant(PromptoMethod.class), nameAndType);
		method.addInstruction(Opcode.INVOKESTATIC, mc);
		return new ResultInfo(methodsClassType);
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
	
	@Override
	public void declare(Transpiler transpiler) {
		if(declaring)
			return;
		IProblemListener listener = transpiler.getContext().getProblemListener();
		listener.pushDeclaration(this);
		declaring = true;
		try {
			doDeclare(transpiler);
		} finally {
			declaring = false;
			listener.popDeclaration();
		}
	}
	
	void doDeclare(Transpiler transpiler) {
		// TODO IType type = check(transpiler.getContext(), isStart);
		if(returnType!=null)
			returnType.declare(transpiler);
	    if(this.memberOf!=null)
	    	this.memberOf.declare(transpiler);
	    else {
	        transpiler = transpiler.newLocalTranspiler();
	        transpiler.declare(this);
	        this.declareParameters(transpiler);
	    }
    	this.registerParameters(transpiler.getContext());
	    this.statements.declare(transpiler);
	}
	
	@Override
	public void declareChild(Transpiler transpiler) {
	    this.declareParameters(transpiler);
	    transpiler = transpiler.newChildTranspiler(null);
	    this.registerParameters(transpiler.getContext());
	    this.statements.declare(transpiler);
	}
	
	@Override
	public void fullDeclare(Transpiler transpiler, Identifier methodName) {
		ConcreteMethodDeclaration declaration = new ConcreteMethodDeclaration(getId(), getParameters(), this.returnType, this.statements);
	    declaration.memberOf = this.memberOf;
	    transpiler.declare(declaration);
	    this.statements.declare(transpiler);
	    // remember code parameters
	    declaration.codeParameters = new HashMap<>();
	    getParameters().stream()
	    	.filter(param -> param instanceof CodeParameter )
	    	.forEach(param -> {
	    		CodeValue value = (CodeValue)transpiler.getContext().getValue(param.getId()); 
	    		declaration.codeParameters.put(param.getId(), new ValuedCodeParameter(param.getId(), value));
	    });
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IProblemListener listener = transpiler.getContext().getProblemListener();
		listener.pushDeclaration(this);
		try {
			return doTranspile(transpiler);
		} finally {
			listener.popDeclaration();
		}
	}
	
	boolean doTranspile(Transpiler transpiler) {
		this.registerParameters(transpiler.getContext());
	    this.registerCodeArguments(transpiler.getContext());
	    this.transpileProlog(transpiler);
	    this.statements.transpile(transpiler);
	    this.transpileEpilog(transpiler);
	    return true;
	}

	private void registerCodeArguments(Context context) {
		if(this.isTemplate()) {
		    if(this.codeParameters==null)
		        return;
		    this.codeParameters.forEach( (k,v) -> context.setValue(v.getId(), v.getValue()));
		}
		
	}

}
