package presto.grammar;

import java.util.LinkedList;

import presto.type.IType;


public class TypeList extends LinkedList<IType> {

	private static final long serialVersionUID = 1L;

	public TypeList() {
	}
	
	public TypeList(IType type) {
		this.add(type);
	}

	
}
