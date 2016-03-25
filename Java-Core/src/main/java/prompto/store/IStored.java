package prompto.store;

import prompto.error.PromptoError;


public interface IStored {

	Object getData(String name) throws PromptoError;
	Object getDbId();
	
}
