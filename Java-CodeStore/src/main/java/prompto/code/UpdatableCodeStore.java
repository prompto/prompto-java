package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IDeclaration.DeclarationType;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.AndExpression;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.expression.IPredicateExpression;
import prompto.expression.UnresolvedIdentifier;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.literal.TextLiteral;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.AttributeInfo;
import prompto.store.Family;
import prompto.store.IQueryBuilder;
import prompto.store.IQueryBuilder.MatchOp;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterable;
import prompto.type.CategoryType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.ObjectUtils;
import prompto.utils.ResourceUtils;
import prompto.utils.StringUtils;


public class UpdatableCodeStore extends BaseCodeStore {

	IStore store; // data store where to store/fetch the code
	String application;
	Version version;
	// fetching and storing declarations requires a context holding code store attributes
	// some of these are code store specific and should not be looked for in the app context
	Context context; 
	
	public UpdatableCodeStore(IStore store, String application, String version, String ...resourceNames) throws PromptoError {
		super(null);
		this.store = store;
		this.application = application;
		this.version = Version.parse(version);
		ICodeStore runtime = bootstrapRuntime();
		this.context = CodeStoreBootstrapper.bootstrap(store, runtime);
		this.next = AppStoreBootstrapper.bootstrap(store, runtime, application, version, resourceNames);
	}
	
