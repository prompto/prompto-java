package prompto.declaration;

import java.lang.reflect.Modifier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.grammar.ParameterList;
import prompto.grammar.Specificity;
import prompto.param.IParameter;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.ContextFlags;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.value.IValue;

public abstract class BaseMethodDeclaration extends BaseDeclaration implements IMethodDeclaration {

	CategoryDeclaration memberOf;
	IMethodDeclaration closureOf;
	ParameterList parameters;
	IType returnType;
	
	public BaseMethodDeclaration(Identifier name, ParameterList parameters, IType returnType) {
		super(name);
		this.parameters = parameters!=null ? parameters : new ParameterList();
		this.returnType = returnType;
	}

	@Override
	public DeclarationType getDeclarationType() {
		return DeclarationType.METHOD;
	}
	
	@Override
	public void setMemberOf(CategoryDeclaration declaration) {
		this.memberOf = declaration;
	}
	
	@Override
	public CategoryDeclaration getMemberOf() {
		return memberOf;
	}
	
	@Override
	public void setClosureOf(IMethodDeclaration declaration) {
		this.closureOf = declaration;
	}
	
	@Override
	public IMethodDeclaration getClosureOf() {
		return closureOf;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		StringBuilder sb = new StringBuilder(getId().toString());
		sb.append('(');
		for(IParameter param : parameters) {
			sb.append(param.getSignature(dialect));
			sb.append(", ");
		}
		if(parameters.size()>0)
			sb.setLength(sb.length()-2); // strip ", "
		sb.append(')');
		return sb.toString();
	}
	
	@Override
	public String getProto() {
		StringBuilder sb = new StringBuilder();
		for(IParameter param : parameters) {
			if(sb.length()>0)
				sb.append('/');
			sb.append(param.getProto());
		}
		return sb.toString();
	}
	
	@Override
	public ParameterList getParameters() {
		return parameters;
	}
	
	@Override
	public IType getReturnType() {
		return returnType;
	}

	@Override
	public void register(Context context) {
		context.registerDeclaration(this);
	}
	
	@Override
	public void registerParameters (Context context) {
		if(parameters!=null)
			parameters.register(context);
	}
		
