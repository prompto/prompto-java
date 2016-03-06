package prompto.compiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Modifier;

import prompto.grammar.ArgumentList;
import prompto.runtime.Context;
import prompto.runtime.Context.MethodDeclarationMap;
import prompto.type.IType;

public class Compiler {

	File classDir;
	
	Compiler(File classDir) throws Exception {
		this.classDir = classDir;
	}

	void compileGlobalMethods(Context context, MethodDeclarationMap methods, String fullName) throws Exception {
		ClassFile classFile = createGlobalMethodsClassFile(context, methods, fullName);
		writeClassFile(classFile, fullName);
	}

	private void writeClassFile(ClassFile classFile, String fullName) throws Exception {
		fullName = fullName.replace('.', '/');
		File parent = new File(classDir, fullName.substring(0, fullName.lastIndexOf('/')+1));
		if(!parent.exists() && !parent.mkdirs())
			throw new IOException("Could not create " + parent.getAbsolutePath());
		File file = new File(parent, fullName.substring(fullName.lastIndexOf('/')+1) + ".class");
		System.err.println("Writing class file: " + file.getAbsolutePath());
		try(OutputStream out = new FileOutputStream(file)) {
			classFile.writeTo(out);
		}
	}

	private ClassFile createGlobalMethodsClassFile(Context context, MethodDeclarationMap methods, String fullName) {
		fullName = fullName.replace('.', '/');
		ClassFile classFile = new ClassFile(fullName, "java/lang/Object");
		classFile.addModifier(Modifier.ABSTRACT);
		methods.values().forEach((m) -> 
			m.compile(context, this, classFile));
		return classFile;
	}

	public String createProto(Context context, ArgumentList arguments, IType returnType) {
		StringBuilder sb = new StringBuilder();
		sb.append('(');
		arguments.forEach((arg)->sb.append(arg.getJavaDescriptor(context)));
		sb.append(')');
		sb.append(returnType.getJavaDescriptor(context));
		return sb.toString();
	}



}
