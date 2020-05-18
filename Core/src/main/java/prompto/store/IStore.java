package prompto.store;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.store.IStorable.IDbIdFactory;

/* a mean to store and fetch data */
public interface IStore extends Closeable {
	
	public static final String dbIdName = "dbId";
	
	boolean checkConnection();

	Class<?> getDbIdClass();
	Object newDbId();
	Object convertToDbId(Object dbId);
	AttributeInfo getAttributeInfo(String name) throws PromptoError;
	void createOrUpdateAttributes(Collection<AttributeInfo> attributes) throws PromptoError;
	
	IStorable newStorable(String[] categories, IDbIdFactory dbIdFactory);
	default IStorable newStorable(List<String> categories, IDbIdFactory dbIdFactory) {
		return newStorable(categories.toArray(new String[0]), dbIdFactory);
	}
	
	void store(Collection<?> deletables, Collection<IStorable> storables) throws PromptoError;
	default void store(Collection<IStorable> storables) throws PromptoError {
		store(null, storables);
	}
	default void store(IStorable storable) throws PromptoError {
		store(null, Arrays.asList(storable));
	}
	
	default void delete(Collection<?> dbIds) throws PromptoError {
		store(dbIds, null);
	}
	default void delete(Object dbId) throws PromptoError {
		store(Arrays.asList(dbId), null);
	}
	void deleteAll() throws PromptoError;

	PromptoBinary fetchBinary(Object dbId, String attr) throws PromptoError;
	IStored fetchUnique(Object dbId) throws PromptoError;

	IQueryBuilder newQueryBuilder();
	// for the below, it is guaranteed that IQuery was produced by the above IQueryBuilder
	IStored fetchOne(IQuery query) throws PromptoError;
	IStoredIterable fetchMany(IQuery query) throws PromptoError;
	
	void flush() throws PromptoError;

	long nextSequenceValue(String name);
	
}
