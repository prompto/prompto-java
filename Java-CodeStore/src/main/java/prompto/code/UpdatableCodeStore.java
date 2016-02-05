package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
			List<String> categories = Arrays.asList("Declaration", Utils.capitalizeFirst(declaration.getDeclarationType().name()));
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
		return fetchSpecificVersion(name, ICodeStore.LATEST);
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
		if(decl==null)
			return null;
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

	private IStorable populateDeclarationStorable(List<String> categories, IDeclaration decl, Dialect dialect, Version version, IValue moduleId) {
		IStorable storable = store.newStorable(categories); 
		try {
			storable.setValue(context, new Identifier("name"),  new Text(decl.getIdentifier().getName()));
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

	private IDeclaration fetchDeclarationInStore(String name, Version version) {
		try {
			IStored stored = fetchInStore(name, null, version);
			return parseDeclaration(stored);
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
	private <T extends IDeclaration> T parseDeclaration(IStored stored) throws Exception {
		if(stored==null)
			return null;
		Text value = (Text)stored.getValue(context, new Identifier("dialect"));
		Dialect dialect = Dialect.valueOf(value.getValue());
		value = (Text)stored.getValue(context, new Identifier("body"));
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
				AttributeDeclaration attr = parseDeclaration(result.next());
				list.add(attr);		
			}
		} catch(Exception e) {
			// TODO
		}
	}
}
