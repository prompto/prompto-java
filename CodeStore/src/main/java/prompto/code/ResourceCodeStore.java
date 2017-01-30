package prompto.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.error.InvalidResourceError;
import prompto.error.PromptoError;
import prompto.parser.Dialect;
import prompto.parser.ISection;
import prompto.utils.SectionLocator;

/* resource base code store used to bootstrap modules  */
public class ResourceCodeStore extends BaseCodeStore {

	ModuleType type;
	String resourceName;
	Version version;
	Map<String, List<IDeclaration>> declarations = null;
	
	public ResourceCodeStore(ICodeStore next, ModuleType type, String resourceName, String version) {
		super(next);
		this.type = type;
		this.resourceName = trim(resourceName);
		this.version = Version.parse(version);
	}

	private static String trim(String resourceName) {
		if(resourceName.startsWith("\""))
			resourceName = resourceName.substring(1);
		if(resourceName.endsWith("\""))
			resourceName = resourceName.substring(0, resourceName.length() - 1);
		return resourceName;
	}

	@Override
	public ModuleType getModuleType() {
		return type;
	}
	
	@Override
	public Dialect getModuleDialect() {
		String s = "" + resourceName.charAt(resourceName.length()-2);
		return Dialect.valueOf(s.toUpperCase());
	}
	
	@Override
	public String getModuleName() {
		String moduleName = resourceName;
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
	public ISection findSection(ISection section) {
		ISection result = fetchInResource(section);
		if(result!=null)
			return result;
		else
			return super.findSection(section);
	}
	


	private ISection fetchInResource(ISection section) {
		System.err.println("fetchInResource " + resourceName);
		System.err.println("sectionPath " + section.getPath());
		if(!resourceName.equals(section.getPath()))
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
				tryLoadFile();
			if(declarations==null)
				throw new InvalidResourceError(resourceName);
		} catch(PromptoError error) {
			throw error;
		}
	}

	private void tryLoadFile() {
		File file = new File(resourceName);
		if(file.exists()) {
			try(InputStream input = new FileInputStream(file)) {
				parseResource(input);
			} catch(PromptoError error) {
				throw error;
			} catch(Exception e) {
				throw new InternalError(e);
			}
		}
	}

	private void tryLoadResource() {
		try(InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName)) {
			if(input!=null)
				parseResource(input);
		} catch(PromptoError error) {
			throw error;
		} catch(Exception e) {
			throw new InternalError(e);
		}
	}

	private void parseResource(InputStream input) throws Exception {
		DeclarationList decls = ICodeStore.parse(resourceName, input);
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
}
