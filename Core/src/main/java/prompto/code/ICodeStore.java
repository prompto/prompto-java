package prompto.code;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.StreamSupport;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.AbstractParser;
import prompto.parser.Dialect;
import prompto.parser.ECleverParser;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.parser.MCleverParser;
import prompto.parser.OCleverParser;
import prompto.runtime.Context;
import prompto.store.AttributeInfo;
import prompto.utils.ISingleton;

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
	
	static Set<Object> moduleDbIds = new HashSet<>();
	
	static void addModuleDbId(Object dbId) {
		moduleDbIds.add(dbId);
	}

	public static Set<Object> getModuleDbIds() {
		return moduleDbIds;
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

	static Set<String> CODE_EXTENSIONS = new HashSet<>(Arrays.asList("pec", "poc", "pmc"));

	static Dialect dialectFromResourceName(String path) {
		int startExtension = path.lastIndexOf(".");
		String extension = path.substring(startExtension + 1).toLowerCase();
		if(!CODE_EXTENSIONS.contains(extension))
			return null;
		String s = "" + extension.charAt(1);
		return Dialect.valueOf(s.toUpperCase());
	}



	ModuleType getModuleType();
	Dialect getModuleDialect();
	String getModuleName();
	PromptoVersion getModuleVersion();

	void storeDeclarations(Iterable<IDeclaration> declarations, Dialect dialect, PromptoVersion version, Object moduleId) throws PromptoError;

	default Iterable<IDeclaration> fetchLatestDeclarations(String name) throws PromptoError {
		return fetchVersionedDeclarations(name, PromptoVersion.LATEST);
	}
	
	Iterable<IDeclaration> fetchVersionedDeclarations(String name, PromptoVersion version) throws PromptoError;

	Iterable<IDeclaration> fetchDeclarationsWithAnnotations(Set<String> annotations);

	default IDeclaration fetchLatestSymbol(String name) throws PromptoError {
		return fetchVersionedSymbol(name, PromptoVersion.LATEST);
	}

	IDeclaration fetchVersionedSymbol(String name, PromptoVersion version) throws PromptoError;


	Collection<CategoryDeclaration> fetchDerivedCategoryDeclarations(Identifier id);

	
	default public Batch fetchVersionedBatch(String name, PromptoVersion version) throws PromptoError {
		return fetchVersionedModule(ModuleType.BATCH, name, version);
	}
	
	default public WebSite fetchVersionedApplication(String name, PromptoVersion version) throws PromptoError {
		return fetchVersionedModule(ModuleType.WEBSITE, name, version);
	}
	
	default public Script fetchVersionedScript(String name, PromptoVersion version) throws PromptoError {
		return fetchVersionedModule(ModuleType.SCRIPT, name, version);
	}
	
	default public Service fetchVersionedService(String name, PromptoVersion version) throws PromptoError {
		return fetchVersionedModule(ModuleType.SERVICE, name, version);
	}

	default public Library fetchVersionedLibrary(String name, PromptoVersion version) throws PromptoError {
		return fetchVersionedModule(ModuleType.LIBRARY, name, version);
	}
	
	default public Script fetchThesaurus(PromptoVersion version) throws PromptoError {
		return fetchVersionedModule(ModuleType.THESAURUS, ModuleType.THESAURUS.name(), version);
	}
	
	public Iterable<Module> fetchAllModules() throws PromptoError;
	<T extends Module> T fetchVersionedModule(ModuleType type, String name, PromptoVersion version) throws PromptoError;
	Object fetchVersionedModuleDbId(String name, PromptoVersion version) throws PromptoError;
	void storeModule(Module module) throws PromptoError;
	void dropModule(Module module);
	void storeDependency(Dependency dependency);


	void setMainModule(String name, PromptoVersion version);

	void collectStorableAttributes(Map<String, AttributeDeclaration> columns) throws PromptoError;

	ICodeSection findCodeSection(ISection section);
	default ISection findSection(ISection section) {
		ICodeSection codeSection = findCodeSection(section);
		return codeSection==null ? null : codeSection.getSection();
	}

    Collection<String> fetchDeclarationNames();

	void storeResource(Resource resource, Object moduleId);

	default public Resource fetchLatestResource(String path) throws PromptoError {
		return fetchVersionedResource(path, PromptoVersion.LATEST);
	}

	Resource fetchVersionedResource(String path, PromptoVersion version);
	
	default public AttributeInfo fetchLatestAttributeInfo(Context context, String name) {
		if("category".equals(name))
			return AttributeInfo.CATEGORY;
		else {
			Iterable<IDeclaration> decls = fetchLatestDeclarations(name);
			if(decls==null)
				return null;
			else return StreamSupport.stream(decls.spliterator(), false)
					.filter(d->d instanceof AttributeDeclaration)
					.map(d->(AttributeDeclaration)d)
					.map(d->d.getAttributeInfo(context))
					.findFirst()
					.orElse(null);
		}
	}

	void upgradeIfRequired();

	NativeCategoryDeclaration fetchLatestNativeCategoryDeclarationWithJavaBinding(String typeName);


}
