package prompto.compiler;

import java.io.OutputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ClassFile {
	
	ClassConstant thisClass;
	ClassConstant superClass;
	List<ClassConstant> interfaces = new ArrayList<>();
	List<FieldInfo> fields = new ArrayList<>();
	List<MethodInfo> methods = new ArrayList<>();
	List<IAttribute> attributes = new ArrayList<>();
	InnerClassesAttribute innerClasses = null;
	
	int accessFlags = Tags.ACC_SUPER | Modifier.PUBLIC;
	
	public ClassFile(Type thisClassName) {
		this.thisClass = new ClassConstant(thisClassName);
	}

	public ClassConstant getThisClass() {
		return thisClass;
	}
	
	public ClassConstant getSuperClass() {
		return superClass;
	}
	
	public void setSuperClass(ClassConstant superClass) {
		this.superClass = superClass;
	}
	
	public int getModifiers() {
		return accessFlags;
	}

	public void addModifier(int modifier) {
		if((modifier&Modifier.INTERFACE)!=0)
			accessFlags &= ~Tags.ACC_SUPER;
		accessFlags |= modifier;
	}
	
	public void addInterface(Type type) {
		addInterface(new ClassConstant(type));
	}
	
	public void addInterface(ClassConstant interFace) {
		interfaces.add(interFace);
	}

	public void addField(FieldInfo field) {
		fields.add(field);
	}

	public void addMethod(MethodInfo method) {
		methods.add(method);
	}

	public void addInnerClass(ClassFile classFile) {
		InnerClassInfo info = new InnerClassInfo(classFile.getThisClass(), getThisClass());
		addInnerClass(info);
	}

	private void addInnerClass(InnerClassInfo info) {
		if(innerClasses==null) {
			innerClasses = new InnerClassesAttribute();
			attributes.add(innerClasses);
		}
		innerClasses.addInnerClass(info);
	}

	public void writeTo(OutputStream o) throws CompilerException {
		ConstantsPool constantsPool = registerConstants();
		ByteWriter writer = new ByteWriter(o);
		writeTo(writer, constantsPool);
	}

	private ConstantsPool registerConstants() {
		ConstantsPool pool = new ConstantsPool();
		thisClass.register(pool);
		if(superClass==null)
			superClass = new ClassConstant(Object.class);
		superClass.register(pool);
		interfaces.forEach((s)-> 
			s.register(pool));
		fields.forEach((f)-> 
			f.register(pool));
		methods.forEach((m)-> 
			m.register(pool));
		attributes.forEach((a)-> 
			a.register(pool));
		return pool;
	}

	private void writeTo(ByteWriter writer, ConstantsPool constantsPool) throws CompilerException {
		/*
		ClassFile {
		    u4             magic;
		    u2             minor_version;
		    u2             major_version;
		    u2             constant_pool_count;
		    cp_info        constant_pool[constant_pool_count-1];
		    u2             access_flags;
		    u2             this_class;
		    u2             super_class;
		    u2             interfaces_count;
		    u2             interfaces[interfaces_count];
		    u2             fields_count;
		    field_info     fields[fields_count];
		    u2             methods_count;
		    method_info    methods[methods_count];
		    u2             attributes_count;
		    attribute_info attributes[attributes_count];
		}		
		*/
		writer.writeU4(Tags.MAGIC);
		writer.writeU2(Tags.MINOR);
		writer.writeU2(Tags.MAJOR);
		constantsPool.write(writer);
		writer.writeU2(accessFlags);
		writer.writeU2(thisClass.getIndexInConstantPool());
		writer.writeU2(superClass.getIndexInConstantPool());
		writer.writeU2(interfaces.size());
		interfaces.forEach((i)->
			writer.writeU2(i.getIndexInConstantPool()));
		writer.writeU2(fields.size());
		fields.forEach((f)->
			f.writeTo(writer));
		writer.writeU2(methods.size());
		methods.forEach((m)->
			m.writeTo(writer));
		writer.writeU2(attributes.size());
		attributes.forEach((a)->
			a.writeTo(writer));
	}




}
