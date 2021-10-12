package prompto.type;

import java.lang.reflect.Type;
import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.ByteOperand;
import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.NamedType;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StackLocal;
import prompto.compiler.comparator.ArrowExpressionComparatorCompiler;
import prompto.compiler.comparator.ComparatorCompiler;
import prompto.compiler.comparator.ComparatorCompilerBase;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.EnumeratedCategoryDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.NativeWidgetDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.expression.InstanceExpression;
import prompto.expression.MethodSelector;
import prompto.expression.SelectorExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.expression.ValueExpression;
import prompto.grammar.Argument;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.grammar.Operator;
import prompto.instance.MemberInstance;
import prompto.instance.VariableInstance;
import prompto.intrinsic.PromptoDbId;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoRoot;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.runtime.MethodFinder;
import prompto.runtime.Score;
import prompto.runtime.Variable;
import prompto.statement.MethodCall;
import prompto.store.DataStore;
import prompto.store.Family;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Logger;
import prompto.utils.ObjectUtils;
import prompto.utils.TypeUtils;
import prompto.value.ConcreteInstance;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;


public class CategoryType extends BaseType {

	static Logger logger = new Logger();
	
	boolean mutable = false;
	Identifier typeNameId;
	IType resolved;
	
	public CategoryType(Identifier typeNameId) {
		super(Family.CATEGORY);
		this.typeNameId = typeNameId;
	}
	
	public CategoryType(CategoryType copyFrom, boolean mutable) {
		super(copyFrom.family);
		this.typeNameId = copyFrom.typeNameId;
		this.mutable = mutable;
	}
	
	protected CategoryType(Family family, Identifier typeNameId) {
		super(family);
		this.typeNameId = typeNameId;
	}
	
