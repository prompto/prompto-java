package prompto.compiler;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.security.CodeSource;
import java.security.SecureClassLoader;

import org.junit.Test;

public class TestCompiler {

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
		byte[] transcoded = StringConstant.toModifiedUtf8("π/χ/µ/print");
		assertArrayEquals(expected, transcoded);	
	}
	
	@Test
	public void testDefineClassForGlobalMethod() throws Exception {
		String name = "π/χ/µ/print";
		ClassFile c = new ClassFile(name, "java/lang/Object");
		c.addModifier(Modifier.ABSTRACT);
		Method m = new Method("printAbstract", "(Ljava/lang/String;)V");
		m.addModifier(Modifier.ABSTRACT);
		c.addMethod(m);
		m = new Method("printStatic", "(Ljava/lang/String;)V");
		m.addModifier(Modifier.STATIC);
		ByteCode code = m.createCode();
		code.append(Opcode.RETURN);
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
	}

}
