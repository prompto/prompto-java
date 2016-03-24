package prompto.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import prompto.code.ICodeStore.ModuleType;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.IStore;
import prompto.type.BooleanType;
import prompto.type.DateTimeType;
import prompto.type.IType;
import prompto.type.ListType;
import prompto.type.TextType;
import prompto.utils.IdentifierList;

// use a dedicated bootstrapper to ensure app and code store contexts do not spill
public class CodeStoreBootstrapper {

	public static Context bootstrap(IStore<?> store, ICodeStore runtime) throws PromptoError {
		System.out.println("Initializing code store...");
		CodeStoreBootstrapper bs = new CodeStoreBootstrapper(store, runtime);
		bs.bootstrap();
		return bs.context;
	}
	
	Context context = Context.newGlobalContext();
	ICodeStore next;
	IStore<?> store;
	
	private CodeStoreBootstrapper(IStore<?> store, ICodeStore runtime) {
		this.store = store;
		this.next = new ResourceCodeStore(runtime, ModuleType.LIBRARY, "CodeStore.pec", "1.0.0");
	}

	private void bootstrap() throws PromptoError {
		Collection<AttributeDeclaration> columns = getMinimalColumns(store);
		columns = fetchLatestDeclarations(columns);
		registerColumnAttributes(columns);
		store.createOrUpdateColumns(columns);
	}

	private void registerColumnAttributes(Collection<AttributeDeclaration> columns) throws PromptoError {
		for(AttributeDeclaration column : columns)
			column.register(context);
	}

	private List<AttributeDeclaration> fetchLatestDeclarations(Collection<AttributeDeclaration> decls) throws PromptoError {
		try {
			return decls.stream().map((d) -> fetchLatestDeclaration(d)).collect(Collectors.toList());
		} catch (RuntimeException e) {
			if(e.getCause() instanceof PromptoError)
				throw (PromptoError)e.getCause();
			else
				throw e;
		}
	}

	static final Set<String> reserved = new HashSet<>(Arrays.asList(IStore.dbIdName, "category", "storable", "module"));
	
	private AttributeDeclaration fetchLatestDeclaration(AttributeDeclaration column) {
		try {
			// can't write a declaration for a column with a reserved name, so use the hard coded one
			if(reserved.contains(column.getName()))
				return column;
			Iterator<IDeclaration> decls = next.fetchLatestVersions(column.getName());
			IDeclaration decl = decls==null ? null : decls.next(); // can only get one attribute
			if(!(decl instanceof AttributeDeclaration))
				throw new RuntimeException("Invalid column attribute: " + column.getName());
			return (AttributeDeclaration)decl;
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
	}

	private Collection<AttributeDeclaration> getMinimalColumns(IStore<?> store) {
		IType dbIdIType = IType.typeToIType(store.getDbIdType());
		List<AttributeDeclaration> columns = new ArrayList<AttributeDeclaration>();
		// attributes with reserved names, the below declarations will be used
		columns.add(new AttributeDeclaration(IStore.dbIdIdentifier, dbIdIType));
		columns.add(new AttributeDeclaration(new Identifier("storable"), BooleanType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("category"), 
				new ListType(TextType.instance()), new IdentifierList(new Identifier("key"))));
		// also add 'module' to avoid dependency on DevCenter
		columns.add(new AttributeDeclaration(new Identifier("module"), dbIdIType));
		// more required attributes which will be overridden by a prompto declaration
		columns.add(new AttributeDeclaration(new Identifier("author"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("timeStamp"), DateTimeType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("name"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("description"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("version"), TextType.instance())); // TODO add VersionType ?
		columns.add(new AttributeDeclaration(new Identifier("prototype"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("dialect"), TextType.instance()));
		columns.add(new AttributeDeclaration(new Identifier("body"), TextType.instance()));
		return columns;
	}


}
