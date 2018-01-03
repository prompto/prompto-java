package prompto.store;

import java.util.Set;

import prompto.error.PromptoError;


public interface IStored {

	Object getDbId();
	boolean hasData(String fieldName);
	Object getRawData(String fieldName);
	Object getData(String fieldName) throws PromptoError;
	Set<String> getNames() throws PromptoError;
}