	private ICodeStore bootstrapRuntime() {
		System.out.println("Connecting to prompto runtime libraries...");
		try {
			ICodeStore runtime = null;
			for(String name : ResourceUtils.listResourcesAt("libraries"))
				runtime = new ResourceCodeStore(runtime, ModuleType.LIBRARY, "libraries/" + name, "1.0.0");
			return runtime;
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	public IStore getStore() {
		return store;
	}
	
	public void collectStorables(List<IStorable> list, IDeclaration declaration, Dialect dialect, Version version, Object moduleId) {
		if(declaration instanceof MethodDeclarationMap) {
			for(IDeclaration method : ((MethodDeclarationMap)declaration).values())
				collectStorables(list, method, dialect, version, moduleId);
		} else {
			String typeName = StringUtils.capitalizeFirst(declaration.getDeclarationType().name()) + "Declaration";
			List<String> categories = Arrays.asList("Declaration", typeName);
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
	public Version getModuleVersion() {
		return version;
	}
	
	@Override
	public void storeModule(Module module) throws PromptoError {
		Context context = Context.newGlobalContext();
		List<IStorable> storables = new ArrayList<>();
		module.populate(context, store, storables);
		store.store(null, storables);
	}
	
	private Object storeDeclarationModule(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		List<String> categories = Arrays.asList("Module", origin.getModuleType().getCategory().getTypeName());
		IStorable storable = store.newStorable(categories, null);
		storable.setData("name", origin.getModuleName());
		storable.setData("version", origin.getModuleVersion().toString());
		store.store(storable);
		return storable.getOrCreateDbId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Module> T fetchModule(ModuleType type, String name, Version version) throws PromptoError {
		try {
			IStored stored = fetchOneInStore(name, type.getCategory(), version);
			if(stored==null)
				return null;
			Module module = type.getModuleClass().newInstance();
			module.setName((String)stored.getData("name"));
			module.setVersion((String)stored.getData("version"));
			module.setDescription((String)stored.getData("description"));
			if(module instanceof WebSite)
				((WebSite)module).setEntryPoint((String)stored.getData("entryPoint"));
			return (T)module;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	static ThreadLocal<Map<String, Iterator<IDeclaration>>> registering = new ThreadLocal<Map<String, Iterator<IDeclaration>>>() {
		@Override protected Map<String, Iterator<IDeclaration>> initialValue() {
	        return new HashMap<>();
	    }
	};
	
	Iterator<IDeclaration> fetchRegisteringDeclarations(String name) {
		return registering.get().get(name);
	}
	
	private void storeRegisteringDeclarations(String name, Iterator<IDeclaration> decl) {
		registering.get().put(name, decl);
	}

	private void deleteRegisteringDeclarations(String name) {
		registering.get().remove(name);
	}
	
	
	@Override
	public Iterator<IDeclaration> fetchLatestVersions(String name) throws PromptoError {
		return fetchSpecificVersions(name, LATEST_VERSION);
	}
	
	
	@Override
	public Iterator<IDeclaration> fetchSpecificVersions(String name, Version version) throws PromptoError {
		Iterator<IDeclaration> decls = fetchDeclarationsInStore(name, version);
		if(decls==null) {
			// when called from the AppServer, multiple threads may be attempting to do this
			// TODO: need to deal with multiple cloud nodes doing this
			synchronized(this) {
				decls = fetchDeclarationsInStore(name, version);
				if(decls==null) {
					decls = fetchRegisteringDeclarations(name);
					if(decls==null) {
						decls = super.fetchLatestVersions(name);
						if(decls!=null) {
							storeRegisteringDeclarations(name, decls);
							decls = storeDeclarations(decls);
							deleteRegisteringDeclarations(name);
							store.flush();
						}
					}
				}
			}
		}
		return decls;
	}

	private Iterator<IDeclaration> storeDeclarations(Iterator<IDeclaration> decls) throws PromptoError {
		if(!decls.hasNext())
			return decls;
		List<IDeclaration> result = new ArrayList<>();
		final IDeclaration decl = decls.next();
		ICodeStore origin = decl.getOrigin();
		if(origin==null)
			throw new InternalError("Cannot store declaration with no origin!");
		Object moduleId = fetchDeclarationModuleDbId(decl);
		if(moduleId==null)
			moduleId = storeDeclarationModule(decl);
		Iterator<IDeclaration> iter = new Iterator<IDeclaration>() {
			
			IDeclaration first = decl;
			
			@Override
			public boolean hasNext() {
				return first!=null || decls.hasNext();
			}

			@Override
			public IDeclaration next() {
				IDeclaration res = getNext();
				if(res!=null)
					result.add(res);
				return res;
			}
			
			protected IDeclaration getNext() {
				if(first!=null) {
					IDeclaration res = first;
					first = null;
					return res;
				} else
					return decls.next();
			}
		};
		storeDeclarations(iter, origin.getModuleDialect(), origin.getModuleVersion(), moduleId);
		return result.isEmpty() ? null : result.iterator();
	}


	@Override
	public void storeDeclarations(Iterator<IDeclaration> declarations, Dialect dialect, Version version, Object moduleId) throws PromptoError {
		List<IStorable> list = new ArrayList<>();
		while(declarations.hasNext())
			collectStorables(list, declarations.next(), dialect, version, moduleId);
		store.store(null, list);
	}
	
	private Object fetchDeclarationModuleDbId(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		IStored stored = fetchOneInStore(origin.getModuleName(), origin.getModuleType().getCategory(), origin.getModuleVersion());
		if(stored==null)
			return null;
		else
			return stored.getDbId();
	}

	private IStorable populateDeclarationStorable(List<String> categories, IDeclaration decl, Dialect dialect, Version version, Object moduleId) {
		IStorable storable = store.newStorable(categories, null); 
		try {
			storable.setData("name", decl.getId().toString());
			storable.setData("version", version.toString());
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
			return storable;
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	private Iterator<IDeclaration> fetchDeclarationsInStore(String name, Version version) {
		try {
			CategoryType category = new CategoryType(new Identifier("Declaration"));
			IStoredIterable iterable = fetchManyInStore(name, category, version);
			Iterator<IStored> iterator = iterable.iterator();
			if(iterator.hasNext())
				return new Iterator<IDeclaration>() {
					@Override public boolean hasNext() { return iterator.hasNext(); }
					@Override public IDeclaration next() { return parseDeclaration(iterator.next()); }
				};
			else
				return null;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static Set<String> uniqueDecls = new HashSet<>(
			Arrays.asList(DeclarationType.ATTRIBUTE.name(), DeclarationType.CATEGORY.name(), DeclarationType.TEST.name()));
	
	private IStoredIterable fetchManyInStore(String name, CategoryType type, Version version) throws PromptoError {
		IQueryBuilder builder = store.newQueryBuilder();
		if(uniqueDecls.contains(type.toString().toUpperCase())) {
			builder.setFirst(1L);
			builder.setLast(1L);
		}
		AttributeInfo info = new AttributeInfo("category", Family.TEXT, true, null);
		builder.verify(info, MatchOp.CONTAINS, type.getTypeName());
		IPredicateExpression filter = buildNameAndVersionFilter(name, version);
		filter.interpretQuery(context, builder);
		if(LATEST_VERSION.equals(version)) {
			IdentifierList names = IdentifierList.parse("prototype,version");
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			orderBy.interpretQuery(context, builder);
			IStoredIterable stored = store.fetchMany(builder.build());
			return fetchDistinct(stored);
		} else
			return store.fetchMany(builder.build()); 
	}
	
	private IStored fetchOneInStore(String name, CategoryType type, Version version) throws PromptoError {
		IQueryBuilder builder = store.newQueryBuilder();
		AttributeInfo info = new AttributeInfo("category", Family.TEXT, true, null);
		builder.verify(info, MatchOp.CONTAINS, type.getTypeName());
		IPredicateExpression filter = buildNameAndVersionFilter(name, version);
		filter.interpretQuery(context, builder);
		builder.and();
		if(LATEST_VERSION.equals(version)) {
			IdentifierList names = new IdentifierList(new Identifier("version"));
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			orderBy.interpretQuery(context, builder);
			builder.setFirst(1L);
			builder.setLast(1L);
			IStoredIterable iterable = store.fetchMany(builder.build());
			Iterator<IStored> stored = iterable.iterator();
			return stored.hasNext() ? stored.next() : null;
		} else
			return store.fetchOne(builder.build()); 
	}

	@Override
	public void collectStorableAttributes(Map<String, AttributeDeclaration> map) throws PromptoError {
		super.collectStorableAttributes(map);
		IQueryBuilder builder = store.newQueryBuilder();
		AttributeInfo info = new AttributeInfo("category", Family.TEXT, true, null);
		builder.verify(info, MatchOp.CONTAINS, "AttributeDeclaration");
		info = new AttributeInfo("storable", Family.BOOLEAN, false, null);
		builder.verify(info, MatchOp.EQUALS, true);
		builder.and();
		IStoredIterable iterable = store.fetchMany(builder.build());
		Iterator<IStored> stored = iterable.iterator();
		while(stored.hasNext()) {
			AttributeDeclaration attr = parseDeclaration(stored.next());
			map.put(attr.getName(), attr);		
		}
	}


	private IStoredIterable fetchDistinct(IStoredIterable iterable) {
		/* we don't support distinct/group by yet, so need to do it "by hand" */
		List<IStored> distinct = new ArrayList<>();
		Object lastName = null;
		Object lastProto = null;
		for(IStored stored : iterable) {
			Object thisName = stored.getData("name");
			Object thisProto = stored.getData("prototype");
			if(!ObjectUtils.areEqual(thisName, lastName) || !ObjectUtils.areEqual(thisProto, lastProto)) {
				distinct.add(stored);
				lastName = thisName;
				lastProto = thisProto;
			}
		}
		return new IStoredIterable() {
			@Override public Iterator<IStored> iterator() { return distinct.iterator(); }
			@Override public long length() { return distinct.size(); }
			@Override public long totalLength() { return distinct.size(); }
		};
	}

	private IPredicateExpression buildNameAndVersionFilter(String name, Version version) {
		IExpression left = new UnresolvedIdentifier(new Identifier("name"));
		IExpression right = new TextLiteral("'" + name + "'");
		IPredicateExpression filter = new EqualsExpression(left, EqOp.EQUALS, right);
		if(!LATEST_VERSION.equals(version)) {
			left = new UnresolvedIdentifier(new Identifier("version"));
			right = new TextLiteral('"' + version.toString() + '"');
			IExpression condition = new EqualsExpression(left, EqOp.EQUALS, right);
			filter = new AndExpression(filter, condition);
		} 
		return filter;
	}

	@SuppressWarnings("unchecked")
	private <T extends IDeclaration> T parseDeclaration(IStored stored) {
		if(stored==null)
			return null;
		try {
			Dialect dialect = Dialect.valueOf((String)stored.getData("dialect"));
			String body = (String)stored.getData("body");
			InputStream input = new ByteArrayInputStream(body.getBytes());
			DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
			return decls.isEmpty() ? null : (T)decls.get(0);
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO
		}
	}

}
