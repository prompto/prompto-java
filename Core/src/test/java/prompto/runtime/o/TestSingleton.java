package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSingleton extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedAttribute() throws Exception {
		checkInterpretedOutput("singleton/attribute.poc");
	}

	@Test
	public void testCompiledAttribute() throws Exception {
		checkCompiledOutput("singleton/attribute.poc");
	}

	@Test
	public void testTranspiledAttribute() throws Exception {
		checkTranspiledOutput("singleton/attribute.poc");
	}

	@Test
	public void testInterpretedDictionary() throws Exception {
		checkInterpretedOutput("singleton/dictionary.poc");
	}

	@Test
	public void testCompiledDictionary() throws Exception {
		checkCompiledOutput("singleton/dictionary.poc");
	}

	@Test
	public void testTranspiledDictionary() throws Exception {
		checkTranspiledOutput("singleton/dictionary.poc");
	}

	@Test
	public void testInterpretedInitialize() throws Exception {
		checkInterpretedOutput("singleton/initialize.poc");
	}

	@Test
	public void testCompiledInitialize() throws Exception {
		checkCompiledOutput("singleton/initialize.poc");
	}

	@Test
	public void testTranspiledInitialize() throws Exception {
		checkTranspiledOutput("singleton/initialize.poc");
	}

	@Test
	public void testInterpretedInternal() throws Exception {
		checkInterpretedOutput("singleton/internal.poc");
	}

	@Test
	public void testCompiledInternal() throws Exception {
		checkCompiledOutput("singleton/internal.poc");
	}

	@Test
	public void testTranspiledInternal() throws Exception {
		checkTranspiledOutput("singleton/internal.poc");
	}

	@Test
	public void testInterpretedMember() throws Exception {
		checkInterpretedOutput("singleton/member.poc");
	}

	@Test
	public void testCompiledMember() throws Exception {
		checkCompiledOutput("singleton/member.poc");
	}

	@Test
	public void testTranspiledMember() throws Exception {
		checkTranspiledOutput("singleton/member.poc");
	}

}

