package prompto.declaration;

import java.lang.reflect.Modifier;

import prompto.argument.IArgument;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.grammar.Specificity;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.value.IInstance;
import prompto.value.IValue;

public abstract class BaseMethodDeclaration extends BaseDeclaration implements IMethodDeclaration {

	CategoryDeclaration memberOf;
	IMethodDeclaration closureOf;
	ArgumentList arguments;
	IType returnType;
	
	public BaseMethodDeclaration(Identifier name, ArgumentList arguments) {
		super(name);
		this.arguments = arguments!=null ? arguments : new ArgumentList();
		this.returnType = null;
	}
	
	public BaseMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType) {
		super(name);
		this.arguments = arguments!=null ? arguments : new ArgumentList();
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
		for(IArgument arg : arguments) {
			sb.append(arg.getSignature(dialect));
			sb.append(", ");
		}
		if(arguments.size()>0)
			sb.setLength(sb.length()-2); // strip ", "
		sb.append(')');
		return sb.toString();
	}
	
	@Override
	public String getProto() {
		StringBuilder sb = new StringBuilder();
		for(IArgument arg : arguments) {
			if(sb.length()>0)
				sb.append('/');
			sb.append(arg.getProto());
		}
		return sb.toString();
	}
	
	@Override
	public ArgumentList getArguments() {
		return arguments;
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
	public void registerArguments (Context context) {
		if(arguments!=null)
			arguments.register(context);
	}
		
	@Override
	public IType getType(Context context) {
		try {
			return check(context);
		} catch (SyntaxError e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public boolean isAssignableTo(Context context, ArgumentAssignmentList assignments, boolean checkInstance) {
		try {
			Context local = context.newLocalContext();
			registerArguments(local);
			ArgumentAssignmentList assignmentsList = new ArgumentAssignmentList(assignments);
			for(IArgument argument : arguments) {
				ArgumentAssignment assignment = assignmentsList.find(argument.getId());
				if(assignment==null) {
					IExpression expression = argument.getDefaultExpression();
					if(expression!=null)
						assignment = new ArgumentAssignment(argument, expression);
				}
				if(assignment==null) // missing argument
					return false;
				if(!isAssignableTo(local,argument,assignment,checkInstance))
					return false;
				assignmentsList.remove(assignment);
			}
			return assignmentsList.isEmpty();
		} catch (SyntaxError e) {
			return false;
		}
	}
	
	@Override
	public boolean isAssignableFrom(Context context, ArgumentAssignmentList assignments) {
		try {
			Context local = context.newLocalContext();
			registerArguments(local);
			ArgumentAssignmentList assignmentsList = new ArgumentAssignmentList(assignments);
			for(IArgument argument : arguments) {
				ArgumentAssignment assignment = assignmentsList.find(argument.getId());
				if(assignment==null) {
					IExpression expression = argument.getDefaultExpression();
					if(expression!=null)
						assignment = new ArgumentAssignment(argument, expression);
				}
				if(assignment==null) // missing argument
					return false;
				if(!isAssignableFrom(local, argument, assignment))
					return false;
				assignmentsList.remove(assignment);
			}
			return assignmentsList.isEmpty();
		} catch (SyntaxError e) {
			return false;
		}
	}
	
	boolean isAssignableTo(Context context, IArgument argument, ArgumentAssignment assignment, boolean useInstance) {
		Specificity spec = computeSpecificity(context, argument, assignment, false, useInstance);
		return spec.isAssignable();
	}
	
	boolean isAssignableFrom(Context context, IArgument argument, ArgumentAssignment assignment) {
		try {
			IType required = argument.getType(context);
			IType actual = assignment.getExpression().check(context);
			if(actual.equals(required)
					|| actual.isAssignableFrom(context, required)
					|| required.isAssignableFrom(context, actual))
				return true;
			actual = assignment.resolve(context, this, false).check(context);
			return actual.equals(required)
					|| actual.isAssignableFrom(context, required)
					|| required.isAssignableFrom(context, actual);
		} catch(PromptoError error) {
			return false;
		}
	}

	@Override
	public Specificity computeSpecificity(Context context, IArgument argument, ArgumentAssignment assignment,
				boolean allowAncestor, boolean useInstance) {
		try {
			IType required = argument.getType(context);
			IType actual = assignment.getExpression().check(context);
			// retrieve actual runtime type
			if(useInstance && actual instanceof CategoryType) {
				// TODO: potential side effects here with function called multiple times
				IValue value = assignment.getExpression().interpret(context.getCallingContext());
				if(value instanceof IInstance)
					actual = ((IInstance)value).getType();
			}
			if(actual.equals(required))
				return Specificity.EXACT;
			if(required.isAssignableFrom(context, actual)) 
				return Specificity.INHERITED;
			if(allowAncestor && actual.isAssignableFrom(context, required)) 
				return Specificity.ANCESTOR;
			actual = assignment.resolve(context, this, useInstance).check(context);
			if(required.isAssignableFrom(context, actual))
				return Specificity.RESOLVED;
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
	public void compilePrototype(Context context, ClassFile classFile) {
		try {
			context = prepareContext(context);
			IType returnType = check(context);
			MethodInfo method = createMethodInfo(context, classFile, returnType, getName());
			method.addModifier(Modifier.ABSTRACT);
		} catch (PromptoError e) {
			throw new CompilerException(e);
		}
	}

	protected Context prepareContext(Context context) {
		if(context.isGlobalContext()) {
			// coming from nowhere, so need a clean context in which to register arguments
			context = context.newLocalContext();
			registerArguments(context);
		}
		return context;
	}
	
	protected MethodInfo createMethodInfo(Context context, ClassFile classFile, IType returnType, String methodName) {
		Descriptor.Method proto = CompilerUtils.createMethodDescriptor(context, arguments, returnType);
		MethodInfo method = classFile.newMethod(methodName, proto); 
		return method;
	}

	@Override
	public void compileAssignments(Context context, MethodInfo method, Flags flags, ArgumentAssignmentList assignments) {
		boolean isFirst = true;
		for(IArgument arg : arguments.stripOutTemplateArguments()) {
			arg.compileAssignment(context, method, flags, assignments, isFirst);
			isFirst = false;
		}
	}
}


