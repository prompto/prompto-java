package prompto.store;

import prompto.error.PromptoError;


public interface IStored {

	boolean hasData(String name);
	Object getData(String name) throws PromptoError;
	Object getDbId();
	
}
