package prompto.store;

import java.util.Set;

import prompto.error.PromptoError;


public interface IStored {

	Object getDbId();
	boolean hasData(String name);
	Object getData(String name) throws PromptoError;
	Set<String> keySet() throws PromptoError;
}
