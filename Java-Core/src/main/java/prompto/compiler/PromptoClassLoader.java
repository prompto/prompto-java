package prompto.compiler;

import java.io.File;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;

import prompto.declaration.CategoryDeclaration;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;

/* a class loader which is able to create and store classes for prompto objects */
public class PromptoClassLoader extends URLClassLoader {
	
	private static ClassLoader getParentClassLoader() {
		return PromptoClassLoader.class.getClassLoader();
	}

	private static File makeClassDir(File promptoDir) {
		File javaDir = new File(promptoDir, "java");
		File classDir = new File(javaDir, "classes");
		classDir.mkdirs();
		if(!classDir.exists())
			throw new RuntimeException("Could not create prompto class dir at " + classDir.getAbsolutePath());
		return classDir;
	}

	private static URL[] makeClassDirURLs(File classDir) {
		try {
			URL[] urls = { classDir.toURI().toURL() };
			return urls;
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static PromptoClassLoader instance = null;
	
	/* during testing, mutiple threads may refer to different paths */
	private static Boolean testMode;
	private static ThreadLocal<PromptoClassLoader> testInstance;
	public static PromptoClassLoader getInstance() {
		return testInstance.get();
	}
	
	public static PromptoClassLoader initialize(Context context, File promptoDir, boolean testMode) {
		synchronized(PromptoClassLoader.class) {
			if(PromptoClassLoader.testMode==null)
				PromptoClassLoader.testMode = testMode;
			boolean currentMode = PromptoClassLoader.testMode;
			if(currentMode!=testMode)
				throw new UnsupportedOperationException("Cannot run test mode with regular mode!");
			if(testMode) {
				if(testInstance==null)
					testInstance = new ThreadLocal<>();
				testInstance.set(new PromptoClassLoader(context, promptoDir));
				return testInstance.get();
			} else {
				if(instance!=null)
					throw new UnsupportedOperationException("Can only have one PromptoClassLoader!");
				instance = new PromptoClassLoader(context, promptoDir);
				return instance;
			}
		}
	}

	Context context;
	
	private PromptoClassLoader(Context context, File promptoDir) {
		super(makeClassDirURLs(makeClassDir(promptoDir)), getParentClassLoader());
		this.context = context;
	}
	
	File getClassDir() throws Exception {
		return Paths.get(getURLs()[0].toURI()).toFile();
	}

	@Override
	protected Class<?> findClass(String fullName) throws ClassNotFoundException {
		try {
			return super.findClass(fullName);
		} catch (ClassNotFoundException e) {
			// is this a Prompto class ?
			if(fullName.charAt(0)=='π') { 
				try {
					createPromptoClass(fullName);
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
		} else if(fullName.contains(".χ.")) {
			createCategoryClass(fullName);
		} else
			throw new ClassNotFoundException(fullName);
	}

	private void createCategoryClass(String fullName) throws ClassNotFoundException {
		String simpleName = CompilerUtils.simpleNameFrom(fullName);
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, new Identifier(simpleName));
		if(decl==null)
			throw new ClassNotFoundException(simpleName);
		else
			createCategoryClass(fullName, decl);
	}

	private void createCategoryClass(String fullName, CategoryDeclaration decl) throws ClassNotFoundException {
		try {
			Compiler compiler = new Compiler(getClassDir()); // where to store .class
			compiler.compileCategory(context, fullName, decl);
		} catch(Exception e) {
			throw new ClassNotFoundException(fullName, e);
		}
	}

	private void createGlobalMethodsClass(String fullName) throws ClassNotFoundException {
		Type abstractType = CompilerUtils.abstractTypeFrom(fullName);
		String simpleName = fullName.substring(fullName.indexOf(".µ.") + 3);
		MethodDeclarationMap methods = context.getRegisteredDeclaration(MethodDeclarationMap.class, 
				new Identifier(simpleName), true);
		if(methods==null)
			throw new ClassNotFoundException(simpleName);
		else
			createGlobalMethodsClass(abstractType, methods);
	}

	private void createGlobalMethodsClass(Type abstractType, MethodDeclarationMap methods) throws ClassNotFoundException {
		try {
			Compiler compiler = new Compiler(getClassDir()); // where to store .class
			compiler.compileGlobalMethods(context, methods, abstractType);
		} catch(Exception e) {
			throw new ClassNotFoundException(abstractType.getTypeName(), e);
		}
	}
}
