package prompto.value;

import java.util.Set;

import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.grammar.Identifier;
import prompto.store.IStorable;
import prompto.type.CategoryType;


public interface IInstance extends IValue {

	@Override
	CategoryType getType();
	Set<Identifier> getMemberIds();
	boolean setMutable(boolean set);
	ConcreteCategoryDeclaration getDeclaration();
	IStorable getStorable();
	IValue toMutable();
	
}
