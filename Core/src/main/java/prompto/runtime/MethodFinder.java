package prompto.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.MethodSelector;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Specificity;
import prompto.param.IParameter;
import prompto.parser.Dialect;
import prompto.statement.MethodCall;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.value.IInstance;


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
	
	public IMethodDeclaration findBest(boolean checkInstance) {
		Set<IMethodDeclaration> candidates = findCandidates(checkInstance);
		if(candidates.size()==0) {
			context.getProblemListener().reportUnknownMethod(methodCall.getSelector(), methodCall.toString());
			return null;
		}
		Set<IMethodDeclaration> compatible = filterCompatible(candidates, checkInstance, false, spec -> spec!=Specificity.INCOMPATIBLE && spec!=Specificity.DERIVED);
		switch(compatible.size()) {
		case 0:
			context.getProblemListener().reportNoMatchingPrototype(methodCall, methodCall.toString(), candidates.stream().map(m->m.getSignature(Dialect.O)).collect(Collectors.toSet()));
			return null;
		case 1:
			return compatible.iterator().next();
		default:
			return findMostSpecific(compatible, checkInstance);
		}
	}
	
	public Set<IMethodDeclaration> findCandidates(boolean checkInstance) {
		MethodSelector selector = methodCall.getSelector();
		return selector.getCandidates(context, checkInstance);
	}
	
	public List<IMethodDeclaration> findPotentialMethods() {
		MethodSelector selector = methodCall.getSelector();
		Collection<IMethodDeclaration> candidates = selector.getCandidates(context, false);
		if(candidates.size()==0)
			context.getProblemListener().reportUnknownMethod(methodCall.getSelector().getId(), methodCall.toString());
		return filterPotential(candidates);
	}


	public IMethodDeclaration findLessSpecific(Collection<IMethodDeclaration> candidates) {
		IMethodDeclaration candidate = null;
		List<IMethodDeclaration> ambiguous = new ArrayList<IMethodDeclaration>();
		for(IMethodDeclaration declaration : candidates) {
			if(candidate==null)
				candidate = declaration;
			else {
				Score score = compareSpecifity(candidate, declaration, false, true);
				switch(score) {
				case BETTER:
					candidate = declaration;
					ambiguous.clear();
					break;
				case WORSE:
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

	public IMethodDeclaration findMostSpecific(Collection<IMethodDeclaration> candidates, boolean checkInstance) {
		IMethodDeclaration candidate = null;
		List<IMethodDeclaration> ambiguous = new ArrayList<IMethodDeclaration>();
		for(IMethodDeclaration declaration : candidates) {
			if(candidate==null)
				candidate = declaration;
			else {
				Score score = compareSpecifity(candidate, declaration, checkInstance, false);
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
	
	Score compareSpecifity(IMethodDeclaration d1, IMethodDeclaration d2, boolean useInstance, boolean allowDerived) {
		try {
			Context s1 = context.newLocalContext();
			d1.registerParameters(s1);
			Context s2 = context.newLocalContext();
			d2.registerParameters(s2);
			Iterator<Argument> it1 = methodCall.makeArguments(context, d1).iterator();
			Iterator<Argument> it2 = methodCall.makeArguments(context, d2).iterator();
			while(it1.hasNext() && it2.hasNext()) {
				Argument as1 = it1.next();
				Argument as2 = it2.next();
				IParameter ar1 = d1.getParameters().find(as1.getParameterId());
				IParameter ar2 = d2.getParameters().find(as2.getParameterId());
				if(as1.getParameterId().equals(as2.getParameterId())) {
					// the general case with named arguments
					IType t1 = ar1.getType(s1);
					IType t2 = ar2.getType(s2);
					// try resolving runtime type
					if(useInstance && t1 instanceof CategoryType && t2 instanceof CategoryType) {
						Object value = as1.getExpression().interpret(context); // in the named case as1==as2, so only evaluate 1
						if(value instanceof IInstance) {
							CategoryType actual = ((IInstance)value).getType();
							Score score = actual.compareSpecificity(context, (CategoryType)t1, (CategoryType)t2);
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
					Specificity sp1 = d1.computeSpecificity(s1, ar1, as1, useInstance, allowDerived);
					Specificity sp2 = d2.computeSpecificity(s2, ar2, as2, useInstance, allowDerived);
					if(sp1.ordinal()>sp2.ordinal())
						return Score.BETTER;
					if(sp2.ordinal()>sp1.ordinal())
						return Score.WORSE;
				}
			}
		} catch(PromptoError error) {
		}
		return Score.SIMILAR;
	}
	
	public Set<IMethodDeclaration> filterCompatible(Collection<IMethodDeclaration> candidates, boolean checkInstance, boolean allowDerived, Predicate<Specificity> filter) {
		Set<IMethodDeclaration> compatibles = new HashSet<IMethodDeclaration>();
		for(IMethodDeclaration declaration : candidates) {
			try {
				ArgumentList args = methodCall.makeArguments(context, declaration);
				if(declaration.isAssignableTo(context, args, checkInstance, allowDerived, filter))
					compatibles.add(declaration);
			} catch(SyntaxError e) {
				// OK
			}
		}
		return compatibles;
	}
	
	List<IMethodDeclaration> filterPotential(Collection<IMethodDeclaration> candidates) {
		List<IMethodDeclaration> potential = new ArrayList<IMethodDeclaration>();
		for(IMethodDeclaration declaration : candidates) {
			try {
				ArgumentList args = methodCall.makeArguments(context, declaration);
				if(declaration.isAssignableFrom(context, args))
					potential.add(declaration);
			} catch(SyntaxError e) {
				// OK
			}
		}
		return potential;
	}

	public List<IMethodDeclaration> sortMostSpecificFirst(Collection<IMethodDeclaration> declarations) {
		List<IMethodDeclaration> result = new ArrayList<>(declarations);
		result.sort((d1, d2) -> {
	        Score score = compareSpecifity(d2, d1, false, true);
	        switch(score) {
	        case BETTER:
	        	return 1; 
	        case WORSE:
	        	return -1;
        	default:
        		return 0;
	        }
	    });
	    return result;
	}



}
