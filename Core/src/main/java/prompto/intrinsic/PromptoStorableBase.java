package prompto.intrinsic;

import prompto.store.IStorable.IDbIdFactory;

public class PromptoStorableBase {

	protected Object dbId;

	public Object getDbId() {
		return dbId;
	}
	
	public void setDbId(Object dbId) {
		this.dbId = dbId;
	}
	
	public IDbIdFactory getDbIdFactory() {
		final PromptoStorableBase self = this;
		return new IDbIdFactory() {
			@Override public void accept(Object dbId) { self.dbId = dbId; }
			@Override public Object get() { return self.dbId; }
			@Override public boolean isUpdate() { return self.dbId != null; }
		};
	}

}
