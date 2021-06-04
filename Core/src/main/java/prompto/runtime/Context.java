package prompto.runtime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.code.BinaryResource;
import prompto.code.ICodeStore;
import prompto.code.Resource;
import prompto.code.TextResource;
import prompto.debug.ProcessDebugger.DebuggedWorker;
import prompto.debug.WorkerDebugger;
import prompto.debug.event.WorkerCompletedDebugEvent;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.SingletonCategoryDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.Symbol;
import prompto.expression.ValueExpression;
import prompto.grammar.Annotation;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoList;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.parser.Section;
import prompto.problem.IProblemListener;
import prompto.problem.ProblemRaiser;
import prompto.statement.CommentStatement;
import prompto.statement.IStatement;
import prompto.type.CategoryType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.NativeType;
import prompto.utils.CodeWriter;
import prompto.utils.CollectionUtils;
import prompto.utils.Logger;
import prompto.utils.ObjectUtils;
import prompto.utils.SectionLocator;
import prompto.value.ClosureValue;
import prompto.value.ConcreteInstance;
import prompto.value.DecimalValue;
import prompto.value.DocumentValue;
import prompto.value.IInstance;
import prompto.value.IValue;

/* a Context is the place where the Interpreter locates declarations and values */
public class Context implements IContext {
	
	static final Logger logger = new Logger();

	public static Context newGlobalsContext() {
		Context context = new Context();
		context.globals = context;
		context.calling = null;
		context.parent = null;
		context.debugger = null;
		context.problemListener = new ProblemRaiser();
		return context;
	}

	Context globals;
	Context calling;
	Context parent; // for inner methods
	WorkerDebugger debugger; 
	IProblemListener problemListener;
	Stack<IProblemListener> problemListeners;
	
	Map<Identifier,IDeclaration> declarations = new HashMap<>();
	Map<Identifier,TestMethodDeclaration> tests = new HashMap<>();
	Instances instances = new Instances();
	Map<Identifier,IValue> values = new HashMap<>();
	Map<Type, NativeCategoryDeclaration> nativeBindings = new HashMap<>();
	
	static class Instances {
		
		Map<Identifier,INamed> map = new HashMap<Identifier, INamed>();
		List<INamed> list = new ArrayList<>();
		
		
		@Override
		public String toString() {
			return list.toString();
		}
		
		public boolean isEmpty() {
			return map.isEmpty();
		}

		public Set<Identifier> keySet() {
			return map.keySet();
		}

		public void remove(Identifier id) {
			INamed named = map.remove(id);
			list.remove(named);
		}

		public INamed get(Identifier name) {
			return map.get(name);
		}

		public void put(Identifier id, INamed value) {
			INamed previous = map.put(id, value);
			if(previous!=null)
				list.remove(previous);
			list.add(value);
		}

		public Collection<INamed> values() {
			return list;
		}
	}
	
	protected Context() {
	}

	public Context getGlobalsContext() {
		return globals;
	}

	public boolean isGlobalsContext() {
		return this==globals;
	}
	
	public void setDebugger(WorkerDebugger debugger) {
		this.debugger = debugger;
	}
	
	public WorkerDebugger getDebugger() {
		return debugger;
	}
	
	public IProblemListener getProblemListener() {
		return problemListener;
	}

	public void pushProblemListener(IProblemListener problemListener) {
		if(problemListeners == null)
			problemListeners = new Stack<>();
		problemListeners.push(this.problemListener);
		this.problemListener = problemListener;
	}

	public void popProblemListener() {
		this.problemListener = problemListeners.pop();
		if(problemListeners.isEmpty())
			problemListeners = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("instances:");
		sb.append(instances);
		sb.append(",values:");
		sb.append(values);
		if(this!=globals) {
			sb.append(",globals:");
			sb.append(globals);
		}
		sb.append(",calling:");
		sb.append(calling);
		sb.append(",parent:");
		sb.append(parent);
		sb.append(",declarations:");
		sb.append(declarations);
		sb.append("}");
		return sb.toString();
	}
	
	@Override
	public Context getCallingContext() {
		return calling;
	}

	public InstanceContext getClosestInstanceContext() {
		if(parent==null)
			return null;
		else
			return parent.getClosestInstanceContext();
	}
	
	public Context getParentMostContext() {
		if(parent==null)
			return this;
		else
			return parent.getParentMostContext();
	}

	public Context getParentContext() {
		return parent;
	}
	
	public void setParentContext(Context parent) {
		this.parent = parent;
	}
	
	public boolean isChildOf(Context context) {
		return context==this.parent || (this.parent!=null && this.parent.isChildOf(context));
	}

	public boolean isWithResourceContext() {
		return parent!=null && parent!=this && parent.isWithResourceContext();
	}

