package presto.value;

import java.util.Set;

import presto.declaration.ConcreteCategoryDeclaration;
import presto.grammar.Identifier;
import presto.type.CategoryType;


public interface IInstance extends IValue {

	CategoryType getType();
	Set<Identifier> getMemberNames();
	boolean setMutable(boolean set);
	ConcreteCategoryDeclaration getDeclaration();
	
}
