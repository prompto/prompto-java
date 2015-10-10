package prompto.declaration;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.ArgumentList;
import prompto.grammar.IArgument;
import prompto.grammar.Identifier;
import prompto.grammar.Specificity;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.value.IInstance;
import prompto.value.IValue;

public abstract class BaseMethodDeclaration extends BaseDeclaration implements IMethodDeclaration {

	ConcreteCategoryDeclaration memberOf;
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
	public void setMemberOf(ConcreteCategoryDeclaration declaration) {
		this.memberOf = declaration;
	}
	
	@Override
	public ConcreteCategoryDeclaration getMemberOf() {
		return memberOf;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		StringBuilder sb = new StringBuilder(getIdentifier().toString());
		sb.append('(');
		for(IArgument arg : arguments) {
			sb.append(arg.getSignature(dialect));
			sb.append(", ");
		}
		if(arguments.size()>0)
			sb.setLength(sb.length()-2); // strip ", "
		sb.append(')');
		return toString();
	}
	
	@Override
	public String getProto(Context context) throws SyntaxError {
		StringBuilder sb = new StringBuilder();
		for(IArgument arg : arguments) {
			if(sb.length()>0)
				sb.append('/');
			sb.append(arg.getProto(context));
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
	public void register(Context context) throws SyntaxError {
		context.registerDeclaration(this);
	}
	
	@Override
	public void registerArguments (Context context) throws SyntaxError {
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
				ArgumentAssignment assignment = assignmentsList.find(argument.getIdentifier());
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
	
	boolean isAssignableTo(Context context, IArgument argument, ArgumentAssignment assignment, boolean checkInstance) {
		return computeSpecificity(context, argument, assignment, checkInstance)!=Specificity.INCOMPATIBLE;
	}
	
	@Override
	public Specificity computeSpecificity(Context context, IArgument argument, ArgumentAssignment assignment,boolean checkInstance) {
		try {
			IType required = argument.getType(context);
			IType actual = assignment.getExpression().check(context);
			// retrieve actual runtime type
			if(checkInstance && actual instanceof CategoryType) {
				// TODO: potential side effects here with function called multiple times
				IValue value = assignment.getExpression().interpret(context.getCallingContext());
				if(value instanceof IInstance)
					actual = ((IInstance)value).getType();
			}
			if(actual.equals(required))
				return Specificity.EXACT;
			if(actual.isAssignableTo(context, required)) 
				return Specificity.INHERITED;
			actual = assignment.resolve(context,this,checkInstance).check(context);
			if(actual.isAssignableTo(context, required))
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
}