	public Context newResourceContext() {
		Context context = new ResourceContext();
		context.globals = this.globals;
		context.calling = this.calling;
		context.parent = this;
		context.debugger = this.debugger;
		context.problemListener = this.problemListener;
		return context;
	}
	
	public Context newLocalContext() {
		Context context = new Context();
		context.globals = this.globals;
		context.calling = this;
		context.parent = null;
		context.debugger = this.debugger;
		context.problemListener = this.problemListener;
		return context;
	}
	
	public Context newBuiltInContext(IValue value) {
		return initInstanceContext(new BuiltInContext(value), false);
	}

	public Context newBuiltInContext(NativeType type) {
		return initInstanceContext(new BuiltInContext(type), false);
	}

	public Context newInstanceContext(IInstance instance, boolean isChild) {
		InstanceContext context = initInstanceContext(new InstanceContext(instance), isChild);
		CategoryDeclaration decl = context.getDeclaration();
		if(decl!=null)
			decl.processAnnotations(context, true);
		return context;
	}
	
	public InstanceContext newInstanceContext(CategoryType type, boolean isChild) {
		InstanceContext context = initInstanceContext(new InstanceContext(type), isChild);
		CategoryDeclaration decl = context.getDeclaration();
		if(decl!=null)
			decl.processAnnotations(context, true);
		return context;
	}
	
	public Context newDocumentContext(boolean isChild) {
		return initInstanceContext(new DocumentContext(null), isChild);
	}

	public Context newDocumentContext(DocumentValue document, boolean isChild) {
		return initInstanceContext(new DocumentContext(document), isChild);
	}

	public Context newClosureContext(MethodType type) {
		return initInstanceContext(new ClosureContext(type), true);
	}

	// TODO remove this method
	public Context newMemberContext(CategoryType type) {
		return newInstanceContext(type, false).newChildContext();
	}


	private <T extends Context> T initInstanceContext(T context, boolean isChild) {
		context.globals = this.globals;
		context.calling = isChild ? this.calling : this;
		context.parent = isChild ? this : null;
		context.debugger = this.debugger;
		context.problemListener = this.problemListener;
		return context;
	}

	public Context newChildContext() {
		Context context = new Context();
		context.globals = this.globals;
		context.calling = this.calling;
		context.parent = this;
		context.debugger = this.debugger;
		context.problemListener = this.problemListener;
		return context;
	}

	public boolean isEmpty() {
		if(globals!=this)
			return globals.isEmpty();
		return declarations.isEmpty() 
				&& tests.isEmpty()
				&& instances.isEmpty()
				&& values.isEmpty();
	}
	
	public void unregister(String path) {
		unregisterDeclarations(path);
		unregisterValues(path);
		unregisterTests(path);
	}
	
	private void unregisterValues(String path) {
		List<Identifier> toRemove = new ArrayList<Identifier>();
		for(Identifier id : instances.keySet()) {
			if(path.equals(id.getSection().getPath()))
				toRemove.add(id);
		}
		for(Identifier id : toRemove) {
			instances.remove(id);
			values.remove(id);
		}
	}

	private void unregisterTests(String path) {
		List<TestMethodDeclaration> toRemove = new ArrayList<TestMethodDeclaration>();
		for(TestMethodDeclaration decl : tests.values()) {
			if(path.equals(decl.getSection().getPath()))
				toRemove.add(decl);
		}
		for(TestMethodDeclaration decl : toRemove)
			tests.remove(decl.getId());
	}

	private void unregisterDeclarations(String path) {
		List<IDeclaration> toRemove = new ArrayList<IDeclaration>();
		for(IDeclaration decl : declarations.values()) {
			if(path.equals(decl.getSection().getPath()))
				toRemove.add(decl);
			else if(decl instanceof MethodDeclarationMap)
				((MethodDeclarationMap)decl).unregister(path);
		}
		for(IDeclaration decl : toRemove) {
			declarations.remove(decl.getId());
			if(decl instanceof NativeCategoryDeclaration) {
				Class<?> klass = ((NativeCategoryDeclaration)decl).getBoundClass(false);
				if(klass!=null)
					nativeBindings.remove(klass);
			}
		}
	}
	
	public AttributeDeclaration findAttribute(String name) {
		return getRegisteredDeclaration(AttributeDeclaration.class, new Identifier(name));
	}
	
	public PromptoList<AttributeDeclaration> getAllAttributes() {
		if(globals!=this)
			return globals.getAllAttributes();
		// TODO fetch them from store 
		// ICodeStore.getInstance().fetchAllAttributes()
		return declarations.values().stream()
				.filter(decl -> decl instanceof AttributeDeclaration)
				.map(decl -> (AttributeDeclaration)decl)
				.collect(CollectionUtils.toPromptoList());
	}

