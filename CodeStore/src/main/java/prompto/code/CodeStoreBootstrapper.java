package prompto.code;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.store.IStore;
import prompto.type.BlobType;
import prompto.type.BooleanType;
import prompto.type.DateTimeType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.IdentifierList;
import prompto.utils.Logger;
import prompto.utils.TypeUtils;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class CodeStoreBootstrapper {

	static final Logger logger = new Logger();
	
	public static Context bootstrap(IStore store, ICodeStore runtime) throws PromptoError {
		logger.info(()->"Initializing code store...");
		CodeStoreBootstrapper bs = new CodeStoreBootstrapper(store, runtime);
		bs.bootstrap();
		return bs.context;
	}
	
	Context context = Context.newGlobalsContext();
	ICodeStore next;
	IStore store;
	
	private CodeStoreBootstrapper(IStore store, ICodeStore runtime) {
		this.store = store;
		URL url = Thread.currentThread().getContextClassLoader().getResource("libraries/CodeStore.pec");
		this.next = new ImmutableCodeStore(runtime, ModuleType.LIBRARY, url, PromptoVersion.parse("1.0.0"));
	}

	private void bootstrap() throws PromptoError {
		Map<String, AttributeDeclaration> columns = getMinimalColumns(store);
		columns = fetchLatestDeclarations(columns);
		registerColumnAttributes(columns.values());
		if(store!=null) {
			Function<Identifier, IDeclaration> locator = id -> {
				Iterator<IDeclaration> decls = next.fetchDeclarations(id.toString()).iterator();
				return decls.hasNext() ? decls.next() : null;
			};
			List<AttributeInfo> infos = columns.values().stream().map(c->c.getAttributeInfo(context, locator)).collect(Collectors.toList());
			store.createOrUpdateAttributes(infos);
		}
	}

	private void registerColumnAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		for(AttributeDeclaration column : columns)
			column.register(context);
	}

	private Map<String, AttributeDeclaration> fetchLatestDeclarations(Map<String, AttributeDeclaration> decls) throws PromptoError {
		try {
			Map<String, AttributeDeclaration> latest = new HashMap<>();
			for(Map.Entry<String, AttributeDeclaration> entry : decls.entrySet())
				latest.put(entry.getKey(), fetchAttributeDeclaration(entry.getValue()));
			return latest;
		} catch (RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	static final Set<String> reserved = new HashSet<>(Arrays.asList(IStore.dbIdName, "category", "storable", "module"));
	
	private AttributeDeclaration fetchAttributeDeclaration(AttributeDeclaration column) {
		try {
			// can't write a declaration for a column with a reserved name, so use the hard coded one
			if(reserved.contains(column.getName()))
				return column;
			Iterable<IDeclaration> decls = next.fetchDeclarations(column.getName());
			if(decls==null || !decls.iterator().hasNext())
				throw new RuntimeException("Invalid column attribute: " + column.getName());
			IDeclaration decl = decls.iterator().next(); // can only get one attribute
			if(!(decl instanceof AttributeDeclaration))
				throw new RuntimeException("Invalid column attribute: " + column.getName());
			return (AttributeDeclaration)decl;
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	private Map<String, AttributeDeclaration> getMinimalColumns(IStore store) {
		final IType dbIdIType = store==null ? IntegerType.instance() : TypeUtils.typeToIType(store.getNativeDbIdClass());
		return Stream.of(
				// attributes with reserved names, the below declarations will be used
				new AttributeDeclaration(new Identifier(IStore.dbIdName), dbIdIType),
				new AttributeDeclaration(new Identifier("storable"), BooleanType.instance()),
				new AttributeDeclaration(new Identifier("category"), 
						new ListType(TextType.instance()), new IdentifierList(new Identifier("key"))),
				// also add 'module' to avoid dependency on DevCenter
				new AttributeDeclaration(new Identifier("module"), dbIdIType),
				// more required attributes which will be overridden by a prompto declaration
				new AttributeDeclaration(new Identifier("author"), TextType.instance()),
				new AttributeDeclaration(new Identifier("timeStamp"), DateTimeType.instance()),
				new AttributeDeclaration(new Identifier("name"), TextType.instance()),
				new AttributeDeclaration(new Identifier("description"), TextType.instance()),
				new AttributeDeclaration(new Identifier("version"), TextType.instance()), // TODO add VersionType ?
				new AttributeDeclaration(new Identifier("prototype"), TextType.instance()),
				new AttributeDeclaration(new Identifier("dialect"), TextType.instance()),
				new AttributeDeclaration(new Identifier("body"), TextType.instance()),
				new AttributeDeclaration(new Identifier("data"), BlobType.instance()),
				new AttributeDeclaration(new Identifier("mimeType"), TextType.instance()),
				new AttributeDeclaration(new Identifier("moduleStatus"), TextType.instance()), // for bootstrapping TextType is good enough
				new AttributeDeclaration(new Identifier("parked"), BooleanType.instance()))
			.map(attr->attr.withStorable(true))
			.collect(Collectors.toMap(attr->attr.getName(), Function.identity()));
	}


}
