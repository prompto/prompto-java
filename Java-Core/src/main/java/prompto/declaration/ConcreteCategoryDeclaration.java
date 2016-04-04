package prompto.declaration;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry;
import prompto.compiler.IntConstant;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.StringConstant;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.Operator;
import prompto.intrinsic.PromptoRoot;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.IDataStore;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdListener;
import prompto.store.IStore;
import prompto.store.IStored;
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
	public MethodDeclarationList getLocalMethods() {
		return methods;
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
	public Set<Identifier> getAllAttributes(Context context) {
		final Set<Identifier> all = new HashSet<>();
		Set<Identifier> more = super.getAllAttributes(context);
		if(more!=null)
			all.addAll(more);
		if(derivedFrom!=null) {
			derivedFrom.forEach((id)-> {
				Set<Identifier> ids = getAncestorAttributes(context, id);
				if(ids!=null)
					all.addAll(ids);
			});
		}
		if(all.isEmpty())
			return null;
		else
			return all;
	}
	
	private Set<Identifier> getAncestorAttributes(Context context, Identifier ancestor) {
		CategoryDeclaration actual = context.getRegisteredDeclaration(CategoryDeclaration.class, ancestor);
		if(actual==null)
			return null;
		return actual.getAllAttributes(context);
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
	public IType check(Context context) {
		checkDerived(context);
		checkMethods(context);
		return super.check(context);
	}

	private void checkMethods(Context context) {
		registerMethods(context);
		for(IMethodDeclaration method : methods)
			method.check(this,context);
	}
			
			
	private void registerMethods(Context context) {
		if(methodsMap==null) {
			methodsMap = new HashMap<String,IDeclaration>();
			for(IMethodDeclaration method : methods) {
				method.setMemberOf(this);
				registerMethod(method, context);
			}
		}
	}

	private void registerMethod(IMethodDeclaration method, Context context) {
		String methodKey = method.getNameAsKey();
 		IDeclaration actual	= methodsMap.get(methodKey);
		if(method instanceof SetterMethodDeclaration || method instanceof GetterMethodDeclaration) {
			if(actual!=null)
				throw new SyntaxError("Duplicate method: \"" + methodKey + "\"");
			methodsMap.put(methodKey, method);
		} else {			
			if(actual==null) {
				actual = new MethodDeclarationMap(method.getId());
				methodsMap.put(methodKey, actual);
			}
			((MethodDeclarationMap)actual).register(method, context);
		}
	}

	private void checkDerived(Context context) {
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
			if(ancestor.equals(categoryType.getTypeNameId()))
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
	public IInstance newInstance(Context context) throws PromptoError {
		return new ConcreteInstance(context, this);
	}
	
	public GetterMethodDeclaration findGetter(Context context, Identifier attrName) {
		if(methodsMap==null)
			return null;
		IDeclaration method = methodsMap.get(GetterMethodDeclaration.getNameAsKey(attrName)); 
		if(method instanceof GetterMethodDeclaration)
			return (GetterMethodDeclaration)method;
		if(method!=null)
			throw new SyntaxError("Not a getter method!");
		return findDerivedGetter(context, attrName);
	}

	private GetterMethodDeclaration findDerivedGetter(Context context, Identifier attrName) {
		if(derivedFrom==null) 
			return null;
		for(Identifier ancestor : derivedFrom) {
			GetterMethodDeclaration method = findAncestorGetter(ancestor,context,attrName); 
			if(method!=null)
				return method;
		}
		return null;
	}

	private static GetterMethodDeclaration findAncestorGetter(Identifier ancestor, Context context, Identifier attrName) {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof ConcreteCategoryDeclaration))
			return null;
		ConcreteCategoryDeclaration cd = (ConcreteCategoryDeclaration)actual;
		return cd.findGetter(context, attrName);
	}

	public SetterMethodDeclaration findSetter(Context context, Identifier attrName) {
		if(methodsMap==null)
			return null;
		IDeclaration method = methodsMap.get(SetterMethodDeclaration.getNameAsKey(attrName)); 
		if(method instanceof SetterMethodDeclaration)
			return (SetterMethodDeclaration)method;
		if(method!=null)
			throw new SyntaxError("Not a setter method!");
		return findDerivedSetter(context,attrName);
	}

	private SetterMethodDeclaration findDerivedSetter(Context context, Identifier attrName) {
		if(derivedFrom==null) 
			return null;
		for(Identifier ancestor : derivedFrom) {
			SetterMethodDeclaration method = findAncestorSetter(ancestor,context,attrName); 
			if(method!=null)
				return method;
		}
		return null;
	}
	
	private static SetterMethodDeclaration findAncestorSetter(Identifier ancestor, Context context, Identifier attrName) {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof ConcreteCategoryDeclaration))
			return null;
		ConcreteCategoryDeclaration cd = (ConcreteCategoryDeclaration)actual;
		return cd.findSetter(context, attrName);
	}
	
	public MethodDeclarationMap getMemberMethods(Context context, Identifier name) {
		registerMethods(context);
		MethodDeclarationMap result = new MethodDeclarationMap(name);
		registerMemberMethods(context,result);
		return result; 
	}
	
	private void registerMemberMethods(Context context, MethodDeclarationMap result) {
		registerThisMemberMethods(context,result);
		registerDerivedMemberMethods(context,result);
	}

	
	private void registerThisMemberMethods(Context context, MethodDeclarationMap result) {
		if(methodsMap==null)
			return;
		IDeclaration actual = methodsMap.get(result.getId().toString()); 
		if(actual==null)
			return;
		if(!(actual instanceof MethodDeclarationMap))
			throw new SyntaxError("Not a member method!");
		for(IMethodDeclaration method : ((MethodDeclarationMap)actual).values())
			result.registerIfMissing(method, context);
	}

	private void registerDerivedMemberMethods(Context context, MethodDeclarationMap result) {
		if(derivedFrom==null) 
			return;
		for(Identifier ancestor : derivedFrom)
			registerAncestorMemberMethods(ancestor,context,result); 
	}
	
	private void registerAncestorMemberMethods(Identifier ancestor, Context context, MethodDeclarationMap result) {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, ancestor);
		if(actual==null || !(actual instanceof ConcreteCategoryDeclaration))
			return;
		ConcreteCategoryDeclaration cd = (ConcreteCategoryDeclaration)actual;
		cd.registerMemberMethods(context, result);
	}

	@Override
	public IMethodDeclaration findOperator(Context context, Operator operator, IType type) {
		Identifier methodName = new Identifier(OperatorMethodDeclaration.getNameAsKey(operator));
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

	public List<String> collectCategories(Context context) {
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		collectCategories(context, set, list);
		return list;
	}
	
	private void collectCategories(Context context, Set<String> set, List<String> list) {
		if(derivedFrom!=null) for(Identifier category : derivedFrom) {
			ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, category);
			cd.collectCategories(context, set, list);
		}
		if(!set.contains(this.getName())) {
			set.add(this.getName());
			list.add(this.getName());
		}
	}
	
	protected ClassFile compileConcreteClass(Context context, String fullName) {
		try {
			java.lang.reflect.Type concreteType = CompilerUtils.concreteParentTypeFrom(fullName);
			ClassFile classFile = new ClassFile(concreteType);
			if(isAbstract())
				classFile.addModifier(Modifier.ABSTRACT);
			compileSuperClass(context, classFile, new Flags());
			compileInterface(context, classFile, new Flags());
			compileCategoryField(context, classFile, new Flags());
			compileClassConstructor(context, classFile, new Flags());
			compileFields(context, classFile, new Flags());
			compileEmptyConstructor(context, classFile, new Flags());
			compileCopyConstructor(context, classFile, new Flags());
			compileMethods(context, classFile, new Flags());
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}
	

	protected void compileClassConstructor(Context context, ClassFile classFile, Flags flags) {
		if(needsClassConstructor()) {
			MethodInfo method = classFile.newMethod("<clinit>", new Descriptor.Method(void.class));
			method.addModifier(Modifier.STATIC);
			compileClassConstructorBody(context, method, flags);
			method.addInstruction(Opcode.RETURN);
		}
	}

	protected void compileClassConstructorBody(Context context, MethodInfo method, Flags flags) {
		compilePopulateCategoryField(context, method, flags);
	}

	protected void compilePopulateCategoryField(Context context, MethodInfo method, Flags flags) {
		List<String> categories = collectCategories(context);
		if(categories.size()<=5) {
			Opcode opcode = Opcode.values()[Opcode.ICONST_0.ordinal() + categories.size()];
			method.addInstruction(opcode);
		} else
			method.addInstruction(Opcode.LDC, new IntConstant(categories.size()));
		method.addInstruction(Opcode.ANEWARRAY, new ClassConstant(String.class));
		int idx = 0;
		for(String s : categories) {
			method.addInstruction(Opcode.DUP);
			if(idx<=5) {
				Opcode opcode = Opcode.values()[Opcode.ICONST_0.ordinal() + idx];
				method.addInstruction(opcode);
			} else
				method.addInstruction(Opcode.LDC, new IntConstant(idx));
			method.addInstruction(Opcode.LDC, new StringConstant(s));
			method.addInstruction(Opcode.AASTORE);
		}
		FieldConstant f = new FieldConstant(method.getClassFile().getThisClass(), "category", String[].class);
		method.addInstruction(Opcode.PUTSTATIC, f);
	}

	protected boolean needsClassConstructor() {
		return isStorable();
	}

	@Override
	public ClassFile compile(Context context, String fullName) {
		/* multiple inheritance is supported via interfaces */
		/* concrete class is an inner class of the interface */
		/* inner class is prefixed with '%' to prevent naming collisions */
		try {
			java.lang.reflect.Type interfaceType = CompilerUtils.interfaceTypeFrom(fullName);
			ClassFile classFile = new ClassFile(interfaceType);
			classFile.addModifier(Modifier.ABSTRACT | Modifier.INTERFACE);
			compileInterfaces(context, classFile);
			compileFieldPrototypes(context, classFile);
			compileMethodPrototypes(context, classFile);
			ClassFile concrete = compileConcreteClass(context, fullName);
			classFile.addInnerClass(concrete);
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}

	private void compileInterfaces(Context context, ClassFile classFile) {
		if(derivedFrom!=null)
			derivedFrom.forEach((id)->
				classFile.addInterface(CompilerUtils.getCategoryInterfaceType(id)));
	}

	private void compileFieldPrototypes(Context context, ClassFile classFile) {
		if(attributes!=null) for(Identifier id : attributes)
			compileFieldPrototype(context, classFile, id);
	}

	private void compileFieldPrototype(Context context, ClassFile classFile, Identifier id) {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		FieldInfo field = decl.toFieldInfo(context);
		compileSetterPrototype(context, classFile, id, field);
		compileGetterPrototype(context, classFile, id, field);
	}

	private void compileGetterPrototype(Context context, ClassFile classFile, Identifier id, FieldInfo field) {
		String name = CompilerUtils.getterName(id.toString());
		Descriptor proto = new Descriptor.Method(field.getType());
		MethodInfo method = classFile.newMethod(name, proto);
		method.addModifier(Modifier.ABSTRACT);
	}

	private void compileSetterPrototype(Context context, ClassFile classFile, Identifier id, FieldInfo field) {
		String name = CompilerUtils.setterName(field.getName().getValue());
		Descriptor proto = new Descriptor.Method(field.getType(), void.class);
		MethodInfo method = classFile.newMethod(name, proto);
		method.addModifier(Modifier.ABSTRACT);
	}

	private void compileMethodPrototypes(Context context, ClassFile classFile) {
		Map<String, MethodDeclarationMap> all = collectInterfaceMethods(context);
		all.values().forEach((map)->
			map.values().forEach((method)->
				compileMethodPrototype(context, classFile, method)));
	}
	
	protected Map<String, MethodDeclarationMap> collectInterfaceMethods(Context context) {
		// the methods to declare in the interface are those not already declared
		Map<String, MethodDeclarationMap> local = super.getAllMethods(context);
		Map<String, MethodDeclarationMap> all = getAllMethods(context);
		removeInheritedMethods(local, all);
		return local;
	}

	private void removeInheritedMethods(Map<String, MethodDeclarationMap> local, Map<String, MethodDeclarationMap> all) {
		all.keySet().forEach((key)->{
			MethodDeclarationMap localMap = local.get(key);
			if(localMap!=null) {
				MethodDeclarationMap allMap = all.get(key);
				allMap.keySet().forEach((proto)->{
					if(allMap.get(proto).getMemberOf()!=this)
						localMap.remove(proto);
				});
				if(localMap.isEmpty())
					local.remove(key);
			}
		});
	}

	@Override
	public Map<String, MethodDeclarationMap> getAllMethods(Context context) {
		Map<String, MethodDeclarationMap> map = super.getAllMethods(context);
		if(derivedFrom!=null) derivedFrom.forEach((id)->{
				CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, id);
				decl.collectAllMethods(context, map);
			});
		return map;		
	}

	private void compileMethodPrototype(Context context, ClassFile classFile, IMethodDeclaration method) {
		try {
			context = context.newCategoryContext(getType(context)).newChildContext();
			method.registerArguments(context);
			method.compilePrototype(context, classFile);
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}

	protected void compileSuperClass(Context context, ClassFile classFile, Flags flags) {
		ClassConstant superClass = getSuperClass(context);
		if(superClass!=null)
			classFile.setSuperClass(superClass);
	}
	
	protected void compileInterface(Context context, ClassFile classFile, Flags flags) {
		ClassConstant interFace = getInterface(context);
		if(interFace!=null)
			classFile.addInterface(interFace);
	}

	private ClassConstant getInterface(Context context) {
		return new ClassConstant(CompilerUtils.getCategoryInterfaceType(getId()));
	}

	protected ClassConstant getSuperClass(Context context) {
		if(derivedFrom==null) 
			return new ClassConstant(PromptoRoot.class);
		/* the JVM does not support multiple inheritance but we can still benefit from single inheritance */
		return new ClassConstant(CompilerUtils.getCategoryConcreteType(derivedFrom.getFirst()));
	}

	protected void compileCategoryField(Context context, ClassFile classFile, Flags flags) {
		if(isStorable()) {
			// store array of category names in static String[] field
			// use reserved 'category' keyword which can't collide with any field
			FieldInfo field = new FieldInfo("category", String[].class); 
			field.addModifier(Modifier.STATIC);
			classFile.addField(field);
		}
	}

	protected void compileFields(Context context, ClassFile classFile, Flags flags) {
		Set<Identifier> ids = getAllAttributes(context);
		for(Identifier id : ids)
			compileField(context, classFile, flags, id);
	}

	protected void compileField(Context context, ClassFile classFile, Flags flags, Identifier id) {
		if(isSuperClassAttribute(context, id))
			compileSuperClassField(context, classFile, flags, id);
		else if(isInheritedAttribute(context, id))
			compileInheritedField(context, classFile, flags, id);
		else
			compileLocalField(context, classFile, flags, id);
	}
	

	private void compileInheritedField(Context context, ClassFile classFile, Flags flags, 
			Identifier id) {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		FieldInfo field = decl.toFieldInfo(context);
		classFile.addField(field);
		compileInheritedSetterMethod(context, classFile, flags, id, field);
		compileInheritedGetterMethod(context, classFile, flags, id, field);
	}

	private void compileInheritedSetterMethod(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) {
		SetterMethodDeclaration setter = findSetter(context, id);
		if(setter!=null) synchronized(setter) {
			ConcreteCategoryDeclaration owner = setter.getMemberOf();
			setter.setMemberOf(this);
			try {
				setter.compile(context, classFile, flags, getType(context), field);
			} finally {
				setter.setMemberOf(owner);
			}
		} else
			compileFieldSetter(context, classFile, flags, id, field);
	}

	private void compileInheritedGetterMethod(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) {
		GetterMethodDeclaration getter = findGetter(context, id);
		if(getter!=null) synchronized(getter) {
			ConcreteCategoryDeclaration owner = getter.getMemberOf();
			getter.setMemberOf(this);
			try {
				getter.compile(context, classFile, flags, getType(context), field);
			} finally {
				getter.setMemberOf(owner);
			}
		} else
			compileFieldGetter(context, classFile, flags, id, field);
	}

	private boolean isInheritedAttribute(Context context, Identifier id) {
		if(derivedFrom==null)
			return false;
		Iterator<Identifier> iter = derivedFrom.iterator();
		iter.next(); // skip first = inherited
		while(iter.hasNext()) {
			Identifier derived = iter.next();
			CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, derived);
			if(decl.hasAttribute(context, id))
				return true;
		}
		return false;
	}

	private void compileLocalField(Context context, ClassFile classFile, Flags flags, Identifier id) {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		FieldInfo field = decl.toFieldInfo(context);
		classFile.addField(field);
		compileLocalSetterMethod(context, classFile, flags, id, field);
		compileLocalGetterMethod(context, classFile, flags, id, field);
	}

	private void compileSuperClassField(Context context, ClassFile classFile, Flags flags, Identifier id) {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		FieldInfo field = decl.toFieldInfo(context);
		GetterMethodDeclaration getter = findGetter(context, id);
		if(getter!=null)
			getter.compile(context, classFile, flags, getType(context), field);
		SetterMethodDeclaration setter = findSetter(context, id);
		if(setter!=null)
			setter.compile(context, classFile, flags, getType(context), field);
	}

	private boolean isSuperClassAttribute(Context context, Identifier id) {
		if(derivedFrom==null)
			return false;
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, derivedFrom.getFirst());
		return decl.hasAttribute(context, id);
	}

	private void compileLocalSetterMethod(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) {
		SetterMethodDeclaration setter = findSetter(context, id);
		if(setter!=null)
			setter.compile(context, classFile, flags, getType(context), field);
		else
			compileFieldSetter(context, classFile, flags, id, field);
	}
	
	private void compileFieldSetter(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) {
		String name = CompilerUtils.setterName(field.getName().getValue());
		Descriptor proto = new Descriptor.Method(field.getType(), void.class);
		MethodInfo method = classFile.newMethod(name, proto);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_Object, classFile.getThisClass());
		ClassConstant fc = new ClassConstant(field.getType());
		method.registerLocal("%value%", IVerifierEntry.Type.ITEM_Object, fc);
		// store data in field
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, fc);
		FieldConstant f = new FieldConstant(classFile.getThisClass(), field.getName().getValue(), field.getType());
		method.addInstruction(Opcode.PUTFIELD, f);
		if(isPromptoRoot(context)) {
			// also store data in storable
			MethodConstant m = new MethodConstant(PromptoRoot.class, "setStorable", String.class, Object.class, void.class);
			method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
			method.addInstruction(Opcode.LDC, new StringConstant(field.getName().getValue()));
			method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
			method.addInstruction(Opcode.INVOKESPECIAL, m);
		}
		// done
		method.addInstruction(Opcode.RETURN);
	}

	protected boolean isPromptoRoot(Context context) {
		if(PromptoRoot.class==getSuperClass(context).getType())
			return true;
		else {
			CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, derivedFrom.getFirst());
			return decl.isPromptoRoot(context);
		}
	}

	private void compileLocalGetterMethod(Context context, ClassFile classFile, Flags flags,Identifier id, FieldInfo field) {
		GetterMethodDeclaration getter = findGetter(context, id);
		if(getter!=null)
			getter.compile(context, classFile, flags, getType(context), field);
		else
			compileFieldGetter(context, classFile, flags, id, field);
	}

	private void compileFieldGetter(Context context, ClassFile classFile, Flags flags, Identifier id, FieldInfo field) {
		String name = CompilerUtils.getterName(id.toString());
		Descriptor proto = new Descriptor.Method(field.getType());
		MethodInfo method = classFile.newMethod(name, proto);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_Object, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		FieldConstant f = new FieldConstant(classFile.getThisClass(), id.toString(), field.getType());
		method.addInstruction(Opcode.GETFIELD, f);
		method.addInstruction(Opcode.ARETURN, new ClassConstant(field.getType()));
	}

	protected void compileEmptyConstructor(Context context, ClassFile classFile, Flags flags) {
		if(isStorable()) {
			Descriptor proto = new Descriptor.Method(void.class);
			MethodInfo method = classFile.newMethod("<init>", proto);
			method.registerLocal("this", IVerifierEntry.Type.ITEM_UninitializedThis, classFile.getThisClass());
			// call super()
			method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
			MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", void.class);
			method.addInstruction(Opcode.INVOKESPECIAL, m);
			// populate storable
			compileNewStorable(context, method, flags);
			// done
			method.addInstruction(Opcode.RETURN);
		} else
			CompilerUtils.compileEmptyConstructor(classFile);
	}

	private void compileCopyConstructor(Context context, ClassFile classFile, Flags flags) {
		if(!isStorable())
			return;
		Descriptor proto = new Descriptor.Method(IStored.class, void.class);
		MethodInfo method = classFile.newMethod("<init>", proto);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_UninitializedThis, classFile.getThisClass());
		// call super()
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(IStored.class));
		MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", IStored.class, void.class);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		// populate storable
		compileNewStorable(context, method, flags);
		// populate fields
		compilePopulateFields(context, method, flags);
		// done
		method.addInstruction(Opcode.RETURN);
	}

	private void compilePopulateFields(Context context, MethodInfo method, Flags flags) {
		boolean skipSuperClassFields = isSuperClassStorable(context);
		getAllAttributes(context).forEach((id)->{
			if(skipSuperClassFields && isSuperClassAttribute(context, id))
				return;
			compilePopulateField(context, method, flags, id);
		});
		// this.storable.setDirty(false)
		ClassConstant thisClass = method.getClassFile().getThisClass();
		method.addInstruction(Opcode.ALOAD_0, thisClass);
		FieldConstant field = new FieldConstant(thisClass, "storable", IStorable.class);
		method.addInstruction(Opcode.GETFIELD, field);
		method.addInstruction(Opcode.ICONST_0);
		InterfaceConstant i = new InterfaceConstant(IStorable.class, "setDirty", boolean.class, void.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
	}

	private void compilePopulateField(Context context, MethodInfo method, Flags flags, Identifier id) {
		ClassConstant thisClass = method.getClassFile().getThisClass();
		method.addInstruction(Opcode.ALOAD_0, thisClass);
		// get the data from the received IStored
		method.addInstruction(Opcode.ALOAD_1, new ClassConstant(IStored.class));
		method.addInstruction(Opcode.LDC, new StringConstant(id.toString()));
		InterfaceConstant i = new InterfaceConstant(IStored.class, "getData", String.class, Object.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i);
		// cast to actual type
		FieldInfo field = context.getRegisteredDeclaration(AttributeDeclaration.class, id).toFieldInfo(context);
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(field.getType()));
		// call setter
		String setterName = CompilerUtils.setterName(field.getName().getValue());
		MethodConstant m = new MethodConstant(thisClass, setterName, field.getType(), void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	private void compileNewStorable(Context context, MethodInfo method, Flags flags) {
		if(isSuperClassStorable(context))
			return;
		ClassConstant thisClass = method.getClassFile().getThisClass();
		method.addInstruction(Opcode.ALOAD_0, thisClass); // -> this
		MethodConstant m = new MethodConstant(new ClassConstant(IDataStore.class), "getInstance", IStore.class);
		method.addInstruction(Opcode.INVOKESTATIC, m); // -> this, IStore
		FieldConstant f = new FieldConstant(thisClass, "category", String[].class);
		method.addInstruction(Opcode.GETSTATIC, f); // -> this, IStore, String[]
		method.addInstruction(Opcode.ALOAD_0, thisClass); // -> this, IStore, String[], this (as listener)
		InterfaceConstant i = new InterfaceConstant(IStore.class, "newStorable", String[].class, IDbIdListener.class, IStorable.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i); // this, IStorable
		f = new FieldConstant(thisClass, "storable", IStorable.class);
		method.addInstruction(Opcode.PUTFIELD, f);
	}

	boolean isSuperClassStorable(Context context) {
		if(derivedFrom==null || derivedFrom.isEmpty())
			return false;
		return context.getRegisteredDeclaration(CategoryDeclaration.class, derivedFrom.getFirst()).isStorable();
	}

	protected void compileMethods(Context context, ClassFile classFile, Flags flags) {
		for(IMethodDeclaration method : methods) {
			if(	method instanceof GetterMethodDeclaration || method instanceof SetterMethodDeclaration)
				continue;
			context = context.newCategoryContext(getType(context)).newChildContext();
			method.registerArguments(context);
			method.compile(context, classFile);
		}
	}
	
}