	public INamed getRegistered(Identifier name) {
		// resolve upwards, since local names override global ones
		INamed actual = declarations.get(name);
		if(actual!=null)
			return actual;
		actual = instances.get(name);
		if(actual!=null)
			return actual;
		if(parent!=null)
			return parent.getRegistered(name);
		if(globals!=this)
			return globals.getRegistered(name);
		return null;	
	}
	
	public <T extends IDeclaration> T getLocalDeclaration(Class<T> klass, Identifier id) {
		IDeclaration actual = declarations.get(id);
		if(actual!=null)
			return ObjectUtils.downcast(klass, actual);
		else if(parent!=null)
			return parent.getLocalDeclaration(klass, id);
		else
			return null;
	}

	public <T extends IDeclaration> T getRegisteredDeclaration(Class<T> klass, Identifier id) {
		return getRegisteredDeclaration(klass, id, true);
	}
	
	public <T extends IDeclaration> T getRegisteredDeclaration(Class<T> klass, Identifier id, boolean lookInStore) {
		// resolve upwards, since local names override global ones
		IDeclaration actual = declarations.get(id);
		if(actual!=null)
			return ObjectUtils.downcast(klass, actual);
		else if(parent!=null)
			actual = parent.getRegisteredDeclaration(klass, id, lookInStore);
		if(actual!=null)
			return ObjectUtils.downcast(klass, actual);
		else if(globals!=this)
			actual = globals.getRegisteredDeclaration(klass, id, lookInStore);
		if(actual!=null)
			return ObjectUtils.downcast(klass, actual);
		else if(lookInStore && globals==this)
			actual = fetchAndRegisterDeclaration(id);
		if(actual!=null)
			return ObjectUtils.downcast(klass, actual);
		else
			return null;
	}
	
	public Iterable<IDeclaration> getRegisteredDeclarationsWithAnnotations(String ... annotations) {
		ICodeStore store = ICodeStore.getInstance();
		if(store==null)
			return Collections.emptyList();
		else {
			Set<String> set = new HashSet<>(Arrays.asList(annotations));
			return store.fetchDeclarationsWithAnnotations(set);
		}
	}


	public Symbol getRegisteredSymbol(Identifier id, boolean lookInStore) {
		Symbol symbol = getRegisteredValue(Symbol.class, id);
		if(symbol!=null || !lookInStore)
			return symbol;
		if(globals!=this)
			return globals.getRegisteredSymbol(id, lookInStore);
		else if(lookInStore)
			return fetchAndRegisterSymbol(id);
		else
			return null;
	}

	private Symbol fetchAndRegisterSymbol(Identifier id) {
		ICodeStore store = ICodeStore.getInstance();
		if(store==null)
			return null;
		// fetch and register atomically
		synchronized(this) {
			Symbol symbol = getRegisteredValue(Symbol.class, id); // may have happened in another thread
			if(symbol!=null)
				return symbol;
			try {
				IDeclaration decl = store.fetchLatestSymbol(id.toString());
				if(decl==null)
					return null;
				decl.register(this);
				return getRegisteredValue(Symbol.class, id);
			} catch(PromptoError e) {
				throw new RuntimeException(e); // TODO define a strategy
			}
		}
	}
	
	public void fetchAndRegisterAllDeclarations() {
		ICodeStore store = ICodeStore.getInstance();
		if(store==null)
			return;
		synchronized(this) {
			Collection<String> names = store.fetchDeclarationNames();
			names.stream()
				.map(Identifier::new)
				.forEach(this::fetchAndRegisterDeclaration);
		}		
	}

	private IDeclaration fetchAndRegisterDeclaration(Identifier id) {
		ICodeStore store = ICodeStore.getInstance();
		if(store==null)
			return null;
		// fetch and register atomically
		synchronized(this) {
			IDeclaration decl = declarations.get(id); // may have happened in another thread
			if(decl!=null)
				return decl;
			try {
				Iterable<IDeclaration> decls = store.fetchLatestDeclarations(id.toString());
				if(decls==null)
					return null;
				// register prototypes locally first to avoid partial resolution 
				// in multi-thread scenarios (such as servlet queries)
				MethodDeclarationMap map = new MethodDeclarationMap(id);
				decls.forEach(decl2 -> {
					if(decl2 instanceof IMethodDeclaration)
						map.register((IMethodDeclaration)decl2, this, false);
					else
						decl2.register(this);
				});
				if(map.size()>0) {
					registerDeclaration(map);
				}
				return declarations.get(id);
			} catch(PromptoError e) {
				throw new RuntimeException(e); // TODO define a strategy
			}
		}
	}
	
	public void registerDeclaration(IDeclaration declaration) {
		if(checkDuplicateDeclaration(declaration))
			declarations.put(declaration.getId(), declaration);
	}

