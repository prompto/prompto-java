package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSingleton extends BaseEParserTest {

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
		checkInterpretedOutput("singleton/attribute.pec");
	}

	@Test
	public void testCompiledAttribute() throws Exception {
		checkCompiledOutput("singleton/attribute.pec");
	}

	@Test
	public void testTranspiledAttribute() throws Exception {
		checkTranspiledOutput("singleton/attribute.pec");
	}

	@Test
	public void testInterpretedDictionary() throws Exception {
		checkInterpretedOutput("singleton/dictionary.pec");
	}

	@Test
	public void testCompiledDictionary() throws Exception {
		checkCompiledOutput("singleton/dictionary.pec");
	}

	@Test
	public void testTranspiledDictionary() throws Exception {
		checkTranspiledOutput("singleton/dictionary.pec");
	}

	@Test
	public void testInterpretedInitialize() throws Exception {
		checkInterpretedOutput("singleton/initialize.pec");
	}

	@Test
	public void testCompiledInitialize() throws Exception {
		checkCompiledOutput("singleton/initialize.pec");
	}

	@Test
	public void testTranspiledInitialize() throws Exception {
		checkTranspiledOutput("singleton/initialize.pec");
	}

	@Test
	public void testInterpretedInternal() throws Exception {
		checkInterpretedOutput("singleton/internal.pec");
	}

	@Test
	public void testCompiledInternal() throws Exception {
		checkCompiledOutput("singleton/internal.pec");
	}

	@Test
	public void testTranspiledInternal() throws Exception {
		checkTranspiledOutput("singleton/internal.pec");
	}

	@Test
	public void testInterpretedMember() throws Exception {
		checkInterpretedOutput("singleton/member.pec");
	}

	@Test
	public void testCompiledMember() throws Exception {
		checkCompiledOutput("singleton/member.pec");
	}

	@Test
	public void testTranspiledMember() throws Exception {
		checkTranspiledOutput("singleton/member.pec");
	}

}

