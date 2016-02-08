package prompto.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;


public abstract class ResourceUtils {

	public static Collection<String> listResourcesAt(String path) throws IOException {
		URL url = getRootURL();
		Collection<String> names = listResourcesAt(url, path);
		// special case when running unit tests
		if(names==null && url.toExternalForm().contains("/test-classes/")) {
			url = new URL(url.toExternalForm().replace("/test-classes/", "/classes/"));
			names = listResourcesAt(url, path);
		}
		return names;
	}

	public static Collection<String> listResourcesAt(URL url, String path) throws IOException {
		switch(url.getProtocol()) {
		case "jar":
			return listJarResourcesAt(url, path);
		case "file":
			return listFileResourcesAt(url, path);
		default:
			throw new UnsupportedOperationException("protocol:" + url.getProtocol());
		}
	}

	private static URL getRootURL() throws IOException {
		try {
			return ClassLoader.getSystemClassLoader().getResource(".");
		} catch (Exception e) {
			throw new IOException(e);
		}
	}

	private static Collection<String> listFileResourcesAt(URL url, String path) throws IOException {
		try {
			path = path.startsWith("/") ? "file:" + path : url.toExternalForm() + path;
			File dir = new File(new URI(path));
			if(!dir.exists())
				return null;
			String[] names = dir.list();
			return Arrays.asList(names).stream().map((String name) -> 
				new File(dir, name).isDirectory() ? name + '/' : name
			).collect(Collectors.toList());
		} catch (URISyntaxException e) {
			throw new IOException(e);
		}
	}

	public static Collection<String> listJarResourcesAt(URL url, String path) throws IOException {
		Set<String> paths = new HashSet<>();
		JarURLConnection cnx = (JarURLConnection) url.openConnection();
		JarFile jar = cnx.getJarFile();
		/* Search for the entries you care about. */
		Enumeration<JarEntry> entries = jar.entries();
		while (entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			String name = entry.getName();
			if(!(name.startsWith(path)))
					continue;
			int idx = name.indexOf('/', path.length());
			if(idx>0)
				paths.add(name.substring(path.length(), idx + 1));
			else
				paths.add(name.substring(path.length()));
		}
		return paths;
	}

	public static byte[] getResourceAsBytes(String path) throws IOException {
		byte[] buffer = new byte[4096];
		ByteArrayOutputStream data = new ByteArrayOutputStream();
		InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
		for(;;) {
			int read = input.read(buffer);
			if(read==-1)
				break;
			data.write(buffer, 0, read);
		}
		data.flush();
		return data.toByteArray();
	}
}