	private boolean checkDuplicateDeclaration(IDeclaration declaration) {
		IDeclaration current = getRegisteredDeclaration(IDeclaration.class, declaration.getId(), false);
		if(current!=null && current!=declaration)
			problemListener.reportDuplicate(declaration, declaration.getId().toString(), current.getId());
		return current==null;
	}

	public void registerDeclaration(IMethodDeclaration declaration) {
		MethodDeclarationMap current = checkDuplicate(declaration);
		if(current==null) {
			current = new MethodDeclarationMap(declaration.getId());
			declarations.put(declaration.getId(), (MethodDeclarationMap)current);
		}
		current.register(declaration, this, false);
	}
	
	public void registerDeclarationIfMissing(IMethodDeclaration declaration) {
		MethodDeclarationMap current = getRegisteredDeclaration(MethodDeclarationMap.class, declaration.getId());
		if(current==null) {
			current = new MethodDeclarationMap(declaration.getId());
			declarations.put(declaration.getId(), (MethodDeclarationMap)current);
		}
		current.registerIfMissing(declaration,this);
	}

	private MethodDeclarationMap checkDuplicate(IMethodDeclaration declaration) {
		INamed current = getRegistered(declaration.getId());
		if(current!=null && !(current instanceof MethodDeclarationMap))
			problemListener.reportDuplicate(declaration, declaration.getId().toString(), (ICodeSection)current);
		return (MethodDeclarationMap)current;
	}

	public void registerDeclaration(TestMethodDeclaration declaration) {
		if(checkDuplicate(declaration))
			tests.put(declaration.getId(), declaration);
	}
	
	private boolean checkDuplicate(TestMethodDeclaration declaration) {
		TestMethodDeclaration current = tests.get(declaration.getId());
		if(current!=null)
			problemListener.reportDuplicate(declaration, declaration.getId().toString(), (ICodeSection)current);
		return current==null;
	}
	
	public Collection<CategoryDeclaration> fetchDerivedCategoryDeclarations(Identifier id) {
		ICodeStore store = ICodeStore.getInstance();
		if(store==null)
			return Collections.emptyList();
		else
			return store.fetchDerivedCategoryDeclarations(id);
		
	}
	
	public static class MethodDeclarationMap extends HashMap<String,IMethodDeclaration> implements IDeclaration {

		private static final long serialVersionUID = 1L;
		
		Identifier id;
		ICodeStore origin;
		
		public MethodDeclarationMap(Identifier id) {
			this.id = id;
		}
		
		@Override
		public Collection<CommentStatement> getComments() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void setComments(Collection<CommentStatement> stmts) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public Collection<Annotation> getLocalAnnotations() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public Collection<Annotation> getAllAnnotations(Context context) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public Stream<Annotation> getAllAnnotationsAsStream(Context context) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAnnotations(Collection<Annotation> annotations) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void addAnnotation(Annotation annotation) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public boolean removeAnnotation(String name) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public boolean hasLocalAnnotation(String name) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public boolean hasAnyLocalAnnotation(Set<String> names) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean hasInheritedAnnotation(Context context, String name) {
			throw new UnsupportedOperationException();
		}

		@Override
		public DeclarationType getDeclarationType() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public ICodeStore getOrigin() {
			return origin;
		}
		
		@Override
		public void setOrigin(ICodeStore origin) {
			this.origin = origin;
		}
		
		public void unregister(String path) {
			List<IMethodDeclaration> toRemove = new ArrayList<IMethodDeclaration>();
			for(IMethodDeclaration decl : this.values()) {
				if(path.equals(decl.getSection().getPath()))
					toRemove.add(decl);
			}
			for(IMethodDeclaration decl : toRemove)
				this.remove(decl.getProto());
		}

		@Override
		public void toDialect(CodeWriter writer) {
			throw new RuntimeException("Should never get there!");
		}
		
		@Override
		public Identifier getId() {
			return id;
		}
		
		@Override
		public IType check(Context context) {
			throw new RuntimeException("Should never get there!");
		}
		
		@Override
		public void register(Context context) {
			throw new RuntimeException("Should never get there!");
		}
		
		public void register(IMethodDeclaration declaration, Context context, boolean override) {
			String proto = declaration.getProto();
			if(this.containsKey(proto) && !override)
				context.getProblemListener().reportDuplicate(declaration, declaration.getId().toString(), this.get(proto));
			else
				this.put(proto, declaration);
		}
		
		public void registerIfMissing(IMethodDeclaration declaration, Context context) {
			String proto = declaration.getProto();
			if(!this.containsKey(proto))
				this.put(proto, declaration);
		}
		
		@Override
		public IType getType(Context context) {
			throw new SyntaxError("Should never get there!");
		}
		
		@Override
		public int computeStartLine() {
			throw new RuntimeException("Should never get there!");
		}

