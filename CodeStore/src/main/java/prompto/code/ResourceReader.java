package prompto.code;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import prompto.intrinsic.PromptoBinary;
import prompto.intrinsic.PromptoVersion;
import prompto.store.IStored;

public abstract class ResourceReader {

	public static Resource readResource(IStored stored) {
		Resource resource = null;
		if(stored.hasData("body")) {
			resource = new TextResource();
			((TextResource)resource).setBody((String)stored.getData("body"));
		} else if(stored.hasData("data")) {
			resource = new BinaryResource();
			((BinaryResource)resource).setData((PromptoBinary)stored.getData("data"));
		}
		if(resource!=null) {
			resource.setMimeType((String)stored.getData("mimeType"));
			resource.setName((String)stored.getData("name"));
			resource.setVersion((PromptoVersion)stored.getData("version"));
			Long value = (Long)stored.getData("timeStamp");
			if(value!=null)
				resource.setLastModified(OffsetDateTime.ofInstant(Instant.ofEpochMilli(value), ZoneOffset.UTC));
		}
		return resource;
	}
}
