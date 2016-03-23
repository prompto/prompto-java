package prompto.compiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

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
		ClassFile classFile = createGlobalMethodsClassFile(context, methods, type);
		writeClassFile(classFile);
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

	private ClassFile createGlobalMethodsClassFile(Context context, MethodDeclarationMap methods, Type type) {
		ClassFile classFile = new ClassFile(type);
		classFile.addModifier(Modifier.ABSTRACT);
		methods.values().forEach((m) -> 
			m.compile(context, classFile));
		return classFile;
	}

	public void compileCategory(Context context, String fullName, CategoryDeclaration decl) throws Exception {
		ClassFile classFile = decl.compile(context, fullName);
		writeClassFile(classFile);
	}
	
}
