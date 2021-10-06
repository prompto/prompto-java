package prompto.store;

import java.util.function.Consumer;
import java.util.function.Supplier;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoDbId;

public interface IStorable {

	void setDbId(PromptoDbId dbId);
	PromptoDbId getOrCreateDbId();

	void clear();
	boolean isDirty();
	
	void setCategories(String[] categories) throws PromptoError;
	String[] getCategories();
	
	void setData(String name, Object value) throws PromptoError;
	void removeData(String name) throws PromptoError;
	
	@FunctionalInterface
	public static interface IDbIdProvider extends Supplier<PromptoDbId>  {}
	
	@FunctionalInterface
	public static interface IDbIdListener extends Consumer<PromptoDbId> {}
	
	public static interface IDbIdFactory extends IDbIdProvider, IDbIdListener {
	
		static IDbIdFactory of(IDbIdProvider provider, IDbIdListener listener, Supplier<Boolean> isUpdate) {
			return new IDbIdFactory() {
				@Override public PromptoDbId get() { return provider==null ? null : provider.get(); }
				@Override public void accept(PromptoDbId dbId) { if(listener!=null) listener.accept(dbId); }
				@Override public boolean isUpdate() { return isUpdate==null ? true : isUpdate.get(); }
			};
		}

		boolean isUpdate();

	}

}
