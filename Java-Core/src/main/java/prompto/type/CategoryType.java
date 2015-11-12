package prompto.type;

import java.util.Comparator;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.expression.MethodSelector;
import prompto.grammar.ArgumentAssignment;
import prompto.grammar.ArgumentAssignmentList;
import prompto.grammar.Identifier;
import prompto.grammar.Operator;
import prompto.grammar.UnresolvedIdentifier;
import prompto.runtime.Context;
import prompto.runtime.MethodFinder;
import prompto.runtime.Score;
import prompto.statement.MethodCall;
import prompto.store.IStored;
import prompto.value.ConcreteInstance;
import prompto.value.ExpressionValue;
import prompto.value.IContainer;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.ListValue;


public class CategoryType extends BaseType {

	public CategoryType(Identifier name) {
		super(name);
	}
	
	@Override
	public Class<?> toJavaClass() {
		return Object.class;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof CategoryType))
			return false;
		CategoryType other = (CategoryType)obj;
		return this.getId().equals(other.getId());
	}
	
	@Override
	public void checkUnique(Context context) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class,id);
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + id + "\"");
	}
	
	CategoryDeclaration getDeclaration(Context context) throws SyntaxError {
		CategoryDeclaration actual = context.getRegisteredDeclaration(CategoryDeclaration.class, id);
		if(actual==null)
			throw new SyntaxError("Unknown category: \"" + id + "\"");
		return actual;
	}
	
	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) throws SyntaxError {
		IType type = checkOperator(context, other, tryReverse, Operator.MULTIPLY);
		if(type!=null)
			return type;
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkDivide(Context context, IType other) throws SyntaxError {
		IType type = checkOperator(context, other, false, Operator.DIVIDE);
		if(type!=null)
			return type;
		else
			return super.checkDivide(context, other);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other) throws SyntaxError {
		IType type = checkOperator(context, other, false, Operator.IDIVIDE);
		if(type!=null)
			return type;
		else
			return super.checkIntDivide(context, other);
	}
	
	@Override
	public IType checkModulo(Context context, IType other) throws SyntaxError {
		IType type = checkOperator(context, other, false, Operator.MODULO);
		if(type!=null)
			return type;
		else
			return super.checkModulo(context, other);
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) throws SyntaxError {
		IType type = checkOperator(context, other, tryReverse, Operator.PLUS);
		if(type!=null)
			return type;
		else
			return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) throws SyntaxError {
		IType type = checkOperator(context, other, false, Operator.MINUS);
		if(type!=null)
			return type;
		else
			return super.checkSubstract(context, other);
	}
	
	private IType checkOperator(Context context, IType other, boolean tryReverse, Operator operator) throws SyntaxError {
		CategoryDeclaration actual = getDeclaration(context);
		if(actual instanceof ConcreteCategoryDeclaration) try {
			IMethodDeclaration method = ((ConcreteCategoryDeclaration)actual).findOperator(context, operator, other);
			if(method==null)
				return null;
			context = context.newSingletonContext(this);
			Context local = context.newLocalContext();
			method.registerArguments(local);
			return method.check(local);
		} catch(SyntaxError e) {
			// ok to pass, will try reverse
		}
		if(tryReverse)
			return null;
		else
			throw new SyntaxError("Unsupported operation: " + this.id + " " + operator.getToken() + " " + other.getId());
	}

	@Override
	public void checkExists(Context context) throws SyntaxError {
		getDeclaration(context);
	}
	
	@Override
    public IType checkMember(Context context, Identifier name) throws SyntaxError
    {
        CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, getId());
        if (cd == null)
            throw new SyntaxError("Unknown category:" + getId());
        if (!cd.hasAttribute(context, name))
            throw new SyntaxError("No attribute:" + name + " in category:" + getId());
        AttributeDeclaration ad = context.getRegisteredDeclaration(AttributeDeclaration.class, name);
        if (ad == null)
            throw new SyntaxError("Unknown atttribute:" + name);
        return ad.getType(context);
    }
    

	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		if(id.equals(other.getId()))
			return true;
		if(other instanceof AnyType)
			return true;
		if(!(other instanceof CategoryType))
			return false;
		return isAssignableTo(context,(CategoryType)other);
	}
	
	boolean isAssignableTo(Context context, CategoryType other) {
		if(id.equals(other.getId()))
			return true;
		try {
			CategoryDeclaration	cd = getDeclaration(context);
			return isDerivedFromCompatibleCategory(context,cd,other)
				|| isAssignableToAnonymousCategory(context,cd,other);	
		} catch (SyntaxError e) {
			return false;			
		}
	}

	boolean isDerivedFromCompatibleCategory(Context context, CategoryDeclaration decl, CategoryType other) {
		if(decl.getDerivedFrom()==null)
			return false;
		for(Identifier derived : decl.getDerivedFrom()) {
			CategoryType ct = new CategoryType(derived);
			if(ct.isAssignableTo(context, other))
				return true;
		}
		return false;
	}
	
	boolean isAssignableToAnonymousCategory(Context context, CategoryDeclaration decl, CategoryType other) {
		if(!other.isAnonymous())
			return false;
		try {
			CategoryDeclaration	cd = other.getDeclaration(context);
			return isAssignableToAnonymousCategory(context, decl, cd);
		} catch (SyntaxError e) {
			return false;			
		}
	}
	
	public boolean isAnonymous() {
		return Character.isLowerCase(id.toString().charAt(0)); // since it's the name of the argument
	}
	
	boolean isAssignableToAnonymousCategory(Context context, CategoryDeclaration decl, CategoryDeclaration other) {
		// an anonymous category extends 1 and only 1 category
		Identifier baseName = other.getDerivedFrom().get(0);
		// check we derive from root category (if not extending 'Any')
		if(!"any".equals(baseName.toString()) && !decl.isDerivedFrom(context,new CategoryType(baseName)))
			return false;
		for(Identifier attribute : other.getAttributes()) {
			if(!decl.hasAttribute(context,attribute))
				return false;
		}
		return true;
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		if(!(other instanceof CategoryType))
			return false;
		CategoryType otherCat = (CategoryType)other;
		if(otherCat.isAnonymous())
			return true;
		CategoryDeclaration thisDecl = context.getRegisteredDeclaration(CategoryDeclaration.class, this.getId());
		if(thisDecl.isDerivedFrom(context, otherCat))
			return true;
		return false;
	}

	public Score scoreMostSpecific(Context context, CategoryType t1, CategoryType t2) {
		if(t1.equals(t2))
			return Score.SIMILAR;
		if(this.equals(t1))
			return Score.BETTER;
		if(this.equals(t2))
			return Score.WORSE;
		// since this derives from both t1 and t2, return the most specific of t1 and t2
		if(t1.isMoreSpecificThan(context,t2))
			return Score.BETTER;
		if(t2.isMoreSpecificThan(context,t1))
			return Score.WORSE;
		return Score.SIMILAR; // should never happen
	}

	public IInstance newInstance(Context context) throws PromptoError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, this.getId());
		return decl.newInstance(context);
	}
	
	public IInstance newInstance(Context context, IStored stored) throws PromptoError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, this.getId());
		return decl.newInstance(context, stored);
	}
	
	public IValue sort(final Context context, IContainer<IValue> list, IExpression key) throws PromptoError {
		if(list.length()==0)
			return list;
		if(key==null)
			key = new UnresolvedIdentifier(new Identifier("key"));
		CategoryDeclaration decl = getDeclaration(context);
		if(decl.hasAttribute(context, new Identifier(key.toString())))
			return sortByAttribute(context, list, new Identifier(key.toString()));
		else if(decl.hasMethod(context, key.toString(), null))
			return sortByClassMethod(context, list, key.toString());
		else if(globalMethodExists(context, list, new Identifier(key.toString())))
			return sortByGlobalMethod(context, list, new Identifier(key.toString()));
		else
			return sortByExpression(context, list, key);
	}
	
	
	private ListValue sortByExpression(final Context context, IContainer<IValue> list, final IExpression key) throws PromptoError {
		try {
			return this.<ConcreteInstance>doSort(context,list,new Comparator<ConcreteInstance>() {
				@Override
				public int compare(ConcreteInstance o1, ConcreteInstance o2) {
					try {
						Context co = context.newInstanceContext(o1);
						IValue key1 = key.interpret(co);
						co = context.newInstanceContext(o2);
						IValue key2 = key.interpret(co);
						return compareKeys(key1,key2);
					} catch(Throwable t) {
						throw new RuntimeException(t);
					}
				}

			});
		} catch(RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	private ListValue sortByAttribute(final Context context, IContainer<IValue> list, final Identifier name) throws PromptoError {
		try {
			return this.<IInstance>doSort(context,list,new Comparator<IInstance>() {
				@Override
				public int compare(IInstance o1, IInstance o2) {
					try {
						IValue key1 = o1.getMember(context, name, false);
						IValue key2 = o2.getMember(context, name, false);
						return compareKeys(key1,key2);
					} catch(Throwable t) {
						throw new RuntimeException(t);
					}
				}

			});
		} catch(RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}
	
	private ListValue sortByClassMethod(Context context, IContainer<IValue> list, final String name) {
		return null;
	}

	private boolean globalMethodExists(Context context, IContainer<IValue> list, Identifier name) {
		try {
			IExpression exp = new ExpressionValue(this, newInstance(context));
			ArgumentAssignment arg = new ArgumentAssignment(null, exp);
			ArgumentAssignmentList args = new ArgumentAssignmentList(arg);
			MethodCall proto = new MethodCall(new MethodSelector(name), args);
			MethodFinder finder = new MethodFinder(context, proto);
			return finder.findMethod(true)!=null;
		} catch (PromptoError e) {
			return false;
		}
	}

	private ListValue sortByGlobalMethod(Context context, IContainer<IValue> list, final Identifier name) throws PromptoError {
		IExpression exp = new ExpressionValue(this, newInstance(context));
		ArgumentAssignment arg = new ArgumentAssignment(null, exp);
		ArgumentAssignmentList args = new ArgumentAssignmentList(arg);
		MethodCall proto = new MethodCall(new MethodSelector(name), args);
		MethodFinder finder = new MethodFinder(context, proto);
		IMethodDeclaration method = finder.findMethod(true);
		return sortByGlobalMethod(context, list, proto, method);
	}
	
	private ListValue sortByGlobalMethod(final Context context, IContainer<IValue> list, final MethodCall method, final IMethodDeclaration declaration) throws PromptoError {
		try {
			return this.<IInstance>doSort(context,list,new Comparator<IInstance>() {
				@Override
				public int compare(IInstance o1, IInstance o2) {
					try {
						ArgumentAssignment assignment = method.getAssignments().get(0);
						assignment.setExpression(new ExpressionValue(CategoryType.this, o1));
						IValue key1 = method.interpret(context);
						assignment.setExpression(new ExpressionValue(CategoryType.this, o2));
						IValue key2 = method.interpret(context);
						return compareKeys(key1,key2);
					} catch(Throwable t) {
						throw new RuntimeException(t);
					}
				}

			});
		} catch(RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	@SuppressWarnings("unchecked")
	private int compareKeys(IValue key1, IValue key2) {
		if(key1==null && key2==null)
			return 0;
		else if(key1==null)
			return -1;
		else if(key2==null)
			return 1;
		else if(key1 instanceof Comparable)
			return ((Comparable<Object>)key1).compareTo(key2);
		else
			return key1.toString().compareTo(key2.toString());
	}


}
