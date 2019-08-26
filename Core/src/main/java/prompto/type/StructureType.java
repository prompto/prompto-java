package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.Structure;
import prompto.runtime.Context;
import prompto.store.Family;

public class StructureType extends BaseType {

	Structure structure;
	
	public StructureType(Structure structure) {
		super(Family.STRUCTURE);
		this.structure = structure;
	}
	
	public Structure getStructure() {
		return structure;
	}

	@Override
	public Type getJavaType(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void checkUnique(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void checkExists(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		throw new UnsupportedOperationException();
	}

}