	@Override
	public IType getType(Context context) {
		try {
			return check(context, ContextFlags.NONE);
		} catch (SyntaxError e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public boolean isAssignableTo(Context context, ArgumentList arguments, boolean checkInstance, boolean allowDerived, Predicate<Specificity> filter) {
		try {
			Context local = context.newLocalContext();
			registerParameters(local);
			ArgumentList argsList = new ArgumentList(arguments);
			for(IParameter parameter : parameters) {
				Argument argument = argsList.find(parameter.getId());
				if(argument==null) {
					IExpression expression = parameter.getDefaultExpression();
					if(expression!=null)
						argument = new Argument(parameter, expression);
				}
				if(argument==null) // missing argument
					return false;
				if(!isAssignableTo(local, parameter, argument, checkInstance, allowDerived, filter))
					return false;
				argsList.remove(argument);
			}
			return argsList.isEmpty();
		} catch (SyntaxError e) {
			return false;
		}
	}
	
	@Override
	public boolean isAssignableFrom(Context context, ArgumentList arguments) {
		try {
			Context local = context.newLocalContext();
			registerParameters(local);
			ArgumentList argsList = new ArgumentList(arguments);
			for(IParameter parameter : parameters) {
				Argument argument = argsList.find(parameter.getId());
				if(argument==null) {
					IExpression expression = parameter.getDefaultExpression();
					if(expression!=null)
						argument = new Argument(parameter, expression);
				}
				if(argument==null) // missing argument
					return false;
				if(!isAssignableFrom(local, parameter, argument))
					return false;
				argsList.remove(argument);
			}
			return argsList.isEmpty();
		} catch (SyntaxError e) {
			return false;
		}
	}
	
	boolean isAssignableTo(Context context, IParameter parameter, Argument argument, boolean useInstance, boolean allowDerived, Predicate<Specificity> filter) {
		Specificity spec = computeSpecificity(context, parameter, argument, useInstance, allowDerived);
		return filter.test(spec);
	}
	
	boolean isAssignableFrom(Context context, IParameter parameter, Argument argument) {
		try {
			IType requiredType = parameter.getType(context);
			IExpression expression = argument.getExpression();
			IType actualType = argument.checkActualType(context, requiredType, expression, false);
			if(actualType.equals(requiredType)
					|| actualType.isAssignableFrom(context, requiredType)
					|| requiredType.isAssignableFrom(context, actualType))
				return true;
			actualType = argument.resolve(context, this, false, false).check(context);
			return actualType.equals(requiredType)
					|| actualType.isAssignableFrom(context, requiredType)
					|| requiredType.isAssignableFrom(context, actualType);
		} catch(PromptoError error) {
			return false;
		}
	}

	@Override
	public Specificity computeSpecificity(Context context, IParameter parameter, Argument argument, boolean useInstance, boolean allowDerived) {
		try {
			IType requiredType = parameter.getType(context).resolve(context, null);
			IType actualType = argument.checkActualType(context, requiredType, argument.getExpression(), useInstance).resolve(context, null);
			if(actualType.equals(requiredType))
				return Specificity.EXACT;
			else if(requiredType.isAssignableFrom(context, actualType)) 
				return Specificity.INHERITED;
			else if(allowDerived && actualType.isAssignableFrom(context, requiredType)) 
				return Specificity.DERIVED;
			actualType = argument.resolve(context, this, useInstance, false).check(context);
			if(requiredType.isAssignableFrom(context, actualType))
				return Specificity.IMPLICIT;
			else if(allowDerived && actualType.isAssignableFrom(context, requiredType))
				return Specificity.IMPLICIT;
		} catch(PromptoError error) {
		}
		return Specificity.INCOMPATIBLE; 
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		throw new InternalError("Should never get there!");
	}
	
	@Override
	public boolean isEligibleAsMain() {
		return false;
	}
	
	@Override
	public void compilePrototype(Context context, ContextFlags flags, ClassFile classFile) {
		try {
			context = prepareContext(context, flags);
			IType returnType = check(context, ContextFlags.NONE);
			MethodInfo method = createMethodInfo(context, classFile, returnType, getName());
			method.addModifier(Modifier.ABSTRACT);
		} catch (PromptoError e) {
			throw new CompilerException(e);
		}
	}

	protected Context prepareContext(Context context, ContextFlags flags) {
		if(flags.isStart()) {
			// coming from nowhere, so need a clean context in which to register parameters
			context = context.newLocalContext();
			registerParameters(context);
		}
		return context;
	}
	
	protected MethodInfo createMethodInfo(Context context, ClassFile classFile, IType returnType, String methodName) {
		Descriptor.Method proto = CompilerUtils.createMethodDescriptor(context, parameters, returnType);
		MethodInfo method = classFile.newMethod(methodName, proto); 
		return method;
	}

	@Override
	public void compileParameters(Context context, MethodInfo method, Flags flags, ArgumentList arguments) {
		boolean isFirst = true;
		for(IParameter param : parameters.stripOutTemplateParameters()) {
			param.compileParameter(context, method, flags, arguments, isFirst);
			isFirst = false;
		}
	}
	
	public void declareParameters(Transpiler transpiler) {
		this.parameters.declare(transpiler);
	}

	public void transpileProlog(Transpiler transpiler) {
	    if (this.memberOf!=null) {
	        transpiler.append(this.memberOf.getName());
	        if(this.hasAnnotation(transpiler.getContext(), "@Static"))
	           	transpiler.append(".");
	        else
	        	transpiler.append(".prototype.");
	        transpiler.append(this.getTranspiledName(transpiler.getContext())).append(" = function (");
	    } else
	        transpiler.append("function ").append(this.getTranspiledName(transpiler.getContext())).append(" (");
	    this.parameters.transpile(transpiler);
	    transpiler.append(") {").indent();
	}


	public void transpileEpilog(Transpiler transpiler) {
	    transpiler.dedent().append("}");
	    if(this.memberOf!=null)
	        transpiler.append(";");
	    transpiler.newLine();
	}
	
	@Override
	public String getTranspiledName(Context context) {
	    // if this is a template instance, name is already transpiled
	    if(this.getName().indexOf("$")>0)
	    	return this.getName();
	    else if(this.hasLocalAnnotation("@Callback") || this.hasInheritedAnnotation(context, "@Callback"))
	    	return this.getName();
	    else {
	    	Stream<String> name = Stream.of(this.getName());
	    	Stream<String> args = this.parameters.stream().map(arg->arg.getTranspiledName(context));
	    	return Stream.concat(name, args).collect(Collectors.joining("$"));
	    }
	};
	
	
	@Override
	public boolean hasInheritedAnnotation(Context context, String name) {
		if(memberOf==null)
			return false;
		else
			return getOverriddenMethods(context).anyMatch(m->m.hasLocalAnnotation(name));
	}
	
	protected Stream<IMethodDeclaration> getOverriddenMethods(Context context) {
		Stream<CategoryDeclaration> categories = Stream.of(memberOf);
		if(memberOf.getDerivedFrom()!=null)
			categories = Stream.concat(categories, memberOf.getDerivedFrom().stream().map(id->context.getRegisteredDeclaration(CategoryDeclaration.class, id)));
		return categories
				.map(cat->cat.getLocalMethods().stream())
				.flatMap(Function.identity())
				.filter(m->this.getName().equals(m.getName()))
				.filter(m->this.getProto().equals(m.getProto()));
	}
	


}


