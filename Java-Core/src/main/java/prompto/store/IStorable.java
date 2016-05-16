package prompto.store;

import prompto.error.PromptoError;

public interface IStorable {

	Object getOrCreateDbId();

	void setDirty(boolean dirty);
	boolean isDirty();
	
	void setCategories(String[] categories) throws PromptoError;
	
	default void setData(String name, Object value) throws PromptoError {
		setData(name, value, null);
	}
	
	void setData(String name, Object value, IDbIdProvider provider) throws PromptoError;

	public static interface IDbIdProvider {
		Object getDbId();
	}
	
	public static interface IDbIdListener {
		void setDbId(Object dbId);
	}
}
