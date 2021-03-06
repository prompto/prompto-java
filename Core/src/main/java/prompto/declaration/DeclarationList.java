package prompto.declaration;

import java.util.LinkedList;

import prompto.runtime.Context;
import prompto.utils.CodeWriter;


public class DeclarationList extends LinkedList<IDeclaration> {

	private static final long serialVersionUID = 1L;

	public DeclarationList() {
	}

	public DeclarationList(IDeclaration item) {
		this.add(item);
	}

	@Override
	public boolean add(IDeclaration decl) {
		if(decl!=null)
			return super.add(decl);
		else
			return false;
	}
	
	public void register(Context context) {
		// register attributes first, since they may be required by other declarations
		registerAttributes(context);
		// ok now
		registerCategories(context);
		registerEnumerated(context);
		registerMethods(context);
		registerTests(context);
	}
	
	private void registerTests(Context context) {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof TestMethodDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerMethods(Context context) {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof IMethodDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerEnumerated(Context context) {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof EnumeratedNativeDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerCategories(Context context) {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof CategoryDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerAttributes(Context context) {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof AttributeDeclaration))::iterator) {
			d.register(context);
		}
	}

	public void check(Context context) {
		for(IDeclaration declaration : this) {
			if(declaration instanceof IMethodDeclaration)
				((IMethodDeclaration)declaration).check(context, true);
			else
				declaration.check(context);
		}
	}
	
	public ConcreteMethodDeclaration findMain() {
		for(IDeclaration declaration : this) {
			if(!(declaration instanceof ConcreteMethodDeclaration))
				continue;
			ConcreteMethodDeclaration method = (ConcreteMethodDeclaration)declaration;
			if(!(method.getName().equals("main")))
				continue;
			// TODO check proto
			return method;
		}
		return null;
	}

	public void toDialect(CodeWriter writer) {
		for(IDeclaration declaration : this) {
			declaration.toDialect(writer);
			writer.append("\n");
		}
	}
	

}
