package prompto.store;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.expression.AndExpression;
import prompto.expression.EqualsExpression;
import prompto.expression.IExpression;
import prompto.grammar.EqOp;
import prompto.grammar.Identifier;
import prompto.grammar.UnresolvedIdentifier;
import prompto.literal.TextLiteral;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.DocumentType;
import prompto.utils.CodeWriter;
import prompto.value.Document;
import prompto.value.ListValue;
import prompto.value.Text;


public class DistributedCodeStore extends BaseCodeStore {

	IStore store; // data store where to store/fetch the code
	Context context; // used for querying the data store and parsing code
	String application;
	String version;
	
	public DistributedCodeStore(IStore store, ICodeStore next, String application, String version) {
		super(next);
		this.store = store;
		this.context = Context.newGlobalContext();
		this.application = application;
		this.version = version;
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
	public String getModuleVersion() {
		return version;
	}
	
	@Override
	public IDeclaration fetchLatestVersion(String name) {
		return fetchSpecificVersion(name, ICodeStore.LATEST);
	}
	
	@Override
	public IDeclaration fetchSpecificVersion(String name, String version) {
		IDeclaration decl = fetchInStore(name, version);
		if(decl==null) {
			decl = super.fetchLatestVersion(name);
			if(decl!=null && decl.getOrigin()!=null)
				storeInStore(decl);
		}
		return decl;
	}

	private void storeInStore(IDeclaration decl) {
		ICodeStore origin = decl.getOrigin();
		Context context = Context.newGlobalContext();
		Document doc = new Document();
		doc.setMember(context, new Identifier("type"),  new Text(origin.getModuleType().name()));
		doc.setMember(context, new Identifier("name"),  new Text(origin.getModuleName()));
		doc.setMember(context, new Identifier("version"),  new Text(origin.getModuleVersion()));
		storeInDocument(context, doc, decl, origin.getModuleDialect(), origin.getModuleVersion());
	}

	private void storeInDocument(Context context, Document doc, IDeclaration decl, Dialect dialect, String version) {
		if(decl instanceof MethodDeclarationMap) {
			for(IDeclaration d : ((MethodDeclarationMap)decl).values())
				storeInDocument(context, doc, d, dialect, version);
		} else {
			Document child = new Document();
			child.setMember(context, new Identifier("type"),  new Text(decl.getDeclarationType().name()));
			child.setMember(context, new Identifier("name"),  new Text(decl.getIdentifier().getName()));
			doc.setMember(context, new Identifier("version"),  new Text(version));
			if(decl instanceof IMethodDeclaration) {
				String proto = ((IMethodDeclaration)decl).getProto();
				child.setMember(context, new Identifier("proto"), new Text(proto));
			}
			child.setMember(context, new Identifier("format"),  new Text(dialect.name()));
			CodeWriter writer = new CodeWriter(dialect, context);
			decl.toDialect(writer);
			String content = writer.toString();
			child.setMember(context, new Identifier("content"),  new Text(content));
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

	private IDeclaration fetchInStore(String name, String version) {
		if(store==null)
			return null;
		IExpression filter = buildFilter(name, version);
		try {
			Document doc = store.fetchOne(context, filter); // TODO order by
			return parse(context, doc);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

	private IDeclaration parse(Context context, Document doc) throws Exception {
		if(doc==null)
			return null;
		Text value = (Text)doc.getMember(context, new Identifier("format"));
		Dialect dialect = Dialect.valueOf(value.getValue());
		value = (Text)doc.getMember(context, new Identifier("content"));
		InputStream input = new ByteArrayInputStream(value.getValue().getBytes());
		DeclarationList decls = ICodeStore.parse(dialect, "__store__", input);
		return decls.isEmpty() ? null : decls.get(0);
	}

	private IExpression buildFilter(String name, String version) {
		IExpression left = new UnresolvedIdentifier(new Identifier("name"));
		IExpression right = new TextLiteral("'" + name + "'");
		IExpression filter = new EqualsExpression(left, EqOp.ROUGHLY, right);
		if(!LATEST.equals(version)) {
			left = new UnresolvedIdentifier(new Identifier("version"));
			right = new TextLiteral("'" + version + "'");
			IExpression condition = new EqualsExpression(left, EqOp.EQUALS, right);
			filter = new AndExpression(filter, condition);
		} 
		return filter;
	}

}
