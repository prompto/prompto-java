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
import prompto.type.BooleanType;
import prompto.type.CategoryType;
import prompto.type.DateTimeType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.utils.Utils;
import prompto.value.Text;


public class DistributedCodeStore extends BaseCodeStore {

	IStore store; // data store where to store/fetch the code
	Context context; // used for querying the data store and parsing code
	String application;
	Version version;
	
	public DistributedCodeStore(IStore store, ICodeStore next, String application, String version) throws PromptoError {
		super(next);
		this.store = store;
		this.context = Context.newGlobalContext();
		this.application = application;
		this.version = Version.parse(version);
		// can't really store bootstrapped code without hard coding code store schema
		bootstrapCodeStore();
	}
	
	public IStore getStore() {
		return store;
	}
	
	private void bootstrapCodeStore() throws PromptoError {
		Collection<AttributeDeclaration> columns = getInitialColumns();
		store.createOrUpdateColumns(columns);
		registerColumnAttributes(columns);
		storeColumnAttributes(columns);
	}

	private void storeColumnAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		for(AttributeDeclaration column : columns)
			storeColumnAttribute(column);
	}

	private void storeColumnAttribute(AttributeDeclaration column) throws PromptoError {
		IDeclaration decl = super.fetchLatestVersion(column.getName());
		if(decl!=null && decl.getOrigin()!=null)
			storeInStore(decl);
	}

	private void registerColumnAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		for(AttributeDeclaration column : columns)
			registerColumnAttribute(column);
	}

	private void registerColumnAttribute(AttributeDeclaration column) throws PromptoError {
		IDeclaration decl = super.fetchLatestVersion(column.getName());
		if(decl!=null)
			decl.register(context);
	}

	private Collection<AttributeDeclaration> getInitialColumns() {
		List<AttributeDeclaration> columns = new ArrayList<AttributeDeclaration>();
		columns.add(new AttributeDeclaration(new Identifier("dbId"), store.getDbIdType(), null));
		columns.add(new AttributeDeclaration(new Identifier("author"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("timeStamp"), DateTimeType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("category"), new ListType(TextType.instance()), null));
		columns.add(new AttributeDeclaration(new Identifier("name"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("description"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("storable"), BooleanType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("version"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("prototype"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("codeFormat"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("codeBody"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("members"), new ListType(store.getDbIdType()), null));
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
	public void store(Module module) throws PromptoError {
		Context context = Context.newGlobalContext();
		List<String> categories = Arrays.asList("Project", module.getType().getCategory().getName());
		IStorable storable = store.newStorable(categories); 
		module.populate(context, storable);
		store.store(context, storable);
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
	public void store(IDeclaration declaration, Dialect dialect, Version version) throws PromptoError {
		Context context = Context.newGlobalContext();
		List<String> categories = Arrays.asList("Declaration", declaration.getType(null).getName());
		IStorable storable = store.newStorable(categories); 
		populate(context, storable, declaration, dialect, version);
		store.store(context, storable);
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
						storeInStore(decl);
				}
			}
		}
		return decl;
	}

	private void storeInStore(IDeclaration decl) throws PromptoError {
		IStorable storable = fetchModule(decl);
		if(storable==null)
			storable = storeModule(decl);
		ICodeStore origin = decl.getOrigin();
		storeMember(context, storable, decl, origin.getModuleDialect(), origin.getModuleVersion());
	}

	private IStorable storeModule(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		Context context = Context.newGlobalContext();
		List<String> categories = Arrays.asList("Project", origin.getModuleType().getCategory().getName());
		IStorable storable = store.newStorable(categories);
		storable.setValue(context, new Identifier("name"),  new Text(origin.getModuleName()));
		storable.setValue(context, new Identifier("version"),  new Text(origin.getModuleVersion().toString()));
		store.store(context, storable);
		return storable;
	}

	private IStorable fetchModule(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		IStored stored = fetchInStore(origin.getModuleName(), origin.getModuleType().getCategory(), origin.getModuleVersion());
		if(stored==null)
			return null;
		List<String> categories = Arrays.asList("Project", origin.getModuleType().getCategory().getName());
		IStorable storable = store.newStorable(categories);
		storable.setData("dbId", stored.getData("dbId"));
		storable.setData("members", stored.getData("members"));
		return storable;
	}

	private void storeMember(Context context, IStorable storable, IDeclaration decl, Dialect dialect, Version version) throws PromptoError {
		if(decl instanceof MethodDeclarationMap) {
			for(IDeclaration d : ((MethodDeclarationMap)decl).values())
				storeMember(context, storable, d, dialect, version);
		} else {
			String name = Utils.capitalizeFirst(decl.getDeclarationType().name());
			List<String> categories = Arrays.asList(name);
			IStorable child = store.newStorable(categories);
			populate(context, child, decl, dialect, version);
			storable.setData("members", child);
		}
	}

	private void populate(Context context, IStorable storable, IDeclaration decl, Dialect dialect, Version version) throws PromptoError {
		storable.setValue(context, new Identifier("name"),  new Text(decl.getIdentifier().getName()));
		storable.setValue(context, new Identifier("version"),  new Text(version.toString()));
		if(decl instanceof IMethodDeclaration) {
			String proto = ((IMethodDeclaration)decl).getProto();
			storable.setValue(context, new Identifier("prototype"), new Text(proto));
		}
		storable.setValue(context, new Identifier("codeFormat"),  new Text(dialect.name()));
		CodeWriter writer = new CodeWriter(dialect, context);
		decl.toDialect(writer);
		String content = writer.toString();
		storable.setValue(context, new Identifier("codeBody"),  new Text(content));
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
		Text value = (Text)stored.getValue(context, new Identifier("codeFormat"));
		Dialect dialect = Dialect.valueOf(value.getValue());
		value = (Text)stored.getValue(context, new Identifier("codeBody"));
		InputStream input = new ByteArrayInputStream(value.getValue().getBytes());
		DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
		return decls.isEmpty() ? null : (T)decls.get(0);
	}

	@Override
	public void synchronizeSchema() {
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
