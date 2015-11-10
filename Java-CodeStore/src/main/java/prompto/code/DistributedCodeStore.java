package prompto.code;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import prompto.code.Application;
import prompto.code.ICodeStore;
import prompto.code.Version;
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
import prompto.literal.IntegerLiteral;
import prompto.literal.TextLiteral;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.store.IDocumentIterator;
import prompto.store.IStore;
import prompto.type.BooleanType;
import prompto.type.DateTimeType;
import prompto.type.DocumentType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.utils.IdentifierList;
import prompto.value.Document;
import prompto.value.IValue;
import prompto.value.ListValue;
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
	}

	private void registerColumnAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		for(AttributeDeclaration column : columns)
			registerColumnAttribute(column);
	}

	private void registerColumnAttribute(AttributeDeclaration column) throws PromptoError {
		IDeclaration decl = super.fetchLatestVersion(column.getName());
		if(decl!=null && decl.getOrigin()!=null) {
			decl.register(context);
			storeInStore(decl);
		}
	}

	private Collection<AttributeDeclaration> getInitialColumns() {
		List<AttributeDeclaration> columns = new ArrayList<AttributeDeclaration>();
		columns.add(new AttributeDeclaration(new Identifier("dbId"), store.getDbIdType(), null));
		columns.add(new AttributeDeclaration(new Identifier("author"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("timeStamp"), DateTimeType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("category"), TextType.instance(), null));
		columns.add(new AttributeDeclaration(new Identifier("name"), TextType.instance(), null));
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
	public void store(Application application) throws PromptoError {
		Document doc = application.asDocument();
		store.store(context, doc);
	}
	
	@Override
	public Application fetchApplication(String name, Version version) throws PromptoError {
		try {
			Document doc = fetchDocumentInStore(name, version);
			if(doc==null)
				return null;
			IValue category = doc.getMember(context, new Identifier("category"), false);
			if(!ModuleType.APPLICATION.asValue().equals(category))
				return null;
			Application app = new Application();
			app.setName((Text)doc.getMember(context, new Identifier("name"), false));
			app.setVersion((Text)doc.getMember(context, new Identifier("version"), false));
			app.setText((Text)doc.getMember(context, new Identifier("text"), false));
			app.setEntryPoint((Text)doc.getMember(context, new Identifier("entryPoint"), false));
			return app;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void store(IDeclaration declaration, Dialect dialect, Version version) throws PromptoError {
		Context context = Context.newGlobalContext();
		Document doc = new Document();
		populate(context, doc, declaration, dialect, version);
		store.store(context, doc);
	}
	
	@Override
	public IDeclaration fetchLatestVersion(String name) throws PromptoError {
		return fetchSpecificVersion(name, ICodeStore.LATEST);
	}
	
	@Override
	public IDeclaration fetchSpecificVersion(String name, Version version) throws PromptoError {
		IDeclaration decl = fetchDeclarationInStore(name, version);
		if(decl==null) {
			decl = super.fetchLatestVersion(name);
			if(decl!=null && decl.getOrigin()!=null)
				storeInStore(decl);
		}
		return decl;
	}

	private void storeInStore(IDeclaration decl) throws PromptoError {
		ICodeStore origin = decl.getOrigin();
		Context context = Context.newGlobalContext();
		Document doc = new Document();
		doc.setMember(context, new Identifier("category"),  new Text(origin.getModuleType().name()));
		doc.setMember(context, new Identifier("name"),  new Text(origin.getModuleName()));
		doc.setMember(context, new Identifier("version"),  new Text(origin.getModuleVersion().toString()));
		storeInDocument(context, doc, decl, origin.getModuleDialect(), origin.getModuleVersion());
		store.store(context, doc);
	}

	private void storeInDocument(Context context, Document doc, IDeclaration decl, Dialect dialect, Version version) {
		if(decl instanceof MethodDeclarationMap) {
			for(IDeclaration d : ((MethodDeclarationMap)decl).values())
				storeInDocument(context, doc, d, dialect, version);
		} else {
			Document child = new Document();
			populate(context, child, decl, dialect, version);
			ListValue value = (ListValue)doc.getMember(context, new Identifier("members"), false);
			if(value==null) {
				value = new ListValue(DocumentType.instance());
				doc.setMember(context, new Identifier("members"), value);
			}
			try {
				value.Add(context, child);
			} catch(PromptoError e) {
				// TODO log
			}
		}
	}

	private void populate(Context context, Document doc, IDeclaration decl, Dialect dialect, Version version) {
		doc.setMember(context, new Identifier("category"),  new Text(decl.getDeclarationType().name()));
		doc.setMember(context, new Identifier("name"),  new Text(decl.getIdentifier().getName()));
		doc.setMember(context, new Identifier("version"),  new Text(version.toString()));
		if(decl instanceof IMethodDeclaration) {
			String proto = ((IMethodDeclaration)decl).getProto();
			doc.setMember(context, new Identifier("prototype"), new Text(proto));
		}
		doc.setMember(context, new Identifier("codeFormat"),  new Text(dialect.name()));
		CodeWriter writer = new CodeWriter(dialect, context);
		decl.toDialect(writer);
		String content = writer.toString();
		doc.setMember(context, new Identifier("codeBody"),  new Text(content));
	}

	private IDeclaration fetchDeclarationInStore(String name, Version version) {
		try {
			Document doc = fetchDocumentInStore(name, version);
			return parseDeclaration(context, doc);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	private Document fetchDocumentInStore(String name, Version version) throws PromptoError {
		IExpression filter = buildFilter(name, version);
		if(LATEST.equals(version)) {
			IdentifierList names = new IdentifierList(new Identifier("version"));
			OrderByClauseList orderBy = new OrderByClauseList( new OrderByClause(names, true) );
			IntegerLiteral one = new IntegerLiteral(1);
			IDocumentIterator result = store.fetchMany(context, one, one, filter, orderBy);
			return result.hasNext() ? result.next() : null;
		} else
			return store.fetchOne(context, filter); 
	}

	private IExpression buildFilter(String name, Version version) {
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

	private IDeclaration parseDeclaration(Context context, Document doc) throws Exception {
		if(doc==null)
			return null;
		Text value = (Text)doc.getMember(context, new Identifier("codeFormat"));
		Dialect dialect = Dialect.valueOf(value.getValue());
		value = (Text)doc.getMember(context, new Identifier("codeBody"));
		InputStream input = new ByteArrayInputStream(value.getValue().getBytes());
		DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
		return decls.isEmpty() ? null : decls.get(0);
	}


}
