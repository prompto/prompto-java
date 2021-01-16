package prompto.expression;

import java.lang.reflect.Type;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.NativeGetterMethodDeclaration;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoAny;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoRoot;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.ClosureContext;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.statement.UnresolvedCall;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.value.ClosureValue;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;

public class MemberSelector extends SelectorExpression {

	Identifier id;
	
	public MemberSelector(Identifier id) {
		this.id = id;
	}
	
	public MemberSelector(IExpression parent, Identifier id) {
		super(parent);
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.toString();
	}

	@Override
	public void toDialect(CodeWriter writer) {
		if(writer.getDialect()==Dialect.E) 
			toEDialect(writer);
		else
			toOMDialect(writer);
	}
	
	void toEDialect(CodeWriter writer) {
		try {
			IType type = check(writer.getContext());
			if(type instanceof MethodType)
				writer.append("Method: ");
		} catch(SyntaxError e) {
			// gracefully skip exceptions
		}
		parentAndMemberToDialect(writer);
	}
	
	void toOMDialect(CodeWriter writer) {
		parentAndMemberToDialect(writer);
	}
	
	
	protected void parentAndMemberToDialect(CodeWriter writer) {
		try {
			resolveParent(writer.getContext());
		} catch(SyntaxError e) {
			// ignore
		}
		if(writer.getDialect()==Dialect.E) 
			parentToEDialect(writer);
		else
			parentToOMDialect(writer);
		writer.append(".");
		writer.append(id);
	}
	
	protected void parentToEDialect(CodeWriter writer) {
		if(parent instanceof UnresolvedCall) {
			writer.append('(');
			parent.toDialect(writer);
			writer.append(')');
		} else
			parent.parentToDialect(writer);
	}
	
	protected void parentToOMDialect(CodeWriter writer) {
		// if parent is: (method()), then supposedly this emanates from a translation from E dialect
		if(parent instanceof ParenthesisExpression && ((ParenthesisExpression)parent).getExpression() instanceof UnresolvedCall)
			((ParenthesisExpression)parent).getExpression().toDialect(writer);
		else
			parent.toDialect(writer);
	}

	@Override
	public String toString() {
		return parent.toString() + "." + id;
	}
	
	@Override
	public IType check(Context context) {
		if("this$0".equals(id.toString())) {
			InstanceContext instance = context.getClosestInstanceContext();
			return instance.getInstanceType();
		} else {
			IType parentType = checkParent(context);
			return parentType.checkMember(context, id);
		}
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
        // resolve parent to keep clarity
		IExpression parent = resolveParent(context);
        IValue instance = parent.interpret(context);
        if (instance == null || instance == NullValue.instance())
            throw new NullReferenceError();
        else
        	return instance.getMember(context, id, true);
	}
	
	@Override
	public IValue interpretReference(Context context) {
        // resolve parent to keep clarity
		IExpression parent = resolveParent(context);
        IValue instance = parent.interpret(context);
        if (instance == null || instance == NullValue.instance())
            throw new NullReferenceError();
        else if(instance instanceof IInstance) {
        	CategoryDeclaration category = ((IInstance)instance).getDeclaration();
    		MethodDeclarationMap methods = category.getAllMethods(context, id);
    		IMethodDeclaration method = methods.getFirst(); // TODO check prototype
    		return new ClosureValue(context.newInstanceContext((IInstance)instance, true), new MethodType(method));
        } else
        	throw new SyntaxError("Should never get here!");
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
        // resolve parent to keep clarity
		IExpression parent = resolveParent(context);
		ResultInfo info = parent.compileParent(context, method, flags);
		if(info.isStatic())
			return compileStaticMember(context, method, flags, parent);
		else
			return compileInstanceMember(context, method, flags, info);
	}
	
	@Override
	public ResultInfo compileReference(Context context, MethodInfo method, Flags flags) {
	    IExpression parent = this.resolveParent(context);
	    IType parentType = parent.check(context);
	    if(parentType instanceof CategoryType) {
	       	CategoryDeclaration category = (CategoryDeclaration)((CategoryType)parentType).getDeclaration(context);
			MethodDeclarationMap methods = category.getAllMethods(context, id);
			ConcreteMethodDeclaration proto = (ConcreteMethodDeclaration)methods.getFirst(); // TODO check prototype
			return proto.compileMethodInstance(context, method, flags, parent::compileParent);
	    } else
        	throw new SyntaxError("Should never get here!");
 	}

