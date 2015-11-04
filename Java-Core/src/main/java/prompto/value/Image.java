package prompto.value;

import java.io.IOException;

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

}
