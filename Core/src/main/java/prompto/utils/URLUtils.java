package prompto.utils;

import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class URLUtils {

	static final Logger logger = new Logger();
	
	static Map<String, Function<URI, String>> initializeFileNameExtractors() {
		Map<String, Function<URI, String>> extractors = new HashMap<>();
		extractors.put("file", URLUtils::extractFileNameFromFileURI);
		extractors.put("jar", URLUtils::extractFileNameFromJarURI);
		return extractors;
	}
	
	static Map<String, Function<URI, String>> FINENAME_EXTRACTORS = initializeFileNameExtractors();
	
	public static String extractFileName(URL url) {
		try {
			return extractFileName(url.toURI());
		} catch (URISyntaxException e) {
			logger.error(()->"Whild extracting filename from " + url, e);
			return null;
		}
	}
	
	public static String extractFileName(URI uri) {
		Function<URI, String> extractor = FINENAME_EXTRACTORS.get(uri.getScheme());
		if(extractor!=null)
			return extractor.apply(uri);
		else {
			logger.error(()->"No extractor for " + uri);
			return null; // throw ?
		}
	}
	
	public static String extractFileNameFromFileURI(URI uri) {
		return Paths.get(uri).getFileName().toString();
	}
	
	public static String extractFileNameFromJarURI(URI uri) {
		try {
		    final String jarFileName = ((JarURLConnection)uri.toURL().openConnection()).getJarFileURL().getFile().toString();
			final String uriString = uri.toString();
		    return uriString.substring(uriString.indexOf(jarFileName) + jarFileName.length() + 2); // skip !/ chars
		} catch(IOException e) {
			logger.error(()->"Whild extracting filename from " + uri, e);
			return null; // throw ?
		}
	}

}