	private ResultInfo compileStaticMember(Context context, MethodInfo method, Flags flags, IExpression parent) {
		IType type = parent.check(context);
		return type.compileGetStaticMember(context, method, flags, id);
	}

	private ResultInfo compileInstanceMember(Context context, MethodInfo method, Flags flags, ResultInfo info) {
		IType type = check(context);
		Type resultType = type.getJavaType(context);
		// special case for char.codePoint() to avoid wrapping char.class for just one member
		if(Character.class==info.getType() && "codePoint".equals(getName()))
			return compileCharacterCodePoint(method, flags);
		// special case for String.length() to avoid wrapping String.class for just one member
		else if(String.class==info.getType() && "count".equals(getName()))
			return compileStringLength(method, flags);
		else if(PromptoAny.class==info.getType()) 
			return compileGetMember(context, method, flags, info, resultType);
		else if(shouldCompileToGetOrCreate(info.getType()))
			return compileGetOrCreate(context, method, flags, info, resultType);		
		// special case for o.text which translates to toString
		else if(shouldCompileToObjectToString(context, parent))
			return compileObjectToString(method, flags);
		else {
			String getterName = CompilerUtils.getterName(getName());
			if("getCategory".contentEquals(getterName))
				compileGetCategory(context, method, flags);
			else if(isCompilingGetter(context, method, info, getterName))
				compileGetField(context, method, flags, info, resultType);
			else if(context instanceof ClosureContext)
				compileGetField(context, method, flags, info, resultType);
			else if(PromptoDict.Entry.class==info.getType()) // TODO manage all generics
				compileGenericGetter(context, method, flags, getterName, info, resultType);
			else if(info.isNativeCategory())
				compileNativeGetter(context, method, flags, getterName, info, resultType);
			else if(info.isInterface()) 
				compileInterfaceGetter(context, method, flags, getterName, info, resultType);
			else 
				compileBeanGetter(context, method, flags, getterName, info, resultType);
			return new ResultInfo(resultType);
		}
	}
		
	private boolean shouldCompileToGetOrCreate(Type type) {
		if(PromptoDocument.class!=type)
			return false;
		else switch(getName()) {
		case "count":
		case "keys":
		case "values":
			return false;
		default:
			return true;
		}
	}

	private boolean shouldCompileToObjectToString(Context context, IExpression parent) {
		if(!"text".equals(getName()))
			return false;
		IType parentType = parent.check(context);
		if(parentType instanceof CategoryType) {
			IDeclaration decl = ((CategoryType)parentType).getDeclaration(context);
			if(decl instanceof CategoryDeclaration) {
				if(((CategoryDeclaration)decl).hasAttribute(context, new Identifier("text")))
					return false;
			}
		}
		return true;
	}

	private void compileNativeGetter(Context context, MethodInfo method, Flags flags, String getterName, ResultInfo info, Type resultType) {
		NativeGetterMethodDeclaration getter = getNativeGetter(context);
		if(getter!=null) {
			StackState state = method.captureStackState();
			// can't use 'this' since it could refer to another abject than the native parent
			StackLocal local = method.registerLocal("$this$", VerifierType.ITEM_Object, new ClassConstant(info.getType())); 
			CompilerUtils.compileASTORE(method, local);
			context = context.newInstanceContext(getter.getMemberOf().getType(context), false).newChildContext(); // mimic method call
			getter.compile(context, method, new Flags());
			method.unregisterLocal(local);
			method.restoreStackLocals(state);
			state = method.captureStackState();
			method.placeLabel(state);
			return;
		} else
			compileBeanGetter(context, method, flags, getterName, info, resultType);
	}

	private NativeGetterMethodDeclaration getNativeGetter(Context context) {
		IType type = parent.check(context);
		IDeclaration declaration = type instanceof CategoryType ? ((CategoryType)type).getDeclaration(context) : null;
		if(declaration instanceof NativeCategoryDeclaration)
			return (NativeGetterMethodDeclaration)((NativeCategoryDeclaration)declaration).findGetter(context, id);
		else
			return null;
	}

