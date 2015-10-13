package prompto.declaration;

import java.util.HashMap;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.Operator;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.ConcreteInstance;
import prompto.value.IInstance;


public class ConcreteCategoryDeclaration extends CategoryDeclaration {
	
	IdentifierList derivedFrom;
	MethodDeclarationList methods;
	Map<String,IDeclaration> methodsMap = null;
	
	protected ConcreteCategoryDeclaration(Identifier name) {
		super(name);
	}
	
	public ConcreteCategoryDeclaration(Identifier name, IdentifierList attributes, 
			IdentifierList derivedFrom, MethodDeclarationList methods) {
		super(name, attributes);
		this.derivedFrom = derivedFrom;
		this.methods = methods!=null ? methods : new MethodDeclarationList();
	}

	@Override
	public IdentifierList getDerivedFrom() {
		return derivedFrom;
	}
	
	public MethodDeclarationList getMethods() {
		return methods;
	}
	
	@Override
	protected void toEDialect(CodeWriter writer) {
		boolean hasMethods = methods!=null && methods.size()>0;
		protoToEDialect(writer, hasMethods, false); // no bindings
		if(hasMethods)
			methodsToEDialect(writer, methods);
	}
	
	@Override
	protected void categoryTypeToEDialect(CodeWriter writer) {
		if(derivedFrom==null)
			writer.append("category");
		else
			derivedFrom.toDialect(writer, true);
	}
	

	@Override
	protected void toODialect(CodeWriter writer) {
		boolean hasMethods = methods!=null && methods.size()>0;
		toODialect(writer, hasMethods);
	}
	
	@Override
	protected void categoryTypeToODialect(CodeWriter writer) {
		if(storable)
			writer.append("storable ");
		writer.append("category");
	}
	
	@Override
	protected void categoryExtensionToODialect(CodeWriter writer) {
		if(derivedFrom!=null) {
			writer.append(" extends ");
			derivedFrom.toDialect(writer, true);
		}
	}
	
	@Override
	protected void bodyToODialect(CodeWriter writer) {
		methodsToODialect(writer, methods);
	}
	
	@Override
	protected void toSDialect(CodeWriter writer) {
		protoToPDialect(writer, derivedFrom);
		methodsToSDialect(writer);
	}
	
	@Override
	protected void categoryTypeToPDialect(CodeWriter writer) {
		writer.append("class");
	}

	private void methodsToSDialect(CodeWriter writer) {
		writer.indent();
		if(methods==null || methods.size()==0)
			writer.append("pass\n");
		else for(IDeclaration decl : methods) {
			CodeWriter w = writer.newMemberWriter();
			decl.toDialect(w);
			writer.newLine();
		}
		writer.dedent();
	}


	@Override
	public boolean hasAttribute(Context context, Identifier name) {
		if(super.hasAttribute(context, name))
			return true;
		if(hasDerivedAttribute(context,name))
			return true;
		return false;
	}
	
	private boolean hasDerivedAttribute(Context context, Identifier name) {
		if(derivedFrom==null)
			return false;
		for(Identifier ancestor : derivedFrom) {
			if(ancestorHasAttribute(ancestor,context,name))
				return true;
		}
		return false;
	}
		
	private static boolean ancestorHasAttribute(Identifier ancestor, Context context, Identifier name) {
		CategoryDeclaration actual = context.getRegisteredDeclaration(CategoryDeclaration.class, ancestor);
		if(actual==null)
			return false;
		return actual.hasAttribute(context, name);
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		checkDerived(context);
		checkMethods(context);
		return super.check(context);
	}

	private void checkMethods(Context context) throws SyntaxError {
		registerMethods(context);
		for(IMethodDeclaration method : methods)
			method.check(this,context);
	}
			
			
	private void registerMethods(Context context) throws SyntaxError {
		if(methodsMap==null) {
			methodsMap = new HashMap<String,IDeclaration>();
			for(IMethodDeclaration method : methods) {
				method.setMemberOf(this);
				registerMethod(method,context);
			}
		}
	}

	private void registerMethod(IMethodDeclaration method, Context context) throws SyntaxError {
		IDeclaration actual;
		if(method instanceof SetterMethodDeclaration) {
			actual = methodsMap.get("setter:"+method.getIdentifier().toString());
			if(actual!=null)
				throw new SyntaxError("Duplicate setter: \"" + method.getIdentifier().toString() + "\"");
			methodsMap.put("setter:"+method.getIdentifier().toString(),method);
		} else if(method instanceof GetterMethodDeclaration) {
			actual = methodsMap.get("getter:"+method.getIdentifier().toString());
			if(actual!=null)
				throw new SyntaxError("Duplicate getter: \"" + method.getIdentifier().toString() + "\"");
			methodsMap.put("getter:"+method.getIdentifier().toString(),method);
		} else {
			actual = methodsMap.get(method.getIdentifier().toString());
			if(actual==null) {
				actual = new MethodDeclarationMap(method.getIdentifier());
				methodsMap.put(method.getIdentifier().toString(), actual);
			}
			((MethodDeclarationMap)actual).register(method,context);
		}
	}

