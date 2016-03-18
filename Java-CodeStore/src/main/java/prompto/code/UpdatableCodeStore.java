package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.expression.AndExpression;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.OrderByClause;
import prompto.grammar.OrderByClauseList;
import prompto.grammar.UnresolvedIdentifier;
import prompto.literal.BooleanLiteral;
import prompto.literal.IntegerLiteral;
import prompto.literal.TextLiteral;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.IStorable;
import prompto.store.IStore;
import prompto.store.IStored;
import prompto.store.IStoredIterator;
import prompto.type.CategoryType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.Text;


public class UpdatableCodeStore extends BaseCodeStore {

	IStore store; // data store where to store/fetch the code
	String application;
	Version version;
	// fetching and storing declarations requires a context holding code store attributes
	// some of these are code store specific and cannot/should not be found in the app context
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
		ICodeStore runtime = new ResourceCodeStore(null, ModuleType.LIBRARY, "Core.pec", "1.0.0");
		runtime = new ResourceCodeStore(runtime, ModuleType.LIBRARY, "Console.pec", "1.0.0");
		return new ResourceCodeStore(runtime, ModuleType.LIBRARY, "Internet.pec", "1.0.0");
	}

	public IStore getStore() {
		return store;
	}
	
	public void collectStorables(List<IStorable> list, IDeclaration declaration, Dialect dialect, Version version, IValue moduleId) {
		if(declaration instanceof MethodDeclarationMap) {
			for(IDeclaration method : ((MethodDeclarationMap)declaration).values())
				collectStorables(list, method, dialect, version, moduleId);
		} else {
			String typeName = Utils.capitalizeFirst(declaration.getDeclarationType().name()) + "Declaration";
			List<String> categories = Arrays.asList("Declaration", typeName);
			IStorable storable = populateDeclarationStorable(categories, declaration, dialect, version, moduleId);
			list.add(storable);
		}
	}

	@Override
	public ModuleType getModuleType() {
		return ModuleType.APPLICATION;
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
		List<String> categories = Arrays.asList("Module", module.getType().getCategory().getName());
		IStorable storable = store.newStorable(categories); 
		module.populate(context, storable);
		store.store(context, storable);
	}
	
	private IValue storeDeclarationModule(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		List<String> categories = Arrays.asList("Module", origin.getModuleType().getCategory().getName());
		IStorable storable = store.newStorable(categories);
		storable.setValue(context, new Identifier("name"),  new Text(origin.getModuleName()));
		storable.setValue(context, new Identifier("version"),  new Text(origin.getModuleVersion().toString()));
		store.store(context, storable);
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
			module.setName((Text)stored.getValue(context, new Identifier("name")));
			module.setVersion((Text)stored.getValue(context, new Identifier("version")));
			module.setDescription((Text)stored.getValue(context, new Identifier("description")));
			if(module instanceof Application)
				((Application)module).setEntryPoint((Text)stored.getValue(context, new Identifier("entryPoint")));
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
							storeDeclarations(decls);
							deleteRegisteringDeclarations(name);
						}
					}
				}
			}
		}
		return decls;
	}

	private void storeDeclarations(Iterator<IDeclaration> decls) throws PromptoError {
		final IDeclaration decl = decls.next();
		if(decl==null)
			return;
		ICodeStore origin = decl.getOrigin();
		if(origin==null)
			throw new InvalidDataError("Cannot store declaration with no origin!");
		IValue moduleId = fetchDeclarationModuleDbId(decl);
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
				if(first!=null) {
					IDeclaration res = first;
					first = null;
					return res;
				} else
					return decls.next();
			}
			
		};
		storeDeclarations(iter, origin.getModuleDialect(), origin.getModuleVersion(), moduleId);
	}

	@Override
	public void storeDeclarations(Iterator<IDeclaration> declarations, Dialect dialect, Version version, IValue moduleId) throws PromptoError {
		List<IStorable> list = new ArrayList<>();
		while(declarations.hasNext())
			collectStorables(list, declarations.next(), dialect, version, moduleId);
		store.store(context, null, list);
	}
	
	private IValue fetchDeclarationModuleDbId(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		IStored stored = fetchOneInStore(origin.getModuleName(), origin.getModuleType().getCategory(), origin.getModuleVersion());
		if(stored==null)
			return null;
		else
			return stored.getDbId();
	}

	private IStorable populateDeclarationStorable(List<String> categories, IDeclaration decl, Dialect dialect, Version version, IValue moduleId) {
		IStorable storable = store.newStorable(categories); 
		try {
			storable.setValue(context, new Identifier("name"),  new Text(decl.getId().getName()));
			storable.setValue(context, new Identifier("version"),  new Text(version.toString()));
			if(decl instanceof IMethodDeclaration) {
				String proto = ((IMethodDeclaration)decl).getProto();
				storable.setValue(context, new Identifier("prototype"), new Text(proto));
			}
			storable.setValue(context, new Identifier("dialect"),  new Text(dialect.name()));
			CodeWriter writer = new CodeWriter(dialect, context);
			decl.toDialect(writer);
			String content = writer.toString();
			storable.setValue(context, new Identifier("body"),  new Text(content));
			storable.setValue(context, new Identifier("module"),  moduleId);
			return storable;
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	private Iterator<IDeclaration> fetchDeclarationsInStore(String name, Version version) {
		try {
			IStoredIterator stored = fetchManyInStore(name, null, version);
			return new Iterator<IDeclaration>() {
				@Override public boolean hasNext() { return stored.hasNext(); }
				@Override public IDeclaration next() { return parseDeclaration(stored.next()); }
			};
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	private IStoredIterator fetchManyInStore(String name, CategoryType type, Version version) throws PromptoError {
		IntegerLiteral one = new IntegerLiteral(1);
		IExpression filter = buildNameAndVersionFilter(name, version);
		if(LATEST.equals(version)) {
			IdentifierList names = new IdentifierList(new Identifier("version"));
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			return store.fetchMany(context, type, one, one, filter, orderBy);
		} else
			return store.fetchMany(context, type, one, one, filter, null); 
	}

	private IStored fetchOneInStore(String name, CategoryType type, Version version) throws PromptoError {
		IExpression filter = buildNameAndVersionFilter(name, version);
		if(LATEST.equals(version)) {
			IdentifierList names = new IdentifierList(new Identifier("version"));
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			IntegerLiteral one = new IntegerLiteral(1);
			IStoredIterator result = store.fetchMany(context, type, one, one, filter, orderBy);
			return result.hasNext() ? result.next() : null;
		} else
			return store.fetchOne(context, null, filter); 
	}

	private IExpression buildNameAndVersionFilter(String name, Version version) {
		IExpression left = new UnresolvedIdentifier(new Identifier("name"));
		IExpression right = new TextLiteral("'" + name + "'");
		IExpression filter = new EqualsExpression(left, EqOp.EQUALS, right);
		if(!LATEST.equals(version)) {
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
			Text value = (Text)stored.getValue(context, new Identifier("dialect"));
			Dialect dialect = Dialect.valueOf(value.getValue());
			value = (Text)stored.getValue(context, new Identifier("body"));
			InputStream input = new ByteArrayInputStream(value.getValue().getBytes());
			DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
			return decls.isEmpty() ? null : (T)decls.get(0);
		} catch (Exception e) {
			throw new RuntimeException(e); // TODO
		}
	}

	@Override
	public void collectStorableAttributes(List<AttributeDeclaration> list) throws PromptoError {
		super.collectStorableAttributes(list);
		IExpression left = new UnresolvedIdentifier(new Identifier("storable"));
		IExpression right = new BooleanLiteral("true");
		IExpression filter = new EqualsExpression(left, EqOp.EQUALS, right);
		CategoryType type = new CategoryType(new Identifier("Attribute"));
		IStoredIterator result = store.fetchMany(context, type, null, null, filter, null);
		while(result.hasNext()) {
			AttributeDeclaration attr = parseDeclaration(result.next());
			list.add(attr);		
		}
	}
}
