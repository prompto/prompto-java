package prompto.store;

import java.time.LocalDateTime;
import java.util.Map;

public interface IAuditMetadata extends Map<String, Object> {

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
		Object timeStamp = get("timeStamp");
		return timeStamp instanceof LocalDateTime ? (LocalDateTime)timeStamp : null;
	}
	default void setLogin(String login) {
		put("login", login);
	}
	default String getLogin() {
		Object login = get("login");
		return login instanceof String ? (String)login : "<anonymous>";
	}
}
