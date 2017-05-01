package prompto.code;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.parser.ISection;

/* a code store which simply links to another one */
/* enables multiple code store implementations (resource, classpath, store...) */
/* also enables versioning, by having the latest version as root */
public abstract class BaseCodeStore implements ICodeStore {

	ICodeStore next;
	
	protected BaseCodeStore(ICodeStore next) {
		this.next = next;
	}
	
	@Override
	public ISection findSection(ISection section) { 
		return next==null ? null : next.findSection(section);
	}
	
	@Override
	public Collection<String> fetchDeclarationNames() {
		return next==null ? Collections.emptyList() : next.fetchDeclarationNames();
	}
	
	@Override
	public Iterator<IDeclaration> fetchLatestDeclarations(String name) throws PromptoError {
		return next==null ? null : next.fetchLatestDeclarations(name);
	}
	
	@Override
	public Iterator<IDeclaration> fetchSpecificDeclarations(String name, Version version) throws PromptoError {
		return next==null ? null : next.fetchSpecificDeclarations(name, version);
	}
	
	@Override
	public IDeclaration fetchLatestSymbol(String name) throws PromptoError {
		return next==null ? null : next.fetchLatestSymbol(name);
	}
	
	@Override
	public IDeclaration fetchSpecificSymbol(String name, Version version) throws PromptoError {
		return next==null ? null : next.fetchSpecificSymbol(name, version);
	}

	@Override
	public void collectStorableAttributes(Map<String, AttributeDeclaration> columns) throws PromptoError {
		if(next!=null)
			next.collectStorableAttributes(columns);
		
	}

}