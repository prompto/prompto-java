package prompto.declaration;

import java.util.LinkedList;

import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.statement.CommentStatement;
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
	
	public void register(Context context) throws SyntaxError {
		// register attributes first, since they may be required by other declarations
		registerAttributes(context);
		// ok now
		registerCategories(context);
		registerEnumerated(context);
		registerMethods(context);
		registerTests(context);
	}
	
	private void registerTests(Context context) throws SyntaxError {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof TestMethodDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerMethods(Context context) throws SyntaxError {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof IMethodDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerEnumerated(Context context) throws SyntaxError {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof EnumeratedNativeDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerCategories(Context context) throws SyntaxError {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof CategoryDeclaration))::iterator) {
			d.register(context);
		}
	}

	private void registerAttributes(Context context) throws SyntaxError {
		for(IDeclaration d : (Iterable<IDeclaration>)this.stream().filter(d -> (d instanceof AttributeDeclaration))::iterator) {
			d.register(context);
		}
	}

	public void check(Context context) throws SyntaxError {
		for(IDeclaration declaration : this) {
			declaration.check(context);
		}
	}
	
	public ConcreteMethodDeclaration findMain() {
		for(IDeclaration declaration : this) {
			if(!(declaration instanceof ConcreteMethodDeclaration))
				continue;
			ConcreteMethodDeclaration method = (ConcreteMethodDeclaration)declaration;
			if(!(method.getId().equals("main")))
				continue;
			// TODO check proto
			return method;
		}
		return null;
	}

	public void toDialect(CodeWriter writer) {
		for(IDeclaration declaration : this) {
			if(declaration.getComments()!=null) {
				for(CommentStatement comment : declaration.getComments())
					comment.toDialect(writer);
			}
			declaration.toDialect(writer);
			writer.append("\n");
		}
	}
	

}