		@Override
		public ICodeSection locateCodeSection(ISection section) {
			return values().stream()
					.map(m->m.locateCodeSection(section))
					.filter(Objects::nonNull)
					.findFirst()
					.orElse(null);
		}
		
		@Override
		public boolean isOrContains(ICodeSection section) {
			throw new RuntimeException("Should never get there!");
		}

		public Collection<IMethodDeclaration> globalConcreteMethods() {
			return values().stream()
					.filter((m)->
						!m.isAbstract())
					.filter((m)->
						m.getMemberOf()==null)
					.collect(Collectors.toList());
		}

		public IMethodDeclaration getFirst() {
			return values().iterator().next();
		}

		@Override
		public ISection getSection() {
			throw new UnsupportedOperationException("Should never get there!");
		}

		@Override
		public void setSection(ISection section) {
			throw new UnsupportedOperationException("Should never get there!");
		}

	}
	
	public <T extends INamed> T getRegisteredValue(Class<T> klass, Identifier name) {
		Context context = contextForValue(name);
		if(context==null)
			return null;
		else
			return context.readRegisteredValue(klass, name);
	}
	
	protected <T extends INamed> T readRegisteredValue(Class<T> klass, Identifier name) {
		INamed actual = instances.get(name);
		if(actual!=null)
			return ObjectUtils.downcast(klass,actual);
		else
			return null;
	}
	
	public void registerValue(INamed value) {
		registerValue(value, true);
	}
	
	public void registerValue(INamed value, boolean checkDuplicate) {
		if(checkDuplicate) {
			// only explore current context
			if(instances.get(value.getId())!=null)
				throw new SyntaxError("Duplicate name: \"" + value.getId() + "\"");
		}
		instances.put(value.getId(), value);
	}
	
	public Stream<INamed> getInstancesStream(boolean includeParent) {
		if(parent==null || !includeParent)
			return instances.values().stream();
		else
			return Stream.concat(parent.getInstancesStream(true), instances.values().stream());
	}

	
	public INamed getInstance(String name, boolean includeParent) {
		return getInstance(new Identifier(name), includeParent);
	}
	

	public INamed getInstance(Identifier id, boolean includeParent) {
		INamed named = (parent==null || !includeParent) ? null : parent.getInstance(id, true);
		return named!=null ? named : instances.get(id);
	}

	public boolean hasValue(Identifier id) {
		return contextForValue(id)!=null;
	}


	public IValue getValue(Identifier id) throws PromptoError {
		return getValue(id, ()->null);
	}
	
	
	public IValue getValue(Identifier id, Supplier<IValue> supplier) throws PromptoError {
		Context context = contextForValue(id);
		if(context==null)
			context = this.globals;
		return context.readValue(id, supplier);
	}
	
	
	protected IValue readValue(Identifier id, Supplier<IValue> supplier) throws PromptoError {
		IValue value = values.get(id);
		if(value==null) {
			value = supplier.get();
			if(value!=null)
				values.put(id, value);
		}
		if(value==null)
			throw new SyntaxError(id + " has no value");
		if(value instanceof LinkedValue)
			return ((LinkedValue)value).getContext().getValue(id);
		else
			return value;
	}
	
	public void setValue(Identifier name, IValue value) throws PromptoError {
		Context context = contextForValue(name);
		if(context==null)
			throw new SyntaxError(name + " is not defined");
		context.writeValue(name, value);
	}
	
	protected void writeValue(Identifier name, IValue value) throws PromptoError {
		value = autocast(name, value);
		IValue current = values.get(name);
		if(current instanceof LinkedValue)
			((LinkedValue)current).getContext().setValue(name, value);
		else
			values.put(name, value);
	}

	private IValue autocast(Identifier id, IValue value) {
		if(value!=null) {
			if(value instanceof ValueExpression)
				value = ((ValueExpression)value).getValue();
			if(value instanceof prompto.value.IntegerValue) {
				INamed actual = instances.get(id);
				if(actual.getType(this)==DecimalType.instance())
					value = new DecimalValue(((prompto.value.IntegerValue)value).doubleValue());
			}
		}
		return value;
	}

	public Context contextForValue(Identifier id) {
		// resolve upwards, since local names override global ones
		INamed actual = instances.get(id);
		if(actual!=null)
			return this;
		if(parent!=null)
			return parent.contextForValue(id);
		if(globals!=this)
			return globals.contextForValue(id);
		return null;
	}
	

