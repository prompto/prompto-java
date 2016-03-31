package prompto.compiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.EnumeratedCategoryDeclaration;
import prompto.declaration.EnumeratedNativeDeclaration;
import prompto.declaration.TestMethodDeclaration;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.utils.FileUtils;

public class Compiler {

	File classDir;
	
	Compiler(File classDir) throws Exception {
		this.classDir = classDir;
		String clean = System.getProperty("prompto.compiler.clean"); // for testing
		if("true".equals(clean))
			FileUtils.deleteRecursively(classDir, false);
	}

	public void compileClass(Context context, String fullName) throws ClassNotFoundException {
		ClassFile classFile = createClassFile(context, fullName);
		writeClassFile(classFile);
	}
	
	private ClassFile createClassFile(Context context, String fullName) throws ClassNotFoundException {
		if(fullName.startsWith(CompilerUtils.GLOBAL_METHOD_PACKAGE_PREFIX)) 
			return createGlobalMethodsClassFile(context, fullName);
		else if(fullName.startsWith(CompilerUtils.CATEGORY_PACKAGE_PREFIX))
			return createCategoryClassFile(context, fullName);
		else if(fullName.startsWith(CompilerUtils.CATEGORY_ENUM_PACKAGE_PREFIX))
			return createEnumeratedCategoryClassFile(context, fullName);
		else if(fullName.startsWith(CompilerUtils.NATIVE_ENUM_PACKAGE_PREFIX))
			return createEnumeratedNativeClassFile(context, fullName);
		else if(fullName.startsWith(CompilerUtils.TEST_METHOD_PACKAGE_PREFIX))
			return createTestClassFile(context, fullName);
		else
			throw new ClassNotFoundException(fullName);
	}

	private ClassFile createTestClassFile(Context context, String fullName) throws ClassNotFoundException {
		String simpleName = CompilerUtils.testSimpleNameFrom(fullName);
		TestMethodDeclaration decl = context.getTest(new Identifier(simpleName));
		if(decl==null)
			throw new ClassNotFoundException(simpleName);
		else 
			return decl.compile(context, fullName);
	}
	
	private ClassFile createEnumeratedNativeClassFile(Context context, String fullName) throws ClassNotFoundException {
		String simpleName = CompilerUtils.nativeEnumSimpleNameFrom(fullName);
		EnumeratedNativeDeclaration decl = 
				context.getRegisteredDeclaration(EnumeratedNativeDeclaration.class, new Identifier(simpleName));
		if(decl==null)
			throw new ClassNotFoundException(simpleName);
		else 
			return decl.compile(context, fullName);
	}

	private ClassFile createEnumeratedCategoryClassFile(Context context, String fullName) throws ClassNotFoundException {
		String simpleName = CompilerUtils.categoryEnumSimpleNameFrom(fullName);
		EnumeratedCategoryDeclaration decl = 
				context.getRegisteredDeclaration(EnumeratedCategoryDeclaration.class, new Identifier(simpleName));
		if(decl==null)
			throw new ClassNotFoundException(simpleName);
		else 
			return decl.compile(context, fullName);
	}

	private ClassFile createCategoryClassFile(Context context, String fullName) throws ClassNotFoundException {
		String simpleName = CompilerUtils.categorySimpleNameFrom(fullName);
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, new Identifier(simpleName));
		if(decl==null)
			throw new ClassNotFoundException(simpleName);
		else
			return decl.compile(context, fullName);
	}

	private ClassFile createGlobalMethodsClassFile(Context context, String fullName) throws ClassNotFoundException {
		Type abstractType = CompilerUtils.abstractTypeFrom(fullName);
		String simpleName = fullName.substring(fullName.indexOf(".µ.") + 3);
		MethodDeclarationMap methods = context.getRegisteredDeclaration(MethodDeclarationMap.class, 
				new Identifier(simpleName), true);
		if(methods==null)
			throw new ClassNotFoundException(simpleName);
		else
			return createGlobalMethodsClassFile(context, methods, abstractType);
	}

	private ClassFile createGlobalMethodsClassFile(Context context, MethodDeclarationMap methods, Type type) {
		ClassFile classFile = new ClassFile(type);
		classFile.addModifier(Modifier.ABSTRACT);
		methods.values().forEach((m) -> 
			m.compile(context, classFile));
		return classFile;
	}


	private void writeClassFile(ClassFile classFile) throws CompilerException {
		try {
			Type type = classFile.getThisClass().getType();
			String fullName = type.getTypeName().replace('.', '/');
			File parent = new File(classDir, fullName.substring(0, fullName.lastIndexOf('/')+1));
			if(!parent.exists() && !parent.mkdirs())
				throw new IOException("Could not create " + parent.getAbsolutePath());
			File file = new File(parent, fullName.substring(fullName.lastIndexOf('/')+1) + ".class");
			if(DumpLevel.current().ordinal()>0)
				System.err.println("Writing class file: " + file.getAbsolutePath());
			try(OutputStream out = new FileOutputStream(file)) {
				classFile.writeTo(out);
			}
			for(ClassFile inner : classFile.getInnerClasses())
				writeClassFile(inner);
		} catch(Exception e) {
			throw new CompilerException(e);
		}
	}

}
