package prompto.store;

public interface IStoreFactory {
	public static enum Type { ROOT, CODE, DATA; }
	IStore<? extends Object> newStore(String[] params, Type type) throws Exception;
}
