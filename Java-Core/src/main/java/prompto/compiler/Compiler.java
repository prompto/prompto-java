package prompto.compiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import prompto.declaration.CategoryDeclaration;
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

	void compileGlobalMethods(Context context, MethodDeclarationMap methods, Type type) throws Exception {
		List<ClassFile> innerClassFiles = compileGlobalMethodsInnerClasses(context, type, methods);
		innerClassFiles.forEach((file)->
			writeClassFile(file, file.getThisClass().getType()));
		ClassFile classFile = createGlobalMethodsClassFile(context, methods, type);
		writeClassFile(classFile, type);
	}

	private List<ClassFile> compileGlobalMethodsInnerClasses(Context context, Type parentClass, MethodDeclarationMap methods) {
		List<ClassFile> list = new ArrayList<>();
		methods.values().forEach((m) -> 
			m.compileInnerClasses(context, parentClass, list));
		return list;
	}

	private void writeClassFile(ClassFile classFile, Type type) throws CompilerException {
		try {
			String fullName = type.getTypeName().replace('.', '/');
			File parent = new File(classDir, fullName.substring(0, fullName.lastIndexOf('/')+1));
			if(!parent.exists() && !parent.mkdirs())
				throw new IOException("Could not create " + parent.getAbsolutePath());
			File file = new File(parent, fullName.substring(fullName.lastIndexOf('/')+1) + ".class");
			if(Instruction.getDumpLevel()>0)
				System.err.println("Writing class file: " + file.getAbsolutePath());
			try(OutputStream out = new FileOutputStream(file)) {
				classFile.writeTo(out);
			}
		} catch(Exception e) {
			throw new CompilerException(e);
		}
	}

	private ClassFile createGlobalMethodsClassFile(Context context, MethodDeclarationMap methods, Type type) {
		ClassFile classFile = new ClassFile(type);
		classFile.addModifier(Modifier.ABSTRACT);
		methods.values().forEach((m) -> 
			m.compile(context, classFile));
		return classFile;
	}

	public void compileCategory(Context context, CategoryDeclaration decl, Type interfaceType, Type concreteType) throws Exception {
		/* multiple inheritance is supported via interfaces */
		/* concrete class is an inner class of the interface */
		/* inner class is prefixed with '%' to prevent naming collisions */
		ClassFile classFile = createCategoryClassFile(context, decl, concreteType);
		writeClassFile(classFile, concreteType);
		classFile = createCategoryInterfaceFile(context, decl, interfaceType, classFile);
		writeClassFile(classFile, interfaceType);
	}
	
	public ClassFile createCategoryInterfaceFile(Context context, CategoryDeclaration decl, Type type, ClassFile innerClass) {
		ClassFile classFile = new ClassFile(type);
		classFile.addModifier(Modifier.ABSTRACT | Modifier.INTERFACE);
		classFile.addInnerClass(innerClass);
		decl.compileInterface(context, classFile);
		return classFile;
	}
	
	public ClassFile createCategoryClassFile(Context context, CategoryDeclaration decl, Type type) {
		ClassFile classFile = new ClassFile(type);
		if(decl.isAbstract())
			classFile.addModifier(Modifier.ABSTRACT);
		decl.compileClass(context, classFile);
		return classFile;
	}

}