	private void checkDerived(Context context) throws SyntaxError {
		if(derivedFrom!=null) for(Identifier category : derivedFrom) {
			ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, category);
			if(cd==null)
				throw new SyntaxError("Unknown category: \"" + category + "\"");
		}
	}

	@Override
	public boolean isDerivedFrom(Context context, CategoryType categoryType) {
		if(derivedFrom==null) 
			return false;
		for(Identifier ancestor : derivedFrom) {
			if(ancestor.equals(categoryType.getName()))
				return true;
			if(isAncestorDerivedFrom(ancestor,context,categoryType))
				return true;
		}
		return false;
	}

	private static boolean isAncestorDerivedFrom(Identifier ancestor, Context context, CategoryType categoryType) {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof CategoryDeclaration))
			return false;
		CategoryDeclaration cd = (CategoryDeclaration)actual;
		return cd.isDerivedFrom(context, categoryType);
	}
	
	@Override
	public IInstance newInstance() throws PromptoError {
		return new ConcreteInstance(this);
	}
	
	public GetterMethodDeclaration findGetter(Context context, Identifier attrName) throws SyntaxError {
		if(methodsMap==null)
			return null;
		IDeclaration method = methodsMap.get("getter:"+attrName); 
		if(method instanceof GetterMethodDeclaration)
			return (GetterMethodDeclaration)method;
		if(method!=null)
			throw new SyntaxError("Not a getter method!");
		return findDerivedGetter(context, attrName);
	}

	private GetterMethodDeclaration findDerivedGetter(Context context, Identifier attrName) throws SyntaxError {
		if(derivedFrom==null) 
			return null;
		for(Identifier ancestor : derivedFrom) {
			GetterMethodDeclaration method = findAncestorGetter(ancestor,context,attrName); 
			if(method!=null)
				return method;
		}
		return null;
	}

	private static GetterMethodDeclaration findAncestorGetter(Identifier ancestor, Context context, Identifier attrName) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof ConcreteCategoryDeclaration))
			return null;
		ConcreteCategoryDeclaration cd = (ConcreteCategoryDeclaration)actual;
		return cd.findGetter(context, attrName);
	}

	public SetterMethodDeclaration findSetter(Context context, Identifier attrName) throws SyntaxError {
		if(methodsMap==null)
			return null;
		IDeclaration method = methodsMap.get("setter:"+attrName); 
		if(method instanceof SetterMethodDeclaration)
			return (SetterMethodDeclaration)method;
		if(method!=null)
			throw new SyntaxError("Not a setter method!");
		return findDerivedSetter(context,attrName);
	}

	private SetterMethodDeclaration findDerivedSetter(Context context, Identifier attrName) throws SyntaxError {
		if(derivedFrom==null) 
			return null;
		for(Identifier ancestor : derivedFrom) {
			SetterMethodDeclaration method = findAncestorSetter(ancestor,context,attrName); 
			if(method!=null)
				return method;
		}
		return null;
	}
	
	private static SetterMethodDeclaration findAncestorSetter(Identifier ancestor, Context context, Identifier attrName) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof ConcreteCategoryDeclaration))
			return null;
		ConcreteCategoryDeclaration cd = (ConcreteCategoryDeclaration)actual;
		return cd.findSetter(context, attrName);
	}
	
	public MethodDeclarationMap getMemberMethods(Context context, Identifier name) throws SyntaxError {
		registerMethods(context);
		MethodDeclarationMap result = new MethodDeclarationMap(name);
		registerMemberMethods(context,result);
		return result; 
	}
	
	private void registerMemberMethods(Context context, MethodDeclarationMap result) throws SyntaxError {
		registerThisMemberMethods(context,result);
		registerDerivedMemberMethods(context,result);
	}

	
	private void registerThisMemberMethods(Context context, MethodDeclarationMap result) throws SyntaxError {
		if(methodsMap==null)
			return;
		IDeclaration actual = methodsMap.get(result.getIdentifier().toString()); 
		if(actual==null)
			return;
		if(!(actual instanceof MethodDeclarationMap))
			throw new SyntaxError("Not a member method!");
		for(IMethodDeclaration method : ((MethodDeclarationMap)actual).values())
			result.registerIfMissing(method, context);
	}

	private void registerDerivedMemberMethods(Context context, MethodDeclarationMap result) throws SyntaxError {
		if(derivedFrom==null) 
			return;
		for(Identifier ancestor : derivedFrom)
			registerAncestorMemberMethods(ancestor,context,result); 
	}
	
	private void registerAncestorMemberMethods(Identifier ancestor, Context context, MethodDeclarationMap result) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof ConcreteCategoryDeclaration))
			return;
		ConcreteCategoryDeclaration cd = (ConcreteCategoryDeclaration)actual;
		cd.registerMemberMethods(context, result);
	}

	public IMethodDeclaration findOperator(Context context, Operator operator, IType type) throws SyntaxError {
		Identifier methodName = new Identifier("operator_" + operator.name());
		MethodDeclarationMap methods = getMemberMethods(context, methodName);
		if(methods==null)
			return null;
		// find best candidate
		IMethodDeclaration candidate = null;
		for(IMethodDeclaration method : methods.values()) {
			IType potential = method.getArguments().getFirst().getType(context);
			if(!type.isAssignableTo(context, potential))
				continue;
			if(candidate==null)
				candidate = method;
			else {
				IType currentBest = candidate.getArguments().getFirst().getType(context);
				if(currentBest.isAssignableTo(context, potential))
					candidate = method;
			}
		}
		return candidate;
	}

}
