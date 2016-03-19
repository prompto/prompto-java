package prompto.declaration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import prompto.compiler.ClassConstant;
import prompto.compiler.ClassFile;
import prompto.compiler.CompilerException;
import prompto.compiler.CompilerUtils;
import prompto.compiler.FieldConstant;
import prompto.compiler.FieldInfo;
import prompto.compiler.Flags;
import prompto.compiler.IVerifierEntry;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
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
			actual = methodsMap.get("setter:"+method.getId().toString());
			if(actual!=null)
				throw new SyntaxError("Duplicate setter: \"" + method.getId().toString() + "\"");
			methodsMap.put("setter:"+method.getId().toString(),method);
		} else if(method instanceof GetterMethodDeclaration) {
			actual = methodsMap.get("getter:"+method.getId().toString());
			if(actual!=null)
				throw new SyntaxError("Duplicate getter: \"" + method.getId().toString() + "\"");
			methodsMap.put("getter:"+method.getId().toString(),method);
		} else {
			actual = methodsMap.get(method.getId().toString());
			if(actual==null) {
				actual = new MethodDeclarationMap(method.getId());
				methodsMap.put(method.getId().toString(), actual);
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
			if(ancestor.equals(categoryType.getId()))
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
		IDeclaration actual = methodsMap.get(result.getId().toString()); 
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

	@Override
	public IMethodDeclaration findOperator(Context context, Operator operator, IType type) throws SyntaxError {
		Identifier methodName = new Identifier("operator-" + operator.name());
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
	
	@Override
	public void compile(Context context, ClassFile classFile) {
		try {
			compileSuperClass(context, classFile, new Flags());
			compileFields(context, classFile, new Flags());
			compileConstructor(context, classFile, new Flags());
			compileMethods(context, classFile, new Flags());
		} catch(SyntaxError e) {
			throw new CompilerException(e);
		}
	}

	private void compileSuperClass(Context context, ClassFile classFile, Flags flags) {
		ClassConstant superClass = getSuperClass(context);
		if(superClass!=null)
			classFile.setSuperClass(superClass);
	}
	
	
	private ClassConstant getSuperClass(Context context) {
		if(derivedFrom==null) 
			return new ClassConstant("prompto/intrinsic/PromptoRoot");
		/* the JVM does not support multiple inheritance but we can still benefit from single inheritance */
		Identifier id = derivedFrom.getFirst();
		String className = CompilerUtils.getCategoryClassName(id, true);
		return new ClassConstant(className);
	}

	private void compileFields(Context context, ClassFile classFile, Flags flags) throws SyntaxError {
		if(attributes!=null) for(Identifier id : attributes)
			compileField(context, classFile, flags, id);
	}

	private void compileField(Context context, ClassFile classFile, Flags flags, Identifier id) throws SyntaxError {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		FieldInfo field = decl.toFieldInfo(context);
		classFile.addField(field);
		compileSetter(context, classFile, flags, id, field);
		compileGetter(context, classFile, flags, id, field);
	}
	

	private void compileSetter(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) throws SyntaxError {
		SetterMethodDeclaration setter = findSetter(context, id);
		if(setter!=null)
			setter.compile(context, classFile, flags, getType(context), field);
		else
			compileSetterField(context, classFile, flags, id, field);
	}
	
	private void compileSetterField(Context context, ClassFile classFile, Flags flags, 
			Identifier id, FieldInfo field) {
		String name = CompilerUtils.setterName(field.getName().getValue());
		String proto = "(" + field.getDescriptor().getValue() + ")V";
		MethodInfo method = new MethodInfo(name, proto);
		classFile.addMethod(method);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_Object, classFile.getThisClass());
		ClassConstant fc = new ClassConstant(field.getClassName());
		method.registerLocal("%value%", IVerifierEntry.Type.ITEM_Object, fc);
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_1, fc);
		FieldConstant f = new FieldConstant(classFile.getThisClass(), field.getName().getValue(), field.getDescriptor());
		method.addInstruction(Opcode.PUTFIELD, f);
		method.addInstruction(Opcode.RETURN);
	}

	private void compileGetter(Context context, ClassFile classFile, Flags flags,Identifier id, FieldInfo field) throws SyntaxError {
		GetterMethodDeclaration getter = findGetter(context, id);
		if(getter!=null)
			getter.compile(context, classFile, flags, getType(context), field);
		else
			compileGetterField(context, classFile, flags, id, field);
	}

	private void compileGetterField(Context context, ClassFile classFile, Flags flags, Identifier id, FieldInfo field) {
		String name = CompilerUtils.getterName(id.getName());
		String proto = "()" + field.getDescriptor().getValue();
		MethodInfo method = new MethodInfo(name, proto);
		classFile.addMethod(method);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_Object, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		FieldConstant f = new FieldConstant(classFile.getThisClass(), id.getName(), field.getDescriptor());
		method.addInstruction(Opcode.GETFIELD, f);
		method.addInstruction(Opcode.ARETURN, new ClassConstant(field.getClassName()));
	}

	private void compileConstructor(Context context, ClassFile classFile, Flags flags) {
		MethodInfo method = new MethodInfo("<init>", "()V");
		classFile.addMethod(method);
		method.registerLocal("this", IVerifierEntry.Type.ITEM_UninitializedThis, classFile.getThisClass());
		method.addInstruction(Opcode.ALOAD_0, classFile.getThisClass());
		MethodConstant m = new MethodConstant(classFile.getSuperClass(), "<init>", void.class);
		method.addInstruction(Opcode.INVOKESPECIAL, m);
		method.addInstruction(Opcode.RETURN);
	}

	private void compileMethods(Context context, ClassFile classFile, Flags flags) throws SyntaxError {
		for(IMethodDeclaration method : methods) {
			if(	method instanceof GetterMethodDeclaration || method instanceof SetterMethodDeclaration)
				continue;
			context = context.newCategoryContext(getType(context)).newChildContext();
			method.registerArguments(context);
			method.compile(context, classFile);
		}
	}
	


}
