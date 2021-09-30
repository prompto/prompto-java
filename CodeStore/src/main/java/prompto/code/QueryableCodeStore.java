package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IDeclaration.DeclarationType;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.expression.Symbol;
import prompto.grammar.Annotation;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.type.CategoryType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Logger;
import prompto.utils.StringUtils;


public class QueryableCodeStore extends BaseCodeStore {

	static final Logger logger = new Logger();
	
	IStore store; // data store where to store/fetch the code
	String application;
	PromptoVersion version;
	// fetching and storing declarations requires a context holding code store attributes
	// some of these are code store specific and should not be looked for in the app context
	Context context; 
	// storing resource code is optional
	boolean storeExternals = false;
	
	public QueryableCodeStore(IStore store, ICodeStore runtime, String application, PromptoVersion version, URL[] addOns, URL ...resourceNames) throws PromptoError {
		super(null);
		this.store = store;
		this.application = application;
		this.version = version;
		this.context = CodeStoreBootstrapper.bootstrap(store, runtime);
		this.next = AppStoreBootstrapper.bootstrap(store, runtime, application, version, addOns, resourceNames);
	}
	
	public IStore getStore() {
		return store;
	}
	
	public void setStore(IStore store) {
		this.store = store;
	}
	
	public void collectStorables(List<IStorable> list, IDeclaration declaration, Dialect dialect, PromptoVersion version, Object moduleId) {
		if(declaration instanceof MethodDeclarationMap) {
			for(IDeclaration method : ((MethodDeclarationMap)declaration).values())
				collectStorables(list, method, dialect, version, moduleId);
		} else {
			String typeName = StringUtils.capitalizeFirst(declaration.getDeclarationType().name()) + "Declaration";
			List<String> categories = Arrays.asList("Resource", "NamedResource", "Declaration", typeName);
			IStorable storable = populateDeclarationStorable(categories, declaration, dialect, version, moduleId);
			list.add(storable);
		}
	}

	@Override
	public ModuleType getModuleType() {
		return ModuleType.WEBSITE;
	}
	
	@Override
	public Dialect getModuleDialect() {
		return null;
	}
	
	@Override
	public String getModuleName() {
		return application;
	}
	
	@Override
	public PromptoVersion getModuleVersion() {
		return version;
	}
	
	@Override
	public void storeResource(Resource resource, Object moduleId) {
		IStorable storable = resource.toStorable(store);
		if(moduleId!=null)
			storable.setData("module", moduleId);
		store.store(null, Collections.singletonList(storable));
	}
	
	@Override
	public void storeModule(Module module) throws PromptoError {
		Context context = Context.newGlobalsContext();
		List<IStorable> storables = new ArrayList<>();
		module.collectStorables(context, store, storables);
		store.store(null, storables);
	}

	@Override
	public void storeDependency(Dependency dependency) {
		Context context = Context.newGlobalsContext();
		List<IStorable> storables = new ArrayList<>();
		dependency.collectStorables(context, store, storables);
		store.store(null, storables);
	}
	
	@Override
	public void dropModule(Module module) {
		IQueryBuilder builder = store.newQueryBuilder();
		builder.verify(AttributeInfo.MODULE, MatchOp.HAS, module.getDbId());
		Iterable<IStored> stuff = store.fetchMany(builder.build());
		Stream<Object> stuffDbIds = StreamSupport.stream(stuff.spliterator(), false)
				.map(IStored::getDbId);
		List<Object> dbIds = Stream.concat(Stream.of(module.getDbId()), stuffDbIds)
					.collect(Collectors.toList());
		store.delete(dbIds);
	}
	
	private Object storeDeclarationModule(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		List<String> categories = Arrays.asList("Module", origin.getModuleType().getCategory().getTypeName());
		IStorable storable = store.newStorable(categories, null);
		storable.setData("name", origin.getModuleName());
		storable.setData("version", origin.getModuleVersion());
		store.store(storable);
		return storable.getOrCreateDbId();
	}

