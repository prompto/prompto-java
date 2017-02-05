package prompto.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
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

	public static Collection<String> listResourcesAt(String path) throws IOException {
		URL url = Thread.currentThread().getContextClassLoader().getResource(path);
		if(url==null && "/".equals(path))
			url = getRootURL();
		Collection<String> names = listResourcesAt(url);
		// special case when running unit tests
		if(names==null && url.toExternalForm().contains("/test-classes/")) {
			url = new URL(url.toExternalForm().replace("/test-classes/", "/classes/"));
			names = listResourcesAt(url);
		}
		return names;
	}

	public interface ResourceLister {
		Collection<String> listResourcesAt(URL url) throws IOException;
	}
	
	static Map<String, ResourceLister> protocolResourceListers = new HashMap<>();
	
	static {
		registerResourceLister("jar", ResourceUtils::listJarResourcesAt);
		registerResourceLister("file", ResourceUtils::listFileResourcesAt);
	}
	
	
	public static void registerResourceLister(String protocol, ResourceLister lister) {
		protocolResourceListers.put(protocol, lister);
	}
			
	public static Collection<String> listResourcesAt(URL url) throws IOException {
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


	public static Collection<String> listFileResourcesAt(URL url) throws IOException {
		try {
			File dir = new File(url.toURI());
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

	public static Collection<String> listJarResourcesAt(URL url) throws IOException {
		List<String> paths = new ArrayList<>();
		JarURLConnection cnx = (JarURLConnection) url.openConnection();
		JarFile jar = cnx.getJarFile();
		/* Search for the entries we care about. */
		String path = url.toExternalForm().substring(url.toExternalForm().indexOf("!/") + 2);
		Enumeration<JarEntry> entries = jar.entries();
		while (entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			String name = entry.getName();
			if(!(name.startsWith(path)))
				continue;
			int idx = name.indexOf('/', path.length());
			if(idx>0)
				name = name.substring(path.length(), idx + 1);
			else
				name = name.substring(path.length());
			if(!name.isEmpty())
				paths.add(name);
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
