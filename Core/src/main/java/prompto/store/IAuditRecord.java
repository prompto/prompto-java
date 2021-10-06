package prompto.store;

import java.time.LocalDateTime;

import prompto.intrinsic.IDocumentProducer;
import prompto.intrinsic.PromptoDbId;

public interface IAuditRecord extends IDocumentProducer {

	void setDbId(PromptoDbId id);
	PromptoDbId getDbId();
	void setMetadataDbId(PromptoDbId id);
	PromptoDbId getMetadataDbId();
	void setUTCTimestamp(LocalDateTime timeStamp);
	LocalDateTime getUTCTimestamp();
	void setInstanceDbId(PromptoDbId dbId);
	PromptoDbId getInstanceDbId();
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
