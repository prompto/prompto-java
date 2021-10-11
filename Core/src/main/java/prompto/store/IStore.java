package prompto.store;

import java.io.Closeable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoDbId;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;
import prompto.store.IStorable.IDbIdFactory;

/* a mean to store and fetch data */
public interface IStore extends Closeable {
	
	public static final String dbIdName = "dbId";
	
	boolean checkConnection();

	default PromptoDbId newDbId() {
		return PromptoDbId.of(newNativeDbId());
	}
	default PromptoDbId convertToDbId(Object dbId) {
		if(dbId instanceof PromptoDbId)
			return (PromptoDbId)dbId;
		else
			return PromptoDbId.of(convertToNativeDbId(dbId));
	}
	Class<?> getNativeDbIdClass();
	Object newNativeDbId();
	Object convertToNativeDbId(Object dbId);
	AttributeInfo getAttributeInfo(String name) throws PromptoError;
	void createOrUpdateAttributes(Collection<AttributeInfo> attributes) throws PromptoError;
	
	IStorable newStorable(String[] categories, IDbIdFactory dbIdFactory);
	default IStorable newStorable(List<String> categories, IDbIdFactory dbIdFactory) {
		return newStorable(categories.toArray(new String[0]), dbIdFactory);
	}
	
	void deleteAndStore(Collection<PromptoDbId> deletables, Collection<IStorable> storables, IAuditMetadata auditMeta) throws PromptoError;
	default void store(Collection<PromptoDbId> deletables, Collection<IStorable> storables) throws PromptoError {
		deleteAndStore(deletables, storables, null);
	}
	default void store(Collection<IStorable> storables, IAuditMetadata auditMeta) throws PromptoError {
		deleteAndStore(null, storables, auditMeta);
	}
	default void store(Collection<IStorable> storables) throws PromptoError {
		deleteAndStore(null, storables, null);
	}
	default void store(IStorable storable, IAuditMetadata auditMeta) throws PromptoError {
		deleteAndStore(null, Collections.singletonList(storable), auditMeta);
	}
	default void store(IStorable storable) throws PromptoError {
		deleteAndStore(null, Collections.singletonList(storable), null);
	}
	default void delete(Collection<PromptoDbId> dbIds, IAuditMetadata auditMeta) throws PromptoError {
		deleteAndStore(dbIds, null, auditMeta);
	}
	default void delete(Collection<PromptoDbId> dbIds) throws PromptoError {
		deleteAndStore(dbIds, null, null);
	}
	default void delete(PromptoDbId dbId, IAuditMetadata auditMeta) throws PromptoError {
		deleteAndStore(Collections.singletonList(dbId), null, auditMeta);
	}
	default void delete(PromptoDbId dbId) throws PromptoError {
		deleteAndStore(Collections.singletonList(dbId), null, null);
	}
	void deleteAll() throws PromptoError; // for test purpose only

	PromptoBinary fetchBinary(PromptoDbId dbId, String attr) throws PromptoError;
	IStored fetchUnique(PromptoDbId dbId) throws PromptoError;

	IQueryBuilder newQueryBuilder();
	// for the below, it is guaranteed that IQuery was produced by the above IQueryBuilder
	IStored fetchOne(IQuery query) throws PromptoError;
	IStoredIterable fetchMany(IQuery query) throws PromptoError;
	
	void flush() throws PromptoError;

	long nextSequenceValue(String name);

	Map<String, Object> fetchConfiguration(String name);
	void storeConfiguration(String name, Map<String, Object> data);
	
	boolean isAuditEnabled();
	default IAuditMetadata newAuditMetadata() {
		throw new UnsupportedOperationException();
	}
	default PromptoDbId fetchLatestAuditMetadataId(PromptoDbId dbId) {
		throw new UnsupportedOperationException();
	}
	default PromptoList<PromptoDbId> fetchAllAuditMetadataIds(PromptoDbId dbId) {
		throw new UnsupportedOperationException();
	}
	default IAuditMetadata fetchAuditMetadata(PromptoDbId metaId) {
		throw new UnsupportedOperationException();
	}
	default boolean deleteAuditMetadata(PromptoDbId dbId) {
		throw new UnsupportedOperationException();
	}
	default PromptoDocument<String, Object> fetchAuditMetadataAsDocument(PromptoDbId metaId) {
		IAuditMetadata metaData = fetchAuditMetadata(metaId);
		return metaData==null ? null : metaData.toDocument();
	}
	default PromptoList<PromptoDbId> fetchDbIdsAffectedByAuditMetadataId(PromptoDbId auditId) {
		throw new UnsupportedOperationException();
	}
	default IAuditRecord fetchLatestAuditRecord(PromptoDbId dbId) {
		throw new UnsupportedOperationException();
	}
	default boolean deleteAuditRecord(PromptoDbId dbId) {
		throw new UnsupportedOperationException();
	}
	default PromptoDocument<String, Object> fetchLatestAuditRecordAsDocument(PromptoDbId dbId) {
		IAuditRecord record = fetchLatestAuditRecord(dbId);
		return record==null ? null : record.toDocument();
	}
	default PromptoList<? extends IAuditRecord> fetchAllAuditRecords(PromptoDbId dbId) {
		throw new UnsupportedOperationException();
	}
	default PromptoList<PromptoDocument<String, Object>> fetchAllAuditRecordsAsDocuments(PromptoDbId dbId) {
		return fetchAllAuditRecords(dbId).stream().map(IAuditRecord::toDocument).collect(PromptoList.collector());
	}
	default PromptoList<? extends IAuditRecord> fetchAuditRecordsMatching(Map<String, Object> auditPredicates, Map<String, Object> instancePredicates) {
		throw new UnsupportedOperationException();
	}
	default PromptoList<PromptoDocument<String, Object>> fetchAuditRecordsMatchingAsDocuments(Map<String, Object> auditPredicates, Map<String, Object> instancePredicates) {
		return fetchAuditRecordsMatching(auditPredicates, instancePredicates).stream().map(IAuditRecord::toDocument).collect(PromptoList.collector());
	}


}