	public void enterTest(TestMethodDeclaration test) throws PromptoError {
		if(debugger!=null)
			debugger.enterTest(this, test);
	}

	
	public void enterMethod(IMethodDeclaration method) throws PromptoError {
		if(debugger!=null)
			debugger.enterMethod(this, method);
	}

	
	public void leaveSection(ICodeSection codeSection) throws PromptoError {
		if(debugger!=null)
			debugger.leaveSection(this, codeSection.getSection());
	}

	
	public void enterStatement(IStatement statement) throws PromptoError {
		if(debugger!=null)
			debugger.enterStatement(this, statement.getSection());
	}

	
	public void leaveStatement(IStatement statement) throws PromptoError {
		if(debugger!=null)
			debugger.leaveStatement(this, statement.getSection());
	}

	
	public void notifyCompleted() {
		if(debugger!=null) {
			WorkerCompletedDebugEvent completed = new WorkerCompletedDebugEvent(DebuggedWorker.wrap(Thread.currentThread()));
			debugger.notifyCompleted(completed);
		}
	}

	
	public ConcreteInstance loadSingleton(CategoryType type) throws PromptoError {
		if(this==globals) {
			IValue value = values.get(type.getTypeNameId());
			if(value==null) {
				IDeclaration decl = declarations.get(type.getTypeNameId());
				if(decl==null)
					decl = fetchAndRegisterDeclaration(type.getTypeNameId());
				if(!(decl instanceof SingletonCategoryDeclaration))
					throw new InternalError("No such singleton:" + type.getTypeName());
				value = new ConcreteInstance(this, (ConcreteCategoryDeclaration)decl);
				((IInstance)value).setMutable(true); // a singleton is protected by "with x do", so always mutable in that context
				ConcreteMethodDeclaration method = ((SingletonCategoryDeclaration)decl).getInitializeMethod(this);
				if(method!=null) {
					Context instance = newInstanceContext((IInstance)value, false);
					Context child = instance.newChildContext();
					method.interpret(child);
				}
				values.put(type.getTypeNameId(), value);
			}
			if(value instanceof ConcreteInstance)
				return (ConcreteInstance)value;
			else
				throw new InternalError("Not a concrete instance:" + value.getClass().getSimpleName());
		} else
			return this.globals.loadSingleton(type);
	}

	public boolean hasTests() {
		return tests.size()>0;
	}

	public Collection<TestMethodDeclaration> getTests() {
		if(globals!=this)
			return globals.getTests();
		else
			return tests.values();
	}

	public TestMethodDeclaration getTest(Identifier name, boolean lookInStore) {
		if(globals!=this)
			return globals.getTest(name, lookInStore);
		else {
			IDeclaration test = tests.get(name);
			if(test==null && lookInStore)
				test = fetchAndRegisterTest(name);
			if(test instanceof TestMethodDeclaration)
				return (TestMethodDeclaration)test;
			else
				return null;
		}
	}
	
	private IDeclaration fetchAndRegisterTest(Identifier name) {
		ICodeStore store = ICodeStore.getInstance();
		if(store==null)
			return null;
		// fetch and register atomically
		synchronized(this) {
			IDeclaration decl = tests.get(name); // may have happened in another thread
			if(decl!=null)
				return decl;
			try {
				Iterable<IDeclaration> decls = store.fetchLatestDeclarations(name.toString());
				if(decls==null)
					return null;
				decls.forEach((d) -> {
					if(d instanceof MethodDeclarationMap) {
						MethodDeclarationMap map = (MethodDeclarationMap)d;
						for(Map.Entry<String, IMethodDeclaration> entry : map.entrySet())
							entry.getValue().register(this);
					} else
						d.register(this);
				});
				return tests.get(name);
			} catch(PromptoError e) {
				throw new RuntimeException(e); // TODO define a strategy
			}
		}
	}
	
	
	@Override
	public ICodeSection locateCodeSection(ISection section) {
		if(globals!=this)
			return globals.locateCodeSection(section);
		else {
			String path = section.getPath();
			if(path.startsWith("store:/")) 
				return locateStoreCodeSection(section);
			else
				return locateFileCodeSection(section, declarations.values());
		}
	}
	
	ICodeSection locateStoreCodeSection(ISection section) {
		IDeclaration declaration = locateStoreDeclarationAtPath(section.getPath());
		if(declaration==null)
			return null;
		else {
			Section converted = new Section(section);
			converted.setPath(declaration.getSection().getPath());
			return locateFileCodeSection(converted, Collections.singletonList(declaration));
		}
	}

	private IDeclaration locateStoreDeclarationAtPath(String path) {
		path = path.substring("store:/".length());
		int idx = path.indexOf("/");
		String type = path.substring(0, idx);
		String name = path.substring(idx + 1);
		switch(type) {
		case "test":
			return getTest(new Identifier(name), true);
		case "category":
			return getRegisteredDeclaration(CategoryDeclaration.class, new Identifier(name), true);
		case "method":
			{
				idx = name.indexOf("/");
				String proto = name.substring(idx + 1);
				name = name.substring(0, idx);
				MethodDeclarationMap methods = getRegisteredDeclaration(MethodDeclarationMap.class, new Identifier(name), true);
				if(methods==null)
					return null;
				else
					return methods.get(proto);
			}
		default:
			return getRegisteredDeclaration(IDeclaration.class, new Identifier(name), true);
			
		}
	}

