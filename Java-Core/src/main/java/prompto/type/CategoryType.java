package prompto.type;

import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Map;

import prompto.compiler.ClassConstant;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.PromptoType;
import prompto.compiler.ResultInfo;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.grammar.Operator;
import prompto.instance.MemberInstance;
import prompto.instance.VariableInstance;
import prompto.intrinsic.PromptoRoot;
import prompto.runtime.Context;
import prompto.runtime.Score;
import prompto.store.Family;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.utils.CodeWriter;
import prompto.utils.TypeUtils;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;

import com.fasterxml.jackson.databind.JsonNode;


public class CategoryType extends BaseType {

	boolean mutable = false;
	Identifier typeNameId;
	
	public CategoryType(Identifier typeNameId) {
		super(Family.CATEGORY);
		this.typeNameId = typeNameId;
	}
	
	protected CategoryType(Family family, Identifier typeNameId) {
		super(family);
		this.typeNameId = typeNameId;
	}

	@Override
	public String getTypeName() {
		return typeNameId.toString();
	}
	
	@Override
	public Identifier getTypeNameId() {
		return typeNameId;
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
	public Type getJavaType(Context context) {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, typeNameId);
		if(decl instanceof NativeCategoryDeclaration)
			return new PromptoType(((NativeCategoryDeclaration) decl).getBoundClassName());
		else
			return CompilerUtils.getCategoryInterfaceType(getTypeName());
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
		return this.getTypeName().equals(other.getTypeName());
	}
	
