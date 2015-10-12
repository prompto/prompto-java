package prompto.store;

import prompto.value.Document;

public interface IStorable {

	void setDirty(boolean dirty);
	boolean isDirty();
	Document asDocument();

}