	ICodeSection locateFileCodeSection(ISection section, Collection<IDeclaration> declarations) {
		ICodeSection result = SectionLocator.locateCodeSection(declarations, section);
		if(result!=null) 
			return result;
		ICodeStore store = ICodeStore.getInstance();
		if(store!=null)
			return store.findCodeSection(section);
		else
			return null;
	}


	public void registerNativeBinding(Type type, NativeCategoryDeclaration declaration) {
		if(this==globals)
			nativeBindings.put(type, declaration);
		else
			globals.registerNativeBinding(type, declaration);
	}
	
	public NativeCategoryDeclaration getNativeBinding(Type type) {
		if(this==globals) {
			if(!nativeBindings.containsKey(type))
				loadNativeBindingFromStore(type);
			return nativeBindings.get(type);
		} else
			return globals.getNativeBinding(type);
	}
	
	private void loadNativeBindingFromStore(Type type) {
		if(ICodeStore.getInstance()!=null) {
			NativeCategoryDeclaration decl = ICodeStore.getInstance().fetchLatestNativeCategoryDeclarationWithJavaBinding(type.getTypeName());
			if(decl!=null)
				decl.register(this);
		}
	}

	public String fetchTextResource(String path) {
		Resource resource = ICodeStore.getInstance().fetchLatestResource(path);
		if(resource==null)
			return null;
		else if(resource instanceof TextResource)
			return ((TextResource)resource).getBody();
		else
			return "Not a Text resource: " + path; // TODO raise exception
	}

	public PromptoBinary fetchBinaryResource(String path) {
		Resource resource = ICodeStore.getInstance().fetchLatestResource(path);
		if(resource==null)
			return null;
		else if(resource instanceof BinaryResource)
			return ((BinaryResource)resource).getData();
		else
			return null; // TODO raise exception
	}
	
	public static class ResourceContext extends Context {
		
		ResourceContext() {
		}
		
		public boolean isWithResourceContext() {
			return true;
		}

	}

	public static class DocumentContext extends Context {
		
		DocumentValue document;
		
		DocumentContext(DocumentValue document) {
			this.document = document;
		}
		
		public DocumentValue getDocument() {
			return document;
		}
		
		@Override
		public Context contextForValue(Identifier name) {
			// params and variables have precedence over members
			// so first look in context values
			Context context = super.contextForValue(name);
			if(context!=null)
				return context;
			// since any name is valid in the context of a document
			// simply return this document context
			else 
				return this;
		}

		@Override
		protected IValue readValue(Identifier name, Supplier<IValue> supplier) throws PromptoError {
			return document.getMember(calling, name, false);
		}
		
		@Override
		protected void writeValue(Identifier name, IValue value) throws PromptoError {
			document.setMember(calling, name, value);
		}

	}
	
	public static class BuiltInContext extends Context {
		
		IValue value;
		NativeType type;
		
		public BuiltInContext(IValue value) {
			this.value = value;
			this.type = (NativeType)value.getType();
		}
		
		public BuiltInContext(NativeType type) {
			this.type = type;
		}

		public IValue getValue() {
			return value;
		}
	}
	
	public static class InstanceContext extends Context {
		
		CategoryDeclaration declaration;
		IInstance instance;
		IType type;
		Map<Identifier, WidgetField> widgetFields; // only used for widgets at this point
		
		InstanceContext(IInstance instance) {
			this(instance.getType());
			this.instance = instance;
		}
		
		InstanceContext(IType type) {
			this.type = type;
		}
		
		@Override
		public InstanceContext getClosestInstanceContext() {
			return this;
		}

		public IInstance getInstance() {
			return instance;
		}
		
		public IType getInstanceType() {
			return type!=null ? type : instance.getType();
		}
		
