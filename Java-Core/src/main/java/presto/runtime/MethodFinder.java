package presto.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import presto.declaration.IMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.MethodSelector;
import presto.grammar.ArgumentAssignment;
import presto.grammar.ArgumentAssignmentList;
import presto.grammar.IArgument;
import presto.grammar.Specificity;
import presto.statement.MethodCall;
import presto.type.CategoryType;
import presto.type.IType;
import presto.value.IInstance;


public class MethodFinder {

	Context context;
	MethodCall methodCall;
	
	public MethodFinder(Context context, MethodCall methodCall) {
		this.context = context;
		this.methodCall = methodCall;
	}
	
	@Override
	public String toString() {
		return methodCall.toString();
	}
	
	public IMethodDeclaration findMethod(boolean checkInstance) throws SyntaxError {
		MethodSelector selector = methodCall.getMethod();
		Collection<IMethodDeclaration> candidates = selector.getCandidates(context);
		List<IMethodDeclaration> compatibles = filterCompatible(candidates,checkInstance);
		switch(compatibles.size()) {
		case 0:
			// TODO refine
			throw new SyntaxError("No matching prototype for:" + methodCall.toString()); 
		case 1:
			return compatibles.get(0);
		default:
			return findMostSpecific(compatibles,checkInstance);
		}
	}
	
	IMethodDeclaration findMostSpecific(Collection<IMethodDeclaration> candidates,boolean checkInstance) throws SyntaxError {
		IMethodDeclaration candidate = null;
		List<IMethodDeclaration> ambiguous = new ArrayList<IMethodDeclaration>();
		for(IMethodDeclaration declaration : candidates) {
			if(candidate==null)
				candidate = declaration;
			else {
				Score score = scoreMostSpecific(candidate,declaration,checkInstance);
				switch(score) {
				case WORSE:
					candidate = declaration;
					ambiguous.clear();
					break;
				case BETTER:
					break;
				case SIMILAR:
					ambiguous.add(declaration);
					break;
				}
			}
		}
		if(ambiguous.size()>0)
			throw new SyntaxError("Too many prototypes!"); // TODO refine
		return candidate;
	}
	
	Score scoreMostSpecific(IMethodDeclaration d1, IMethodDeclaration d2,boolean checkInstance) {
		try {
			Context s1 = context.newLocalContext();
			d1.registerArguments(s1);
			Context s2 = context.newLocalContext();
			d2.registerArguments(s2);
			Iterator<ArgumentAssignment> it1 = methodCall.makeAssignments(context,d1).iterator();
			Iterator<ArgumentAssignment> it2 = methodCall.makeAssignments(context,d2).iterator();
			while(it1.hasNext() && it2.hasNext()) {
				ArgumentAssignment as1 = it1.next();
				ArgumentAssignment as2 = it2.next();
				IArgument ar1 = d1.getArguments().find(as1.getName());
				IArgument ar2 = d2.getArguments().find(as2.getName());
				if(as1.getName().equals(as2.getName())) {
					// the general case with named arguments
					IType t1 = ar1.getType(s1);
					IType t2 = ar2.getType(s2);
					// try resolving runtime type
					if(checkInstance && t1 instanceof CategoryType && t2 instanceof CategoryType) {
						Object value = as1.getExpression().interpret(context); // in the named case as1==as2, so only evaluate 1
						if(value instanceof IInstance) {
							CategoryType actual = ((IInstance)value).getType();
							Score score = actual.scoreMostSpecific(context,(CategoryType)t1,(CategoryType)t2);
							if(score!=Score.SIMILAR)
								return score;
						}
					}
					if(t1.isMoreSpecificThan(s2,t2))
						return Score.BETTER;
					if(t2.isMoreSpecificThan(s1,t1))
						return Score.WORSE;
				} else {
					// specific case for single anonymous argument
					Specificity sp1 = d1.computeSpecificity(s1,ar1,as1,checkInstance);
					Specificity sp2 = d2.computeSpecificity(s2,ar2,as2,checkInstance);
					if(sp1.greaterThan(sp2))
						return Score.BETTER;
					if(sp2.greaterThan(sp1))
						return Score.WORSE;
				}
			}
		} catch(PrestoError error) {
		}
		return Score.SIMILAR;
	}
	
	List<IMethodDeclaration> filterCompatible(Collection<IMethodDeclaration> candidates,boolean checkInstance) throws SyntaxError {
		List<IMethodDeclaration> compatibles = new ArrayList<IMethodDeclaration>();
		for(IMethodDeclaration declaration : candidates) {
			try {
				ArgumentAssignmentList args = methodCall.makeAssignments(context,declaration);
				if(declaration.isAssignableTo(context, args, checkInstance))
					compatibles.add(declaration);
			} catch(SyntaxError e) {
				// OK
			}
		}
		return compatibles;
	}

}
