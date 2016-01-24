package prompto.value;

import java.util.List;
import java.util.Set;

import prompto.declaration.ConcreteCategoryDeclaration;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.store.IStorable;
import prompto.type.CategoryType;


public interface IInstance extends IValue {

	CategoryType getType();
	Set<Identifier> getMemberNames();
	boolean setMutable(boolean set);
	ConcreteCategoryDeclaration getDeclaration();
	IStorable getStorable();
	void collectStorables(List<IStorable> list) throws PromptoError;
	
}
