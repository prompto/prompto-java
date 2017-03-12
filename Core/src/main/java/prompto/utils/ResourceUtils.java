package prompto.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;


public abstract class ResourceUtils {

	public static Collection<URL> listResourcesAt(String path) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(path);
		if(url==null && "/".equals(path))
			url = getRootURL();
		Collection<URL> names = listResourcesAt(url);
		// special case when running unit tests
		if(names==null && url.toExternalForm().contains("/test-classes/")) {
			url = new URL(url.toExternalForm().replace("/test-classes/", "/classes/"));
			names = listResourcesAt(url);
		}
		return names;
	}

	public interface ResourceLister {
		Collection<URL> listResourcesAt(URL url) throws IOException;
	}
	
	static Map<String, ResourceLister> protocolResourceListers = new HashMap<>();
	
	static {
		registerResourceLister("jar", ResourceUtils::listJarResourcesAt);
		registerResourceLister("file", ResourceUtils::listFileResourcesAt);
	}
	
	
	public static void registerResourceLister(String protocol, ResourceLister lister) {
		protocolResourceListers.put(protocol, lister);
	}
			
	public static Collection<URL> listResourcesAt(URL url) throws IOException {
		ResourceLister lister = protocolResourceListers.get(url.getProtocol());
		if(lister==null)
			throw new UnsupportedOperationException("protocol:" + url.getProtocol());
		else
			return lister.listResourcesAt(url);
	}
	
	private static URL getRootURL() throws IOException {
		try {
			return ClassLoader.getSystemClassLoader().getResource(".");
		} catch (Exception e) {
			throw new IOException(e);
		}
	}


	public static Collection<URL> listFileResourcesAt(URL url) throws IOException {
		try {
			File dir = new File(url.toURI());
			if(!dir.exists())
				return null;
			String[] names = dir.list();
			return Arrays.asList(names).stream()
					.map((name) -> {
						try { 
							return new File(dir, name).toURI().toURL(); 
						} catch(MalformedURLException e) {
							throw new RuntimeException(e);
						} 
					})
					.collect(Collectors.toList());
		} catch (URISyntaxException e) {
			throw new IOException(e);
		}
	}

	public static Collection<URL> listJarResourcesAt(URL url) throws IOException {
		List<URL> urls = new ArrayList<>();
		JarURLConnection cnx = (JarURLConnection) url.openConnection();
		JarFile jar = cnx.getJarFile();
		/* Search for the entries we care about. */
		String external = url.toExternalForm();
		String jarPart = external.substring(0, external.indexOf("!/") + 2);
		String pathPart = external.substring(jarPart.length());
		Enumeration<JarEntry> entries = jar.entries();
		while (entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			String name = entry.getName();
			if(!(name.startsWith(pathPart)) || name.endsWith("/"))
				continue;
			urls.add(new URL(jarPart + name));
		}
		return urls;
	}

	public static byte[] getResourceAsBytes(String path) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(path);
		return getResourceAsBytes(url);
	}
	
	
	public static byte[] getResourceAsBytes(URL url) throws IOException {
		byte[] buffer = new byte[4096];
		ByteArrayOutputStream data = new ByteArrayOutputStream();
		try(InputStream input = url.openStream()) {
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

	public static String getResourceAsString(String path) throws IOException {
		byte[] bytes = getResourceAsBytes(path);
		return bytes==null ? null : new String(bytes);
	}
}
