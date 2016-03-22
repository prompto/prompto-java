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

	Context context;
	
	public PromptoClassLoader(Context context, File promptoDir) {
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
