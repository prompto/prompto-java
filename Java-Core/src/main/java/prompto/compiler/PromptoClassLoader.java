package prompto.compiler;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;

import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;

/* a class loader which is able to create and store classes for prompto objects */
public class PromptoClassLoader extends URLClassLoader {
	
	private static final File classDir = makeClassDir();

	private static ClassLoader getParentClassLoader() {
		return PromptoClassLoader.class.getClassLoader();
	}

	private static File makeClassDir() {
		try {
			// TODO use configuration based prompto directory
			File promptoDir = Files.createTempDirectory("prompto_").toFile();
			File javaDir = new File(promptoDir, "java");
			File classDir = new File(javaDir, "classes");
			classDir.mkdirs();
			return classDir;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static URL[] makeClassDirURLs() {
		try {
			URL[] urls =  { classDir.toURI().toURL() };
			return urls;
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	Context context;
	
	public PromptoClassLoader(Context context) {
		super(makeClassDirURLs(), getParentClassLoader());
		this.context = context;
	}

	@Override
	protected Class<?> findClass(String fullName) throws ClassNotFoundException {
		try {
			return super.findClass(fullName);
		} catch (ClassNotFoundException e) {
			// is this a Prompto class ?
			if(fullName.charAt(0)=='π') { 
				createPromptoClass(fullName);
				try {
					return super.findClass(fullName);
				} catch (Throwable t) {
					t.printStackTrace();
					throw t;
				}
			} else
				throw e;
		}
	}

	private void createPromptoClass(String fullName) throws ClassNotFoundException {
		if(fullName.contains(".µ.")) {
			createGlobalMethodsClass(fullName);
		} else
			throw new ClassNotFoundException(fullName);
	}

	private void createGlobalMethodsClass(String fullName) throws ClassNotFoundException {
		String simpleName = fullName.substring(fullName.indexOf(".µ.") + 3);
		MethodDeclarationMap methods = context.getRegisteredDeclaration(MethodDeclarationMap.class, new Identifier(simpleName), true);
		if(methods==null)
			throw new ClassNotFoundException(simpleName);
		else
			createGlobalMethodsClass(fullName, methods);
	}

	private void createGlobalMethodsClass(String fullName, MethodDeclarationMap methods) throws ClassNotFoundException {
		try {
			Compiler compiler = new Compiler(classDir); // where to store .class
			compiler.compileGlobalMethods(context, methods, fullName);
		} catch(Exception e) {
			throw new ClassNotFoundException(fullName, e);
		}
	}
}