	@Override
	public Iterable<Module> fetchAllModules() throws PromptoError {
		try {
			IQueryBuilder builder = store.newQueryBuilder();
			builder.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "Module");
			Iterator<IStored> iterator = store.fetchMany(builder.build()).iterator();
			return () -> new Iterator<Module>() {

				@Override
				public boolean hasNext() {
					return iterator.hasNext();
				}

				@Override
				public Module next() {
					try {
						return moduleFromStored(iterator.next());
					} catch(Exception e) {
						throw new InternalError(e);
					}
				}
			};
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Module> T fetchVersionedModule(ModuleType type, String name, PromptoVersion version) throws PromptoError {
		try {
			IStored stored = fetchOneNamedInStore(type.getCategory(), version, name, false);
			if(stored==null)
				return null;
			Module module = type.getModuleClass().newInstance();
			module.fromStored(store, stored);
			return (T)module;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public Module fetchModule(String name, PromptoVersion version) throws PromptoError {
		try {
			IStored stored = fetchOneNamedInStore(new CategoryType(new Identifier("Module")), version, name, false);
			return moduleFromStored(stored);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private Module moduleFromStored(IStored stored) throws Exception {
		if(stored==null)
			return null;
		String[] categories = stored.getCategories();
		String category = categories[categories.length-1];
		ModuleType type = ModuleType.valueOf(category.toUpperCase());
		Module module = type.getModuleClass().newInstance();
		module.fromStored(store, stored);
		return module;
	}

	@Override
	public Object fetchVersionedModuleDbId(String name, PromptoVersion version) throws PromptoError {
		try {
			// could be optimized by only fetching dbId but not worth it...
			IStored stored = fetchOneNamedInStore(new CategoryType(new Identifier("Module")), version, name, false);
			return stored==null ? null : stored.getDbId();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	@Override
	public Resource fetchVersionedResource(String name, PromptoVersion version) {
		try {
			IStored stored = fetchOneInStore(new CategoryType(new Identifier("Resource")), version, "name", name, true);
			if(stored==null)
				return null;
			return ResourceReader.readResource(stored);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	protected void doFetchLatestResourcesWithMimeTypes(List<Resource> resources, Set<String> mimeTypes) {
		IStoredIterable found = fetchManyInStore(new CategoryType(new Identifier("Resource")), PromptoVersion.LATEST, "mimeType", mimeTypes, true);
		found.forEach(stored -> resources.add(ResourceReader.readResource(stored)));
	}

	
	static ThreadLocal<Map<String, Iterable<IDeclaration>>> registering = new ThreadLocal<Map<String, Iterable<IDeclaration>>>() {
		@Override protected Map<String, Iterable<IDeclaration>> initialValue() {
	        return new HashMap<>();
	    }
	};
	
	
	@SuppressWarnings("unchecked")
	private IDeclaration getRegisteringSymbol(String name) {
		return registering.get().values().stream()
				.map(i->StreamSupport.stream(i.spliterator(), false))
				.flatMap(Function.identity())
				.filter(d->d instanceof IEnumeratedDeclaration)
				.map(d->(IEnumeratedDeclaration<Symbol>)d)
				.filter(e->e.hasSymbol(name))
				.findFirst()
				.orElse(null);
	}


	private Iterable<IDeclaration> getRegisteringDeclarations(String name) {
		return registering.get().get(name);
	}
	
	private void setRegisteringDeclarations(String name, Iterable<IDeclaration> decl) {
		registering.get().put(name, decl);
	}

	private void clearRegisteringDeclarations(String name) {
		registering.get().remove(name);
	}

	@Override
	public Collection<String> fetchDeclarationNames() {
		// TODO Auto-generated method stub
		return super.fetchDeclarationNames();
	}
	
	@Override
	public Iterable<IDeclaration> fetchVersionedDeclarations(String name, PromptoVersion version) throws PromptoError {
		Iterable<IDeclaration> decls = fetchDeclarationsInStore(name, version);
		if(decls!=null)
			return decls;
		if(storeExternals)
			return fetchAndStoreExternalSpecificDeclarations(name, version);
		else
			return super.fetchVersionedDeclarations(name, version);
	}
	
	@Override
	public Iterable<IDeclaration> fetchDeclarationsWithAnnotations(Set<String> annotations) {
		Iterator<IStored> fetched = fetchDeclarationsWithAnnotationsInStore(annotations).iterator();
		Iterable<IDeclaration> parsed = () -> new Iterator<IDeclaration>() {
			@Override public boolean hasNext() { return fetched.hasNext(); }
			@Override public IDeclaration next() { return parseDeclaration(fetched.next()); }
		};
		if(next==null)
			return parsed;
		else {
			Iterable<IDeclaration> decls = next.fetchDeclarationsWithAnnotations(annotations);
			return Stream.concat(StreamSupport.stream(decls.spliterator(), false), StreamSupport.stream(parsed.spliterator(), false)).collect(Collectors.toList());
		}
	}
	
	private synchronized Iterable<IDeclaration> fetchAndStoreExternalSpecificDeclarations(String name, PromptoVersion version2) {
		// when called from the AppServer, multiple threads may be attempting to do this
		// TODO: need to deal with multiple cloud nodes doing this
		synchronized(this) {
			Iterable<IDeclaration> decls = fetchDeclarationsInStore(name, version);
			if(decls!=null)
				return decls;
			decls = getRegisteringDeclarations(name);
			if(decls!=null)
				return decls;
			decls = super.fetchVersionedDeclarations(name, version);
			if(store!=null && decls!=null && decls.iterator().hasNext()) {
				// avoid infinite reentrance loop
				setRegisteringDeclarations(name, decls);
				decls = storeDeclarations(decls);
				clearRegisteringDeclarations(name);
				store.flush();
			}
			return decls;
		}
	}
	
	@Override
	public IDeclaration fetchVersionedSymbol(String name, PromptoVersion version) throws PromptoError {
		Iterable<IDeclaration> decls = fetchSymbolsInStore(name, version, true);
		if(decls!=null && decls.iterator().hasNext())
			return decls.iterator().next();
		if(storeExternals)
			return fetchAndStoreExternalSpecificSymbol(name, version);
		else
			return super.fetchVersionedSymbol(name, version);
	}
	
	
	private synchronized IDeclaration fetchAndStoreExternalSpecificSymbol(String name, PromptoVersion version) {
		// when called from the AppServer, multiple threads may be attempting to do this
		// TODO: need to deal with multiple cloud nodes doing this
		synchronized(this) {
			Iterable<IDeclaration> decls = fetchSymbolsInStore(name, version, true);
			if(decls!=null && decls.iterator().hasNext())
				return decls.iterator().next();
			IDeclaration decl = getRegisteringSymbol(name);
			if(decl==null) {
				decl = super.fetchVersionedSymbol(name, version);
				if(store!=null && decl!=null) {
					setRegisteringDeclarations(decl.getName(), Collections.singletonList(decl));
					decls = storeDeclarations(Collections.singletonList(decl));
					clearRegisteringDeclarations(decl.getName());
					store.flush();
					decl = decls.iterator().next();
				}
			}
			return decl;
		}
	}

	private Iterable<IDeclaration> fetchSymbolsInStore(String name, PromptoVersion version, boolean filterOnModules) {
		IStoredIterable iterable = fetchStoredDeclarationsBySymbol(name, version, filterOnModules);
		if(iterable.iterator().hasNext()) {
			Iterator<IStored> iterator = iterable.iterator();
			return () -> new Iterator<IDeclaration>() {
				@Override public boolean hasNext() { return iterator.hasNext(); }
				@Override public IDeclaration next() { return parseDeclaration(iterator.next()); }
			};
		} else
			return null;
	}

	private IStoredIterable fetchStoredDeclarationsBySymbol(String name, PromptoVersion version, boolean filterOnModules) {
		IQueryBuilder builder = store.newQueryBuilder()
				.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "EnumeratedDeclaration")
				.verify(AttributeInfo.SYMBOLS, MatchOp.HAS, name)
				.and();
		builder = filterOnModules(builder, filterOnModules);
		if(PromptoVersion.LATEST.equals(version)) {
			IdentifierList names = IdentifierList.parse("prototype,version");
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			orderBy.interpretQuery(context, builder);
			IStoredIterable stored = store.fetchMany(builder.build());
			return fetchDistinct(stored);
		} else
			return store.fetchMany(builder.build()); 
	}

	private IQueryBuilder filterOnModules(IQueryBuilder builder, boolean filterOnModules) {
		if(!filterOnModules || ICodeStore.getModuleDbIds().isEmpty())
			return builder;
		AttributeInfo info = new AttributeInfo("module", Family.CATEGORY, false, null);
		builder.verify(info, MatchOp.IN, ICodeStore.getModuleDbIds());
		return builder.and();
	}
	
	
	@Override
	public Collection<CategoryDeclaration> fetchDerivedCategoryDeclarations(Identifier id) {
		IQueryBuilder builder = store.newQueryBuilder()
				.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "CategoryDeclaration")
				.verify(AttributeInfo.DERIVED_FROM, MatchOp.HAS, id.toString())
				.and();
		builder = filterOnModules(builder, true);
		IdentifierList names = IdentifierList.parse("version");
		OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
		orderBy.interpretQuery(context, builder);
		IStoredIterable stored = store.fetchMany(builder.build());
		IStoredIterable distinct = fetchDistinct(stored);
		return StreamSupport.stream(distinct.spliterator(), false)
				.map(s->parseDeclaration(s))
				.filter(d->d instanceof CategoryDeclaration)
				.map(d->(CategoryDeclaration)d)
				.collect(Collectors.toList());
	}

	private Iterable<IDeclaration> storeDeclarations(Iterable<IDeclaration> decls) throws PromptoError {
		Iterator<IDeclaration> iter = decls.iterator();
		if(!iter.hasNext())
			return null;
		// need module id
		IDeclaration decl = iter.next();
		ICodeStore origin = decl.getOrigin();
		if(origin==null)
			throw new InternalError("Cannot store declaration with no origin!");
		Object moduleId = fetchDeclarationModuleDbId(decl);
		if(moduleId==null)
			moduleId = storeDeclarationModule(decl);
		storeDeclarations(decls, origin.getModuleDialect(), origin.getModuleVersion(), moduleId);
		return decls;
	}


	@Override
	public void storeDeclarations(Iterable<IDeclaration> declarations, Dialect dialect, PromptoVersion version, Object moduleId) throws PromptoError {
		List<IStorable> list = new ArrayList<>();
		declarations.forEach((decl)->
			collectStorables(list, decl, dialect, version, moduleId));
		store.store(null, list);
	}
	
	private Object fetchDeclarationModuleDbId(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		IStored stored = fetchOneNamedInStore(origin.getModuleType().getCategory(), origin.getModuleVersion(), origin.getModuleName(), false);
		if(stored==null)
			return null;
		else
			return stored.getDbId();
	}

	private IStorable populateDeclarationStorable(List<String> categories, IDeclaration decl, Dialect dialect, PromptoVersion version, Object moduleId) {
		IStorable storable = store.newStorable(categories, null); 
		try {
			storable.setData("name", decl.getId().toString());
			storable.setData("version", version);
			if(decl instanceof IMethodDeclaration) {
				String proto = ((IMethodDeclaration)decl).getProto();
				storable.setData("prototype", proto);
			}
			storable.setData("dialect", dialect.name());
			CodeWriter writer = new CodeWriter(dialect, context);
			decl.toDialect(writer);
			String content = writer.toString();
			storable.setData("body", content);
			storable.setData("module",  moduleId);
			if(decl instanceof IEnumeratedDeclaration) {
				@SuppressWarnings("unchecked")
				List<String> symbols = ((IEnumeratedDeclaration<Symbol>)decl).getSymbolsList().stream()
						.map(Symbol::getName)
						.collect(Collectors.toList());
				storable.setData("symbols",  symbols);
			}
			if(decl.isStorable(null))
				storable.setData("storable", true);
			Collection<Annotation> annotations = decl.getLocalAnnotations();
			if(annotations!=null && !annotations.isEmpty()) {
				List<String> data = annotations.stream().map(Annotation::toString).collect(Collectors.toList());
				storable.setData("annotations", data);
			}	
			return storable;
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	
	private Iterable<IDeclaration> fetchDeclarationsInStore(String name, PromptoVersion version) {
		if(store==null)
			return null;
		else try {
			CategoryType category = new CategoryType(new Identifier("Declaration"));
			IStoredIterable iterable = fetchManyInStore(category, version, "name", name, true);
			if(iterable.iterator().hasNext()) {
				Iterator<IStored> iterator = iterable.iterator();
				return () -> new Iterator<IDeclaration>() {
					@Override public boolean hasNext() { return iterator.hasNext(); }
					@Override public IDeclaration next() { return parseDeclaration(iterator.next()); }
				};
			} else
				return null;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private IStoredIterable fetchDeclarationsWithAnnotationsInStore(Set<String> annotations) {
		if(store==null)
			return null;
		else try {
			IQueryBuilder builder = store.newQueryBuilder();
			builder.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "Declaration");
			builder.verify(AttributeInfo.ANNOTATIONS, MatchOp.HAS_ANY, annotations);
			builder.and();
			builder = filterOnModules(builder, true);
			IdentifierList names = new IdentifierList("prototype", "version");
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			orderBy.interpretQuery(context, builder);
			IStoredIterable stored = store.fetchMany(builder.build());
			return fetchDistinct(stored);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	private static Set<String> uniqueDecls = new HashSet<>(
			Arrays.asList(DeclarationType.ATTRIBUTE.name(), DeclarationType.CATEGORY.name(), DeclarationType.TEST.name()));
	

	@Override
	public NativeCategoryDeclaration fetchLatestNativeCategoryDeclarationWithJavaBinding(String typeName) {
		if(store==null)
			return null;
		else try {
			IQueryBuilder builder = store.newQueryBuilder();
			builder.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "NativeCategoryDeclaration");
			builder = filterOnModules(builder, true);
			IdentifierList names = new IdentifierList("version");
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			orderBy.interpretQuery(context, builder);
			IStoredIterable stored = store.fetchMany(builder.build());
			NativeCategoryDeclaration decl = filterNativeCategoryDeclarationWithJavaBinding(stored, typeName);
			if(decl!=null)
				return decl;
			else
				return super.fetchLatestNativeCategoryDeclarationWithJavaBinding(typeName);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	
	private NativeCategoryDeclaration filterNativeCategoryDeclarationWithJavaBinding(IStoredIterable iterable, String typeName) {
		Iterator<IStored> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			NativeCategoryDeclaration decl = parseDeclaration(iterator.next());
			if(typeName.equals(decl.getBoundClassName()))
				return decl;
		}
		return null;
	}

	private IStoredIterable fetchManyInStore(CategoryType type, PromptoVersion version, String attribute, Object value, boolean filterOnModules) throws PromptoError {
		IQueryBuilder builder = store.newQueryBuilder();
		if(uniqueDecls.contains(type.toString().toUpperCase())) {
			builder.first(1L).last(1L);
		}
		builder = verifyCategory(builder, type);
		builder = verifyVersion(builder, version);
		builder = verifyAttribute(builder, attribute, value);
		builder = filterOnModules(builder, filterOnModules);
		if(PromptoVersion.LATEST.equals(version)) {
			builder = orderByVersion(builder);
			IStoredIterable stored = store.fetchMany(builder.build());
			return fetchDistinct(stored);
		} else
			return store.fetchMany(builder.build()); 
	}
	
	private IQueryBuilder verifyCategory(IQueryBuilder builder, CategoryType type) {
		return builder.verify(AttributeInfo.CATEGORY, MatchOp.HAS, type.getTypeName());
	}

	private IQueryBuilder verifyVersion(IQueryBuilder builder, PromptoVersion version) {
		if(PromptoVersion.LATEST.equals(version))
			return builder;
		else 
			return builder.verify(AttributeInfo.VERSION, MatchOp.EQUALS, version).and();
	}

	private IQueryBuilder orderByVersion(IQueryBuilder builder) {
		OrderByClauseList orderBy = new OrderByClauseList();
		orderBy.add(new OrderByClause(new IdentifierList("prototype"), false));
		orderBy.add(new OrderByClause(new IdentifierList("version"), true));
		return orderBy.interpretQuery(context, builder);
	}

	private IQueryBuilder verifyAttribute(IQueryBuilder builder, String attribute, Object value) {
		AttributeInfo info = fetchLatestAttributeInfo(context, attribute);
		MatchOp op = value instanceof Collection ? MatchOp.IN : MatchOp.EQUALS;
		return builder.verify(info, op, value).and();
	}

	private IStored fetchOneNamedInStore(CategoryType type, PromptoVersion version, String name, boolean filterOnModules) throws PromptoError {
		return fetchOneInStore(type, version, "name", name, filterOnModules);
	}
	
	private IStored fetchOneInStore(CategoryType type, PromptoVersion version, String attribute, String value, boolean filterOnModules) throws PromptoError {
		IQueryBuilder builder = store.newQueryBuilder();
		builder = verifyCategory(builder, type);
		builder = verifyVersion(builder, version);
		builder = verifyAttribute(builder, attribute, value);
		builder = filterOnModules(builder, filterOnModules);
		if(PromptoVersion.LATEST.equals(version)) {
			builder = orderByVersion(builder);
			builder.first(1L).last(1L);
			IStoredIterable iterable = store.fetchMany(builder.build());
			Iterator<IStored> stored = iterable.iterator();
			return stored.hasNext() ? stored.next() : null;
		} else
			return store.fetchOne(builder.build()); 
	}

	@Override
	public void collectStorableAttributes(Map<String, AttributeDeclaration> map) throws PromptoError {
		super.collectStorableAttributes(map);
		if(store!=null) {
			IQueryBuilder builder = store.newQueryBuilder();
			builder.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "AttributeDeclaration");
			builder.verify(AttributeInfo.STORABLE, MatchOp.EQUALS, true);
			builder.and();
			builder = filterOnModules(builder, true);
			IStoredIterable iterable = store.fetchMany(builder.build());
			Iterator<IStored> stored = iterable.iterator();
			while(stored.hasNext()) {
				AttributeDeclaration attr = parseDeclaration(stored.next());
				map.put(attr.getName(), attr);		
			}
		}
	}


	private IStoredIterable fetchDistinct(IStoredIterable iterable) {
		/* we don't support distinct/group by yet, so need to do it "by hand" on client side */
		List<IStored> distinct = new ArrayList<>();
		Object lastName = null;
		Object lastProto = null;
		for(IStored stored : iterable) {
			Object thisName = stored.getData("name");
			Object thisProto = stored.getData("prototype");
			if(!Objects.equals(thisName, lastName) || !Objects.equals(thisProto, lastProto)) {
				distinct.add(stored);
				lastName = thisName;
				lastProto = thisProto;
			}
		}
		return new IStoredIterable() {
			@Override public Iterator<IStored> iterator() { return distinct.iterator(); }
			@Override public long count() { return distinct.size(); }
			@Override public long totalCount() { return distinct.size(); }
		};
	}


	@SuppressWarnings("unchecked")
	private <T extends IDeclaration> T parseDeclaration(IStored stored) {
		if(stored==null)
			return null;
		try {
			logger.debug(()->"Found " + stored.getData("name") + " with dbId " + stored.getDbId());
			Dialect dialect = Dialect.valueOf((String)stored.getData("dialect"));
			String body = (String)stored.getData("body");
			InputStream input = new ByteArrayInputStream(body.getBytes());
			DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
			return decls.isEmpty() ? null : (T)decls.get(0);
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO
		}
	}
	
	@Override
	public void upgradeIfRequired() {
		upgradeDerivedFrom();
		upgradeVersionQualifiers();
		super.upgradeIfRequired();
	}

	private void upgradeVersionQualifiers() {
		Map<String, Object> config = store.fetchConfiguration("CodeStoreConfiguration");
		if(config==null)
			config = new HashMap<>();
		if(config.containsKey("versionQualifiers"))
			return;
		logger.info(()->"Upgrading code store for versionQualifiers...");
		IQueryBuilder builder = store.newQueryBuilder()
				.verify(AttributeInfo.VERSION, MatchOp.EQUALS, null)
				.not();
		IStoredIterable stored = store.fetchMany(builder.build());
		StreamSupport.stream(stored.spliterator(), false)
				.forEach(this::upgradeVersionQualifiers);
		config.put("versionQualifiers", true);
		store.storeConfiguration("CodeStoreConfiguration", config);
		logger.info(()->"Code store upgraded for versionQualifiers");
	}

	private void upgradeVersionQualifiers(IStored stored) {
		Object value = stored.getRawData("version");
		if(value instanceof Integer) {
			PromptoVersion version = PromptoVersion.parseInt((Integer)value);
			IStorable storable = store.newStorable(stored.getCategories(), IDbIdFactory.of(()->stored.getDbId(), null, ()->true));
			storable.setData("version", version.asInt());
			store.store(storable);
		}
	}
	
	private void upgradeDerivedFrom() {
		Map<String, Object> config = store.fetchConfiguration("CodeStoreConfiguration");
		if(config==null)
			config = new HashMap<>();
		if(config.containsKey("derivedFrom"))
			return;
		logger.info(()->"Upgrading code store for derivedFrom attribute...");
		IQueryBuilder builder = store.newQueryBuilder()
				.verify(AttributeInfo.CATEGORY, MatchOp.HAS, "CategoryDeclaration");
		IStoredIterable stored = store.fetchMany(builder.build());
		StreamSupport.stream(stored.spliterator(), false)
				.forEach(this::upgradeDerivedFrom);
		config.put("derivedFrom", true);
		store.storeConfiguration("CodeStoreConfiguration", config);
		logger.info(()->"Code store upgraded or derivedFrom attribute");
	}

	private void upgradeDerivedFrom(IStored stored) {
		IDeclaration decl = parseDeclaration(stored);
		if(decl instanceof CategoryDeclaration) {
			IdentifierList derivedFrom = ((CategoryDeclaration)decl).getDerivedFrom();
			if(derivedFrom!=null && !derivedFrom.isEmpty()) {
				List<String> names = derivedFrom.stream().map(Object::toString).collect(Collectors.toList());
				IStorable storable = store.newStorable(stored.getCategories(), new IDbIdFactory() {
					@Override public void accept(Object t) { }
					@Override public Object get() { return stored.getDbId(); }
					@Override public boolean isUpdate() { return true; }
				});
				storable.setData("derivedFrom", names);
				stored.getNames().forEach(name->storable.setData(name, stored.getData(name)));
				store.store(storable);
			}
		}
	}

}
