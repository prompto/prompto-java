package presto.grammar;

import java.util.LinkedList;

import presto.declaration.ICategoryMethodDeclaration;

public class CategoryMethodDeclarationList extends LinkedList<ICategoryMethodDeclaration> {

	private static final long serialVersionUID = 1L;

	public CategoryMethodDeclarationList() {
	}

	public CategoryMethodDeclarationList(ICategoryMethodDeclaration method) {
		this.add(method);
	}

		
}
