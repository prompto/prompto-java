package presto.grammar;

import java.util.LinkedList;

import presto.declaration.ConcreteMethodDeclaration;
import presto.declaration.IDeclaration;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.utils.CodeWriter;


public class DeclarationList extends LinkedList<IDeclaration> {

	private static final long serialVersionUID = 1L;

	public DeclarationList() {
	}

	public DeclarationList(IDeclaration item) {
		this.add(item);
	}

	public void register(Context context) throws SyntaxError {
		for(IDeclaration declaration : this) {
			declaration.register(context);
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
