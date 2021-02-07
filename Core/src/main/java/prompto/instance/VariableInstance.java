package prompto.instance;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.runtime.Context.InstanceContext;
import prompto.runtime.Variable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.CodeType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class VariableInstance implements IAssignableInstance {
	
	Identifier id;
	
	public VariableInstance(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	public Identifier getId() {
		return id;
	}
	
	public String getName() {
		return id.toString();
	}

	
	@Override
	public ResultInfo compileParent(Context context, MethodInfo method, Flags flags) {
		Context actual = context.contextForValue(id);
		if(actual instanceof InstanceContext) {
			ResultInfo result = compileInstanceParent(context, method, flags, (InstanceContext)actual);
			if(result!=null)
				return result;
		}
		return compileLocalParent(context, method, flags);
	}
	
	
	public ResultInfo compileInstanceParent(Context context, MethodInfo method, Flags flags, InstanceContext actual) {
		IType type = actual.getInstanceType();
		if(type instanceof CategoryType) { // could be a closure
			ResultInfo result = ((CategoryType)type).compileGetStaticMember(context, method, flags.withGraceful(true), id);
			if(result!=null)
				return result;
		}
		return null;
	}

	public ResultInfo compileLocalParent(Context context, MethodInfo method, Flags flags) {
		StackLocal local = method.getRegisteredLocal(id.toString());
		if(local instanceof StackLocal.ObjectLocal)
			return CompilerUtils.compileALOAD(method, local);
		else
			throw new UnsupportedOperationException();
	}
	
	@Override
	public ResultInfo compileAssign(Context context, MethodInfo method, Flags flags, IExpression expression) {
		Context actual = context.contextForValue(id);
		if(actual instanceof InstanceContext) {
			ResultInfo result = compileAssignInstanceMember(context, method, flags, expression, (InstanceContext)actual);
			if(result!=null)
				return result;
		}
		return compileAssignVariable(context, method, flags, expression);
	}
	
	public ResultInfo compileAssignInstanceMember(Context context, MethodInfo method, Flags flags, IExpression expression, InstanceContext actual) {
		IType type = actual.getInstanceType();
		if(type instanceof CategoryType) // could be a closure
			return ((CategoryType)type).compileSetMember(context, method, flags, null, expression, id);
		else
			return null;
	}

	public ResultInfo compileAssignVariable(Context context, MethodInfo method, Flags flags, IExpression expression) {
		IType valueType = expression.check(context);
		if(valueType==CodeType.instance())
			return compileAssignCodeVariable(context, method, flags, expression);
		else
			return compileAssignDataVariable(context, method, flags, expression, valueType);
	}
	
	private ResultInfo compileAssignCodeVariable(Context context, MethodInfo method, Flags flags, IExpression expression) {
		// Code expressions need to be interpreted as part of compile
		assign(context, expression);
		return new ResultInfo(void.class);
	}

	private ResultInfo compileAssignDataVariable(Context context, MethodInfo method, Flags flags, IExpression expression, IType valueType) {
		checkAssignValue(context, valueType, this.id); // id: any section will do for now
		ResultInfo info = expression.compile(context, method, flags);
		StackLocal local = method.registerLocal(id.toString(), VerifierType.ITEM_Object, new ClassConstant(info.getType()));
		CompilerUtils.compileASTORE(method, local);
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
	public IType checkAssignValue(Context context, IType valueType, ICodeSection section) {
		// called for a=x
		INamed actual = context.getRegisteredValue(INamed.class, id);
		if(actual==null)
			context.registerValue(new Variable(id, valueType));
		else {
			// need to check type compatibility
			IType actualType = actual.getType(context);
			actualType.checkAssignableFrom(context, valueType, section);
			valueType = actualType;
		}
		return valueType;
	}
	
	@Override
	public IType checkAssignMember(Context context, Identifier memberName, IType valueType, ICodeSection section) {
		// called for a.x = y
		INamed actual = context.getRegisteredValue(INamed.class, id);
		if(actual==null) {
			context.getProblemListener().reportUnknownIdentifier(this.id, id.toString());
			return VoidType.instance();
		}
		IType thisType = actual.getType(context);
		if(thisType == DocumentType.instance())
			return valueType;
		else {
			if(thisType instanceof CategoryType && !((CategoryType)thisType).isMutable())
				context.getProblemListener().reportNotMutable(section, id.toString());
			IType requiredType = thisType.checkMember(context, memberName);
	       if (requiredType!=null && !requiredType.isAssignableFrom(context, valueType))
	            context.getProblemListener().reportIllegalAssignment(section, requiredType, valueType);
	        return valueType;
		}
	}
	
	@Override
	public IType checkAssignItem(Context context, IType itemType, IType valueType, ICodeSection section) {
		// called for a[x] = y
		INamed actual = context.getRegisteredValue(INamed.class, id);
		if(actual==null) 
			throw new SyntaxError("Unknown variable:" + this.id);
		IType parentType = actual.getType(context);
		return parentType.checkItem(context, itemType);
	}
	
	@Override
	public void assign(Context context, IExpression expression) throws PromptoError {
 		IValue value = expression.interpret(context);
		if(context.getRegisteredValue(INamed.class,id)==null) {
			IType type = expression.check(context);
			context.registerValue(new Variable(id, type)); 
		}
		context.setValue(id, value);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return context.getValue(id);
	}
	
	@Override
	public IType check(Context context) {
		INamed actual = context.getRegisteredValue(INamed.class, id);
		return actual.getType(context);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append(this.getName());
	}
	
	@Override
	public void declareAssign(Transpiler transpiler, IExpression expression) {
		Context context = transpiler.getContext();
	   if(context.getRegisteredValue(INamed.class, this.getId())==null) {
	        IType valueType = expression.check(context);
	        context.registerValue(new Variable(this.id, valueType));
	        // Code expressions need to be interpreted as part of full check
	        if (valueType == CodeType.instance()) {
	            context.setValue(this.id, expression.interpret(context));
	        }

	    }
	    expression.declare(transpiler);
	}
	
	@Override
	public void transpileAssign(Transpiler transpiler, IExpression expression) {
		Context context = transpiler.getContext();
	    if(context.getRegisteredValue(INamed.class, this.id)==null) {
	        IType type = expression.check(context);
	        context.registerValue(new Variable(this.id, type));
	        transpiler.append("var ");
	    }
	    context = context.contextForValue(this.id);
	    if(context instanceof InstanceContext)
	    	transpileAssignInstance(transpiler, expression, (InstanceContext)context);
	    else {
	        transpiler.append(this.getName());
	        transpiler.append(" = ");
	        expression.transpile(transpiler);
	    }
    }
	
	private void transpileAssignInstance(Transpiler transpiler, IExpression expression, InstanceContext context) {
		IType type = context.getInstanceType();
		type.transpileInstance(transpiler);
		if(type instanceof CategoryType)
			((CategoryType)type).transpileAssignMemberValue(transpiler, this.id.toString(), expression);
		else {
				
			transpiler.append(".setMember('").append(this.getName()).append("', ");
	        expression.transpile(transpiler);
	        transpiler.append(")");
		}
	}

	@Override
	public void transpileAssignParent(Transpiler transpiler) {
		Context context = transpiler.getContext();
	    context = context.contextForValue(this.id);
	    if(context instanceof InstanceContext)
	    	transpileAssignParentInstance(transpiler, (InstanceContext)context);
	    else
	    	transpiler.append(this.getName());
	}

	private void transpileAssignParentInstance(Transpiler transpiler, InstanceContext context) {
		IType type = context.getInstanceType();
		type.transpileInstance(transpiler);
		transpiler.append(".").append(this.getName());
	}
	
}
