package prompto.store;

import java.time.LocalDateTime;
import java.util.Map;

import prompto.intrinsic.IDocumentProducer;

public interface IAuditMetadata extends Map<String, Object>, IDocumentProducer {

	default void setAuditMetadataId(Object id) {
		put("auditMetadataId", id);
	}
	default Object getAuditMetadataId() {
		return get("auditMetadataId");
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
