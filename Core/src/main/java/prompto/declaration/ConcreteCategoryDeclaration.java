package prompto.declaration;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Descriptor;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry.VerifierType;
import prompto.compiler.IntConstant;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.OffsetListenerConstant;
import prompto.compiler.Opcode;
import prompto.compiler.StackLocal;
import prompto.compiler.StackState;
import prompto.compiler.StringConstant;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.Operator;
import prompto.intrinsic.IPromptoStorable;
import prompto.intrinsic.PromptoEnum;
import prompto.intrinsic.PromptoRoot;
import prompto.intrinsic.PromptoStorableBase;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.problem.IProblemListener;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.DataStore;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.transpiler.ITranspilable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.NativeType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.ConcreteInstance;
import prompto.value.IInstance;

public class ConcreteCategoryDeclaration extends CategoryDeclaration {
	
	MethodDeclarationList methods;
	Map<String,IDeclaration> methodsMap = null;
	
	protected ConcreteCategoryDeclaration(Identifier id) {
		super(id);
	}
	
	public ConcreteCategoryDeclaration(Identifier id, IdentifierList attributes, 
			IdentifierList derivedFrom, MethodDeclarationList methods) {
		super(id, attributes);
		this.derivedFrom = derivedFrom;
		this.methods = methods!=null ? methods : new MethodDeclarationList();
		this.methods.forEach(method->method.setMemberOf(this));
	}
	
	@Override
	public boolean isAWidget(Context context) {
		if(derivedFrom==null || derivedFrom.size()!=1)
			return false;
		CategoryDeclaration parent = context.getRegisteredDeclaration(CategoryDeclaration.class, derivedFrom.get(0), true);
		if(parent==null)
			return false;
		else
			return parent.isAWidget(context);
	}
	
	@Override
	public MethodDeclarationList getLocalMethods() {
		return methods;
	}

	@Override
	public IdentifierList getDerivedFrom() {
		return derivedFrom;
	}
	
