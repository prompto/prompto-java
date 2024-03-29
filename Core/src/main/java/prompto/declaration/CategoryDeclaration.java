package prompto.declaration;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.compiler.ClassFile;
import prompto.compiler.Flags;
import prompto.compiler.InterfaceConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.grammar.MethodDeclarationList;
import prompto.grammar.Operator;
import prompto.intrinsic.PromptoDbId;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.transpiler.ITranspilable;
import prompto.transpiler.Transpiler;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Instance;
import prompto.utils.TypeUtils;
import prompto.value.BinaryValue;
import prompto.value.ConcreteInstance;
import prompto.value.IInstance;
import prompto.value.IValue;
import prompto.value.NullValue;

public abstract class CategoryDeclaration extends BaseDeclaration {
	
	IWidgetDeclaration widget;
	IdentifierList derivedFrom = null;
	IdentifierList attributes;
	boolean storable = false;
	
	public CategoryDeclaration(Identifier id) {
		super(id);
	}

	public CategoryDeclaration(Identifier name, IdentifierList attributes) {
		super(name);
		this.attributes = attributes;
	}
	
	@Override
	public DeclarationType getDeclarationType() {
		return DeclarationType.CATEGORY;
	}
	
	public boolean isAWidget(Context context) {
		return false;
	}
	
	public IWidgetDeclaration asWidget() {
		// cache it so it can be assigned widget specific data
		if(widget==null) {
			widget = new WrappingWidgetDeclaration(this);
		}
		return widget;
	}
	
	public void setStorable(boolean storable) {
		this.storable = storable;
	}
	
	@Override
	public boolean isStorable(Context context) {
		return storable || isDerivedFromStorable(context);
	}

	private boolean isDerivedFromStorable(Context context) {
		if(context == null || derivedFrom == null)
			return false;
		else
			return derivedFrom.stream()
					.map(id -> context.getRegisteredDeclaration(CategoryDeclaration.class, id))
					.filter(Objects::nonNull)
					.anyMatch(decl->decl.isStorable(context));	
	}

	public void setAttributes(IdentifierList attributes) {
		this.attributes = attributes;
	}
	
	public IdentifierList getAttributes() {
		return attributes;
	}
	
	public Set<Identifier> getAllAttributes(Context context) {
		if(attributes!=null)
			return new HashSet<Identifier>(attributes);
		else
			return null;
	}
		
	public abstract List<String> collectCategories(Context context);
	
	@Override
	public void register(Context context) {
		context.registerDeclaration(this);
		registerMethods(context);
	}
	
	protected abstract void registerMethods(Context context);
	

	@Override
	public IType check(Context context) {
		if(attributes!=null) for(Identifier attr : attributes) {
			if(attr==null)
				continue; // problem already handled by parser
			AttributeDeclaration ad = context.getRegisteredDeclaration(AttributeDeclaration.class, attr);
			if(ad==null && !"text".equals(attr.toString()))
				context.getProblemListener().reportUnknownAttribute(attr, attr.toString());
		}
		return new CategoryType(this.getId());
	}
	
	@Override
	public CategoryType getType(Context context) {
		return new CategoryType(getId());
	}

	public boolean hasAttribute(Context context, Identifier id) {
		return hasLocalAttribute(context, id) || hasDerivedAttribute(context, id); 
	}
	
	public boolean hasLocalAttribute(Context context, Identifier id) {
			if(IStore.dbIdName.equals(id.toString()))
			return isStorable(context);
		else
			return attributes!=null && attributes.contains(id);
	}
	
	public boolean hasDerivedAttribute(Context context, Identifier id) {
		return false;
	}
	
	public boolean hasMethod(Context context, Identifier id) {
		return hasLocalMethod(context, id) || hasDerivedMethod(context, id); 
	}

	public boolean hasLocalMethod(Context context, Identifier id) {
		return false; 
	}

	public boolean hasDerivedMethod(Context context, Identifier id) {
		return false; 
	}

	public boolean isDerivedFrom(Context context, CategoryType categoryType) {
		return false;
	}

	public IdentifierList getDerivedFrom() {
		return null;
	}

	public boolean isAbstract() {
		return false;
	}
	
	public abstract IInstance newInstance(Context context) throws PromptoError;
	
	public IInstance newInstance(Context context, IStored stored) throws PromptoError {
		IInstance instance = newInstance(context);
		instance.setMutable(true);
		try {
			populateInstance(context, stored, instance);
		} finally {
			instance.setMutable(false);
		}
		return instance;
	}

	private void populateInstance(Context context, IStored stored, IInstance instance) throws PromptoError {
		setDbId(context, instance, stored.getDbId());
		for(Identifier name : this.getAllAttributes(context)) 
			populateMember(context, stored, instance, name);
		if(instance.getStorable()!=null)
			instance.getStorable().clear();
	}
	
	protected void setDbId(Context context, IInstance instance, PromptoDbId dbId) {
		if(instance instanceof ConcreteInstance)
			((ConcreteInstance)instance).setDbId(dbId);
		else
			throw new UnsupportedOperationException("setDbId on native instance");
	}

