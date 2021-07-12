package prompto.store;

import java.time.LocalDateTime;

public interface IAuditRecord {

	void setAuditRecordId(Object id);
	Object getAuditRecordId();
	void setAuditMetadataId(Object id);
	Object getAuditMetadataId();
	void setUTCTimestamp(LocalDateTime timeStamp);
	LocalDateTime getUTCTimestamp();
	void setInstanceDbId(Object dbId);
	Object getInstanceDbId();
	void setOperation(Operation operation);
	Operation getOperation();
	void setInstance(IStored stored);
	IStored getInstance();
	
	enum Operation {
		INSERT,
		UPDATE,
		DELETE
	}


}
