package prompto.code;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.parser.AbstractParser;
import prompto.parser.Dialect;
import prompto.parser.ECleverParser;
import prompto.parser.OCleverParser;
import prompto.parser.SCleverParser;
import prompto.type.CategoryType;
import prompto.utils.ISingleton;
import prompto.utils.Utils;
import prompto.value.IValue;
import prompto.value.Text;

/* a code store is a place where a code consumer (interpreter, compiler...) can fetch code from */
public interface ICodeStore {
	
	static ISingleton<ICodeStore> instance = new ISingleton<ICodeStore>() {
		ICodeStore instance = null;
		@Override public void set(ICodeStore instance) { this.instance = instance; }
		@Override public ICodeStore get() { return instance; }
	};
	
	static void setInstance(ICodeStore store) {
		instance.set(store);
	}

	public static ICodeStore getInstance() {
		return instance.get();
	}
	
	public static DeclarationList parse(String sourceName, InputStream data) throws Exception {
		Dialect dialect = dialectFromResourceName(sourceName);
		return parse(dialect, sourceName, data);
	}
	
	public static DeclarationList parse(Dialect dialect, String sourceName, InputStream data) throws Exception {
		AbstractParser parser = parserForDialect(dialect, sourceName, data);
		return parser.parse_declaration_list();
	}

	static AbstractParser parserForDialect(Dialect dialect, String path, InputStream data) throws IOException {
		switch(dialect) {
		case E:
			return new ECleverParser(path, data);
		case O:
			return new OCleverParser(path, data);
		case S:
			return new SCleverParser(path, data);
		default:
			throw new RuntimeException("Unsupported extension: " + path);
		}
	}

	public static Dialect dialectFromResourceName(String sourceName) {
		String s = "" + sourceName.charAt(sourceName.length()-2);
		return Dialect.valueOf(s.toUpperCase());
	}

	static final Version LATEST = Version.parse("-1.-1.-1");
	
	static public enum ModuleType {
		APPLICATION(Application.class), // which interacts with users through a UI
		SERVICE(Service.class), // back end service (web/messaging)
		LIBRARY(Library.class), // reusable classes and methods
		SCRIPT(Script.class); // script that can be scheduled or launched by user
		
		Class<? extends Module> moduleClass;
		
		ModuleType(Class<? extends Module> klass) {
			moduleClass = klass;
		}
		
		public Class<? extends Module> getModuleClass() {
			return moduleClass;
		}
		
		public Text asValue() {
			return new Text(this.name());
		}

		public CategoryType getCategory() {
			String capped = Utils.capitalizeFirst(name());
			return new CategoryType( new Identifier(capped));
		}
	}
	
	ModuleType getModuleType();
	Dialect getModuleDialect();
	String getModuleName();
	Version getModuleVersion();

	void storeDeclarations(Collection<IDeclaration> declarations, Dialect dialect, Version version, IValue projectId) throws PromptoError;
	IDeclaration fetchLatestVersion(String name) throws PromptoError;
	IDeclaration fetchSpecificVersion(String name, Version version) throws PromptoError;

	default public Application fetchApplication(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.APPLICATION, name, version);
	}
	
	default public Library fetchLibrary(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.LIBRARY, name, version);
	}
	
	default public Service fetchService(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.SERVICE, name, version);
	}

	default public Script fetchScript(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.SCRIPT, name, version);
	}
	
	<T extends Module> T fetchModule(ModuleType type, String name, Version version) throws PromptoError;
	void storeModule(Module module) throws PromptoError;

	void synchronizeSchema() throws PromptoError;
	void collectStorableAttributes(List<AttributeDeclaration> list);
}