		@Override
		public INamed getRegistered(Identifier id) {
			if(widgetFields!=null) {
				WidgetField field = widgetFields.get(id);
				if(field!=null)
					return field;
			}
			INamed actual = super.getRegistered(id);
			if(actual!=null) 
				return actual;
			CategoryDeclaration decl = getDeclaration();
			MethodDeclarationMap methods = decl.getMemberMethods(this, id, true);
			if(methods!=null && !methods.isEmpty())
				return methods;
			else if(decl.hasAttribute(this, id))
				return getRegisteredDeclaration(AttributeDeclaration.class, id);
			else
				return null;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public <T extends IDeclaration> T getRegisteredDeclaration(Class<T> klass, Identifier id, boolean lookInStore) {
			if(klass==MethodDeclarationMap.class) {
				CategoryDeclaration decl = getDeclaration();
				if(decl!=null) {
					MethodDeclarationMap methods = decl.getMemberMethods(this, id, true);
					if(methods!=null && !methods.isEmpty())
						return (T)methods;
				}
			}
			return super.getRegisteredDeclaration(klass, id, lookInStore);
		}
		
		@Override
		public Iterable<IDeclaration> getRegisteredDeclarationsWithAnnotations(String... annotations) {
			return Collections.emptyList();
		}
		
		
		@Override
		protected <T extends INamed> T readRegisteredValue(Class<T> klass, Identifier name) {
			INamed actual = instances.get(name);
			// not very pure, but avoids a lot of complexity when registering a value
			if(actual==null) {
				AttributeDeclaration attr = getRegisteredDeclaration(AttributeDeclaration.class, name);
				if(attr!=null) {
					IType type = attr.getType();
					actual = new Variable(name, type);
					instances.put(name, actual);
				}
			}
			return ObjectUtils.downcast(klass,actual);
		}
		
		@Override
		public Context contextForValue(Identifier id) {
			if("this".equals(id.toString()))
				return this;
			else if(widgetFields!=null && widgetFields.containsKey(id))
				return this;
			// params and variables have precedence over members
			// so first look in context values, ignoring members
			Context context = super.contextForValue(id);
			if(context!=null) 
				return context;
			CategoryDeclaration decl = getDeclaration();
			if(decl==null)
				return null; // happens during registration of native add-ons
			else if(decl.hasAttribute(this, id) || decl.hasMethod(this, id))
				return this;
			else
				return null;
		}
		
		Context superContextForValue(Identifier name) {
			return super.contextForValue(name);
		}
		
		public CategoryDeclaration getDeclaration() {
			if(declaration==null) {
				if(instance!=null)
					declaration = instance.getDeclaration();
				else
					declaration = getRegisteredDeclaration(ConcreteCategoryDeclaration.class, type.getTypeNameId());
			}
			return declaration;
		}

		@Override
		protected IValue readValue(Identifier name, Supplier<IValue> supplier) throws PromptoError {
			if("this".equals(name.toString()))
				return instance;
			CategoryDeclaration decl = getDeclaration();
			if(decl.hasAttribute(this, name)) {
				IValue value = instance.getMember(calling, name, false);
				return value!=null ? value : supplier.get();
			} else if (decl.hasMethod(this, name)) {
				IMethodDeclaration method = decl.getMemberMethods(this, name, false).getFirst();
				MethodType type = new MethodType(method);
				return new ClosureValue(this, type);
		
			} else
				return supplier.get();
		}
		
		@Override
		protected void writeValue(Identifier name, IValue value) throws PromptoError {
			instance.setMember(calling, name, value);
		}
		
		
		@Override
		public Stream<INamed> getInstancesStream(boolean includeParent) {
			// TODO include widgetFields ? (not required qt this point)
			return Stream.concat(Stream.of(new Variable(new Identifier("this"), instance.getType())), super.getInstancesStream(includeParent));
		}
		
		@Override
		public INamed getInstance(Identifier name, boolean includeParent) {
			if("this".equals(name.toString()))
				return new Variable(new Identifier("this"), instance.getType());
			else
				return super.getInstance(name, includeParent);
		}

		public void registerWidgetField(Identifier identifier, IType type, Object createdBy) {
			if(widgetFields==null)
				widgetFields = new HashMap<>();
			WidgetField widgetField = widgetFields.get(identifier);
			if(widgetField!=null) {
				// we control reentrance by registering which processor created the widgetField 
				if(widgetField.createdBy == createdBy)
					return;
				Identifier existing = widgetFields.keySet().stream().filter(id->id.equals(identifier)).findFirst().orElse(null);
				getProblemListener().reportDuplicate(identifier, identifier.toString(), existing);
			} else 
				widgetFields.put(identifier, new WidgetField(identifier, type, createdBy));
		}

		public void overrideWidgetFieldType(Identifier identifier, IType type, Object updatedBy) {
			WidgetField widgetField = widgetFields==null ? null : widgetFields.get(identifier);
			if(widgetField==null ) {
				getProblemListener().reportUnknownIdentifier(identifier, identifier.toString());
			} else {
				widgetField.type = type;
				widgetField.updatedBy = updatedBy; 
			}
		}

	}

	public static class ClosureContext extends InstanceContext {

		public ClosureContext(MethodType type) {
			super(type);
		}
		
		@Override
		public Context contextForValue(Identifier name) {
			return superContextForValue(name);
		}
		
		@Override
		public InstanceContext getClosestInstanceContext() {
			return parent.getClosestInstanceContext();
		}
		
	}


}
