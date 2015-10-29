package prompto.store;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import prompto.declaration.DeclarationList;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.parser.Dialect;
import prompto.runtime.Context.MethodDeclarationMap;

/* class used to bootstrap modules from resources */
public class ResourceCodeStore extends BaseCodeStore {

	ModuleType type;
	String resourceName;
	Version version;
	Map<String, IDeclaration> declarations = null;
	
	public ResourceCodeStore(ICodeStore next, ModuleType type, String resourceName, String version) throws Exception {
		super(next);
		this.type = type;
		this.resourceName = resourceName;
		this.version = Version.parse(version);
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
		return resourceName.substring(0, resourceName.indexOf('.'));
	}
	
	@Override
	public Version getModuleVersion() {
		return version;
	}
	
	@Override
	public IDeclaration fetchLatestVersion(String name) throws PromptoError {
		IDeclaration decl = fetchInResource(name);
		if(decl!=null)
			return decl;
		else
			return super.fetchLatestVersion(name);
	}
	
	@Override
	public IDeclaration fetchSpecificVersion(String name,Version version) throws PromptoError {
		IDeclaration decl = fetchInResource(name);
		if(decl!=null)
			return decl;
		else
			return super.fetchSpecificVersion(name, version);
	}

	private IDeclaration fetchInResource(String name) {
		loadResource();
		return declarations.get(name);
	}

	private void loadResource() {
		if(declarations==null) try {
			InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
			DeclarationList decls = ICodeStore.parse(resourceName, input);
			declarations = new HashMap<String, IDeclaration>();
			for(IDeclaration decl : decls) {
				decl.setOrigin(this);
				String name = decl.getIdentifier().getName();
				if(decl instanceof IMethodDeclaration) {
					MethodDeclarationMap protos = (MethodDeclarationMap)declarations.get(name);
					if(protos==null) {
						protos = new MethodDeclarationMap(decl.getIdentifier());
						protos.setOrigin(this);
						declarations.put(name, protos);
					}
					protos.register((IMethodDeclaration)decl, null);
				} else
					declarations.put(name, decl);
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
