package prompto.value;

import java.util.Set;

import prompto.declaration.CategoryDeclaration;
import prompto.grammar.Identifier;
import prompto.store.IStorable;
import prompto.type.CategoryType;


public interface IInstance extends IValue {

	CategoryType getType();
	Set<Identifier> getMemberIds();
	boolean setMutable(boolean set);
	CategoryDeclaration getDeclaration();
	IStorable getStorable();
	IInstance toMutable();
	
}
