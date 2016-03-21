package prompto.type;

import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
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
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.utils.CodeWriter;
import prompto.value.ConcreteInstance;
import prompto.value.ExpressionValue;
import prompto.value.IContainer;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.ListValue;

import com.fasterxml.jackson.databind.JsonNode;


public class CategoryType extends BaseType {

	boolean mutable = false;
	
	public CategoryType(Identifier name) {
		super(name);
	}
	
	public void setMutable(boolean mutable) {
		this.mutable = mutable;
	}
	
	public boolean isMutable() {
		return mutable;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(mutable)
			writer.append("mutable ");
		super.toDialect(writer);
	}
	
	@Override
	public Type getJavaType() {
		return CompilerUtils.getCategoryInterfaceType(getId());
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
	
	IDeclaration getDeclaration(Context context) throws SyntaxError {
		return getDeclaration(context, id);
	}
	
	private static IDeclaration getDeclaration(Context context, Identifier id) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(CategoryDeclaration.class, id);
		if(actual==null)
			actual = context.getRegisteredDeclaration(EnumeratedNativeDeclaration.class, id);
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
		IDeclaration actual = getDeclaration(context);
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
			IDeclaration d = getDeclaration(context);
			if(d instanceof CategoryDeclaration) {
				CategoryDeclaration cd = (CategoryDeclaration)d;
				return isDerivedFromCompatibleCategory(context,cd,other)
					|| isAssignableToAnonymousCategory(context,cd,other);	
			} else
				return false; // TODO
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
			IDeclaration d = other.getDeclaration(context);
			if(d instanceof CategoryDeclaration) {
				CategoryDeclaration cd = (CategoryDeclaration)d;
				return isAssignableToAnonymousCategory(context, decl, cd);
			} else
				return false; // TODO
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
		for(Identifier attribute : other.getAllAttributes(context)) {
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
		IInstance inst = decl.newInstance(context);
		inst.setMutable(this.mutable);
		return inst;
	}
	
	public IInstance newInstance(Context context, IStored stored) throws PromptoError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, this.getId());
		IInstance inst = decl.newInstance(context, stored);
		inst.setMutable(this.mutable);
		return inst;
	}
	
	public IValue sort(final Context context, IContainer<IValue> list, IExpression key) throws PromptoError {
		if(list.getLength()==0)
			return list;
		if(key==null)
			key = new UnresolvedIdentifier(new Identifier("key"));
		IDeclaration d = getDeclaration(context);
		if(d instanceof CategoryDeclaration) {
			CategoryDeclaration decl = (CategoryDeclaration)d;
			if(decl.hasAttribute(context, new Identifier(key.toString())))
				return sortByAttribute(context, list, new Identifier(key.toString()));
			else if(decl.hasMethod(context, key.toString(), null))
				return sortByClassMethod(context, list, key.toString());
			else if(globalMethodExists(context, list, new Identifier(key.toString())))
				return sortByGlobalMethod(context, list, new Identifier(key.toString()));
			else
				return sortByExpression(context, list, key);
		} else
			throw new UnsupportedOperationException(); // TODO
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


	@Override
	public IValue readJSONValue(Context context, JsonNode value) {
		try {
			IDeclaration declaration = getDeclaration(context);
			if(declaration instanceof CategoryDeclaration) 
				return readJSONInstance(context, (CategoryDeclaration)declaration, value);
			else if(declaration instanceof EnumeratedNativeDeclaration)
				return ((EnumeratedNativeDeclaration)declaration).readJSONValue(context, value);
			else
				throw new InvalidParameterException(); 
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		} 
	}

	private IValue readJSONInstance(Context context, CategoryDeclaration declaration, JsonNode value) throws PromptoError {
		IInstance instance = newInstance(context);
		instance.setMutable(true);
		readJSONDbId(context, value, instance); // start by dbId to avoid creating a new one
		readJSONFields(context, value, instance); // then copy all the remaining fields
		instance.setMutable(this.mutable);
		return instance;
	}

	private void readJSONFields(Context context, JsonNode value, IInstance instance) throws PromptoError {
		Iterator<Map.Entry<String, JsonNode>> fields = value.fields();
		while(fields.hasNext()) {
			Map.Entry<String, JsonNode> field = fields.next();
			if(IStore.dbIdName.equals(field.getKey()))
					continue;
			readJSONField(context, instance, field.getKey(), field.getValue());
		}
	}

	private void readJSONField(Context context, IInstance instance, String fieldName, JsonNode fieldData) throws PromptoError {
		Identifier fieldId = new Identifier(fieldName);
		IType fieldType = readJSONFieldType(context, fieldId, fieldData);
		if(fieldType instanceof CategoryType)
			fieldData = fieldData.get("value");
		IValue fieldValue = fieldType.readJSONValue(context, fieldData);
		if(fieldValue!=null)
			instance.setMember(context, fieldId, fieldValue);
	}

	private IType readJSONFieldType(Context context, Identifier fieldId, JsonNode fieldData) throws SyntaxError {
		AttributeDeclaration attribute = context.getRegisteredDeclaration(AttributeDeclaration.class, fieldId);
		IType fieldType = attribute.getType(context);
		return checkDerivedType(context, fieldType, fieldData);
	}

	private IType checkDerivedType(Context context, IType fieldType, JsonNode fieldData) throws SyntaxError {
		if(fieldType instanceof CategoryType) {
			if(fieldData.isObject())
				return new CategoryType(new Identifier(fieldData.get("type").asText()));
			else {
				IDeclaration declaration = getDeclaration(context, fieldType.getId());
				return declaration.getType(context);
			}
		}
		return fieldType;
	}

	private void readJSONDbId(Context context, JsonNode value, IInstance instance) throws PromptoError {
		if(value.has(IStore.dbIdName)) {
			IType type = IDataStore.getInstance().getDbIdType();
			IValue dbid = type.readJSONValue(context, value.get(IStore.dbIdName));
			instance.setMember(context, IStore.dbIdIdentifier, dbid);
		}
	}
}
