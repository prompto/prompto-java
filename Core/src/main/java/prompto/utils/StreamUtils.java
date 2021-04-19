package prompto.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
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
	
	public static void copyBytes(URL source, URL dest) throws IOException {
		try(InputStream input = source.openStream()) {
			copyBytes(input, dest);
		}
	}


	public static void copyBytes(InputStream input, URL dest) throws IOException {
		URLConnection conn = dest.openConnection();
		try(OutputStream output = conn.getOutputStream()) {
			copyBytes(input, output);
		}
	}

	public static void copyBytes(URL source, OutputStream output) throws IOException {
		try(InputStream input = source.openStream()) {
			copyBytes(input, output);
		}
	}


	public static void copyBytes(InputStream input, OutputStream output) throws IOException {
		byte[] data = new byte[0xFFFF];
		for(;;) {
			int read = input.read(data);
			if(read <= 0)
				break;
			output.write(data, 0, read);
		}
	}



}
