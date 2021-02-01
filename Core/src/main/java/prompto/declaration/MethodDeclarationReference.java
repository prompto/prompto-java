package prompto.declaration;

public class MethodDeclarationReference extends MethodDeclarationWrapper {

	public MethodDeclarationReference(IMethodDeclaration wrapped) {
		super(wrapped);
	}

	@Override
	public boolean isReference() {
		return true;
	}

}
