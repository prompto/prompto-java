package prompto.code;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.parser.AbstractParser;
import prompto.parser.Dialect;
import prompto.parser.ECleverParser;
import prompto.parser.ISection;
import prompto.parser.OCleverParser;
import prompto.parser.MCleverParser;
import prompto.type.CategoryType;
import prompto.utils.ISingleton;
import prompto.utils.StringUtils;

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
		case M:
			return new MCleverParser(path, data);
		default:
			throw new RuntimeException("Unsupported extension: " + path);
		}
	}

	public static Dialect dialectFromResourceName(String sourceName) {
		String s = "" + sourceName.charAt(sourceName.length()-2);
		return Dialect.valueOf(s.toUpperCase());
	}

	static final Version LATEST_VERSION = Version.parse("-1.-1.-1");
	
	static public enum ModuleType {
		THESAURUS(Thesaurus.class), // storable attributes and categories
		LIBRARY(Library.class), // reusable classes and methods
		BATCH(Batch.class), // which can be scheduled
		SCRIPT(Script.class), // which has no entry point
		SERVICE(Service.class), // back end only web service (must be hosted)
		WEBSITE(WebSite.class); // full fledged web app (must be hosted)
		
		Class<? extends Module> moduleClass;
		
		ModuleType(Class<? extends Module> klass) {
			moduleClass = klass;
		}
		
		public Class<? extends Module> getModuleClass() {
			return moduleClass;
		}
		
		public CategoryType getCategory() {
			// THESAURUS is only a specific type of LIBRARY for use by Importer
			String name = this==THESAURUS ? LIBRARY.name() : this.name();
			String capped = StringUtils.capitalizeFirst(name);
			return new CategoryType( new Identifier(capped));
		}
	}
	
	ModuleType getModuleType();
	Dialect getModuleDialect();
	String getModuleName();
	Version getModuleVersion();

	void storeDeclarations(Iterator<IDeclaration> declarations, Dialect dialect, Version version, Object projectId) throws PromptoError;

	default Iterator<IDeclaration> fetchLatestVersions(String name) throws PromptoError {
		return fetchSpecificVersions(name, ICodeStore.LATEST_VERSION);
	}
	
	Iterator<IDeclaration> fetchSpecificVersions(String name, Version version) throws PromptoError;

	default IDeclaration fetchLatestSymbol(String name) throws PromptoError {
		return fetchSpecificSymbol(name, ICodeStore.LATEST_VERSION);
	}

	IDeclaration fetchSpecificSymbol(String name, Version version) throws PromptoError;

	default public Batch fetchBatch(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.BATCH, name, version);
	}
	
	default public WebSite fetchApplication(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.WEBSITE, name, version);
	}
	
	default public Script fetchScript(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.SCRIPT, name, version);
	}
	
	default public Service fetchService(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.SERVICE, name, version);
	}

	default public Library fetchLibrary(String name, Version version) throws PromptoError {
		return fetchModule(ModuleType.LIBRARY, name, version);
	}
	
	default public Script fetchThesaurus(Version version) throws PromptoError {
		return fetchModule(ModuleType.THESAURUS, ModuleType.THESAURUS.name(), version);
	}
	
	<T extends Module> T fetchModule(ModuleType type, String name, Version version) throws PromptoError;
	void storeModule(Module module) throws PromptoError;

	void collectStorableAttributes(Map<String, AttributeDeclaration> columns) throws PromptoError;

	ISection findSection(ISection section);

    Collection<String> fetchDeclarationNames();

}
