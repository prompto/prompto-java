package prompto.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;

/* a code store which simply links to another one */
/* enables multiple code store implementations (resource, classpath, store...) */
/* also enables versioning, by having the latest version as root */
public abstract class BaseCodeStore implements ICodeStore {

	ICodeStore next;
	
	protected BaseCodeStore(ICodeStore next) {
		this.next = next;
	}
	
	public ICodeStore getNext() {
		return next;
	}
	
	public void setNext(ICodeStore next) {
		this.next = next;
	}
	
	@Override
	public ICodeSection findCodeSection(ISection section) { 
		return next==null ? null : next.findCodeSection(section);
	}
	
	@Override
	public Collection<String> fetchDeclarationNames() {
		return next==null ? Collections.emptyList() : next.fetchDeclarationNames();
	}
	
	@Override
	public Iterable<IDeclaration> fetchLatestDeclarations(String name) throws PromptoError {
		Iterable<IDeclaration> decls = ICodeStore.super.fetchLatestDeclarations(name);
		return decls != null ? decls : (next==null ? null : next.fetchLatestDeclarations(name));
	}
	
	@Override
	public Collection<CategoryDeclaration> fetchDerivedCategoryDeclarations(Identifier id) {
		return next==null ? Collections.emptyList() : next.fetchDerivedCategoryDeclarations(id);
	}
	
	@Override
	public Iterable<IDeclaration> fetchVersionedDeclarations(String name, PromptoVersion version) throws PromptoError {
		return next==null ? null : next.fetchVersionedDeclarations(name, version);
	}
	
	@Override
	public NativeCategoryDeclaration fetchLatestNativeCategoryDeclarationWithJavaBinding(String typeName) {
		return next==null ? null : next.fetchLatestNativeCategoryDeclarationWithJavaBinding(typeName);
	}

	@Override
	public Resource fetchResource(String path) throws PromptoError {
		return next==null ? null : next.fetchResource(path);
	}
	
	@Override
	public final Iterable<Resource> fetchResourcesWithMimeTypes(String ... mimeTypes) {
		List<Resource> resources = new ArrayList<>();
		doFetchLatestResourcesWithMimeTypes(resources, new HashSet<>(Arrays.asList(mimeTypes)));
		return resources;
	}
	
	protected abstract void doFetchLatestResourcesWithMimeTypes(List<Resource> resources, Set<String> mimeTypes);

	@Override
	public IDeclaration fetchLatestSymbol(String name) throws PromptoError {
		IDeclaration decl = ICodeStore.super.fetchLatestSymbol(name);
		return decl != null ? decl : (next==null ? null : next.fetchLatestSymbol(name));
	}
	
	@Override
	public IDeclaration fetchVersionedSymbol(String name, PromptoVersion version) throws PromptoError {
		return next==null ? null : next.fetchVersionedSymbol(name, version);
	}

	@Override
	public void collectStorableAttributes(Map<String, AttributeDeclaration> columns) throws PromptoError {
		if(next!=null)
			next.collectStorableAttributes(columns);
		
	}
	
	@Override
	public void setMainModule(String name, PromptoVersion version) {
		if(name!=null && version!=null)
			registerModule(name, version);
	}

	private void registerModule(String name, PromptoVersion version) {
		Module module = fetchModule(name, version);
		if(module!=null) try {
			ICodeStore.addModuleDbId(module.getDbId());
			if(module.getDependencies()!=null)
				module.getDependencies().forEach(this::registerModule);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void registerModule(Dependency dependency) {
		registerModule(dependency.getName(), dependency.getVersion());
	}
	
	protected abstract Module fetchModule(String name, PromptoVersion version);
	
	@Override
	public void upgradeIfRequired() {
		if(next!=null)
			next.upgradeIfRequired();
	}

}