	@Override
	public void checkUnique(Context context) {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + typeNameId + "\"");
	}
	
	public IDeclaration getDeclaration(Context context) {
		return getDeclaration(context, typeNameId);
	}
	
	private static IDeclaration getDeclaration(Context context, Identifier id) {
		IDeclaration actual = context.getRegisteredDeclaration(CategoryDeclaration.class, id);
		if(actual==null)
			actual = context.getRegisteredDeclaration(EnumeratedNativeDeclaration.class, id);
		if(actual==null)
			throw new SyntaxError("Unknown category: \"" + id + "\"");
		return actual;
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse) {
		IType type = checkOperator(context, other, tryReverse, Operator.MULTIPLY);
		if(type!=null)
			return type;
		else
			return super.checkMultiply(context, other, tryReverse);
	}
	
	@Override
	public IType checkDivide(Context context, IType other) {
		IType type = checkOperator(context, other, false, Operator.DIVIDE);
		if(type!=null)
			return type;
		else
			return super.checkDivide(context, other);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other) {
		IType type = checkOperator(context, other, false, Operator.IDIVIDE);
		if(type!=null)
			return type;
		else
			return super.checkIntDivide(context, other);
	}
	
	@Override
	public IType checkModulo(Context context, IType other) {
		IType type = checkOperator(context, other, false, Operator.MODULO);
		if(type!=null)
			return type;
		else
			return super.checkModulo(context, other);
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse) {
		IType type = checkOperator(context, other, tryReverse, Operator.PLUS);
		if(type!=null)
			return type;
		else
			return super.checkAdd(context, other, tryReverse);
	}

	@Override
	public IType checkSubstract(Context context, IType other) {
		IType type = checkOperator(context, other, false, Operator.MINUS);
		if(type!=null)
			return type;
		else
			return super.checkSubstract(context, other);
	}
	
	private IType checkOperator(Context context, IType other, boolean tryReverse, Operator operator) {
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
			throw new SyntaxError("Unsupported operation: " + this.typeNameId + " " + operator.getToken() + " " + other.getTypeName());
	}

	@Override
	public void checkExists(Context context) {
		getDeclaration(context);
	}
	
	@Override
    public IType checkMember(Context context, Identifier name) {
        CategoryDeclaration cd = context.getRegisteredDeclaration(CategoryDeclaration.class, typeNameId);
        if (cd == null)
            throw new SyntaxError("Unknown category:" + typeNameId);
        if (!cd.hasAttribute(context, name))
            throw new SyntaxError("No attribute:" + name + " in category:" + typeNameId);
        AttributeDeclaration ad = context.getRegisteredDeclaration(AttributeDeclaration.class, name);
        if (ad == null)
            throw new SyntaxError("Unknown atttribute:" + name);
        return ad.getType(context);
    }
    

	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				getTypeName().equals(other.getTypeName()) ||
				(other instanceof CategoryType && 
				((CategoryType)other).isAssignableTo(context,this));
	}
	
	boolean isAssignableTo(Context context, CategoryType other) {
		if(getTypeName().equals(other.getTypeName()))
			return true;
		try {
			IDeclaration d = getDeclaration(context);
			if(d instanceof CategoryDeclaration) {
				CategoryDeclaration cd = (CategoryDeclaration)d;
				return isDerivedFromCompatibleCategory(context, cd, other)
					|| isAssignableToAnonymousCategory(context, cd, other);	
			} else
				return false; // TODO
		} catch (SyntaxError e) {
			return false;			
		}
	}

	public boolean isDerivedFrom(Context context, IType other) {
		if(!(other instanceof CategoryType))
			return false;
		return isDerivedFrom(context, (CategoryType)other);
	}
	
	public boolean isDerivedFrom(Context context, CategoryType other) {
		IDeclaration d = getDeclaration(context);
		if(d instanceof CategoryDeclaration) {
			CategoryDeclaration cd = (CategoryDeclaration)d;
			return isDerivedFromCompatibleCategory(context, cd, other)
					|| isAssignableToAnonymousCategory(context, cd, other);	
		} else
			return false; // TODO
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
		return Character.isLowerCase(getTypeName().charAt(0)); // since it's the name of the argument
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
		if(other instanceof NullType || other instanceof AnyType || other instanceof MissingType)
			return true;
		if(!(other instanceof CategoryType))
			return false;
		CategoryType otherCat = (CategoryType)other;
		if(otherCat.isAnonymous())
			return true;
		CategoryDeclaration thisDecl = context.getRegisteredDeclaration(CategoryDeclaration.class, typeNameId);
		if(thisDecl.isDerivedFrom(context, otherCat))
			return true;
		return false;
	}

	public Score compareSpecificity(Context context, CategoryType t1, CategoryType t2) {
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
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, typeNameId);
		IInstance inst = decl.newInstance(context);
		inst.setMutable(this.mutable);
		return inst;
	}
	
	public IInstance newInstance(Context context, IStored stored) throws PromptoError {
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, typeNameId);
		IInstance inst = decl.newInstance(context, stored);
		inst.setMutable(this.mutable);
		return inst;
	}

	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		try {
			IDeclaration declaration = getDeclaration(context);
			if(declaration instanceof CategoryDeclaration) 
				return readJSONInstance(context, (CategoryDeclaration)declaration, value, parts);
			else if(declaration instanceof EnumeratedNativeDeclaration)
				return ((EnumeratedNativeDeclaration)declaration).readJSONValue(context, value);
			else
				throw new InvalidParameterException(); 
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		} 
	}

	private IValue readJSONInstance(Context context, CategoryDeclaration declaration, JsonNode value, Map<String, byte[]> parts) throws PromptoError {
		IInstance instance = newInstance(context);
		instance.setMutable(true);
		readJSONDbId(context, value, instance); // start by dbId to avoid creating a new one
		readJSONFields(context, value, instance, parts); // then copy all the remaining fields
		instance.setMutable(this.mutable);
		return instance;
	}

	private void readJSONFields(Context context, JsonNode value, IInstance instance, Map<String, byte[]> parts) throws PromptoError {
		Iterator<Map.Entry<String, JsonNode>> fields = value.fields();
		while(fields.hasNext()) {
			Map.Entry<String, JsonNode> field = fields.next();
			if(IStore.dbIdName.equals(field.getKey()))
				continue;
			readJSONField(context, instance, field.getKey(), field.getValue(), parts);
		}
	}

	private void readJSONField(Context context, IInstance instance, String fieldName, JsonNode fieldData, Map<String, byte[]> parts) throws PromptoError {
		Identifier fieldId = new Identifier(fieldName);
		IType fieldType = readJSONFieldType(context, fieldId, fieldData);
		if(fieldData.isObject())
			fieldData = fieldData.get("value");
		IValue fieldValue = fieldType.readJSONValue(context, fieldData, parts);
		if(fieldValue!=null)
			instance.setMember(context, fieldId, fieldValue);
	}

	private IType readJSONFieldType(Context context, Identifier fieldId, JsonNode fieldData) {
		AttributeDeclaration attribute = context.getRegisteredDeclaration(AttributeDeclaration.class, fieldId);
		IType fieldType = attribute.getType(context);
		return checkDerivedType(context, fieldType, fieldData);
	}

	private IType checkDerivedType(Context context, IType fieldType, JsonNode fieldData) {
		if(fieldType instanceof CategoryType) {
			if(fieldData.isObject())
				return new CategoryType(new Identifier(fieldData.get("type").asText()));
			else {
				IDeclaration declaration = getDeclaration(context, fieldType.getTypeNameId());
				return declaration.getType(context);
			}
		}
		return fieldType;
	}

	private void readJSONDbId(Context context, JsonNode value, IInstance instance) throws PromptoError {
		if(value.has(IStore.dbIdName)) {
			IType fieldType = TypeUtils.typeToIType(IDataStore.getInstance().getDbIdClass());
			JsonNode fieldData = value.get(IStore.dbIdName);
			if(fieldData.isObject())
				fieldData = fieldData.get("value");
			IValue dbid = fieldType.readJSONValue(context, fieldData, null);
			instance.setMember(context, new Identifier(IStore.dbIdName), dbid);
		}
	}
	
	@Override
	public IValue convertIValueToIValue(Context context, IValue value) {
		if(this.isAssignableFrom(context, value.getType()))
			return value;
		else
			return super.convertIValueToIValue(context, value);
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		try {
			IDeclaration decl = getDeclaration(context);
			if(decl instanceof CategoryDeclaration)
				return convertJavaValueToPromptoValue(context, (CategoryDeclaration)decl, value);
		} catch(Exception e) {
		}
		return super.convertJavaValueToIValue(context, value);
	}

	private IValue convertJavaValueToPromptoValue(Context context, CategoryDeclaration decl, Object value) throws PromptoError {
		if(IDataStore.getInstance().getDbIdClass().isInstance(value))
			value = IDataStore.getInstance().fetchUnique(value);
		if(value==null)
			return NullValue.instance();
		else if(value instanceof IStored)
			return decl.newInstance(context, (IStored)value);
		else
			return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public ResultInfo compileGetMember(Context context, MethodInfo method,
			Flags flags, IExpression parent, Identifier id) {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof SingletonCategoryDeclaration)
			return ((SingletonCategoryDeclaration)decl).compileGetMember(context, method, flags, parent, id);
		else
			throw new SyntaxError("No static member support for non-singleton " + decl.getName());
	}

	public ResultInfo compileSetMember(Context context, MethodInfo method,
			Flags flags, IExpression parent, IExpression value, Identifier id) {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof SingletonCategoryDeclaration)
			return ((SingletonCategoryDeclaration)decl).compileSetStaticMember(context, method, flags, value, id);
		else if(couldBeImplicitThis(decl, flags)) {
			MemberInstance instance = new MemberInstance(id);
			instance.setParent(new VariableInstance(new Identifier("this")));
			return instance.compileAssign(context, method, flags, value);
		} else
			throw new SyntaxError("No static member support for non-singleton " + decl.getName());
	}

	private boolean couldBeImplicitThis(IDeclaration decl, Flags flags) {
		return decl instanceof ConcreteCategoryDeclaration && flags.isMember();
	}


	@Override
	public void compileGetStorableData(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoRoot.class, "getStorableData", Object.class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
	}
	
	@Override
	public void compileConvertObjectToExact(Context context, MethodInfo method, Flags flags) {
		ClassConstant k = new ClassConstant(getJavaType(context));
		method.addInstruction(Opcode.LDC, k);
		MethodConstant m = new MethodConstant(PromptoRoot.class, "convertObjectToExact", Object.class, Class.class, PromptoRoot.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.CHECKCAST, k);
	}


}
