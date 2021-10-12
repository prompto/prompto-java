package prompto.store;

import java.time.LocalDateTime;
import java.util.Map;

import prompto.intrinsic.IDocumentProducer;
import prompto.intrinsic.PromptoDbId;

public interface IAuditMetadata extends Map<String, Object>, IDocumentProducer {

	default void setAuditMetadataId(PromptoDbId id) {
		put("auditMetadataId", id.getValue());
	}
	default PromptoDbId getAuditMetadataId(IStore store) {
		return store.convertToDbId(get("auditMetadataId"));
	}
	default void setUTCTimestamp(LocalDateTime timeStamp) {
		put("timeStamp", timeStamp);
	}
	default LocalDateTime getUTCTimestamp() {
		return get("timeStamp", LocalDateTime.class);
	}
	default void setLogin(String login) {
		put("login", login);
	}
	default String getLogin() {
		Object login = get("login");
		return login instanceof String ? (String)login : "<anonymous>";
	}
	@SuppressWarnings("unchecked")
	default <T> T get(String fieldName, Class<T> resultClass) {
		return (T)get(fieldName);
	}
}
