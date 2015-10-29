package prompto.store;

public interface IStoreFactory {
	public static enum Type { CODE, DATA; }
	IStore newStore(String[] params, Type type);
}
