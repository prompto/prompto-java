package prompto.value;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.runtime.Context;
import prompto.type.ImageType;

public class Image extends Binary {

	public Image() {
		super(ImageType.instance());
	}
	
	public Image(String mimeType, byte[] dataBytes) {
		super(ImageType.instance(), mimeType, dataBytes);
	}

	public static Image fromResource(String path) throws IOException {
		Image image = new Image();
		Binary.fromResource(image, path);
		return image;
	}

	@Override
	public void toJson(Context context, JsonGenerator generator) throws PromptoError {
		try {
			generator.writeString("empty.jpg");
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
}