	private void compileGetCategory(Context context, MethodInfo method, Flags flags) {
		IOperand oper = new MethodConstant(PromptoRoot.class, "getCategory", CategoryDeclaration.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
	}


	private void compileBeanGetter(Context context, MethodInfo method, Flags flags, String getterName, ResultInfo info, Type resultType) {
		IOperand oper = new MethodConstant(info.getType(), getterName, resultType);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
	}

	private void compileInterfaceGetter(Context context, MethodInfo method, Flags flags, String getterName, ResultInfo info, Type resultType) {
		IOperand oper = new InterfaceConstant(info.getType(), getterName, resultType);
		method.addInstruction(Opcode.INVOKEINTERFACE, oper);
	}

	private void compileGenericGetter(Context context, MethodInfo method, Flags flags, String getterName, ResultInfo info, Type resultType) {
		IOperand oper = new MethodConstant(info.getType(), getterName, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(resultType));
	}

	private ResultInfo compileGetOrCreate(Context context, MethodInfo method, Flags flags, ResultInfo info, Type resultType) {
		IOperand oper = new StringConstant(getName());
		method.addInstruction(Opcode.LDC_W, oper);
		oper = new ClassConstant(PromptoDocument.class);
		method.addInstruction(Opcode.LDC_W, oper);
		oper = new MethodConstant(PromptoDocument.class, "getOrCreate", Object.class, 
				Class.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(PromptoAny.class);
	}

	private ResultInfo compileGetMember(Context context, MethodInfo method, Flags flags, ResultInfo info, Type resultType) {
		IOperand oper = new StringConstant(getName());
		method.addInstruction(Opcode.LDC_W, oper);
		oper = new MethodConstant(PromptoAny.class, "getMember", Object.class, 
				Object.class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(PromptoAny.class);
	}

	private void compileGetField(Context context, MethodInfo method, Flags flags, ResultInfo info, Type resultType) {
		Type classType = CompilerUtils.categoryConcreteTypeFrom(info.getType().getTypeName());
		if("this$0".equals(id.toString()))
			resultType = CompilerUtils.categoryConcreteTypeFrom(resultType.getTypeName());
		FieldConstant f = new FieldConstant(classType, id.toString(), resultType);
		method.addInstruction(Opcode.GETFIELD, f);
	}

	private boolean isCompilingGetter(Context context, MethodInfo method, ResultInfo parent, String getterName) {
		return this.parent instanceof ThisExpression && getterName.equals(method.getName().getValue());
	}

	private ResultInfo compileCharacterCodePoint(MethodInfo method, Flags flags) {
		IOperand oper = new MethodConstant(Character.class, "charValue", char.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.toPrimitive())
			return CompilerUtils.intTolong(method);
		else
			return CompilerUtils.intToLong(method);
	}
	
	private ResultInfo compileObjectToString(MethodInfo method, Flags flags) {
		IOperand oper = new MethodConstant(Object.class, "toString", String.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(String.class);
	}


	private ResultInfo compileStringLength(MethodInfo method, Flags flags) {
		IOperand oper = new MethodConstant(String.class, "length", int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.toPrimitive())
			return CompilerUtils.intTolong(method);
		else
			return CompilerUtils.intToLong(method);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
	    IExpression parent = this.resolveParent(transpiler.getContext());
	    parent.declareParent(transpiler);
	    IType parentType = this.checkParent(transpiler.getContext());
	    parentType.declareMember(transpiler, this.getId());
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    IExpression parent = this.resolveParent(transpiler.getContext());
	    parent.transpileParent(transpiler);
	    transpiler.append(".");
		IType parentType = this.checkParent(transpiler.getContext());
		parentType.transpileMember(transpiler, this.getId());
		return false;
	}
	
	@Override
	public boolean transpileReference(Transpiler transpiler, MethodType method) {
	    IExpression parent = this.resolveParent(transpiler.getContext());
	    parent.transpileParent(transpiler);
	    transpiler.append(".");
	    transpiler.append(method.getMethod().getTranspiledName(transpiler.getContext(), this.getName()));
		return false;
	}

}
