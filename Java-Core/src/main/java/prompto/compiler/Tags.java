package prompto.compiler;

public abstract class Tags {
	
	static final int MAGIC = 0xCAFEBABE;
	static final int MAJOR = 52;
	static final int MINOR = 0;

	static final int CONSTANT_Utf8 = 1;
	static final int CONSTANT_Integer = 3;
	static final int CONSTANT_Float = 4;
	static final int CONSTANT_Long = 5;
	static final int CONSTANT_Double = 6;
	static final int CONSTANT_Class = 7;
	static final int CONSTANT_String = 8;
	static final int CONSTANT_Fieldref = 9;
	static final int CONSTANT_Methodref = 10;
	static final int CONSTANT_InterfaceMethodref = 11;
	static final int CONSTANT_NameAndType = 12;
	static final int CONSTANT_MethodHandle = 15;
	static final int CONSTANT_MethodType = 16;
	static final int CONSTANT_InvokeDynamic = 18;

	static final int ACC_SUPER = 0x0020;		// Treat superclass methods specially when invoked by the invokespecial instruction.

}
