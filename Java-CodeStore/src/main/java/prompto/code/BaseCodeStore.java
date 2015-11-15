package prompto.code;

import java.util.List;

import prompto.code.ICodeStore;
import prompto.code.Version;
import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;

/* a code store which simply links to another one */
/* enables multiple code stores (resource, classpath, store...) */
/* also enables versioning, by having the latest version as root */
public abstract class BaseCodeStore implements ICodeStore {

	ICodeStore next;
	
	protected BaseCodeStore(ICodeStore next) {
		this.next = next;
	}
	
	@Override
	public IDeclaration fetchLatestVersion(String name) throws PromptoError {
		return next==null ? null : next.fetchLatestVersion(name);
	}
	
	@Override
	public IDeclaration fetchSpecificVersion(String name, Version version) throws PromptoError {
		return next==null ? null : next.fetchSpecificVersion(name, version);
	}
	
	@Override
	public void collectStorableAttributes(List<AttributeDeclaration> list) {
		if(next!=null)
			next.collectStorableAttributes(list);
		
	}

}
