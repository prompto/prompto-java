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
			String name = ResourceUtils.class.getName().replace('.', '/') + ".class";
			URL url = Thread.currentThread().getContextClassLoader().getResource(name);
			String urlStr = url.toExternalForm();
			return new URL(urlStr.substring(0, urlStr.indexOf(name)));
		} catch (Exception e) {
			throw new IOException(e);
		}
	}

	private static Collection<String> listFileResourcesAt(URL url, String path) throws IOException {
		try {
			path = path.startsWith("/") ? "file:" + path : url.toExternalForm() + path;
			File dir = new File(new URI(path));
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