	public CategoryType getSuperType(ICodeSection section, Context context) {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof CategoryDeclaration) {
			IdentifierList derived = ((CategoryDeclaration)decl).getDerivedFrom();
			if(derived!=null && !derived.isEmpty())
				return new CategoryType(derived.get(0));
		}
		context.getProblemListener().reportNoSuperType(section, this);
		return this; // limit the damage
	}
	
	
	@Override
	public IType anyfy() {
		if("Any".equals(getTypeName()))
			return AnyType.instance();	
		else
			return this;
	}
	
	
	
	@Override
	public boolean isMutable(Context context) {
		return mutable;
	}
	
	@Override
	public IType asMutable(Context context, boolean mutable) {
		if(mutable==this.mutable)
			return this;
		else 
			return new CategoryType(this, mutable);
	}
	
	@Override
	public boolean isStorable(Context context) {
		IDeclaration decl = getDeclaration(context);
		return decl!=null && decl instanceof CategoryDeclaration && ((CategoryDeclaration)decl).isStorable(context);
	}
	
	@Override
	public IType resolve(Context context, Consumer<IType> onError) {
		if(resolved==null) {
			IType type = this.anyfy();
			if(type instanceof NativeType)
				resolved = type;
			else {
				IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
				if(decl==null) {
					if(onError!=null)
						onError.accept(this);
					else
						context.getProblemListener().reportUnknownCategory(this, type.getTypeName());
				} else if(decl instanceof MethodDeclarationMap) {
					resolved = new MethodType(((MethodDeclarationMap)decl).getFirst());
					((MethodType)resolved).setSectionFrom(this);
				} else {
					IType found = decl.getType(context);
					resolved = found.getClass()==type.getClass() ? type : found;
				}
			}
		}
		return resolved;
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
	public Type toJavaType(Context context) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(decl instanceof NativeCategoryDeclaration)
			return new NamedType(((NativeCategoryDeclaration) decl).getBoundClassName());
		else if(decl instanceof EnumeratedNativeDeclaration)
			return CompilerUtils.getNativeEnumType(typeNameId);
		else if(decl instanceof EnumeratedCategoryDeclaration)
			return CompilerUtils.getCategoryEnumConcreteType(typeNameId);
		else if(decl instanceof SingletonCategoryDeclaration)
			return CompilerUtils.getCategorySingletonType(typeNameId);
		else
			return CompilerUtils.getCategoryInterfaceType(typeNameId);
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
			context.getProblemListener().reportUnknownCategory(id, id.toString());
		return actual;
	}

	@Override
	public IType checkMultiply(Context context, IType other, boolean tryReverse, ICodeSection section) {
		IType type = checkOperator(context, other, tryReverse, Operator.MULTIPLY, section);
		if(type!=null)
			return type;
		else
			return super.checkMultiply(context, other, tryReverse, section);
	}
	
	@Override
	public IType checkDivide(Context context, IType other, ICodeSection section) {
		IType type = checkOperator(context, other, false, Operator.DIVIDE, section);
		if(type!=null)
			return type;
		else
			return super.checkDivide(context, other, section);
	}
	
	@Override
	public IType checkIntDivide(Context context, IType other, ICodeSection section) {
		IType type = checkOperator(context, other, false, Operator.IDIVIDE, section);
		if(type!=null)
			return type;
		else
			return super.checkIntDivide(context, other, section);
	}
	
	@Override
	public IType checkModulo(Context context, IType other, ICodeSection section) {
		IType type = checkOperator(context, other, false, Operator.MODULO, section);
		if(type!=null)
			return type;
		else
			return super.checkModulo(context, other, section);
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		IType type = checkOperator(context, other, tryReverse, Operator.PLUS, section);
		if(type!=null)
			return type;
		else
			return super.checkAdd(context, other, tryReverse, section);
	}

	@Override
	public IType checkSubstract(Context context, IType other, ICodeSection section) {
		IType type = checkOperator(context, other, false, Operator.MINUS, section);
		if(type!=null)
			return type;
		else
			return super.checkSubstract(context, other, section);
	}
	
	private IType checkOperator(Context context, IType other, boolean tryReverse, Operator operator, ICodeSection section) {
		IDeclaration actual = getDeclaration(context);
		if(actual instanceof ConcreteCategoryDeclaration) try {
			IMethodDeclaration method = ((ConcreteCategoryDeclaration)actual).findOperator(context, operator, other);
			if(method==null)
				return null;
			context = context.newInstanceContext(this, false);
			Context local = context.newLocalContext();
			method.registerParameters(local);
			return method.check(local, false);
		} catch(SyntaxError e) {
			// ok to pass, will try reverse
		}
		if(tryReverse)
			return null;
		else {
			context.getProblemListener().reportIllegalOperation(section, this.typeNameId.toString() + " " + operator.getToken(), this, other);
			return VoidType.instance();
		}
	}

	@Override
	public void checkExists(Context context) {
		resolve(context, null);
	}
	
	@Override
    public IType checkMember(Context context, Identifier id) {
		if("category".contentEquals(id.toString()))
			return new CategoryType(new Identifier("Category"));
        IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
        if(decl instanceof EnumeratedNativeDeclaration) // for .value member
        	return decl.getType(context).checkMember(context, id);
        else if(decl instanceof CategoryDeclaration)
        	return checkMember(context, (CategoryDeclaration)decl, id, id);
        else {
        	context.getProblemListener().reportUnknownCategory(this, typeNameId.toString());
        	return VoidType.instance();
        } 
    }
	
	private IType checkMember(Context context, CategoryDeclaration decl, Identifier id, ICodeSection section) {
       	if(decl.isStorable(context) && IStore.dbIdName.equals(id.toString()))
    		return DbIdType.instance();
    	else if (decl.hasAttribute(context, id)) {
            AttributeDeclaration ad = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
            if (ad != null)
            	return ad.getType(context);
            else
            	context.getProblemListener().reportUnknownAttribute(section, id.toString(), " in category " + decl.getName());
                return VoidType.instance();
        } else if(decl.hasMethod(context, id)) {
        	IMethodDeclaration method = decl.getMemberMethods(context, id, true).getFirst();
        	return new MethodType(method);
        } else if("text".equals(id.toString()))
        	return TextType.instance();
        else if("json".equals(id.toString()))
        	return TextType.instance();
        else {
        	context.getProblemListener().reportUnknownAttribute(section, id.toString(), " in category " + decl.getName());
        	return VoidType.instance();
        }
	}

	@Override
	public IType checkStaticMember(Context context, Identifier id) {
       IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
       if(decl==null) {
    	   context.getProblemListener().reportUnknownIdentifier(this, typeNameId.toString());
    	   return null;
       } else if(decl instanceof IEnumeratedDeclaration) {
    	   return decl.getType(context).checkStaticMember(context, id);
       } else if(decl instanceof SingletonCategoryDeclaration) {
    	   return checkMember(context, (SingletonCategoryDeclaration)decl, id, id);
       } else {
       	   context.getProblemListener().reportUnknownAttribute(this, id.toString());
    	   return null;
       }
 	}

    
	@Override
	public Set<IMethodDeclaration> getStaticMemberMethods(Context context, Identifier id) throws PromptoError {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof IEnumeratedDeclaration)
			return decl.getType(context).getStaticMemberMethods(context, id);
		else if(decl instanceof SingletonCategoryDeclaration)
			return decl.getType(context).getMemberMethods(context, id);
		else
			return super.getStaticMemberMethods(context, id);
	}
	
	@Override
	public IValue getStaticMemberValue(Context context, Identifier id) throws PromptoError {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof IEnumeratedDeclaration)
			return decl.getType(context).getStaticMemberValue(context, id);
		else if(decl instanceof SingletonCategoryDeclaration) {
			ConcreteInstance singleton = context.loadSingleton(this);
			return singleton.getMember(context, id, false);
		} else
			return super.getStaticMemberValue(context, id);
	}
	
	@Override
	public Set<IMethodDeclaration> getMemberMethods(Context context, Identifier id) throws PromptoError {
		IDeclaration decl = getDeclaration(context);
		if(!(decl instanceof ConcreteCategoryDeclaration))
			context.getProblemListener().reportUnknownCategory(id, id.toString());
		Collection<IMethodDeclaration> methods = ((ConcreteCategoryDeclaration)decl).getMemberMethods(context, id, true).values();
		if(methods instanceof Set)
			return (Set<IMethodDeclaration>)methods;
		else
			return new HashSet<>(methods);
	}

	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		IType actual = this.resolve(context, null);
		other = other.resolve(context, null);
		if(actual==this)
			return super.isAssignableFrom(context, other) 
					|| ( other instanceof CategoryType 
						 && isAssignableFrom(context, (CategoryType)other));
		else if(actual!=null)
			return actual.isAssignableFrom(context, other);
		else
			return super.isAssignableFrom(context, other);
	}
	
	public boolean isAssignableFrom(Context context, CategoryType other) {
		return "Any".equals(this.getTypeName())
				|| other.isDerivedFrom(context, this)
				|| other.isDerivedFromAnonymous(context, this);
	}

	public boolean isDerivedFrom(Context context, IType other) {
		if(!(other instanceof CategoryType))
			return false;
		return isDerivedFrom(context, (CategoryType)other);
	}
	
	public boolean isDerivedFrom(Context context, CategoryType other) {
		try {
			IDeclaration thisDecl = getDeclaration(context);
			if(thisDecl instanceof CategoryDeclaration)
				return isDerivedFrom(context, (CategoryDeclaration)thisDecl, other);	
		} catch(SyntaxError e) {
		}
		return false; // TODO
	}
	
	public boolean isDerivedFrom(Context context, CategoryDeclaration decl, CategoryType other) {
		if(decl.getDerivedFrom()==null)
			return false;
		for(Identifier derived : decl.getDerivedFrom()) {
			CategoryType ct = new CategoryType(derived);
			if(ct.equals(other) || ct.isDerivedFrom(context, other))
				return true;
		}
		return false;
	}
	
	public boolean isDerivedFromAnonymous(Context context, IType other) {
		if(!(other instanceof CategoryType))
			return false;
		return isDerivedFromAnonymous(context, (CategoryType)other);
	}
	
	public boolean isDerivedFromAnonymous(Context context, CategoryType other) {
		if(!other.isAnonymous())
			return false;
		try {
			IDeclaration thisDecl = getDeclaration(context);
			if(thisDecl instanceof CategoryDeclaration)
				return isDerivedFromAnonymous(context, (CategoryDeclaration)thisDecl, other);	
		} catch(SyntaxError e) {
		}
		return false; // TODO
	}


	public boolean isDerivedFromAnonymous(Context context, CategoryDeclaration thisDecl, CategoryType other) {
		if(!other.isAnonymous())
			return false;
		try {
			IDeclaration otherDecl = other.getDeclaration(context);
			if(otherDecl instanceof CategoryDeclaration)
				return isDerivedFromAnonymous(context, thisDecl, (CategoryDeclaration)otherDecl);	
		} catch(SyntaxError e) {
		}
		return false; // TODO
	}
	
	public boolean isDerivedFromAnonymous(Context context, CategoryDeclaration thisDecl, CategoryDeclaration otherDecl) {
		// an anonymous category extends 1 and only 1 category
		Identifier baseName = otherDecl.getDerivedFrom().get(0);
		// check we derive from root category (if not extending 'any')
		if(!"any".equals(baseName.toString()) && !thisDecl.isDerivedFrom(context,new CategoryType(baseName)))
			return false;
		for(Identifier attribute : otherDecl.getAllAttributes(context)) {
			if(!thisDecl.hasAttribute(context, attribute))
				return false;
		}
		return true;
	}
	
	
	public boolean isAnonymous() {
		return Character.isLowerCase(getTypeName().charAt(0)); // since it's the name of the argument 'p' in: any p with name
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
		if(value.isNull())
			return NullValue.instance();
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
		if(declaration instanceof IEnumeratedDeclaration) {
			return ((IEnumeratedDeclaration<?>)declaration).getSymbol(value.asText());
		} else {
			IInstance instance = newInstance(context);
			instance.setMutable(true);
			readJSONDbId(context, value, instance); // start by dbId to avoid creating a new one
			readJSONFields(context, value, instance, parts); // then copy all the remaining fields
			instance.setMutable(this.mutable);
			return instance;
		}
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
		if(fieldData.isObject() && !(fieldType instanceof EnumeratedNativeType || fieldType instanceof EnumeratedCategoryType))
			fieldData = fieldData.get("value");
		IValue fieldValue = fieldData==null ? NullValue.instance() : fieldType.readJSONValue(context, fieldData, parts);
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
			if(fieldData.isObject() && fieldData.has("type"))
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
			IType fieldType = TypeUtils.typeToIType(DataStore.getInstance().getNativeDbIdClass());
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
			if(decl instanceof IEnumeratedDeclaration)
				return context.getRegisteredSymbol(new Identifier(value.toString()), true);
			else if(decl instanceof CategoryDeclaration)
				return convertJavaValueToPromptoValue(context, (CategoryDeclaration)decl, value);
		} catch(Exception e) {
			logger.error(()->"Unable to convert Java value '" + String.valueOf(value) + "' to IValue", e);
		}
		return super.convertJavaValueToIValue(context, value);
	}

	private IValue convertJavaValueToPromptoValue(Context context, CategoryDeclaration decl, Object value) throws PromptoError {
		if(DataStore.getInstance().getNativeDbIdClass().isInstance(value))
			value = PromptoDbId.of(value);
		if(value instanceof PromptoDbId)
			value = DataStore.getInstance().fetchUnique((PromptoDbId)value);
		if(value==null)
			return NullValue.instance();
		else if(value instanceof IStored)
			return convertStoredToPromptoValue(context, decl, (IStored)value);
		else
			return super.convertJavaValueToIValue(context, value);
	}
	
	private IValue convertStoredToPromptoValue(Context context, CategoryDeclaration decl, IStored stored) {
		String[] categories = stored.getCategories();
		// TODO walk up the list until we find an implemented declaration (not just the actual/last)
		String actualTypeName = categories[categories.length-1];
		if(!actualTypeName.equals(this.typeNameId.toString()))
			decl = (CategoryDeclaration)getDeclaration(context, new Identifier(actualTypeName));
		return decl.newInstance(context, stored);
	}

	public ResultInfo compileSetMember(Context context, MethodInfo method, Flags flags, IExpression parent, IExpression value, Identifier id) {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof SingletonCategoryDeclaration) {
			value.compile(context, method, flags);
			return ((SingletonCategoryDeclaration)decl).compileSetStaticMember(context, method, flags, id);
		} else if(couldBeImplicitThis(decl, flags)) {
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
	public ResultInfo compileGetStaticMember(Context context, MethodInfo method, Flags flags, Identifier id) {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof SingletonCategoryDeclaration)
			return ((SingletonCategoryDeclaration)decl).compileGetStaticMember(context, method, flags, id);
		else if(decl instanceof EnumeratedCategoryDeclaration)
			return ((EnumeratedCategoryDeclaration)decl).compileGetStaticMember(context, method, flags, id);
		 else if(decl instanceof EnumeratedNativeDeclaration)
			return ((EnumeratedNativeDeclaration)decl).compileGetStaticMember(context, method, flags, id);
		else 
			return super.compileGetStaticMember(context, method, flags, id);
	}

	@Override
	public void compileGetStorableData(Context context, MethodInfo method, Flags flags) {
		MethodConstant m = new MethodConstant(PromptoRoot.class, "getStorableData", Object.class, Object.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
	}
	
	@Override
	public void compileConvertObjectToExact(Context context, MethodInfo method, Flags flags) {
		ClassConstant k = new ClassConstant(toJavaType(context));
		method.addInstruction(Opcode.LDC, k);
		MethodConstant m = new MethodConstant(PromptoRoot.class, "convertObjectToExact", Object.class, Class.class, PromptoRoot.class);
		method.addInstruction(Opcode.INVOKESTATIC, m);
		method.addInstruction(Opcode.CHECKCAST, k);
	}
	
	
	@Override
	public void declare(Transpiler transpiler) {
		IType type = resolve(transpiler.getContext(), null);
		if(type==this) {
		  	IDeclaration decl = this.getDeclaration(transpiler.getContext());
			decl.declare(transpiler);
		} else if(type!=null)
			type.declare(transpiler);
		else
			transpiler.getContext().getProblemListener().reportUnknownCategory(this, this.getTypeName());
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		NativeWidgetDeclaration widget = null;
		IType type = resolve(transpiler.getContext(), null);
		if(type instanceof CategoryType) {
			IDeclaration decl = ((CategoryType)type).getDeclaration(transpiler.getContext());
			if(decl instanceof NativeWidgetDeclaration)
				widget = (NativeWidgetDeclaration)decl;
		}
		if(widget!=null)
			widget.transpileTypename(transpiler);
		else
			transpiler.append(this.getTypeName());
	}
	
	@Override
	public void declareSorted(Transpiler transpiler, IExpression key) {
		IDeclaration decl = this.getDeclaration(transpiler.getContext());
		Identifier keyId = getKeyIdentifier(key);
	    if(keyId!=null) {
	 	    if(decl instanceof CategoryDeclaration) {
		    	CategoryDeclaration cd = (CategoryDeclaration)decl;
		    	if ( cd.hasAttribute(transpiler.getContext(), keyId) ||  cd.hasMethod(transpiler.getContext(), keyId))
		    		return;
		    } 
	        decl = this.findGlobalMethod(transpiler.getContext(), keyId);
		    if (decl != null) {
	            decl.declare(transpiler);
	            return;
		    }
	    }
        if(key instanceof ArrowExpression)
        	; // TODO
        else
        	key.declare(transpiler);
 	}
	
	private Identifier getKeyIdentifier(IExpression key) {
		if(key instanceof SelectorExpression && ((SelectorExpression)key).getParent()!=null)
			return null;
		if(key instanceof InstanceExpression)
			return ((InstanceExpression)key).getId();
		else if(key instanceof ICodeSection) {
			Identifier keyId = new Identifier(key.toString());
			keyId.setSectionFrom((ICodeSection)key);
			return keyId;
		} else if(key != null) 
			return new Identifier(key.toString());
 		else 
			return new Identifier("key");
	}

	@Override
	public void transpileSortedComparator(Transpiler transpiler, IExpression key, boolean descending) {
	    IDeclaration decl = this.getDeclaration(transpiler.getContext());
		Identifier keyId = getKeyIdentifier(key);
		if(keyId!=null) {
		    if(decl instanceof CategoryDeclaration) {
		    	CategoryDeclaration cd = (CategoryDeclaration)decl;
	    	    if (cd.hasAttribute(transpiler.getContext(), keyId)) {
	    	    	this.transpileSortedByAttribute(transpiler, descending, key);
	    	    	return;
	    	    } else if (cd.hasMethod(transpiler.getContext(), keyId)) {
	    	    	throw new UnsupportedOperationException();
	    	    	/*this.transpileSortedByClassMethod(transpiler, descending, key);
	    	    	return;*/
	    	    } 
		    }
		    decl = this.findGlobalMethod(transpiler.getContext(), keyId);
			if (decl != null) {
	            this.transpileSortedByGlobalMethod(transpiler, descending, decl.getTranspiledName(transpiler.getContext()));
		    	return;
	        }
		}
        if(key instanceof ArrowExpression)
        	((ArrowExpression)key).transpileSortedComparator(transpiler, this, descending);
        else
        	this.transpileSortedByExpression(transpiler, descending, key);
	}

	private void transpileSortedByGlobalMethod(Transpiler transpiler, boolean descending, String name) {
		   transpiler.append("function(o1, o2) { return ")
	        .append(name).append("(o1) === ").append(name).append("(o2)").append(" ? 0 : ")
	        .append(name).append("(o1) > ").append(name).append("(o2)").append(" ? ");
	    if(descending)
	        transpiler.append("-1 : 1; }");
	    else
	        transpiler.append("1 : -1; }");
	}

	private void transpileSortedByExpression(Transpiler transpiler, boolean descending, IExpression key) {
	    this.transpileSortedByAttribute(transpiler, descending, key);
	}

	private void transpileSortedByAttribute(Transpiler transpiler, boolean descending, IExpression key) {
	    key = key!=null ? key : new InstanceExpression(new Identifier("key"));
	    transpiler.append("function(o1, o2) { return ");
	    this.transpileEqualAttributes(transpiler, key);
	    transpiler.append(" ? 0 : ");
	    this.transpileGreaterAttributes(transpiler, key);
	    transpiler.append(" ? ");
	    if(descending)
	        transpiler.append("-1 : 1; }");
	    else
	        transpiler.append("1 : -1; }");
	}

	private void transpileGreaterAttributes(Transpiler transpiler, IExpression key) {
	    transpiler.append("o1.");
	    key.transpile(transpiler);
	    transpiler.append(" > o2.");
	    key.transpile(transpiler);
	}

	private void transpileEqualAttributes(Transpiler transpiler, IExpression key) {
	    transpiler.append("o1.");
	    key.transpile(transpiler);
	    transpiler.append(" === o2.");
	    key.transpile(transpiler);
	}

	private IDeclaration findGlobalMethod(Context context, Identifier id) {
		try {
			IExpression exp = new ValueExpression(this, this.newInstance(context));
			Argument arg = new Argument(null, exp);
			ArgumentList args = new ArgumentList(Collections.singletonList(arg));
			MethodCall proto = new MethodCall(new MethodSelector(null, id), args);
			proto.setSectionFrom(id);
			MethodFinder finder = new MethodFinder(context, proto);
			return finder.findBest(true);
		} catch (PromptoError error) {
			return null;
		}
	}
	
	@Override
	public void declareMember(Transpiler transpiler, Identifier id) {
		if("json".equals(id.toString())) {
			transpiler.register("List");
			transpiler.require("Utils"); // equals etc...
		}
		// TODO visit attributes
	}
	
	@Override
	public void transpileMember(Transpiler transpiler, Identifier id) {
	    if ("text".equals(id.toString()))
	        transpiler.append("getText()");
	    else if ("json".equals(id.toString()))
	        transpiler.append("toJson()");
	    else
	        transpiler.append(id);
	}
	
	@Override
	public void declareStaticMember(Transpiler transpiler, Identifier name) {
		// TODO visit attributes
	}
	
	
	@Override
	public void transpileStaticMember(Transpiler transpiler, Identifier name) {
		if(getDeclaration(transpiler.getContext()) instanceof SingletonCategoryDeclaration)
			transpiler.append("instance.");
		transpiler.append(name);
	}
	
	@Override
	public void transpileAssignMemberValue(Transpiler transpiler, String name, IExpression expression) {
	    transpiler.append(".setMember('")
	    	.append(name)
	    	.append("', ");
	    expression.transpile(transpiler);
	    AttributeDeclaration decl = transpiler.getContext().getRegisteredDeclaration(AttributeDeclaration.class, new Identifier(name));
	    transpiler.append(", ")
	        .append(decl.isStorable(transpiler.getContext()))
	        .append(", ");
	    IType type = expression.check(transpiler.getContext());
	    transpiler.append(String.valueOf(type.isMutable(transpiler.getContext())));
	    if(type instanceof EnumeratedCategoryType || type instanceof EnumeratedNativeType)
	    	transpiler.append(", true"); // set isEnum flag
	    else
	    	transpiler.append(", false");
	    transpiler.append(")");
	}
	
	@Override
	public void transpileInstance(Transpiler transpiler) {
	    IDeclaration decl = this.getDeclaration(transpiler.getContext());
	    if(decl instanceof SingletonCategoryDeclaration)
	        transpiler.append(this.getTypeName()).append(".instance");
	    else
	        transpiler.append("this");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    IType type = this.checkOperator(transpiler.getContext(), other, tryReverse, Operator.PLUS, section);
	    if(type!=null) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	        type.declare(transpiler);
	    } else
	        super.declareAdd(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
	    left.transpile(transpiler);
	    transpiler.append(".operator_PLUS").append("$").append(other.getTranspiledName(transpiler.getContext())).append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
	    IType type = this.checkOperator(transpiler.getContext(), other, false, Operator.MINUS, section);
	    if(type!=null) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	        type.declare(transpiler);
	    } else
	        super.declareSubtract(transpiler, other, left, right, section);
	}
	
	
	@Override
	public void transpileSubtract(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".operator_MINUS").append("$").append(other.getTranspiledName(transpiler.getContext())).append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) {
		IType type = this.checkOperator(transpiler.getContext(), other, tryReverse, Operator.MULTIPLY, section);
	    if(type!=null) {
	        left.declare(transpiler);
	        right.declare(transpiler);
	        type.declare(transpiler);
	    } else
	        super.declareMultiply(transpiler, other, tryReverse, left, right, section);
	}
	
	@Override
	public void transpileMultiply(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".operator_MULTIPLY").append("$").append(other.getTranspiledName(transpiler.getContext())).append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
		IType type = this.checkOperator(transpiler.getContext(), other, false, Operator.DIVIDE, section);
	    if(type!=null) {
	    	transpiler.require("divide");
	        left.declare(transpiler);
	        right.declare(transpiler);
	        type.declare(transpiler);
	    } else
	        super.declareDivide(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".operator_DIVIDE").append("$").append(other.getTranspiledName(transpiler.getContext())).append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
		IType type = this.checkOperator(transpiler.getContext(), other, false, Operator.IDIVIDE, section);
	    if(type!=null) {
	    	transpiler.require("divide");
	        left.declare(transpiler);
	        right.declare(transpiler);
	        type.declare(transpiler);
	    } else
	        super.declareIntDivide(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileIntDivide(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".operator_IDIVIDE").append("$").append(other.getTranspiledName(transpiler.getContext())).append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareModulo(Transpiler transpiler, IType other, IExpression left, IExpression right, ICodeSection section) {
		IType type = this.checkOperator(transpiler.getContext(), other, false, Operator.MODULO, section);
	    if(type!=null) {
	    	transpiler.require("divide");
	        left.declare(transpiler);
	        right.declare(transpiler);
	        type.declare(transpiler);
	    } else
	        super.declareModulo(transpiler, other, left, right, section);
	}
	
	@Override
	public void transpileModulo(Transpiler transpiler, IType other, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".operator_MODULO").append("$").append(other.getTranspiledName(transpiler.getContext())).append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}

	@Override
	public Comparator<? extends IValue> getComparator(Context context, IExpression key, boolean descending) {
		if(key==null)
			key = new UnresolvedIdentifier(new Identifier("key"));
		IDeclaration d = getDeclaration(context);
		if(d instanceof CategoryDeclaration) {
			CategoryDeclaration decl = (CategoryDeclaration)d;
			Identifier keyAsId = new Identifier(key.toString());
			if(decl.hasAttribute(context, keyAsId))
				return newAttributeComparator(context, keyAsId, descending);
			else if(decl.hasMethod(context, keyAsId))
				return newMemberMethodComparator(context, keyAsId, descending);
			else {
				MethodCall call = createGlobalMethodCallIfExists(context, keyAsId);
				if(call!=null)
					return newGlobalMethodComparator(context, call, descending);
				else if(key instanceof ArrowExpression)
					return ((ArrowExpression)key).getComparator(context, this, descending);
				else
					return newExpressionComparator(context, key, descending);
			}
		} else
			throw new UnsupportedOperationException(); // TODO
	}
	
	

	private Comparator<? extends IValue> newMemberMethodComparator(Context context, Identifier methodName, boolean descending) {
		throw new UnsupportedOperationException(); // TODO
	}


	public MethodCall createGlobalMethodCallIfExists(Context context, Identifier methodName) {
		try {
			IExpression exp = new ValueExpression(this, newInstance(context));
			Argument arg = new Argument(null, exp); // MethodCall supports first anonymous argument
			arg.setSectionFrom(methodName);
			ArgumentList args = new ArgumentList(Collections.singletonList(arg));
			MethodCall call = new MethodCall(new MethodSelector(methodName), args);
			MethodFinder finder = new MethodFinder(context, call);
			IMethodDeclaration decl = finder.findBest(true);
			if(decl==null)
				return null;
			else
				return call;
		} catch (PromptoError e) {
			return null;
		}
	}


	
	private Comparator<? extends IValue> newAttributeComparator(Context context, Identifier name, boolean descending) {
		BiFunction<IValue, IValue, Integer> cmpValues = BaseType.getValuesComparator(descending);
		return new Comparator<IInstance>() {
			@Override
			public int compare(IInstance o1, IInstance o2) {
				try {
					IValue key1 = o1.getMember(context, name, false);
					IValue key2 = o2.getMember(context, name, false);
					return cmpValues.apply(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}
		};
	}

	
	private Comparator<? extends IValue> newGlobalMethodComparator(Context context, MethodCall call, boolean descending) throws PromptoError {
		BiFunction<IValue, IValue, Integer> cmpValues = BaseType.getValuesComparator(descending);
		return new Comparator<IInstance>() {
			@Override
			public int compare(IInstance o1, IInstance o2) {
				try {
					IValue key1 = interpret(o1);
					IValue key2 = interpret(o2);
					return cmpValues.apply(key1,key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}

			private IValue interpret(IInstance o) throws PromptoError {
				Argument argument = call.getArguments().getFirst();
				argument.setExpression(new ValueExpression(CategoryType.this, o));
				return call.interpret(context);
			}
		};
	}


	private Comparator<? extends IValue> newExpressionComparator(Context context, IExpression key, boolean descending) {
		BiFunction<IValue, IValue, Integer> cmpValues = BaseType.getValuesComparator(descending);
		return new Comparator<IInstance>() {
			@Override
			public int compare(IInstance o1, IInstance o2) {
				try {
					IValue key1 = interpret(o1);
					IValue key2 = interpret(o2);
					return cmpValues.apply(key1, key2);
				} catch(Throwable t) {
					throw new RuntimeException(t);
				}
			}

			private IValue interpret(IInstance o) throws PromptoError {
				Context co = context.newInstanceContext(o, false);
				return key.interpret(co);
			}
		};
	}

	@Override
	public ResultInfo compileSorted(Context context, MethodInfo method, Flags flags, ResultInfo srcInfo, IExpression key, boolean descending) {
		if(key==null)
			key = new UnresolvedIdentifier(new Identifier("key"));
		compileComparator(context, method, flags, key, descending);
		MethodConstant m = new MethodConstant(srcInfo.getType(), "sortUsing", Comparator.class, PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return new ResultInfo(PromptoList.class);
	}
	
	private ResultInfo compileComparator(Context context, MethodInfo method, Flags flags, IExpression key, boolean descending) {
		IDeclaration decl = getDeclaration(context);
		if(decl instanceof CategoryDeclaration) {
			Type cmpType = compileComparatorClass(context, method.getClassFile(), (CategoryDeclaration)decl, key, descending);
			return CompilerUtils.compileNewInstance(method, cmpType);
		} else
			throw new UnsupportedOperationException(); // TODO
	}
	
	private Type compileComparatorClass(Context context, ClassFile parentClass, CategoryDeclaration decl, IExpression key, boolean descending) {
		ComparatorCompiler compiler = getComparatorCompiler(context, decl, key);
		return compiler.compile(context, parentClass, this, key, descending);
	}
	
	private ComparatorCompiler getComparatorCompiler(Context context, CategoryDeclaration decl, IExpression key) {
		Identifier keyAsId = new Identifier(key.toString());
		if(decl.hasAttribute(context, keyAsId))
			return new AttributeComparatorCompiler();
		else if(decl.hasMethod(context, keyAsId))
			return new MemberMethodComparatorCompiler();
		else {
			MethodCall call = createGlobalMethodCallIfExists(context, keyAsId);
			if(call!=null)
				return new GlobalMethodComparatorCompiler(call);
			else if(key instanceof ArrowExpression)
				return new ArrowExpressionComparatorCompiler();
			else
				return new ExpressionComparatorCompiler();
		}
	}
	
	class AttributeComparatorCompiler extends ComparatorCompilerBase {

		@Override
		protected void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key) {
			Type paramType = paramIType.toJavaType(context);
			method.addInstruction(Opcode.ALOAD_1, new ClassConstant(paramType));
			Type fieldType = context.findAttribute(key.toString()).getType().toJavaType(context);
			String getterName = CompilerUtils.getterName(key.toString());
			InterfaceConstant getter = new InterfaceConstant(paramType, getterName, fieldType);
			method.addInstruction(Opcode.INVOKEINTERFACE, getter);
			method.addInstruction(Opcode.ALOAD_2, new ClassConstant(paramType));
			method.addInstruction(Opcode.INVOKEINTERFACE, getter);
			MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
			method.addInstruction(Opcode.INVOKESTATIC, compare);
			method.addInstruction(Opcode.IRETURN);
		}

	}

	class ExpressionComparatorCompiler extends ComparatorCompilerBase {
		
	
		@Override
		protected void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key) {
			Type paramType = paramIType.toJavaType(context);
			StackLocal tmpThis = method.registerLocal("this", VerifierType.ITEM_Object, new ClassConstant(paramType));
			compileValue(context, method, paramType, key, tmpThis, "o1");
			compileValue(context, method, paramType, key, tmpThis, "o2");
			MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
			method.addInstruction(Opcode.INVOKESTATIC, compare);
			method.addInstruction(Opcode.IRETURN);
		}

		private ResultInfo compileValue(Context context, MethodInfo method, Type paramType, IExpression key, StackLocal tmpThis, String paramName) {
			StackLocal param = method.getRegisteredLocal(paramName);
			Opcode opcode = Opcode.values()[Opcode.ALOAD_0.ordinal() + param.getIndex()];
			method.addInstruction(opcode, new ClassConstant(paramType));
			method.addInstruction(Opcode.ASTORE, new ByteOperand((byte)tmpThis.getIndex()));
			return key.compile(context.newInstanceContext(CategoryType.this, false), method, new Flags());
		}
	}

	class MemberMethodComparatorCompiler extends ComparatorCompilerBase {
		@Override
		protected void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key) {
			throw new UnsupportedOperationException();
		}
	}
	
	class GlobalMethodComparatorCompiler extends ComparatorCompilerBase {
		
		MethodCall call;
		
		public GlobalMethodComparatorCompiler(MethodCall call) {
			this.call = call;
		}

		@Override
		protected void compileMethodBody(Context context, MethodInfo method, IType paramIType, IExpression key) {
			Type paramType = paramIType.toJavaType(context);
			compileValue(context, method, paramType, "o1");
			compileValue(context, method, paramType, "o2");
			MethodConstant compare = new MethodConstant(ObjectUtils.class, "safeCompare", Object.class, Object.class, int.class);
			method.addInstruction(Opcode.INVOKESTATIC, compare);
			method.addInstruction(Opcode.IRETURN);
		}

		private ResultInfo compileValue(Context context, MethodInfo method, Type paramType, String paramName) {
			context.registerValue(new Variable(new Identifier(paramName), CategoryType.this));
			Argument argument = call.getArguments().getFirst();
			Identifier paramId = new Identifier(paramName);
			paramId.setSectionFrom(argument);
			UnresolvedIdentifier expression = new UnresolvedIdentifier(paramId);
			expression.setSectionFrom(argument);
			argument.setExpression(expression);
			return call.compile(context, method, new Flags());
		}
	}


}
