package prompto.intrinsic;

import prompto.store.IStorable.IDbIdFactory;

public class PromptoStorableBase implements IPromptoStorable {

	protected Object dbId;

	@Override
	public Object getDbId() {
		return dbId;
	}
	
	@Override
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
