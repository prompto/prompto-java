package prompto.intrinsic;

import prompto.store.IStorable.IDbIdFactory;

public class PromptoStorableBase implements IPromptoStorable {

	protected PromptoDbId dbId;

	@Override
	public PromptoDbId getDbId() {
		return dbId;
	}
	
	@Override
	public void setDbId(PromptoDbId dbId) {
		this.dbId = dbId;
	}
	
	public IDbIdFactory getDbIdFactory() {
		final PromptoStorableBase self = this;
		return new IDbIdFactory() {
			@Override public void accept(PromptoDbId dbId) { self.dbId = dbId; }
			@Override public PromptoDbId get() { return self.dbId; }
			@Override public boolean isUpdate() { return self.dbId != null; }
		};
	}

}
