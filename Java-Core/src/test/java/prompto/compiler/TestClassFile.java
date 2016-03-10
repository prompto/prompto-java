package prompto.compiler;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.security.CodeSource;
import java.security.SecureClassLoader;

import org.junit.Test;

import prompto.runtime.utils.Out;

public class TestClassFile {

	static class ByteClassLoader extends SecureClassLoader {
		
		public static Class<?> defineAndResolveClass(String name, byte[] bytes) {
			ByteClassLoader loader = new ByteClassLoader();
			ByteBuffer buffer = ByteBuffer.wrap(bytes);
			CodeSource source = createCodeSource();
			Class<?> klass = loader.defineClass(name,  buffer, source);
			loader.resolveClass(klass);
			return klass;
		}

		private static CodeSource createCodeSource() {
			return null;
		}
		
	}
	
	@Test
	public void testTranscode() throws Exception {
		byte[] expected = { (byte)0xCF, (byte)0x80, 0x2F, (byte)0xCF, (byte)0x87, 0x2F, (byte)0xC2, (byte)0xB5, 0x2F, 0x70, 0x72, 0x69, 0x6E, 0x74 };
		byte[] transcoded = Utf8Constant.toModifiedUtf8("π/χ/µ/print");
		assertArrayEquals(expected, transcoded);	
	}
	
	
	@Test
	public void testConstantsPool() {
		ConstantsPool pool = new ConstantsPool();
		assertEquals(1, pool.nextIndex);
		ConstantOperand c = new Utf8Constant("abc");
		c.register(pool);
		assertEquals(2, pool.nextIndex);
		c = new Utf8Constant("abc");
		c.register(pool);
		assertEquals(2, pool.nextIndex);
		c = new LongConstant(123);
		c.register(pool);
		assertEquals(4, pool.nextIndex);
		NameAndTypeConstant ntc = new NameAndTypeConstant("xyw", "hkp");
		ntc.register(pool);
		assertEquals(4, ntc.index());
		assertEquals(5, ntc.name.index());
		assertEquals(6, ntc.type.index());
		assertEquals(7, pool.nextIndex);
	}
	
	@Test
	public void testDefineClassForGlobalMethod() throws Exception {
		String name = "π/χ/µ/print";
		ClassFile c = new ClassFile(name, "java/lang/Object");
		c.addModifier(Modifier.ABSTRACT);
		MethodInfo m = new MethodInfo("printAbstract", "(Ljava/lang/String;)V");
		m.addModifier(Modifier.ABSTRACT);
		c.addMethod(m);
		m = new MethodInfo("printStatic", "(Ljava/lang/String;)V");
		m.addModifier(Modifier.STATIC);
		m.registerLocal("value");
		m.addInstruction(Opcode.RETURN);
		c.addMethod(m);
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		c.writeTo(o);
		byte[] gen = o.toByteArray();
		Class<?> klass = ByteClassLoader.defineAndResolveClass(name.replace("/", "."), gen);
		assertNotNull(klass);
		assertTrue(Modifier.isAbstract(klass.getModifiers()));
		java.lang.reflect.Method mm = klass.getMethod("printAbstract", String.class);
		assertTrue(Modifier.isAbstract(mm.getModifiers()));
		mm = klass.getMethod("printStatic", String.class);
		assertTrue(Modifier.isStatic(mm.getModifiers()));
		mm.invoke(null, "Hello");
	}
	
	@Test
	public void testCallGlobalMethod() throws Exception {
		Out.init();
		String name = "π/χ/µ/print";
		ClassFile c = new ClassFile(name, "java/lang/Object");
		c.addModifier(Modifier.ABSTRACT);
		MethodInfo m = new MethodInfo("print", "(Ljava/lang/String;)V");
		m.addModifier(Modifier.STATIC);
		m.registerLocal("value");
		m.addInstruction(Opcode.GETSTATIC, new FieldConstant("java/lang/System", "out", "Ljava/io/PrintStream;"));
		m.addInstruction(Opcode.ALOAD_0); // the parameter
		m.addInstruction(Opcode.INVOKEVIRTUAL, new MethodConstant(PrintStream.class, "print", String.class, void.class));
		m.addInstruction(Opcode.RETURN);
		c.addMethod(m);
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		c.writeTo(o);
		byte[] gen = o.toByteArray();
		Class<?> klass = ByteClassLoader.defineAndResolveClass(name.replace("/", "."), gen);
		assertNotNull(klass);
		assertTrue(Modifier.isAbstract(klass.getModifiers()));
		Method mm = klass.getMethod("print", String.class);
		assertTrue(Modifier.isStatic(mm.getModifiers()));
		mm.invoke(null, "Hello");
		String read = Out.read();
		Out.restore();
		assertEquals("Hello", read);
	}
	
	@Test
	public void testClassWithLongConstant() throws Exception {
		String name = "k1";
		ClassFile c = new ClassFile(name, "java/lang/Object");
		c.addModifier(Modifier.ABSTRACT);
		MethodInfo m = new MethodInfo("m3", "()Ljava/lang/Long;");
		m.addModifier(Modifier.STATIC);
		m.addInstruction(Opcode.LDC2_W, new LongConstant(9876543210L));
		c.addMethod(m);
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		c.writeTo(o);
		byte[] gen = o.toByteArray();
		Class<?> klass = ByteClassLoader.defineAndResolveClass(name.replace("/", "."), gen);
		assertNotNull(klass);
	}
	
	@Test
	public void testClassWithStackLabel_SAME() throws Exception {
		String name = "k1";
		ClassFile c = new ClassFile(name, "java/lang/Object");
		c.addModifier(Modifier.ABSTRACT);
		MethodInfo m = new MethodInfo("m", "()V");
		m.addModifier(Modifier.STATIC);
		/*
		m.addInstruction(Opcode.ICONST_1);
		m.addInstruction(Opcode.ICONST_1);
		m.addInstruction(Opcode.IADD).setStackLabel(new StackLabel.SAME());
		m.addInstruction(Opcode.ICONST_1);
		Instruction branch = m.addInstruction(Opcode.IF_ICMPNE, new ShortOperand((short)4));
		// branch.setStackLabel(new StackLabel());
		m.addInstruction(Opcode.ICONST_1);
		Instruction jump = m.addInstruction(Opcode.GOTO, new ShortOperand((short)1));
		// jump.setStackLabel(new StackLabel(branch.getLabel()));
		Instruction last = m.addInstruction(Opcode.ICONST_0);
		// last.setStackLabel(new StackLabel(branch.getLabel()));
		m.addInstruction(Opcode.POP);
		 */
		m.addInstruction(Opcode.RETURN);
		c.addMethod(m);
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		c.writeTo(o);
		byte[] gen = o.toByteArray();
		Class<?> klass = ByteClassLoader.defineAndResolveClass(name.replace("/", "."), gen);
		assertNotNull(klass);
		Method mm = klass.getDeclaredMethod("m");
		mm.invoke(null);
	}
}
