package prompto.code;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IEnumeratedDeclaration;
import prompto.error.InvalidResourceError;
import prompto.error.PromptoError;
import prompto.parser.Dialect;
import prompto.parser.ISection;
import prompto.utils.SectionLocator;

/* resource base code store used to bootstrap modules  */
public class ResourceCodeStore extends BaseCodeStore {

	ModuleType type;
	URL resource;
	Version version;
	Map<String, List<IDeclaration>> declarations = null;
	
	public ResourceCodeStore(ICodeStore next, ModuleType type, URL resource, String version) {
		super(next);
		if(resource==null)
			throw new NullPointerException();
		this.type = type;
		this.resource = resource;
		this.version = Version.parse(version);
	}

	@Override
	public ModuleType getModuleType() {
		return type;
	}
	
	@Override
	public Dialect getModuleDialect() {
		String external = resource.toExternalForm();
		char c = external.charAt(external.length()-2);
		return Dialect.valueOf(String.valueOf(c).toUpperCase());
	}
	
	@Override
	public String getModuleName() {
		String moduleName = resource.toExternalForm();
		int idx = moduleName.lastIndexOf('/');
		if(idx>=0)
			moduleName = moduleName.substring(idx+1);
		idx = moduleName.indexOf('.');
		if(idx>=0)
			moduleName = moduleName.substring(0, idx);
		return moduleName;
	}
	
	@Override
	public Version getModuleVersion() {
		return version;
	}
	
	@Override
	public void storeModule(Module module) throws PromptoError {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public <T extends Module> T fetchModule(ModuleType type, String name, Version version) throws PromptoError {
		return null;
	}
	
	@Override
	public void storeDeclarations(Iterator<IDeclaration> declarations, Dialect dialect, Version version, Object projectId) throws PromptoError {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Iterator<IDeclaration> fetchLatestVersions(String name) throws PromptoError {
		Iterator<IDeclaration> decls = fetchInResource(name);
		if(decls!=null)
			return decls;
		else
			return super.fetchLatestVersions(name);
	}
	
	@Override
	public Iterator<IDeclaration> fetchSpecificVersions(String name,Version version) throws PromptoError {
		Iterator<IDeclaration> decls = fetchInResource(name);
		if(decls!=null)
			return decls;
		else
			return super.fetchSpecificVersions(name, version);
	}
	
	@Override
	public IDeclaration fetchLatestSymbol(String name) throws PromptoError {
		IDeclaration decl = fetchSymbolInResource(name);
		if(decl!=null)
			return decl;
		else
			return super.fetchLatestSymbol(name);
	}
	
	@Override
	public IDeclaration fetchSpecificSymbol(String name, Version version) throws PromptoError {
		IDeclaration decl = fetchSymbolInResource(name);
		if(decl!=null)
			return decl;
		else
			return super.fetchSpecificSymbol(name, version);
	}
	
	private IDeclaration fetchSymbolInResource(String name) {
		loadResource();
		return declarations.values().stream()
				.flatMap(Collection::stream)
				.filter((d)->d instanceof IEnumeratedDeclaration)
				.map((d)->(IEnumeratedDeclaration<?>)d)
				.filter((d)->d.getSymbols().hasSymbol(name))
				.findFirst()
				.orElse(null);
	}

	@Override
	public ISection findSection(ISection section) {
		ISection result = fetchInResource(section);
		if(result!=null)
			return result;
		else
			return super.findSection(section);
	}
	


	private ISection fetchInResource(ISection section) {
		if(!resource.toExternalForm().equals(section.getFilePath()))
			return null;
		loadResource();
		return SectionLocator.findSectionInLists(declarations.values(), section);
				
	}

	private Iterator<IDeclaration> fetchInResource(String name) throws PromptoError {
		loadResource();
		List<IDeclaration> decls = declarations.get(name);
		return decls==null ? null : decls.iterator();
	}

	private void loadResource() throws PromptoError {
		try {
			if(declarations==null)
				tryLoadResource();
			if(declarations==null)
				throw new InvalidResourceError(resource.toExternalForm());
		} catch(PromptoError error) {
			throw error;
		}
	}

	private void tryLoadResource() {
		try(InputStream input = resource.openStream()) {
			if(input!=null)
				parseResource(input);
		} catch(PromptoError error) {
			throw error;
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}

	private void parseResource(InputStream input) throws Exception {
		DeclarationList decls = ICodeStore.parse(resource.toExternalForm(), input);
		declarations = new HashMap<String, List<IDeclaration>>();
		for(IDeclaration decl : decls) {
			decl.setOrigin(this);
			String name = decl.getId().toString();
			if(declarations.get(name)==null)
				declarations.put(name, new ArrayList<>());
			declarations.get(name).add(decl);
		}
	}

	public Iterator<IDeclaration> getDeclarations() {
		loadResource();
		return new Iterator<IDeclaration>() {
			
			Iterator<List<IDeclaration>> main = declarations.values().iterator();
			Iterator<IDeclaration> child = null;
			
			@Override 
			public boolean hasNext() {
				while(true) {
					if(child!=null) {
						if(child.hasNext())
							return true;
						else
							child = null;
					}
					if(child==null) {
						if(!main.hasNext())
							return false;
						else
							child = main.next().iterator();
					}
				}
			}
			
			@Override
			public IDeclaration next() {
				return child.next();
			}
		};
	}
	
	@Override
	public void collectStorableAttributes(Map<String, AttributeDeclaration> columns) throws PromptoError {
		super.collectStorableAttributes(columns);
		loadResource();
		declarations.values().forEach( (decls) -> {
			decls.stream().filter( (decl) -> decl instanceof AttributeDeclaration)
			.filter( (decl) -> ((AttributeDeclaration)decl).isStorable())
			.forEach( (decl) -> columns.put(decl.getName(), (AttributeDeclaration)decl));
		});
	}
	
	@Override
	public Collection<String> fetchDeclarationNames() {
		loadResource();
		if(next==null)
			return declarations.keySet();
		else {
			Set<String> names = new HashSet<>();
			names.addAll(declarations.keySet());
			names.addAll(next.fetchDeclarationNames());
			return names;
		}
	}
}
