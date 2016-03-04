package prompto.compiler;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import prompto.runtime.Context;

/* a class loader which is able to create and store classes for prompto objects */
public class PromptoClassLoader extends ClassLoader {
	
	private static final URL classDirURL = makeTempDirURL();

	private static ClassLoader getParentClassLoader() {
		ClassLoader root = PromptoClassLoader.class.getClassLoader();
		URL[] urls =  { classDirURL };
		return new URLClassLoader(urls, root);
	}

	private static URL makeTempDirURL() {
		try {
			File root = new File("/var/folders/prompto/");
			root.mkdirs();
			return root.toURI().toURL();
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	Context context;
	
	public PromptoClassLoader(Context context) {
		super(getParentClassLoader());
		this.context = context;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			return super.findClass(name);
		} catch (ClassNotFoundException e) {
			if(name.charAt(0)=='π') // a Prompto class
				return createPromptoClass(name);
			else
				throw e;
		}
	}

	private Class<?> createPromptoClass(String name) throws ClassNotFoundException {
		throw new ClassNotFoundException(name);
	}
}
