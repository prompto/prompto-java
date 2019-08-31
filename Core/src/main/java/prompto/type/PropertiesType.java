package prompto.type;

import java.lang.reflect.Type;

import prompto.grammar.PropertyMap;
import prompto.runtime.Context;
import prompto.store.Family;

/* transient type for holding child property structure */
public class PropertiesType extends BaseType {

	PropertyMap properties;
	
	public PropertiesType(PropertyMap properties) {
		super(Family.PROPERTIES);
		this.properties = properties;
	}
	
	public PropertyMap getProperties() {
		return properties;
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
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		if(other instanceof DocumentType)
			return true;
		else
			return super.isAssignableFrom(context, other);
	}

}