	private void populateMember(Context context, IStored stored, IInstance instance, Identifier id) throws PromptoError {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		if(!decl.isStorable(context))
			return;
		String name = id.toString();
		if(stored.hasData(name)) {
			Object data = stored.getData(name);
			populateMember(context, data, instance, decl);
		}
	}
	
	protected void populateMember(Context context, Object data, IInstance instance, AttributeDeclaration decl) throws PromptoError {
		IValue value = data==null ? NullValue.instance() : decl.getType().convertJavaValueToIValue(context, data);
		if(value!=null) {
			if(value instanceof BinaryValue)
				((BinaryValue)value).setSource(null, instance.getStorable().getOrCreateDbId(), decl.getName());
			instance.setMember(context, decl.getId(), value);
		}
	}

	public void checkConstructorContext(Context context) {
		// nothing to do
	}
	
	@Override
	public void declarationToDialect(CodeWriter writer) {
		writer = writer.newInstanceWriter(getType(writer.getContext()));
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case M:
			toMDialect(writer);
			break;
		}
	}
	
	
	@Override
	public Collection<Annotation> getAllAnnotations(Context context) {
		return getAllAnnotationsAsStream(context).collect(Collectors.toList());
	}
	
	@Override
	public Stream<Annotation> getAllAnnotationsAsStream(Context context) {
		Instance<Stream<Annotation>> stream = new Instance<>();
		stream.set(Stream.empty());
		IdentifierList derivedFrom = getDerivedFrom();
		if(derivedFrom!=null) {
			derivedFrom.forEach(id->{
				CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, id);
				if(decl==null)
					context.getProblemListener().reportUnknownCategory(id, id.toString());
				else
					stream.set(Stream.concat(stream.get(), decl.getAllAnnotationsAsStream(context)));
			});
		}
		if(annotations!=null)
			stream.set(Stream.concat(stream.get(), annotations.stream()));
		return stream.get();
	}

	public void processAnnotations(Context context, boolean processDerivedFrom) {
		Stream<Annotation> stream = processDerivedFrom ? getAllAnnotationsAsStream(context) : annotations==null ? Stream.empty() : annotations.stream();
		stream.forEach(a->a.processCategory(context, this));
	}
	
	
	protected abstract void toEDialect(CodeWriter writer);

	protected void protoToEDialect(CodeWriter writer, boolean hasMethods, boolean hasMappings) {
		boolean hasAttributes = attributes!=null && attributes.size()>0;
		writer.append("define ");
		writer.append(getName());
		writer.append(" as ");
		if(storable)
			writer.append("storable ");
		categoryTypeToEDialect(writer);
		if(hasAttributes) {
			if(attributes.size()==1)
				writer.append(" with attribute ");
			else
				writer.append(" with attributes ");
			attributes.toDialect(writer, true);
		}
		if(hasMethods) {
			if(hasAttributes)
				writer.append(", and methods:");
			else 
				writer.append(" with methods:");
		} else if (hasMappings) {
			if(hasAttributes)
				writer.append(", and bindings:");
			else 
				writer.append(" with bindings:");
		}
		writer.newLine();	
	}
	
	protected void methodsToEDialect(CodeWriter writer, MethodDeclarationList methods) {
		writer.indent();
		for(IDeclaration decl : methods) {
			CodeWriter w = writer.newMemberWriter();
			decl.toDialect(w);
			writer.newLine();
		}
		writer.dedent();
	}

	protected void methodsToODialect(CodeWriter writer, MethodDeclarationList methods) {
		for(IDeclaration decl : methods) {
			CodeWriter w = writer.newMemberWriter();
			decl.toDialect(w);
			w.newLine();
		}
	}



	protected abstract void categoryTypeToEDialect(CodeWriter writer);

	protected abstract void toODialect(CodeWriter writer);
	
	protected void toODialect(CodeWriter writer, boolean hasBody) {
		categoryTypeToODialect(writer);
		writer.append(" ");
		writer.append(getName());
		if(attributes!=null) {
			writer.append('(');
			attributes.toDialect(writer, true);
			writer.append(')');
		}	
		categoryExtensionToODialect(writer);
		if(hasBody) {
			writer.append(" {\n");
			writer.newLine();
			writer.indent();
			bodyToODialect(writer);
			writer.dedent();
			writer.append('}');
			writer.newLine();
		} else
			writer.append(';');
	}

	protected abstract void categoryTypeToODialect(CodeWriter writer);

	protected void categoryExtensionToODialect(CodeWriter writer) {
		// by default no extension
	}

	protected abstract void bodyToODialect(CodeWriter writer);

	protected abstract void toMDialect(CodeWriter writer);

	protected void protoToMDialect(CodeWriter writer, IdentifierList derivedFrom) {
		if(storable)
			writer.append("storable ");
		categoryTypeToMDialect(writer);
		writer.append(" ");
		writer.append(getName());
		writer.append("(");
		if(derivedFrom!=null) {
			derivedFrom.toDialect(writer, false);
			if(attributes!=null)
				writer.append(", ");
		}
		if(attributes!=null)
			attributes.toDialect(writer, false);
		writer.append("):\n");
	}

	protected abstract void categoryTypeToMDialect(CodeWriter writer);

	public ClassFile compile(Context context, String fullName) {
		throw new UnsupportedOperationException(); // TODO -> abstract
	}
	
	public abstract IMethodDeclaration findOperator(Context context, Operator operator, IType type);
	
	public static ResultInfo compilePlus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		return compileOperator(context, method, flags, left, value, Operator.PLUS);
	}
	
	public static ResultInfo compileDivide(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		return compileOperator(context, method, flags, left, value, Operator.DIVIDE);
	}

	public static ResultInfo compileIntDivide(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		return compileOperator(context, method, flags, left, value, Operator.IDIVIDE);
	}

	public static ResultInfo compileModulo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		return compileOperator(context, method, flags, left, value, Operator.MODULO);
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		return compileOperator(context, method, flags, left, value, Operator.MULTIPLY);
	}

	public static ResultInfo compileMultiply(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, ResultInfo right) {
		IType argType = TypeUtils.typeToIType(right.getType());
		return compileOperator(context, method, flags, left, right, argType, Operator.MULTIPLY);
	}

	public static ResultInfo compileMinus(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value) {
		return compileOperator(context, method, flags, left, value, Operator.MINUS);
	}

	public static ResultInfo compileOperator(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression value, Operator oper) {
		IType argType = value.check(context);
		ResultInfo right = value.compile(context, method, flags);
		return compileOperator(context, method, flags, left, right, argType, oper);
	}

	private static ResultInfo compileOperator(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, ResultInfo right, IType argType, Operator oper) {
		String name = left.getType().getTypeName().substring("π.χ.".length());
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, new Identifier(name));
		IMethodDeclaration operator = decl.findOperator(context, oper, argType);
		if(operator==null)
			throw new SyntaxError("No " + oper.getToken() + " operator method defined!");
		Context local = context.newInstanceContext(decl.getType(context), false).newChildContext();
		operator.registerParameters(local);
		IType resultType = operator.check(local, false);
		String methodName = "operator_" + oper.name();
		InterfaceConstant c = new InterfaceConstant(left.getType(), methodName, argType.toJavaType(context), resultType.toJavaType(context));
		method.addInstruction(Opcode.INVOKEINTERFACE, c);
		return new ResultInfo(resultType.toJavaType(context)); 
	}

	public MethodDeclarationMap getMemberMethods(Context context, Identifier name, boolean allowAbstract) {
		throw new UnsupportedOperationException(); // TODO -> abstract
	}

	public MethodDeclarationList getLocalMethods() {
		throw new UnsupportedOperationException(); // TODO -> abstract
	}

	public Map<String, MethodDeclarationMap> getAllMethods(Context context, ICodeSection section) {
		Map<String, MethodDeclarationMap> maps = new HashMap<>();
		collectAllMethods(context, section, maps);
		return maps;
	}

	public void collectAllMethods(Context context, ICodeSection section, Map<String, MethodDeclarationMap> maps) {
		collectInheritedMethods(context, section, maps);
		collectLocalMethods(context, maps);
	}
	
	public void collectLocalMethods(Context context, Map<String, MethodDeclarationMap> maps) {
		getLocalMethods().forEach(m -> {
			MethodDeclarationMap current = maps.computeIfAbsent(m.getNameAsKey(), key -> new MethodDeclarationMap(m.getId()));
			current.put(m.getProto(), m);
		});
	}

	public void collectInheritedMethods(Context context, ICodeSection section, Map<String, MethodDeclarationMap> maps) {
		if(derivedFrom!=null) derivedFrom.forEach(id->{
			CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, id);
			if(decl==null)
				context.getProblemListener().reportInconsistentHierarchy(section, this.getName(), id.toString());
			else
				decl.collectAllMethods(context, section, maps);
		});
	}

	protected boolean isPromptoRoot(Context context) {
		return false;
	}
	
	protected void declareAttributes(Transpiler transpiler) {
		if(attributes!=null)
			attributes.forEach(attr->declareAttribute(attr, transpiler));
		
	}
	
	protected void declareAttribute(Identifier attr, Transpiler transpiler) {
		AttributeDeclaration decl = transpiler.getContext().getRegisteredDeclaration(AttributeDeclaration.class, attr);
		if(decl==null)
			transpiler.getContext().getProblemListener().reportUnknownAttribute(attr, attr.toString(), " in category: " + this.getName());
		else
			decl.declare(transpiler);
	}

	public abstract void ensureDeclarationOrder(Context context, List<ITranspilable> list, Set<ITranspilable> set);

	public GetterMethodDeclaration findGetter(Context context, Identifier attrName) {
		throw new IllegalStateException("Should never get there");
	}

	public SetterMethodDeclaration findSetter(Context context, Identifier attrName) {
		throw new IllegalStateException("Should never get there");
	}

	public Iterable<IMethodDeclaration> getAbstractMethods(Context context, ICodeSection section) {
		return getAllMethods(context, section).values().stream()
				.map(protos -> protos.values().stream().filter(IMethodDeclaration::isAbstract))
				.flatMap(Function.identity())
				.collect(Collectors.toList());
	}

	
}
