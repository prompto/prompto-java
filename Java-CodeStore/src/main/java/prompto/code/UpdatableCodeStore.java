package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
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
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.DateTimeType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.Text;


public class UpdatableCodeStore extends BaseCodeStore {

	IStore store; // data store where to store/fetch the code
	String application;
	Version version;
	Context context; 
	
	public UpdatableCodeStore(Context context, IStore store, String resourceName, String application, String version) throws PromptoError {
		super(null);
		this.store = store;
		this.application = application;
		this.version = Version.parse(version);
		this.context = context;
		ICodeStore runtime = bootstrapRuntime();
		bootstrapCodeStore(runtime);
		bootstrapApplication(runtime, resourceName);
	}
	
	private ICodeStore bootstrapRuntime() {
		System.out.println("Connecting to prompto runtime libraries...");
		ICodeStore runtime = new ResourceCodeStore(null, ModuleType.LIBRARY, "Core.pec", "1.0.0");
		runtime = new ResourceCodeStore(runtime, ModuleType.LIBRARY, "Console.pec", "1.0.0");
		runtime = new ResourceCodeStore(runtime, ModuleType.LIBRARY, "Internet.pec", "1.0.0");
		return new ResourceCodeStore(runtime, ModuleType.LIBRARY, "CodeStore.pec", "1.0.0");
	}

	public IStore getStore() {
		return store;
	}
	
	private void bootstrapApplication(ICodeStore runtime, String resourceName) {
		System.out.println("Connecting to code store for application " + application + " version " + version + "...");
		if(resourceName!=null)
			this.next = new ResourceCodeStore(runtime, ModuleType.APPLICATION, resourceName, version.toString());
		else
			this.next = runtime;
	}

	private ICodeStore bootstrapCodeStore(ICodeStore runtime) throws PromptoError {
		System.out.println("Initializing code store...");
		this.next = new ResourceCodeStore(runtime, ModuleType.LIBRARY, "CodeStore.pec", "1.0.0");
		Collection<AttributeDeclaration> columns = getMinimalColumns();
		columns = registerColumnAttributes(columns);
		store.createOrUpdateColumns(columns);
		storeAttributes(columns);
		return runtime;
	}

