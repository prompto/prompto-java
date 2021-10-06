package prompto.store;

import java.util.Set;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoDbId;


public interface IStored {

	PromptoDbId getDbId();
	String[] getCategories();
	boolean hasData(String fieldName);
	Object getRawData(String fieldName);
	Object getData(String fieldName) throws PromptoError;
	Set<String> getNames() throws PromptoError;
}
