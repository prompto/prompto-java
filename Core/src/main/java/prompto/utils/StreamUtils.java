package prompto.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public abstract class StreamUtils {

	public static String readString(URL url) throws IOException {
		try(InputStream input = url.openStream()) {
			return readString(input);
		}
	}
	
	
	public static String readString(InputStream input) throws IOException {
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		while ((length = input.read(buffer)) != -1) {
		    result.write(buffer, 0, length);
		}
		return result.toString(StandardCharsets.UTF_8.name());
	}

}