	@Override
	public ICodeSection locateCodeSection(ISection section) {
		return methods.locateCodeSection(section);
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
		if(this.isAWidget(writer.getContext()))
			writer.append("widget");
		else
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
	protected void toMDialect(CodeWriter writer) {
		protoToMDialect(writer, derivedFrom);
		methodsToMDialect(writer);
	}
	
	@Override
	protected void categoryTypeToMDialect(CodeWriter writer) {
		writer.append("class");
	}

	private void methodsToMDialect(CodeWriter writer) {
		writer.indent();
		if(methods==null || methods.size()==0)
			writer.append("pass\n");
		else {
			writer.newLine();
			for(IDeclaration decl : methods) {
				CodeWriter w = writer.newMemberWriter();
				decl.toDialect(w);
				writer.newLine();
			}
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
		return all;
	}
	
	private Set<Identifier> getLocalCategoryAttributes(Context context) {
		Set<Identifier> set = getLocalAttributes(context);
		if(set==null)
			return null;
		set = set.stream().filter((id)->isCategoryAttribute(context, id)).collect(Collectors.toSet());
		return set.isEmpty() ? null : set;
	}
	
	protected Set<Identifier> getLocalAttributes(Context context) {
		Set<Identifier> set = getAllAttributes(context);
		if(set==null)
			return null;
		set = set.stream().filter((id)->!isSuperClassAttribute(context, id)).collect(Collectors.toSet());
		return set.isEmpty() ? null : set;
	}


	
	private Set<Identifier> getAncestorAttributes(Context context, Identifier ancestor) {
		CategoryDeclaration actual = context.getRegisteredDeclaration(CategoryDeclaration.class, ancestor);
		if(actual==null)
			return null;
		return actual.getAllAttributes(context);
	}

	@Override
	public boolean hasDerivedAttribute(Context context, Identifier name) {
		if(derivedFrom==null)
			return false;
		return derivedFrom.stream()
				.map(ancestor->context.getRegisteredDeclaration(CategoryDeclaration.class, ancestor))
				.filter(Objects::nonNull)
				.anyMatch(decl->decl.hasAttribute(context, name));
	}
	
	
	@Override
	public boolean hasLocalMethod(Context context, Identifier name) {
		registerMethods(context);
		return methodsMap.containsKey(name.toString());
	}
	
	
	@Override
	public  boolean hasDerivedMethod(Context context, Identifier name) {
		if(derivedFrom==null)
			return false;
		registerMethods(context);
		return derivedFrom.stream()
				.map(ancestor->context.getRegisteredDeclaration(CategoryDeclaration.class, ancestor))
				.filter(Objects::nonNull)
				.anyMatch(decl->decl.hasMethod(context, name));
	}
	

	@Override
	public IType check(Context context) {
		IProblemListener listener = context.getProblemListener();
		listener.pushDeclaration(this);
		try {
			context = context.newInstanceContext(getType(context), false);
			checkDerived(context);
			checkMethods(context);
			return super.check(context);
		} finally {
			listener.popDeclaration();
		}
	}

	private void checkMethods(Context context) {
		registerMethods(context);
		for(IMethodDeclaration method : methods)
			method.checkChild(context);
	}
			
			
	@Override
	protected void registerMethods(Context context) {
		if(methodsMap==null) {
			methodsMap = new HashMap<String,IDeclaration>();
			methods.forEach(method->registerMethod(method, context));
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
			((MethodDeclarationMap)actual).register(method, context, false);
		}
	}

	private void checkDerived(Context context) {
		if(derivedFrom!=null) for(Identifier category : derivedFrom) {
			ConcreteCategoryDeclaration cd = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, category);
			if(cd==null)
				context.getProblemListener().reportUnknownCategory(category, category.toString());
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
	
	@Override
	public GetterMethodDeclaration findGetter(Context context, Identifier attrName) {
		registerMethods(context);
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

	@Override
	public SetterMethodDeclaration findSetter(Context context, Identifier attrName) {
		registerMethods(context);
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
	
	@Override
	public MethodDeclarationMap getMemberMethods(Context context, Identifier name, boolean allowAbstract) {
		registerMethods(context);
		MethodDeclarationMap result = new MethodDeclarationMap(name);
		collectMemberMethods(context, result, allowAbstract);
		return result; 
	}
	
	private void collectMemberMethods(Context context, MethodDeclarationMap result, boolean allowAbstract) {
		collectInheritedMemberMethods(context, result, allowAbstract);
		collectThisMemberMethods(context, result, allowAbstract);
	}

	
	private void collectInheritedMemberMethods(Context context, MethodDeclarationMap result, boolean allowAbstract) {
		if(derivedFrom==null) 
			return;
		for(Identifier ancestor : derivedFrom)
			collectInheritedMemberMethods(ancestor, context, result, allowAbstract); 
	}
	

	private void collectInheritedMemberMethods(Identifier ancestor, Context context, MethodDeclarationMap result, boolean allowAbstract) {
		ConcreteCategoryDeclaration decl = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, ancestor);
		if(decl==null)
			return;
		decl.registerMethods(context);
		decl.collectMemberMethods(context, result, allowAbstract);
	}

	private void collectThisMemberMethods(Context context, MethodDeclarationMap result, boolean allowAbstract) {
		if(methodsMap==null)
			return;
		IDeclaration actual = methodsMap.get(result.getId().toString()); 
		if(actual==null)
			return;
		if(!(actual instanceof MethodDeclarationMap))
			throw new SyntaxError("Not a member method!");
		for(IMethodDeclaration method : ((MethodDeclarationMap)actual).values()) {
			if(allowAbstract || !method.isAbstract())
				result.register(method, context, true);
		}
	}

	@Override
	public IMethodDeclaration findOperator(Context context, Operator operator, IType type) {
		Identifier methodName = new Identifier(OperatorMethodDeclaration.getNameAsKey(operator));
		MethodDeclarationMap methods = getMemberMethods(context, methodName, false);
		if(methods==null)
			return null;
		// find best candidate
		IMethodDeclaration candidate = null;
		for(IMethodDeclaration method : methods.values()) {
			IType potential = method.getParameters().getFirst().getType(context);
			if(!potential.isAssignableFrom(context, type))
				continue;
			if(candidate==null)
				candidate = method;
			else {
				IType currentBest = candidate.getParameters().getFirst().getType(context);
				if(potential.isAssignableFrom(context, currentBest))
					candidate = method;
			}
		}
		return candidate;
	}

	@Override
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
			java.lang.reflect.Type concreteType = CompilerUtils.categoryConcreteParentTypeFrom(fullName);
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
			compileCollectStorables(context, classFile, new Flags());
			compileMethods(context, classFile, new Flags());
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}
	

	private void compileCollectStorables(Context context, ClassFile classFile, Flags flags) {
		Set<Identifier> attributes = getLocalCategoryAttributes(context);
		if(attributes==null)
			return;
		MethodInfo method = classFile.newMethod("collectStorables", new Descriptor.Method(Consumer.class, void.class));
		StackLocal $this = method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		StackLocal $storables = method.registerLocal("storables", VerifierType.ITEM_Object, new ClassConstant(List.class));
		// call super
		CompilerUtils.compileALOAD(method, $this);
		CompilerUtils.compileALOAD(method, $storables);
		MethodConstant m = new MethodConstant(classFile.getSuperClass(), "collectStorables", Consumer.class, void.class);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		attributes.stream()
			.filter(id->compilesToPromptoRoot(context, id))
			.forEach((id)->{
				StackState state = method.captureStackState();
				// call getter 
				CompilerUtils.compileALOAD(method, $this); 
				AttributeDeclaration attr = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
				FieldInfo field = attr.toFieldInfo(context);
				MethodConstant mx = new MethodConstant(classFile.getThisClass(), 
						CompilerUtils.getterName(id.toString()), field.getType());
				method.addInstruction(Opcode.INVOKEVIRTUAL, mx); 
				StackLocal $field = method.registerLocal("$" + id.toString(), 
						VerifierType.ITEM_Object, new ClassConstant(field.getType()));
				CompilerUtils.compileASTORE(method, $field);
				// check if null
				CompilerUtils.compileALOAD(method, $field); 
				OffsetListenerConstant listener = method.addOffsetListener(new OffsetListenerConstant());
				method.activateOffsetListener(listener);
				method.addInstruction(Opcode.IFNULL, listener);
				// call collectStorables
				CompilerUtils.compileALOAD(method, $field); 
				method.addInstruction(Opcode.CHECKCAST, new ClassConstant(PromptoRoot.class));
				CompilerUtils.compileALOAD(method, $storables);
				mx = new MethodConstant(PromptoRoot.class, "collectStorables", Consumer.class, void.class);
				method.addInstruction(Opcode.INVOKEVIRTUAL, mx);
				method.inhibitOffsetListener(listener);
				method.restoreFullStackState(state);
				method.placeLabel(state);
			});
		method.addInstruction(Opcode.RETURN);
	}

	private boolean compilesToPromptoRoot(Context context, Identifier id) {
		AttributeDeclaration attr = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, attr.getType(context).getTypeNameId(), true);
		return decl instanceof CategoryDeclaration && !(decl instanceof IEnumeratedDeclaration);
	}

	protected void compileClassConstructor(Context context, ClassFile classFile, Flags flags) {
		if(needsClassConstructor(context)) {
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
				Opcode opcode = Opcode.values()[Opcode.ICONST_0.ordinal() + idx++];
				method.addInstruction(opcode);
			} else
				method.addInstruction(Opcode.LDC, new IntConstant(idx++));
			method.addInstruction(Opcode.LDC, new StringConstant(s));
			method.addInstruction(Opcode.AASTORE);
		}
		FieldConstant f = new FieldConstant(method.getClassFile().getThisClass(), "category", String[].class);
		method.addInstruction(Opcode.PUTSTATIC, f);
	}

	protected boolean needsClassConstructor(Context context) {
		return isStorable(context);
	}

	@Override
	public ClassFile compile(Context context, String fullName) {
		/* multiple inheritance is supported via interfaces */
		/* concrete class is an inner class of the interface */
		/* inner class is prefixed with '%' to prevent naming collisions */
		try {
			java.lang.reflect.Type interfaceType = CompilerUtils.categoryInterfaceTypeFrom(fullName);
			ClassFile classFile = new ClassFile(interfaceType);
			classFile.addModifier(Modifier.ABSTRACT | Modifier.INTERFACE);
			compileInterfaces(context, classFile);
			compileMethodPrototypes(context, classFile);
			ClassFile concrete = compileConcreteClass(context, fullName);
			classFile.addInnerClass(concrete);
			return classFile;
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}

	private void compileInterfaces(Context context, ClassFile classFile) {
		if(isStorable(context))
			classFile.addInterface(IPromptoStorable.class);
		if(derivedFrom!=null)
			derivedFrom.forEach((id)->
				classFile.addInterface(CompilerUtils.getCategoryInterfaceType(id)));
		if(attributes!=null) 
			attributes.forEach((id)->{
				if(!isSuperClassAttribute(context, id) && !isInheritedAttribute(context, id))
					classFile.addInterface(CompilerUtils.getAttributeInterfaceType(id));
			});
	}
	
	private void compileMethodPrototypes(Context context, ClassFile classFile) {
		Map<String, MethodDeclarationMap> all = collectInterfaceMethods(context, this);
		all.values().forEach((map)->
			map.values().forEach((method)->
				compileMethodPrototype(context, classFile, method)));
	}
	
	protected Map<String, MethodDeclarationMap> collectInterfaceMethods(Context context, ICodeSection section) {
		// the methods to declare in the interface are those not already declared
		Map<String, MethodDeclarationMap> all = getAllMethods(context, section);
		Map<String, MethodDeclarationMap> local = new HashMap<>();
		collectLocalMethods(context, local);
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

	private void compileMethodPrototype(Context context, ClassFile classFile, IMethodDeclaration method) {
		try {
			context = context.newInstanceContext(getType(context), false).newChildContext();
			method.registerParameters(context);
			method.compilePrototype(context, false, classFile);
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

	protected ClassConstant getInterface(Context context) {
		return new ClassConstant(CompilerUtils.getCategoryInterfaceType(getId()));
	}

	protected ClassConstant getSuperClass(Context context) {
		if(derivedFrom==null) 
			return new ClassConstant(PromptoRoot.class);
		/* the JVM does not support multiple inheritance but we can still benefit from single inheritance */
		return new ClassConstant(CompilerUtils.getCategoryConcreteType(derivedFrom.getFirst()));
	}

	protected void compileCategoryField(Context context, ClassFile classFile, Flags flags) {
		if(isStorable(context)) {
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
			CategoryDeclaration owner = setter.getMemberOf();
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
			CategoryDeclaration owner = getter.getMemberOf();
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

	
	private boolean isCategoryAttribute(Context context, Identifier id) {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		return decl.getType(context) instanceof CategoryType;
	}
	
	
	private void compileLocalSetterMethod(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) {
		SetterMethodDeclaration setter = findSetter(context, id);
		if(setter!=null)
			setter.compile(context, classFile, flags, getType(context), field);
		else
			compileFieldSetter(context, classFile, flags, id, field);
	}
	
	private void compileFieldSetter(Context context, ClassFile classFile, Flags flags, Identifier id, FieldInfo field) {
		String name = CompilerUtils.setterName(field.getName().getValue());
		Descriptor.Method proto = new Descriptor.Method(field.getType(), void.class);
		MethodInfo method = classFile.newMethod(name, proto);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		ClassConstant fc = new ClassConstant(field.getType());
		method.registerLocal("%value%", VerifierType.ITEM_Object, fc);
		// store data in field
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, fc);
		FieldConstant f = new FieldConstant(classFile.getThisClass(), field.getName().getValue(), field.getType());
		method.addInstruction(Opcode.PUTFIELD, f);
		if(isPromptoRoot(context) && isStorableAttribute(context, id)) {
			// also store data in storable
			MethodConstant m = new MethodConstant(PromptoRoot.class, "setStorable", String.class, Object.class, void.class);
			method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
			method.addInstruction(Opcode.LDC, new StringConstant(field.getName().getValue()));
			method.addInstruction(Opcode.ALOAD_1, new ClassConstant(Object.class));
			compileGetStorableData(context, method, flags, id);
			method.addInstruction(Opcode.INVOKESPECIAL, m);
		}
		// done
		method.addInstruction(Opcode.RETURN);
	}

	private boolean isStorableAttribute(Context context, Identifier id) {
		return context.getRegisteredDeclaration(AttributeDeclaration.class, id).isStorable(context);
	}

	private void compileGetStorableData(Context context, MethodInfo method, Flags flags, Identifier id) {
		IType type = context.getRegisteredDeclaration(AttributeDeclaration.class, id).getType();
		type.compileGetStorableData(context, method, flags);
	}

	@Override
	protected boolean isPromptoRoot(Context context) {
		if(PromptoRoot.class==getSuperClass(context).getType())
			return true;
		else {
			CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, derivedFrom.getFirst());
			return decl.isPromptoRoot(context);
		}
	}
	
	protected boolean isPromptoError(Context context) {
		return false;
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
		Descriptor.Method proto = new Descriptor.Method(field.getType());
		MethodInfo method = classFile.newMethod(name, proto);
		method.registerLocal("this", VerifierType.ITEM_Object, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		FieldConstant f = new FieldConstant(classFile.getThisClass(), id.toString(), field.getType());
		method.addInstruction(Opcode.GETFIELD, f);
		method.addInstruction(Opcode.ARETURN, new ClassConstant(field.getType()));
	}

	protected void compileEmptyConstructor(Context context, ClassFile classFile, Flags flags) {
		if(isStorable(context)) {
			Descriptor.Method proto = new Descriptor.Method(void.class);
			MethodInfo method = classFile.newMethod("<init>", proto);
			method.registerLocal("this", VerifierType.ITEM_UninitializedThis, classFile.getThisClass());
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
		if(!isStorable(context))
			return;
		Descriptor.Method proto = new Descriptor.Method(IStored.class, void.class);
		MethodInfo method = classFile.newMethod("<init>", proto);
		method.registerLocal("this", VerifierType.ITEM_UninitializedThis, classFile.getThisClass());
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
		// this.storable.clear()
		ClassConstant thisClass = method.getClassFile().getThisClass();
		method.addInstruction(Opcode.ALOAD_0, thisClass);
		FieldConstant field = new FieldConstant(thisClass, "storable", IStorable.class);
		method.addInstruction(Opcode.GETFIELD, field);
		InterfaceConstant i = new InterfaceConstant(IStorable.class, "clear", void.class);
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
		// convert to instance
		compileConvertFieldToInstance(context, method, flags, id);
		// cast to actual type
		FieldInfo field = context.getRegisteredDeclaration(AttributeDeclaration.class, id).toFieldInfo(context);
		method.addInstruction(Opcode.CHECKCAST, new ClassConstant(field.getType()));
		// call setter
		String setterName = CompilerUtils.setterName(field.getName().getValue());
		MethodConstant m = new MethodConstant(thisClass, setterName, field.getType(), void.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
	}

	private void compileConvertFieldToInstance(Context context, MethodInfo method, Flags flags, Identifier id) {
		IType type = context.getRegisteredDeclaration(AttributeDeclaration.class, id).getType(context);
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
		if(decl instanceof IEnumeratedDeclaration) {
			Type symbolType = decl instanceof EnumeratedNativeDeclaration ? CompilerUtils.getNativeEnumType(decl.getId()) : CompilerUtils.getCategoryEnumConcreteType(decl.getId());
			method.addInstruction(Opcode.LDC, new ClassConstant(symbolType));
			InterfaceConstant m = new InterfaceConstant(PromptoEnum.class, "getInstance", Object.class, Class.class, PromptoEnum.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
		} else if(decl instanceof CategoryDeclaration) {
			MethodConstant m = new MethodConstant(PromptoRoot.class, "newInstanceFromDbIdRef", Object.class, PromptoRoot.class);
			method.addInstruction(Opcode.INVOKESTATIC, m);
		}
	}

	private void compileNewStorable(Context context, MethodInfo method, Flags flags) {
		if(isSuperClassStorable(context))
			compileSetStorableCategories(context, method, flags);
		else 
			compileNewStorableInstance(context, method, flags);
	}

	private void compileSetStorableCategories(Context context, MethodInfo method, Flags flags) {
		ClassConstant thisClass = method.getClassFile().getThisClass();
		method.addInstruction(Opcode.ALOAD_0, thisClass); // -> this
		FieldConstant f = new FieldConstant(thisClass, "storable", IStorable.class);
		method.addInstruction(Opcode.GETFIELD, f); // -> storable
		f = new FieldConstant(thisClass, "category", String[].class);
		method.addInstruction(Opcode.GETSTATIC, f); // -> storable, String[]
		InterfaceConstant i = new InterfaceConstant(IStorable.class, "setCategories", String[].class, void.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i); 
	}

	private void compileNewStorableInstance(Context context, MethodInfo method, Flags flags) {
		ClassConstant thisClass = method.getClassFile().getThisClass();
		method.addInstruction(Opcode.ALOAD_0, thisClass); // -> this
		MethodConstant m = new MethodConstant(new ClassConstant(DataStore.class), "getInstance", IStore.class);
		method.addInstruction(Opcode.INVOKESTATIC, m); // -> this, IStore
		FieldConstant f = new FieldConstant(thisClass, "category", String[].class);
		method.addInstruction(Opcode.GETSTATIC, f); // -> this, IStore, String[]
		method.addInstruction(Opcode.ALOAD_0, thisClass); // -> this, IStore, String[], this )
		m = new MethodConstant(new ClassConstant(PromptoStorableBase.class), "getDbIdFactory", IDbIdFactory.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m); // -> this, IStore, String[], IDbIdFactory
		InterfaceConstant i = new InterfaceConstant(IStore.class, "newStorable", String[].class, IDbIdFactory.class, IStorable.class);
		method.addInstruction(Opcode.INVOKEINTERFACE, i); // this, IStorable
		f = new FieldConstant(thisClass, "storable", IStorable.class);
		method.addInstruction(Opcode.PUTFIELD, f);
	}

	boolean isSuperClassStorable(Context context) {
		if(derivedFrom==null || derivedFrom.isEmpty())
			return false;
		return context.getRegisteredDeclaration(CategoryDeclaration.class, derivedFrom.getFirst()).isStorable(context);
	}

	protected void compileMethods(Context context, ClassFile classFile, Flags flags) {
		compileMethods(context, classFile, flags, new HashSet<>());
	}
	
	private void compileMethods(Context context, ClassFile classFile, Flags flags, Set<String> registry) {
		compileLocalMethods(context, classFile, flags, registry);
		compileInheritedMethods(context, classFile, flags, registry);
	}

	private void compileInheritedMethods(Context context, ClassFile classFile, Flags flags, Set<String> registry) {
		if(derivedFrom==null || derivedFrom.size()==1)
			return;
		// skip base class since we automatically inherit methods from it
		for(int i=1; i<derivedFrom.size(); i++) {
			ConcreteCategoryDeclaration decl = context.getRegisteredDeclaration(ConcreteCategoryDeclaration.class, derivedFrom.get(i));
			if(decl == null)
				throw new SyntaxError("Should never get there!");
			decl.compileMethods(context, classFile, flags, registry);
		}
	}

	private void compileLocalMethods(Context context, ClassFile classFile, Flags flags, Set<String> registry) {
		methods.stream()
			.filter(m -> !(m instanceof GetterMethodDeclaration))
			.filter(m -> !(m instanceof SetterMethodDeclaration))
			.filter(m -> !m.isAbstract())
			.filter(m -> registry.add(m.getId().toString() + ":" + m.getProto()))
			.forEach(m -> compileMethod(context, m, classFile, flags));
	}

	private void compileMethod(Context context, IMethodDeclaration method, ClassFile classFile, Flags flags) {
		context = context.newMemberContext(getType(context));
		method.registerParameters(context);
		method.compile(context, false, classFile);
	}

	@Override
	public void ensureDeclarationOrder(Context context, List<ITranspilable> list, Set<ITranspilable> set) {
	    if(set.contains(this))
	        return;
	    if (this.derivedFrom != null) {
	        this.derivedFrom.forEach(cat -> {
	        	CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, cat);
	            decl.ensureDeclarationOrder(context, list, set);
	        });
	    }
	    list.add(this);
	    set.add(this);
	}

	@Override
	public void declare(Transpiler transpiler) {
		if(!transpiler.isDeclared(this)) {
			if(declaring)
				return;
			declaring = true;
			transpiler = transpiler.newLocalTranspiler();
			IProblemListener listener = transpiler.getContext().getProblemListener();
			listener.pushDeclaration(this);
			try {
				doDeclare(transpiler);
			} finally {
				listener.popDeclaration();
				transpiler.flush();
				declaring = false;
			}
		}
	}
	
	private void doDeclare(Transpiler transpiler) {
	    transpiler.declare(this);
	    declareAttributes(transpiler);
	    declareDerivedBy(transpiler);
	    declareMembers(transpiler);
	}

	private void declareMembers(Transpiler transpiler) {
	    Transpiler instance = transpiler.newInstanceTranspiler(getType(transpiler.getContext()));
	    if (this.derivedFrom != null) {
	        this.derivedFrom.forEach(cat -> {
	            CategoryDeclaration decl = instance.getContext().getRegisteredDeclaration(CategoryDeclaration.class, cat);
	            decl.declare(instance);
	        });
	    } else
	    	declareRoot(instance);
	    if(this.storable) {
	    	instance.require("DataStore");
	    	instance.require("Remote");
	    }
	    this.declareMethods(instance);
	    instance.flush();
	}

	private void declareDerivedBy(Transpiler transpiler) {
		if(isAWidget(transpiler.getContext()))
			return;
		else
			transpiler.getContext().fetchDerivedCategoryDeclarations(this.id)
				.forEach(decl->decl.declare(transpiler));
		
	}

	private void declareMethods(Transpiler transpiler) {
	    this.methods.stream().filter(decl -> {
	        return !(decl instanceof SetterMethodDeclaration || decl instanceof GetterMethodDeclaration);
	    }).forEach(method -> {
			Transpiler t = transpiler.newChildTranspiler();
	        method.declare(t);
	        t.flush();
	    });
	}

	protected void declareRoot(Transpiler transpiler) {
        transpiler.require("$Root");
 	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		IProblemListener listener = transpiler.getContext().getProblemListener();
		listener.pushDeclaration(this);
		try {
			doTranspile(transpiler);
		    return true;
		} finally {
			listener.popDeclaration();
		}
	}
		
	protected void doTranspile(Transpiler transpiler) {
		transpileConstructor(transpiler);
	    transpiler = transpiler.newInstanceTranspiler(new CategoryType(getId()));
	    transpileLoaders(transpiler);
	    transpileMethods(transpiler);
	    transpileGetterSetters(transpiler);
	    transpiler.flush();
	}

	private void transpileConstructor(Transpiler transpiler) {
	    transpiler.append("function ").append(getName()).append("(copyFrom, values, mutable) {");
	    transpiler.indent();
	    List<String> categories = collectCategories(transpiler.getContext());
	    if(storable) {
	    	transpiler.append("if(!this.$storable) {").indent()
	    		.append("var dbIdFactory = { provider: this.getDbId.bind(this), listener: this.setDbId.bind(this) };").newLine()
	        	.append("this.$storable = $DataStore.instance.newStorableDocument(['").append(categories.stream().collect(Collectors.joining("', '"))).append("'], dbIdFactory);").newLine()
	    		.dedent().append("}").newLine();
	    }
	    transpileGetterSetterAttributes(transpiler);
	    transpileSuperConstructor(transpiler);
	    transpiler.append("this.$categories = [").append(categories.stream().collect(Collectors.joining(", "))).append("];").newLine();
	    transpileLocalAttributes(transpiler);
	    transpiler.append("this.$mutable = mutable;").newLine();
	    transpiler.append("return this;").dedent().append("}").newLine();
	    List<Identifier> parents = (derivedFrom!=null && derivedFrom.size()>0) ? derivedFrom : Collections.singletonList(new Identifier("$Root"));
	    transpiler.append(getName()).append(".prototype = Object.create(").append(parents.get(0).toString()).append(".prototype);").newLine();
	    parents = parents.subList(0, parents.size());
	    Collections.reverse(parents); // fulfill MRO
	    transpiler.append(getName()).append(".prototype = Object.assign(").append(getName()).append(".prototype");
	    parents.forEach(p -> transpiler.append(", ").append(p.toString()).append(".prototype"));
	    transpiler.append(");").newLine();
	    transpiler.append(getName()).append(".prototype.constructor = ").append(getName()).append(";").newLine();
	}

	protected void transpileLoaders(Transpiler transpiler) {
	    Set<Identifier> attributes = this.getLocalAttributes(transpiler.getContext());
	    if (attributes!=null) {
	        attributes.stream()
	            .filter(attr -> isEnumeratedAttribute(transpiler.getContext(), attr))
	            .forEach(attr -> {
	                    transpiler.append(this.getName()).append(".prototype.load$").append(attr.toString()).append(" = function(name) {").indent();
	                    transpiler.append("return eval(name);").dedent();
	                    transpiler.append("};").newLine();
	                });
	        }
	}

	protected void transpileGetterSetters(Transpiler transpiler) {
		Set<Identifier> names = this.methods.stream().filter(decl -> {
	        return (decl instanceof SetterMethodDeclaration || decl instanceof GetterMethodDeclaration);
	    }).map(decl -> decl.getId()).collect(Collectors.toSet());
	    names.forEach(name -> this.transpileGetterSetter(transpiler, name));
	}

	private void transpileGetterSetter(Transpiler transpiler, Identifier id) {
	    GetterMethodDeclaration getter = this.findGetter(transpiler.getContext(), id);
	    SetterMethodDeclaration setter = this.findSetter(transpiler.getContext(), id);
	    transpiler.append("Object.defineProperty(").append(this.getName()).append(".prototype, '").append(id.toString()).append("', {").indent();
	    transpiler.append("get: function() {").indent();
	    if(getter!=null) {
	    	Transpiler m = transpiler.newGetterTranspiler(id.toString());
	        getter.transpile(m);
	        m.flush();
	    } else
	        transpiler.append("return this.$").append(id.toString()).append(";").newLine();
	    transpiler.dedent().append("}");
	    transpiler.append(",").newLine();
	    transpiler.append("set: function(").append(id.toString()).append(") {").indent();
	    if(setter!=null) {
	       	Transpiler m = transpiler.newSetterTranspiler(id.toString());
   	        m.append(id.toString()).append(" = (function(").append(id.toString()).append(") {").indent();
	        setter.transpile(m);
            m.append(";").dedent().append("})(name);").newLine();
	        m.flush();
	    }
	    transpiler.append("this.$").append(id.toString()).append(" = ").append(id.toString()).append(";").newLine();
	    transpiler.dedent().append("}");
	    transpiler.dedent().append("});").newLine();
	}

	protected void transpileGetterSetterAttributes(Transpiler transpiler) {
	    Set<Identifier> allAttributes = this.getAllAttributes(transpiler.getContext());
	    if(allAttributes!=null) {
	        allAttributes.forEach(attr -> {
	            if (this.findGetter(transpiler.getContext(), attr) !=null|| this.findSetter(transpiler.getContext(), attr)!=null)
	                transpiler.append("this.$").append(attr.toString()).append(" = null;").newLine();
	        });
	    }
	}

	protected void transpileMethods(Transpiler transpiler) {
	    this.methods.stream().filter(decl -> {
	        return !(decl instanceof SetterMethodDeclaration || decl instanceof GetterMethodDeclaration);
	    }).forEach(method -> {
	    	Transpiler t = transpiler.newChildTranspiler();
	        method.transpile(t);
	        t.flush();
	    });
	}

	protected void transpileLocalAttributes(Transpiler transpiler) {
	    Set<Identifier> attributes = this.getLocalAttributes(transpiler.getContext());
	    if (attributes!=null) {
	        transpiler.append("this.$mutable = true;").newLine();
	        transpiler.append("values = Object.assign({}, copyFrom, values);").newLine();
	        attributes.forEach(attr -> {
	        	AttributeDeclaration decl = transpiler.getContext().getRegisteredDeclaration(AttributeDeclaration.class, attr);
	        	boolean isEnum = isEnumeratedAttribute(transpiler.getContext(), attr);
	            transpiler.append("this.setMember('")
	            	.append(attr.toString())
	            	.append("', values.hasOwnProperty('")
	            	.append(attr.toString())
	            	.append("') ? values.")
	             	.append(attr.toString())
	             	.append(" : null")
	            	.append(", ")
	            	.append(decl.isStorable(transpiler.getContext()))
	            	.append(", mutable")
	            	.append(", ")
	            	.append(isEnum)
	            	.append(");")
	            	.newLine();
	        });
	    }
	}

	private boolean isEnumeratedAttribute(Context context, Identifier attr) {
		IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, attr);
		IType type = decl.getType(context);
		if(type instanceof NativeType)
			return false;
		decl =  context.getRegisteredDeclaration(IDeclaration.class, type.getTypeNameId());
		return decl instanceof IEnumeratedDeclaration;
	}

	protected void transpileSuperConstructor(Transpiler transpiler) {
	    if (this.derivedFrom!=null && this.derivedFrom.size()>0) {
	        this.derivedFrom.forEach(derived-> {
	            transpiler.append(derived.toString()).append(".call(this, copyFrom, values, mutable);").newLine();
	        });
	    } else
	    	transpileRootConstructor(transpiler).newLine();
	}

	protected Transpiler transpileRootConstructor(Transpiler transpiler) {
		return transpiler.append("$Root.call(this);");
	}
	
}