	private void storeAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		// need to fetch latest declaration, since columns were built programmatically for bootstrapping
		List<IDeclaration> decls = fetchLatestDeclarations(columns);
		storeDeclarations(decls); 
	}
	
	private void storeDeclarations(List<IDeclaration> decls) throws PromptoError {
		// need to store in 1 commit to avoid maxWarmingSearchers exception in SOLR
		try {
			List<IStorable> list = new ArrayList<>();
			decls.forEach((d) -> collectStorables(list, d));
			store.store(context, list);
		} catch (RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}
	
	private void collectStorables(List<IStorable> list, IDeclaration decl) {
		try {
			IValue moduleId = fetchDeclarationModuleDbId(decl);
			if(moduleId==null)
				moduleId = storeDeclarationModule(decl);
			ICodeStore origin = decl.getOrigin();
			collectStorables(list, decl, origin.getModuleDialect(), origin.getModuleVersion(), moduleId);
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	public void collectStorables(List<IStorable> list, IDeclaration declaration, Dialect dialect, Version version, IValue moduleId) {
		if(declaration instanceof MethodDeclarationMap) {
			for(IDeclaration method : ((MethodDeclarationMap)declaration).values())
				collectStorables(list, method, dialect, version, moduleId);
		} else {
			List<String> categories = Arrays.asList("Declaration", Utils.capitalizeFirst(declaration.getDeclarationType().name()));
			IStorable storable = populateDeclarationStorable(context, categories, declaration, dialect, version, moduleId);
			list.add(storable);
		}
	}

	private List<IDeclaration> fetchLatestDeclarations(Collection<? extends IDeclaration> decls) throws PromptoError {
		try {
			List<IDeclaration> list = new ArrayList<>();
			decls.forEach((d) -> collectDeclaration(list, d.getIdentifier().getName()));
			return list;
		} catch (RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	private void collectDeclaration(List<IDeclaration> list, String name) {
		try {
			IDeclaration decl = super.fetchLatestVersion(name);
			if(decl!=null && decl.getOrigin()!=null)
				list.add(decl);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	private Collection<AttributeDeclaration> registerColumnAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		List<AttributeDeclaration> registered = new ArrayList<>();
		for(AttributeDeclaration column : columns)
			registered.add(registerColumnAttribute(column));
		return registered;
	}

	static final Set<String> reserved = new HashSet<>(Arrays.asList("dbId", "category", "storable", "executable"));
	
	private AttributeDeclaration registerColumnAttribute(AttributeDeclaration column) throws PromptoError {
		// can't write a declaration for a column with a reserved name, so use the hard coded one
		IDeclaration decl = reserved.contains(column.getName()) ? column : super.fetchLatestVersion(column.getName());
		if(decl==null)
			throw new RuntimeException("Missing column attribute: " + column.getName());
		decl.register(context);
		return (AttributeDeclaration)decl;
	}

	private Collection<AttributeDeclaration> getMinimalColumns() {
		List<AttributeDeclaration> columns = new ArrayList<AttributeDeclaration>();
		// attributes with reserved names, the below declarations will be used
		columns.add(new AttributeDeclaration(new Identifier("dbId"), store.getDbIdType()));
		columns.add(new AttributeDeclaration(new Identifier("storable"), BooleanType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("category"), 
				new ListType(TextType.instance()), new IdentifierList(new Identifier("key"))));
		// also add 'executable' to avoid dependency on DevCenter
		columns.add(new AttributeDeclaration(new Identifier("executable"), store.getDbIdType()));
		// more required attributes which will be overridden by a prompto declaration
		columns.add(new AttributeDeclaration(new Identifier("author"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("timeStamp"), DateTimeType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("name"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("description"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("version"), TextType.instance())); // TODO add VersionType ?
		columns.add(new AttributeDeclaration(new Identifier("methodPrototype"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("methodDialect"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("methodBody"), TextType.instance()));
		return columns;
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
			IStored stored = fetchInStore(name, type.getCategory(), version);
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
	
	@Override
	public IDeclaration fetchLatestVersion(String name) throws PromptoError {
		// System.out.println("Fetching: " + name);
		IDeclaration res = fetchSpecificVersion(name, ICodeStore.LATEST);
		// System.out.println("Found: " + name + " -> " + (res!=null));
		return res;
	}
	
	@Override
	public IDeclaration fetchSpecificVersion(String name, Version version) throws PromptoError {
		IDeclaration decl = fetchDeclarationInStore(name, version);
		if(decl==null) {
			// when called from the AppServer, multiple threads may be attempting to do this
			// TODO: need to deal with multiple cloud nodes doing this
			synchronized(this) {
				decl = fetchDeclarationInStore(name, version);
				if(decl==null) {
					decl = super.fetchLatestVersion(name);
					if(decl!=null && decl.getOrigin()!=null)
						storeDeclaration(decl);
				}
			}
		}
		return decl;
	}

	private void storeDeclaration(IDeclaration decl) throws PromptoError {
		IValue moduleId = fetchDeclarationModuleDbId(decl);
		if(moduleId==null)
			moduleId = storeDeclarationModule(decl);
		ICodeStore origin = decl.getOrigin();
		storeDeclarations(Arrays.asList(decl), origin.getModuleDialect(), origin.getModuleVersion(), moduleId);
	}

	@Override
	public void storeDeclarations(Collection<IDeclaration> declarations, Dialect dialect, Version version, IValue moduleId) throws PromptoError {
		List<IStorable> list = new ArrayList<>();
		declarations.forEach((d) -> collectStorables(list, d, dialect, version, moduleId));
		store.store(context, list);
	}
	
	private IValue fetchDeclarationModuleDbId(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		IStored stored = fetchInStore(origin.getModuleName(), origin.getModuleType().getCategory(), origin.getModuleVersion());
		if(stored==null)
			return null;
		else
			return stored.getDbId();
	}

	private IStorable populateDeclarationStorable(Context context, List<String> categories, IDeclaration decl, Dialect dialect, Version version, IValue moduleId) {
		IStorable storable = store.newStorable(categories); 
		try {
			storable.setValue(context, new Identifier("name"),  new Text(decl.getIdentifier().getName()));
			storable.setValue(context, new Identifier("version"),  new Text(version.toString()));
			if(decl instanceof IMethodDeclaration) {
				String proto = ((IMethodDeclaration)decl).getProto();
				storable.setValue(context, new Identifier("methodPrototype"), new Text(proto));
			}
			storable.setValue(context, new Identifier("methodDialect"),  new Text(dialect.name()));
			CodeWriter writer = new CodeWriter(dialect, context);
			decl.toDialect(writer);
			String content = writer.toString();
			storable.setValue(context, new Identifier("methodBody"),  new Text(content));
			storable.setValue(context, new Identifier("executable"),  moduleId);
			return storable;
		} catch(PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	private IDeclaration fetchDeclarationInStore(String name, Version version) {
		try {
			IStored stored = fetchInStore(name, null, version);
			return parseDeclaration(context, stored);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	private IStored fetchInStore(String name, CategoryType type, Version version) throws PromptoError {
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
		IExpression filter = new EqualsExpression(left, EqOp.ROUGHLY, right);
		if(!LATEST.equals(version)) {
			left = new UnresolvedIdentifier(new Identifier("version"));
			right = new TextLiteral('"' + version.toString() + '"');
			IExpression condition = new EqualsExpression(left, EqOp.EQUALS, right);
			filter = new AndExpression(filter, condition);
		} 
		return filter;
	}

	@SuppressWarnings("unchecked")
	private <T extends IDeclaration> T parseDeclaration(Context context, IStored stored) throws Exception {
		if(stored==null)
			return null;
		Text value = (Text)stored.getValue(context, new Identifier("methodDialect"));
		Dialect dialect = Dialect.valueOf(value.getValue());
		value = (Text)stored.getValue(context, new Identifier("methodBody"));
		InputStream input = new ByteArrayInputStream(value.getValue().getBytes());
		DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
		return decls.isEmpty() ? null : (T)decls.get(0);
	}

	@Override
	public void synchronizeSchema() throws PromptoError {
		List<AttributeDeclaration> columns = new ArrayList<>();
		collectStorableAttributes(columns);
		store.createOrUpdateColumns(columns);
	}

	@Override
	public void collectStorableAttributes(List<AttributeDeclaration> list) {
		super.collectStorableAttributes(list);
		IExpression left = new UnresolvedIdentifier(new Identifier("storable"));
		IExpression right = new BooleanLiteral("true");
		IExpression filter = new EqualsExpression(left, EqOp.EQUALS, right);
		CategoryType type = new CategoryType(new Identifier("Attribute"));
		try {
			IStoredIterator result = store.fetchMany(context, type, null, null, filter, null);
			while(result.hasNext()) {
				AttributeDeclaration attr = parseDeclaration(context, result.next());
				list.add(attr);		
			}
		} catch(Exception e) {
			// TODO
		}
	}
}
